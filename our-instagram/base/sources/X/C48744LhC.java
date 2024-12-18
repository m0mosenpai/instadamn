package X;

import android.view.View;

/* renamed from: X.LhC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48744LhC implements MRG {
    public AbstractC46972Dl A00 = C125575m3.A00;
    public final /* synthetic */ LLk A01;

    @Override // X.MRG
    public final EnumC44049Jda Bsr() {
        return null;
    }

    @Override // X.MRG
    public final void CoU(AbstractC46972Dl abstractC46972Dl) {
    }

    @Override // X.MRG
    public final void DHk(View view, C43792JYf c43792JYf, int i) {
    }

    @Override // X.MRG
    public final void DVV() {
    }

    public C48744LhC(LLk lLk) {
        this.A01 = lLk;
    }

    @Override // X.MRG
    public final AbstractC46972Dl Bsj() {
        return this.A00;
    }

    @Override // X.MRG
    public final void DHj(C43792JYf c43792JYf, int i) {
        LLk lLk = this.A01;
        C45527KDs c45527KDs = lLk.A06;
        if (c45527KDs != null) {
            lLk.A03.A03(c43792JYf.A00, "CHANGE_FOLDER", (java.util.Set) c45527KDs.A04.getValue());
        }
        AbstractC46972Dl abstractC46972Dl = c43792JYf.A00;
        this.A00 = abstractC46972Dl;
        C2057398y c2057398y = C2057398y.A00;
        if (abstractC46972Dl == c2057398y) {
            lLk.A0O = true;
            lLk.A0p.A00();
            LLk.A0F(lLk);
            LEW.A00(lLk.A0m, "filtered_folder_clicked", lLk.A02.A02.A00, null, null, lLk.A0j.A05());
            if (c45527KDs != null) {
                lLk.A02 = AbstractC47860LCg.A01(c2057398y, (C4I3) c45527KDs.A06.getValue());
            }
            lLk.A0m(false, false);
            lLk.A0j();
        } else {
            lLk.A0o.A04("open_pending", null);
            lLk.A0O = false;
            lLk.A0p.A01(lLk.A0a);
            if (c45527KDs != null) {
                LLk.A0D(AbstractC47860LCg.A01(abstractC46972Dl, (C4I3) c45527KDs.A06.getValue()), lLk);
            }
            LLk.A0J(lLk);
            LLk.A0F(lLk);
        }
        if (AbstractC1337462f.A0C(lLk.A0h, true)) {
            LLk.A0N(lLk, "direct_requests_select_folder", null, this.A00.A04, AbstractC166987dD.A1E(), -1);
        }
    }
}
