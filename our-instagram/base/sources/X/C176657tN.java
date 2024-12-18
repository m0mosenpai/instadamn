package X;

import java.util.List;

/* renamed from: X.7tN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176657tN implements InterfaceC176667tO {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final List A0C;
    public final List A0D;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C176657tN) {
                C176657tN c176657tN = (C176657tN) obj;
                if (!C14360o3.A0K(this.A08, c176657tN.A08) || !C14360o3.A0K(this.A0A, c176657tN.A0A) || !C14360o3.A0K(this.A09, c176657tN.A09) || !C14360o3.A0K(this.A05, c176657tN.A05) || this.A00 != c176657tN.A00 || !C14360o3.A0K(this.A0B, c176657tN.A0B) || !C14360o3.A0K(this.A0C, c176657tN.A0C) || !C14360o3.A0K(this.A0D, c176657tN.A0D) || this.A03 != c176657tN.A03 || this.A04 != c176657tN.A04 || this.A02 != c176657tN.A02 || !C14360o3.A0K(this.A06, c176657tN.A06) || this.A01 != c176657tN.A01 || !C14360o3.A0K(this.A07, c176657tN.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CameraAnalyticsInfo(oneCameraActiveSessionID=");
        sb.append(this.A08);
        sb.append(", productSessionID=");
        sb.append(this.A0A);
        sb.append(AbstractC43591JPw.A00(516));
        sb.append(this.A09);
        sb.append(AbstractC111324zv.A00(278));
        sb.append(this.A05);
        sb.append(", cameraFacing=");
        sb.append(this.A00);
        sb.append(", effectIDs=");
        sb.append(this.A0B);
        sb.append(", effectInstanceIDs=");
        sb.append(this.A0C);
        sb.append(", effectSessionIDs=");
        sb.append(this.A0D);
        sb.append(", availableMemoryMb=");
        sb.append(this.A03);
        sb.append(", totalMemoryMb=");
        sb.append(this.A04);
        sb.append(", photoCaptureType=");
        sb.append(this.A02);
        sb.append(", isCameraColdStart=");
        sb.append(this.A06);
        sb.append(", cameraType=");
        sb.append(this.A01);
        sb.append(", isPowerSaveMode=");
        sb.append(this.A07);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = this.A08.hashCode() * 31;
        String str = this.A0A;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode6 = (((hashCode5 + hashCode) * 31) + this.A09.hashCode()) * 31;
        String str2 = this.A05;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (((hashCode6 + hashCode2) * 31) + this.A00) * 31;
        List list = this.A0B;
        if (list == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        List list2 = this.A0C;
        if (list2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list2.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        List list3 = this.A0D;
        if (list3 != null) {
            i = list3.hashCode();
        }
        int i5 = (i4 + i) * 31;
        long j = this.A03;
        int i6 = (i5 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.A04;
        return ((((((((i6 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.A02) * 31) + this.A06.hashCode()) * 31) + this.A01) * 31) + this.A07.hashCode();
    }

    public C176657tN(String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, int i, int i2, int i3, long j, long j2) {
        this.A08 = str;
        this.A0A = str2;
        this.A09 = str3;
        this.A05 = str4;
        this.A00 = i;
        this.A0B = list;
        this.A0C = list2;
        this.A0D = list3;
        this.A03 = j;
        this.A04 = j2;
        this.A02 = i2;
        this.A06 = str5;
        this.A01 = i3;
        this.A07 = str6;
    }
}
