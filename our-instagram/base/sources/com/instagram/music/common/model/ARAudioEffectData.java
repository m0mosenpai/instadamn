package com.instagram.music.common.model;

import X.C14360o3;
import X.C41856IgA;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class ARAudioEffectData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C41856IgA(73);
    public List A00;
    public List A01;
    public final double A02;
    public final double A03;
    public final double A04;
    public final double A05;
    public final String A06;
    public final String A07;
    public final String A08;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeDouble(this.A03);
        parcel.writeDouble(this.A02);
        parcel.writeDouble(this.A05);
        parcel.writeDouble(this.A04);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A06);
        List list = this.A00;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((MusicAssetBeatInfo) it.next()).writeToParcel(parcel, i);
            }
        }
        List list2 = this.A01;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ((LyricsPhrase) it2.next()).writeToParcel(parcel, i);
        }
    }

    public ARAudioEffectData(String str, String str2, String str3, List list, List list2, double d, double d2, double d3, double d4) {
        this.A03 = d;
        this.A02 = d2;
        this.A05 = d3;
        this.A04 = d4;
        this.A07 = str;
        this.A08 = str2;
        this.A06 = str3;
        this.A00 = list;
        this.A01 = list2;
    }

    public ARAudioEffectData() {
        this(null, null, null, null, null, 0.0d, 0.0d, 0.0d, 0.0d);
    }
}
