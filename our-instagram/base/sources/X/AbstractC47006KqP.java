package X;

import com.instagram.model.mediatype.ProductType;
import java.util.Iterator;

/* renamed from: X.KqP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47006KqP {
    public static final C84823qW A00(C45093JxN c45093JxN) {
        Object obj;
        Iterator it = c45093JxN.A0P.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                C84823qW c84823qW = (C84823qW) obj;
                if (c84823qW != null && c84823qW.A0n == ProductType.CLIPS && c84823qW.A12 == EnumC75383a5.A0k) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (C84823qW) obj;
    }
}
