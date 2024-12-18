package X;

import java.util.Collection;
import java.util.Map;

/* renamed from: X.GkQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37811GkQ implements InterfaceC61432r6 {
    public final C128475rG A00;
    public final InterfaceC128505rJ A01;

    @Override // X.InterfaceC61432r6
    public final Map AUS(String str) {
        C14360o3.A0B(str, 0);
        return this.A01.AUb(str);
    }

    @Override // X.InterfaceC61432r6
    public final /* synthetic */ void FCF(EnumC74603Ws enumC74603Ws, Collection collection) {
    }

    @Override // X.InterfaceC61432r6
    public final /* bridge */ /* synthetic */ void DVi(C6T6 c6t6, AnonymousClass317 anonymousClass317, Object obj, Object obj2) {
        C120985dq c120985dq = (C120985dq) obj;
        AbstractC167027dH.A12(anonymousClass317, c120985dq, obj2);
        C14360o3.A0B(c6t6, 3);
        if (anonymousClass317 == AnonymousClass317.A04) {
            C206209Bd c206209Bd = c6t6.A00;
            if (c206209Bd != null) {
                this.A00.A00(c206209Bd, AbstractC37303Gc4.A0G(c120985dq), c120985dq, obj2);
                return;
            }
            return;
        }
        throw AbstractC37303Gc4.A0M(anonymousClass317, AbstractC111324zv.A00(3818), AbstractC166987dD.A1C());
    }

    public C37811GkQ(InterfaceC128505rJ interfaceC128505rJ, C128475rG c128475rG) {
        this.A00 = c128475rG;
        this.A01 = interfaceC128505rJ;
    }
}
