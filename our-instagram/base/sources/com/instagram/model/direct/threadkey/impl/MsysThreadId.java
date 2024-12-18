package com.instagram.model.direct.threadkey.impl;

import X.C0T6;
import X.C14360o3;
import X.C3o9;
import X.C9Ay;
import X.EnumC92794Ds;
import X.InterfaceC2056098k;
import X.InterfaceC83733oI;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class MsysThreadId extends C0T6 implements Comparable, Parcelable, InterfaceC2056098k, InterfaceC83733oI, C3o9 {
    public static final Parcelable.Creator CREATOR = new C9Ay(8);
    public final long A00;
    public final EnumC92794Ds A01;
    public final Long A02;

    public MsysThreadId(EnumC92794Ds enumC92794Ds, Long l, long j) {
        C14360o3.A0B(enumC92794Ds, 3);
        this.A00 = j;
        this.A02 = l;
        this.A01 = enumC92794Ds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MsysThreadId) {
                MsysThreadId msysThreadId = (MsysThreadId) obj;
                if (this.A00 != msysThreadId.A00 || !C14360o3.A0K(this.A02, msysThreadId.A02) || this.A01 != msysThreadId.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MsysThreadId(threadKey=");
        sb.append(this.A00);
        sb.append(", threadFbid=");
        sb.append(this.A02);
        sb.append(", transportType=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeLong(this.A00);
        Long l = this.A02;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.A01.name());
    }

    @Override // X.InterfaceC2056098k
    public final EnumC92794Ds CAo() {
        return this.A01;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        MsysThreadId msysThreadId = (MsysThreadId) obj;
        C14360o3.A0B(msysThreadId, 0);
        int A01 = C14360o3.A01(this.A00, msysThreadId.A00);
        if (A01 == 0) {
            return this.A01.compareTo(msysThreadId.A01);
        }
        return A01;
    }

    public final int hashCode() {
        int hashCode;
        long j = this.A00;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        Long l = this.A02;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        return ((i + hashCode) * 31) + this.A01.hashCode();
    }
}
