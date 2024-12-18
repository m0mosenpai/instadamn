package X;

import java.util.List;

/* renamed from: X.CUq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27968CUq {
    public final int A00;
    public final int A01;
    public final C28763Cmv A02;
    public final C27849CPm A03;
    public final C28277CdM A04;
    public final boolean A05;
    public final /* synthetic */ C27849CPm A06;
    public final /* synthetic */ boolean A07;

    public final long A00(int i, int i2) {
        int i3;
        if (i2 == 1) {
            i3 = this.A03.A01[i];
        } else {
            int i4 = (i2 + i) - 1;
            C27849CPm c27849CPm = this.A03;
            int[] iArr = c27849CPm.A00;
            i3 = (iArr[i4] + c27849CPm.A01[i4]) - iArr[i];
        }
        int A06 = AbstractC25230BEn.A06(i3, i3);
        if (this.A05) {
            return AbstractC119035aK.A01(A06);
        }
        return AbstractC119035aK.A00(A06);
    }

    public C27968CUq(C28763Cmv c28763Cmv, C27849CPm c27849CPm, C28277CdM c28277CdM, int i, int i2, boolean z) {
        this.A07 = z;
        this.A06 = c27849CPm;
        this.A05 = z;
        this.A03 = c27849CPm;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = c28763Cmv;
        this.A04 = c28277CdM;
    }

    public final CUG A01(int i) {
        int i2;
        C27851CPo A03 = this.A04.A03(i);
        List list = A03.A01;
        int size = list.size();
        if (size != 0 && A03.A00 + size != this.A00) {
            i2 = this.A01;
        } else {
            i2 = 0;
        }
        C28760Cms[] c28760CmsArr = new C28760Cms[size];
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = (int) ((C27973CUv) list.get(i4)).A00;
            C28760Cms A00 = this.A02.A00(A03.A00 + i4, i3, i5, i2, A00(i3, i5));
            i3 += i5;
            c28760CmsArr[i4] = A00;
        }
        return new CUG(this.A06, list, c28760CmsArr, i, i2, this.A07);
    }
}
