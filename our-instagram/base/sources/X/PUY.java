package X;

import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public final class PUY implements InterfaceC08830cm {
    public final /* synthetic */ String A00;

    public PUY(String str) {
        this.A00 = str;
    }

    @Override // X.InterfaceC08830cm
    public final /* bridge */ /* synthetic */ Object get() {
        List list;
        String str = this.A00;
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
