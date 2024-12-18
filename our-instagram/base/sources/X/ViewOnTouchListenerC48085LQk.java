package X;

import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStub;
import android.widget.ListView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.LQk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnTouchListenerC48085LQk implements View.OnTouchListener, InterfaceC55932he, MOQ, GestureDetector.OnGestureListener {
    public float A00;
    public View A01;
    public View A02;
    public View A03;
    public ListView A04;
    public KKq A05;
    public LRD A06;
    public C66305U8d A07;
    public ReboundViewPager A08;
    public TouchInterceptorFrameLayout A09;
    public C44063Jdo A0A;
    public CirclePageIndicator A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public float A0H;
    public float A0I;
    public float A0J;
    public boolean A0K;
    public boolean A0L;
    public final GestureDetector A0M;
    public final View.OnTouchListener A0N = new ViewOnTouchListenerC48084LQj(this, 6);
    public final View A0O;
    public final View A0P;
    public final View A0Q;
    public final ViewStub A0R;
    public final C55982hj A0S;
    public final InterfaceC11380iw A0T;
    public final UserSession A0U;
    public final C3I9 A0V;
    public final C8NZ A0W;
    public final KNI A0X;
    public final double A0Y;
    public final L5R A0Z;

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.A0J = 0.0f;
        this.A0E = true;
        this.A0K = false;
        this.A0C = false;
        this.A0H = motionEvent.getRawX();
        this.A0I = motionEvent.getRawY();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    public static void A00(MotionEvent motionEvent, ViewOnTouchListenerC48085LQk viewOnTouchListenerC48085LQk) {
        if (!viewOnTouchListenerC48085LQk.A0K && !viewOnTouchListenerC48085LQk.A0C) {
            float rawX = viewOnTouchListenerC48085LQk.A0H - motionEvent.getRawX();
            float rawY = viewOnTouchListenerC48085LQk.A0I - motionEvent.getRawY();
            if (AbstractC43594JPz.A00(rawX, rawY) > viewOnTouchListenerC48085LQk.A0Y) {
                if (AbstractC43594JPz.A01(rawY, rawX) < 20.0d) {
                    viewOnTouchListenerC48085LQk.A0K = true;
                } else {
                    viewOnTouchListenerC48085LQk.A0C = true;
                }
            }
        }
    }

    public static void A01(ViewOnTouchListenerC48085LQk viewOnTouchListenerC48085LQk, float f) {
        C55982hj c55982hj = viewOnTouchListenerC48085LQk.A0S;
        float f2 = (float) c55982hj.A09.A00;
        float min = (float) Math.min(Math.max(f2 - f, 0.0d), viewOnTouchListenerC48085LQk.A0Q.getHeight());
        if (f2 != min) {
            c55982hj.A08(min, true);
        }
    }

    public static boolean A02(ViewOnTouchListenerC48085LQk viewOnTouchListenerC48085LQk) {
        KeyEvent.Callback callback;
        if (viewOnTouchListenerC48085LQk.A08.getVisibility() == 0) {
            callback = viewOnTouchListenerC48085LQk.A08.A0F;
        } else {
            callback = viewOnTouchListenerC48085LQk.A04;
        }
        if (callback != null) {
            return true;
        }
        return false;
    }

    public final void A04(boolean z) {
        if (this.A09 == null) {
            TouchInterceptorFrameLayout touchInterceptorFrameLayout = (TouchInterceptorFrameLayout) this.A0R.inflate();
            this.A09 = touchInterceptorFrameLayout;
            View requireViewById = touchInterceptorFrameLayout.requireViewById(R.id.asset_picker);
            this.A02 = requireViewById;
            this.A03 = requireViewById.requireViewById(R.id.drag_chevron);
            this.A01 = this.A09.requireViewById(R.id.asset_items_container);
            this.A05 = new KKq(this.A09, this);
            UserSession userSession = this.A0U;
            InterfaceC11380iw interfaceC11380iw = this.A0T;
            TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = this.A09;
            KNI kni = this.A0X;
            C3I9 c3i9 = this.A0V;
            C8NZ c8nz = this.A0W;
            this.A06 = new LRD(touchInterceptorFrameLayout2, interfaceC11380iw, userSession, c3i9, c8nz, kni, this);
            this.A04 = (ListView) this.A09.findViewById(R.id.assets_search_results_list);
            CirclePageIndicator circlePageIndicator = (CirclePageIndicator) this.A02.requireViewById(R.id.page_indicator);
            this.A0B = circlePageIndicator;
            ((C41L) circlePageIndicator).A09 = true;
            this.A08 = (ReboundViewPager) this.A02.requireViewById(R.id.assets_view_pager);
            C44063Jdo c44063Jdo = new C44063Jdo(this.A0Q, interfaceC11380iw, userSession, null, c8nz, kni, true, false);
            this.A0A = c44063Jdo;
            this.A08.setAdapter(c44063Jdo);
            ReboundViewPager reboundViewPager = this.A08;
            reboundViewPager.setDraggingEnabled(false);
            reboundViewPager.A0P(this.A0B);
            C55982hj c55982hj = this.A0S;
            c55982hj.A0A(this);
            c55982hj.A08(r3.getHeight(), true);
            this.A09.A00(this.A0N, this);
        }
        if (this.A07 == null) {
            this.A09.getClass();
            int A09 = AbstractC166997dE.A09(this.A09.getResources());
            C69422Vn7 c69422Vn7 = new C69422Vn7(this.A02, "EmojiPickerController", this.A0P, this.A0O);
            c69422Vn7.A02 = 15;
            c69422Vn7.A00 = 12;
            c69422Vn7.A03 = this.A09.getContext().getColor(R.color.black_20_transparent);
            c69422Vn7.A04 = A09;
            C66305U8d c66305U8d = new C66305U8d(c69422Vn7);
            this.A07 = c66305U8d;
            this.A02.setBackground(c66305U8d);
        }
        this.A07.setVisible(true, false);
        TouchInterceptorFrameLayout touchInterceptorFrameLayout3 = this.A09;
        touchInterceptorFrameLayout3.getClass();
        boolean z2 = false;
        touchInterceptorFrameLayout3.setVisibility(0);
        ArrayList A1E = AbstractC166987dD.A1E();
        boolean A1b = AbstractC31171DnF.A1b(this.A0X.A03());
        if (A1b) {
            L10 l10 = new L10();
            l10.A01 = "recent_emoji_set_id";
            l10.A00 = EnumC46196KcY.A06;
            A1E.add(l10);
        }
        A1E.add(AbstractC46683Kl0.A00(AbstractC166987dD.A1E()));
        this.A08.setDraggingEnabled(AbstractC25230BEn.A1S(A1E.size(), 1));
        CirclePageIndicator circlePageIndicator2 = this.A0B;
        int i = 8;
        if (A1E.size() > 1) {
            i = 0;
        }
        circlePageIndicator2.setVisibility(i);
        this.A0B.A01(this.A08.A08, A1E.size());
        if (A1b && !this.A0L) {
            this.A0B.A02(1);
            this.A08.A0R(true, 1.0f);
        }
        if (this.A0L || A1b) {
            z2 = true;
        }
        this.A0L = z2;
        C44063Jdo c44063Jdo2 = this.A0A;
        List list = c44063Jdo2.A07;
        list.clear();
        list.addAll(A1E);
        C0fA.A00(c44063Jdo2, 792283702);
        LRD lrd = this.A06;
        if (lrd != null) {
            List list2 = lrd.A06.A04;
            list2.clear();
            list2.addAll(A1E);
        }
        if (!z) {
            this.A0S.A06(AbstractC166987dD.A08(this.A0Q) * 0.39999998f);
        }
    }

    public final boolean A05() {
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A09;
        if (touchInterceptorFrameLayout != null && touchInterceptorFrameLayout.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean A06(float f, boolean z) {
        float A08;
        double d;
        C55982hj c55982hj = this.A0S;
        if (!c55982hj.A0C()) {
            return false;
        }
        C55992hk c55992hk = c55982hj.A09;
        double d2 = c55992hk.A00;
        if (!AbstractC167007dF.A1N((d2 > 0.0d ? 1 : (d2 == 0.0d ? 0 : -1))) || f > 0.0f) {
            View view = this.A0Q;
            if (d2 != view.getHeight() || f < 0.0f) {
                float f2 = 3500.0f;
                if (z) {
                    f2 = 10000.0f;
                }
                if (Math.abs(f) > f2) {
                    if (f > 0.0f) {
                        c55982hj.A07(f);
                        d = view.getHeight();
                    } else {
                        if (f >= 0.0f) {
                            return true;
                        }
                        c55982hj.A07(f);
                        d = 0.0d;
                    }
                } else {
                    if (z) {
                        A08 = AbstractC166987dD.A08(view) * 0.39999998f;
                    } else {
                        if (c55992hk.A00 >= (AbstractC166987dD.A08(view) * 0.39999998f) / 2.0f) {
                            if (c55992hk.A00 <= AbstractC166987dD.A08(view) * 0.7f) {
                                A08 = AbstractC166987dD.A08(view) * 0.39999998f;
                            }
                            d = view.getHeight();
                        }
                        d = 0.0d;
                    }
                    d = A08;
                }
                c55982hj.A06(d);
                return true;
            }
        }
        Dnk(c55982hj);
        return true;
    }

    @Override // X.MOQ
    public final Integer Acu() {
        return C05F.A0N;
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        L5R l5r;
        boolean z;
        if (this.A0S.A09.A00 == this.A0Q.getHeight()) {
            KKq kKq = this.A05;
            if (kKq != null) {
                kKq.A00();
            }
            AbstractC167007dF.A0x(this.A09);
            C66305U8d c66305U8d = this.A07;
            z = false;
            if (c66305U8d != null) {
                c66305U8d.setVisible(false, false);
            }
            l5r = this.A0Z;
        } else {
            l5r = this.A0Z;
            z = true;
        }
        l5r.A09 = z;
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        this.A02.setTranslationY((float) c55982hj.A09.A00);
        C66305U8d c66305U8d = this.A07;
        if (c66305U8d != null) {
            c66305U8d.invalidateSelf();
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.A0J = f2;
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.A0E) {
            this.A0E = false;
            this.A00 = f2;
            return true;
        }
        if (!this.A0C) {
            return true;
        }
        A01(this, f2);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean onTouchEvent = this.A0M.onTouchEvent(motionEvent);
        A00(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1 && actionMasked != 3) {
            return onTouchEvent;
        }
        A06(this.A0J, false);
        return onTouchEvent;
    }

    public ViewOnTouchListenerC48085LQk(View view, L5R l5r, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C3I9 c3i9, C8NZ c8nz) {
        this.A0Q = view;
        this.A0U = userSession;
        this.A0T = interfaceC11380iw;
        this.A0O = view.requireViewById(R.id.card_view);
        this.A0P = view.requireViewById(R.id.grid_pattern_view);
        this.A0R = AbstractC31173DnH.A0G(view, R.id.asset_picker_view_stub);
        this.A0X = new KNI(userSession);
        this.A0W = c8nz;
        this.A0Z = l5r;
        this.A0V = c3i9;
        C55982hj A0R = AbstractC167007dF.A0R();
        A0R.A06 = true;
        this.A0S = A0R;
        GestureDetector gestureDetector = new GestureDetector(view.getContext(), this);
        this.A0M = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.A0Y = ViewConfiguration.get(r2).getScaledTouchSlop();
    }

    public final void A03(boolean z) {
        if (A05()) {
            C55982hj c55982hj = this.A0S;
            int height = this.A0Q.getHeight();
            if (z) {
                c55982hj.A06(height);
            } else {
                c55982hj.A08(height, true);
                Dnk(c55982hj);
            }
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        L10 l10;
        double d;
        if (motionEvent.getY() < this.A02.getY()) {
            A03(true);
            return true;
        }
        float y = motionEvent.getY();
        if (y >= this.A02.getY() + this.A03.getTop() && y <= this.A02.getY() + this.A03.getBottom()) {
            ReboundViewPager reboundViewPager = this.A08;
            if (reboundViewPager != null && reboundViewPager.getChildCount() != 0) {
                l10 = (L10) this.A0A.getItem(this.A08.A08);
            } else {
                l10 = null;
            }
            if (l10 != null && !this.A0A.A03(l10)) {
                this.A0A.A02(l10, true);
                return true;
            }
            C55982hj c55982hj = this.A0S;
            if (!c55982hj.A0C()) {
                return true;
            }
            if (c55982hj.A09.A00 == 0.0d) {
                d = this.A0Q.getHeight();
            } else {
                d = 0.0d;
            }
            c55982hj.A06(d);
            return true;
        }
        return false;
    }
}
