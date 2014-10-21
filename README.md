vCard
=====

This GitHub repository holds DFDL schemas that model the IETF vCard electronic business card format. The following versions of vCard are supported by the schemas:

    2.1

To download the repository go to http://dfdlschemas.github.com/vCard/.

A vCard file consists of one or more vCards. All vCards begin with BEGIN:VCARD and end with END:VCARD. All vCards must contain the VERSION property, which specifies the vCard version. All other properties are optional and may appear in any order. Vendor-defined properties start with X-. Here is a simple example:

    BEGIN:VCARD
    VERSION:2.1
    N:Gump;Forrest
    FN:Forrest Gump
    ORG:Bubba Gump Shrimp Co.
    TITLE:Shrimp Man
    PHOTO;GIF:http://www.example.com/dir_photos/my_photo.gif
    TEL;WORK;VOICE:(111) 555-1212
    TEL;HOME;VOICE:(404) 555-1212
    ADR;WORK:;;100 Waters Edge;Baytown;LA;30314;United States of America
    LABEL;WORK;ENCODING=QUOTED-PRINTABLE:100 Waters Edge=0D=0ABaytown, LA 30314=0D=0AUnited States of America
    ADR;HOME:;;42 Plantation St.;Baytown;LA;30314;United States of America
    LABEL;HOME;ENCODING=QUOTED-PRINTABLE:42 Plantation St.=0D=0ABaytown, LA 30314=0D=0AUnited States of America
    EMAIL;PREF;INTERNET:forrestgump@example.com
    REV:20080424T195243Z
    END:VCARD

The DFDL schemas use dfdl:sequenceKind='unordered' to model that properties can appear in any order.

The vCard 2.1 schemas are in the '2.1' folder. Any limitations are documemted in the schema prologs.

Test data and infosets are included.

The DFDL schemas are compatible with IBM DFDL 1.1.1 release, as shipped in IBM Integration Bus 9.0.0.2 onwards. 

-----

Please observe the copyright notice within each schema and the accompanying licence file.
