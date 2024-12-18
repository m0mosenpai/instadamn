package X;

import com.instagram.wellbeing.limitedprofile.fragment.LimitedCommentsFragment;

/* loaded from: classes6.dex */
public final class Eg5 extends C1I2 {
    public final int A00;
    public final Object A01;

    public Eg5(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        int A03;
        int i6;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(1624078042);
                ((ENP) this.A01).A08.onScroll(c3fq, i, i2, i3, i4, i5);
                i6 = -795056980;
                break;
            case 1:
                A03 = AbstractC167017dG.A0N(c3fq, -1420035287);
                ((ENY) this.A01).A0A.onScroll(c3fq, i, i2, i3, i4, i5);
                i6 = -1971663603;
                break;
            default:
                A03 = C0f9.A03(1791539450);
                c3fq.Egn(true);
                LimitedCommentsFragment limitedCommentsFragment = (LimitedCommentsFragment) this.A01;
                limitedCommentsFragment.A02.onScroll(c3fq, i, i2, i3, i4, i5);
                limitedCommentsFragment.A0F.onScroll(c3fq, i, i2, i3, i4, i5);
                i6 = 917073615;
                break;
        }
        C0f9.A0A(i6, A03);
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        int A03;
        int i2;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(1212551624);
                ((ENP) this.A01).A08.onScrollStateChanged(c3fq, i);
                i2 = 752169189;
                break;
            case 1:
                A03 = AbstractC167017dG.A0N(c3fq, -1956218585);
                ((ENY) this.A01).A0A.onScrollStateChanged(c3fq, i);
                i2 = 1385278372;
                break;
            default:
                A03 = C0f9.A03(-990221189);
                LimitedCommentsFragment limitedCommentsFragment = (LimitedCommentsFragment) this.A01;
                limitedCommentsFragment.A02.onScrollStateChanged(c3fq, i);
                limitedCommentsFragment.A0F.onScrollStateChanged(c3fq, i);
                i2 = 1623453261;
                break;
        }
        C0f9.A0A(i2, A03);
    }
}
