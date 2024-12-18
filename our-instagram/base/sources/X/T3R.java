package X;

import java.io.ByteArrayInputStream;
import java.security.cert.CertificateFactory;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class T3R implements InterfaceC65510Tlf {
    public final /* synthetic */ SPP A00;

    @Override // X.InterfaceC65510Tlf
    public final void AWQ(C63001SaP c63001SaP) {
    }

    public T3R(SPP spp) {
        this.A00 = spp;
    }

    @Override // X.InterfaceC65510Tlf
    public final C2GT BtY(SJ1 sj1) {
        List list = this.A00.A06;
        if (list == null) {
            list = C16930sl.A00;
        }
        List unmodifiableList = Collections.unmodifiableList(list);
        try {
            CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(MSY.A1a(AbstractC16490ru.A0p(AnonymousClass001.A0g("\n            -----BEGIN CERTIFICATE-----\n            ", (String) AbstractC166987dD.A16(list), "\n            -----END CERTIFICATE-----\n            ")))));
        } catch (Throwable unused) {
        }
        return new C2GT(C63406Sjd.A04(AbstractC166987dD.A16(unmodifiableList)));
    }
}
