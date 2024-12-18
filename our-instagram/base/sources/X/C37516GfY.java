package X;

import android.content.Context;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.GfY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37516GfY {
    public final C18920wW A00;
    public final UserSession A01;
    public final C76553c0 A02;

    public final void A00(C9BH c9bh, C38478Gvz c38478Gvz) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        C14360o3.A0B(c9bh, 1);
        C206209Bd c206209Bd = (C206209Bd) c9bh.A00;
        if (AbstractC25231BEo.A1b((InterfaceC16820sZ) c206209Bd.A01)) {
            if (c38478Gvz != null && (viewGroup3 = c38478Gvz.A00) != null) {
                viewGroup3.setVisibility(0);
                return;
            }
            return;
        }
        if (AbstractC25231BEo.A1b((InterfaceC16820sZ) c206209Bd.A00)) {
            if (c38478Gvz != null && (viewGroup2 = c38478Gvz.A00) != null) {
                viewGroup2.setVisibility(0);
            }
            InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) c206209Bd.A02;
            if (c38478Gvz != null) {
                viewGroup = c38478Gvz.A00;
            } else {
                viewGroup = null;
            }
            interfaceC16620sF.invoke(viewGroup, new HK7(this));
            return;
        }
        if (c38478Gvz == null) {
            return;
        }
        AbstractC167007dF.A0x(c38478Gvz.A00);
    }

    public C37516GfY(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        AbstractC167017dG.A1P(context, userSession);
        this.A01 = userSession;
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        this.A02 = new C76553c0(context, userSession);
    }
}
