package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.1JO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1JO implements C1JP {
    public final AbstractC12990ll A00;
    public final C1FA A01;
    public final C1JR A02;
    public final String A03;
    public final boolean A04;

    public C1JO(AbstractC12990ll abstractC12990ll) {
        UserSession userSession;
        String str;
        C14360o3.A0B(abstractC12990ll, 1);
        C1FA A00 = C1F8.A00(abstractC12990ll);
        C1JR A002 = C1JQ.A00(abstractC12990ll);
        C14360o3.A0B(A00, 2);
        C14360o3.A0B(A002, 3);
        this.A01 = A00;
        this.A02 = A002;
        this.A00 = abstractC12990ll;
        boolean z = abstractC12990ll instanceof UserSession;
        this.A04 = z;
        this.A03 = (!z || (userSession = (UserSession) abstractC12990ll) == null || (str = userSession.userId) == null) ? "0" : str;
    }

    @Override // X.C1JP
    public final void FA4(java.net.URI uri, Map map) {
        C14360o3.A0B(map, 1);
        if (C1QC.A01(uri)) {
            String A00 = C3JP.A00("IG-Set-Authorization", map);
            if (A00 != null) {
                this.A01.A04(A00);
            }
            String A002 = C3JP.A00("IG-Set-X-MID", map);
            if (A002 != null) {
                this.A01.A03(A002);
            }
            String A003 = C3JP.A00("IG-SET-IG-U-IG-DIRECT-REGION-HINT", map);
            if (A003 != null) {
                this.A02.A06(A003);
            }
            String A004 = C3JP.A00("IG-SET-IG-U-SHBID", map);
            if (A004 != null) {
                this.A02.A08(A004);
            }
            String A005 = C3JP.A00("IG-SET-IG-U-SHBTS", map);
            if (A005 != null) {
                this.A02.A09(A005);
            }
            String A006 = C3JP.A00("IG-SET-IG-U-DS-USER-ID", map);
            if (A006 != null) {
                this.A02.A07(A006);
            }
            String A007 = C3JP.A00("IG-SET-IG-U-RUR", map);
            if (A007 != null) {
                C1JR c1jr = this.A02;
                if (!A007.equals(c1jr.A02())) {
                    c1jr.A00 = A007;
                }
            }
        }
    }

    public static final void A00(String str, String str2, List list) {
        if (str2 != null && str2.length() != 0) {
            list.add(new C23781El(str, str2));
        }
    }

    @Override // X.C1JP
    public final void ACw(java.net.URI uri, List list) {
        if (C1QC.A01(uri)) {
            if (this.A04) {
                A00("Authorization", this.A01.A04, list);
            }
            A00("X-MID", this.A01.A01.A00, list);
            C1JR c1jr = this.A02;
            A00("IG-U-IG-DIRECT-REGION-HINT", c1jr.A00(), list);
            A00("IG-U-SHBID", c1jr.A03(), list);
            A00("IG-U-SHBTS", c1jr.A04(), list);
            A00("IG-U-DS-USER-ID", c1jr.A01(), list);
            A00("IG-U-RUR", c1jr.A02(), list);
            list.add(new C23781El("IG-INTENDED-USER-ID", this.A03));
        }
    }
}
