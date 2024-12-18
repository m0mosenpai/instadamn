package X;

import com.facebook.proxygen.LigerSamplePolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class WDx {
    public static final boolean A02(InterfaceC71973XDg interfaceC71973XDg, XA2 xa2) {
        C14360o3.A0B(xa2, 1);
        for (Object obj : xa2.FDV(interfaceC71973XDg)) {
            if (!((InterfaceC71974XDh) obj).Ca7()) {
                if (obj == null) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    public static final boolean A03(InterfaceC71973XDg interfaceC71973XDg, List list) {
        C14360o3.A0B(list, 1);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C09530e4 c09530e4 = (C09530e4) it.next();
            if (!C14360o3.A0K(c09530e4.A01, interfaceC71973XDg.getStringForKey((String) c09530e4.A00))) {
                return false;
            }
        }
        return true;
    }

    public static final List A01(List list, long j) {
        ArrayList A12 = AbstractC166997dE.A12(list, 2);
        for (Object obj : list) {
            InterfaceC71973XDg interfaceC71973XDg = (InterfaceC71973XDg) obj;
            C14360o3.A0B(interfaceC71973XDg, 0);
            if (j - interfaceC71973XDg.C8S() >= LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT) {
                A12.add(obj);
            }
        }
        return A12;
    }

    public static final String A00(InterfaceC71973XDg interfaceC71973XDg, String str) {
        if (AbstractC001900j.A0a(interfaceC71973XDg.BxO(), "gnv", false) && str.equals("m_pk")) {
            return AnonymousClass001.A0T(interfaceC71973XDg.getStringForKey("content_id"), interfaceC71973XDg.getStringForKey(AbstractC111324zv.A00(843)), '_');
        }
        return interfaceC71973XDg.getStringForKey(str);
    }
}
