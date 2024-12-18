package X;

import com.facebook.rsys.state.gen.State;
import java.util.List;

/* renamed from: X.MIz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50295MIz extends C0YY implements InterfaceC16660sJ {
    public static final C50295MIz A00 = new C50295MIz();

    public C50295MIz() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C55736Op5 c55736Op5 = (C55736Op5) obj;
        C14360o3.A0B(c55736Op5, 0);
        MMU mmu = new AnonymousClass019() { // from class: X.MMU
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj2) {
                return Integer.valueOf(((State) obj2).callState);
            }
        };
        AbstractC09800fd.A01("SubscriptionInitializerV3.selectProperty", -1468849419);
        try {
            AbstractC09800fd.A01("SubscriptionInitializerV3.selectProperty", 2057205858);
            try {
                JQ1.A0g(c55736Op5, mmu, null, (List) AbstractC43594JPz.A0s(State.class, c55736Op5.A01));
                AbstractC09800fd.A00(1620220025);
                AbstractC09800fd.A00(-919972863);
                return C0eB.A00;
            } catch (Throwable th) {
                AbstractC09800fd.A00(25000223);
                throw th;
            }
        } catch (Throwable th2) {
            AbstractC09800fd.A00(1235612080);
            throw th2;
        }
    }
}
