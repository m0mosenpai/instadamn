package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.Bwn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27064Bwn extends AbstractC66422zJ {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C25918BdL(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.content_notes_group_reply_recipient_pill, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C29159CtQ c29159CtQ = (C29159CtQ) interfaceC66482zP;
        C25918BdL c25918BdL = (C25918BdL) c3oo;
        AbstractC167017dG.A1N(c29159CtQ, c25918BdL);
        c25918BdL.A00.setText(c29159CtQ.A01);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C29159CtQ.class;
    }
}
