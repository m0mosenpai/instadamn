package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IGAdsIABScreenshotDataDict;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;

/* renamed from: X.39C, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C39C implements C39D, InterfaceC60602pj {
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final Context A04;
    public final Fragment A05;
    public final UserSession A06;
    public final InterfaceC60442pS A07;
    public final C33P A08;
    public final C1M1 A09;
    public final ViewOnTouchListenerC60632pm A0A;
    public final InterfaceC60682pr A0B;
    public final C39B A0C;
    public final InterfaceC09390do A0D;

    /* JADX WARN: Multi-variable type inference failed */
    public C39C(Fragment fragment, ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C33P c33p, InterfaceC60682pr interfaceC60682pr, C1M1 c1m1, C39B c39b) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(fragment, 2);
        C14360o3.A0B(interfaceC60442pS, 3);
        C14360o3.A0B(c1m1, 4);
        this.A06 = userSession;
        this.A05 = fragment;
        this.A07 = interfaceC60442pS;
        this.A09 = c1m1;
        this.A0B = interfaceC60682pr;
        this.A0A = viewOnTouchListenerC60632pm;
        this.A08 = c33p;
        this.A0C = c39b;
        this.A0D = AbstractC09440dt.A01(new C9EJ(this, 38));
        this.A04 = fragment.requireContext();
        this.A00 = 3;
        if (fragment instanceof InterfaceC59992oh) {
            ((InterfaceC59992oh) fragment).registerLifecycleListener(this);
        }
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.C39D
    public final Integer BEZ(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        IAR A02 = C86833tv.A02(A01(), this.A06, c38321qM, this.A07, this.A0C, C05F.A01);
        if (A02 instanceof C39447HbZ) {
            return Integer.valueOf(((C39447HbZ) A02).A03);
        }
        return null;
    }

    @Override // X.C39D
    public final C39447HbZ CHF(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        UserSession userSession = this.A06;
        InterfaceC60442pS interfaceC60442pS = this.A07;
        IAR A02 = C86833tv.A02(A01(), userSession, c38321qM, interfaceC60442pS, this.A0C, C05F.A01);
        if (A02 instanceof C39447HbZ) {
            return (C39447HbZ) A02;
        }
        return null;
    }

    @Override // X.C39D
    public final void Co3() {
    }

    @Override // X.C39D
    public final void CpJ(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        C86833tv.A04(this.A06, c38321qM, this.A07, null, AbstractC111324zv.A00(2844), "dismiss");
        C3DN A00 = C3DN.A00.A00(A01());
        if (A00 != null) {
            A00.A0T(C05F.A00);
        }
    }

    @Override // X.C39D
    public final void Cxo(C38321qM c38321qM, C75113Zb c75113Zb) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        C33P c33p = this.A08;
        if (c33p != null) {
            c33p.A0G.A0T(c38321qM, c75113Zb, -3);
        }
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.C39D
    public final boolean E2P(View view, C38321qM c38321qM, IKE ike, C75113Zb c75113Zb, C39447HbZ c39447HbZ) {
        C40971v4 c40971v4;
        String str;
        boolean z;
        IGAdsIABScreenshotDataDict iGAdsIABScreenshotDataDict;
        C14360o3.A0B(c38321qM, 1);
        C14360o3.A0B(c75113Zb, 2);
        try {
            c40971v4 = AbstractC40881uv.A00(c38321qM);
        } catch (NullPointerException unused) {
            c40971v4 = null;
        }
        FragmentActivity A01 = A01();
        UserSession userSession = this.A06;
        AndroidLink A02 = AbstractC905941u.A02(A01, userSession, c38321qM, 0, false);
        if (A02 != null) {
            str = A02.CHN();
        } else {
            str = null;
        }
        if (c40971v4 != null && str != null) {
            boolean A0K = C14360o3.A0K(c39447HbZ.A07, AbstractC111324zv.A00(2296));
            C63397SjR c63397SjR = new C63397SjR(A01(), userSession, C2Fb.A4F, str, false);
            c63397SjR.A0z = true;
            c63397SjR.A0Z = c39447HbZ.A0J;
            c63397SjR.A0F = new J0P(c39447HbZ);
            c63397SjR.A0l = c39447HbZ.A0C;
            c63397SjR.A1E = c39447HbZ.A0D;
            c63397SjR.A18 = true;
            c63397SjR.A0c = false;
            c63397SjR.A11 = true;
            c63397SjR.A0f = c39447HbZ.A0K;
            c63397SjR.A03 = c39447HbZ.A02;
            c63397SjR.A0q = true;
            boolean z2 = c39447HbZ.A0G;
            RiS riS = RiS.WATCH_WITH_OVERLAY;
            c63397SjR.A0s = z2;
            c63397SjR.A09 = riS;
            c63397SjR.A0x = c39447HbZ.A0H;
            c63397SjR.A1A = A0K;
            c63397SjR.A16 = A0K;
            c63397SjR.A0G = new C43015J0g(c38321qM, this, ike, c75113Zb);
            c63397SjR.A0y = c39447HbZ.A0I;
            c63397SjR.A0J = new C39395Haf(c38321qM, this, ike);
            c63397SjR.A12 = true;
            c63397SjR.A0D(c40971v4.A0j);
            c63397SjR.A0B(c40971v4.A0S);
            c63397SjR.A0C(c38321qM.getId());
            c63397SjR.A0F(userSession.token);
            if (c39447HbZ.A0B) {
                c63397SjR.A0k = true;
                c63397SjR.A01 = c39447HbZ.A01;
            }
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36323676588617194L) && C18U.A06(c06090Tz, userSession, 36318123198978008L)) {
                InterfaceC39541sb injected = c38321qM.A0C.getInjected();
                if (injected != null) {
                    iGAdsIABScreenshotDataDict = injected.BFN();
                } else {
                    iGAdsIABScreenshotDataDict = null;
                }
                c63397SjR.A0E = iGAdsIABScreenshotDataDict;
            }
            C71313Hs A00 = C71313Hs.A00(userSession);
            InterfaceC60442pS interfaceC60442pS = this.A07;
            Context context = view.getContext();
            C14360o3.A07(context);
            A00.A0A(view, new C79623hD(new C86933u7(context, c75113Zb, userSession, c38321qM), userSession, c38321qM, interfaceC60442pS));
            C71313Hs.A00(userSession).A0B(view, new String[0]);
            c63397SjR.A0A();
            this.A00 = 3;
            this.A02 = true;
            String obj = C2Fb.A2S.toString();
            String CHN = A02.CHN();
            C5SE c5se = new C5SE(userSession, c40971v4, c75113Zb.A06());
            String sessionId = this.A09.getSessionId();
            Float valueOf = Float.valueOf(-1.0f);
            C32U.A0L(userSession, c5se, c38321qM, interfaceC60442pS, valueOf, valueOf, obj, "webclick", CHN, sessionId, AbstractC75103Za.A09(c38321qM, c75113Zb), AbstractC75103Za.A0A(c75113Zb));
            z = this.A02;
            if (z) {
                A00(c38321qM, this, c75113Zb, true);
                return z;
            }
        } else {
            EnumC12410kj enumC12410kj = EnumC12410kj.A03;
            StringBuilder sb = new StringBuilder();
            sb.append("Ad or Link is null: Ad = ");
            sb.append(c40971v4);
            sb.append(" , link = ");
            sb.append(str);
            C0w9.A01(enumC12410kj, "WatchAndBrowse#Browser", sb.toString());
            z = false;
        }
        Integer num = C05F.A01;
        if (c75113Zb.A13 != num) {
            c75113Zb.A13 = num;
            C75113Zb.A00(c75113Zb, 50);
            return z;
        }
        return z;
    }

    @Override // X.C39D
    public final void EV7(int i, ViewGroup viewGroup) {
        FrameLayout.LayoutParams layoutParams;
        View childAt = viewGroup.getChildAt(0);
        ViewGroup.LayoutParams layoutParams2 = null;
        if (childAt != null) {
            layoutParams2 = childAt.getLayoutParams();
        }
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
            layoutParams.gravity = i;
        }
    }

    @Override // X.C39D
    public final boolean EmG(View view, int i) {
        C3FQ c3fq;
        C3FQ c3fq2;
        C33P c33p = this.A08;
        if (c33p != null && (c3fq = c33p.A03) != null && c3fq.BMa(view) != -1) {
            int BMa = c3fq.BMa(view);
            if (Integer.valueOf(BMa) != null && (c3fq2 = c33p.A03) != null) {
                c3fq2.EmF(BMa, i, 150);
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0043, code lost:
    
        if (r10.A00 == 4) goto L21;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x001b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    @Override // X.C39D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Epd(X.C38321qM r11, X.C38620GyN r12, X.C39447HbZ r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39C.Epd(X.1qM, X.GyN, X.HbZ, java.lang.String):void");
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroyView() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final void A00(C38321qM c38321qM, C39C c39c, C75113Zb c75113Zb, boolean z) {
        C30E c30e;
        C33P c33p = c39c.A08;
        if (c33p != null && (c30e = c33p.A0G) != null) {
            c30e.A08 = z;
        }
        UserSession userSession = c39c.A06;
        if (AbstractC24321Hb.A00(userSession).A01 == null && C4S5.A00(userSession, c38321qM, c75113Zb) && c33p != null) {
            c33p.A0G.A0T(c38321qM, c75113Zb, -7);
        }
    }

    public final FragmentActivity A01() {
        Object value = this.A0D.getValue();
        C14360o3.A07(value);
        return (FragmentActivity) value;
    }

    @Override // X.C39D
    public final void AAu(int i) {
        Integer num;
        C4S6 c4s6;
        C3Y7 c3y7;
        C3W4 Adr;
        FrameLayout A00;
        C33P c33p = this.A08;
        if (c33p != null) {
            C30E c30e = c33p.A0G;
            C75113Zb A0H = c30e.A0H();
            if (A0H != null) {
                num = A0H.A13;
            } else {
                num = null;
            }
            if (num == C05F.A00 && (c4s6 = c30e.A02) != null && (c3y7 = c4s6.A08) != null && (Adr = c3y7.Adr()) != null && (A00 = Adr.A00()) != null) {
                AbstractC13880nE.A0Y(A00, i);
            }
        }
    }

    @Override // X.C39D
    public final int AF7(int i, int i2) {
        Context context = this.A04;
        return ((AbstractC13890nF.A00(context) - i) - AbstractC53242c7.A0G(context, AbstractC57322k7.A01(this.A06))) - i2;
    }

    @Override // X.C39D
    public final int AFK(int i) {
        Context context = this.A04;
        return ((AbstractC13890nF.A00(context) - i) - AbstractC53242c7.A0G(context, AbstractC57322k7.A01(this.A06))) / 2;
    }

    @Override // X.C39D
    public final void AIN() {
        ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A0A;
        if (viewOnTouchListenerC60632pm != null) {
            viewOnTouchListenerC60632pm.A0C = true;
        }
    }

    @Override // X.C39D
    public final int APz(View view, C3FP c3fp) {
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        RectF rectF = AbstractC13880nE.A01;
        AbstractC13880nE.A0M(rectF, view);
        rectF.round(rect);
        c3fp.BA7(rect2);
        int i = rect.top - rect2.top;
        if (C18U.A06(C06090Tz.A05, this.A06, 36317534785639767L)) {
            return i - C57992lC.A01();
        }
        return i;
    }

    @Override // X.C39D
    public final void ATf() {
        C3DN A00 = C3DN.A00.A00(A01());
        if (A00 != null) {
            A00.A0B();
        }
    }

    @Override // X.C39D
    public final void ATo() {
        C3DN A00 = C3DN.A00.A00(A01());
        if (A00 != null) {
            A00.A0U(C05F.A04);
        }
    }

    @Override // X.C39D
    public final float AiS(int i) {
        float f;
        C3DN A00 = C3DN.A00.A00(A01());
        if (A00 != null) {
            ViewOnTouchListenerC65896Tw0 viewOnTouchListenerC65896Tw0 = ((C3DP) A00).A0D;
            if (viewOnTouchListenerC65896Tw0 != null) {
                f = viewOnTouchListenerC65896Tw0.A0E(i);
            } else {
                f = 0.0f;
            }
            if (Float.valueOf(f) != null) {
                return f;
            }
        }
        return 0.0f;
    }

    @Override // X.C39D
    public final Integer B31(C39447HbZ c39447HbZ) {
        if (c39447HbZ != null) {
            return Integer.valueOf(c39447HbZ.A04);
        }
        return null;
    }

    @Override // X.C39D
    public final Integer B34() {
        return Integer.valueOf(AbstractC13890nF.A01(this.A04));
    }

    @Override // X.C39D
    public final View B8W() {
        C33P c33p = this.A08;
        if (c33p != null) {
            return c33p.A00;
        }
        return null;
    }

    @Override // X.C39D
    public final boolean CQs() {
        return this.A01;
    }

    @Override // X.C39D
    public final boolean CQt() {
        return this.A02;
    }

    @Override // X.C39D
    public final void EmC(C3FP c3fp, int i, int i2) {
        c3fp.A03.A0y(new LinearInterpolator(), 0, i, i2, false);
    }

    @Override // X.InterfaceC60682pr
    public final C3FQ getScrollingViewProxy() {
        InterfaceC60682pr interfaceC60682pr = this.A0B;
        if (interfaceC60682pr != null) {
            return interfaceC60682pr.getScrollingViewProxy();
        }
        return null;
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroy() {
        InterfaceC08430c6 interfaceC08430c6 = this.A05;
        if (interfaceC08430c6 instanceof InterfaceC59992oh) {
            ((InterfaceC59992oh) interfaceC08430c6).unregisterLifecycleListener(this);
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        if (this.A02 && !this.A01) {
            ATf();
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        if (this.A02) {
            C56352iT.A0t.A03(A01()).EkF(false);
        }
    }
}
