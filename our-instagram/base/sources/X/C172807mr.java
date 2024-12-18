package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.7mr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C172807mr {
    public final Integer A00;
    public final List A01;
    public final C9CD A02;

    public C172807mr(Integer num, List list) {
        Object obj;
        this.A01 = list;
        this.A00 = num;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C9CD) obj).A03) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.A02 = (C9CD) obj;
    }
}
