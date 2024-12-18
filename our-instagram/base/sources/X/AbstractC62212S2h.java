package X;

import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.S2h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62212S2h {
    public static List A00(InterfaceC65418Tjp interfaceC65418Tjp, List list) {
        if (list instanceof RandomAccess) {
            return new TZC(interfaceC65418Tjp, list);
        }
        return new TZO(interfaceC65418Tjp, list);
    }
}
