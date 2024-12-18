package X;

import android.widget.TextView;
import java.util.List;

/* renamed from: X.3iN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80333iN implements InterfaceC80343iO {
    public TextView A00;
    public final C05A A01;

    @Override // X.InterfaceC80343iO
    public final void setEnabled(boolean z) {
        Object value;
        boolean z2;
        List list;
        C05A c05a = this.A01;
        do {
            value = c05a.getValue();
            C9BS c9bs = (C9BS) value;
            z2 = c9bs.A02;
            list = (List) c9bs.A00;
            C14360o3.A0B(list, 2);
        } while (!c05a.AIi(value, new C9BS(list, false, z2)));
    }

    @Override // X.InterfaceC80343iO
    public final TextView C3j() {
        return this.A00;
    }

    @Override // X.InterfaceC80343iO
    public final void ESX(List list) {
        Object value;
        C9BS c9bs;
        C05A c05a = this.A01;
        do {
            value = c05a.getValue();
            c9bs = (C9BS) value;
        } while (!c05a.AIi(value, new C9BS(list, c9bs.A01, c9bs.A02)));
    }

    @Override // X.InterfaceC80343iO
    public final void EhE(boolean z) {
        Object value;
        boolean z2;
        List list;
        C05A c05a = this.A01;
        do {
            value = c05a.getValue();
            C9BS c9bs = (C9BS) value;
            z2 = c9bs.A01;
            list = (List) c9bs.A00;
            C14360o3.A0B(list, 2);
        } while (!c05a.AIi(value, new C9BS(list, z2, z)));
    }

    public C80333iN(boolean z) {
        this.A01 = new C008002u(new C9BS((List) C16930sl.A00, z, false));
    }
}
