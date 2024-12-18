package X;

import com.facebook.vesta.VestaClient;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
public final class L37 {
    public final LAI A03;
    public final L2C A04;
    public boolean A01 = false;
    public boolean A02 = false;
    public int A00 = 10;

    public L37(LAI lai, InterfaceC40711ue interfaceC40711ue, Integer num, Executor executor) {
        this.A04 = new L2C(new C47681L3o(interfaceC40711ue, executor, VestaClient.getApiVersionNative()), num);
        this.A03 = lai;
    }
}
