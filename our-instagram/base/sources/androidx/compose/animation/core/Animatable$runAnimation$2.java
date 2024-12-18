package androidx.compose.animation.core;

import X.AbstractC09560e7;
import X.AbstractC118405Xc;
import X.AbstractC137336Kc;
import X.AbstractC23611Dp;
import X.C05F;
import X.C0eB;
import X.C118475Xj;
import X.C14510oO;
import X.C1JX;
import X.C5Y1;
import X.C5Y2;
import X.C60V;
import X.C62D;
import X.C9FX;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", i = {0, 0}, l = {312}, m = "invokeSuspend", n = {"endState", "clampingNeeded"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
public final class Animatable$runAnimation$2 extends AbstractC23611Dp implements InterfaceC16660sJ {
    public int A00;
    public Object A01;
    public Object A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ C5Y1 A04;
    public final /* synthetic */ C62D A05;
    public final /* synthetic */ Object A06;
    public final /* synthetic */ InterfaceC16660sJ A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Animatable$runAnimation$2(C5Y1 c5y1, C62D c62d, Object obj, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ, long j) {
        super(1, interfaceC23621Ds);
        this.A04 = c5y1;
        this.A06 = obj;
        this.A05 = c62d;
        this.A03 = j;
        this.A07 = interfaceC16660sJ;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        C5Y1 c5y1 = this.A04;
        Object obj = this.A06;
        return new Animatable$runAnimation$2(c5y1, this.A05, obj, interfaceC23621Ds, this.A07, this.A03);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((Animatable$runAnimation$2) create((InterfaceC23621Ds) obj)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C5Y2 c5y2;
        C14510oO c14510oO;
        Integer num;
        C1JX c1jx = C1JX.A02;
        try {
            if (this.A00 != 0) {
                C14510oO c14510oO2 = (C14510oO) this.A02;
                c5y2 = (C5Y2) this.A01;
                AbstractC09560e7.A00(obj);
                c14510oO = c14510oO2;
            } else {
                AbstractC09560e7.A00(obj);
                C5Y1 c5y1 = this.A04;
                C5Y2 c5y22 = c5y1.A04;
                c5y22.A02 = (AbstractC118405Xc) ((C118475Xj) c5y1.A07).A01.invoke(this.A06);
                C62D c62d = this.A05;
                c5y1.A09.Egh(c62d.C5Z());
                c5y1.A08.Egh(true);
                Object value = c5y22.A05.getValue();
                c5y2 = new C5Y2(AbstractC137336Kc.A00(c5y22.A02), c5y22.A04, value, c5y22.A01, Long.MIN_VALUE, c5y22.A03);
                Object obj2 = new Object();
                long j = this.A03;
                C9FX c9fx = new C9FX(0, this.A07, c5y1, c5y2, obj2);
                this.A01 = c5y2;
                this.A02 = obj2;
                this.A00 = 1;
                c14510oO = obj2;
                if (SuspendAnimationKt.A01(c62d, c5y2, this, c9fx, j) == c1jx) {
                    return c1jx;
                }
            }
            if (c14510oO.A00) {
                num = C05F.A00;
            } else {
                num = C05F.A01;
            }
            C5Y1.A01(this.A04);
            return new C60V(c5y2, num);
        } catch (CancellationException e) {
            C5Y1.A01(this.A04);
            throw e;
        }
    }
}
