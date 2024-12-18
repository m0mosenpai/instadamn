package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.pendingmedia.store.PendingMediaStoreSerializer;

/* renamed from: X.1eQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31211eQ implements InterfaceC29301b7, InterfaceC31091eE {
    public static final C0KV A06 = C31221eR.A00;
    public final UserSession A00;
    public final C2DS A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;

    public C31211eQ(UserSession userSession, C2DS c2ds, InterfaceC09390do interfaceC09390do, InterfaceC09390do interfaceC09390do2) {
        C14360o3.A0B(c2ds, 2);
        this.A00 = userSession;
        this.A01 = c2ds;
        this.A04 = interfaceC09390do;
        this.A05 = interfaceC09390do2;
        this.A03 = AbstractC09440dt.A01(new C206819Dm(this, 3));
        this.A02 = AbstractC09440dt.A00(EnumC09460dv.A02, new C206819Dm(this, 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x0260, code lost:
    
        if (r3 == X.EnumC40111tc.A0B) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0701  */
    @Override // X.InterfaceC31091eE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void AJE(X.InterfaceC37261GbE r53, X.C1OW r54, X.C47Z r55) {
        /*
            Method dump skipped, instructions count: 1854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31211eQ.AJE(X.GbE, X.1OW, X.47Z):void");
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        C31191eO c31191eO = (C31191eO) c1ow;
        C14360o3.A0B(c31191eO, 0);
        C14360o3.A0B(mnp, 1);
        if (c31191eO.A04.A06 == null) {
            C0w9.A03("dmm_apply_updates", "Invalid mutation has neither pending media nor publisher information");
            return false;
        }
        return LCX.A01(mnp, c31191eO, this.A01);
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C83693oE c83693oE;
        int i;
        C31191eO c31191eO = (C31191eO) c1ow;
        C14360o3.A0B(c31191eO, 0);
        C14360o3.A0B(c19260xA, 1);
        C14360o3.A0B(interfaceC37261GbE, 2);
        String str = c31191eO.A04.A06;
        boolean z = false;
        if (str != null) {
            z = true;
        }
        C18C.A0J(z, "ConfigureMedia mutation lacks primary key for underlying infra", new Object[0]);
        if (str != null) {
            PendingMediaStore pendingMediaStore = (PendingMediaStore) this.A04.getValue();
            C47Z A03 = pendingMediaStore.A03(str);
            DirectThreadKey directThreadKey = (DirectThreadKey) c31191eO.C7R().get(0);
            String str2 = directThreadKey.A00;
            if (str2 != null) {
                c83693oE = new C83693oE(str2);
            } else {
                c83693oE = null;
            }
            C81663kb A032 = C2DU.A03((C2DU) this.A01, directThreadKey);
            if (A032 != null) {
                i = A032.C7g();
            } else {
                i = 0;
            }
            UserSession userSession = this.A00;
            C47971LIf c47971LIf = new C47971LIf(userSession);
            if (c83693oE != null && A03 != null) {
                String str3 = ((C1OW) c31191eO).A05;
                String str4 = directThreadKey.A01;
                if (str4 == null) {
                    str4 = "";
                }
                if (c47971LIf.A02(A03, str3, str4, i)) {
                    C11T.A07(false, new M79(c19260xA, userSession, interfaceC37261GbE, c31191eO, directThreadKey, pendingMediaStore, str));
                    MEC mec = new MEC(pendingMediaStore, c31191eO, this, interfaceC37261GbE, str, 4);
                    EnumC40111tc enumC40111tc = A03.A1G;
                    if (enumC40111tc == EnumC40111tc.A09) {
                        int size = A03.A0K().size();
                        for (C47Z c47z : A03.A0K()) {
                            C49352Lrk c49352Lrk = new C49352Lrk(interfaceC37261GbE, c47971LIf, c47z.A35, ((C1OW) c31191eO).A05, mec, size);
                            if (c47z.A1G == EnumC40111tc.A0Q) {
                                C47971LIf.A01(c31191eO, c47971LIf, c49352Lrk, c83693oE, c47z, c47z.A33);
                            } else {
                                c49352Lrk.DLt();
                            }
                        }
                        return;
                    }
                    if (enumC40111tc == EnumC40111tc.A0Q) {
                        C47971LIf.A01(c31191eO, c47971LIf, new C49351Lrj(interfaceC37261GbE, c47971LIf, A03.A35, ((C1OW) c31191eO).A05, mec), c83693oE, A03, null);
                        return;
                    }
                    return;
                }
            }
            PendingMediaStoreSerializer pendingMediaStoreSerializer = (PendingMediaStoreSerializer) this.A05.getValue();
            String str5 = c31191eO.A04.A06;
            if (str5 != null) {
                LHD.A00(c19260xA, userSession, interfaceC37261GbE, c31191eO, this, (DirectThreadKey) c31191eO.C7R().get(0), pendingMediaStore, pendingMediaStoreSerializer, str5);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
