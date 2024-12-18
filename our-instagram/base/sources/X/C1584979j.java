package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.79j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1584979j extends AbstractC161677Mc implements InterfaceC161737Mi {
    public final UserSession A00;
    public final C7ST A01;
    public final InterfaceC162527Pp A02;
    public final AnonymousClass988 A03;
    public final C7IM A04;
    public final C18A A05;

    @Override // X.AbstractC161677Mc, X.AbstractC161687Md
    public final /* bridge */ /* synthetic */ void A03(C7VC c7vc) {
        C160787Im c160787Im = (C160787Im) c7vc;
        C7ST c7st = this.A01;
        if (c160787Im != null) {
            c160787Im.A0e.A0L = c7st.A01;
        }
        super.A03(c160787Im);
    }

    @Override // X.InterfaceC161737Mi
    public final C7S5 Bkh() {
        return ((InterfaceC161737Mi) ((AbstractC161677Mc) this).A00).Bkh();
    }

    public C1584979j(C3OO c3oo, AbstractC66422zJ abstractC66422zJ, UserSession userSession, InterfaceC162527Pp interfaceC162527Pp, C7ZX c7zx, AnonymousClass988 anonymousClass988, C7IM c7im) {
        super(c3oo, abstractC66422zJ);
        this.A00 = userSession;
        this.A05 = AnonymousClass189.A00(userSession);
        this.A04 = c7im;
        this.A03 = anonymousClass988;
        this.A01 = new C7ST(c3oo.itemView, c7zx);
        this.A02 = interfaceC162527Pp;
    }

    public static C1584979j A00(LayoutInflater layoutInflater, ViewGroup viewGroup, AbstractC66422zJ abstractC66422zJ, UserSession userSession, InterfaceC162527Pp interfaceC162527Pp, C7ZX c7zx, AnonymousClass988 anonymousClass988, C7IM c7im) {
        return new C1584979j(abstractC66422zJ.createViewHolder(viewGroup, layoutInflater), abstractC66422zJ, userSession, interfaceC162527Pp, c7zx, anonymousClass988, c7im);
    }

    @Override // X.AbstractC161677Mc, X.AbstractC161687Md
    public final void A02() {
        super.A02();
        C160787Im c160787Im = (C160787Im) ((AbstractC161687Md) this).A00;
        if (c160787Im != null) {
            c160787Im.A0e.A0L = null;
        }
    }
}
