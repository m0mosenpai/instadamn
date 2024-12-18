package X;

import java.util.Iterator;

/* renamed from: X.HLx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39169HLx extends C1I2 {
    public final /* synthetic */ C114485Es A00;

    public C39169HLx(C114485Es c114485Es) {
        this.A00 = c114485Es;
    }

    @Override // X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        C38321qM A04;
        int position;
        C56352iT A03;
        String str;
        String str2;
        C2EC c2ec;
        int A0N = AbstractC167017dG.A0N(c3fq, 329599905);
        C114485Es c114485Es = this.A00;
        C37840Gku c37840Gku = c114485Es.A0B;
        if (c37840Gku != null && c114485Es.A0Q) {
            c37840Gku.A03(C114485Es.A02(c114485Es));
        }
        if (i < i2 && c114485Es.A0K != null) {
            if (i == 0) {
                A03 = C56352iT.A0t.A03(c114485Es.requireActivity());
                str = c114485Es.A0H;
            } else if (c114485Es.A01 == 0) {
                A03 = C56352iT.A0t.A03(c114485Es.requireActivity());
                str = c114485Es.A0K;
            }
            C37840Gku c37840Gku2 = c114485Es.A0B;
            if (c37840Gku2 != null && (c2ec = c37840Gku2.A0A) != null) {
                str2 = c2ec.C7l();
            } else {
                str2 = null;
            }
            A03.EaW(str, str2);
        }
        c114485Es.A01 = i;
        if (c114485Es.A0F != null && (A04 = AbstractC41071vF.A04(c114485Es.A04().A01().getItem(i))) != null && (position = c114485Es.A04().A01().BRZ(A04).getPosition()) > c114485Es.A00) {
            Iterator it = c114485Es.A04().A01().A04.iterator();
            int i6 = 0;
            while (it.hasNext()) {
                int A0B = AbstractC167007dF.A0B(it);
                if (i < A0B + 1 && (i + i2) - 1 >= A0B) {
                    i6++;
                }
            }
            if (i6 > 0) {
                position += i6;
            }
            C32S c32s = c114485Es.A0F;
            if (c32s != null) {
                c32s.A0C(position);
                c32s.A0D(position, c114485Es.A00);
            }
            c114485Es.A00 = position;
        }
        C61582rL c61582rL = c114485Es.A0E;
        if (c61582rL == null) {
            C14360o3.A0F("tailLoadLogger");
            throw C00O.createAndThrow();
        }
        c61582rL.onScroll(c3fq, i, i2, i3, i4, i5);
        C0f9.A0A(-1370617748, A0N);
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        C0f9.A0A(757416663, C0f9.A03(1624001839));
    }
}
