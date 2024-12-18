package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.6Pz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnTouchListenerC138696Pz implements View.OnTouchListener {
    public int A00;
    public int A01;
    public long A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final Context A06;
    public final Handler A07;
    public final GestureDetector.OnGestureListener A08;
    public final C38161q3 A09;
    public final UserSession A0A;
    public final C141596ac A0B;
    public final InterfaceC145426h1 A0C;
    public final InterfaceC09390do A0D;
    public final int A0E;
    public final int A0F;
    public final C41181vS A0G;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C14360o3.A0B(view, 0);
        C14360o3.A0B(motionEvent, 1);
        C41181vS c41181vS = this.A0G;
        if (c41181vS.A15() || c41181vS.A1N() || c41181vS.A1J()) {
            return false;
        }
        InterfaceC145426h1 interfaceC145426h1 = this.A0C;
        C84823qW Bx4 = interfaceC145426h1.Bx4();
        this.A01 = view.getWidth();
        this.A00 = view.getHeight();
        boolean onTouchEvent = ((GestureDetector) this.A0D.getValue()).onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                this.A02 = System.currentTimeMillis();
            }
        } else if (onTouchEvent) {
            if (Bx4 != null && Bx4.A1g.equals("interactive_media_tooltip_from_tap_and_hold") && interfaceC145426h1.Bx4() == null) {
                interfaceC145426h1.Dwo(true);
                return onTouchEvent;
            }
        } else {
            if (this.A03 && AbstractC28067CYv.A01(this.A09)) {
                interfaceC145426h1.DJz(A00(motionEvent, this, "interactive_media_tooltip_from_tap_and_hold"), false);
                return onTouchEvent;
            }
            if (Bx4 != null && Bx4.A1g.equals("interactive_media_tooltip_from_tap_and_hold")) {
                return onTouchEvent;
            }
            if (!interfaceC145426h1.CWp()) {
                interfaceC145426h1.Dwo(false);
                return onTouchEvent;
            }
        }
        return onTouchEvent;
    }

    public static final C84823qW A00(MotionEvent motionEvent, ViewOnTouchListenerC138696Pz viewOnTouchListenerC138696Pz, String str) {
        C84823qW c84823qW = new C84823qW();
        c84823qW.A12 = EnumC75383a5.A0P;
        c84823qW.A03 = motionEvent.getRawX();
        c84823qW.A04 = motionEvent.getRawY() - viewOnTouchListenerC138696Pz.A0E;
        c84823qW.A1q = true;
        c84823qW.A1g = str;
        c84823qW.A1O = AbstractC149536o5.A03(viewOnTouchListenerC138696Pz.A06, viewOnTouchListenerC138696Pz.A0A, viewOnTouchListenerC138696Pz.A0G);
        c84823qW.A08 = viewOnTouchListenerC138696Pz.A0F;
        return c84823qW;
    }

    public ViewOnTouchListenerC138696Pz(Context context, UserSession userSession, Reel reel, C41181vS c41181vS, C141596ac c141596ac, InterfaceC145426h1 interfaceC145426h1) {
        int i;
        this.A06 = context;
        this.A0A = userSession;
        this.A0G = c41181vS;
        this.A0B = c141596ac;
        this.A0C = interfaceC145426h1;
        this.A09 = reel.A0A;
        this.A05 = AbstractC13890nF.A01(context);
        this.A04 = AbstractC84863qa.A02(context);
        this.A0F = (int) C18U.A01(C06090Tz.A06, userSession, 36600504411557791L);
        if (C143726eF.A0B(context)) {
            i = C143726eF.A03(context);
        } else {
            i = 0;
        }
        this.A0E = i;
        this.A0D = AbstractC09440dt.A01(new C9EH(this, 28));
        this.A07 = new Handler(Looper.getMainLooper());
        this.A08 = new GestureDetector.SimpleOnGestureListener() { // from class: X.6Q0
            public boolean A00;

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                String str;
                C14360o3.A0B(motionEvent, 0);
                ViewOnTouchListenerC138696Pz viewOnTouchListenerC138696Pz = ViewOnTouchListenerC138696Pz.this;
                viewOnTouchListenerC138696Pz.A03 = false;
                InterfaceC145426h1 interfaceC145426h12 = viewOnTouchListenerC138696Pz.A0C;
                C84823qW Bx4 = interfaceC145426h12.Bx4();
                if (Bx4 == null || (str = Bx4.A1g) == null) {
                    str = "interactive_media_tooltip_from_tap";
                }
                interfaceC145426h12.DB0(ViewOnTouchListenerC138696Pz.A00(motionEvent, viewOnTouchListenerC138696Pz, str));
                return super.onDoubleTap(motionEvent);
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
            
                if (r10 != null) goto L7;
             */
            /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean onDown(android.view.MotionEvent r16) {
                /*
                    r15 = this;
                    r0 = 0
                    r9 = r16
                    X.C14360o3.A0B(r9, r0)
                    X.6Pz r2 = X.ViewOnTouchListenerC138696Pz.this
                    int r7 = r2.A05
                    int r6 = r2.A04
                    X.1q3 r10 = r2.A09
                    if (r10 == 0) goto L75
                    java.lang.Float r0 = r10.A02
                    if (r0 == 0) goto L75
                    float r1 = r0.floatValue()
                L18:
                    java.lang.Float r0 = r10.A03
                    if (r0 == 0) goto L79
                    float r0 = r0.floatValue()
                L20:
                    android.graphics.RectF r8 = new android.graphics.RectF
                    r8.<init>(r1, r0, r1, r0)
                    float r1 = (float) r7
                    float r0 = r8.left
                    float r0 = r0 * r1
                    int r5 = (int) r0
                    float r0 = r8.right
                    float r1 = r1 * r0
                    int r4 = (int) r1
                    float r3 = (float) r6
                    float r0 = r8.top
                    float r0 = r0 * r3
                    int r1 = (int) r0
                    float r0 = r8.bottom
                    float r3 = r3 * r0
                    int r0 = (int) r3
                    int r7 = r7 - r4
                    int r6 = r6 - r0
                    android.graphics.Rect r3 = new android.graphics.Rect
                    r3.<init>(r5, r1, r7, r6)
                    float r0 = r9.getRawX()
                    int r1 = (int) r0
                    float r0 = r9.getRawY()
                    int r0 = (int) r0
                    boolean r0 = r3.contains(r1, r0)
                    if (r0 == 0) goto L73
                    X.6ac r12 = r2.A0B
                    com.instagram.common.session.UserSession r11 = r2.A0A
                    int r13 = r2.A01
                    int r14 = r2.A00
                    boolean r0 = X.AbstractC28067CYv.A00(r9, r10, r11, r12, r13, r14)
                    if (r0 != 0) goto L62
                    boolean r0 = X.AbstractC28067CYv.A01(r10)
                    if (r0 == 0) goto L73
                L62:
                    r0 = 1
                L63:
                    r15.A00 = r0
                    if (r0 == 0) goto L70
                    X.6h1 r1 = r2.A0C
                    float r0 = r9.getRawX()
                    r1.DBc(r0)
                L70:
                    boolean r0 = r15.A00
                    return r0
                L73:
                    r0 = 0
                    goto L63
                L75:
                    r1 = 0
                    if (r10 == 0) goto L79
                    goto L18
                L79:
                    r0 = 0
                    goto L20
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C6Q0.onDown(android.view.MotionEvent):boolean");
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
                C14360o3.A0B(motionEvent, 0);
                if (this.A00) {
                    ViewOnTouchListenerC138696Pz viewOnTouchListenerC138696Pz = ViewOnTouchListenerC138696Pz.this;
                    InterfaceC145426h1 interfaceC145426h12 = viewOnTouchListenerC138696Pz.A0C;
                    boolean CWp = interfaceC145426h12.CWp();
                    if (!AbstractC28067CYv.A01(viewOnTouchListenerC138696Pz.A09) && CWp) {
                        viewOnTouchListenerC138696Pz.A03 = false;
                        interfaceC145426h12.DsB(motionEvent.getRawX(), motionEvent.getRawY());
                        return;
                    }
                    viewOnTouchListenerC138696Pz.A03 = !CWp;
                    interfaceC145426h12.DQV(motionEvent.getRawX(), motionEvent.getRawY());
                    if (CWp) {
                        return;
                    }
                    viewOnTouchListenerC138696Pz.A07.postDelayed(new RunnableC29587D1o(motionEvent, viewOnTouchListenerC138696Pz), 400L);
                }
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                C14360o3.A0B(motionEvent, 0);
                ViewOnTouchListenerC138696Pz viewOnTouchListenerC138696Pz = ViewOnTouchListenerC138696Pz.this;
                viewOnTouchListenerC138696Pz.A03 = false;
                InterfaceC145426h1 interfaceC145426h12 = viewOnTouchListenerC138696Pz.A0C;
                boolean CWp = interfaceC145426h12.CWp();
                if (!AbstractC28067CYv.A00(motionEvent, viewOnTouchListenerC138696Pz.A09, viewOnTouchListenerC138696Pz.A0A, viewOnTouchListenerC138696Pz.A0B, viewOnTouchListenerC138696Pz.A01, viewOnTouchListenerC138696Pz.A00) && !CWp) {
                    interfaceC145426h12.DsB(motionEvent.getRawX(), motionEvent.getRawY());
                    return false;
                }
                interfaceC145426h12.DJz(ViewOnTouchListenerC138696Pz.A00(motionEvent, viewOnTouchListenerC138696Pz, "interactive_media_tooltip_from_tap"), CWp);
                return true;
            }
        };
        this.A02 = -1L;
    }
}
