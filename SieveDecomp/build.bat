set FileDir=target\classes\
set FileName=Sieve.class


javap -p -c %FileDir%%FileName% > %FileDir%Sieve.byte