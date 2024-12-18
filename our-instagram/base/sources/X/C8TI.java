package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.8TI, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8TI implements AnonymousClass851 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public InterfaceC193858i6 A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final int A0A;
    public final int A0B;
    public final Context A0C;
    public final Rect A0D;
    public final GestureDetector A0E;
    public final GestureDetector A0F;
    public final ScaleGestureDetector A0G;
    public final TouchInterceptorFrameLayout A0H;
    public final C1810981l A0I;
    public final C183688Ct A0J;
    public final C8HI A0K;
    public final C184328Fw A0L;
    public final C88D A0M;
    public final C8SW A0N;
    public final C8TK A0O;
    public final C8TJ A0P;
    public final C1814382v A0Q;
    public final InterfaceC1810081c A0R;
    public final C89E A0S;
    public final java.util.Set A0T;
    public final boolean A0U;
    public final UserSession A0V;

    /* JADX WARN: Type inference failed for: r0v8, types: [X.8TJ] */
    public C8TI(Context context, UserSession userSession, TouchInterceptorFrameLayout touchInterceptorFrameLayout, C1810981l c1810981l, C183688Ct c183688Ct, C8HI c8hi, C184328Fw c184328Fw, C88D c88d, C8SW c8sw, C1814382v c1814382v, InterfaceC1810081c interfaceC1810081c, C89E c89e, boolean z) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(c1810981l, 2);
        C14360o3.A0B(touchInterceptorFrameLayout, 4);
        C14360o3.A0B(userSession, 13);
        this.A0C = context;
        this.A0I = c1810981l;
        this.A0R = interfaceC1810081c;
        this.A0H = touchInterceptorFrameLayout;
        this.A0K = c8hi;
        this.A0J = c183688Ct;
        this.A0N = c8sw;
        this.A0Q = c1814382v;
        this.A0M = c88d;
        this.A0S = c89e;
        this.A0U = z;
        this.A0L = c184328Fw;
        this.A0V = userSession;
        this.A0T = new HashSet();
        this.A0P = new View.OnTouchListener() { // from class: X.8TJ
            /* JADX WARN: Code restructure failed: missing block: B:100:0x01ab, code lost:
            
                if (r12 != false) goto L116;
             */
            /* JADX WARN: Code restructure failed: missing block: B:101:0x01ad, code lost:
            
                if (r11 != false) goto L188;
             */
            /* JADX WARN: Code restructure failed: missing block: B:102:0x01af, code lost:
            
                if (r7 != false) goto L189;
             */
            /* JADX WARN: Code restructure failed: missing block: B:103:0x01b1, code lost:
            
                if (r1 == false) goto L185;
             */
            /* JADX WARN: Code restructure failed: missing block: B:104:?, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:105:?, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:106:?, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:107:0x01b3, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:108:0x01b5, code lost:
            
                r2 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:109:0x01a6, code lost:
            
                r1 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:110:0x016d, code lost:
            
                r7 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:112:0x0142, code lost:
            
                if (r14 != false) goto L75;
             */
            /* JADX WARN: Code restructure failed: missing block: B:157:0x0256, code lost:
            
                if ((r1 instanceof X.C218119kj) == false) goto L68;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x00c6, code lost:
            
                if (r2 != 2) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:179:0x02ae, code lost:
            
                if (r8.A0X() != false) goto L69;
             */
            /* JADX WARN: Code restructure failed: missing block: B:180:0x0133, code lost:
            
                if (r14 != false) goto L69;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
            
                if (r1.CRB(X.EnumC1810181d.A0O) == false) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:62:0x013f, code lost:
            
                if (r3.A07 == false) goto L73;
             */
            /* JADX WARN: Code restructure failed: missing block: B:63:0x0144, code lost:
            
                r11 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:64:0x0147, code lost:
            
                if (r3.A08 != false) goto L78;
             */
            /* JADX WARN: Code restructure failed: missing block: B:65:0x0149, code lost:
            
                r11 = false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:67:0x014b, code lost:
            
                if (r13 == false) goto L88;
             */
            /* JADX WARN: Code restructure failed: missing block: B:69:0x014f, code lost:
            
                if (r3.A08 == false) goto L88;
             */
            /* JADX WARN: Code restructure failed: missing block: B:71:0x0155, code lost:
            
                if (r3.A02 == 0.0f) goto L88;
             */
            /* JADX WARN: Code restructure failed: missing block: B:72:0x0157, code lost:
            
                r9 = r3.A06;
             */
            /* JADX WARN: Code restructure failed: missing block: B:73:0x0159, code lost:
            
                if (r9 == null) goto L88;
             */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x015b, code lost:
            
                r7 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:75:0x016b, code lost:
            
                if (r9.FAE(r3.A00, r3.A01, r18.getRawY() - r3.A01) == true) goto L89;
             */
            /* JADX WARN: Code restructure failed: missing block: B:76:0x016e, code lost:
            
                if (r14 == false) goto L109;
             */
            /* JADX WARN: Code restructure failed: missing block: B:78:0x0172, code lost:
            
                if (r3.A07 == false) goto L109;
             */
            /* JADX WARN: Code restructure failed: missing block: B:80:0x0178, code lost:
            
                if (r3.A02 != 0.0f) goto L109;
             */
            /* JADX WARN: Code restructure failed: missing block: B:81:0x017a, code lost:
            
                r6 = r3.A01;
             */
            /* JADX WARN: Code restructure failed: missing block: B:82:0x017e, code lost:
            
                if (r2.A25 == false) goto L109;
             */
            /* JADX WARN: Code restructure failed: missing block: B:83:0x0180, code lost:
            
                r4 = r2.A1B;
             */
            /* JADX WARN: Code restructure failed: missing block: B:84:0x0182, code lost:
            
                if (r4 == null) goto L109;
             */
            /* JADX WARN: Code restructure failed: missing block: B:85:0x0184, code lost:
            
                r1 = r4.A00;
                r2 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:86:0x0189, code lost:
            
                if (r1 != 0.0f) goto L103;
             */
            /* JADX WARN: Code restructure failed: missing block: B:87:0x018b, code lost:
            
                r0 = r4.A05;
             */
            /* JADX WARN: Code restructure failed: missing block: B:88:0x018d, code lost:
            
                if (r0 == null) goto L183;
             */
            /* JADX WARN: Code restructure failed: missing block: B:89:0x018f, code lost:
            
                r1 = X.AbstractC13880nE.A0G(r0.A0D).top;
                r4.A00 = r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:91:0x02b9, code lost:
            
                throw new java.lang.IllegalStateException("Required value was null.");
             */
            /* JADX WARN: Code restructure failed: missing block: B:93:0x019b, code lost:
            
                if (r1 == 0.0f) goto L118;
             */
            /* JADX WARN: Code restructure failed: missing block: B:95:0x019f, code lost:
            
                if (r6 <= r1) goto L118;
             */
            /* JADX WARN: Code restructure failed: missing block: B:96:0x01a1, code lost:
            
                r4.A06 = r2;
                r1 = true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:97:0x01a4, code lost:
            
                if (r2 != false) goto L110;
             */
            /* JADX WARN: Code restructure failed: missing block: B:99:0x01a9, code lost:
            
                if (r3.A09 != false) goto L186;
             */
            /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x0107  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x0111  */
            @Override // android.view.View.OnTouchListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean onTouch(android.view.View r17, android.view.MotionEvent r18) {
                /*
                    Method dump skipped, instructions count: 700
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C8TJ.onTouch(android.view.View, android.view.MotionEvent):boolean");
            }
        };
        this.A0O = new C8TK(this);
        this.A0D = new Rect();
        Handler handler = new Handler(Looper.getMainLooper());
        GestureDetector gestureDetector = new GestureDetector(context, new C5SZ() { // from class: X.8TL
            @Override // X.C5SZ, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                C14360o3.A0B(motionEvent2, 1);
                if (motionEvent == null) {
                    return false;
                }
                C8TI c8ti = C8TI.this;
                c8ti.A03 = motionEvent2.getRawY() - motionEvent.getRawY();
                c8ti.A04 = f;
                c8ti.A05 = f2;
                Iterator it = c8ti.A0T.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1829689r) it.next()).DHW(motionEvent2, f, f2, c8ti.A07, c8ti.A08);
                }
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
                C8TI c8ti = C8TI.this;
                c8ti.A07 = true;
                c8ti.A08 = true;
                c8ti.A09 = true;
            }

            @Override // X.C5SZ, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                C8TI c8ti = C8TI.this;
                Iterator it = c8ti.A0T.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1829689r) it.next()).Dir(f, f2, c8ti.A00, c8ti.A01, c8ti.A07, c8ti.A08);
                }
                return true;
            }
        }, handler);
        gestureDetector.setIsLongpressEnabled(C18U.A06(C06090Tz.A06, userSession, 36318501153020132L));
        this.A0F = gestureDetector;
        C8TM c8tm = new C8TM(this);
        this.A0E = new GestureDetector(context, c8tm, handler);
        this.A0G = new ScaleGestureDetector(context, c8tm);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.A0B = viewConfiguration.getScaledTouchSlop();
        this.A0A = viewConfiguration.getScaledEdgeSlop();
    }

    @Override // X.AnonymousClass851
    public final void DJ2(float f, float f2) {
        this.A02 = f;
    }
}
