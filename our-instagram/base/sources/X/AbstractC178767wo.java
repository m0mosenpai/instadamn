package X;

import android.os.Handler;

/* renamed from: X.7wo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC178767wo {
    public static final Handler A00(InterfaceC178207vu interfaceC178207vu) {
        String str;
        Handler handler = (Handler) interfaceC178207vu.AqG(InterfaceC178107vj.A0I);
        if (handler == null) {
            InterfaceC178287w2 Aq1 = interfaceC178207vu.Aq1(InterfaceC178297w3.A00);
            C14360o3.A07(Aq1);
            InterfaceC178297w3 interfaceC178297w3 = (InterfaceC178297w3) Aq1;
            if (C14360o3.A0K(interfaceC178207vu.AqG(InterfaceC178107vj.A0K), true)) {
                str = "Lite-Urgent-SurfacePipe-Thread";
                C178267w0.A01().A00("Lite-Urgent-SurfacePipe-Thread", -8);
            } else {
                str = "Lite-SurfacePipe-Thread";
            }
            if (C14360o3.A0K(interfaceC178207vu.AqG(InterfaceC178107vj.A0M), true)) {
                str = AnonymousClass001.A0O("OC-", interfaceC178207vu.hashCode());
                C178267w0.A01().A00(str, 0);
            }
            Handler BAu = interfaceC178297w3.BAu(str);
            C14360o3.A07(BAu);
            return BAu;
        }
        return handler;
    }
}
