package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class CUG {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C28760Cms[] A03;
    public final C27849CPm A04;
    public final List A05;
    public final boolean A06;

    public final C28760Cms[] A00(int i, int i2, int i3) {
        int i4;
        int i5;
        C28760Cms[] c28760CmsArr = this.A03;
        int length = c28760CmsArr.length;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < length) {
            C28760Cms c28760Cms = c28760CmsArr[i6];
            int i9 = i7 + 1;
            int i10 = (int) ((C27973CUv) this.A05.get(i7)).A00;
            int i11 = this.A04.A00[i8];
            if (this.A06) {
                i4 = this.A00;
                i5 = i8;
            } else {
                i4 = i8;
                i5 = this.A00;
            }
            c28760Cms.A00(i, i11, i2, i3, i4, i5);
            i8 += i10;
            i6++;
            i7 = i9;
        }
        return c28760CmsArr;
    }

    public CUG(C27849CPm c27849CPm, List list, C28760Cms[] c28760CmsArr, int i, int i2, boolean z) {
        this.A00 = i;
        this.A03 = c28760CmsArr;
        this.A04 = c27849CPm;
        this.A05 = list;
        this.A06 = z;
        int i3 = 0;
        for (C28760Cms c28760Cms : c28760CmsArr) {
            i3 = Math.max(i3, c28760Cms.A09);
        }
        this.A01 = i3;
        int i4 = i3 + i2;
        this.A02 = AbstractC25230BEn.A06(i4, i4);
    }
}
