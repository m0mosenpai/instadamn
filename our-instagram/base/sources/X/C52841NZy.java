package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.NZy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52841NZy extends C56163OwV implements InterfaceC12870lZ {
    public AnonymousClass195 A00;
    public final ViewGroup A01;
    public final C171197kB A02;

    @Override // X.C56163OwV
    public final void A04(Fragment fragment) {
        C53011Ncj c53011Ncj;
        super.A04(fragment);
        C218914p.A04(EnumC220415e.A02, this, false, false);
        AbstractC50987Mfu abstractC50987Mfu = (AbstractC50987Mfu) this.A0I.getValue();
        AnonymousClass195 anonymousClass195 = null;
        if ((abstractC50987Mfu instanceof C53011Ncj) && (c53011Ncj = (C53011Ncj) abstractC50987Mfu) != null) {
            anonymousClass195 = AbstractC50522MSa.A0s(fragment, C57167PZl.A01(this, null, 33), c53011Ncj.A06);
        }
        this.A00 = anonymousClass195;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.7kB, java.lang.Object] */
    public C52841NZy(View view, AbstractC59962oe abstractC59962oe, UserSession userSession, EnumC142806cg enumC142806cg) {
        super(view, abstractC59962oe, userSession, enumC142806cg, R.layout.iglive_viewer_buttons_container);
        C14360o3.A0B(userSession, 2);
        this.A01 = AbstractC31176DnK.A0C(view, R.id.iglive_reactions_layout);
        this.A02 = new Object();
    }

    public final void A05(Fragment fragment) {
        C2GT c2gt;
        C218914p.A07(this);
        AnonymousClass195 anonymousClass195 = this.A00;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        this.A00 = null;
        InterfaceC09390do interfaceC09390do = this.A0I;
        AbstractC50987Mfu abstractC50987Mfu = (AbstractC50987Mfu) interfaceC09390do.getValue();
        if (abstractC50987Mfu instanceof C53011Ncj) {
            C53011Ncj c53011Ncj = (C53011Ncj) abstractC50987Mfu;
            c53011Ncj.A01();
            c53011Ncj.A00 = 0L;
        } else {
            abstractC50987Mfu.A01();
        }
        AnonymousClass195 anonymousClass1952 = super.A00;
        if (anonymousClass1952 != null) {
            anonymousClass1952.AGH(null);
        }
        super.A00 = null;
        AbstractC50987Mfu abstractC50987Mfu2 = (AbstractC50987Mfu) interfaceC09390do.getValue();
        if (abstractC50987Mfu2 instanceof C53011Ncj) {
            c2gt = ((C53011Ncj) abstractC50987Mfu2).A01;
        } else if (abstractC50987Mfu2 instanceof C53010Nci) {
            c2gt = ((C53010Nci) abstractC50987Mfu2).A01;
        } else {
            c2gt = ((C53009Nch) abstractC50987Mfu2).A00;
        }
        c2gt.A05(fragment.getViewLifecycleOwner());
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        C0f9.A0A(162423597, C0f9.A03(-1177526477));
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(563473111);
        this.A0I.getValue();
        C0f9.A0A(533200079, A03);
    }
}
