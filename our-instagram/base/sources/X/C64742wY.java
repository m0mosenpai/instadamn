package X;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2wY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64742wY implements InterfaceC60602pj {
    public Activity A00;
    public C33I A01;
    public C125715mI A02;
    public Runnable A03;
    public boolean A04;
    public final UserSession A06;
    public final Map A08;
    public final HashMap A07 = new HashMap();
    public final Handler A05 = new Handler(Looper.getMainLooper());

    public final void A02(C125715mI c125715mI, String str) {
        String str2;
        C14360o3.A0B(c125715mI, 0);
        AbstractC54912fq.A00();
        C31212Dnv A00 = AbstractC31211Dnu.A00(this.A06);
        C18920wW A01 = AbstractC12220kQ.A01(A00, A00.A00);
        InterfaceC02590Ai A002 = A01.A00(A01.A00, "ig_qp_tooltip_clash");
        QPTooltipAnchor qPTooltipAnchor = c125715mI.A00;
        if (A002.isSampled()) {
            if (qPTooltipAnchor == null || (str2 = qPTooltipAnchor.A00) == null) {
                str2 = "unknown";
            }
            A002.AAP(AbstractC111324zv.A00(2937), str2);
            A002.AAP(AbstractC111324zv.A00(2938), c125715mI.A0D);
            A002.AAP("native_anchor_id", str);
            A002.Cht();
        }
    }

    public final boolean A03(C4NL c4nl) {
        View view;
        if (c4nl == null) {
            return false;
        }
        Reference reference = (Reference) this.A07.get(((C125715mI) c4nl).A00);
        return reference != null && (view = (View) reference.get()) != null && view.isAttachedToWindow() && view.getVisibility() == 0;
    }

    public final boolean A04(C4NL c4nl) {
        String str;
        if (c4nl == null) {
            return false;
        }
        C125715mI c125715mI = (C125715mI) c4nl;
        return (this.A08.get(c125715mI.A00) == null || (str = c125715mI.A02) == null || str.length() == 0) ? false : true;
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final void D8S(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final void onViewStateRestored(Bundle bundle) {
    }

    public final void A00(View view, QPTooltipAnchor qPTooltipAnchor, InterfaceC55362gb interfaceC55362gb) {
        if (view != null) {
            this.A07.put(qPTooltipAnchor, new WeakReference(view));
            C125715mI c125715mI = this.A02;
            if (!this.A04 && c125715mI != null && A04(c125715mI) && A03(c125715mI)) {
                A01(interfaceC55362gb, c125715mI);
            }
        }
    }

    public final void A01(InterfaceC55362gb interfaceC55362gb, C125715mI c125715mI) {
        if (c125715mI != null && A04(c125715mI) && A03(c125715mI)) {
            InterfaceC64682wS interfaceC64682wS = (InterfaceC64682wS) this.A08.get(c125715mI.A00);
            if (interfaceC64682wS != null) {
                this.A04 = true;
                RunnableC36958GQb runnableC36958GQb = new RunnableC36958GQb(interfaceC64682wS, interfaceC55362gb, c125715mI, this);
                this.A03 = runnableC36958GQb;
                this.A05.postDelayed(runnableC36958GQb, interfaceC64682wS.EM4());
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("showQuickPromotion() should not be called unless it is eligible and has an anchor view.");
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A07.clear();
        this.A02 = null;
        Runnable runnable = this.A03;
        if (runnable != null) {
            this.A05.removeCallbacks(runnable);
            this.A03 = null;
            this.A04 = false;
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        Runnable runnable = this.A03;
        if (runnable != null) {
            this.A05.removeCallbacks(runnable);
            this.A03 = null;
            this.A04 = false;
        }
    }

    public C64742wY(UserSession userSession, Map map) {
        this.A06 = userSession;
        this.A08 = map;
    }
}
