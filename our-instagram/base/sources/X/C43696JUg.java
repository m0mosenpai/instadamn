package X;

import android.view.View;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.JUg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43696JUg implements MP6 {
    public final /* synthetic */ JUG A00;
    public final /* synthetic */ C43695JUf A01;
    public final /* synthetic */ MRJ A02;
    public final /* synthetic */ JUe A03;

    public C43696JUg(JUG jug, C43695JUf c43695JUf, MRJ mrj, JUe jUe) {
        this.A02 = mrj;
        this.A00 = jug;
        this.A03 = jUe;
        this.A01 = c43695JUf;
    }

    @Override // X.MP6
    public final void DoP(Integer num) {
        IgProgressImageView igProgressImageView;
        int A03 = AbstractC43592JPx.A03(num, 0);
        if (A03 != 3) {
            if (A03 == 4) {
                this.A02.DfR();
                JUe jUe = this.A03;
                if (jUe.A03 == 29 && jUe.A0H && AbstractC167007dF.A1Z(this.A01.A03.A1M)) {
                    JUG jug = this.A00;
                    View view = jug.A03;
                    AbstractC13880nE.A0X(view, 17);
                    igProgressImageView = jug.A09;
                    igProgressImageView.setErrorMode(C3X1.A02);
                    view.setVisibility(0);
                } else {
                    JUG jug2 = this.A00;
                    View view2 = jug2.A03;
                    AbstractC13880nE.A0X(view2, 8388661);
                    igProgressImageView = jug2.A09;
                    igProgressImageView.setErrorMode(C3X1.A03);
                    view2.setVisibility(8);
                }
                igProgressImageView.A03();
                return;
            }
            return;
        }
        this.A02.DfQ();
        this.A00.A09.setBackgroundColor(0);
    }
}
