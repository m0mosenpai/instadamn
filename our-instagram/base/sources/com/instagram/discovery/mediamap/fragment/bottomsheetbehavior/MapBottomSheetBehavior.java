package com.instagram.discovery.mediamap.fragment.bottomsheetbehavior;

import X.AbstractC13600mm;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.AbstractC25230BEn;
import X.AbstractC43594JPz;
import X.C14360o3;
import X.C55952hg;
import X.C55982hj;
import X.InterfaceC55932he;
import X.InterfaceC57947Pmt;
import X.InterfaceC58175Pqf;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes9.dex */
public final class MapBottomSheetBehavior extends CoordinatorLayout.Behavior implements InterfaceC55932he, GestureDetector.OnGestureListener {
    public float A00;
    public float A01;
    public InterfaceC57947Pmt A02;
    public InterfaceC58175Pqf A03;
    public Float A04;
    public WeakReference A05;
    public boolean A06;
    public boolean A07;
    public float A08;
    public float A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final double A0E;
    public final C55982hj A0F;
    public final GestureDetector A0G;

    public MapBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        C14360o3.A0B(context, 1);
        C55982hj A02 = C55952hg.A00().A02();
        A02.A06 = true;
        this.A0F = A02;
        this.A0E = ViewConfiguration.get(context).getScaledTouchSlop();
        this.A0G = new GestureDetector(context, this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void A0I(View view, View view2, CoordinatorLayout coordinatorLayout, int i) {
        C14360o3.A0B(view2, 2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean A0L(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        boolean A1R = AbstractC167007dF.A1R(0, coordinatorLayout, view);
        C14360o3.A0B(motionEvent, 2);
        if (!coordinatorLayout.A0G(view, Math.round(motionEvent.getX()), Math.round(motionEvent.getY()))) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 2 && !this.A07 && !this.A06) {
                float rawX = this.A00 - motionEvent.getRawX();
                float rawY = this.A01 - motionEvent.getRawY();
                boolean A1O = AbstractC167007dF.A1O((AbstractC43594JPz.A00(rawX, rawY) > this.A0E ? 1 : (AbstractC43594JPz.A00(rawX, rawY) == this.A0E ? 0 : -1)));
                double A01 = AbstractC43594JPz.A01(rawY, rawX);
                if (A1O) {
                    if (A01 < 45.0d) {
                        this.A06 = A1R;
                    } else {
                        this.A07 = A1R;
                    }
                }
            }
        } else {
            this.A0B = false;
            this.A0A = false;
            this.A0C = false;
            this.A06 = false;
            this.A07 = false;
            this.A00 = motionEvent.getRawX();
            this.A01 = motionEvent.getRawY();
            this.A08 = 0.0f;
        }
        this.A0G.onTouchEvent(motionEvent);
        motionEvent.getRawY();
        boolean A1W = AbstractC167007dF.A1W(this.A02);
        if (!this.A07 || ((this.A0B || !A1W) && ((float) this.A0F.A09.A00) >= 1.0f && !this.A0A)) {
            return false;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean A0M(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        InterfaceC58175Pqf interfaceC58175Pqf;
        C14360o3.A0B(motionEvent, 2);
        this.A0C = true;
        if ((!this.A0D && motionEvent.getActionMasked() == 2) || motionEvent.getActionMasked() == 0) {
            this.A0D = true;
            InterfaceC58175Pqf interfaceC58175Pqf2 = this.A03;
            if (interfaceC58175Pqf2 != null) {
                interfaceC58175Pqf2.CzJ();
            }
        }
        boolean onTouchEvent = this.A0G.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1) {
            C55982hj c55982hj = this.A0F;
            c55982hj.A07((-this.A08) / A00());
            if (this.A02 != null) {
                c55982hj.A06(r5.APE(this.A09, (float) c55982hj.A09.A00, this.A08));
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            InterfaceC58175Pqf interfaceC58175Pqf3 = this.A03;
            if (interfaceC58175Pqf3 != null) {
                interfaceC58175Pqf3.DDg();
            }
            this.A0D = false;
            if (this.A0F.A0C() && (interfaceC58175Pqf = this.A03) != null) {
                interfaceC58175Pqf.Dl6();
            }
        }
        return onTouchEvent;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean A0Q(View view, CoordinatorLayout coordinatorLayout, int i) {
        C14360o3.A0B(view, 1);
        if (this.A05 == null) {
            this.A05 = AbstractC25225BEi.A16(view);
            view.setVisibility(0);
            C55982hj c55982hj = this.A0F;
            c55982hj.A02();
            this.A09 = (float) c55982hj.A09.A00;
            c55982hj.A0A(this);
            InterfaceC58175Pqf interfaceC58175Pqf = this.A03;
            if (interfaceC58175Pqf != null) {
                interfaceC58175Pqf.D06();
            }
        }
        return false;
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        this.A09 = (float) c55982hj.A09.A00;
        InterfaceC58175Pqf interfaceC58175Pqf = this.A03;
        if (interfaceC58175Pqf != null && !this.A0D) {
            interfaceC58175Pqf.Dl6();
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        InterfaceC58175Pqf interfaceC58175Pqf = this.A03;
        if (interfaceC58175Pqf != null) {
            interfaceC58175Pqf.Diw(this, (float) c55982hj.A01);
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        View view;
        float f;
        C14360o3.A0B(c55982hj, 0);
        WeakReference weakReference = this.A05;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            float f2 = (float) c55982hj.A09.A00;
            Float f3 = this.A04;
            float f4 = 0.0f;
            if (f3 != null) {
                f = f3.floatValue();
            } else {
                f = 0.0f;
            }
            if (f2 <= f || f2 >= 1.0f) {
                this.A0F.A07(0.0d);
                Float f5 = this.A04;
                if (f5 != null) {
                    f4 = f5.floatValue();
                }
                f2 = AbstractC13600mm.A00(f2, f4, 1.0f);
            }
            float A00 = A00();
            float f6 = 1.0f - 0.0f;
            float f7 = 0.0f - A00;
            float f8 = 0.0f;
            if (f6 != 0.0f) {
                f8 = (f2 - 0.0f) / f6;
            }
            float f9 = (f8 * f7) + A00;
            float translationY = view.getTranslationY();
            view.setTranslationY(f9);
            InterfaceC58175Pqf interfaceC58175Pqf = this.A03;
            if (interfaceC58175Pqf != null) {
                interfaceC58175Pqf.Dip(this, f2, f9, translationY);
            }
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
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

    private final int A00() {
        View view;
        WeakReference weakReference = this.A05;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            Object parent = view.getParent();
            if (parent != null) {
                return ((View) parent).getHeight();
            }
            throw AbstractC166997dE.A0g();
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
    
        if ((r7 & 2) != 0) goto L6;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0N(android.view.View r3, android.view.View r4, android.view.View r5, androidx.coordinatorlayout.widget.CoordinatorLayout r6, int r7, int r8) {
        /*
            r2 = this;
            boolean r0 = r2.A0B
            if (r0 != 0) goto L9
            r1 = r7 & 2
            r0 = 0
            if (r1 == 0) goto La
        L9:
            r0 = 1
        La:
            r2.A0B = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.discovery.mediamap.fragment.bottomsheetbehavior.MapBottomSheetBehavior.A0N(android.view.View, android.view.View, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout, int, int):boolean");
    }

    public final void A0R(boolean z, float f) {
        float A00 = AbstractC13600mm.A00(f, 0.0f, 1.0f);
        C55982hj c55982hj = this.A0F;
        double d = A00;
        if (z) {
            c55982hj.A06(d);
            return;
        }
        c55982hj.A06(d);
        c55982hj.A08(d, true);
        this.A09 = (float) c55982hj.A09.A00;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.A08 = f2;
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void A0J(View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        this.A0A = AbstractC25230BEn.A1P(i4);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (A00() != 0 && this.A0C) {
            this.A0F.A08(AbstractC13600mm.A00(((float) r3.A09.A00) + (f2 / A00()), 0.0f, 1.0f), true);
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void A0P(View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr, int i, int i2, int i3) {
        AbstractC167027dH.A12(coordinatorLayout, view, view2);
    }
}
