package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.concurrent.Callable;

/* loaded from: classes8.dex */
public final class M88 implements Callable {
    public final /* synthetic */ C83403nh A00;
    public final /* synthetic */ C7TG A01;
    public final /* synthetic */ KWh A02;
    public final /* synthetic */ C3o9 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public M88(C83403nh c83403nh, C7TG c7tg, KWh kWh, C3o9 c3o9, String str, String str2, boolean z) {
        this.A03 = c3o9;
        this.A00 = c83403nh;
        this.A01 = c7tg;
        this.A02 = kWh;
        this.A06 = z;
        this.A04 = str;
        this.A05 = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.1ez, X.1OW] */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        String str;
        DirectThreadKey A01 = JRE.A01(this.A03);
        C83403nh c83403nh = this.A00;
        boolean z = c83403nh.A2P;
        String A0g = c83403nh.A0g();
        C7TG c7tg = this.A01;
        UserSession userSession = c7tg.A03;
        String str2 = ((AbstractC46511KiA) this.A02).A00;
        L1W A0M = c83403nh.A0M();
        boolean z2 = this.A06;
        String str3 = A0g;
        if (z2) {
            str3 = null;
        }
        JTa A04 = AbstractC31277Doz.A04(userSession, A0M, C31561ez.class, str2, str3, z);
        String str4 = this.A04;
        EnumC159397Cz A00 = AbstractC1586079v.A00(c83403nh);
        ?? c1ow = new C1OW(A04);
        c1ow.A04 = false;
        c1ow.A01 = A01;
        c1ow.A03 = str4;
        c1ow.A02 = A0g;
        c1ow.A06 = z;
        c1ow.A00 = A00;
        String str5 = c1ow.A05;
        if (z2 && (str = this.A05) != null) {
            C7TG.A0A(c7tg, str, str5, A01.A00, 13, z, true);
        }
        LIG lig = AbstractC47197KtW.A01;
        LIG.A00(userSession, str5.hashCode(), z2, false);
        lig.A02(userSession, c1ow, null);
        AbstractC31173DnH.A1U(userSession, c1ow);
        return AbstractC166997dE.A0b();
    }
}
