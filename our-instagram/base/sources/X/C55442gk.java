package X;

import com.instagram.quickpromotion.intf.Trigger;
import com.instagram.quickpromotion.sdk.InstagramQpSdkModule;
import java.util.ConcurrentModificationException;

/* renamed from: X.2gk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C55442gk extends C0YY implements InterfaceC16660sJ {
    public static final C55442gk A00 = new C55442gk();

    public C55442gk() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C4O1 c4o1 = (C4O1) obj;
        C14360o3.A0B(c4o1, 0);
        try {
            for (C55312gW c55312gW : InstagramQpSdkModule.A05) {
                if (c4o1 instanceof C4O2) {
                    Trigger trigger = c4o1.A00;
                    String str = ((C4O2) c4o1).A00;
                    C14360o3.A0B(trigger, 0);
                    if (C55312gW.A00(c55312gW, trigger) != 0) {
                        c55312gW.A01.flowEndFail(C55312gW.A00(c55312gW, trigger), str, "");
                    }
                } else if (c4o1 instanceof C4O0) {
                    Trigger trigger2 = c4o1.A00;
                    String str2 = ((C4O0) c4o1).A00;
                    C14360o3.A0B(trigger2, 0);
                    if (C55312gW.A00(c55312gW, trigger2) != 0) {
                        c55312gW.A01.flowMarkPoint(C55312gW.A00(c55312gW, trigger2), str2);
                    }
                } else {
                    throw new RuntimeException();
                }
            }
        } catch (ConcurrentModificationException e) {
            C0K8.A0F("IGqpSDKLogProducer", "Concurrent Exception", e);
        }
        return C0eB.A00;
    }
}
