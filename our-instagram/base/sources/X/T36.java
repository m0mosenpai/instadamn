package X;

import android.content.Context;
import android.content.Intent;
import android.view.ContextThemeWrapper;
import androidx.fragment.app.Fragment;

/* loaded from: classes10.dex */
public final class T36 implements InterfaceC65383TjG {
    public final int A00;
    public final Object A01;

    public T36(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC65383TjG
    public final void DP6(C62901SWh c62901SWh) {
        Intent A0C;
        android.net.Uri A03;
        switch (this.A00) {
            case 0:
                String str = c62901SWh.A03;
                if (str == null) {
                    return;
                }
                C58762Q7r c58762Q7r = (C58762Q7r) this.A01;
                AbstractC61604RqT A07 = C2FP.A07();
                ContextThemeWrapper contextThemeWrapper = c58762Q7r.A00;
                if (contextThemeWrapper == null) {
                    C14360o3.A0F("viewContext");
                    throw C00O.createAndThrow();
                }
                A07.A00(contextThemeWrapper, str);
                return;
            case 1:
                String str2 = c62901SWh.A03;
                if (str2 == null) {
                    return;
                }
                C2FP.A07().A00((Context) this.A01, str2);
                return;
            case 2:
                String str3 = c62901SWh.A03;
                if (str3 == null) {
                    str3 = "https://www.facebook.com/help/pay?ref=learn_more";
                }
                A0C = AbstractC58318PtA.A0C();
                A03 = AbstractC08820cl.A03(str3);
                C0b3.A00().A04().A0G(((Fragment) ((C63628Sqa) this.A01).A01).requireActivity(), A0C.setData(A03));
                return;
            default:
                String str4 = c62901SWh.A03;
                if (str4 != null) {
                    A0C = AbstractC58318PtA.A0C();
                    A03 = AbstractC08820cl.A03(str4);
                    C0b3.A00().A04().A0G(((Fragment) ((C63628Sqa) this.A01).A01).requireActivity(), A0C.setData(A03));
                    return;
                }
                return;
        }
    }
}
