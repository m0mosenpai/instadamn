package X;

import com.facebook.vesta.VestaClient;
import java.util.concurrent.Executor;

/* renamed from: X.L3q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47683L3q {
    public final LAI A03;
    public final C47218Ktr A04;
    public final Integer A05;
    public boolean A01 = false;
    public boolean A02 = false;
    public int A00 = 10;

    public C47683L3q(LAI lai, InterfaceC40711ue interfaceC40711ue, Integer num, Executor executor) {
        this.A04 = new C47218Ktr(new C47682L3p(interfaceC40711ue, executor, VestaClient.getApiVersionNative()));
        this.A03 = lai;
        this.A05 = num;
    }
}
