package com.google.android.exoplayer2.video;

import X.C206149Aw;
import X.InterfaceC98384bH;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ColorInfo implements Parcelable {
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final byte[] A04;
    public static final ColorInfo A05 = new ColorInfo(1, 2, 3, null);
    public static final ColorInfo A06 = new ColorInfo(1, 1, 2, null);
    public static final Parcelable.Creator PARCELABLE_CREATOR = new C206149Aw(29);
    public static final InterfaceC98384bH CREATOR = new InterfaceC98384bH() { // from class: X.4bG
    };

    public static int A00(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int A01(int i) {
        if (i != 1) {
            if (i == 4) {
                return 10;
            }
            if (i == 13) {
                return 2;
            }
            if (i == 16) {
                return 6;
            }
            if (i == 18) {
                return 7;
            }
            if (i != 6 && i != 7) {
                return -1;
            }
        }
        return 3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ColorInfo colorInfo = (ColorInfo) obj;
            if (this.A02 != colorInfo.A02 || this.A01 != colorInfo.A01 || this.A03 != colorInfo.A03 || !Arrays.equals(this.A04, colorInfo.A04)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00;
        if (i == 0) {
            int hashCode = ((((((527 + this.A02) * 31) + this.A01) * 31) + this.A03) * 31) + Arrays.hashCode(this.A04);
            this.A00 = hashCode;
            return hashCode;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r4 = this;
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r0 = 1551(0x60f, float:2.173E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r2.append(r0)
            int r1 = r4.A02
            r0 = -1
            if (r1 == r0) goto Laa
            r0 = 6
            if (r1 == r0) goto La6
            r0 = 1
            if (r1 == r0) goto La2
            r0 = 2
            if (r1 == r0) goto L9e
            java.lang.String r0 = "Undefined color space"
        L1e:
            r2.append(r0)
            java.lang.String r1 = ", "
            r2.append(r1)
            int r3 = r4.A01
            r0 = -1
            if (r3 == r0) goto L94
            r0 = 1
            if (r3 == r0) goto L97
            r0 = 2
            if (r3 == r0) goto L91
            java.lang.String r0 = "Undefined color range"
        L33:
            r2.append(r0)
            r2.append(r1)
            int r3 = r4.A03
            r0 = -1
            if (r3 == r0) goto L8a
            r0 = 10
            if (r3 == r0) goto L83
            r0 = 1
            if (r3 == r0) goto L80
            r0 = 2
            if (r3 == r0) goto L7d
            r0 = 3
            if (r3 == r0) goto L76
            r0 = 6
            if (r3 == r0) goto L6f
            r0 = 7
            if (r3 == r0) goto L6c
            java.lang.String r0 = "Undefined color transfer"
        L53:
            r2.append(r0)
            r2.append(r1)
            byte[] r1 = r4.A04
            r0 = 0
            if (r1 == 0) goto L5f
            r0 = 1
        L5f:
            r2.append(r0)
            java.lang.String r0 = ")"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        L6c:
            java.lang.String r0 = "HLG"
            goto L53
        L6f:
            r0 = 1789(0x6fd, float:2.507E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            goto L53
        L76:
            r0 = 1787(0x6fb, float:2.504E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            goto L53
        L7d:
            java.lang.String r0 = "sRGB"
            goto L53
        L80:
            java.lang.String r0 = "Linear"
            goto L53
        L83:
            r0 = 1638(0x666, float:2.295E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            goto L53
        L8a:
            r0 = 1849(0x739, float:2.591E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            goto L53
        L91:
            r0 = 1686(0x696, float:2.363E-42)
            goto L99
        L94:
            r0 = 1847(0x737, float:2.588E-42)
            goto L99
        L97:
            r0 = 1635(0x663, float:2.291E-42)
        L99:
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            goto L33
        L9e:
            java.lang.String r0 = "BT601"
            goto L1e
        La2:
            java.lang.String r0 = "BT709"
            goto L1e
        La6:
            java.lang.String r0 = "BT2020"
            goto L1e
        Laa:
            r0 = 1848(0x738, float:2.59E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.ColorInfo.toString():java.lang.String");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
        byte[] bArr = this.A04;
        int i2 = 0;
        if (bArr != null) {
            i2 = 1;
        }
        parcel.writeInt(i2);
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    public ColorInfo(int i, int i2, int i3, byte[] bArr) {
        this.A02 = i;
        this.A01 = i2;
        this.A03 = i3;
        this.A04 = bArr;
    }

    public ColorInfo(Parcel parcel) {
        byte[] bArr;
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A03 = parcel.readInt();
        if (parcel.readInt() != 0) {
            bArr = parcel.createByteArray();
        } else {
            bArr = null;
        }
        this.A04 = bArr;
    }
}
