package X;

import com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3uT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC87103uT {
    public static final String A00(IGAdTransparencyDisclaimerPlacement iGAdTransparencyDisclaimerPlacement, InterfaceC104904o2 interfaceC104904o2) {
        List AyF;
        Object obj;
        if (interfaceC104904o2 == null || (AyF = interfaceC104904o2.AyF()) == null) {
            return null;
        }
        Iterator it = AyF.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((InterfaceC105994qD) obj).Bde() == iGAdTransparencyDisclaimerPlacement) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        InterfaceC105994qD interfaceC105994qD = (InterfaceC105994qD) obj;
        if (interfaceC105994qD != null) {
            return interfaceC105994qD.BKx();
        }
        return null;
    }
}
