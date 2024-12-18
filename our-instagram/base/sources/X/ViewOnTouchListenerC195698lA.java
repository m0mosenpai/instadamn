package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.8lA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnTouchListenerC195698lA extends C1I2 implements View.OnTouchListener, InterfaceGestureDetectorOnGestureListenerC149756oS {
    public VelocityTracker A02;
    public BBG A03;
    public boolean A04;
    public float A05;
    public boolean A06;
    public final int A07;
    public final View A09;
    public final View A0A;
    public final View A0B;
    public final TextView A0C;
    public final UserSession A0D;
    public final InterfaceC195688l9 A0E;
    public final boolean A0G;
    public final GestureDetector A0H;
    public final InterfaceC195548ku A0I;
    public final AbstractC195668l7 A0J;
    public final InterfaceC195538kt A0K;
    public final Runnable A0F = new Runnable() { // from class: X.8lB
        @Override // java.lang.Runnable
        public final void run() {
            final ViewOnTouchListenerC195698lA viewOnTouchListenerC195698lA = ViewOnTouchListenerC195698lA.this;
            int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
            viewOnTouchListenerC195698lA.A0C.animate().setDuration(500L).alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: X.9LH
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    C14360o3.A0B(animator, 0);
                    super.onAnimationEnd(animator);
                    ViewOnTouchListenerC195698lA.this.A05();
                }
            });
            viewOnTouchListenerC195698lA.A0B.animate().setDuration(500L).alpha(0.0f);
        }
    };
    public final Handler A08 = new Handler();
    public float A00 = 15.0f;
    public long A01 = 1500;

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        float y = motionEvent.getY();
        this.A04 = true;
        this.A05 = y;
        if (A02(A00(y)) != null) {
            if (C18U.A06(C06090Tz.A05, this.A0D, 36322946444176141L)) {
                this.A08.removeCallbacks(this.A0F);
            }
            ViewPropertyAnimator duration = this.A0C.animate().setDuration(200L);
            int i = -1;
            if (this.A0G) {
                i = 1;
            }
            duration.translationX(i * this.A07).setListener(null);
            return true;
        }
        A05();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 1);
        if (this.A0E.CcU()) {
            this.A09.setVisibility(0);
            if (!C18U.A06(C06090Tz.A05, this.A0D, 36322946444176141L) || this.A0C.getVisibility() == 0) {
                this.A0H.onTouchEvent(motionEvent);
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            return true;
                        }
                    }
                }
                this.A04 = false;
                Handler handler = this.A08;
                Runnable runnable = this.A0F;
                handler.removeCallbacks(runnable);
                handler.postDelayed(runnable, this.A01);
                this.A0C.animate().setDuration(200L).translationX(0.0f).setListener(null);
                return true;
            }
            TextView textView = this.A0C;
            if (textView.getVisibility() == 0 && textView.getAlpha() > 0.0f) {
                return true;
            }
            return false;
        }
        this.A09.setVisibility(4);
        return false;
    }

    private final float A00(float f) {
        int y = (int) ((this.A09.getY() + f) - this.A05);
        View view = this.A0A;
        return (C17s.A03(y, view.getPaddingTop(), (view.getHeight() - r5.getHeight()) - view.getPaddingBottom()) - view.getPaddingTop()) / A01();
    }

    private final int A01() {
        View view = this.A0A;
        return ((view.getHeight() - this.A09.getHeight()) - view.getPaddingBottom()) - view.getPaddingTop();
    }

    private final String A02(float f) {
        InterfaceC195548ku interfaceC195548ku = this.A0I;
        int Brg = interfaceC195548ku.Brg(this.A0E.Brk(f));
        List Brl = interfaceC195548ku.Brl();
        if (Brg >= 0 && Brg < Brl.size()) {
            Object obj = Brl.get(Brg);
            C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.String");
            return (String) obj;
        }
        return null;
    }

    private final void A03() {
        this.A08.removeCallbacks(this.A0F);
        this.A06 = true;
        TextView textView = this.A0C;
        textView.setVisibility(0);
        View view = this.A0B;
        view.setVisibility(0);
        textView.setAlpha(1.0f);
        view.setAlpha(1.0f);
        BBG bbg = this.A03;
        if (bbg != null) {
            C1821786b c1821786b = ((C9KV) bbg).A00.A01.A0m;
            if (!c1821786b.A0C) {
                c1821786b.A0U.setVisibility(8);
            }
        }
    }

    private final void A04(float f) {
        View view = this.A0A;
        int paddingTop = (int) (view.getPaddingTop() + (A01() * f));
        int paddingTop2 = view.getPaddingTop();
        int height = view.getHeight();
        View view2 = this.A09;
        if (paddingTop <= (height - view2.getHeight()) - view.getPaddingBottom() && paddingTop2 <= paddingTop) {
            view2.setY(paddingTop);
            String A02 = A02(f);
            TextView textView = this.A0C;
            if (!AbstractC50102Ry.A00(A02, textView.getText())) {
                textView.setText(A02);
            }
        }
    }

    public final void A05() {
        this.A08.removeCallbacks(this.A0F);
        this.A06 = false;
        this.A0C.setVisibility(4);
        this.A0B.setVisibility(4);
        BBG bbg = this.A03;
        if (bbg != null) {
            C1821786b c1821786b = ((C9KV) bbg).A00.A01.A0m;
            if (!c1821786b.A0C) {
                c1821786b.A0U.setVisibility(0);
            }
        }
    }

    public final void A06() {
        CharSequence text = this.A0C.getText();
        if (text != null && text.length() > 0 && A01() > 0) {
            A03();
            if (!this.A04) {
                Handler handler = this.A08;
                Runnable runnable = this.A0F;
                handler.removeCallbacks(runnable);
                handler.postDelayed(runnable, this.A01);
                return;
            }
            return;
        }
        A05();
    }

    public final void A07(int i) {
        float f;
        InterfaceC195688l9 interfaceC195688l9 = this.A0E;
        boolean CcU = interfaceC195688l9.CcU();
        View view = this.A09;
        if (CcU) {
            view.setVisibility(0);
            if (!this.A04) {
                VelocityTracker velocityTracker = this.A02;
                if (velocityTracker != null) {
                    velocityTracker.computeCurrentVelocity(1);
                    f = Math.abs(velocityTracker.getYVelocity());
                } else {
                    f = 0.0f;
                }
                if (f > this.A00) {
                    this.A06 = true;
                }
                if (this.A06) {
                    A03();
                    Handler handler = this.A08;
                    Runnable runnable = this.A0F;
                    handler.removeCallbacks(runnable);
                    handler.postDelayed(runnable, this.A01);
                }
                A04(interfaceC195688l9.Br1(i));
                return;
            }
            A06();
            return;
        }
        view.setVisibility(4);
    }

    public ViewOnTouchListenerC195698lA(View view, UserSession userSession, InterfaceC195548ku interfaceC195548ku, InterfaceC195688l9 interfaceC195688l9, AbstractC195668l7 abstractC195668l7, InterfaceC195538kt interfaceC195538kt) {
        this.A0D = userSession;
        this.A0E = interfaceC195688l9;
        this.A0J = abstractC195668l7;
        View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: X.8lC
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                C14360o3.A0B(motionEvent, 1);
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            return false;
                        }
                    } else {
                        ViewOnTouchListenerC195698lA viewOnTouchListenerC195698lA = ViewOnTouchListenerC195698lA.this;
                        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                        VelocityTracker velocityTracker = viewOnTouchListenerC195698lA.A02;
                        if (velocityTracker == null) {
                            velocityTracker = VelocityTracker.obtain();
                            viewOnTouchListenerC195698lA.A02 = velocityTracker;
                        }
                        if (velocityTracker == null) {
                            return false;
                        }
                        velocityTracker.addMovement(motionEvent);
                        return false;
                    }
                }
                ViewOnTouchListenerC195698lA viewOnTouchListenerC195698lA2 = ViewOnTouchListenerC195698lA.this;
                int i2 = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                VelocityTracker velocityTracker2 = viewOnTouchListenerC195698lA2.A02;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                }
                viewOnTouchListenerC195698lA2.A02 = null;
                return false;
            }
        };
        ViewGroup viewGroup = abstractC195668l7.A00;
        viewGroup.setOnTouchListener(onTouchListener);
        this.A0I = interfaceC195548ku;
        this.A0A = view;
        View requireViewById = view.requireViewById(R.id.fast_scroll);
        this.A09 = requireViewById;
        this.A0B = view.findViewById(R.id.fast_scroll_thumb);
        requireViewById.setOnTouchListener(this);
        this.A0C = (TextView) view.findViewById(R.id.fast_scroll_section_bubble);
        Context context = viewGroup.getContext();
        C14360o3.A07(context);
        this.A0G = AbstractC13620mo.A02(context);
        this.A0K = interfaceC195538kt;
        this.A07 = view.getResources().getDimensionPixelSize(R.dimen.caption_overlay_offset_with_social_bubble);
        GestureDetector gestureDetector = new GestureDetector(requireViewById.getContext(), this);
        this.A0H = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        interfaceC195538kt.registerDataSetObserver(new DataSetObserver() { // from class: X.8lD
            @Override // android.database.DataSetObserver
            public final void onChanged() {
                super.onChanged();
                ViewOnTouchListenerC195698lA viewOnTouchListenerC195698lA = ViewOnTouchListenerC195698lA.this;
                int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                viewOnTouchListenerC195698lA.A0E.DPF();
            }
        });
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int A03 = C0f9.A03(-2074724034);
        C14360o3.A0B(motionEvent2, 1);
        float A00 = A00(motionEvent2.getY());
        AbstractC195668l7 abstractC195668l7 = this.A0J;
        int A002 = abstractC195668l7.A00();
        InterfaceC195538kt interfaceC195538kt = this.A0K;
        int AK4 = interfaceC195538kt.AK4(A002);
        InterfaceC195688l9 interfaceC195688l9 = this.A0E;
        A04(interfaceC195688l9.Br1(AK4));
        int Bpj = interfaceC195688l9.Bpj(A00);
        int BYc = interfaceC195688l9.BYc(Bpj, A00);
        int AK8 = interfaceC195538kt.AK8(Bpj);
        if (AK8 >= 0) {
            abstractC195668l7.A01(AK8, BYc);
        }
        abstractC195668l7.A02(0, 0);
        C0f9.A0A(1575966879, A03);
        return true;
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        C0f9.A0A(728882835, C0f9.A03(844044414));
    }

    @Override // X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        int A03 = C0f9.A03(-1254855078);
        A07(i);
        C0f9.A0A(-345681714, A03);
    }
}
