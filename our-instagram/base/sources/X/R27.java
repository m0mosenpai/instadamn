package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class R27 extends AbstractC61609RqY {
    public String A00;
    public final C62755SPm A01;
    public final MUD A02;

    public static final SI7 A00(R27 r27) {
        List list = r27.A01.A04;
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((SI7) next).A01 == null) {
                obj = next;
                break;
            }
        }
        return (SI7) obj;
    }

    public R27(C62755SPm c62755SPm, MUD mud) {
        this.A01 = c62755SPm;
        this.A02 = mud;
    }
}
