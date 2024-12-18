package X;

import com.facebook.rsys.state.gen.State;
import java.util.List;

/* loaded from: classes8.dex */
public final class MJ0 extends C0YY implements InterfaceC16660sJ {
    public static final MJ0 A00 = new MJ0();

    public MJ0() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C55736Op5 c55736Op5 = (C55736Op5) obj;
        C14360o3.A0B(c55736Op5, 0);
        MMY mmy = new AnonymousClass019() { // from class: X.MMY
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj2) {
                return Integer.valueOf(((State) obj2).callState);
            }
        };
        AbstractC09800fd.A01("SubscriptionInitializerV3.selectProperty", 1700066710);
        try {
            AbstractC09800fd.A01("SubscriptionInitializerV3.selectProperty", -1515276624);
            try {
                JQ1.A0g(c55736Op5, mmy, null, (List) AbstractC43594JPz.A0s(State.class, c55736Op5.A01));
                AbstractC09800fd.A00(-2142870348);
                AbstractC09800fd.A00(-647768832);
                return C0eB.A00;
            } catch (Throwable th) {
                AbstractC09800fd.A00(605420656);
                throw th;
            }
        } catch (Throwable th2) {
            AbstractC09800fd.A00(488702233);
            throw th2;
        }
    }
}
