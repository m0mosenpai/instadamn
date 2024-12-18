package X;

import android.app.Notification;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.PVb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57112PVb implements InterfaceC19960yQ {
    public static final C57112PVb A00 = new C57112PVb();

    @Override // X.InterfaceC19960yQ
    public final /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        String str;
        String str2;
        StringBuilder A1C;
        String str3;
        C1R4 c1r4 = (C1R4) obj;
        if (c1r4.A07) {
            new C23821Ep(AbstractC12290kX.A00).A00.cancel(null, 1909066919);
        } else {
            String str4 = c1r4.A05;
            if (str4 != null) {
                A1C = AbstractC166987dD.A1C();
                A1C.append("Error: ");
                A1C.append(str4);
            } else if (c1r4.A08) {
                str3 = "Configuring dogfooding...";
                XN9 xn9 = (XN9) OZO.A02.getValue();
                xn9.A0B(str3);
                Notification A03 = xn9.A03();
                C14360o3.A07(A03);
                new C23821Ep(AbstractC12290kX.A00).A00(null, 1909066919, A03);
            } else {
                if (c1r4.A09) {
                    str = "syncing";
                } else {
                    C1R3 c1r3 = C1R3.A03;
                    int i = c1r4.A00;
                    if (i != 0 && i != -1) {
                        str = String.valueOf(i);
                    } else {
                        str = NetInfoModule.CONNECTION_TYPE_NONE;
                    }
                }
                if (c1r4.A04 == C05F.A0C) {
                    str2 = "zero";
                } else {
                    str2 = "paid";
                }
                String A0z = AbstractC166997dE.A0z("%.1f", AbstractC166997dE.A1b(Double.valueOf((c1r4.A02 / 1024.0d) / 1024.0d), 1));
                String A0z2 = AbstractC166997dE.A0z("%.1f", AbstractC166997dE.A1b(Double.valueOf((c1r4.A03 / 1024.0d) / 1024.0d), 1));
                A1C = AbstractC166987dD.A1C();
                A1C.append("Carrier: ");
                A1C.append(str);
                A1C.append(" | Balance: ");
                A1C.append(str2);
                A1C.append("\nImage: ");
                A1C.append(A0z);
                A1C.append("MB | Video: ");
                A1C.append(A0z2);
                A1C.append("MB");
            }
            str3 = A1C.toString();
            XN9 xn92 = (XN9) OZO.A02.getValue();
            xn92.A0B(str3);
            Notification A032 = xn92.A03();
            C14360o3.A07(A032);
            new C23821Ep(AbstractC12290kX.A00).A00(null, 1909066919, A032);
        }
        return C0eB.A00;
    }
}
