package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.1hr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33291hr implements InterfaceC29301b7 {
    public static final C0KV A03 = C33301hs.A00;
    public final UserSession A00;
    public final LHu A01;
    public final C2DS A02;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        AbstractC29011ae abstractC29011ae = (AbstractC29011ae) c1ow;
        C14360o3.A0B(abstractC29011ae, 0);
        C14360o3.A0B(mnp, 1);
        return LCX.A01(mnp, abstractC29011ae, this.A02);
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        String str;
        LHu lHu;
        C2JO A00;
        C33271hp c33271hp = (C33271hp) c1ow;
        C14360o3.A0B(c33271hp, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        DirectThreadKey directThreadKey = c33271hp.A02;
        if (directThreadKey != null) {
            String str2 = directThreadKey.A00;
            if (str2 == null) {
                List list = directThreadKey.A02;
                lHu = this.A01;
                String A06 = c33271hp.A06();
                String str3 = c33271hp.A04;
                if (str3 != null) {
                    AnonymousClass442 anonymousClass442 = c33271hp.A01;
                    L1W l1w = ((C1OW) c33271hp).A02.A00;
                    if (list != null && !list.isEmpty()) {
                        A00 = LHu.A00(l1w, anonymousClass442, str3, null, A06, list);
                        LHu.A01(A00, lHu.A00, interfaceC37261GbE);
                        return;
                    } else {
                        interfaceC37261GbE.DUq(C114675Fx.A0c, null);
                        return;
                    }
                }
                str = "stickerId";
            } else {
                lHu = this.A01;
                String A062 = c33271hp.A06();
                String str4 = c33271hp.A04;
                if (str4 != null) {
                    A00 = LHu.A00(((C1OW) c33271hp).A02.A00, c33271hp.A01, str4, str2, A062, null);
                    LHu.A01(A00, lHu.A00, interfaceC37261GbE);
                    return;
                }
                str = "stickerId";
            }
        } else {
            str = "threadKey";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public /* synthetic */ C33291hr(UserSession userSession) {
        C2DS A00 = AbstractC28761aE.A00(userSession);
        LHu lHu = new LHu(userSession);
        C14360o3.A0B(A00, 2);
        this.A00 = userSession;
        this.A02 = A00;
        this.A01 = lHu;
    }
}
