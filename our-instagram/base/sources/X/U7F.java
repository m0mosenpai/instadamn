package X;

import android.os.SystemClock;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class U7F implements View.OnTouchListener {
    public GestureDetector A01;
    public XEM A02;
    public boolean A03;
    public boolean A04;
    public float A00 = 10.0f;
    public final List A06 = new ArrayList();
    public final SparseArray A05 = new SparseArray();
    public final MotionEvent.PointerCoords A07 = new MotionEvent.PointerCoords();
    public final MotionEvent.PointerCoords A08 = new MotionEvent.PointerCoords();

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean A1R = AbstractC167007dF.A1R(0, view, motionEvent);
        GestureDetector gestureDetector = this.A01;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        if (motionEvent.getAction() != 0 && !this.A03) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != A1R) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                List list = this.A06;
                                list.remove(list.indexOf(Integer.valueOf(pointerId)));
                                this.A05.remove(pointerId);
                            }
                        } else if (!this.A04) {
                            XEM xem = this.A02;
                            if (xem != null) {
                                xem.DJI();
                                this.A04 = A1R;
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                    }
                } else {
                    List list2 = this.A06;
                    if (list2.size() == A1R) {
                        MotionEvent.PointerCoords pointerCoords = this.A07;
                        motionEvent.getPointerCoords(0, pointerCoords);
                        Object obj = this.A05.get(motionEvent.getPointerId(0));
                        if (obj != null) {
                            MotionEvent.PointerCoords pointerCoords2 = ((C69345Vlr) obj).A04;
                            if (!this.A04) {
                                if (((float) AbstractC43594JPz.A00(pointerCoords.x - pointerCoords2.x, pointerCoords.y - pointerCoords2.y)) > this.A00) {
                                    this.A04 = A1R;
                                    XEM xem2 = this.A02;
                                    if (xem2 != null) {
                                        xem2.DJI();
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                }
                            }
                            XEM xem3 = this.A02;
                            if (xem3 != null) {
                                float f = pointerCoords.x;
                                float f2 = pointerCoords.y;
                                xem3.Dmp(f, f2, f - pointerCoords2.x, f2 - pointerCoords2.y);
                                A01(motionEvent, 0);
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        int findPointerIndex = motionEvent.findPointerIndex(AbstractC31176DnK.A01(list2, 0));
                        int findPointerIndex2 = motionEvent.findPointerIndex(AbstractC31176DnK.A01(list2, A1R ? 1 : 0));
                        SparseArray sparseArray = this.A05;
                        Object obj2 = sparseArray.get(AbstractC31176DnK.A01(list2, 0));
                        if (obj2 != null) {
                            MotionEvent.PointerCoords pointerCoords3 = ((C69345Vlr) obj2).A04;
                            Object obj3 = sparseArray.get(AbstractC31176DnK.A01(list2, A1R ? 1 : 0));
                            if (obj3 != null) {
                                MotionEvent.PointerCoords pointerCoords4 = ((C69345Vlr) obj3).A04;
                                MotionEvent.PointerCoords pointerCoords5 = this.A07;
                                if (findPointerIndex != -1) {
                                    motionEvent.getPointerCoords(findPointerIndex, pointerCoords5);
                                } else {
                                    pointerCoords5.x = pointerCoords3.x;
                                    pointerCoords5.y = pointerCoords3.y;
                                }
                                MotionEvent.PointerCoords pointerCoords6 = this.A08;
                                if (findPointerIndex2 != -1) {
                                    motionEvent.getPointerCoords(findPointerIndex2, pointerCoords6);
                                } else {
                                    pointerCoords6.x = pointerCoords4.x;
                                    pointerCoords6.y = pointerCoords4.y;
                                }
                                float f3 = pointerCoords5.x;
                                float f4 = pointerCoords6.x;
                                float f5 = f3 + f4;
                                float f6 = pointerCoords3.x;
                                float f7 = pointerCoords4.x;
                                float f8 = f6 + f7;
                                float f9 = (f5 + f8) / 4.0f;
                                float f10 = pointerCoords5.y;
                                float f11 = pointerCoords6.y;
                                float f12 = f10 + f11;
                                float f13 = pointerCoords3.y;
                                float f14 = pointerCoords4.y;
                                float f15 = f13 + f14;
                                float f16 = (f12 + f15) / 4.0f;
                                float f17 = (f5 - f8) / 2.0f;
                                float f18 = (f12 - f15) / 2.0f;
                                float f19 = f10 - f11;
                                float f20 = f13 - f14;
                                float A00 = ((float) AbstractC43594JPz.A00(f3 - f4, f19)) / ((float) AbstractC43594JPz.A00(f6 - f7, f20));
                                float atan2 = ((float) Math.atan2(f19, f4 - f3)) - ((float) Math.atan2(f20, f7 - f6));
                                XEM xem4 = this.A02;
                                if (xem4 != null) {
                                    xem4.DU9(f9, f16, f17, f18, A00, atan2);
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    if (this.A04) {
                        for (int i = 0; i < motionEvent.getPointerCount(); i++) {
                            A01(motionEvent, i);
                        }
                    }
                }
                return A1R;
            }
            Object obj4 = this.A05.get(AbstractC31176DnK.A01(this.A06, 0));
            if (obj4 != null) {
                C69345Vlr c69345Vlr = (C69345Vlr) obj4;
                if (!this.A04) {
                    XEM xem5 = this.A02;
                    if (xem5 != null) {
                        MotionEvent.PointerCoords pointerCoords7 = c69345Vlr.A04;
                        xem5.Dma(pointerCoords7.x, pointerCoords7.y);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                long uptimeMillis = SystemClock.uptimeMillis();
                long j = c69345Vlr.A03;
                long j2 = uptimeMillis - j;
                if (j > 0 && j2 > 0) {
                    float f21 = (float) j2;
                    A00((c69345Vlr.A00 * 1000.0f) / f21, (c69345Vlr.A01 * 1000.0f) / f21);
                    return A1R;
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
            A00(0.0f, 0.0f);
            return A1R;
        }
        if (!this.A03) {
            this.A03 = A1R;
            XEM xem6 = this.A02;
            if (xem6 != null) {
                xem6.Du1(A1R);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        MSX.A0u(pointerId2, this.A06);
        C69345Vlr c69345Vlr2 = new C69345Vlr(this);
        motionEvent.getPointerCoords(actionIndex, c69345Vlr2.A04);
        c69345Vlr2.A00 = 0.0f;
        c69345Vlr2.A01 = 0.0f;
        c69345Vlr2.A02 = motionEvent.getEventTime();
        c69345Vlr2.A03 = 0L;
        this.A05.put(pointerId2, c69345Vlr2);
        return A1R;
    }

    private final void A00(float f, float f2) {
        if (this.A04) {
            XEM xem = this.A02;
            if (xem != null) {
                xem.DJE(f, f2);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        this.A05.clear();
        this.A06.clear();
        if (this.A03) {
            this.A03 = false;
            XEM xem2 = this.A02;
            if (xem2 != null) {
                xem2.Du1(false);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        this.A04 = false;
    }

    private final void A01(MotionEvent motionEvent, int i) {
        Object obj = this.A05.get(motionEvent.getPointerId(i));
        if (obj != null) {
            C69345Vlr c69345Vlr = (C69345Vlr) obj;
            long eventTime = motionEvent.getEventTime();
            if (eventTime > c69345Vlr.A02) {
                MotionEvent.PointerCoords pointerCoords = c69345Vlr.A04;
                c69345Vlr.A00 = -pointerCoords.x;
                c69345Vlr.A01 = -pointerCoords.y;
                motionEvent.getPointerCoords(i, pointerCoords);
                c69345Vlr.A00 += pointerCoords.x;
                c69345Vlr.A01 += pointerCoords.y;
                c69345Vlr.A03 = c69345Vlr.A02;
                c69345Vlr.A02 = eventTime;
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public final void A02() {
        XEM xem;
        if (this.A04 && (xem = this.A02) != null) {
            xem.DJE(0.0f, 0.0f);
        }
    }
}
