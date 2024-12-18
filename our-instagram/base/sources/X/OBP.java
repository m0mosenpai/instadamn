package X;

import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public final class OBP {
    public static OBP A03;
    public C56194Ox1 A01;
    public final List A02 = Collections.synchronizedList(AbstractC166987dD.A1E());
    public Integer A00 = C05F.A0Y;

    public OBP() {
        C56194Ox1 c56194Ox1 = new C56194Ox1(this);
        this.A01 = c56194Ox1;
        C15670qN c15670qN = C18150uz.A0B;
        c15670qN.A03(c56194Ox1);
        this.A01.onConnectionChanged(c15670qN.A01().A03());
    }
}
