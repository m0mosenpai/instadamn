package X;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import java.util.concurrent.CancellationException;

/* renamed from: X.9DO, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9DO extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public final float A03;
    public final int A04 = 1;
    public final Object A05;
    public final Object A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DO(C6NW c6nw, C6MC c6mc, InterfaceC23621Ds interfaceC23621Ds, float f) {
        super(2, interfaceC23621Ds);
        this.A03 = f;
        this.A06 = c6nw;
        this.A05 = c6mc;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        if (this.A04 != 0) {
            SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) this.A06;
            float f = this.A03;
            return new C9DO((C6MC) this.A01, snapFlingBehavior, interfaceC23621Ds, (InterfaceC16660sJ) this.A05, f);
        }
        return new C9DO((C6NW) this.A06, (C6MC) this.A05, interfaceC23621Ds, this.A03);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C9DO) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Type inference failed for: r15v2, types: [X.0pO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.0pO, java.lang.Object] */
    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        float f;
        C5Y2 A00;
        C15080pO c15080pO;
        C15080pO c15080pO2;
        Object obj2 = obj;
        int i = this.A04;
        C1JX c1jx = C1JX.A02;
        if (i != 0) {
            int i2 = this.A00;
            if (i2 != 0) {
                if (i2 != 1) {
                    AbstractC09560e7.A00(obj2);
                    return obj2;
                }
                C15080pO c15080pO3 = (C15080pO) this.A02;
                AbstractC09560e7.A00(obj2);
                c15080pO2 = c15080pO3;
            } else {
                AbstractC09560e7.A00(obj2);
                SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) this.A06;
                C6MY c6my = snapFlingBehavior.A02;
                float f2 = this.A03;
                float AF3 = snapFlingBehavior.A03.AF3(f2, AbstractC28007CWe.A00(c6my, 0.0f, f2));
                if (!Float.isNaN(AF3)) {
                    ?? obj3 = new Object();
                    float abs = Math.abs(AF3) * Math.signum(f2);
                    obj3.A00 = abs;
                    InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A05;
                    interfaceC16660sJ.invoke(new Float(abs));
                    C6MC c6mc = (C6MC) this.A01;
                    float f3 = obj3.A00;
                    DRZ drz = new DRZ(21, interfaceC16660sJ, obj3);
                    this.A02 = obj3;
                    this.A00 = 1;
                    obj2 = SnapFlingBehavior.A01(c6mc, snapFlingBehavior, this, drz, f3, f2);
                    c15080pO2 = obj3;
                    if (obj2 == c1jx) {
                        return c1jx;
                    }
                } else {
                    throw new IllegalStateException("calculateApproachOffset returned NaN. Please use a valid value.");
                }
            }
            C5Y2 c5y2 = (C5Y2) obj2;
            SnapFlingBehavior snapFlingBehavior2 = (SnapFlingBehavior) this.A06;
            float AFI = snapFlingBehavior2.A03.AFI(((Number) c5y2.A00()).floatValue());
            if (!Float.isNaN(AFI)) {
                c15080pO2.A00 = AFI;
                C6MC c6mc2 = (C6MC) this.A01;
                C5Y2 A01 = BG4.A01(c5y2, 0.0f, 0.0f, 30);
                C5Y6 c5y6 = snapFlingBehavior2.A01;
                DRZ drz2 = new DRZ(20, this.A05, c15080pO2);
                this.A02 = null;
                this.A00 = 2;
                obj2 = SnapFlingBehaviorKt.A00(c5y6, A01, c6mc2, this, drz2, AFI, AFI);
                if (obj2 != c1jx) {
                    return obj2;
                }
                return c1jx;
            }
            throw new IllegalStateException("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        int i3 = this.A00;
        try {
        } catch (CancellationException unused) {
            c15080pO.A00 = ((Number) A00.A00()).floatValue();
        }
        if (i3 != 0) {
            if (i3 == 1) {
                A00 = (C5Y2) this.A02;
                C15080pO c15080pO4 = (C15080pO) this.A01;
                AbstractC09560e7.A00(obj2);
                c15080pO = c15080pO4;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC09560e7.A00(obj2);
            f = this.A03;
            if (Math.abs(f) > 1.0f) {
                ?? obj4 = new Object();
                obj4.A00 = f;
                Object obj5 = new Object();
                A00 = BG4.A00(0.0f, f);
                C6NW c6nw = (C6NW) this.A06;
                C6MY c6my2 = c6nw.A01;
                C50372MLz c50372MLz = new C50372MLz(2, this.A05, c6nw, obj4, obj5);
                this.A01 = obj4;
                this.A02 = A00;
                this.A00 = 1;
                c15080pO = obj4;
                if (SuspendAnimationKt.A04(A00, c6my2, this, c50372MLz, false) == c1jx) {
                    return c1jx;
                }
            }
            return new Float(f);
        }
        f = c15080pO.A00;
        return new Float(f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DO(C6MC c6mc, SnapFlingBehavior snapFlingBehavior, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ, float f) {
        super(2, interfaceC23621Ds);
        this.A06 = snapFlingBehavior;
        this.A03 = f;
        this.A05 = interfaceC16660sJ;
        this.A01 = c6mc;
    }
}
