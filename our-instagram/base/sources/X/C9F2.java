package X;

import androidx.fragment.app.Fragment;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.LinkedHashMap;

/* renamed from: X.9F2, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9F2 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9F2(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Object invoke;
        C07N c07n;
        Object invoke2;
        switch (this.A00) {
            case 2:
                C1EU c1eu = ((C1I1) this.A01).A00;
                LinkedHashMap A03 = AbstractC06930Yk.A03(c1eu.A0D);
                A03.put("is_retry_request", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                C61842rl c61842rl = (C61842rl) this.A02;
                c61842rl.A0A(c1eu.A04, c1eu.A08, A03);
                c61842rl.A0L = null;
                break;
            case 3:
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A01;
                if (interfaceC16820sZ != null && (invoke = interfaceC16820sZ.invoke()) != null) {
                    return invoke;
                }
                return ((Fragment) this.A02).requireActivity().getDefaultViewModelCreationExtras();
            case 4:
            case 5:
            case 6:
            default:
                InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) this.A01;
                if (interfaceC16820sZ2 == null || (invoke2 = interfaceC16820sZ2.invoke()) == null) {
                    InterfaceC018407e interfaceC018407e = (InterfaceC018407e) ((InterfaceC09390do) this.A02).getValue();
                    if ((interfaceC018407e instanceof C07N) && (c07n = (C07N) interfaceC018407e) != null) {
                        return c07n.getDefaultViewModelCreationExtras();
                    }
                    return C52962bd.A00;
                }
                return invoke2;
            case 7:
                ((C143556du) this.A01).BGy().setAlpha(1.0f);
                ((C141956bE) this.A02).A06.EJJ();
                break;
        }
        return C0eB.A00;
    }
}
