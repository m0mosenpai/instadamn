package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.M5f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49990M5f implements Runnable {
    public final /* synthetic */ C45113Jxi A00;
    public final /* synthetic */ C48515LdD A01;
    public final /* synthetic */ String A02;

    public RunnableC49990M5f(C45113Jxi c45113Jxi, C48515LdD c48515LdD, String str) {
        this.A01 = c48515LdD;
        this.A00 = c45113Jxi;
        this.A02 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C48515LdD c48515LdD = this.A01;
        List list = c48515LdD.A02;
        AnonymousClass016.A1A(list, new C50361MLn(this.A02, 29));
        list.add(0, this.A00);
        C48515LdD.A00(c48515LdD);
        List list2 = c48515LdD.A03;
        Iterator it = list2.iterator();
        if (it.hasNext()) {
            it.next();
            throw AbstractC166987dD.A15("onMagicMediaDraftsUpdated");
        }
        Iterator it2 = list2.iterator();
        if (it2.hasNext()) {
            it2.next();
            throw AbstractC166987dD.A15("onMagicMediaDraftSaved");
        }
    }
}
