package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.DirectThreadThemeInfo;

/* renamed from: X.7Wn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164247Wn {
    public C3Se A02;
    public C3PR A03;
    public C7IM A04;
    public C2d4 A05;
    public String A06;
    public final AbstractC59962oe A07;
    public final C164307Wt A08;
    public final InterfaceC08830cm A09;
    public final InterfaceC08830cm A0A;
    public final InterfaceC08830cm A0B;
    public final InterfaceC08830cm A0C;
    public final InterfaceC08830cm A0D;
    public final UserSession A0E;
    public C66322U8v A01 = null;
    public ShapeDrawable A00 = null;

    public static void A00(Activity activity, Context context, View view, int i, boolean z) {
        View rootView;
        View findViewById;
        if (view != null && (rootView = view.getRootView()) != null && (findViewById = rootView.findViewById(R.id.thread_background_view)) != null) {
            if (!z) {
                int top = findViewById.getTop();
                if (i == -1) {
                    i = AbstractC56402iY.A01(activity);
                }
                int i2 = -i;
                if (top != i2) {
                    findViewById.setTop(i2);
                }
            }
            findViewById.setBottom(AbstractC13880nE.A06(context));
        }
    }

    public final Drawable A01(DirectThreadThemeInfo directThreadThemeInfo) {
        C7IH c7ih;
        Drawable drawable;
        String str;
        C7IM c7im = this.A04;
        C14360o3.A0B(this.A0D.get(), 2);
        if (directThreadThemeInfo != null && c7im != null && (drawable = (c7ih = c7im.A04).A0Q) != null && (str = directThreadThemeInfo.A0i) != null) {
            String str2 = c7ih.A0V;
            if (str.length() != 0 && str.equals(str2)) {
                return drawable;
            }
            int i = directThreadThemeInfo.A02;
            int i2 = c7ih.A08;
            if (i != 0 && i == i2) {
                return drawable;
            }
        }
        return null;
    }

    public final Drawable A02(DirectThreadThemeInfo directThreadThemeInfo) {
        C7IH c7ih;
        Drawable drawable;
        String str;
        C7IM c7im = this.A04;
        C14360o3.A0B(this.A0D.get(), 2);
        if (directThreadThemeInfo != null && c7im != null && (drawable = (c7ih = c7im.A04).A0R) != null && (str = directThreadThemeInfo.A0l) != null) {
            String str2 = c7ih.A0W;
            if (str.length() != 0 && str.equals(str2)) {
                return drawable;
            }
            int i = directThreadThemeInfo.A06;
            int i2 = c7ih.A0B;
            if (i != 0 && i == i2) {
                return drawable;
            }
        }
        return null;
    }

    public final void A04(final View view, final int i, final boolean z) {
        int A0G;
        AbstractC59962oe abstractC59962oe = this.A07;
        FragmentActivity activity = abstractC59962oe.getActivity();
        if (activity != null && view != null && this.A04 != null) {
            final View findViewById = view.getRootView().findViewById(R.id.thread_background_view);
            if (this.A06.equals("follow_button")) {
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                    return;
                }
                return;
            }
            if (findViewById == null) {
                return;
            }
            C7IH c7ih = this.A04.A04;
            TransitionDrawable transitionDrawable = c7ih.A0T;
            transitionDrawable.setCrossFadeEnabled(false);
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{transitionDrawable, c7ih.A0S});
            layerDrawable.setLayerInset(1, 0, 0, 0, AbstractC13880nE.A06(activity) - AbstractC56402iY.A01(activity));
            if (c7ih.A0U != null) {
                int i2 = c7ih.A00;
                int i3 = c7ih.A05;
                int A00 = AbstractC13890nF.A00(activity);
                C56352iT AYT = this.A05.AYT();
                if (AYT != null) {
                    A0G = AYT.AYS();
                } else {
                    A0G = AbstractC53242c7.A0G(findViewById.getContext(), R.attr.actionBarHeight);
                }
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                layerDrawable.addLayer(new GradientDrawable(orientation, new int[]{i2, 0}));
                int i4 = (A0G + i) - 1;
                int i5 = A00 / 2;
                layerDrawable.setLayerInset(2, 0, i4, 0, i5);
                layerDrawable.addLayer(new GradientDrawable(orientation, new int[]{0, i3}));
                layerDrawable.setLayerInset(3, 0, i5, 0, 0);
            }
            findViewById.setBackground(layerDrawable);
            this.A08.A00();
            A00(abstractC59962oe.requireActivity(), abstractC59962oe.requireContext(), view, i, z);
            AbstractC13880nE.A0s(findViewById, new Runnable() { // from class: X.7Lp
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z2 = z;
                    int i6 = i;
                    View view2 = view;
                    AbstractC59962oe abstractC59962oe2 = this.A07;
                    C164247Wn.A00(abstractC59962oe2.requireActivity(), abstractC59962oe2.requireContext(), view2, i6, z2);
                    AbstractC13880nE.A0s(findViewById, this);
                }
            });
            View findViewById2 = activity.findViewById(R.id.layout_container_parent);
            if (!(findViewById2 instanceof CoordinatorLayout)) {
                return;
            }
            ((CoordinatorLayout) findViewById2).setStatusBarBackground(null);
        }
    }

    public final void A05(C7IM c7im) {
        this.A04 = c7im;
        ((C7U0) this.A09.get()).BDF().Dsm(c7im.A04);
    }

    public final boolean A06() {
        DirectThreadThemeInfo directThreadThemeInfo;
        C7IM c7im = this.A04;
        if (c7im != null && (directThreadThemeInfo = c7im.A08) != null && (!AnonymousClass483.A04(directThreadThemeInfo.A0s)) && (!AnonymousClass483.A04(directThreadThemeInfo.A0q))) {
            if (AbstractC125795mU.A0g.contains(this.A04.A09) || ((Boolean) ((AnonymousClass988) this.A0D.get()).A03.getValue()).booleanValue()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C164247Wn(C2d4 c2d4, AbstractC59962oe abstractC59962oe, UserSession userSession, String str, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, InterfaceC08830cm interfaceC08830cm3, InterfaceC08830cm interfaceC08830cm4, InterfaceC08830cm interfaceC08830cm5, InterfaceC08830cm interfaceC08830cm6) {
        this.A0E = userSession;
        this.A07 = abstractC59962oe;
        this.A06 = str;
        this.A0D = interfaceC08830cm;
        this.A0B = interfaceC08830cm3;
        this.A0A = interfaceC08830cm4;
        this.A0C = interfaceC08830cm5;
        this.A08 = new C164307Wt(abstractC59962oe, (AnonymousClass988) interfaceC08830cm.get(), new InterfaceC16820sZ() { // from class: X.7Wo
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                boolean z;
                C164247Wn c164247Wn = C164247Wn.this;
                C3PR c3pr = c164247Wn.A03;
                if (c164247Wn.A04 != null && (c164247Wn.A06() || (c3pr != null && ((Boolean) ((AnonymousClass988) c164247Wn.A0D.get()).A04.getValue()).booleanValue()))) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }, new InterfaceC16820sZ() { // from class: X.7Wp
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return C164247Wn.this.A01;
            }
        }, new InterfaceC16820sZ() { // from class: X.7Wq
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return C164247Wn.this.A00;
            }
        }, new InterfaceC16820sZ() { // from class: X.7Wr
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return Boolean.valueOf(C164247Wn.this.A06());
            }
        }, new C164297Ws(interfaceC08830cm6));
        this.A09 = interfaceC08830cm2;
        this.A05 = c2d4;
    }

    public final Integer A03(InterfaceC163837Ux interfaceC163837Ux) {
        if (interfaceC163837Ux.CTV() && interfaceC163837Ux.CWO()) {
            return C05F.A0N;
        }
        if (C6X6.A08(this.A0E, interfaceC163837Ux.C7W())) {
            return C05F.A0Y;
        }
        return C05F.A00;
    }
}
