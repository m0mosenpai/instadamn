package X;

import android.os.Bundle;

/* loaded from: classes6.dex */
public final class GOH implements Runnable {
    public final /* synthetic */ EV0 A00;
    public final /* synthetic */ EDW A01;

    public GOH(EV0 ev0, EDW edw) {
        this.A00 = ev0;
        this.A01 = edw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle A00 = C35002FbZ.A00(this.A01.A00);
        A00.putBoolean("push_to_next", true);
        C33228ElK c33228ElK = (C33228ElK) this.A00.A01;
        AbstractC31181DnP.A0R(A00, c33228ElK.A03, c33228ElK.A04, c33228ElK.A05, true);
        AbstractC34231F8d.A00(A00, EnumC33365Eoy.A07);
        C140966Yy A0O = AbstractC31173DnH.A0O(A00, AbstractC31175DnJ.A0R().A01(c33228ElK.A01), c33228ElK.requireActivity(), c33228ElK.A01);
        A0O.A0F(c33228ElK, 0);
        A0O.A04();
    }
}
