package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0Uf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06150Uf extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ C0UO A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06150Uf(InterfaceC23621Ds interfaceC23621Ds, C0UO c0uo) {
        super(2, interfaceC23621Ds);
        this.A02 = c0uo;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C06150Uf c06150Uf = new C06150Uf(interfaceC23621Ds, this.A02);
        c06150Uf.A01 = obj;
        return c06150Uf;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C06150Uf) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0oO, java.lang.Object] */
    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            InterfaceC19960yQ interfaceC19960yQ = (InterfaceC19960yQ) this.A01;
            ?? obj2 = new Object();
            C0UO c0uo = this.A02;
            C14960pB c14960pB = new C14960pB((C14510oO) obj2, interfaceC19960yQ, 5);
            this.A00 = 1;
            if (c0uo.collect(c14960pB, this) == c1jx) {
                return c1jx;
            }
        }
        throw new PW2();
    }
}
