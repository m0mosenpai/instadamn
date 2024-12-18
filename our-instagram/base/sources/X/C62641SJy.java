package X;

import java.io.IOException;
import java.util.Iterator;

/* renamed from: X.SJy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62641SJy {
    public final String A00(Iterable iterable) {
        Iterator it = iterable.iterator();
        StringBuilder A1C = AbstractC166987dD.A1C();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                A1C.append(AbstractC58323PtF.A0f(next, next));
                while (it.hasNext()) {
                    A1C.append((CharSequence) "\n");
                    Object next2 = it.next();
                    A1C.append(AbstractC58323PtF.A0f(next2, next2));
                }
            }
            return A1C.toString();
        } catch (IOException e) {
            throw AbstractC58318PtA.A0W(e);
        }
    }
}
