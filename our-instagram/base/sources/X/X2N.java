package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
public final class X2N extends AbstractC105074oN implements InterfaceC16610sE {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ WEc A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X2N(InterfaceC23621Ds interfaceC23621Ds, WEc wEc) {
        super(3, interfaceC23621Ds);
        this.A02 = wEc;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        X2N x2n = new X2N((InterfaceC23621Ds) obj3, this.A02);
        x2n.A01 = obj;
        return x2n.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        boolean z = true;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            C71682Wya c71682Wya = (C71682Wya) this.A01;
            WEc wEc = this.A02;
            C3T3 c3t3 = wEc.A01;
            byte A04 = c3t3.A04();
            if (A04 != 1) {
                if (A04 == 0) {
                    z = false;
                } else if (A04 == 6) {
                    this.A00 = 1;
                    obj = WEc.A00(c71682Wya, this, wEc);
                    if (obj == c1jx) {
                        return c1jx;
                    }
                } else {
                    if (A04 == 8) {
                        return WEc.A01(wEc);
                    }
                    c3t3.A0F("Can't begin reading element, unexpected token", "", c3t3.A00);
                    throw C00O.createAndThrow();
                }
            }
            return WEc.A02(wEc, z);
        }
        return obj;
    }
}
