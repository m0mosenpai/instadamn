package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.EXg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32606EXg extends AbstractC66412zI {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final InterfaceC37224GaZ A03;

    public C32606EXg(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC37224GaZ interfaceC37224GaZ) {
        AbstractC25233BEq.A0w(2, userSession, interfaceC37224GaZ, interfaceC11380iw);
        this.A00 = context;
        this.A02 = userSession;
        this.A03 = interfaceC37224GaZ;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        Context context = this.A00;
        FrameLayout frameLayout = (FrameLayout) AbstractC31172DnG.A0A(LayoutInflater.from(context), viewGroup, R.layout.directshare_row_user);
        frameLayout.setTag(new E40(context, frameLayout));
        Object tag = frameLayout.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.direct.ui.DirectRecipientRowViewBinder.Holder");
        return (C3OO) tag;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C36212FyQ c36212FyQ = (C36212FyQ) interfaceC66482zP;
        E40 e40 = (E40) c3oo;
        AbstractC167007dF.A1K(c36212FyQ, e40);
        Context context = this.A00;
        UserSession userSession = this.A02;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        int i = c36212FyQ.A03;
        int i2 = c36212FyQ.A00;
        int i3 = c36212FyQ.A02;
        boolean z = c36212FyQ.A0D;
        boolean z2 = c36212FyQ.A0E;
        int i4 = c36212FyQ.A01;
        DirectShareTarget directShareTarget = c36212FyQ.A05;
        InterfaceC37224GaZ interfaceC37224GaZ = this.A03;
        boolean z3 = c36212FyQ.A0F;
        boolean z4 = c36212FyQ.A0C;
        boolean z5 = c36212FyQ.A0B;
        boolean z6 = c36212FyQ.A0A;
        boolean z7 = c36212FyQ.A09;
        F5E.A00(userSession).A00.getBoolean("debug_overlay_enabled", false);
        FV9.A01(context, interfaceC11380iw, userSession, interfaceC37224GaZ, e40, directShareTarget, i, i2, i3, i4, z, z2, z3, z4, z5, z6, z7);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        E40 e40 = (E40) c3oo;
        C14360o3.A0B(e40, 0);
        this.A03.DdO(e40.A06);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C36212FyQ.class;
    }
}
