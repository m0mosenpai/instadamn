package X;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0U8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0U8 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AtomicInteger A02;
    public final /* synthetic */ InterfaceC24731Iq A03;
    public final /* synthetic */ InterfaceC19390xP[] A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U8(AtomicInteger atomicInteger, InterfaceC23621Ds interfaceC23621Ds, InterfaceC24731Iq interfaceC24731Iq, InterfaceC19390xP[] interfaceC19390xPArr, int i) {
        super(2, interfaceC23621Ds);
        this.A04 = interfaceC19390xPArr;
        this.A01 = i;
        this.A02 = atomicInteger;
        this.A03 = interfaceC24731Iq;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new C0U8(this.A02, interfaceC23621Ds, this.A03, this.A04, this.A01);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C0U8) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AtomicInteger atomicInteger;
        C1JX c1jx = C1JX.A02;
        try {
            if (this.A00 != 0) {
                AbstractC09560e7.A00(obj);
            } else {
                AbstractC09560e7.A00(obj);
                InterfaceC19390xP[] interfaceC19390xPArr = this.A04;
                int i = this.A01;
                InterfaceC19390xP interfaceC19390xP = interfaceC19390xPArr[i];
                C14910p5 c14910p5 = new C14910p5(this.A03, i);
                this.A00 = 1;
                if (interfaceC19390xP.collect(c14910p5, this) == c1jx) {
                    return c1jx;
                }
            }
            if (atomicInteger.decrementAndGet() == 0) {
                this.A03.AID(null);
            }
            return C0eB.A00;
        } finally {
            if (this.A02.decrementAndGet() == 0) {
                this.A03.AID(null);
            }
        }
    }
}
