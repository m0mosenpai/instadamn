package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes8.dex */
public final class LQY implements View.OnTouchListener {
    public final /* synthetic */ GestureDetector A00;
    public final /* synthetic */ C149216nV A01;

    public LQY(GestureDetector gestureDetector, C149216nV c149216nV) {
        this.A01 = c149216nV;
        this.A00 = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Integer num;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    C149216nV c149216nV = this.A01;
                    if (!c149216nV.A0G && !c149216nV.A0H) {
                        float rawX = motionEvent.getRawX() - c149216nV.A01;
                        float rawY = motionEvent.getRawY() - c149216nV.A02;
                        if (AbstractC43594JPz.A00(rawX, rawY) > c149216nV.A05) {
                            if (AbstractC43594JPz.A01(rawY, rawX) < 45.0d) {
                                c149216nV.A0G = true;
                            } else {
                                c149216nV.A0H = true;
                            }
                        }
                    }
                }
            } else {
                C149216nV c149216nV2 = this.A01;
                if (c149216nV2.A03 == 0.0f) {
                    float f = c149216nV2.A04;
                    if (f == 0.0f) {
                        num = C05F.A00;
                    } else if (f < 0.0f) {
                        num = C05F.A0j;
                    } else {
                        c149216nV2.A0F = C05F.A0C;
                    }
                    c149216nV2.A01(num);
                } else {
                    c149216nV2.A0F = C05F.A01;
                    C55982hj c55982hj = c149216nV2.A0B;
                    if (c55982hj != null) {
                        float f2 = -c149216nV2.A00;
                        if (c149216nV2.A09 != null) {
                            c55982hj.A07(f2 / AbstractC166987dD.A07(r0));
                            C55982hj c55982hj2 = c149216nV2.A0B;
                            C14360o3.A0A(c55982hj2);
                            float f3 = (float) c55982hj2.A09.A00;
                            if (Math.abs(f3) > 0.4f) {
                                C55982hj c55982hj3 = c149216nV2.A0B;
                                if (f3 > 0.0f) {
                                    C14360o3.A0A(c55982hj3);
                                    c55982hj3.A03();
                                    num = C05F.A0C;
                                } else {
                                    C14360o3.A0A(c55982hj3);
                                    c55982hj3.A06(-1.0d);
                                    num = C05F.A0N;
                                }
                                c149216nV2.A01(num);
                            } else {
                                C55982hj c55982hj4 = c149216nV2.A0B;
                                C14360o3.A0A(c55982hj4);
                                c55982hj4.A04();
                            }
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
            }
        } else {
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
                C149216nV c149216nV3 = this.A01;
                if (c149216nV3.A0F == C05F.A01) {
                    return false;
                }
                c149216nV3.A0G = false;
                c149216nV3.A0H = false;
                c149216nV3.A03 = 0.0f;
                c149216nV3.A04 = 0.0f;
                c149216nV3.A01 = motionEvent.getRawX();
                c149216nV3.A02 = motionEvent.getRawY();
                c149216nV3.A00 = 0.0f;
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        return this.A00.onTouchEvent(motionEvent);
    }
}
