<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="vertical"
    tools:context=".MainActivity">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="NIM"/>

    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:inputType="text"
        android:lines="1"
        android:id="@+id/nn_nim"/>
    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Nama"/>


    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:inputType="text"
        android:lines="1"
        android:id="@+id/nn_nama"/>


    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Kelas"/>


    <EditText
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:inputType="text"
        android:lines="1"
        android:id="@+id/kk_kelas"/>

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Tanggal Lahir"/>

    <EditText
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:inputType="text"
        android:lines="1"
        android:id="@+id/tt_tanggal"/>
    <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Simpan Data"
        android:id="@+id/savedata"/>



</LinearLayout>
