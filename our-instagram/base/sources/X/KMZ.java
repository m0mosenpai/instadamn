package X;

import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes8.dex */
public final class KMZ extends AbstractRunnableC14200nk {
    public final /* synthetic */ C131845xK A00;
    public final /* synthetic */ InterfaceC103384lE A01;
    public final /* synthetic */ InterfaceC103384lE A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ C47984LJj A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;

    @Override // java.lang.Runnable
    public final void run() {
        C47984LJj c47984LJj = this.A04;
        String str = this.A05;
        User user = this.A03;
        List list = this.A07;
        String str2 = this.A06;
        C30177DRh c30177DRh = new C30177DRh(24, this.A02, this.A00, c47984LJj, this.A01);
        LCH.A01(new MIP(list, c30177DRh, user, str2, str, 4), c47984LJj.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMZ(C131845xK c131845xK, InterfaceC103384lE interfaceC103384lE, InterfaceC103384lE interfaceC103384lE2, User user, C47984LJj c47984LJj, String str, String str2, List list) {
        super(1651335304, 3, false, false);
        this.A04 = c47984LJj;
        this.A05 = str;
        this.A03 = user;
        this.A07 = list;
        this.A06 = str2;
        this.A00 = c131845xK;
        this.A02 = interfaceC103384lE;
        this.A01 = interfaceC103384lE2;
    }
}
