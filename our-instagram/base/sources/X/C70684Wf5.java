package X;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.discovery.mediamap.fragment.MapBottomSheetController;
import com.instagram.discovery.mediamap.fragment.MediaMapFragment;
import java.util.List;

/* renamed from: X.Wf5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70684Wf5 implements InterfaceC11380iw, InterfaceC1119253e, XEB {
    public static final String __redex_internal_original_name = "MapChromeController";
    public long A00;
    public ViewTreeObserver.OnPreDrawListener A01;
    public C66305U8d A02;
    public C4I7 A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Activity A08;
    public final View A0A;
    public final View A0B;
    public final View A0C;
    public final FrameLayout A0D;
    public final FrameLayout A0E;
    public final ImageView A0F;
    public final ImageView A0G;
    public final UserSession A0H;
    public final WXa A0I;
    public final MapBottomSheetController A0J;
    public final MediaMapFragment A0K;
    public final C69800Vvm A0N;
    public final C55014OWb A0O;
    public final boolean A0Q;
    public final C55982hj A0R;
    public final TFA A0S;
    public final Handler A09 = AbstractC167007dF.A0J();
    public final Runnable A0P = new RunnableC71353WsO(this);
    public final MQC A0M = new C70966WlD(this, 1);
    public final InterfaceC127465pP A0L = new C70963WlA(this, 1);

    public final boolean A07() {
        boolean A07;
        int i;
        UserSession userSession = this.A0H;
        if (C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36318015823550256L)) {
            A07 = FA6.A00(userSession).A00(this.A08, C4IB.A05, "DISCOVERY_MAP", AbstractC166987dD.A1J(C4I9.UNKNOWN)).A01;
        } else {
            Activity activity = this.A08;
            A07 = AbstractC23451Ch.A07(activity, "android.permission.ACCESS_FINE_LOCATION");
            C4I7 A00 = A00(activity, userSession, this);
            Long A002 = C4I8.A00(userSession);
            if (A07) {
                i = 918;
            } else {
                i = 917;
            }
            A00.A00(new C9CH(C4IA.A08, C4IB.A05), A002, MSV.A00(i), "DISCOVERY_MAP", null, AbstractC166987dD.A1J(C4I9.UNKNOWN));
        }
        if (!A07) {
            return false;
        }
        this.A04 = true;
        this.A07 = true;
        Location A003 = this.A0S.A00(__redex_internal_original_name);
        if (A003 == null) {
            return true;
        }
        A06(A003);
        return true;
    }

    @Override // X.XEB
    public final void D05(MapBottomSheetController mapBottomSheetController) {
    }

    @Override // X.XEB
    public final void D07(MapBottomSheetController mapBottomSheetController) {
    }

    @Override // X.XEB
    public final void D0B(MapBottomSheetController mapBottomSheetController, float f) {
    }

    @Override // X.XEB
    public final void D0C(MapBottomSheetController mapBottomSheetController) {
    }

    @Override // X.InterfaceC1119253e
    public final boolean DBd(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX, float f, float f2) {
        return true;
    }

    @Override // X.InterfaceC1119253e
    public final void DBv(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX, float f, float f2, float f3, boolean z) {
    }

    @Override // X.InterfaceC1119253e
    public final void DC2(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX, float f, float f2, float f3, float f4, float f5) {
        if (f5 < 0.0f) {
            this.A0K.A0G();
        }
    }

    @Override // X.InterfaceC1119253e
    public final boolean DC9(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX, float f, float f2, float f3, float f4, boolean z) {
        return true;
    }

    @Override // X.InterfaceC1119253e
    public final void Dwn(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C4I7 A00(Activity activity, UserSession userSession, C70684Wf5 c70684Wf5) {
        C4I7 c4i7 = c70684Wf5.A03;
        if (c4i7 == null) {
            if (activity instanceof InterfaceC11380iw) {
                c4i7 = new C4I7((InterfaceC11380iw) activity, userSession);
            } else {
                c4i7 = new C4I7(c70684Wf5, userSession);
            }
            c70684Wf5.A03 = c4i7;
        }
        return c4i7;
    }

    public static void A02(C70684Wf5 c70684Wf5) {
        float translationY;
        if (c70684Wf5.A0C.getVisibility() == 0) {
            View view = c70684Wf5.A0J.mBottomSheet;
            if (view == null) {
                translationY = 0.0f;
            } else {
                translationY = view.getTranslationY() + r1.A00;
            }
            c70684Wf5.A0G.setTranslationY(AbstractC13600mm.A00(translationY - r5.getHeight(), AbstractC56402iY.A01(c70684Wf5.A08), (c70684Wf5.A0E.getHeight() / 2) - (r5.getHeight() / 2.0f)));
        }
    }

    public final void A03() {
        Activity activity = this.A08;
        Window window = activity.getWindow();
        window.getClass();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        window.getDecorView().setSystemUiVisibility(1280);
        C30D.A06(activity, true);
        AbstractC56402iY.A06(activity, true);
    }

    public final void A04() {
        WXa wXa = this.A0I;
        wXa.A00.setVisibility(8);
        View view = wXa.A02;
        CircularImageView A0U = AbstractC31176DnK.A0U(view, R.id.right_image);
        wXa.A00 = A0U;
        A0U.setVisibility(0);
        wXa.A00.setVisibility(0);
        AbstractC166997dE.A19(wXa.A03.getContext(), wXa.A00, R.drawable.instagram_chevron_right_pano_outline_12);
        wXa.A05.setText(2131956283);
        WNU.A00(view, 17, this);
        wXa.A04.A03();
    }

    public final void A05() {
        if (!this.A06 && AbstractC23451Ch.A07(this.A08, "android.permission.ACCESS_FINE_LOCATION")) {
            this.A0N.A07();
            this.A06 = true;
        }
    }

    public final void A06(Location location) {
        C69800Vvm c69800Vvm = this.A0N;
        c69800Vvm.A04.invalidate();
        if (!this.A06) {
            A05();
        }
        if (this.A07) {
            c69800Vvm.A0A(location.getLatitude(), location.getLongitude(), 15.0f);
            if (this.A04) {
                this.A0K.A0F();
                this.A04 = false;
            }
            this.A07 = false;
        }
    }

    @Override // X.XEB
    public final void D0A(MapBottomSheetController mapBottomSheetController, float f, float f2, float f3, float f4) {
        double d;
        C55982hj c55982hj = this.A0R;
        if (f2 == 1.0f) {
            d = 1.0d;
        } else {
            d = 0.0d;
        }
        c55982hj.A06(d);
        A02(this);
        C66305U8d c66305U8d = this.A02;
        if (c66305U8d != null) {
            c66305U8d.A09 = true;
            C66305U8d.A05(c66305U8d);
        }
    }

    @Override // X.InterfaceC1119253e
    public final boolean Dmo(GestureDetectorOnGestureListenerC148016lX gestureDetectorOnGestureListenerC148016lX, float f, float f2) {
        this.A0K.A0G();
        return true;
    }

    public C70684Wf5(Activity activity, ViewGroup viewGroup, UserSession userSession, TFA tfa, MapBottomSheetController mapBottomSheetController, MediaMapFragment mediaMapFragment, C69800Vvm c69800Vvm) {
        this.A08 = activity;
        this.A0H = userSession;
        this.A0E = (FrameLayout) viewGroup.requireViewById(R.id.map_container);
        this.A0J = mapBottomSheetController;
        this.A0S = tfa;
        this.A0N = c69800Vvm;
        FrameLayout frameLayout = (FrameLayout) viewGroup.requireViewById(R.id.controls_container);
        this.A0D = frameLayout;
        this.A0C = viewGroup.requireViewById(R.id.missing_location_chrome_container);
        this.A0G = (ImageView) viewGroup.requireViewById(R.id.map_missing_location_annotation);
        this.A0F = (ImageView) viewGroup.requireViewById(R.id.map_blur_overlay);
        FrameLayout frameLayout2 = (FrameLayout) viewGroup.requireViewById(R.id.overlay_controls_container);
        viewGroup.requireViewById(R.id.swipe_region).setOnTouchListener(new ViewOnTouchListenerC70251WNw(7, this, new GestureDetectorOnGestureListenerC148016lX(activity, this)));
        this.A0A = viewGroup.requireViewById(R.id.dimming_layer);
        C55982hj A02 = C55952hg.A00().A02();
        A02.A06 = true;
        this.A0R = A02;
        A02.A0A(new Ut2(this, 5));
        this.A0K = mediaMapFragment;
        this.A0Q = AbstractC23451Ch.A05(activity, "android.permission.ACCESS_FINE_LOCATION");
        this.A0O = new C55014OWb(new WNU(this, 19), frameLayout, 48);
        ImageView imageView = (ImageView) frameLayout.requireViewById(R.id.current_location_button);
        imageView.setImageDrawable(new C44351Jiq(activity, activity.getDrawable(R.drawable.instagram_location_arrow_pano_outline_24)));
        WNU.A00(imageView, 20, this);
        ImageView imageView2 = (ImageView) frameLayout.requireViewById(R.id.modal_close_button);
        imageView2.setImageDrawable(new C44351Jiq(activity, activity.getDrawable(R.drawable.instagram_arrow_left_pano_outline_24)));
        WNU.A00(imageView2, 21, this);
        View requireViewById = viewGroup.requireViewById(R.id.info_button);
        this.A0B = requireViewById;
        WNU.A00(requireViewById, 22, this);
        this.A0I = new WXa(frameLayout2);
        mapBottomSheetController.A05.add(this);
        A03();
    }

    public static void A01(Activity activity, UserSession userSession, C70684Wf5 c70684Wf5, String str) {
        Integer num;
        c70684Wf5.A03 = A00(activity, userSession, c70684Wf5);
        Context applicationContext = activity.getApplicationContext();
        C14360o3.A0B(applicationContext, 0);
        if (AbstractC15820qc.A0E(applicationContext)) {
            num = C05F.A00;
        } else {
            num = C05F.A01;
        }
        C4I7 c4i7 = c70684Wf5.A03;
        Long A00 = C4I8.A00(c70684Wf5.A0H);
        List A1J = AbstractC166987dD.A1J(C4I9.UNKNOWN);
        C9CH c9ch = new C9CH(C4IA.A08, C4IB.A05);
        c9ch.A00(num);
        c4i7.A00(c9ch, A00, str, "DISCOVERY_MAP", null, A1J);
    }
}
