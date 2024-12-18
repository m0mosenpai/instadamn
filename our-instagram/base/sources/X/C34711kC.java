package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1kC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34711kC implements InterfaceC29421bJ {
    public static final C0KV A01 = C34721kD.A00;
    public final InterfaceC09390do A00;

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUr(C1OW c1ow, MNP mnp) {
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUn(C1OW c1ow, MNP mnp) {
        C34681k9 c34681k9 = (C34681k9) c1ow;
        C14360o3.A0B(c34681k9, 0);
        C2DS c2ds = (C2DS) this.A00.getValue();
        DirectThreadKey C7Q = c34681k9.C7Q();
        String str = c34681k9.A00;
        if (str != null) {
            c2ds.EaV(C7Q, str, c34681k9.A03);
        } else {
            C14360o3.A0F("itemId");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUs(C1OW c1ow, MNP mnp, MNP mnp2) {
        C34681k9 c34681k9 = (C34681k9) c1ow;
        C14360o3.A0B(c34681k9, 0);
        C2DS c2ds = (C2DS) this.A00.getValue();
        DirectThreadKey C7Q = c34681k9.C7Q();
        String str = c34681k9.A00;
        if (str != null) {
            c2ds.EaV(C7Q, str, c34681k9.A03);
        } else {
            C14360o3.A0F("itemId");
            throw C00O.createAndThrow();
        }
    }

    public C34711kC(UserSession userSession) {
        this.A00 = AbstractC09440dt.A01(new MHI(userSession, 42));
    }
}
