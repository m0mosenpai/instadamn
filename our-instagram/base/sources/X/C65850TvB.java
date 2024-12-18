package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.TvB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65850TvB {
    public final List A00 = new ArrayList();

    public final boolean A00(MotionEvent motionEvent) {
        float focusY;
        List list = this.A00;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C65891Tvv c65891Tvv = ((C65893Tvx) it.next()).A00;
                int i = C65891Tvv.A0U;
                if (c65891Tvv.A0I != null && (motionEvent.getPointerCount() == 2 || c65891Tvv.A0J != C05F.A00)) {
                    Integer num = c65891Tvv.A0J;
                    Integer num2 = C05F.A0C;
                    if (num != num2 && num != C05F.A0Y && num != C05F.A0N) {
                        Rect rect = c65891Tvv.A0O;
                        rect.setEmpty();
                        C65891Tvv.A00(c65891Tvv).getGlobalVisibleRect(rect);
                        if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                            continue;
                        }
                    }
                    ScaleGestureDetector scaleGestureDetector = c65891Tvv.A0Q;
                    scaleGestureDetector.onTouchEvent(motionEvent);
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked != 3) {
                                if (actionMasked == 6) {
                                    if (c65891Tvv.A0J == num2) {
                                        c65891Tvv.A0J = C05F.A0Y;
                                        if (motionEvent.getPointerCount() == 2) {
                                            int pointerCount = (motionEvent.getPointerCount() - motionEvent.getActionIndex()) - 1;
                                            c65891Tvv.A08 = motionEvent.getX(pointerCount) - c65891Tvv.A06;
                                            focusY = motionEvent.getY(pointerCount);
                                        } else {
                                            c65891Tvv.A08 = scaleGestureDetector.getFocusX() - c65891Tvv.A06;
                                            focusY = scaleGestureDetector.getFocusY();
                                        }
                                        c65891Tvv.A09 = focusY - c65891Tvv.A07;
                                        return true;
                                    }
                                } else {
                                    return true;
                                }
                            }
                        } else {
                            Integer num3 = c65891Tvv.A0J;
                            Integer num4 = C05F.A0Y;
                            float focusX = scaleGestureDetector.getFocusX();
                            if (num3 == num4) {
                                C65891Tvv.A03(c65891Tvv, focusX - c65891Tvv.A08, scaleGestureDetector.getFocusY() - c65891Tvv.A09);
                                return true;
                            }
                            c65891Tvv.A06 = focusX;
                            c65891Tvv.A07 = scaleGestureDetector.getFocusY();
                            return true;
                        }
                    }
                    Integer num5 = c65891Tvv.A0J;
                    if (num5 != num2 && num5 != C05F.A0Y) {
                        return true;
                    }
                    if (c65891Tvv.A0D != null && c65891Tvv.A0I != null) {
                        View A00 = C65891Tvv.A00(c65891Tvv);
                        float width = ((A00.getWidth() * 1.0f) - A00.getWidth()) / 2.0f;
                        float height = ((1.0f * A00.getHeight()) - A00.getHeight()) / 2.0f;
                        float f = -width;
                        float floatValue = ((Number) C17s.A09(Float.valueOf(c65891Tvv.A03), new JTC(f, width))).floatValue();
                        float f2 = -height;
                        float floatValue2 = ((Number) C17s.A09(Float.valueOf(c65891Tvv.A04), new JTC(f2, height))).floatValue();
                        float f3 = c65891Tvv.A0L;
                        if (floatValue > f + f3 || f > floatValue) {
                            f = floatValue;
                        }
                        if (width - f3 > f || f > width) {
                            width = f;
                        }
                        if (floatValue2 > f2 + f3 || f2 > floatValue2) {
                            f2 = floatValue2;
                        }
                        if (height - f3 > f2 || f2 > height) {
                            height = f2;
                        }
                        Float valueOf = Float.valueOf(width);
                        Float valueOf2 = Float.valueOf(height);
                        float floatValue3 = valueOf.floatValue();
                        float floatValue4 = valueOf2.floatValue();
                        double d = c65891Tvv.A0B + floatValue3;
                        double d2 = c65891Tvv.A0C;
                        c65891Tvv.A00 = d;
                        c65891Tvv.A01 = d2 + floatValue4;
                        C55982hj c55982hj = c65891Tvv.A0F;
                        if (c55982hj != null) {
                            C55982hj c55982hj2 = c65891Tvv.A0G;
                            if (c55982hj2 != null) {
                                c55982hj.A02();
                                c55982hj.A0A(c65891Tvv);
                                c55982hj.A04();
                                c65891Tvv.A0J = C05F.A01;
                                c65891Tvv.A0K = false;
                                if (!c55982hj2.A0C() || !c55982hj.A0C()) {
                                    return true;
                                }
                                c65891Tvv.A04();
                                return true;
                            }
                            throw AbstractC166997dE.A0g();
                        }
                        throw AbstractC166997dE.A0g();
                    }
                    C65891Tvv.A01(c65891Tvv);
                    return true;
                }
            }
        }
        return false;
    }
}
