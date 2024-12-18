package X;

import android.os.Handler;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel;

/* renamed from: X.NZn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52830NZn extends OMQ {
    public AnonymousClass195 A00;
    public final Handler A01;
    public final View A02;
    public final ViewOnTouchListenerC44256Jh0 A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52830NZn(View view, AbstractC59962oe abstractC59962oe, UserSession userSession) {
        super(view, abstractC59962oe, userSession, EnumC142806cg.A05);
        C14360o3.A0B(userSession, 2);
        C57530Pg4 A00 = C57530Pg4.A00(abstractC59962oe, userSession, 13);
        InterfaceC09390do A002 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57558PgW(new C57558PgW(abstractC59962oe, 29), 30));
        this.A0D = AbstractC25225BEi.A0a(new C57558PgW(A002, 31), A00, C57530Pg4.A00(null, A002, 12), AbstractC25225BEi.A1D(C51018MgQ.class));
        this.A01 = AbstractC167007dF.A0J();
        this.A02 = AbstractC166997dE.A0S(view, R.id.iglive_reactions_composer);
        this.A08 = C57558PgW.A01(view, 24);
        this.A07 = C57558PgW.A01(this, 23);
        this.A09 = C57558PgW.A01(this, 25);
        this.A0C = C57558PgW.A02(this, 28);
        this.A06 = C57558PgW.A01(this, 22);
        this.A0B = C57558PgW.A01(this, 27);
        this.A0A = C57558PgW.A01(this, 26);
        this.A05 = C57558PgW.A01(this, 21);
        this.A04 = C57558PgW.A01(this, 20);
        this.A03 = new ViewOnTouchListenerC44256Jh0(2);
    }

    @Override // X.OMQ
    public final void A04() {
        super.A04();
        Handler handler = this.A01;
        handler.removeCallbacksAndMessages(null);
        InterfaceC09390do interfaceC09390do = this.A07;
        AbstractC166987dD.A0d(interfaceC09390do).setOnClickListener(null);
        AbstractC43593JPy.A1Q(interfaceC09390do.getValue());
        View A0d = AbstractC166987dD.A0d(this.A09);
        A0d.setScaleX(0.0f);
        A0d.setScaleY(0.0f);
        A0d.setAlpha(0.6f);
        A0d.setRotation(-10.0f);
        PU4.A00(handler, AbstractC166987dD.A0d(this.A06), 0L, false);
        PU4.A00(handler, AbstractC166987dD.A0d(this.A0B), 0L, false);
        PU4.A00(handler, AbstractC166987dD.A0d(this.A0A), 0L, false);
        PU4.A00(handler, AbstractC166987dD.A0d(this.A05), 0L, false);
        PU4.A00(handler, AbstractC166987dD.A0d(this.A04), 0L, false);
        this.A02.setAlpha(1.0f);
        AnonymousClass195 anonymousClass195 = this.A00;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        this.A00 = null;
    }

    @Override // X.OMQ
    public final void A05(Fragment fragment) {
        IgLiveViewerLikesViewModel igLiveViewerLikesViewModel;
        InterfaceC19390xP interfaceC19390xP;
        super.A05(fragment);
        if (this.A00 == null) {
            C51018MgQ A02 = A02();
            AnonymousClass195 anonymousClass195 = null;
            if ((A02 instanceof IgLiveViewerLikesViewModel) && (igLiveViewerLikesViewModel = (IgLiveViewerLikesViewModel) A02) != null && (interfaceC19390xP = igLiveViewerLikesViewModel.A09) != null) {
                anonymousClass195 = AbstractC50522MSa.A0s(fragment, C57167PZl.A01(this, null, 18), interfaceC19390xP);
            }
            this.A00 = anonymousClass195;
        }
        Ok4.A00(AbstractC166987dD.A0d(this.A07), 46, this);
    }
}
