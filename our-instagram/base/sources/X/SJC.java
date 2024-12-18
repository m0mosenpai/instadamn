package X;

import java.net.Proxy;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class SJC {
    public int A00;
    public List A02;
    public final C62756SPn A04;
    public final C62461SCo A05;
    public final SUL A06;
    public final TIU A07;
    public List A01 = Collections.emptyList();
    public final List A03 = AbstractC166987dD.A1E();

    public SJC(C62756SPn c62756SPn, SUL sul, TIU tiu, C62461SCo c62461SCo) {
        List A06;
        this.A02 = Collections.emptyList();
        this.A04 = c62756SPn;
        this.A05 = c62461SCo;
        this.A07 = tiu;
        this.A06 = sul;
        C63379Sit c63379Sit = c62756SPn.A0A;
        Proxy proxy = c62756SPn.A00;
        if (proxy != null) {
            A06 = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = c62756SPn.A01.select(c63379Sit.A0B());
            if (select != null && !select.isEmpty()) {
                byte[] bArr = AbstractC63404SjZ.A07;
                A06 = AbstractC58322PtE.A10(select);
            } else {
                A06 = AbstractC63404SjZ.A06(Proxy.NO_PROXY);
            }
        }
        this.A02 = A06;
        this.A00 = 0;
    }
}
