package com.instagram.model.mediasize;

import X.C9Ay;
import X.InterfaceC224217b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class VideoUrlImpl implements Parcelable, InterfaceC224217b {
    public static final Parcelable.Creator CREATOR = new C9Ay(20);
    public int A00;
    public int A01;
    public int A02;
    public VideoUrlImpl A03;
    public Long A04;
    public String A05;
    public String A06;

    public VideoUrlImpl(String str) {
        this(str, -1, -1, -1, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (r1.equals(r0) == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L4c
            r2 = 0
            if (r5 == 0) goto L3a
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L3a
            com.instagram.model.mediasize.VideoUrlImpl r5 = (com.instagram.model.mediasize.VideoUrlImpl) r5
            int r1 = r4.A02
            int r0 = r5.A02
            if (r1 != r0) goto L3a
            int r1 = r4.A00
            int r0 = r5.A00
            if (r1 != r0) goto L3a
            int r1 = r4.A01
            int r0 = r5.A01
            if (r1 != r0) goto L3a
            java.lang.String r1 = r4.A06
            java.lang.String r0 = r5.A06
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L3a
            java.lang.Long r1 = r4.A04
            java.lang.Long r0 = r5.A04
            if (r1 == 0) goto L3b
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3e
        L3a:
            return r2
        L3b:
            if (r0 == 0) goto L3e
            return r2
        L3e:
            java.lang.String r1 = r4.A05
            java.lang.String r0 = r5.A05
            if (r1 == 0) goto L49
            boolean r3 = r1.equals(r0)
            return r3
        L49:
            if (r0 == 0) goto L4c
            r3 = 0
        L4c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.model.mediasize.VideoUrlImpl.equals(java.lang.Object):boolean");
    }

    @Override // X.InterfaceC224217b
    public final Long B39() {
        Long l = this.A04;
        if (l != null) {
            return Long.valueOf(TimeUnit.MICROSECONDS.toMillis(l.longValue()));
        }
        return null;
    }

    @Override // X.InterfaceC224217b
    public final /* bridge */ /* synthetic */ Object B4F() {
        return this.A03;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.A06.hashCode() * 31;
        Long l = this.A04;
        int i2 = 0;
        if (l != null) {
            i = l.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        String str = this.A05;
        if (str != null) {
            i2 = str.hashCode();
        }
        return ((((((i3 + i2) * 31) + this.A02) * 31) + this.A00) * 31) + this.A01;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j;
        parcel.writeString(this.A06);
        Long l = this.A04;
        if (l != null) {
            j = l.longValue();
        } else {
            j = -1;
        }
        parcel.writeLong(j);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public VideoUrlImpl(String str, int i, int i2, int i3, String str2) {
        if (str != null) {
            this.A06 = str;
            this.A05 = str2;
            this.A02 = i;
            this.A00 = i2;
            this.A01 = i3;
            this.A04 = null;
            this.A03 = null;
            return;
        }
        throw new RuntimeException("trying to created a VideoUrl object with null url");
    }
}
