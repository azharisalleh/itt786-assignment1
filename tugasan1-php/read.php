<?php
//Created by azhari hj salleh
//ID 2014461166
//This program for read azhari.txt content to screen

/*     Name:
       Matrix No:
       Gender:
       Age:
       E-mails:
       Mobile Phone:
*/
echo 'Start Reading';
$handle = fopen('azhari.txt', 'r+');

while(!feof($handle))
{
 echo str_replace("\n", "<br />",fgets($handle));
}

fclose($handle);
echo 'Reading Done.';
?>