package com.example.hewan;

import android.os.Parcel;
import android.os.Parcelable;

public class Hewan implements Parcelable {
    private String nama, detail;
    private int photo;

    public Hewan() {

    }



    protected Hewan(String nama, String detail, int photo) {
        this.nama = nama;
        this.detail = detail;
        this.photo = photo;
    }

    protected Hewan(Parcel in) {
        nama = in.readString();
        detail = in.readString();
        photo = in.readInt();
    }

    public static final Creator<Hewan> CREATOR = new Creator<Hewan>() {
        @Override
        public Hewan createFromParcel(Parcel in) {
            return new Hewan(in);
        }

        @Override
        public Hewan[] newArray(int size) {
            return new Hewan[size];
        }
    };

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nama);
        dest.writeString(detail);
        dest.writeInt(photo);
    }
}
