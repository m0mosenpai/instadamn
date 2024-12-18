package com.instagram.direct.msys.subtype;

import X.AbstractC167017dG;
import X.AbstractC31181DnP;
import X.AbstractC43594JPz;
import X.C14360o3;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public abstract class MsysThreadSubtype implements Parcelable {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    /* loaded from: classes8.dex */
    public final class Unknown extends MsysThreadSubtype {
        public static final Parcelable.Creator CREATOR = LNL.A00(33);
        public final Integer A00;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || ((obj instanceof Unknown) && C14360o3.A0K(this.A00, ((Unknown) obj).A00));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            parcel.writeInt(AbstractC31181DnP.A01(parcel, this.A00));
        }

        public final int hashCode() {
            return AbstractC167017dG.A0M(this.A00);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Unknown(java.lang.Integer r4) {
            /*
                r3 = this;
                int r2 = X.AbstractC31177DnL.A03(r4)
                java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
                java.lang.String r0 = "UNKNOWN_"
                r1.append(r0)
                r1.append(r4)
                r1.toString()
                r0 = 0
                r3.<init>(r2, r0, r0, r0)
                r3.A00 = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.msys.subtype.MsysThreadSubtype.Unknown.<init>(java.lang.Integer):void");
        }
    }

    public MsysThreadSubtype(int i, boolean z, boolean z2, boolean z3) {
        this.A00 = i;
        this.A02 = z;
        this.A03 = z2;
        this.A01 = z3;
    }

    /* loaded from: classes8.dex */
    public final class BlendDualSend extends MsysThreadSubtype {
        public static final BlendDualSend A00 = new BlendDualSend();
        public static final Parcelable.Creator CREATOR = LNL.A00(28);

        public BlendDualSend() {
            super(4, true, false, false);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            AbstractC43594JPz.A16(parcel);
        }
    }

    /* loaded from: classes8.dex */
    public final class BlendDualSendNoNetwork extends MsysThreadSubtype {
        public static final BlendDualSendNoNetwork A00 = new BlendDualSendNoNetwork();
        public static final Parcelable.Creator CREATOR = LNL.A00(29);

        public BlendDualSendNoNetwork() {
            super(5, true, false, false);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            AbstractC43594JPz.A16(parcel);
        }
    }

    /* loaded from: classes8.dex */
    public final class BtvCompanion extends MsysThreadSubtype {
        public static final BtvCompanion A00 = new BtvCompanion();
        public static final Parcelable.Creator CREATOR = LNL.A00(30);

        public BtvCompanion() {
            super(3, true, true, true);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            AbstractC43594JPz.A16(parcel);
        }
    }

    /* loaded from: classes8.dex */
    public final class DualSendShadow extends MsysThreadSubtype {
        public static final DualSendShadow A00 = new DualSendShadow();
        public static final Parcelable.Creator CREATOR = LNL.A00(31);

        public DualSendShadow() {
            super(2, true, false, false);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            AbstractC43594JPz.A16(parcel);
        }
    }

    /* loaded from: classes8.dex */
    public final class Standard extends MsysThreadSubtype {
        public static final Standard A00 = new Standard();
        public static final Parcelable.Creator CREATOR = LNL.A00(32);

        public Standard() {
            super(0, false, false, false);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            AbstractC43594JPz.A16(parcel);
        }
    }
}
