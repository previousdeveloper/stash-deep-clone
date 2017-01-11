#!/usr/bin/python
import os
import stashy
import argparse


def main(args=None):
    parser = argparse.ArgumentParser(description='Process some integers.')

    parser.add_argument('-url', action='store', dest='stash_url', help='Stash Url')
    parser.add_argument('-username', action='store', dest='username', help='Stash Username')
    parser.add_argument('-password', action='store', dest='password', help='Stash Password')
    parser.add_argument('-project', action='store', dest='project_name', help='Stash Password')
    parser.add_argument('-dest', action='store', dest='dest', help='Destination')
    parser.add_argument('--version', action='version', version='%(prog)s 1.0')
    results = parser.parse_args()

    stash = stashy.connect(results.stash_url, results.username, results.password)
    for repo in stash.repos.list():
        for url in repo["links"]["clone"]:
            if (url["name"] == "http" or url["name"] == "https") \
                    and url["name"] and url["href"].find(
                results.project_name) > 0:
                os.system("git clone %s" % url["href"])
                break


if __name__ == "__main__":
    main()
