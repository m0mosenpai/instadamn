package X;

import java.util.Iterator;

/* renamed from: X.JhS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44276JhS {
    public final /* synthetic */ C44274JhQ A00;

    public C44276JhS(C44274JhQ c44274JhQ) {
        this.A00 = c44274JhQ;
    }

    public final /* bridge */ /* synthetic */ void A00(Object obj) {
        C44059Jdk c44059Jdk = (C44059Jdk) obj;
        C44274JhQ c44274JhQ = this.A00;
        c44274JhQ.A01.A01.size();
        Iterator it = c44274JhQ.A02.iterator();
        while (it.hasNext()) {
            ((MRD) it.next()).D4s(c44059Jdk);
        }
    }
}
