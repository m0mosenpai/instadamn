package X;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes11.dex */
public final class WbO implements InterfaceC65383TjG {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public WbO(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // X.InterfaceC65383TjG
    public final void DP6(C62901SWh c62901SWh) {
        switch (this.A00) {
            case 0:
                ((UGL) this.A02).A00.onClick(((C66460UIk) this.A01).A00);
                return;
            case 1:
                String str = c62901SWh.A03;
                if (str == null) {
                    return;
                }
                Context context = (Context) this.A02;
                boolean z = c62901SWh.A00;
                AbstractC61604RqT A07 = C2FP.A07();
                if (z) {
                    A07.A00(context, str);
                    return;
                } else {
                    A07.A01(context, str);
                    return;
                }
            default:
                String str2 = c62901SWh.A03;
                if (str2 != null) {
                    C0b3.A00().A04().A0G((Context) this.A02, new Intent("android.intent.action.VIEW").setData(AbstractC08820cl.A03(str2)));
                    return;
                }
                return;
        }
    }
}
