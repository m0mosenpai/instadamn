package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Wd3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70569Wd3 implements InterfaceC60122ou, InterfaceC60152ox, C06N {
    public static final C55942hf A0J = C55942hf.A01();
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public ViewOutlineProvider A06;
    public boolean A08;
    public final float A09;
    public final View A0A;
    public final ViewGroup A0B;
    public final ViewGroup A0C;
    public final C06K A0D;
    public final AbstractC10360h2 A0E;
    public final UserSession A0F;
    public final GestureDetectorOnGestureListenerC71060WnF A0G;
    public final InterfaceC60082oq A0H;
    public final boolean A0I;
    public float A00 = 0.0f;
    public Integer A07 = C05F.A01;

    public final void A06(boolean z) {
        if (!z) {
            this.A0G.A03(true, 0.0f);
        }
        this.A0A.setImportantForAccessibility(1);
        this.A0H.DCM();
    }

    public static void A00(C70569Wd3 c70569Wd3, float f) {
        ViewGroup viewGroup = c70569Wd3.A0C;
        c70569Wd3.A0B.setLayoutParams(new FrameLayout.LayoutParams(-1, (int) Math.max(viewGroup.getHeight() * f, viewGroup.getHeight() * c70569Wd3.A00)));
    }

    public final void A01() {
        AbstractC10360h2 abstractC10360h2 = this.A0E;
        if (abstractC10360h2.A0O(R.id.fragment_container) != null && !abstractC10360h2.A11()) {
            try {
                abstractC10360h2.A12();
            } catch (Exception unused) {
                C0w9.A03("FragmentDrawerController", "removeCurrentDrawerFragment failed");
            }
        }
    }

    public final void A02() {
        GestureDetectorOnGestureListenerC71060WnF gestureDetectorOnGestureListenerC71060WnF = this.A0G;
        if (gestureDetectorOnGestureListenerC71060WnF != null) {
            gestureDetectorOnGestureListenerC71060WnF.A03(true, gestureDetectorOnGestureListenerC71060WnF.A0C.A01);
            this.A0H.DhK();
        }
    }

    public final void A03(Fragment fragment, boolean z, boolean z2) {
        this.A0B.post(new Wx7(fragment, this, z, z2));
    }

    public final void A04(Fragment fragment, boolean z, boolean z2) {
        AbstractC10360h2 abstractC10360h2 = this.A0E;
        if (!abstractC10360h2.A0G && C06P.A01(abstractC10360h2)) {
            C14240no c14240no = new C14240no(abstractC10360h2);
            c14240no.A0A(fragment, R.id.fragment_container);
            c14240no.A0I("drawer_back_stack");
            c14240no.A00();
            A00(this, this.A01);
            ViewGroup viewGroup = this.A0C;
            if (z2) {
                viewGroup.setVisibility(0);
                GestureDetectorOnGestureListenerC71060WnF gestureDetectorOnGestureListenerC71060WnF = this.A0G;
                gestureDetectorOnGestureListenerC71060WnF.A03(z, gestureDetectorOnGestureListenerC71060WnF.A0C.A01);
                abstractC10360h2.A0Z();
                this.A0A.setImportantForAccessibility(4);
                AbstractC56932jR.A05(viewGroup, 1000L);
                C06K c06k = this.A0D;
                if (c06k != null) {
                    abstractC10360h2.A0q(c06k, true);
                    return;
                }
                return;
            }
            viewGroup.setVisibility(0);
            abstractC10360h2.A0Z();
            this.A0A.setImportantForAccessibility(4);
            AbstractC56932jR.A05(viewGroup, 1000L);
        }
    }

    public final void A05(boolean z) {
        GestureDetectorOnGestureListenerC71060WnF gestureDetectorOnGestureListenerC71060WnF = this.A0G;
        if (gestureDetectorOnGestureListenerC71060WnF != null) {
            gestureDetectorOnGestureListenerC71060WnF.A03(z, 0.0f);
        }
        C06K c06k = this.A0D;
        if (c06k != null) {
            this.A0E.A0p(c06k);
        }
    }

    public final boolean A07(boolean z) {
        GestureDetectorOnGestureListenerC71060WnF gestureDetectorOnGestureListenerC71060WnF;
        C55982hj c55982hj;
        InterfaceC08430c6 A0O = this.A0E.A0O(R.id.fragment_container);
        if ((A0O instanceof InterfaceC60072op) && ((InterfaceC60072op) A0O).onBackPressed()) {
            return true;
        }
        if (C18U.A06(C06090Tz.A05, this.A0F, 36322250659801173L) && ((c55982hj = (gestureDetectorOnGestureListenerC71060WnF = this.A0G).A03) == null || (((float) c55982hj.A01) == 0.0f && ((float) c55982hj.A09.A00) == 0.0f && c55982hj.A0C()))) {
            gestureDetectorOnGestureListenerC71060WnF.A03(false, 0.0f);
            this.A0H.DCM();
            return true;
        }
        C55982hj c55982hj2 = this.A0G.A03;
        if (c55982hj2 == null || ((float) c55982hj2.A01) <= 0.0f || !z) {
            return false;
        }
        A05(true);
        return true;
    }

    @Override // X.C06N
    public final void onBackStackChanged() {
    }

    public C70569Wd3(View view, ViewGroup viewGroup, ViewGroup viewGroup2, C06K c06k, AbstractC10360h2 abstractC10360h2, UserSession userSession, C8SW c8sw, InterfaceC60082oq interfaceC60082oq, float f, float f2, boolean z) {
        this.A0A = view;
        this.A0E = abstractC10360h2;
        this.A0D = c06k;
        this.A0C = viewGroup;
        this.A0B = viewGroup2;
        this.A0H = interfaceC60082oq;
        this.A01 = f;
        this.A0F = userSession;
        this.A09 = f2;
        this.A0I = z;
        this.A06 = view.getOutlineProvider();
        this.A08 = view.getClipToOutline();
        GestureDetectorOnGestureListenerC71060WnF gestureDetectorOnGestureListenerC71060WnF = new GestureDetectorOnGestureListenerC71060WnF(viewGroup.getContext(), viewGroup2, viewGroup, c8sw, this);
        gestureDetectorOnGestureListenerC71060WnF.A07 = true;
        C55982hj c55982hj = gestureDetectorOnGestureListenerC71060WnF.A03;
        if (c55982hj != null) {
            c55982hj.A06 = true;
        }
        C55942hf c55942hf = A0J;
        if (c55982hj != null) {
            c55982hj.A09(c55942hf);
        }
        this.A0G = gestureDetectorOnGestureListenerC71060WnF;
        WO5.A00(viewGroup, 16, this);
        abstractC10360h2.A0r(this);
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
    }
}
