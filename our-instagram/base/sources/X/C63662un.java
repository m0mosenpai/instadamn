package X;

import java.util.Map;

/* renamed from: X.2un, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63662un {
    public final /* synthetic */ C61222qk A00;

    public C63662un(C61222qk c61222qk) {
        this.A00 = c61222qk;
    }

    public final void A00(String str, int i) {
        C61762rd c61762rd = this.A00.A0M;
        if (c61762rd == null) {
            C14360o3.A0F("_mainFeedStateStore");
            throw C00O.createAndThrow();
        }
        Map map = c61762rd.A0H;
        C114385Ef c114385Ef = (C114385Ef) map.get(str);
        if (c114385Ef != null) {
            c114385Ef.A01 = i;
            map.put(str, c114385Ef);
            c114385Ef.A05 = false;
        }
    }
}
