package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.instagram.common.session.UserSession;

/* renamed from: X.30f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC668830f {
    public void A00(MotionEvent motionEvent) {
        AnonymousClass308 anonymousClass308 = ((C668730e) this).A00;
        anonymousClass308.A03 = null;
        anonymousClass308.A02 = null;
        anonymousClass308.A05 = null;
        anonymousClass308.A0C = C05F.A00;
    }

    public void A01(MotionEvent motionEvent) {
        C75113Zb BRZ;
        int i;
        boolean z;
        AnonymousClass308 anonymousClass308 = ((C668730e) this).A00;
        if (anonymousClass308.A0C == C05F.A0C) {
            anonymousClass308.A0C = C05F.A0N;
            InterfaceC101554hQ interfaceC101554hQ = anonymousClass308.A0B;
            if (interfaceC101554hQ != null) {
                interfaceC101554hQ.DXz();
            }
            AbstractC26351Pq.A00.A00();
            C140366Wq c140366Wq = anonymousClass308.A09;
            if (c140366Wq != null) {
                View view = c140366Wq.A02;
                C38321qM A07 = anonymousClass308.A07();
                C38321qM A1e = A07.A1e(anonymousClass308.A00);
                if (A1e == null) {
                    A1e = A07;
                }
                if (A1e.Cff()) {
                    InterfaceC65232xL interfaceC65232xL = anonymousClass308.A0Y;
                    C38321qM A072 = anonymousClass308.A07();
                    if (interfaceC65232xL == null) {
                        BRZ = anonymousClass308.BRZ(A072);
                    } else {
                        BRZ = interfaceC65232xL.BRZ(A072);
                    }
                    C30E c30e = anonymousClass308.A0Z;
                    C38321qM A073 = anonymousClass308.A07();
                    C140366Wq c140366Wq2 = anonymousClass308.A09;
                    if (c140366Wq2 != null) {
                        C81303k0 c81303k0 = c140366Wq2.A0G;
                        C14360o3.A06(c81303k0);
                        int i2 = anonymousClass308.A01;
                        int i3 = anonymousClass308.A00;
                        if (BRZ != null) {
                            i = BRZ.A01();
                            z = BRZ.A2G;
                        } else {
                            i = 0;
                            z = false;
                        }
                        c30e.A0S(A073, anonymousClass308, c81303k0, new C4QP(false, false, false, false), i2, i3, i, true, z);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public void A02(MotionEvent motionEvent) {
        AnonymousClass308.A00(((C668730e) this).A00);
    }

    public void A03(MotionEvent motionEvent, C55982hj c55982hj) {
        AnonymousClass308 anonymousClass308 = ((C668730e) this).A00;
        if (anonymousClass308.A0C != C05F.A00 && c55982hj.A09.A00 != 1.0d) {
            C140366Wq c140366Wq = anonymousClass308.A09;
            if (c140366Wq != null) {
                c140366Wq.A01.setVisibility(8);
                C140366Wq c140366Wq2 = anonymousClass308.A09;
                if (c140366Wq2 != null) {
                    c140366Wq2.A01.setAlpha(0.0f);
                    anonymousClass308.A02 = null;
                    anonymousClass308.A0E = false;
                    if (anonymousClass308.A0C == C05F.A0j) {
                        anonymousClass308.A0C = C05F.A0N;
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public void A04(MotionEvent motionEvent, C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 1);
        AnonymousClass308 anonymousClass308 = ((C668730e) this).A00;
        C55992hk c55992hk = c55982hj.A09;
        double d = c55992hk.A00;
        if (anonymousClass308.A0C == C05F.A0j) {
            C140366Wq c140366Wq = anonymousClass308.A09;
            if (c140366Wq != null) {
                if (!anonymousClass308.A0E) {
                    c140366Wq.A01.setAlpha((float) d);
                }
                if (d >= 1.0d) {
                    anonymousClass308.A0E = true;
                }
                View view = c140366Wq.A01;
                view.setVisibility(0);
                int[] iArr = anonymousClass308.A0e;
                int i = iArr[0];
                if (anonymousClass308.A02 != null) {
                    view.setTranslationX((i + (r0.getWidth() / 2)) - (view.getWidth() / 2));
                    int i2 = iArr[1];
                    if (anonymousClass308.A02 != null) {
                        view.setTranslationY((((i2 + (r0.getHeight() / 2)) - (view.getHeight() / 2)) - anonymousClass308.A0L) - (((float) d) * anonymousClass308.A0K));
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
        if (c55982hj.A01 == 1.0d) {
            if (anonymousClass308.A03 == null && c55992hk.A00 > 0.800000011920929d) {
                anonymousClass308.A03 = anonymousClass308.A02;
                C2UY.A01.A03();
                return;
            }
            return;
        }
        anonymousClass308.A03 = null;
    }

    public void A05(MotionEvent motionEvent, C55982hj c55982hj) {
        C668730e c668730e = (C668730e) this;
        if (c55982hj.A09.A00 != 1.0d) {
            AnonymousClass308 anonymousClass308 = c668730e.A00;
            Integer num = anonymousClass308.A0C;
            Integer num2 = C05F.A00;
            if (num != num2) {
                View view = anonymousClass308.A04;
                if (view != null) {
                    view.setVisibility(4);
                }
                Runnable runnable = anonymousClass308.A0D;
                if (runnable != null) {
                    runnable.run();
                }
                anonymousClass308.A0D = null;
                anonymousClass308.A0C = num2;
                InterfaceC101554hQ interfaceC101554hQ = anonymousClass308.A0B;
                if (interfaceC101554hQ != null) {
                    interfaceC101554hQ.DY1();
                }
                AbstractC26351Pq.A00.A00();
            }
        }
    }

    public void A06(MotionEvent motionEvent, C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 1);
        AnonymousClass308 anonymousClass308 = ((C668730e) this).A00;
        double d = c55982hj.A09.A00;
        C140366Wq c140366Wq = anonymousClass308.A09;
        if (c140366Wq != null) {
            Integer num = anonymousClass308.A0C;
            if (num == C05F.A0N || num == C05F.A0C) {
                View view = c140366Wq.A02;
                View view2 = anonymousClass308.A04;
                if (view2 != null) {
                    float f = (float) d;
                    view2.setAlpha(f);
                    float f2 = (f * 0.19999999f) + 0.8f;
                    view.setScaleX(f2);
                    view.setScaleY(f2);
                    View view3 = anonymousClass308.A04;
                    if (view3 != null) {
                        view3.setVisibility(0);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    public boolean A07(MotionEvent motionEvent) {
        ImageView imageView;
        int i;
        C14360o3.A0B(motionEvent, 0);
        AnonymousClass308 anonymousClass308 = ((C668730e) this).A00;
        Integer num = anonymousClass308.A0C;
        Integer num2 = C05F.A0N;
        if (num == num2 || num == C05F.A0j) {
            UserSession userSession = anonymousClass308.A0T;
            AbstractC25651Mw.A00(userSession).A05(new C38013Gnz(true));
            anonymousClass308.A0E = false;
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            C140366Wq c140366Wq = anonymousClass308.A09;
            if (c140366Wq != null) {
                ImageView imageView2 = c140366Wq.A06;
                C14360o3.A06(imageView2);
                Context context = anonymousClass308.A0P;
                int i2 = 2131965099;
                if (C57532kS.A00(userSession).A0N(anonymousClass308.A07())) {
                    i2 = 2131976160;
                }
                String string = context.getString(i2);
                C14360o3.A07(string);
                if (!AnonymousClass308.A04(imageView2, anonymousClass308, string, rawX, rawY)) {
                    boolean z = anonymousClass308.A0d;
                    float rawX2 = motionEvent.getRawX();
                    float rawY2 = motionEvent.getRawY();
                    C140366Wq c140366Wq2 = anonymousClass308.A09;
                    if (z) {
                        if (c140366Wq2 != null) {
                            imageView = c140366Wq2.A05;
                            C14360o3.A06(imageView);
                            i = 2131956426;
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else if (c140366Wq2 != null) {
                        imageView = c140366Wq2.A08;
                        C14360o3.A06(imageView);
                        i = 2131976876;
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                    String string2 = context.getString(i);
                    C14360o3.A07(string2);
                    if (!AnonymousClass308.A04(imageView, anonymousClass308, string2, rawX2, rawY2)) {
                        float rawX3 = motionEvent.getRawX();
                        float rawY3 = motionEvent.getRawY();
                        C140366Wq c140366Wq3 = anonymousClass308.A09;
                        if (c140366Wq3 != null) {
                            ImageView imageView3 = c140366Wq3.A09;
                            C14360o3.A06(imageView3);
                            String string3 = context.getString(2131973639);
                            C14360o3.A07(string3);
                            if (!AnonymousClass308.A04(imageView3, anonymousClass308, string3, rawX3, rawY3)) {
                                float rawX4 = motionEvent.getRawX();
                                float rawY4 = motionEvent.getRawY();
                                C140366Wq c140366Wq4 = anonymousClass308.A09;
                                if (c140366Wq4 != null) {
                                    ImageView imageView4 = c140366Wq4.A07;
                                    C14360o3.A06(imageView4);
                                    String string4 = context.getString(2131966337);
                                    C14360o3.A07(string4);
                                    if (!AnonymousClass308.A04(imageView4, anonymousClass308, string4, rawX4, rawY4)) {
                                        anonymousClass308.A02 = null;
                                        anonymousClass308.A0C = num2;
                                    }
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                }
                anonymousClass308.A0C = C05F.A0j;
                return true;
            }
            throw new IllegalStateException("Required value was null.");
        }
        return false;
    }

    public boolean A08(MotionEvent motionEvent) {
        AnonymousClass308 anonymousClass308 = ((C668730e) this).A00;
        View view = anonymousClass308.A04;
        if (view != null) {
            view.setVisibility(4);
        }
        anonymousClass308.A0C = C05F.A01;
        return true;
    }

    public abstract boolean A0A(MotionEvent motionEvent);

    public boolean A0B(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        AnonymousClass308 anonymousClass308 = ((C668730e) this).A00;
        if (anonymousClass308.A0C == C05F.A0j) {
            float rawX = motionEvent2.getRawX();
            float rawY = motionEvent2.getRawY();
            View view = anonymousClass308.A02;
            if (view != null) {
                if (AbstractC53976Ntn.A00(view, rawX, rawY)) {
                    return true;
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean A09(android.view.MotionEvent r31) {
        /*
            Method dump skipped, instructions count: 761
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC668830f.A09(android.view.MotionEvent):boolean");
    }
}
