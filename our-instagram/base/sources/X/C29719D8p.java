package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.D8p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29719D8p extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C166007bS A00;
    public final /* synthetic */ C28355CfF A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ java.util.Set A05;
    public final /* synthetic */ C05A A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29719D8p(C166007bS c166007bS, C28355CfF c28355CfF, String str, List list, List list2, java.util.Set set, C05A c05a) {
        super(0);
        this.A00 = c166007bS;
        this.A02 = str;
        this.A03 = list;
        this.A01 = c28355CfF;
        this.A05 = set;
        this.A04 = list2;
        this.A06 = c05a;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C166007bS c166007bS = this.A00;
        String str = this.A02;
        List list = this.A03;
        C14360o3.A0B(list, 1);
        C28238Cci c28238Cci = C28238Cci.A00;
        UserSession userSession = c166007bS.A02;
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        c006802i.markerPoint(309476254, AbstractC111324zv.A00(1986));
        c28238Cci.A01(userSession);
        C166007bS.A02(c166007bS, "block_accounts_action", str, list);
        C28261Yl c28261Yl = C28261Yl.A00;
        C28355CfF c28355CfF = this.A01;
        UserSession userSession2 = c28355CfF.A04;
        java.util.Set set = this.A05;
        c28261Yl.A02(userSession2, AbstractC001800i.A0a(set), C28355CfF.A00(this.A04));
        c28355CfF.A01.A0D();
        this.A06.Egh(new C9BK(new C9B1(set.size(), 0)));
        return C0eB.A00;
    }
}
