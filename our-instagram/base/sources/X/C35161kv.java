package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1kv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35161kv implements InterfaceC29421bJ {
    public static final C0KV A01 = C35171kw.A00;
    public final UserSession A00;

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUn(C1OW c1ow, MNP mnp) {
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUr(C1OW c1ow, MNP mnp) {
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUs(C1OW c1ow, MNP mnp, MNP mnp2) {
        C35131ks c35131ks = (C35131ks) c1ow;
        C14360o3.A0B(c35131ks, 0);
        C2DS A00 = C2JD.A00(this.A00);
        DirectThreadKey C7Q = c35131ks.C7Q();
        String str = c35131ks.A01;
        if (str != null) {
            A00.EZ5(c35131ks.A00, C7Q, str);
        } else {
            C14360o3.A0F("itemId");
            throw C00O.createAndThrow();
        }
    }

    public C35161kv(UserSession userSession) {
        this.A00 = userSession;
    }
}
