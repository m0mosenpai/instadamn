package X;

import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.30g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnTouchListenerC668930g implements View.OnTouchListener {
    public int A00;
    public MotionEvent A02;
    public MotionEvent A03;
    public C55982hj A04;
    public C55982hj A05;
    public UserSession A06;
    public HandlerC669030h A07;
    public AbstractC668830f A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public float A0E;
    public float A0F;
    public float A0G;
    public float A0H;
    public static final C55942hf A0J = C55942hf.A03(10.0d, 13.0d);
    public static final int A0I = ViewConfiguration.getTapTimeout();
    public static final int A0K = ViewConfiguration.getTapTimeout();
    public boolean A0D = true;
    public long A01 = A0I;

    static {
        ViewConfiguration.getTapTimeout();
    }

    public final void A00() {
        this.A07.removeCallbacksAndMessages(null);
        C55982hj c55982hj = this.A05;
        c55982hj.A06(0.0d);
        C55982hj c55982hj2 = this.A04;
        c55982hj2.A06(0.0d);
        c55982hj.A08(0.0d, true);
        c55982hj2.A08(0.0d, true);
        this.A09 = false;
    }

    public final void A01() {
        C55982hj c55982hj = this.A05;
        c55982hj.A06(0.0d);
        if (c55982hj.A09.A00 == 0.0d) {
            this.A08.A05(this.A02, c55982hj);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.Handler, X.30h] */
    public ViewOnTouchListenerC668930g(Context context, UserSession userSession, AbstractC668830f abstractC668830f) {
        WeakReference weakReference = new WeakReference(this);
        ?? handler = new Handler();
        handler.A00 = weakReference;
        this.A07 = handler;
        this.A06 = userSession;
        this.A08 = abstractC668830f;
        if (abstractC668830f != null) {
            int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            this.A00 = scaledTouchSlop * scaledTouchSlop * 2;
            C55952hg A00 = AbstractC13560mi.A00();
            C55982hj A02 = A00.A02();
            A02.A00 = 0.019999999552965164d;
            A02.A09(AbstractC669130i.A00);
            A02.A0A(new C668630d() { // from class: X.30j
                @Override // X.C668630d, X.InterfaceC55932he
                public final void Dnk(C55982hj c55982hj) {
                    ViewOnTouchListenerC668930g viewOnTouchListenerC668930g = ViewOnTouchListenerC668930g.this;
                    int i = ViewOnTouchListenerC668930g.A0I;
                    viewOnTouchListenerC668930g.A07.removeMessages(2);
                    viewOnTouchListenerC668930g.A0C = false;
                    if (c55982hj.A09.A00 == 1.0d) {
                        viewOnTouchListenerC668930g.A08.A01(viewOnTouchListenerC668930g.A02);
                    }
                    viewOnTouchListenerC668930g.A08.A05(viewOnTouchListenerC668930g.A02, c55982hj);
                }

                @Override // X.C668630d, X.InterfaceC55932he
                public final void Dnl(C55982hj c55982hj) {
                    if (c55982hj.A01 == 1.0d) {
                        c55982hj.A06 = false;
                        ViewOnTouchListenerC668930g viewOnTouchListenerC668930g = ViewOnTouchListenerC668930g.this;
                        viewOnTouchListenerC668930g.A0C = true;
                        viewOnTouchListenerC668930g.A09 = false;
                        return;
                    }
                    c55982hj.A06 = true;
                    ViewOnTouchListenerC668930g.this.A0C = false;
                }

                @Override // X.C668630d, X.InterfaceC55932he
                public final void Dnm(C55982hj c55982hj) {
                    ViewOnTouchListenerC668930g viewOnTouchListenerC668930g = ViewOnTouchListenerC668930g.this;
                    int i = ViewOnTouchListenerC668930g.A0I;
                    viewOnTouchListenerC668930g.A08.A06(viewOnTouchListenerC668930g.A02, c55982hj);
                }
            });
            this.A05 = A02;
            C55982hj A022 = A00.A02();
            A022.A09(A0J);
            A022.A00 = 0.019999999552965164d;
            A022.A0A(new C668630d() { // from class: X.30k
                @Override // X.C668630d, X.InterfaceC55932he
                public final void Dnk(C55982hj c55982hj) {
                    ViewOnTouchListenerC668930g viewOnTouchListenerC668930g = ViewOnTouchListenerC668930g.this;
                    viewOnTouchListenerC668930g.A0B = false;
                    if (c55982hj.A09.A00 == 1.0d) {
                        viewOnTouchListenerC668930g.A0A = true;
                    } else {
                        viewOnTouchListenerC668930g.A0B = false;
                    }
                    viewOnTouchListenerC668930g.A08.A03(viewOnTouchListenerC668930g.A02, c55982hj);
                }

                @Override // X.C668630d, X.InterfaceC55932he
                public final void Dnl(C55982hj c55982hj) {
                    if (c55982hj.A01 == 1.0d) {
                        c55982hj.A06 = false;
                        return;
                    }
                    c55982hj.A06 = true;
                    ViewOnTouchListenerC668930g viewOnTouchListenerC668930g = ViewOnTouchListenerC668930g.this;
                    viewOnTouchListenerC668930g.A0A = false;
                    viewOnTouchListenerC668930g.A0B = false;
                }

                @Override // X.C668630d, X.InterfaceC55932he
                public final void Dnm(C55982hj c55982hj) {
                    ViewOnTouchListenerC668930g viewOnTouchListenerC668930g = ViewOnTouchListenerC668930g.this;
                    int i = ViewOnTouchListenerC668930g.A0I;
                    viewOnTouchListenerC668930g.A08.A04(viewOnTouchListenerC668930g.A03, c55982hj);
                }
            });
            this.A04 = A022;
            return;
        }
        throw new IllegalStateException("OnGestureListener must not be null");
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        int i;
        boolean z2 = false;
        if (motionEvent.getActionMasked() == 6) {
            z = true;
            i = motionEvent.getActionIndex();
        } else {
            z = false;
            i = -1;
        }
        int pointerCount = motionEvent.getPointerCount();
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < pointerCount; i2++) {
            if (i != i2) {
                f += motionEvent.getX(i2);
                f2 += motionEvent.getY(i2);
            }
        }
        if (z) {
            pointerCount--;
        }
        float f3 = pointerCount;
        float f4 = f / f3;
        float f5 = f2 / f3;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        this.A07.removeCallbacksAndMessages(null);
                        this.A05.A06(0.0d);
                        this.A04.A06(0.0d);
                        this.A09 = false;
                        this.A08.A00(motionEvent);
                    }
                } else {
                    float f6 = this.A0G - f4;
                    float f7 = this.A0H - f5;
                    if (this.A09) {
                        int i3 = (int) (f4 - this.A0E);
                        int i4 = (int) (f5 - this.A0F);
                        if ((i3 * i3) + (i4 * i4) > this.A00) {
                            AbstractC668830f abstractC668830f = this.A08;
                            this.A0G = f4;
                            this.A0H = f5;
                            this.A09 = false;
                            if (!this.A0C) {
                                HandlerC669030h handlerC669030h = this.A07;
                                handlerC669030h.removeMessages(1);
                                handlerC669030h.removeMessages(2);
                                return false;
                            }
                            this.A0B = false;
                            abstractC668830f.A02(motionEvent);
                            this.A05.A04();
                            return false;
                        }
                    } else if (Math.abs(f6) >= 1.0f || Math.abs(f7) >= 1.0f) {
                        if (!this.A0C) {
                            MotionEvent motionEvent2 = this.A03;
                            if (motionEvent2 != null) {
                                int x = (int) (f4 - motionEvent2.getX());
                                int y = (int) (f5 - this.A03.getY());
                                int i5 = (x * x) + (y * y);
                                if (!this.A0A && !this.A0B && i5 > this.A00) {
                                    HandlerC669030h handlerC669030h2 = this.A07;
                                    handlerC669030h2.removeMessages(2);
                                    this.A04.A01();
                                    this.A03.recycle();
                                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                                    this.A03 = obtain;
                                    handlerC669030h2.sendEmptyMessageAtTime(2, obtain.getEventTime() + this.A01);
                                }
                            } else {
                                this.A03 = MotionEvent.obtain(motionEvent);
                            }
                            if ((this.A0A || this.A0B) && !this.A08.A0B(this.A03, motionEvent, f6, f7)) {
                                this.A04.A04();
                            }
                        }
                        this.A0G = f4;
                        this.A0H = f5;
                        return false;
                    }
                }
            } else {
                AbstractC25651Mw.A00(this.A06).A05(new C38013Gnz(false));
                this.A0C = false;
                HandlerC669030h handlerC669030h3 = this.A07;
                handlerC669030h3.removeMessages(1);
                handlerC669030h3.removeMessages(2);
                if (!this.A09) {
                    z2 = this.A08.A09(motionEvent);
                    this.A04.A06(0.0d);
                }
                if (this.A0D) {
                    A01();
                    return z2;
                }
            }
            return z2;
        }
        C55982hj c55982hj = this.A05;
        if (c55982hj.A01 == 1.0d) {
            this.A07.removeCallbacksAndMessages(null);
            c55982hj.A04();
            this.A04.A04();
            this.A09 = false;
            this.A08.A00(motionEvent);
        }
        this.A0G = f4;
        this.A0E = f4;
        this.A0H = f5;
        this.A0F = f5;
        MotionEvent motionEvent3 = this.A02;
        if (motionEvent3 != null) {
            motionEvent3.recycle();
        }
        this.A02 = MotionEvent.obtain(motionEvent);
        this.A09 = true;
        HandlerC669030h handlerC669030h4 = this.A07;
        handlerC669030h4.removeMessages(1);
        handlerC669030h4.sendEmptyMessageAtTime(1, this.A02.getDownTime() + (A0K * 2));
        return this.A08.A08(motionEvent);
    }
}
