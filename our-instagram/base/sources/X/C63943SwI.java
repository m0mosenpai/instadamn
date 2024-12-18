package X;

import android.os.Bundle;
import java.util.List;

/* renamed from: X.SwI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63943SwI implements InterfaceC30921DiY {
    public final Bundle A00;
    public final SOY A01;
    public final C5G6 A02;
    public final String A03;
    public final String A04;
    public final List A05;

    @Override // X.InterfaceC30921DiY
    public final void Cis(String str, boolean z) {
        java.util.Set set;
        C61602RqR A00 = this.A01.A00(str, false);
        A00.A0A = this.A04;
        List list = this.A05;
        int i = 0;
        if (list != null && !list.isEmpty()) {
            set = AbstractC58320PtC.A1C(list.get(0));
        } else {
            set = null;
        }
        A00.A07 = AbstractC63402SjX.A02(set);
        A00.A08 = this.A03;
        if (list != null) {
            i = list.size();
        }
        A00.A00 = i;
        A00.A0P = z;
        A00.A0M = true;
        AbstractC63402SjX.A0A(this.A00, this.A02, A00.A00());
    }

    public C63943SwI(Bundle bundle, SOY soy, C5G6 c5g6, String str, String str2, List list) {
        this.A01 = soy;
        this.A04 = str;
        this.A03 = str2;
        this.A05 = list;
        this.A00 = bundle;
        this.A02 = c5g6;
    }
}
