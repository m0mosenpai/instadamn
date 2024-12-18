package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* renamed from: X.9LN, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9LN implements View.OnTouchListener, MSD, InterfaceC55932he, MOQ, InterfaceC58154PqJ, InterfaceC50496MQz, MQR, MON, InterfaceGestureDetectorOnGestureListenerC149756oS {
    public static final String __redex_internal_original_name = "AssetPickerController";
    public float A00;
    public View A01;
    public ViewGroup A02;
    public ImageView A03;
    public TextView A04;
    public TextView A05;
    public L61 A06;
    public C1P1 A07;
    public ReboundViewPager A08;
    public TouchInterceptorFrameLayout A09;
    public C48215LVp A0A;
    public C44063Jdo A0B;
    public C48593LeV A0C;
    public C48597LeZ A0D;
    public C48590LeS A0E;
    public C48588LeQ A0F;
    public C48595LeX A0G;
    public C48592LeU A0H;
    public C23724Aex A0I;
    public JT7 A0J;
    public C48589LeR A0K;
    public ViewOnFocusChangeListenerC44078Je3 A0L;
    public C46016KYe A0M;
    public C56247Oxu A0N;
    public MY2 A0O;
    public C3FQ A0P;
    public C31445Drp A0Q;
    public C23723Aew A0R;
    public CirclePageIndicator A0S;
    public C70851WiH A0T;
    public Integer A0U;
    public String A0V;
    public Map A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public float A0r;
    public float A0s;
    public float A0t;
    public View A0u;
    public C48591LeT A0v;
    public C48596LeY A0w;
    public C48594LeW A0x;
    public boolean A0y;
    public final int A0z;
    public final int A10;
    public final Activity A11;
    public final GestureDetector A12;
    public final View A13;
    public final C22P A14;
    public final QuickPerformanceLogger A15;
    public final C55982hj A16;
    public final InterfaceC11380iw A17;
    public final UserSession A18;
    public final C1810981l A19;
    public final C8NZ A1A;
    public final C22875A6v A1B;
    public final AnonymousClass840 A1C;
    public final C183918Ds A1D;
    public final InterfaceC1810081c A1E;
    public final InterfaceC09390do A1F;
    public final double A1G;
    public final int A1H;
    public final int A1I;
    public final View.OnTouchListener A1J;
    public final ViewStub A1K;
    public final Fragment A1L;
    public final AbstractC10360h2 A1M;
    public final AbstractC018607g A1N;
    public final C3I9 A1O;
    public final C8O6 A1P;
    public final A5A A1Q;
    public final AnonymousClass844 A1R;
    public final C677733r A1S;
    public final java.util.Set A1T;
    public final java.util.Set A1U;
    public final InterfaceC08830cm A1V;
    public final InterfaceC16820sZ A1W;
    public final InterfaceC16820sZ A1X;

    public static final void A07(C9LN c9ln) {
        c9ln.A0k = false;
        if (c9ln.A0N()) {
            ViewOnFocusChangeListenerC44078Je3 viewOnFocusChangeListenerC44078Je3 = c9ln.A0L;
            if (viewOnFocusChangeListenerC44078Je3 != null) {
                viewOnFocusChangeListenerC44078Je3.A06(false, false);
            }
            c9ln.A16.A06(A00(c9ln));
            C183688Ct.A0H(((C8NW) c9ln.A1A).A0y, false, false);
            return;
        }
        c9ln.A1E.E4u(new Object());
    }

    public static final synchronized void A09(C9LN c9ln, String str, short s) {
        synchronized (c9ln) {
            if (c9ln.A0l) {
                if (str != null) {
                    QuickPerformanceLogger quickPerformanceLogger = c9ln.A15;
                    quickPerformanceLogger.markerAnnotate(31798883, CacheBehaviorLogger.SOURCE, str);
                    quickPerformanceLogger.markerAnnotate(31798883, "APP_STARTUP_TIME_BUCKET", C1CC.A00());
                }
                c9ln.A15.markerEnd(31798883, s);
                c9ln.A0l = false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r4.A0f != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0H(X.C8BN r5, X.EnumC50631MWs r6, boolean r7) {
        /*
            r4 = this;
            r0 = 2
            X.C14360o3.A0B(r6, r0)
            X.MY2 r3 = r4.A0O
            if (r3 == 0) goto L1f
            r3.A06 = r7
            r3.A01 = r5
            r3.A02 = r6
            X.LVp r2 = r4.A0A
            if (r2 == 0) goto L1f
            boolean r0 = r4.A0g
            if (r0 != 0) goto L1b
            boolean r1 = r4.A0f
            r0 = 1
            if (r1 == 0) goto L1c
        L1b:
            r0 = 0
        L1c:
            r2.A02(r3, r0)
        L1f:
            X.2hj r0 = r4.A16
            r0.A04()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9LN.A0H(X.8BN, X.MWs, boolean):void");
    }

    public final void A0K(String str) {
        C14360o3.A0B(str, 0);
        C48597LeZ c48597LeZ = this.A0D;
        if (c48597LeZ != null) {
            C48240LWp c48240LWp = new C48240LWp(c48597LeZ, 4);
            UserSession userSession = c48597LeZ.A04;
            C14360o3.A0B(userSession, 0);
            if (((C36302Fzx) userSession.A01(C36302Fzx.class, new C50152MDf(userSession, 19))).A00()) {
                AbstractC47193KtS.A01.A03(c48597LeZ.A02.requireActivity(), c48240LWp, userSession, AbstractC43591JPw.A00(163), AbstractC43591JPw.A00(391), null, str, null, null, false, false);
            } else {
                AbstractC46619Kjw.A00(c48597LeZ.A02.requireActivity(), null, null, c48240LWp, userSession, AbstractC43591JPw.A00(163), AbstractC43591JPw.A00(391), 2131956939);
            }
        }
    }

    @Override // X.MSD
    public final /* synthetic */ void CxN() {
    }

    @Override // X.InterfaceC50496MQz
    public final void CxQ(String str) {
        C14360o3.A0B(str, 0);
        InterfaceC09390do interfaceC09390do = this.A1F;
        if (interfaceC09390do.getValue() == null) {
            C46016KYe c46016KYe = this.A0M;
            if (c46016KYe != null) {
                c46016KYe.A01(str, false);
                return;
            }
            return;
        }
        C13400mQ c13400mQ = (C13400mQ) interfaceC09390do.getValue();
        if (c13400mQ == null) {
            return;
        }
        c13400mQ.A01(str);
    }

    @Override // X.InterfaceC50496MQz
    public final void CxR(String str) {
    }

    @Override // X.InterfaceC58154PqJ
    public final void DUj(JIN jin, MusicBrowseCategory musicBrowseCategory, String str, String str2) {
        this.A1E.E4u(new C188208Vl(jin, true, false));
    }

    @Override // X.MSD
    public final /* synthetic */ void DhN() {
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        float f = (float) c55982hj.A09.A00;
        View view = this.A01;
        if (view != null) {
            view.setTranslationY(f);
        }
    }

    @Override // X.MSD
    public final /* synthetic */ void close() {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        float f = 0.0f;
        this.A0t = 0.0f;
        this.A0a = true;
        boolean z = false;
        this.A0X = false;
        this.A0Y = false;
        this.A0r = motionEvent.getRawX();
        this.A0s = motionEvent.getRawY();
        if (A0O()) {
            float y = motionEvent.getY();
            View view = this.A01;
            if (view != null) {
                f = view.getY();
            }
            if (y < f) {
                z = true;
            }
        }
        return !z;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        float f;
        int i;
        int i2;
        double d;
        C44063Jdo c44063Jdo;
        float f2;
        C14360o3.A0B(motionEvent, 0);
        if (!A0O()) {
            float y = motionEvent.getY();
            View view = this.A01;
            if (view != null) {
                f2 = view.getY();
            } else {
                f2 = 0.0f;
            }
            if (y < f2) {
                A03();
                return true;
            }
        }
        float y2 = motionEvent.getY();
        View view2 = this.A01;
        float f3 = 0.0f;
        if (view2 != null) {
            f = view2.getY();
        } else {
            f = 0.0f;
        }
        ImageView imageView = this.A03;
        if (imageView != null) {
            i = imageView.getTop();
        } else {
            i = 0;
        }
        if (y2 < f + i) {
            return false;
        }
        View view3 = this.A01;
        if (view3 != null) {
            f3 = view3.getY();
        }
        ImageView imageView2 = this.A03;
        if (imageView2 != null) {
            i2 = imageView2.getBottom();
        } else {
            i2 = 0;
        }
        if (y2 > f3 + i2) {
            return false;
        }
        L10 A01 = A01(this);
        if (A01 == null || ((c44063Jdo = this.A0B) != null && c44063Jdo.A03(A01))) {
            C55982hj c55982hj = this.A16;
            if (!c55982hj.A0C()) {
                return true;
            }
            if (c55982hj.A09.A00 == 0.0d) {
                d = this.A0z;
            } else {
                d = 0.0d;
            }
            c55982hj.A06(d);
            return true;
        }
        C44063Jdo c44063Jdo2 = this.A0B;
        if (c44063Jdo2 == null) {
            return true;
        }
        c44063Jdo2.A02(A01, true);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 1);
        boolean onTouchEvent = this.A12.onTouchEvent(motionEvent);
        A05(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1 && actionMasked != 3) {
            return onTouchEvent;
        }
        A0P(this.A0t, false);
        return onTouchEvent;
    }

    public static final float A00(C9LN c9ln) {
        float f;
        Integer valueOf;
        ReboundViewPager reboundViewPager;
        Integer valueOf2;
        ImageView imageView;
        ReboundViewPager reboundViewPager2 = c9ln.A08;
        if (reboundViewPager2 != null) {
            int i = reboundViewPager2.A08;
            C44063Jdo c44063Jdo = c9ln.A0B;
            if (c44063Jdo != null && (valueOf = Integer.valueOf(c44063Jdo.A01(0, i))) != null && valueOf.intValue() != 0 && (reboundViewPager = c9ln.A08) != null) {
                int i2 = reboundViewPager.A08;
                C44063Jdo c44063Jdo2 = c9ln.A0B;
                if (c44063Jdo2 != null && (valueOf2 = Integer.valueOf(c44063Jdo2.A01(1, i2))) != null && valueOf2.intValue() != 0 && (imageView = c9ln.A03) != null && imageView.getHeight() != 0) {
                    f = c9ln.A0E() / c9ln.A0z;
                    return c9ln.A0z * (1.0f - f);
                }
            }
        }
        f = 0.3f;
        return c9ln.A0z * (1.0f - f);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.L10 A01(X.C9LN r3) {
        /*
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r3.A08
            r1 = 0
            if (r0 == 0) goto Lc
            int r0 = r0.getChildCount()
            if (r0 != 0) goto Lc
            r1 = 1
        Lc:
            r2 = 0
            if (r1 != 0) goto L2a
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r3.A08
            if (r0 == 0) goto L2b
            int r1 = r0.A08
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L2b
            X.Jdo r0 = r3.A0B
            if (r0 == 0) goto L2b
            java.lang.Object r1 = r0.getItem(r1)
        L23:
            boolean r0 = r1 instanceof X.L10
            if (r0 == 0) goto L2a
            r2 = r1
            X.L10 r2 = (X.L10) r2
        L2a:
            return r2
        L2b:
            r1 = r2
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9LN.A01(X.9LN):X.L10");
    }

    private final C3FQ A02() {
        View view;
        C3FQ c3fq;
        ViewGroup CFj;
        ReboundViewPager reboundViewPager = this.A08;
        if (reboundViewPager != null && reboundViewPager.getVisibility() == 0) {
            view = reboundViewPager.A0F;
        } else {
            view = null;
        }
        if ((!(view instanceof ViewGroup) || (CFj = (ViewGroup) view) == null) && ((c3fq = this.A0P) == null || (CFj = c3fq.CFj()) == null)) {
            return null;
        }
        return C3FN.A00(CFj);
    }

    private final void A03() {
        InterfaceC1810081c interfaceC1810081c;
        Object obj;
        if (this.A0n) {
            interfaceC1810081c = this.A1E;
            obj = new Object();
        } else if (this.A0c) {
            interfaceC1810081c = this.A1E;
            obj = new Object();
        } else if (this.A0o) {
            interfaceC1810081c = this.A1E;
            obj = new Object();
        } else {
            boolean z = this.A0f;
            interfaceC1810081c = this.A1E;
            if (z) {
                obj = C8WK.A00;
            } else {
                obj = new Object();
            }
        }
        interfaceC1810081c.E4u(obj);
    }

    private final void A04() {
        C48215LVp c48215LVp;
        ViewOnFocusChangeListenerC44078Je3 viewOnFocusChangeListenerC44078Je3 = this.A0L;
        if (viewOnFocusChangeListenerC44078Je3 != null) {
            boolean z = false;
            if (!this.A0b && (c48215LVp = this.A0A) != null && c48215LVp.A00 == c48215LVp.A02) {
                z = true;
            }
            viewOnFocusChangeListenerC44078Je3.A06(z, true);
        }
        C183688Ct.A0H(((C8NW) this.A1A).A0y, false, false);
    }

    public static final void A05(MotionEvent motionEvent, C9LN c9ln) {
        if (!c9ln.A0X && !c9ln.A0Y) {
            float rawX = c9ln.A0r - motionEvent.getRawX();
            float rawY = c9ln.A0s - motionEvent.getRawY();
            if (Math.sqrt((rawX * rawX) + (rawY * rawY)) > c9ln.A1G) {
                if (Math.toDegrees(Math.atan(Math.abs(rawY / rawX))) < 20.0d) {
                    c9ln.A0X = true;
                } else {
                    c9ln.A0Y = true;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0052, code lost:
    
        if (r9 != 2) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0412  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A06(X.C9LN r39) {
        /*
            Method dump skipped, instructions count: 1052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9LN.A06(X.9LN):void");
    }

    public static final void A08(C9LN c9ln, float f) {
        C55982hj c55982hj = c9ln.A16;
        C55992hk c55992hk = c55982hj.A09;
        float f2 = (float) c55992hk.A00;
        float min = (float) Math.min(Math.max(f2 - f, 0.0d), c9ln.A0z);
        if (f2 != min) {
            c55982hj.A08(min, true);
        }
        if (f > 0.0f && c9ln.A0N() && c55992hk.A00 < A00(c9ln)) {
            c9ln.A04();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0273, code lost:
    
        if (r11.A05() != true) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0418, code lost:
    
        if (r20 != false) goto L237;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [X.Aey, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0A(X.C9LN r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 1135
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9LN.A0A(X.9LN, java.util.List):void");
    }

    public static final boolean A0C(C9LN c9ln) {
        if (!c9ln.A0g && !c9ln.A0j && !c9ln.A0c && !c9ln.A0d && !c9ln.A0h && !c9ln.A0e && !c9ln.A0f && !c9ln.A0i) {
            return false;
        }
        return true;
    }

    public static final boolean A0D(C9LN c9ln, float f) {
        float f2;
        int i;
        View view = c9ln.A01;
        float f3 = 0.0f;
        if (view != null) {
            f2 = view.getY();
        } else {
            f2 = 0.0f;
        }
        View view2 = c9ln.A0u;
        if (view2 != null) {
            i = view2.getTop();
        } else {
            i = 0;
        }
        float f4 = f2 + i;
        ReboundViewPager reboundViewPager = c9ln.A08;
        if (reboundViewPager != null && reboundViewPager.getVisibility() == 0) {
            ReboundViewPager reboundViewPager2 = c9ln.A08;
            if (reboundViewPager2 != null) {
                f3 = reboundViewPager2.getTop();
            }
            f4 += f3;
        }
        if (f >= f4) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A0E() {
        /*
            r4 = this;
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r4.A08
            r3 = 0
            if (r0 == 0) goto L19
            int r1 = r0.A08
            X.Jdo r0 = r4.A0B
            if (r0 == 0) goto L19
            int r0 = r0.A01(r3, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L19
            int r3 = r0.intValue()
        L19:
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r4.A08
            if (r0 == 0) goto L3f
            int r2 = r0.A08
            X.Jdo r1 = r4.A0B
            if (r1 == 0) goto L3f
            r0 = 1
            int r0 = r1.A01(r0, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L3f
            int r0 = r0.intValue()
        L32:
            int r3 = r3 + r0
            android.widget.ImageView r0 = r4.A03
            if (r0 == 0) goto L3d
            int r0 = r0.getHeight()
        L3b:
            int r3 = r3 + r0
            return r3
        L3d:
            r0 = 0
            goto L3b
        L3f:
            r0 = 0
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9LN.A0E():int");
    }

    public final void A0F() {
        Integer num;
        C48596LeY c48596LeY = this.A0w;
        if (c48596LeY != null) {
            if (this.A19.A08.A00 instanceof C81V) {
                num = C05F.A0j;
            } else {
                num = C05F.A0u;
            }
            C14360o3.A0B(num, 0);
            c48596LeY.A09 = num;
            C48215LVp c48215LVp = this.A0A;
            if (c48215LVp != null) {
                c48215LVp.A02(c48596LeY, true);
            }
            this.A16.A04();
        }
    }

    public final void A0G() {
        C48594LeW c48594LeW = this.A0x;
        if (c48594LeW != null) {
            C48215LVp c48215LVp = this.A0A;
            if (c48215LVp != null) {
                c48215LVp.A02(c48594LeW, true);
            }
            C55982hj c55982hj = this.A16;
            if (c55982hj.A09.A00 == this.A0z) {
                c55982hj.A06(r3 * 0.100000024f);
            }
        }
    }

    public final void A0I(AbstractC47286Kux abstractC47286Kux, Integer num) {
        C48591LeT c48591LeT = this.A0v;
        if (c48591LeT != null) {
            c48591LeT.A04 = abstractC47286Kux;
            if (num == null) {
                if (this.A19.A08.A00 instanceof C81V) {
                    num = C05F.A0j;
                } else {
                    num = C05F.A0u;
                }
            }
            c48591LeT.A0D = num;
            C48215LVp c48215LVp = this.A0A;
            if (c48215LVp != null) {
                c48215LVp.A02(c48591LeT, true);
            }
            this.A16.A04();
        }
    }

    public final void A0J(Integer num) {
        C48215LVp c48215LVp;
        this.A0U = num;
        ViewOnFocusChangeListenerC44078Je3 viewOnFocusChangeListenerC44078Je3 = this.A0L;
        if (viewOnFocusChangeListenerC44078Je3 != null) {
            boolean z = false;
            if (!this.A0b && (c48215LVp = this.A0A) != null && c48215LVp.A00 == c48215LVp.A02) {
                z = true;
            }
            viewOnFocusChangeListenerC44078Je3.A06(z, true);
        }
        ViewOnFocusChangeListenerC44078Je3 viewOnFocusChangeListenerC44078Je32 = this.A0L;
        if (viewOnFocusChangeListenerC44078Je32 != null) {
            viewOnFocusChangeListenerC44078Je32.A03();
        }
        if (A0O()) {
            this.A16.A06(this.A0z * 0.100000024f);
        }
    }

    public final void A0L(String str) {
        Object obj;
        Object obj2;
        C148286ly c148286ly;
        String A00;
        C44063Jdo c44063Jdo = this.A0B;
        if (c44063Jdo != null) {
            EnumC150226pU enumC150226pU = EnumC150226pU.A0B;
            Iterator it = c44063Jdo.A07.iterator();
            while (true) {
                obj = null;
                if (it.hasNext()) {
                    obj2 = it.next();
                    if (C14360o3.A0K(((L10) obj2).A01, AbstractC43591JPw.A00(905))) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            L10 l10 = (L10) obj2;
            if (l10 != null) {
                Iterator it2 = l10.A02.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (((C148276lx) next).A00() == enumC150226pU) {
                        obj = next;
                        break;
                    }
                }
                C148276lx c148276lx = (C148276lx) obj;
                if (c148276lx != null && AbstractC166987dD.A1b(c148276lx.A0O) && (c148286ly = (C148286ly) AbstractC001800i.A0J(c148276lx.A0O)) != null) {
                    if (str != null) {
                        c148286ly.A0H = new SimpleImageUrl(str);
                        A00 = "avatar_sticker_customized";
                    } else {
                        A00 = AbstractC111324zv.A00(98);
                    }
                    c148286ly.A0S = A00;
                    C44063Jdo c44063Jdo2 = this.A0B;
                    if (c44063Jdo2 != null) {
                        C0fA.A00(c44063Jdo2, -228683378);
                    }
                }
            }
        }
    }

    public final void A0M(boolean z) {
        Integer num;
        long j;
        boolean z2;
        if (z) {
            num = C05F.A01;
            j = 0;
        } else {
            num = C05F.A0N;
            j = 10000;
        }
        if (this.A07 == null) {
            this.A07 = new C207879Ht(this, 5);
            UserSession userSession = this.A18;
            C447324d c447324d = AnonymousClass229.A01(userSession).A01;
            Location location = null;
            c447324d.A04.A0C("data_request_start", c447324d.A00);
            C1VW c1vw = C1VW.A00;
            if (c1vw != null) {
                location = c1vw.getLastLocation(userSession, __redex_internal_original_name);
            }
            C55U A02 = C1810981l.A02(this.A19);
            C22P c22p = this.A14;
            C183918Ds c183918Ds = this.A1D;
            if (c183918Ds != null) {
                z2 = c183918Ds.A03.A0G;
            } else {
                z2 = false;
            }
            C1ON A00 = AbstractC199098rC.A00(location, c22p, userSession, A02, Boolean.valueOf(z2), num, j);
            A00.A00 = this.A07;
            C1GJ.A03(A00);
        }
    }

    public final boolean A0N() {
        C44063Jdo c44063Jdo = this.A0B;
        if (c44063Jdo != null) {
            for (Object obj : c44063Jdo.A06) {
                if (C14360o3.A0K(((C201068un) obj).A03, "suggested_pinnables")) {
                    if (obj != null) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (r13 > 0.0f) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0P(float r13, boolean r14) {
        /*
            r12 = this;
            X.840 r0 = r12.A1C
            X.83z r0 = r0.A02
            X.83h r0 = r0.A01
            X.81l r2 = r0.A0Y
            X.2hj r8 = r12.A16
            boolean r0 = r8.A0C()
            r11 = 0
            if (r0 == 0) goto L22
            r7 = 1
            if (r2 == 0) goto L23
            X.81W r1 = X.C81W.A0o
            X.81W r0 = X.C81W.A0p
            X.81W[] r0 = new X.C81W[]{r1, r0}
            boolean r0 = r2.A0W(r0)
            if (r0 != r7) goto L23
        L22:
            return r11
        L23:
            X.2hk r5 = r8.A09
            double r3 = r5.A00
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r0 = X.AbstractC167007dF.A1N(r0)
            r10 = 0
            if (r0 == 0) goto L37
            int r0 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            r6 = 1
            if (r0 <= 0) goto L38
        L37:
            r6 = 0
        L38:
            int r9 = r12.A0z
            double r1 = (double) r9
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L44
            int r0 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r0 < 0) goto L44
            r11 = 1
        L44:
            if (r6 != 0) goto L9a
            if (r11 != 0) goto L9a
            boolean r0 = r12.A0O()
            if (r0 != 0) goto L9a
            r3 = 1163575296(0x455ac000, float:3500.0)
            if (r14 == 0) goto L56
            r3 = 1176256512(0x461c4000, float:10000.0)
        L56:
            float r0 = java.lang.Math.abs(r13)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L6a
            int r0 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r0 <= 0) goto L8f
            double r3 = (double) r13
            r8.A07(r3)
        L66:
            r8.A06(r1)
        L69:
            return r7
        L6a:
            if (r14 == 0) goto L73
            float r1 = (float) r9
            r0 = 1036831952(0x3dccccd0, float:0.100000024)
            float r1 = r1 * r0
            double r1 = (double) r1
            goto L66
        L73:
            double r5 = r5.A00
            float r10 = (float) r9
            r0 = 1036831952(0x3dccccd0, float:0.100000024)
            float r9 = r10 * r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r9 / r0
            double r3 = (double) r0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L97
            r0 = 1057803469(0x3f0ccccd, float:0.55)
            float r10 = r10 * r0
            double r3 = (double) r10
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L66
            double r1 = (double) r9
            goto L66
        L8f:
            int r0 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r0 >= 0) goto L69
            double r0 = (double) r13
            r8.A07(r0)
        L97:
            r1 = 0
            goto L66
        L9a:
            r12.Dnk(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9LN.A0P(float, boolean):boolean");
    }

    @Override // X.MSD
    public final java.util.Set Acr() {
        return this.A1U;
    }

    @Override // X.MOQ
    public final Integer Acu() {
        return this.A0U;
    }

    @Override // X.MSD
    public final /* synthetic */ boolean CJQ() {
        return false;
    }

    @Override // X.MQR
    public final boolean CTa() {
        if (!this.A1C.A02.A0A()) {
            if (!C1810981l.A05(C81W.A0D, this.A19) && !this.A0i) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.MQR
    public final boolean CWM() {
        return this.A19.A08.A00 instanceof C81V;
    }

    @Override // X.MQR
    public final boolean CWS() {
        return this.A19.A08.A00 instanceof C208509Kk;
    }

    @Override // X.InterfaceC50496MQz
    public final void CxP() {
        C46016KYe c46016KYe;
        UserSession userSession = this.A18;
        C20Y.A00(userSession).A04(new B8U(this, 1));
        A06(this);
        this.A16.A04();
        int i = 2;
        C150956qv.A08(new View[]{this.A08, this.A0S}, true);
        C46016KYe c46016KYe2 = this.A0M;
        if (c46016KYe2 != null && !c46016KYe2.A03) {
            c46016KYe2.A03 = true;
            c46016KYe2.A06.A9e(c46016KYe2);
            KEH keh = c46016KYe2.A09;
            ArrayList A02 = c46016KYe2.A08.A02();
            ArrayList arrayList = keh.A0D;
            arrayList.clear();
            arrayList.addAll(A02);
            KEH.A01(keh);
            ArrayList A0U = AbstractC001800i.A0U(c46016KYe2.A0C.A00);
            ArrayList arrayList2 = keh.A0A;
            arrayList2.clear();
            arrayList2.addAll(A0U);
            KEH.A01(keh);
            AbstractC167007dF.A0y(c46016KYe2.A04, true);
            C46016KYe.A00(c46016KYe2, false);
        }
        ViewOnFocusChangeListenerC44078Je3 viewOnFocusChangeListenerC44078Je3 = this.A0L;
        if (viewOnFocusChangeListenerC44078Je3 != null && (c46016KYe = this.A0M) != null) {
            c46016KYe.A01(AbstractC167007dF.A0g(viewOnFocusChangeListenerC44078Je3.A04), true);
        }
        AbstractC167007dF.A0x(this.A04);
        C22C A01 = AnonymousClass229.A01(userSession);
        if (this.A0U == C05F.A0C) {
            i = 3;
        }
        ((C22F) A01).A04.A03 = i;
    }

    @Override // X.InterfaceC58154PqJ
    public final void DUT() {
        C8NW c8nw = (C8NW) this.A1A;
        if (!(c8nw.A0t.A08.A00 instanceof C81U)) {
            AnonymousClass877 anonymousClass877 = c8nw.A17;
            Drawable A10 = c8nw.A10();
            if (A10 == null) {
                AnonymousClass877.A01(anonymousClass877);
                anonymousClass877.A04.A00();
                anonymousClass877.A02().E4S();
                return;
            }
            AnonymousClass877.A00(A10, anonymousClass877);
        }
    }

    @Override // X.InterfaceC58154PqJ
    public final void DUU() {
        C20Y.A00(this.A18).A04(new B8U(this, 2));
    }

    @Override // X.InterfaceC58154PqJ
    public final void DUV() {
        ((C8NW) this.A1A).A17.A02().pause();
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        C44063Jdo c44063Jdo;
        C48215LVp c48215LVp;
        if (this.A0k) {
            A07(this);
            return;
        }
        C55992hk c55992hk = this.A16.A09;
        if (c55992hk.A00 == this.A0z) {
            A03();
            ViewGroup viewGroup = this.A02;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            AbstractC167007dF.A0x(this.A09);
            ViewOnFocusChangeListenerC44078Je3 viewOnFocusChangeListenerC44078Je3 = this.A0L;
            if (viewOnFocusChangeListenerC44078Je3 != null) {
                boolean z = true;
                if (this.A0b || (c48215LVp = this.A0A) == null || c48215LVp.A00 != c48215LVp.A02) {
                    z = false;
                }
                viewOnFocusChangeListenerC44078Je3.A06(z, false);
            }
            if (!A0N() || (c44063Jdo = this.A0B) == null) {
                return;
            }
            C0fA.A00(c44063Jdo, 1710066081);
            return;
        }
        if (A0O()) {
            return;
        }
        ViewOnFocusChangeListenerC44078Je3 viewOnFocusChangeListenerC44078Je32 = this.A0L;
        if (viewOnFocusChangeListenerC44078Je32 != null) {
            viewOnFocusChangeListenerC44078Je32.A04.sendAccessibilityEvent(8);
        }
        if (!A0N() || c55992hk.A00 >= A00(this)) {
            return;
        }
        A04();
    }

    @Override // X.MSD
    public final void E2K() {
        C48215LVp c48215LVp;
        ViewOnFocusChangeListenerC44078Je3 viewOnFocusChangeListenerC44078Je3 = this.A0L;
        if (viewOnFocusChangeListenerC44078Je3 != null) {
            boolean z = true;
            if (this.A0b || (c48215LVp = this.A0A) == null || c48215LVp.A00 != c48215LVp.A02) {
                z = false;
            }
            viewOnFocusChangeListenerC44078Je3.A06(z, false);
        }
    }

    @Override // X.InterfaceC50496MQz
    public final /* synthetic */ boolean EiJ() {
        return true;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        if (this.A19.A08.A00 instanceof C81V) {
            return "clips_sticker_tray";
        }
        return "story_stickers_tray";
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.A0t = f2;
        return true;
    }

    public static final void A0B(C9LN c9ln, boolean z) {
        if (c9ln.A0O()) {
            C22C A01 = AnonymousClass229.A01(c9ln.A18);
            A01.A1R(((C22F) A01).A04.A0C, "STICKER_TRAY_PEEK");
        }
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = c9ln.A09;
        if (touchInterceptorFrameLayout != null && touchInterceptorFrameLayout.getVisibility() == 0) {
            C55982hj c55982hj = c9ln.A16;
            int i = c9ln.A0z;
            if (z) {
                c55982hj.A06(i);
            } else {
                c55982hj.A08(i, true);
                c9ln.Dnk(c55982hj);
            }
        }
    }

    public final boolean A0O() {
        if (A0N()) {
            C55982hj c55982hj = this.A16;
            if (c55982hj.A09.A00 == A00(this) && c55982hj.A0C()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC50496MQz
    public final void CxO() {
        TextView textView;
        A06(this);
        C46016KYe c46016KYe = this.A0M;
        if (c46016KYe != null) {
            c46016KYe.A03 = false;
            c46016KYe.A06.EFx(c46016KYe);
            C150956qv.A08(new View[]{c46016KYe.A04}, true);
            C46016KYe.A00(c46016KYe, false);
        }
        AbstractC125325le.A04(new C44065Jdq(this, 6), new View[]{this.A08}, true);
        if (this.A0y) {
            AbstractC167007dF.A0y(this.A0S, true);
        }
        UserSession userSession = this.A18;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        C183918Ds c183918Ds = this.A1D;
        if (c183918Ds != null && !c183918Ds.A03.A0G && AbstractC166987dD.A10(userSession).A2I()) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36321572054705780L)) {
                ViewOnFocusChangeListenerC44078Je3 viewOnFocusChangeListenerC44078Je3 = this.A0L;
                if (viewOnFocusChangeListenerC44078Je3 != null) {
                    viewOnFocusChangeListenerC44078Je3.A02.setVisibility(0);
                    viewOnFocusChangeListenerC44078Je3.A04.setVisibility(0);
                }
                AbstractC167007dF.A0x(this.A05);
                if (A00.A01.getInt("ads_mode_sticker_tray_banner_impression_count", 0) < C18U.A01(c06090Tz, userSession, 36603047031542649L) && (textView = this.A04) != null) {
                    textView.setVisibility(0);
                }
            }
        }
        ((C22F) AnonymousClass229.A01(userSession)).A04.A03 = 1;
    }

    @Override // X.MSD
    public final boolean isScrolledToBottom() {
        C3FQ A02 = A02();
        if (A02 != null) {
            return A02.CQ5();
        }
        return false;
    }

    @Override // X.MSD
    public final boolean isScrolledToTop() {
        C3FQ A02 = A02();
        if (A02 != null) {
            return A02.CQ6();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean A0O = A0O();
        boolean z = this.A0a;
        if (A0O) {
            if (z) {
                this.A0a = false;
                this.A00 = f2;
            }
            if (f2 > 0.0f) {
                this.A16.A06(this.A0z * 0.100000024f);
                A04();
            } else {
                A0B(this, true);
                return true;
            }
        } else {
            if (z) {
                this.A0a = false;
                this.A00 = f2;
                return true;
            }
            if (this.A0Y) {
                A08(this, f2);
                return true;
            }
        }
        return true;
    }

    @Override // X.MON
    public final void DTh(MSD msd, MSD msd2, float f) {
        AbstractC167017dG.A1N(msd, msd2);
    }

    public C9LN(Activity activity, View view, ViewStub viewStub, Fragment fragment, AbstractC10360h2 abstractC10360h2, AbstractC018607g abstractC018607g, C22P c22p, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C3I9 c3i9, C1810981l c1810981l, C8NZ c8nz, TargetViewSizeProvider targetViewSizeProvider, C22875A6v c22875A6v, AnonymousClass840 anonymousClass840, C183918Ds c183918Ds, InterfaceC1810081c interfaceC1810081c, AnonymousClass844 anonymousClass844, C677733r c677733r, Map map, java.util.Set set, InterfaceC08830cm interfaceC08830cm, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        C14360o3.A0B(viewStub, 8);
        this.A1C = anonymousClass840;
        this.A1E = interfaceC1810081c;
        this.A1L = fragment;
        this.A1N = abstractC018607g;
        this.A1M = abstractC10360h2;
        this.A13 = view;
        this.A1B = c22875A6v;
        this.A1K = viewStub;
        this.A18 = userSession;
        this.A1R = anonymousClass844;
        this.A1S = c677733r;
        this.A1A = c8nz;
        this.A1O = c3i9;
        this.A1V = interfaceC08830cm;
        this.A19 = c1810981l;
        this.A14 = c22p;
        this.A11 = activity;
        this.A17 = interfaceC11380iw;
        this.A1D = c183918Ds;
        this.A1W = interfaceC16820sZ;
        this.A1X = interfaceC16820sZ2;
        this.A0W = map;
        this.A1P = new C8O6(userSession);
        this.A1Q = new A5A();
        this.A0U = C05F.A0Y;
        this.A1F = AbstractC09440dt.A01(new MHQ(this, 49));
        Context context = view.getContext();
        C55982hj A0R = AbstractC167007dF.A0R();
        A0R.A06 = true;
        this.A16 = A0R;
        GestureDetector gestureDetector = new GestureDetector(context, this, AbstractC167007dF.A0J());
        this.A12 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.A1G = ViewConfiguration.get(context).getScaledTouchSlop();
        this.A1U = new LinkedHashSet();
        this.A1I = context.getColor(R.color.black_30_transparent);
        this.A10 = context.getColor((!(this.A19.A08.A00 instanceof C128535rM) || AbstractC43840Ja3.A00(userSession)) ? AbstractC53242c7.A0H(activity, R.attr.igds_color_tag_or_toast_background) : R.color.igds_banner_background);
        this.A1T = set;
        NineSixteenLayoutConfigImpl nineSixteenLayoutConfigImpl = (NineSixteenLayoutConfigImpl) targetViewSizeProvider;
        InterfaceC1812882f interfaceC1812882f = nineSixteenLayoutConfigImpl.A0K;
        this.A1H = interfaceC1812882f.getWidth();
        this.A0z = (interfaceC1812882f.getHeight() - nineSixteenLayoutConfigImpl.A0D) - targetViewSizeProvider.BRK();
        this.A15 = C006802i.A0p;
        this.A1J = new ViewOnTouchListenerC209789Po(this, 1);
    }
}
