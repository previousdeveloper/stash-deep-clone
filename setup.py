__author__ = 'gokhan'

from setuptools import setup

setup(
    name='stashdeepclone',
    packages=['lib'],
    version='0.0.1',
    author='Gokhan Karadas',
    author_email='gokhan.karadas1992@gmail.com',
    download_url="https://github.com/previousdeveloper/stash-deep-clone",
    url='https://github.com/previousdeveloper/stash-deep-clone',
    license='LICENSE',
    description='Stash clone multiple projects',
    install_requires=['stashy'],
    include_package_data=True,
    entry_points={
        'console_scripts': [
            'lib = lib.__main__:main'
        ]
    },
)
