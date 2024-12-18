package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.Gg3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37547Gg3 extends AbstractC1337162c {
    public final InterfaceC11380iw A00;
    public final C37523Gff A01;

    @Override // X.AbstractC1337262d
    public final boolean A02() {
        return false;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        View A0D = AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.layout_clips_viewer_survey, false);
        C52 c52 = new C52(A0D);
        A0D.setTag(c52);
        return c52;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C39461Hbn.class;
    }

    public C37547Gg3(JPb jPb, InterfaceC11380iw interfaceC11380iw, C25348BJr c25348BJr, C37523Gff c37523Gff) {
        super(jPb, c25348BJr);
        this.A00 = interfaceC11380iw;
        this.A01 = c37523Gff;
    }

    @Override // X.AbstractC1337162c
    public final /* bridge */ /* synthetic */ void A03(C3OO c3oo, C62a c62a) {
        AbstractC167017dG.A1N(c62a, c3oo);
        C38321qM c38321qM = c62a.A00.A02;
        if (c38321qM != null) {
            c38321qM.A3x();
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
