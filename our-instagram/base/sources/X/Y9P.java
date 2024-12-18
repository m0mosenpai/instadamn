package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public final class Y9P implements InterfaceC02770Bb {
    public final /* synthetic */ C73299Xzp A00;

    public Y9P(C73299Xzp c73299Xzp) {
        this.A00 = c73299Xzp;
    }

    @Override // X.InterfaceC02770Bb
    public final void EmS(C02760Ba c02760Ba, String str) {
        String str2;
        String str3 = this.A00.A01;
        if (str3 != null) {
            str = AnonymousClass001.A0g(str, ":", str3);
        }
        List list = c02760Ba.A02;
        switch (c02760Ba.A00.intValue()) {
            case 0:
                str2 = "Camera wasn't closed before the app was backgrounded.";
                break;
            case 1:
                str2 = "Camera opened while the app was backgrounded.";
                break;
            default:
                str2 = "Camera opened but not used.";
                break;
        }
        if (!list.isEmpty()) {
            StringBuilder sb = new StringBuilder(str2);
            sb.append(" ");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sb.append(AbstractC166987dD.A1B(it));
            }
            str2 = sb.toString();
        }
        C0w9.A05(str, str2, 1, c02760Ba.A01);
    }
}
