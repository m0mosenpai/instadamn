package X;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2OG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2OG implements InterfaceC12850lX {
    public static C2OG A0A;
    public static final InterfaceC11380iw A0B = new C19270xB("in_app_notification_controller");
    public FrameLayout A00;
    public FrameLayout A01;
    public final Context A03;
    public final WindowManager A09;
    public final Handler A04 = new Handler(Looper.getMainLooper());
    public final Runnable A06 = new Runnable() { // from class: X.2OI
        @Override // java.lang.Runnable
        public final void run() {
            C2OG.A05(C2OG.this, true);
        }
    };
    public final List A07 = new ArrayList();
    public final Map A08 = new HashMap();
    public final C28271Yo A05 = C2OJ.A00();
    public C2ON A02 = C2OK.A00;

    /* JADX WARN: Code restructure failed: missing block: B:80:0x006b, code lost:
    
        if (r1 == false) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x023c A[Catch: all -> 0x02e4, TryCatch #2 {, blocks: (B:4:0x0001, B:6:0x0009, B:10:0x0026, B:12:0x003e, B:14:0x0048, B:16:0x0142, B:18:0x0153, B:20:0x0193, B:22:0x0197, B:24:0x01b7, B:26:0x01c3, B:27:0x01cb, B:31:0x0243, B:33:0x0250, B:34:0x0253, B:36:0x0295, B:37:0x02c7, B:38:0x02cf, B:39:0x028c, B:40:0x01df, B:41:0x019b, B:43:0x019f, B:44:0x01b0, B:46:0x01b4, B:48:0x01e8, B:49:0x0157, B:51:0x015d, B:53:0x0161, B:55:0x0165, B:56:0x0176, B:58:0x017a, B:60:0x023c, B:61:0x01ec, B:63:0x01f0, B:65:0x01f4, B:67:0x0211, B:68:0x0216, B:69:0x021d, B:71:0x0221, B:72:0x0231, B:74:0x0235, B:75:0x0051, B:77:0x0055, B:82:0x0070, B:83:0x0091, B:92:0x013a, B:94:0x02cd, B:96:0x02e3, B:99:0x007a, B:85:0x0108, B:87:0x010e, B:89:0x0117, B:91:0x011d), top: B:3:0x0001, outer: #3, inners: #0, #1 }] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, X.9v6] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(android.content.Context r13, X.C35129FeW r14, X.C2OG r15) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2OG.A02(android.content.Context, X.FeW, X.2OG):void");
    }

    @Deprecated
    public final synchronized FragmentActivity A06() {
        return (FragmentActivity) A00(this);
    }

    public final synchronized void A08() {
        this.A04.post(new Runnable() { // from class: X.3Ns
            @Override // java.lang.Runnable
            public final synchronized void run() {
                View findViewById;
                C2OG c2og = C2OG.this;
                if (!c2og.A07.isEmpty() && c2og.A01 != null) {
                    synchronized (c2og) {
                        Activity A00 = C2OG.A00(c2og);
                        if (A00 != null && (findViewById = A00.findViewById(R.id.content)) != null && findViewById.getWindowToken() != null) {
                            IBinder windowToken = findViewById.getWindowToken();
                            windowToken.getClass();
                            Rect rect = new Rect();
                            Window window = A00.getWindow();
                            C18C.A07(window, "rootActivity.getWindow() is null");
                            window.getDecorView().getWindowVisibleDisplayFrame(rect);
                            FrameLayout frameLayout = c2og.A01;
                            c2og.A00 = frameLayout;
                            c2og.A01 = null;
                            C2OG.A03(windowToken, frameLayout, c2og, rect.top);
                            c2og.A04.postDelayed(c2og.A06, 4000L);
                        }
                    }
                }
            }
        });
    }

    public final synchronized boolean A0B() {
        return !this.A07.isEmpty();
    }

    @Override // X.InterfaceC12850lX
    public final void Cuw(Activity activity) {
    }

    @Override // X.InterfaceC12850lX
    public final void Cux(Activity activity) {
    }

    @Override // X.InterfaceC12850lX
    public final void Cuy(Activity activity) {
    }

    @Override // X.InterfaceC12850lX
    public final synchronized void Cv0(Activity activity) {
        List list = this.A07;
        if (list.size() == 1) {
            A05(this, false);
            this.A01 = null;
        }
        list.remove(activity);
    }

    @Override // X.InterfaceC12850lX
    public final synchronized void Cv5(Activity activity) {
        this.A07.add(activity);
    }

    @Override // X.InterfaceC12850lX
    public final void Cv6(Activity activity) {
    }

    @Override // X.InterfaceC12850lX
    public final void Cv7(Activity activity) {
    }

    @Override // X.InterfaceC12850lX
    public final void Cv8(Activity activity, boolean z) {
    }

    public static Activity A00(C2OG c2og) {
        List list = c2og.A07;
        if (list.isEmpty()) {
            return null;
        }
        return (Activity) list.get(0);
    }

    public static C2OG A01() {
        if (A0A == null) {
            synchronized (C2OG.class) {
                if (A0A == null) {
                    A0A = new C2OG(AbstractC12290kX.A00);
                }
            }
        }
        return A0A;
    }

    public static void A03(IBinder iBinder, View view, C2OG c2og, int i) {
        WindowManager windowManager = c2og.A09;
        C18C.A07(windowManager, "mWindowManager is null");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        ((ViewGroup.LayoutParams) layoutParams).width = -1;
        ((ViewGroup.LayoutParams) layoutParams).height = -2;
        layoutParams.token = iBinder;
        layoutParams.gravity = 51;
        layoutParams.format = -3;
        layoutParams.flags |= 8;
        layoutParams.type = 1002;
        layoutParams.softInputMode = 1;
        layoutParams.setTitle(AnonymousClass001.A0R("InAppNotificationWindow:", Integer.toHexString(c2og.hashCode())));
        layoutParams.x = 0;
        layoutParams.y = i;
        windowManager.addView(view, layoutParams);
    }

    public static void A04(C2OG c2og) {
        if (c2og.A00 != null) {
            WindowManager windowManager = c2og.A09;
            C18C.A07(windowManager, "mWindowManager is null");
            Activity A00 = A00(c2og);
            if (A00 != null && !A00.isFinishing()) {
                windowManager.removeView(c2og.A00);
            }
            c2og.A00 = null;
        }
    }

    public static void A05(C2OG c2og, boolean z) {
        FrameLayout frameLayout;
        if (!c2og.A07.isEmpty()) {
            c2og.A04.removeCallbacks(c2og.A06);
            if (z && (frameLayout = c2og.A00) != null) {
                View childAt = frameLayout.getChildAt(0);
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -childAt.getMeasuredHeight());
                translateAnimation.setDuration(300L);
                translateAnimation.setFillAfter(false);
                translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
                translateAnimation.setAnimationListener(new AnimationAnimationListenerC35724Fpy(c2og));
                childAt.startAnimation(translateAnimation);
                return;
            }
            A04(c2og);
        }
    }

    public final void A07() {
        FrameLayout frameLayout = this.A00;
        if (frameLayout != null) {
            this.A01 = frameLayout;
            this.A04.removeCallbacks(this.A06);
            A04(this);
        }
    }

    public final void A09(Context context, C35129FeW c35129FeW) {
        this.A02.DdC(c35129FeW);
        this.A08.containsKey(c35129FeW.A0D);
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            this.A04.post(new GPW(context, c35129FeW, this));
        } else {
            A02(context, c35129FeW, this);
        }
    }

    public final void A0A(C35129FeW c35129FeW) {
        if (c35129FeW != null) {
            A09(this.A03, c35129FeW);
        }
    }

    public C2OG(Context context) {
        this.A03 = context;
        this.A09 = (WindowManager) context.getSystemService("window");
    }
}
