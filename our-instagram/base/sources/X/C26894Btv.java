package X;

import com.instagram.clips.intf.ClipsViewerConfig;

/* renamed from: X.Btv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26894Btv extends C3r5 {
    public final InterfaceC30855DhU A05(ClipsViewerConfig clipsViewerConfig, C38321qM c38321qM) {
        InterfaceC30855DhU interfaceC30855DhU;
        Integer num;
        if (c38321qM != null && c38321qM.A5M()) {
            String str = clipsViewerConfig.A1I;
            if (str != null && str.equals(c38321qM.getId())) {
                num = clipsViewerConfig.A0X;
            } else {
                num = null;
            }
            interfaceC30855DhU = new C26237Bj6(num);
        } else {
            interfaceC30855DhU = C25480BOt.A00;
        }
        return interfaceC30855DhU;
    }
}
