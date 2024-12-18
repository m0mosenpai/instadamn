package X;

import com.instagram.model.showreel.IgShowreelComposition;
import java.util.UUID;

/* renamed from: X.6Su, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC139396Su {
    public static final C139406Sv A00(InterfaceC138736Qd interfaceC138736Qd, IgShowreelComposition igShowreelComposition) {
        String EqO = ((C138956Rc) interfaceC138736Qd).A04.EqO();
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        String Anz = igShowreelComposition.Anz();
        String C5i = igShowreelComposition.C5i();
        if (EqO == null) {
            EqO = "";
        }
        return new C139406Sv(obj, Anz, C5i, EqO, igShowreelComposition.Aqq().length());
    }
}
