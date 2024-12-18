package X;

import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public final class PUZ implements InterfaceC08830cm {
    public final /* synthetic */ OGu A00;
    public final /* synthetic */ String A01;

    public PUZ(OGu oGu, String str) {
        this.A00 = oGu;
        this.A01 = str;
    }

    @Override // X.InterfaceC08830cm
    public final /* bridge */ /* synthetic */ Object get() {
        List list;
        String str = this.A01;
        if (str == null) {
            list = Collections.emptyList();
        } else {
            C5NU c5nu = new C5NU();
            c5nu.A01(str);
            list = c5nu.A02.A01;
        }
        return new C5F7(list);
    }
}
