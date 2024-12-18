package X;

import java.util.Collection;
import java.util.Map;

/* renamed from: X.Glk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37890Glk implements InterfaceC61432r6 {
    public final C115325Jg A00;
    public final InterfaceC115375Jl A01;

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
        if (anonymousClass317 == AnonymousClass317.A08) {
            this.A00.A00(AbstractC37303Gc4.A0G(c120985dq), c120985dq, obj2);
            return;
        }
        throw AbstractC37303Gc4.A0M(anonymousClass317, "Wrong signal type in CtaClickRealtimeSignalProviderImpl for Clips: ", AbstractC166987dD.A1C());
    }

    public C37890Glk(InterfaceC115375Jl interfaceC115375Jl, C115325Jg c115325Jg) {
        this.A00 = c115325Jg;
        this.A01 = interfaceC115375Jl;
    }
}
