package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.discovery.ui.FixedAspectRatioVideoLayout;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.GpN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38094GpN extends AbstractC66412zI {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final InterfaceC65702y7 A02;
    public final AbstractC42425IqS A03;
    public final JPS A04;
    public final InterfaceC43406JFw A05;
    public final JIG A06;
    public final boolean A07;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.2y7, java.lang.Object] */
    public C38094GpN(InterfaceC11380iw interfaceC11380iw, UserSession userSession, AbstractC42425IqS abstractC42425IqS, JPS jps, InterfaceC43406JFw interfaceC43406JFw, JIG jig, boolean z) {
        AbstractC167007dF.A1G(jig, 3, userSession);
        this.A00 = interfaceC11380iw;
        this.A03 = abstractC42425IqS;
        this.A06 = jig;
        this.A05 = interfaceC43406JFw;
        this.A01 = userSession;
        this.A04 = jps;
        this.A07 = z;
        this.A02 = new Object();
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        HKV hkv = (HKV) interfaceC66482zP;
        C38517Gwd c38517Gwd = (C38517Gwd) c3oo;
        boolean A1a = AbstractC167017dG.A1a(hkv, c38517Gwd);
        C38321qM c38321qM = hkv.A01;
        C127915qK c127915qK = ((AbstractC127945qN) hkv).A02;
        C5qT BAM = this.A04.BAM(hkv);
        UserSession userSession = this.A01;
        boolean A1Y = AbstractC37301Gc2.A1Y(userSession, c38321qM);
        InterfaceC43406JFw interfaceC43406JFw = this.A05;
        FixedAspectRatioVideoLayout fixedAspectRatioVideoLayout = c38517Gwd.A00;
        interfaceC43406JFw.EE0(fixedAspectRatioVideoLayout, BAM, c127915qK, hkv, A1a);
        InterfaceC11380iw interfaceC11380iw = this.A00;
        fixedAspectRatioVideoLayout.setVideoSource(c38321qM, interfaceC11380iw);
        float f = c127915qK.A00;
        fixedAspectRatioVideoLayout.setAspectRatio(f);
        fixedAspectRatioVideoLayout.setEnableTouchOverlay(A1a);
        int i = BAM.A01;
        AbstractC79753hQ.A04(fixedAspectRatioVideoLayout, userSession, c38321qM, i);
        IgImageButton igImageButton = c38517Gwd.A01;
        ((IgImageView) igImageButton).A0E = new C38191Gqw(A1a ? 1 : 0, BAM, this, hkv, c38321qM);
        InterfaceC65702y7 interfaceC65702y7 = this.A02;
        JIG jig = this.A06;
        boolean Cdd = jig.Cdd(c38321qM);
        AbstractC40616Hza.A00(interfaceC11380iw, interfaceC65702y7, this.A03, c38321qM, igImageButton, f, i, BAM.A00, Cdd, A1Y, this.A07);
        if (A1Y) {
            fixedAspectRatioVideoLayout.setOnClickListener(null);
            fixedAspectRatioVideoLayout.setOnTouchListener(null);
        } else {
            ViewOnClickListenerC42029Ijy.A00(fixedAspectRatioVideoLayout, BAM, hkv, this, 10);
            fixedAspectRatioVideoLayout.setOnTouchListener(new ViewOnTouchListenerC42056IkP(4, hkv, BAM, this));
            jig.E8Y(c38517Gwd, c38321qM);
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return HKV.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C38517Gwd(C50802Vb.A02(layoutInflater, viewGroup, R.layout.layout_grid_item_video));
    }
}
