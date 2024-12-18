package X;

import com.facebook.rsys.call.gen.CallModel;
import java.util.List;

/* loaded from: classes8.dex */
public final class MJ2 extends C0YY implements InterfaceC16660sJ {
    public static final MJ2 A00 = new MJ2();

    public MJ2() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C55736Op5 c55736Op5 = (C55736Op5) obj;
        C14360o3.A0B(c55736Op5, 0);
        MMZ mmz = new AnonymousClass019() { // from class: X.MMZ
            @Override // X.AnonymousClass019, X.InterfaceC016606k
            public final Object get(Object obj2) {
                return ((CallModel) obj2).remoteParticipants;
            }
        };
        AbstractC09800fd.A01("SubscriptionInitializerV3.selectProperty", -1455656415);
        try {
            AbstractC09800fd.A01("SubscriptionInitializerV3.selectProperty", 1947771470);
            try {
                JQ1.A0g(c55736Op5, mmz, null, (List) AbstractC43594JPz.A0s(CallModel.class, c55736Op5.A01));
                AbstractC09800fd.A00(-1152715074);
                AbstractC09800fd.A00(-1521771642);
                return C0eB.A00;
            } catch (Throwable th) {
                AbstractC09800fd.A00(2005465211);
                throw th;
            }
        } catch (Throwable th2) {
            AbstractC09800fd.A00(-803286807);
            throw th2;
        }
    }
}
