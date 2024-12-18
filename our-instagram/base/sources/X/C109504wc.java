package X;

import java.util.Arrays;

/* renamed from: X.4wc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109504wc extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Long A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final byte[] A08;

    public C109504wc(Long l, String str, String str2, byte[] bArr, int i, int i2, int i3, long j, boolean z) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(bArr, 9);
        this.A05 = str;
        this.A06 = str2;
        this.A02 = i;
        this.A03 = j;
        this.A04 = l;
        this.A00 = i2;
        this.A07 = z;
        this.A01 = i3;
        this.A08 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C109504wc) {
                C109504wc c109504wc = (C109504wc) obj;
                if (!C14360o3.A0K(this.A05, c109504wc.A05) || !C14360o3.A0K(this.A06, c109504wc.A06) || this.A02 != c109504wc.A02 || this.A03 != c109504wc.A03 || !C14360o3.A0K(this.A04, c109504wc.A04) || this.A00 != c109504wc.A00 || this.A07 != c109504wc.A07 || this.A01 != c109504wc.A01 || !C14360o3.A0K(this.A08, c109504wc.A08)) {
                }
            }
            return false;
        }
        return true;
    }

    public final C5HW A00() {
        Object c09540e5;
        int i;
        byte[] bArr = this.A08;
        C14360o3.A0B(bArr, 0);
        try {
            c09540e5 = C5HV.parseFromJson(C16V.A00(new String(bArr, C15W.A05)));
        } catch (Throwable th) {
            c09540e5 = new C09540e5(th);
        }
        if (c09540e5 instanceof C09540e5) {
            c09540e5 = null;
        }
        C5HW c5hw = (C5HW) c09540e5;
        if (c5hw != null) {
            c5hw.A07 = C05F.A01;
            if (this.A07) {
                i = 2904;
            } else if (this.A00 == 0) {
                i = 2753;
            } else {
                i = 2814;
            }
            c5hw.A0D = AbstractC111324zv.A00(i);
            BJJ.A00(c5hw, new C206969Eb(this, 15));
            return c5hw;
        }
        return null;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.A05.hashCode() * 31) + this.A06.hashCode()) * 31) + this.A02) * 31;
        long j = this.A03;
        int i = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        Long l = this.A04;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int i2 = (((i + hashCode) * 31) + this.A00) * 31;
        int i3 = 1237;
        if (this.A07) {
            i3 = 1231;
        }
        return ((((i2 + i3) * 31) + this.A01) * 31) + Arrays.hashCode(this.A08);
    }
}
