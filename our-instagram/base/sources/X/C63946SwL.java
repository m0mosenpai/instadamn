package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.lite.webview.SystemWebView;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.SwL, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63946SwL implements InterfaceViewOnTouchListenerC65624Tpk {
    public QF6 A00;
    public InterfaceC65575Tn9 A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Bundle A07;
    public final View A08;
    public final FragmentActivity A09;
    public final InterfaceC11380iw A0A;
    public final UserSession A0B;
    public final C38321qM A0C;
    public final SCY A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final Map A0J;

    public C63946SwL(Bundle bundle, View view, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, String str, String str2, String str3, String str4, String str5) {
        C14360o3.A0B(userSession, 6);
        this.A0G = str;
        this.A0F = str2;
        this.A0E = str3;
        this.A0I = str4;
        this.A0C = c38321qM;
        this.A0B = userSession;
        this.A09 = fragmentActivity;
        this.A0A = interfaceC11380iw;
        this.A0H = str5;
        this.A08 = view;
        this.A07 = bundle;
        this.A02 = str;
        this.A0D = new SCY(this);
        this.A0J = AbstractC06930Yk.A06(AbstractC166987dD.A1L(EnumC61217RhH.BLOKS_CONTENT_ITEM, new Object()), AbstractC166987dD.A1L(EnumC61217RhH.GEN_AI_REVIEWS_SUMMARY, new Object()), AbstractC166987dD.A1L(EnumC61217RhH.PROMO_ADS, new Object()), AbstractC166987dD.A1L(EnumC61217RhH.REMINDER_ADS, new Object()), AbstractC166987dD.A1L(EnumC61217RhH.PRODUCT_RECOMMENDER, new Object()), AbstractC166987dD.A1L(EnumC61217RhH.METADATA, new Object()));
    }

    @Override // X.BEG
    public final void Cxb(Fragment fragment) {
    }

    @Override // X.BEG
    public final void D0T() {
    }

    @Override // X.BCM
    public final void DFB(Context context, Intent intent, View view, InterfaceC172717mh interfaceC172717mh, InterfaceC65594Tnc interfaceC65594Tnc, InterfaceC172727mi interfaceC172727mi) {
    }

    @Override // X.BEG
    public final boolean DJw() {
        return false;
    }

    @Override // X.BEG
    public final boolean DK1(Intent intent, String str) {
        return false;
    }

    @Override // X.InterfaceC65639Tq2
    public final void DPh(QF6 qf6, String str) {
    }

    @Override // X.InterfaceC65639Tq2
    public final void DXW(QF6 qf6, long j) {
    }

    @Override // X.BEG
    public final void DXq(boolean z) {
    }

    @Override // X.BEG
    public final void Dkz(String str) {
    }

    @Override // X.InterfaceC65639Tq2
    public final void DuA(MotionEvent motionEvent, View view) {
    }

    @Override // X.InterfaceC65639Tq2
    public final boolean Eir(QF6 qf6, String str) {
        return false;
    }

    @Override // X.InterfaceC65639Tq2
    public final void FE3(QF6 qf6) {
    }

    @Override // X.BCM
    public final void destroy() {
    }

    @Override // X.InterfaceC65639Tq2
    public final String getUrl() {
        return "";
    }

    @Override // X.BEG
    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC65639Tq2
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        QF6 qf6;
        R7V r7v;
        InterfaceC65575Tn9 interfaceC65575Tn9;
        View B7m;
        float f = i - i3;
        float f2 = i2 - i4;
        if (!this.A06 && !this.A04 && !this.A05 && Math.abs(f) <= Math.abs(f2) && (qf6 = this.A00) != null && (r7v = ((SystemWebView) qf6).A04) != null && (interfaceC65575Tn9 = this.A01) != null && (B7m = interfaceC65575Tn9.B7m()) != null) {
            if (f2 < 0.0f) {
                A01(r7v, B7m, this, 250L);
            } else {
                A00(r7v, B7m);
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }

    private final void A00(View view, View view2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (this.A03) {
            this.A03 = false;
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, view2.getHeight());
            translateAnimation.setDuration(250L);
            AbstractC58320PtC.A1H(translateAnimation);
            int A00 = AnimationAnimationListenerC63519Som.A00(view2, translateAnimation, this, 1);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            C50797McE c50797McE = new C50797McE(view, marginLayoutParams, A00, 0, 0);
            c50797McE.setDuration(250L);
            view.startAnimation(c50797McE);
        }
    }

    public static final void A01(View view, View view2, C63946SwL c63946SwL, long j) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (!c63946SwL.A03) {
            c63946SwL.A03 = true;
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, view2.getHeight(), 0.0f);
            translateAnimation.setDuration(j);
            AbstractC58320PtC.A1H(translateAnimation);
            int A00 = AnimationAnimationListenerC63519Som.A00(view2, translateAnimation, c63946SwL, 1);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = null;
            }
            C50797McE c50797McE = new C50797McE(view, marginLayoutParams, 0, A00, 0);
            c50797McE.setDuration(j);
            view.startAnimation(c50797McE);
        }
    }

    @Override // X.InterfaceC65639Tq2
    public final void DBE(QF6 qf6) {
        R7V r7v = ((SystemWebView) qf6).A04;
        if (r7v != null) {
            boolean canScrollVertically = r7v.canScrollVertically(-1);
            boolean z = true;
            boolean canScrollVertically2 = r7v.canScrollVertically(1);
            if (canScrollVertically || canScrollVertically2) {
                z = false;
            }
            this.A06 = z;
        }
    }

    @Override // X.BEG
    public final void DnJ(boolean z, int i, boolean z2, boolean z3, boolean z4) {
        QF6 qf6;
        R7V r7v;
        InterfaceC65575Tn9 interfaceC65575Tn9;
        View B7m;
        this.A04 = z2;
        this.A05 = z4;
        if ((z == z2 && z3 == z4) || (qf6 = this.A00) == null || (r7v = ((SystemWebView) qf6).A04) == null || (interfaceC65575Tn9 = this.A01) == null || (B7m = interfaceC65575Tn9.B7m()) == null) {
            return;
        }
        if (!this.A04 && !this.A05) {
            if (!z && !z3) {
                return;
            }
            A01(r7v, B7m, this, 0L);
            return;
        }
        A00(r7v, B7m);
    }

    @Override // X.InterfaceViewOnTouchListenerC65624Tpk
    public final void DxX(String str) {
        if (str != null && !str.equals(this.A02)) {
            this.A02 = str;
            InterfaceC65575Tn9 interfaceC65575Tn9 = this.A01;
            if (interfaceC65575Tn9 != null) {
                interfaceC65575Tn9.Dx8("current_url", str);
            }
        }
    }

    @Override // X.InterfaceC65639Tq2
    public final void Cso(QF6 qf6) {
        this.A00 = qf6;
    }
}
