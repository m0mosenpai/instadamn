package com.facebook.auth.viewercontext;

import X.AbstractC167007dF;
import X.AbstractC31177DnL;
import X.AbstractC58320PtC;
import X.AbstractC58321PtD;
import X.C18C;
import X.C63475SlG;
import X.TYI;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class ViewerContext implements Parcelable {
    public static final ThreadLocal A0D = new TYI();
    public static final Parcelable.Creator CREATOR;
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        if (r1.equals(r0) == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto La4
            r2 = 0
            if (r5 == 0) goto L42
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L42
            com.facebook.auth.viewercontext.ViewerContext r5 = (com.facebook.auth.viewercontext.ViewerContext) r5
            boolean r1 = r4.A0A
            boolean r0 = r5.A0A
            if (r1 != r0) goto L42
            boolean r1 = r4.A0C
            boolean r0 = r5.A0C
            if (r1 != r0) goto L42
            boolean r1 = r4.A07
            boolean r0 = r5.A07
            if (r1 != r0) goto L42
            boolean r1 = r4.A09
            boolean r0 = r5.A09
            if (r1 != r0) goto L42
            boolean r1 = r4.A0B
            boolean r0 = r5.A0B
            if (r1 != r0) goto L42
            boolean r1 = r4.A08
            boolean r0 = r5.A08
            if (r1 != r0) goto L42
            java.lang.String r1 = r4.A05
            java.lang.String r0 = r5.A05
            if (r1 == 0) goto L43
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L46
        L42:
            return r2
        L43:
            if (r0 == 0) goto L46
            return r2
        L46:
            java.lang.String r1 = r4.A01
            java.lang.String r0 = r5.A01
            if (r1 == 0) goto L53
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L56
            return r2
        L53:
            if (r0 == 0) goto L56
            return r2
        L56:
            java.lang.String r1 = r4.A02
            java.lang.String r0 = r5.A02
            if (r1 == 0) goto L63
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L66
            return r2
        L63:
            if (r0 == 0) goto L66
            return r2
        L66:
            java.lang.String r1 = r4.A04
            java.lang.String r0 = r5.A04
            if (r1 == 0) goto L73
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L76
            return r2
        L73:
            if (r0 == 0) goto L76
            return r2
        L76:
            java.lang.String r1 = r4.A03
            java.lang.String r0 = r5.A03
            if (r1 == 0) goto L83
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L86
            return r2
        L83:
            if (r0 == 0) goto L86
            return r2
        L86:
            java.lang.String r1 = r4.A00
            java.lang.String r0 = r5.A00
            if (r1 == 0) goto L93
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L96
            return r2
        L93:
            if (r0 == 0) goto L96
            return r2
        L96:
            java.lang.String r1 = r4.A06
            java.lang.String r0 = r5.A06
            if (r1 == 0) goto La1
            boolean r3 = r1.equals(r0)
            return r3
        La1:
            if (r0 == 0) goto La4
            r3 = 0
        La4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.auth.viewercontext.ViewerContext.equals(java.lang.Object):boolean");
    }

    static {
        if ("0".length() != 0) {
            new ViewerContext("", "0");
        }
        CREATOR = C63475SlG.A02(10);
    }

    public ViewerContext(String str, String str2) {
        C18C.A0E(!AbstractC167007dF.A1N("0".length()));
        this.A05 = "0";
        this.A01 = "";
        this.A02 = null;
        this.A0A = false;
        this.A0C = false;
        this.A07 = false;
        this.A09 = false;
        this.A04 = null;
        this.A03 = null;
        this.A06 = null;
        this.A00 = null;
        this.A0B = false;
        this.A08 = false;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((AbstractC31177DnL.A04(this.A05) * 31) + AbstractC31177DnL.A04(this.A01)) * 31) + AbstractC31177DnL.A04(this.A02)) * 31) + (this.A0A ? 1 : 0)) * 31) + (this.A0C ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + (this.A0B ? 1 : 0)) * 31) + (this.A08 ? 1 : 0)) * 31) + AbstractC31177DnL.A04(this.A04)) * 31) + AbstractC31177DnL.A04(this.A03)) * 31) + AbstractC31177DnL.A04(this.A06)) * 31) + AbstractC58321PtD.A0D(this.A00);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A06);
        parcel.writeString(this.A00);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
    }

    public ViewerContext(Parcel parcel) {
        this.A05 = parcel.readString();
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A0A = AbstractC167007dF.A1P(parcel.readInt(), 1);
        this.A0C = AbstractC58320PtC.A1U(parcel);
        this.A07 = AbstractC58320PtC.A1U(parcel);
        this.A09 = AbstractC58320PtC.A1U(parcel);
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        this.A06 = parcel.readString();
        this.A00 = parcel.readString();
        this.A0B = AbstractC58320PtC.A1U(parcel);
        this.A08 = AbstractC58320PtC.A1V(parcel);
    }

    public ViewerContext() {
        this.A05 = null;
        this.A01 = null;
        this.A02 = null;
        this.A0A = false;
        this.A0C = false;
        this.A07 = false;
        this.A09 = false;
        this.A04 = null;
        this.A03 = null;
        this.A06 = null;
        this.A00 = null;
        this.A0B = false;
        this.A08 = false;
    }
}
