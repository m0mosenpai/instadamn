package X;

import com.instagram.common.session.UserSession;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.GpM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38093GpM {
    public final JPS A00;
    public final InterfaceC43406JFw A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final boolean A04;
    public final boolean A05;

    public final void A00(JPT jpt, AbstractC127945qN abstractC127945qN, C38321qM c38321qM, IgImageButton igImageButton, boolean z) {
        String id;
        C14360o3.A0B(igImageButton, 2);
        C14360o3.A0B(jpt, 3);
        C127915qK c127915qK = abstractC127945qN.A02;
        C5qT BAM = this.A00.BAM(abstractC127945qN);
        if (c38321qM != null && (id = c38321qM.getId()) != null) {
            igImageButton.setTransitionName(id);
        }
        this.A01.EE0(igImageButton, BAM, c127915qK, abstractC127945qN, false);
        UserSession userSession = this.A03;
        boolean A02 = AbstractC153456vF.A02(userSession);
        C3YT A00 = C3YS.A00(userSession);
        C14360o3.A0A(c38321qM);
        if (A00.A05(c38321qM)) {
            IZ9.A00(new ViewOnClickListenerC42034Ik3(9, jpt, c38321qM), this.A02, c38321qM, igImageButton, BAM.A01, BAM.A00, false, A02);
            return;
        }
        ViewOnClickListenerC42030Ijz viewOnClickListenerC42030Ijz = new ViewOnClickListenerC42030Ijz(8, jpt, BAM, abstractC127945qN, c38321qM);
        ViewOnTouchListenerC42056IkP viewOnTouchListenerC42056IkP = new ViewOnTouchListenerC42056IkP(3, BAM, jpt, c38321qM);
        C38163GqU c38163GqU = new C38163GqU(jpt, abstractC127945qN);
        boolean z2 = !this.A04;
        if (c38321qM.Cff()) {
            z2 = true;
        }
        AbstractC153386v7.A02(viewOnClickListenerC42030Ijz, viewOnTouchListenerC42056IkP, this.A02, userSession, c38321qM, c38163GqU, null, igImageButton, null, null, c127915qK.A00, BAM.A01, BAM.A00, 0, z2, this.A05, z, false, false);
        if (!jpt.BWN()) {
            return;
        }
        igImageButton.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC55359OiL(1, jpt, igImageButton, c38321qM));
        jpt.DLV(c38321qM);
    }

    public C38093GpM(InterfaceC11380iw interfaceC11380iw, UserSession userSession, JPS jps, InterfaceC43406JFw interfaceC43406JFw, boolean z, boolean z2) {
        AbstractC167017dG.A1R(interfaceC43406JFw, userSession);
        this.A02 = interfaceC11380iw;
        this.A01 = interfaceC43406JFw;
        this.A03 = userSession;
        this.A00 = jps;
        this.A05 = z;
        this.A04 = z2;
    }
}
