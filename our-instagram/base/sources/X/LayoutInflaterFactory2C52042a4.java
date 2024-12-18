package X;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.Window;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Locale;

/* renamed from: X.2a4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C52042a4 extends AbstractC51982Zy implements InterfaceC52052a5, LayoutInflater.Factory2 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Configuration A04;
    public Rect A05;
    public Rect A06;
    public MenuInflater A07;
    public View A08;
    public ViewGroup A09;
    public Window A0A;
    public PopupWindow A0B;
    public TextView A0C;
    public OnBackInvokedDispatcher A0D;
    public VKK A0E;
    public C53112bs A0F;
    public SOP A0G;
    public SOP A0H;
    public C53142bw A0I;
    public WPQ A0J;
    public C53412cP A0K;
    public VK7 A0L;
    public ActionBarContextView A0M;
    public XDY A0N;
    public CharSequence A0P;
    public Runnable A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public C53142bw[] A0g;
    public OnBackInvokedCallback A0h;
    public WPP A0i;
    public boolean A0j;
    public boolean A0k;
    public final Context A0l;
    public final C2Fg A0m;
    public final Object A0n;
    public static final C005001p A0q = new C005001p(0);
    public static final int[] A0r = {R.attr.windowBackground};
    public static final boolean A0p = !"robolectric".equals(Build.FINGERPRINT);
    public C04E A0O = null;
    public boolean A0X = true;
    public final Runnable A0o = new Runnable() { // from class: X.2a8
        @Override // java.lang.Runnable
        public final void run() {
            LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a4 = LayoutInflaterFactory2C52042a4.this;
            if ((layoutInflaterFactory2C52042a4.A01 & 1) != 0) {
                layoutInflaterFactory2C52042a4.A0W(0);
            }
            if ((layoutInflaterFactory2C52042a4.A01 & 4096) != 0) {
                layoutInflaterFactory2C52042a4.A0W(108);
            }
            layoutInflaterFactory2C52042a4.A0Z = false;
            layoutInflaterFactory2C52042a4.A01 = 0;
        }
    };

    public static Configuration A06(Context context, Configuration configuration, C53082bp c53082bp, int i, boolean z) {
        int i2;
        if (i != 1) {
            if (i != 2) {
                if (z) {
                    i2 = 0;
                } else {
                    i2 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
                }
            } else {
                i2 = 32;
            }
        } else {
            i2 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (c53082bp != null) {
            configuration2.setLocales(LocaleList.forLanguageTags(((C53092bq) c53082bp.A00).A00.toLanguageTags()));
        }
        return configuration2;
    }

    @Override // X.AbstractC51982Zy
    public final Context A0G(Context context) {
        this.A0S = true;
        int i = this.A02;
        if (i == -100) {
            i = AbstractC51982Zy.A00;
        }
        int A0R = A0R(context, i);
        if (AbstractC51982Zy.A05(context)) {
            AbstractC51982Zy.A02(context);
        }
        C53082bp A0T = A0T(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(A06(context, null, A0T, A0R, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C52182aJ) {
            try {
                ((C52182aJ) context).A01(A06(context, null, A0T, A0R, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (A0p) {
            Configuration configuration = null;
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f = configuration3.fontScale;
                    float f2 = configuration4.fontScale;
                    if (f != f2) {
                        configuration.fontScale = f2;
                    }
                    int i2 = configuration3.mcc;
                    int i3 = configuration4.mcc;
                    if (i2 != i3) {
                        configuration.mcc = i3;
                    }
                    int i4 = configuration3.mnc;
                    int i5 = configuration4.mnc;
                    if (i4 != i5) {
                        configuration.mnc = i5;
                    }
                    LocaleList locales = configuration3.getLocales();
                    LocaleList locales2 = configuration4.getLocales();
                    if (!locales.equals(locales2)) {
                        configuration.setLocales(locales2);
                        configuration.locale = configuration4.locale;
                    }
                    int i6 = configuration3.touchscreen;
                    int i7 = configuration4.touchscreen;
                    if (i6 != i7) {
                        configuration.touchscreen = i7;
                    }
                    int i8 = configuration3.keyboard;
                    int i9 = configuration4.keyboard;
                    if (i8 != i9) {
                        configuration.keyboard = i9;
                    }
                    int i10 = configuration3.keyboardHidden;
                    int i11 = configuration4.keyboardHidden;
                    if (i10 != i11) {
                        configuration.keyboardHidden = i11;
                    }
                    int i12 = configuration3.navigation;
                    int i13 = configuration4.navigation;
                    if (i12 != i13) {
                        configuration.navigation = i13;
                    }
                    int i14 = configuration3.navigationHidden;
                    int i15 = configuration4.navigationHidden;
                    if (i14 != i15) {
                        configuration.navigationHidden = i15;
                    }
                    int i16 = configuration3.orientation;
                    int i17 = configuration4.orientation;
                    if (i16 != i17) {
                        configuration.orientation = i17;
                    }
                    int i18 = configuration3.screenLayout & 15;
                    int i19 = configuration4.screenLayout & 15;
                    if (i18 != i19) {
                        configuration.screenLayout |= i19;
                    }
                    int i20 = configuration3.screenLayout & 192;
                    int i21 = configuration4.screenLayout & 192;
                    if (i20 != i21) {
                        configuration.screenLayout |= i21;
                    }
                    int i22 = configuration3.screenLayout & 48;
                    int i23 = configuration4.screenLayout & 48;
                    if (i22 != i23) {
                        configuration.screenLayout |= i23;
                    }
                    int i24 = configuration3.screenLayout & 768;
                    int i25 = configuration4.screenLayout & 768;
                    if (i24 != i25) {
                        configuration.screenLayout |= i25;
                    }
                    int i26 = configuration3.colorMode & 3;
                    int i27 = configuration4.colorMode & 3;
                    if (i26 != i27) {
                        configuration.colorMode |= i27;
                    }
                    int i28 = configuration3.colorMode & 12;
                    int i29 = configuration4.colorMode & 12;
                    if (i28 != i29) {
                        configuration.colorMode |= i29;
                    }
                    int i30 = configuration3.uiMode & 15;
                    int i31 = configuration4.uiMode & 15;
                    if (i30 != i31) {
                        configuration.uiMode |= i31;
                    }
                    int i32 = configuration3.uiMode & 48;
                    int i33 = configuration4.uiMode & 48;
                    if (i32 != i33) {
                        configuration.uiMode |= i33;
                    }
                    int i34 = configuration3.screenWidthDp;
                    int i35 = configuration4.screenWidthDp;
                    if (i34 != i35) {
                        configuration.screenWidthDp = i35;
                    }
                    int i36 = configuration3.screenHeightDp;
                    int i37 = configuration4.screenHeightDp;
                    if (i36 != i37) {
                        configuration.screenHeightDp = i37;
                    }
                    int i38 = configuration3.smallestScreenWidthDp;
                    int i39 = configuration4.smallestScreenWidthDp;
                    if (i38 != i39) {
                        configuration.smallestScreenWidthDp = i39;
                    }
                    int i40 = configuration3.densityDpi;
                    int i41 = configuration4.densityDpi;
                    if (i40 != i41) {
                        configuration.densityDpi = i41;
                    }
                }
            }
            Configuration A06 = A06(context, configuration, A0T, A0R, true);
            C52182aJ c52182aJ = new C52182aJ(context, com.facebook.R.style.ReelGenericCard);
            c52182aJ.A01(A06);
            try {
                if (context.getTheme() != null) {
                    VKT.A00(c52182aJ.getTheme());
                }
            } catch (NullPointerException unused3) {
            }
            return c52182aJ;
        }
        return context;
    }

    @Override // X.AbstractC51982Zy
    public final void A0L(Bundle bundle) {
        this.A0S = true;
        A0E(this, false, true);
        A08();
        Object obj = this.A0n;
        if (obj instanceof Activity) {
            String str = null;
            try {
                Activity activity = (Activity) obj;
                try {
                    str = AbstractC53152bx.A02(activity.getComponentName(), activity);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                VKK vkk = this.A0E;
                if (vkk == null) {
                    this.A0k = true;
                } else {
                    vkk.A0C(true);
                }
            }
            synchronized (AbstractC51982Zy.A07) {
                AbstractC51982Zy.A04(this);
                AbstractC51982Zy.A06.add(new WeakReference(this));
            }
        }
        this.A04 = new Configuration(this.A0l.getResources().getConfiguration());
        this.A0T = true;
    }

    public final void A0U() {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = null;
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.A0D;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.A0h) != null) {
            AbstractC53132bv.A02(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.A0h = null;
        }
        Object obj = this.A0n;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                onBackInvokedDispatcher = AbstractC53132bv.A00(activity);
            }
        }
        this.A0D = onBackInvokedDispatcher;
        A0V();
    }

    public final void A0W(int i) {
        C53142bw A0S = A0S(i);
        if (A0S.A0A != null) {
            Bundle bundle = new Bundle();
            A0S.A0A.A09(bundle);
            if (bundle.size() > 0) {
                A0S.A05 = bundle;
            }
            WQH wqh = A0S.A0A;
            wqh.A06();
            wqh.clear();
        }
        A0S.A0F = true;
        A0S.A0E = true;
        if ((i == 108 || i == 0) && this.A0N != null) {
            C53142bw A0S2 = A0S(0);
            A0S2.A0D = false;
            A0F(null, A0S2, this);
        }
    }

    private SOP A07(Context context) {
        SOP sop = this.A0H;
        if (sop == null) {
            SH0 sh0 = SH0.A03;
            if (sh0 == null) {
                Context applicationContext = context.getApplicationContext();
                sh0 = new SH0(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
                SH0.A03 = sh0;
            }
            C58724Q5a c58724Q5a = new C58724Q5a(this, sh0);
            this.A0H = c58724Q5a;
            return c58724Q5a;
        }
        return sop;
    }

    private void A08() {
        if (this.A0A == null) {
            Object obj = this.A0n;
            if (obj instanceof Activity) {
                A0B(((Activity) obj).getWindow());
            }
        }
        if (this.A0A != null) {
        } else {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private void A09() {
        if (!this.A0e) {
        } else {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
    
        if (r0.width != (-1)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0115, code lost:
    
        if (r0.getCount() > 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b2, code lost:
    
        if (r0 != null) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.WPU, java.lang.Object, X.XEV] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0A(android.view.KeyEvent r16, X.C53142bw r17) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LayoutInflaterFactory2C52042a4.A0A(android.view.KeyEvent, X.2bw):void");
    }

    private void A0B(Window window) {
        if (this.A0A == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C53112bs)) {
                C53112bs c53112bs = new C53112bs(callback, this);
                this.A0F = c53112bs;
                window.setCallback(c53112bs);
                Context context = this.A0l;
                C53122bu c53122bu = new C53122bu(context, context.obtainStyledAttributes((AttributeSet) null, A0r));
                Drawable A03 = c53122bu.A03(0);
                if (A03 != null) {
                    window.setBackgroundDrawable(A03);
                }
                c53122bu.A02.recycle();
                this.A0A = window;
                if (Build.VERSION.SDK_INT >= 33 && this.A0D == null) {
                    A0U();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        if (r6 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0C(final X.LayoutInflaterFactory2C52042a4 r10) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LayoutInflaterFactory2C52042a4.A0C(X.2a4):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0E(X.LayoutInflaterFactory2C52042a4 r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LayoutInflaterFactory2C52042a4.A0E(X.2a4, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
    
        if (r6 == 108) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00cd, code lost:
    
        if (r7 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d0, code lost:
    
        if (r7 != null) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0F(android.view.KeyEvent r11, X.C53142bw r12, X.LayoutInflaterFactory2C52042a4 r13) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LayoutInflaterFactory2C52042a4.A0F(android.view.KeyEvent, X.2bw, X.2a4):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fd, code lost:
    
        if (r1 == false) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.UDD, X.VK7, java.lang.Object, X.2a5] */
    @Override // X.AbstractC51982Zy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.VK7 A0H(X.XDW r10) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LayoutInflaterFactory2C52042a4.A0H(X.XDW):X.VK7");
    }

    @Override // X.AbstractC51982Zy
    public final void A0I() {
        if (this.A0E != null) {
            A0D(this);
            if (!this.A0E.A0H()) {
                this.A01 = (1 << 0) | this.A01;
                if (!this.A0Z) {
                    this.A0A.getDecorView().postOnAnimation(this.A0o);
                    this.A0Z = true;
                }
            }
        }
    }

    @Override // X.AbstractC51982Zy
    public final void A0J() {
        Object obj = this.A0n;
        boolean z = obj instanceof Activity;
        if (z) {
            synchronized (AbstractC51982Zy.A07) {
                AbstractC51982Zy.A04(this);
            }
        }
        if (this.A0Z) {
            this.A0A.getDecorView().removeCallbacks(this.A0o);
        }
        this.A0U = true;
        if (this.A02 != -100 && z && ((Activity) obj).isChangingConfigurations()) {
            A0q.put(obj.getClass().getName(), Integer.valueOf(this.A02));
        } else {
            A0q.remove(obj.getClass().getName());
        }
        VKK vkk = this.A0E;
        if (vkk != null) {
            vkk.A06();
        }
        SOP sop = this.A0H;
        if (sop != null) {
            sop.A01();
        }
        SOP sop2 = this.A0G;
        if (sop2 != null) {
            sop2.A01();
        }
    }

    @Override // X.AbstractC51982Zy
    public final void A0P(CharSequence charSequence) {
        this.A0P = charSequence;
        XDY xdy = this.A0N;
        if (xdy != null) {
            xdy.setWindowTitle(charSequence);
            return;
        }
        VKK vkk = this.A0E;
        if (vkk != null) {
            vkk.A0A(charSequence);
            return;
        }
        TextView textView = this.A0C;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    @Override // X.AbstractC51982Zy
    public final boolean A0Q(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.A0f && i == 108) {
            return false;
        }
        if (this.A0Y && i == 1) {
            this.A0Y = false;
        } else if (i != 1) {
            if (i != 2) {
                if (i != 5) {
                    if (i != 10) {
                        if (i != 108) {
                            if (i != 109) {
                                return this.A0A.requestFeature(i);
                            }
                            A09();
                            this.A0c = true;
                            return true;
                        }
                        A09();
                        this.A0Y = true;
                        return true;
                    }
                    A09();
                    this.A0d = true;
                    return true;
                }
                A09();
                this.A0V = true;
                return true;
            }
            A09();
            this.A0W = true;
            return true;
        }
        A09();
        this.A0f = true;
        return true;
    }

    public final int A0R(Context context, int i) {
        SOP A07;
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i == 3) {
                            A07 = this.A0G;
                            if (A07 == null) {
                                A07 = new Q5Z(context, this);
                                this.A0G = A07;
                            }
                        } else {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    A07 = A07(context);
                }
                return A07.A00();
            }
            return i;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0005, code lost:
    
        if (r0 <= r5) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, X.2bw] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C53142bw A0S(int r5) {
        /*
            r4 = this;
            X.2bw[] r3 = r4.A0g
            if (r3 == 0) goto L7
            int r0 = r3.length
            if (r0 > r5) goto L15
        L7:
            int r0 = r5 + 1
            X.2bw[] r2 = new X.C53142bw[r0]
            if (r3 == 0) goto L12
            int r1 = r3.length
            r0 = 0
            java.lang.System.arraycopy(r3, r0, r2, r0, r1)
        L12:
            r4.A0g = r2
            r3 = r2
        L15:
            r1 = r3[r5]
            if (r1 != 0) goto L25
            X.2bw r1 = new X.2bw
            r1.<init>()
            r1.A01 = r5
            r0 = 0
            r1.A0E = r0
            r3[r5] = r1
        L25:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LayoutInflaterFactory2C52042a4.A0S(int):X.2bw");
    }

    public final C53082bp A0T(Context context) {
        C53082bp c53082bp;
        C53082bp c53082bp2;
        Locale locale;
        C53082bp c53082bp3 = null;
        if (Build.VERSION.SDK_INT < 33 && (c53082bp = AbstractC51982Zy.A02) != null) {
            c53082bp3 = C53082bp.A00(context.getApplicationContext().getResources().getConfiguration().getLocales().toLanguageTags());
            LocaleList localeList = ((C53092bq) c53082bp.A00).A00;
            if (localeList.isEmpty()) {
                c53082bp2 = C53082bp.A01;
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int i = 0;
                while (true) {
                    int size = localeList.size();
                    LocaleList localeList2 = ((C53092bq) c53082bp3.A00).A00;
                    if (i >= size + localeList2.size()) {
                        break;
                    }
                    if (i < localeList.size()) {
                        locale = localeList.get(i);
                    } else {
                        locale = localeList2.get(i - localeList.size());
                    }
                    if (locale != null) {
                        linkedHashSet.add(locale);
                    }
                    i++;
                }
                c53082bp2 = new C53082bp(new C53092bq(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
            }
            if (!((C53092bq) c53082bp2.A00).A00.isEmpty()) {
                return c53082bp2;
            }
        }
        return c53082bp3;
    }

    public final void A0V() {
        WPF wpf;
        if (Build.VERSION.SDK_INT >= 33) {
            if (this.A0D != null && (A0S(0).A0C || this.A0L != null)) {
                if (this.A0h == null) {
                    wpf = AbstractC53132bv.A01(this, this.A0D);
                } else {
                    return;
                }
            } else {
                OnBackInvokedCallback onBackInvokedCallback = this.A0h;
                if (onBackInvokedCallback == null) {
                    return;
                }
                AbstractC53132bv.A02(this.A0D, onBackInvokedCallback);
                wpf = null;
            }
            this.A0h = wpf;
        }
    }

    public final void A0X(Menu menu, C53142bw c53142bw, int i) {
        if (menu == null) {
            menu = c53142bw.A0A;
        }
        if (c53142bw.A0C && !this.A0U) {
            C53112bs c53112bs = this.A0F;
            Window.Callback callback = this.A0A.getCallback();
            try {
                c53112bs.A02 = true;
                callback.onPanelClosed(i, menu);
            } finally {
                c53112bs.A02 = false;
            }
        }
    }

    public final void A0Y(C53142bw c53142bw, boolean z) {
        ViewGroup viewGroup;
        XDY xdy;
        if (z && c53142bw.A01 == 0 && (xdy = this.A0N) != null && xdy.CZw()) {
            A0Z(c53142bw.A0A);
            return;
        }
        ViewManager viewManager = (ViewManager) this.A0l.getSystemService("window");
        if (viewManager != null && c53142bw.A0C && (viewGroup = c53142bw.A08) != null) {
            viewManager.removeView(viewGroup);
            if (z) {
                A0X(null, c53142bw, c53142bw.A01);
            }
        }
        c53142bw.A0D = false;
        c53142bw.A0B = false;
        c53142bw.A0C = false;
        c53142bw.A07 = null;
        c53142bw.A0E = true;
        if (this.A0I == c53142bw) {
            this.A0I = null;
        }
        if (c53142bw.A01 != 0) {
            return;
        }
        A0V();
    }

    public final void A0Z(WQH wqh) {
        WPV wpv;
        if (!this.A0j) {
            this.A0j = true;
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.A0N;
            actionBarOverlayLayout.A02();
            ActionMenuView actionMenuView = ((WPa) actionBarOverlayLayout.A03).A09.A0E;
            if (actionMenuView != null && (wpv = actionMenuView.A04) != null) {
                wpv.A01();
            }
            Window.Callback callback = this.A0A.getCallback();
            if (callback != null && !this.A0U) {
                callback.onPanelClosed(108, wqh);
            }
            this.A0j = false;
        }
    }

    public final boolean A0a() {
        boolean z = this.A0b;
        this.A0b = false;
        C53142bw A0S = A0S(0);
        if (A0S.A0C) {
            if (!z) {
                A0Y(A0S, true);
            }
            return true;
        }
        VK7 vk7 = this.A0L;
        if (vk7 != null) {
            vk7.A00();
            return true;
        }
        A0D(this);
        VKK vkk = this.A0E;
        if (vkk == null || !vkk.A0G()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0103, code lost:
    
        if (r0.dispatchKeyEvent(r7) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b1, code lost:
    
        if (r1 != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00f7, code lost:
    
        if (A0F(r7, r4, r6) != false) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0b(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LayoutInflaterFactory2C52042a4.A0b(android.view.KeyEvent):boolean");
    }

    @Override // X.InterfaceC52052a5
    public final boolean DSo(MenuItem menuItem, WQH wqh) {
        Window.Callback callback = this.A0A.getCallback();
        if (callback != null && !this.A0U) {
            WQH A00 = wqh.A00();
            C53142bw[] c53142bwArr = this.A0g;
            if (c53142bwArr != null) {
                for (C53142bw c53142bw : c53142bwArr) {
                    if (c53142bw != null && c53142bw.A0A == A00) {
                        return callback.onMenuItemSelected(c53142bw.A01, menuItem);
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r1.A03() != false) goto L20;
     */
    @Override // X.InterfaceC52052a5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DSq(X.WQH r7) {
        /*
            r6 = this;
            X.XDY r0 = r6.A0N
            r2 = 1
            r5 = 0
            if (r0 == 0) goto Ld0
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.A02()
            X.XBl r0 = r0.A03
            X.WPa r0 = (X.WPa) r0
            androidx.appcompat.widget.Toolbar r1 = r0.A09
            int r0 = r1.getVisibility()
            if (r0 != 0) goto Ld0
            androidx.appcompat.widget.ActionMenuView r0 = r1.A0E
            if (r0 == 0) goto Ld0
            boolean r0 = r0.A06
            if (r0 == 0) goto Ld0
            android.content.Context r0 = r6.A0l
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            boolean r0 = r0.hasPermanentMenuKey()
            if (r0 == 0) goto L4a
            X.XDY r0 = r6.A0N
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.A02()
            X.XBl r0 = r0.A03
            X.WPa r0 = (X.WPa) r0
            androidx.appcompat.widget.Toolbar r0 = r0.A09
            androidx.appcompat.widget.ActionMenuView r0 = r0.A0E
            if (r0 == 0) goto Ld0
            X.WPV r1 = r0.A04
            if (r1 == 0) goto Ld0
            X.WtK r0 = r1.A0B
            if (r0 != 0) goto L4a
            boolean r0 = r1.A03()
            if (r0 == 0) goto Ld0
        L4a:
            android.view.Window r0 = r6.A0A
            android.view.Window$Callback r4 = r0.getCallback()
            X.XDY r0 = r6.A0N
            boolean r0 = r0.CZw()
            r3 = 108(0x6c, float:1.51E-43)
            if (r0 == 0) goto L80
            X.XDY r0 = r6.A0N
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.A02()
            X.XBl r0 = r0.A03
            X.WPa r0 = (X.WPa) r0
            androidx.appcompat.widget.Toolbar r0 = r0.A09
            androidx.appcompat.widget.ActionMenuView r0 = r0.A0E
            if (r0 == 0) goto L72
            X.WPV r0 = r0.A04
            if (r0 == 0) goto L72
            r0.A02()
        L72:
            boolean r0 = r6.A0U
            if (r0 != 0) goto L7f
            X.2bw r0 = r6.A0S(r5)
            X.WQH r0 = r0.A0A
            r4.onPanelClosed(r3, r0)
        L7f:
            return
        L80:
            if (r4 == 0) goto L7f
            boolean r0 = r6.A0U
            if (r0 != 0) goto L7f
            boolean r0 = r6.A0Z
            if (r0 == 0) goto L9e
            int r0 = r6.A01
            r0 = r0 & 1
            if (r0 == 0) goto L9e
            android.view.Window r0 = r6.A0A
            android.view.View r1 = r0.getDecorView()
            java.lang.Runnable r0 = r6.A0o
            r1.removeCallbacks(r0)
            r0.run()
        L9e:
            X.2bw r2 = r6.A0S(r5)
            X.WQH r1 = r2.A0A
            if (r1 == 0) goto L7f
            boolean r0 = r2.A0F
            if (r0 != 0) goto L7f
            android.view.View r0 = r2.A06
            boolean r0 = r4.onPreparePanel(r5, r0, r1)
            if (r0 == 0) goto L7f
            X.WQH r0 = r2.A0A
            r4.onMenuOpened(r3, r0)
            X.XDY r0 = r6.A0N
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.A02()
            X.XBl r0 = r0.A03
            X.WPa r0 = (X.WPa) r0
            androidx.appcompat.widget.Toolbar r0 = r0.A09
            androidx.appcompat.widget.ActionMenuView r0 = r0.A0E
            if (r0 == 0) goto L7f
            X.WPV r0 = r0.A04
            if (r0 == 0) goto L7f
            r0.A04()
            return
        Ld0:
            X.2bw r1 = r6.A0S(r5)
            r1.A0E = r2
            r6.A0Y(r1, r5)
            r0 = 0
            r6.A0A(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LayoutInflaterFactory2C52042a4.DSq(X.WQH):void");
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C53412cP c53412cP = this.A0K;
        if (c53412cP == null) {
            Context context2 = this.A0l;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(AbstractC53402cO.A09);
            String string = obtainStyledAttributes.getString(116);
            obtainStyledAttributes.recycle();
            if (string == null) {
                c53412cP = new C53412cP();
                this.A0K = c53412cP;
            } else {
                try {
                    c53412cP = (C53412cP) context2.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    this.A0K = c53412cP;
                } catch (Throwable unused) {
                    c53412cP = new C53412cP();
                    this.A0K = c53412cP;
                }
            }
        }
        return c53412cP.A01(str, context, attributeSet);
    }

    public LayoutInflaterFactory2C52042a4(Context context, Window window, C2Fg c2Fg, Object obj) {
        this.A02 = -100;
        this.A0l = context;
        this.A0m = c2Fg;
        this.A0n = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (context instanceof AppCompatActivity) {
                        AppCompatActivity appCompatActivity = (AppCompatActivity) context;
                        if (appCompatActivity != null) {
                            this.A02 = ((LayoutInflaterFactory2C52042a4) appCompatActivity.getDelegate()).A02;
                        }
                    } else if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    break;
                }
            }
        }
        if (this.A02 == -100) {
            C005001p c005001p = A0q;
            String name = obj.getClass().getName();
            Number number = (Number) c005001p.get(name);
            if (number != null) {
                this.A02 = number.intValue();
                c005001p.remove(name);
            }
        }
        if (window != null) {
            A0B(window);
        }
        C52102aA.A02();
    }

    public static void A0D(LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a4) {
        UD8 ud8;
        A0C(layoutInflaterFactory2C52042a4);
        if (layoutInflaterFactory2C52042a4.A0Y && layoutInflaterFactory2C52042a4.A0E == null) {
            Object obj = layoutInflaterFactory2C52042a4.A0n;
            if (obj instanceof Activity) {
                ud8 = new UD8((Activity) obj, layoutInflaterFactory2C52042a4.A0c);
            } else if (!(obj instanceof Dialog)) {
                return;
            } else {
                ud8 = new UD8((Dialog) obj);
            }
            layoutInflaterFactory2C52042a4.A0E = ud8;
            ud8.A0C(layoutInflaterFactory2C52042a4.A0k);
        }
    }

    @Override // X.AbstractC51982Zy
    public final void A0K(int i) {
        A0C(this);
        ViewGroup viewGroup = (ViewGroup) this.A09.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.A0l).inflate(i, viewGroup);
        this.A0F.A00(this.A0A.getCallback());
    }

    @Override // X.AbstractC51982Zy
    public final void A0M(View view) {
        A0C(this);
        ViewGroup viewGroup = (ViewGroup) this.A09.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.A0F.A00(this.A0A.getCallback());
    }

    @Override // X.AbstractC51982Zy
    public final void A0N(View view, ViewGroup.LayoutParams layoutParams) {
        A0C(this);
        ((ViewGroup) this.A09.findViewById(R.id.content)).addView(view, layoutParams);
        this.A0F.A00(this.A0A.getCallback());
    }

    @Override // X.AbstractC51982Zy
    public final void A0O(View view, ViewGroup.LayoutParams layoutParams) {
        A0C(this);
        ViewGroup viewGroup = (ViewGroup) this.A09.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.A0F.A00(this.A0A.getCallback());
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
