package X;

import java.util.List;

/* renamed from: X.5Ml, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C115955Ml extends C0T6 {
    public List A00;
    public List A01;
    public List A02;
    public List A03;
    public List A04;
    public List A05;
    public List A06;
    public List A07;
    public List A08;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C115955Ml() {
        /*
            r2 = this;
            r1 = 0
            r0 = 511(0x1ff, float:7.16E-43)
            r2.<init>(r0, r1, r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C115955Ml.<init>():void");
    }

    public /* synthetic */ C115955Ml(int i, List list, List list2, List list3) {
        C16930sl c16930sl;
        C16930sl c16930sl2;
        list = (i & 1) != 0 ? C16930sl.A00 : list;
        if ((i & 2) != 0) {
            c16930sl = C16930sl.A00;
        } else {
            c16930sl = null;
        }
        C16930sl c16930sl3 = (i & 4) != 0 ? C16930sl.A00 : null;
        list2 = (i & 8) != 0 ? C16930sl.A00 : list2;
        C16930sl c16930sl4 = (i & 16) != 0 ? C16930sl.A00 : null;
        list3 = (i & 32) != 0 ? C16930sl.A00 : list3;
        if ((i & 64) != 0) {
            c16930sl2 = C16930sl.A00;
        } else {
            c16930sl2 = null;
        }
        C16930sl c16930sl5 = (i & 128) != 0 ? C16930sl.A00 : null;
        C16930sl c16930sl6 = (i & 256) != 0 ? C16930sl.A00 : null;
        C14360o3.A0B(list, 1);
        C14360o3.A0B(c16930sl, 2);
        C14360o3.A0B(c16930sl3, 3);
        C14360o3.A0B(list2, 4);
        C14360o3.A0B(c16930sl4, 5);
        C14360o3.A0B(list3, 6);
        C14360o3.A0B(c16930sl2, 7);
        C14360o3.A0B(c16930sl5, 8);
        C14360o3.A0B(c16930sl6, 9);
        this.A05 = list;
        this.A07 = c16930sl;
        this.A00 = c16930sl3;
        this.A06 = list2;
        this.A02 = c16930sl4;
        this.A08 = list3;
        this.A01 = c16930sl2;
        this.A03 = c16930sl5;
        this.A04 = c16930sl6;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115955Ml) {
                C115955Ml c115955Ml = (C115955Ml) obj;
                if (!C14360o3.A0K(this.A05, c115955Ml.A05) || !C14360o3.A0K(this.A07, c115955Ml.A07) || !C14360o3.A0K(this.A00, c115955Ml.A00) || !C14360o3.A0K(this.A06, c115955Ml.A06) || !C14360o3.A0K(this.A02, c115955Ml.A02) || !C14360o3.A0K(this.A08, c115955Ml.A08) || !C14360o3.A0K(this.A01, c115955Ml.A01) || !C14360o3.A0K(this.A03, c115955Ml.A03) || !C14360o3.A0K(this.A04, c115955Ml.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((this.A05.hashCode() * 31) + this.A07.hashCode()) * 31) + this.A00.hashCode()) * 31) + this.A06.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A08.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A04.hashCode();
    }
}
