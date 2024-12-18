package X;

import android.app.Activity;
import android.graphics.Rect;
import android.util.Rational;
import com.facebook.rtc.views.omnigrid.GridLayoutInput;
import com.facebook.rtc.views.omnigrid.GridLayoutInputItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class PRU implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C52690NTb A01;

    public PRU(C52690NTb c52690NTb, int i) {
        this.A00 = i;
        this.A01 = c52690NTb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C52690NTb c52690NTb;
        int A0A;
        int A09;
        Rect A0U;
        List<C51681MsC> list;
        if (this.A00 > 2) {
            c52690NTb = this.A01;
            if (AbstractC167007dF.A1Z(c52690NTb.A0K)) {
                OX0 A0D = AbstractC55206OeJ.A0D(c52690NTb);
                C51680MsB c51680MsB = A0D.A02;
                if (c51680MsB != null && (list = c51680MsB.A08) != null) {
                    ArrayList A0q = AbstractC167017dG.A0q(list);
                    for (C51681MsC c51681MsC : list) {
                        A0q.add(new GridLayoutInputItem(c51681MsC.A02, c51681MsC.A03, AbstractC54334Nzs.A00, AbstractC167007dF.A1X(c51681MsC.A07, C05F.A00), 0, null));
                    }
                    C51744MtT A00 = OX0.A00(A0D, C05F.A1I);
                    C57226PbA c57226PbA = C57226PbA.A00;
                    GridLayoutInput gridLayoutInput = new GridLayoutInput(A0q, A00.A02(AbstractC166997dE.A0L(A0D.A06)), 1000, 1000);
                    A0U = AbstractC166987dD.A0U();
                    C51727Mt4 c51727Mt4 = (C51727Mt4) c57226PbA.invoke(gridLayoutInput);
                    C14360o3.A0B(c51727Mt4, 0);
                    List list2 = c51727Mt4.A09;
                    if (!list2.isEmpty()) {
                        A0U.top = Integer.MAX_VALUE;
                        A0U.bottom = 0;
                        A0U.left = Integer.MAX_VALUE;
                        A0U.right = 0;
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            UQ7 uq7 = ((C51614Mr7) it.next()).A02;
                            int i = uq7.A01;
                            if (i > 0 || uq7.A03 > 0 || uq7.A02 > 0 || uq7.A00 > 0) {
                                A0U.left = Math.min(A0U.left, i);
                                A0U.top = Math.min(A0U.top, uq7.A03);
                                A0U.right = Math.max(A0U.right, uq7.A02);
                                A0U.bottom = Math.max(A0U.bottom, uq7.A00);
                            }
                        }
                    }
                } else {
                    A0U = AbstractC166987dD.A0U();
                }
                A0A = A0U.width();
                A09 = A0U.height();
                c52690NTb.A0A.A05(new PDM(new Rational(A0A, A09)));
            }
        }
        c52690NTb = this.A01;
        Activity activity = c52690NTb.A05;
        A0A = AbstractC13880nE.A0A(activity);
        A09 = AbstractC13880nE.A09(activity);
        c52690NTb.A0A.A05(new PDM(new Rational(A0A, A09)));
    }
}
