package X;

import android.content.Context;
import android.os.Build;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;

/* renamed from: X.Jrg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44759Jrg extends C3OO {
    public final InterfaceC56392iX A00;
    public final InterfaceC09390do A01;
    public final int A02;
    public final C57312k6 A03;
    public final UserSession A04;
    public final InterfaceC56392iX A05;
    public final C35967FuR A06;
    public final RoundedCornerConstraintLayout A07;

    public final void A00(C45201Jzh c45201Jzh) {
        InterfaceC09390do interfaceC09390do;
        RoundedCornerConstraintLayout roundedCornerConstraintLayout = this.A07;
        int i = this.A02;
        AbstractC31174DnI.A1D(roundedCornerConstraintLayout, i, (int) (i / 0.75d));
        String str = c45201Jzh.A02;
        if (Build.VERSION.SDK_INT >= 29 && str != null) {
            interfaceC09390do = this.A01;
            IgImageView A0V = AbstractC43592JPx.A0V(interfaceC09390do);
            C14360o3.A0B(A0V, 0);
            AnonymousClass791 A04 = AbstractC1580577p.A04(AbstractC35247Fgg.A00(A0V), A0V);
            LIO.A00.A01(AbstractC166997dE.A0L(AbstractC166987dD.A0d(interfaceC09390do)), LKY.A00(AbstractC43592JPx.A0V(interfaceC09390do)), this.A04, str, new C50370MLx(38, A04, this), this.A03);
        } else {
            interfaceC09390do = this.A01;
            AbstractC43592JPx.A0V(interfaceC09390do).setUrl(c45201Jzh.A00, this.A06);
        }
        UserSession userSession = this.A04;
        Context A0L = AbstractC166997dE.A0L(AbstractC166987dD.A0d(interfaceC09390do));
        InterfaceC56392iX interfaceC56392iX = this.A05;
        IgImageView A0V2 = AbstractC43592JPx.A0V(interfaceC09390do);
        View view = this.A00.getView();
        C17050sx A01 = AbstractC09440dt.A01(new C37051GUh(this, 28));
        IgImageView A0V3 = AbstractC43592JPx.A0V(interfaceC09390do);
        C14360o3.A0B(A0V3, 0);
        C158847Aw c158847Aw = new C158847Aw(A0L, view, userSession, A0V2, AbstractC1580577p.A04(AbstractC35247Fgg.A00(A0V3), A0V3), interfaceC56392iX, A01, 128);
        PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel = c45201Jzh.A01;
        if (privacyMediaOverlayViewModel != null) {
            c158847Aw.A04(privacyMediaOverlayViewModel, null, 1);
        } else {
            c158847Aw.A02();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.FuR, java.lang.Object] */
    public C44759Jrg(View view, C57312k6 c57312k6, UserSession userSession, int i) {
        super(view);
        AbstractC43594JPz.A1P(userSession, c57312k6);
        this.A04 = userSession;
        this.A02 = i;
        this.A03 = c57312k6;
        this.A07 = (RoundedCornerConstraintLayout) view.findViewById(R.id.card);
        this.A06 = new Object();
        this.A00 = AbstractC166997dE.A0X(view, R.id.privacy_overlay_image_container_legacy_view_stub);
        this.A01 = AbstractC09440dt.A01(new C50172MDz(26, view, this));
        this.A05 = AbstractC166997dE.A0X(view, R.id.privacy_overlay_stub);
    }
}
