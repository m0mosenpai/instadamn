package X;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.Scroller;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class UMB extends C5SZ {
    public final int A00;
    public final Object A01;

    public UMB(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        float floatValue;
        float floatValue2;
        double d;
        if (this.A00 != 0) {
            return super.onDoubleTap(motionEvent);
        }
        C14360o3.A0B(motionEvent, 0);
        WXb wXb = (WXb) this.A01;
        if (wXb.A0Q) {
            return false;
        }
        if (wXb.A0L == C05F.A00) {
            float f = wXb.A02;
            if (f - 1.0f < wXb.A03 - f) {
                View view = wXb.A0V;
                wXb.A04 = ((view.getWidth() / 2) - motionEvent.getX()) * (wXb.A03 - 1.0f);
                float height = (view.getHeight() / 2) - motionEvent.getY();
                float f2 = wXb.A03;
                wXb.A05 = height * (f2 - 1.0f);
                C09530e4 A01 = WXb.A01(wXb, f2);
                floatValue = ((Number) A01.A00).floatValue();
                floatValue2 = ((Number) A01.A01).floatValue();
                d = wXb.A03;
            } else {
                C09530e4 A012 = WXb.A01(wXb, 1.0f);
                floatValue = ((Number) A012.A00).floatValue();
                floatValue2 = ((Number) A012.A01).floatValue();
                d = 1.0d;
            }
            WXb.A03(wXb, d, floatValue, floatValue2, false);
            return true;
        }
        return true;
    }

    @Override // X.C5SZ, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        WXb wXb;
        int A01;
        float f3;
        float f4 = f;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(motionEvent2, 1);
                int i = 0;
                if (motionEvent != null) {
                    float x = motionEvent.getX() - motionEvent2.getX();
                    float y = motionEvent.getY() - motionEvent2.getY();
                    float abs = Math.abs(f4);
                    float abs2 = Math.abs(f2);
                    if (abs <= abs2) {
                        z = true;
                        wXb = (WXb) this.A01;
                        FrameLayout.LayoutParams layoutParams = WXb.A0c;
                        if (abs2 < wXb.A0R) {
                            return false;
                        }
                    } else {
                        z = false;
                        wXb = (WXb) this.A01;
                        FrameLayout.LayoutParams layoutParams2 = WXb.A0c;
                        if (abs < wXb.A0R) {
                            return false;
                        }
                    }
                    Ut9 ut9 = wXb.A0G;
                    if (ut9 != null) {
                        float f5 = wXb.A02;
                        View view = wXb.A0V;
                        int A012 = C1H4.A01(((f5 * view.getWidth()) - view.getWidth()) / 2.0f);
                        int A013 = C1H4.A01(((wXb.A02 * view.getHeight()) - view.getHeight()) / 2.0f);
                        if (!z ? !WXb.A04(wXb, x) : !WXb.A05(wXb, y)) {
                            Integer num = wXb.A0L;
                            if (num == C05F.A00 || num == C05F.A0j) {
                                if (Math.signum(f4) != Math.signum(wXb.A00)) {
                                    f4 = (-1.0f) * f;
                                }
                                if (Math.signum(f2) == Math.signum(wXb.A01)) {
                                    f3 = f2;
                                } else {
                                    f3 = (-1.0f) * f2;
                                }
                                ut9.dispatchNestedPreFling(f4, f2);
                                return ut9.dispatchNestedFling(f4, f3, false);
                            }
                            return true;
                        }
                        wXb.A08(C05F.A0u);
                        OverScroller overScroller = wXb.A0W;
                        int A014 = C1H4.A01(wXb.A04);
                        int A015 = C1H4.A01(wXb.A05);
                        if (z) {
                            A01 = 0;
                            i = C1H4.A01(f2);
                        } else {
                            A01 = C1H4.A01(f4);
                        }
                        overScroller.fling(A014, A015, A01, i, -A012, A012, -A013, A013);
                        ut9.postOnAnimation(new RunnableC71398WtM(ut9, wXb));
                        return true;
                    }
                    throw AbstractC166997dE.A0g();
                }
                return false;
            case 1:
            default:
                return super.onFling(motionEvent, motionEvent2, f4, f2);
            case 2:
                W9A w9a = (W9A) this.A01;
                Scroller scroller = w9a.A06;
                scroller.forceFinished(true);
                C66303U8b c66303U8b = w9a.A07;
                scroller.fling(0, c66303U8b.A0A, 0, -((int) f2), 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
                int finalY = scroller.getFinalY();
                if (finalY >= 0 && finalY < c66303U8b.A09) {
                    scroller.setFinalY(c66303U8b.A02(finalY));
                }
                w9a.A01 = C05F.A0C;
                View view2 = w9a.A05;
                Runnable runnable = w9a.A08;
                view2.removeCallbacks(runnable);
                view2.post(runnable);
                return true;
        }
    }

    @Override // X.C5SZ, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C03I c03i;
        int i;
        int A01;
        int A012;
        int[] iArr;
        int i2;
        Integer num;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(motionEvent2, 1);
                if (motionEvent != null) {
                    float x = motionEvent.getX() - motionEvent2.getX();
                    WXb wXb = (WXb) this.A01;
                    wXb.A00 -= x;
                    float y = motionEvent.getY() - motionEvent2.getY();
                    wXb.A01 -= y;
                    Integer num2 = wXb.A0L;
                    Integer num3 = C05F.A0j;
                    if (num2 != num3 && (num2 == (num = C05F.A0Y) || WXb.A04(wXb, f) || WXb.A05(wXb, f2))) {
                        wXb.A08(num);
                        float f3 = wXb.A04 - f;
                        wXb.A04 = f3;
                        wXb.A05 -= f2;
                        wXb.A0H.A08(f3, true);
                        wXb.A0I.A08(wXb.A05, true);
                        float f4 = wXb.A04;
                        float f5 = wXb.A05;
                        View A00 = WXb.A00(wXb);
                        A00.setTranslationX(f4);
                        A00.setTranslationY(f5);
                        Ut9 ut9 = wXb.A0G;
                        if (ut9 != null) {
                            c03i = ut9.A00;
                            i = C1H4.A01(x);
                            i2 = C1H4.A01(y);
                            A01 = 0;
                            iArr = null;
                            A012 = 0;
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    } else {
                        wXb.A08(num3);
                        Ut9 ut92 = wXb.A0G;
                        if (ut92 != null) {
                            c03i = ut92.A00;
                            i = 0;
                            A01 = C1H4.A01(x);
                            A012 = C1H4.A01(y);
                            iArr = null;
                            i2 = 0;
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                    c03i.A06(i, i2, A01, A012, iArr);
                    return true;
                }
                return false;
            case 1:
                FragmentActivity activity = ((Fragment) this.A01).getActivity();
                if (activity != null && f2 < (-1.0f) * activity.getResources().getDimension(R.dimen.canvas_colour_wheel_offset_y)) {
                    activity.onBackPressed();
                    return false;
                }
                return false;
            default:
                W9A w9a = (W9A) this.A01;
                w9a.A01 = C05F.A01;
                W9A.A00(w9a, (int) (w9a.A07.A0A + f2));
                return true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.A00 != 0) {
            return super.onSingleTapConfirmed(motionEvent);
        }
        InterfaceC16820sZ interfaceC16820sZ = ((WXb) this.A01).A0O;
        if (interfaceC16820sZ != null) {
            interfaceC16820sZ.invoke();
            return true;
        }
        return false;
    }
}
