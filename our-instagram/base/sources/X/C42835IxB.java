package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import java.util.List;

/* renamed from: X.IxB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42835IxB implements JHL, JHM, JGQ, JPj, JPk, JPl {
    public final C6FG A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final INQ A03;
    public final C4ZF A04;
    public final ViewOnTouchListenerC676833i A05;
    public final InterfaceC16820sZ A06;

    @Override // X.JHN
    public final void DpH(InterfaceC58290Psi interfaceC58290Psi, C39352HZr c39352HZr) {
        Reel reel = c39352HZr.A01;
        List A1J = AbstractC166987dD.A1J(reel);
        UserSession userSession = this.A01;
        C6FG c6fg = this.A00;
        Fragment fragment = ((C62862tP) c6fg.A02).A02;
        C14360o3.A0C(fragment, "null cannot be cast to non-null type com.instagram.bloks.hosting.IgBloksScreenFragment");
        C38E c38e = new C38E(this.A02, userSession, AbstractC37301Gc2.A0L(fragment));
        c38e.A0C = AbstractC166997dE.A0n();
        Context context = c6fg.A00;
        AbstractC31171DnF.A1P(context);
        c38e.A05 = new C31559Dtj((Activity) context, interfaceC58290Psi.Ahl(), new C42788IwQ(2), C05F.A01);
        c38e.A07(reel, C3G2.A1B, interfaceC58290Psi, A1J, A1J, 0);
    }

    @Override // X.JHM
    public final void E2C(View view, InterfaceC73933Tf interfaceC73933Tf, IN1 in1, ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
        C14360o3.A0B(interfaceC73933Tf, 1);
        ViewOnTouchListenerC676833i viewOnTouchListenerC676833i = this.A05;
        if (viewOnTouchListenerC676833i != null && viewOnTouchListenerC676833i.isIdle()) {
            viewOnTouchListenerC676833i.EoL(view, interfaceC73933Tf, scaleGestureDetectorOnScaleGestureListenerC81153jk);
        }
    }

    @Override // X.JHM
    public final void F7v(View view, InterfaceC73933Tf interfaceC73933Tf, IN1 in1, ScaleGestureDetectorOnScaleGestureListenerC81153jk scaleGestureDetectorOnScaleGestureListenerC81153jk) {
    }

    private final void A00(String str) {
        Context context = this.A00.A00;
        AbstractC31171DnF.A1P(context);
        FragmentActivity fragmentActivity = (FragmentActivity) context;
        UserSession userSession = this.A01;
        InterfaceC60442pS interfaceC60442pS = this.A02;
        C14360o3.A0B(fragmentActivity, 0);
        C140966Yy A0P = AbstractC31173DnH.A0P(fragmentActivity, userSession);
        C28431Ze A02 = AbstractC31364DqT.A02();
        C31368DqX A0J = AbstractC37304Gc5.A0J(interfaceC60442pS, userSession, str, "shopping_lightbox");
        A0J.A0L = null;
        A0P.A0B(null, C31368DqX.A00(userSession, A02, A0J));
        A0P.A04();
    }

    @Override // X.JHL
    public final void DRE(C39350HZp c39350HZp) {
        User A2E = c39350HZp.A00.A2E(this.A01);
        if (A2E != null) {
            A00(A2E.getId());
        }
    }

    @Override // X.JHL
    public final void DRF(C39350HZp c39350HZp) {
        C140966Yy A0r;
        C38321qM c38321qM = c39350HZp.A01;
        boolean A09 = AbstractC82403m3.A09(c38321qM);
        String A00 = MSV.A00(0);
        if (!A09) {
            Context context = this.A00.A00;
            C14360o3.A0C(context, A00);
            UserSession userSession = this.A01;
            A0r = AbstractC31173DnH.A0P((FragmentActivity) context, userSession);
            IgFragmentFactoryImpl.A00();
            String id = c38321qM.getId();
            if (id != null) {
                C35028Fc1 c35028Fc1 = new C35028Fc1();
                c35028Fc1.A0B = id;
                c35028Fc1.A00 = c39350HZp.A00.A16(userSession);
                A0r.A0D(c35028Fc1.A02());
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else {
            C1XJ c1xj = C1XJ.A00;
            Context context2 = this.A00.A00;
            C14360o3.A0C(context2, A00);
            FragmentActivity fragmentActivity = (FragmentActivity) context2;
            UserSession userSession2 = this.A01;
            String id2 = c38321qM.getId();
            if (id2 != null) {
                int A16 = c39350HZp.A00.A16(userSession2);
                A0r = AbstractC25225BEi.A0r(fragmentActivity, userSession2);
                ((C1XI) c1xj).A00.A0T();
                Bundle A05 = AbstractC31178DnM.A05(userSession2);
                A05.putString("shopping_session_id", null);
                A05.putString("media_id", id2);
                A05.putInt("media_carousel_index", A16);
                A05.putString("permission_id", null);
                HCR hcr = new HCR();
                hcr.setArguments(A05);
                A0r.A0E(hcr);
                A0r.A08();
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        A0r.A04();
    }

    @Override // X.JHN
    public final void DpG(C39352HZr c39352HZr) {
        User A2E = c39352HZr.A00.A2E(this.A01);
        if (A2E != null) {
            A00(A2E.getId());
        }
    }

    @Override // X.JGQ
    public final void Dyl() {
        C5TA c5ta;
        this.A04.A02(C30R.A0B);
        INQ inq = this.A03;
        if (inq != null && (c5ta = inq.A01) != null) {
            c5ta.A03(-1);
        }
        this.A06.invoke();
    }

    public C42835IxB(C6FG c6fg, UserSession userSession, InterfaceC60442pS interfaceC60442pS, INQ inq, C4ZF c4zf, ViewOnTouchListenerC676833i viewOnTouchListenerC676833i, InterfaceC16820sZ interfaceC16820sZ) {
        this.A01 = userSession;
        this.A00 = c6fg;
        this.A02 = interfaceC60442pS;
        this.A05 = viewOnTouchListenerC676833i;
        this.A04 = c4zf;
        this.A03 = inq;
        this.A06 = interfaceC16820sZ;
    }
}
