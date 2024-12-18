package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;

/* renamed from: X.Duv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31629Duv extends AbstractC66412zI {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final InterfaceC132405yL A02;
    public final String A03 = "inbox_suggestion";

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        C14360o3.A0B(c3oo, 0);
        InterfaceC132405yL interfaceC132405yL = this.A02;
        C14360o3.A0B(interfaceC132405yL, 1);
        interfaceC132405yL.Dqm(c3oo.itemView);
    }

    public C31629Duv(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC132405yL interfaceC132405yL) {
        this.A01 = userSession;
        this.A02 = interfaceC132405yL;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C31459Ds3 c31459Ds3 = (C31459Ds3) interfaceC66482zP;
        C31995E3x c31995E3x = (C31995E3x) c3oo;
        AbstractC167007dF.A1K(c31459Ds3, c31995E3x);
        DirectShareTarget directShareTarget = c31459Ds3.A01;
        int i = c31459Ds3.A00;
        String A08 = directShareTarget.A08();
        if (A08 == null) {
            A08 = AbstractC31173DnH.A0o(directShareTarget);
        }
        ArrayList A0B = directShareTarget.A0B();
        c31995E3x.getBindingAdapterPosition();
        C31446Drq c31446Drq = new C31446Drq(i, A08, null, A0B);
        F3P.A00(this.A00, this.A01, c31995E3x, c31446Drq, this.A02, directShareTarget, this.A03, c31459Ds3.A03, 6, i, i, 0, 0, c31459Ds3.A08, false, !c31459Ds3.A05, c31459Ds3.A04, false, c31459Ds3.A06, c31459Ds3.A07);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C31995E3x(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_inbox_search_row_layout, false));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C31459Ds3.class;
    }
}
