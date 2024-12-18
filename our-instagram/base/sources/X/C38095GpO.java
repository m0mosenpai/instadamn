package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.discovery.ui.FixedAspectRatioVideoLayout;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.GpO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38095GpO extends AbstractC66412zI {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final InterfaceC65702y7 A02;
    public final AbstractC42425IqS A03;
    public final JPS A04;
    public final InterfaceC43406JFw A05;
    public final JIG A06;
    public final boolean A07;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.2y7, java.lang.Object] */
    public C38095GpO(InterfaceC11380iw interfaceC11380iw, UserSession userSession, AbstractC42425IqS abstractC42425IqS, JPS jps, InterfaceC43406JFw interfaceC43406JFw, JIG jig, boolean z) {
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
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C38519Gwf(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_grid_item_igtv, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        HKU hku = (HKU) interfaceC66482zP;
        C38519Gwf c38519Gwf = (C38519Gwf) c3oo;
        boolean A1a = AbstractC167017dG.A1a(hku, c38519Gwf);
        C38321qM c38321qM = hku.A01.A00;
        C127915qK c127915qK = ((AbstractC127945qN) hku).A02;
        C5qT BAM = this.A04.BAM(hku);
        UserSession userSession = this.A01;
        boolean A1Y = AbstractC37301Gc2.A1Y(userSession, c38321qM);
        InterfaceC43406JFw interfaceC43406JFw = this.A05;
        FixedAspectRatioVideoLayout fixedAspectRatioVideoLayout = c38519Gwf.A02;
        interfaceC43406JFw.EE0(fixedAspectRatioVideoLayout, BAM, c127915qK, hku, A1a);
        InterfaceC11380iw interfaceC11380iw = this.A00;
        fixedAspectRatioVideoLayout.setVideoSource(c38321qM, interfaceC11380iw);
        float f = c127915qK.A00;
        fixedAspectRatioVideoLayout.setAspectRatio(f);
        fixedAspectRatioVideoLayout.setEnableTouchOverlay(A1a);
        int i = BAM.A01;
        AbstractC79753hQ.A04(fixedAspectRatioVideoLayout, userSession, c38321qM, i);
        IgImageButton igImageButton = c38519Gwf.A03;
        ((IgImageView) igImageButton).A0E = new C42356IpI(BAM, this, hku);
        InterfaceC65702y7 interfaceC65702y7 = this.A02;
        JIG jig = this.A06;
        AbstractC40616Hza.A00(interfaceC11380iw, interfaceC65702y7, null, c38321qM, igImageButton, f, i, BAM.A00, jig.Cdd(c38321qM), A1Y, this.A07);
        IgSimpleImageView igSimpleImageView = c38519Gwf.A00;
        igSimpleImageView.setImageResource(R.drawable.instagram_play_pano_filled_24);
        AbstractC31173DnH.A11(igSimpleImageView.getContext(), igSimpleImageView, R.color.design_dark_default_color_on_background);
        c38519Gwf.A01.setText(2131976820);
        if (A1Y) {
            fixedAspectRatioVideoLayout.setOnClickListener(null);
            fixedAspectRatioVideoLayout.setOnTouchListener(null);
            return;
        }
        ViewOnClickListenerC42029Ijy viewOnClickListenerC42029Ijy = new ViewOnClickListenerC42029Ijy(7, BAM, hku, this);
        ViewOnTouchListenerC42056IkP viewOnTouchListenerC42056IkP = new ViewOnTouchListenerC42056IkP(2, hku, BAM, this);
        C0fQ.A00(viewOnClickListenerC42029Ijy, fixedAspectRatioVideoLayout);
        fixedAspectRatioVideoLayout.setOnTouchListener(viewOnTouchListenerC42056IkP);
        jig.E8Y(c38519Gwf, c38321qM);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return HKU.class;
    }
}
