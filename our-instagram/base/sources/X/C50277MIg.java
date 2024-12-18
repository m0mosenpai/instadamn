package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.Map;

/* renamed from: X.MIg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50277MIg extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ C26086BgF A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C7IT A02;
    public final /* synthetic */ AnonymousClass442 A03;
    public final /* synthetic */ C47Z A04;
    public final /* synthetic */ C183978Ee A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50277MIg(C26086BgF c26086BgF, UserSession userSession, C7IT c7it, AnonymousClass442 anonymousClass442, C47Z c47z, C183978Ee c183978Ee, String str, String str2, String str3) {
        super(1);
        this.A07 = str;
        this.A02 = c7it;
        this.A01 = userSession;
        this.A05 = c183978Ee;
        this.A03 = anonymousClass442;
        this.A08 = str2;
        this.A04 = c47z;
        this.A00 = c26086BgF;
        this.A06 = str3;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Map A07;
        C3o9 c3o9 = (C3o9) obj;
        C14360o3.A0B(c3o9, 0);
        String str = this.A07;
        if (str != null) {
            C7IT c7it = this.A02;
            UserSession userSession = this.A01;
            C183978Ee c183978Ee = this.A05;
            if (C7IT.A01(c7it, c3o9) && C18U.A06(C06090Tz.A05, userSession, 36315125308918816L)) {
                Ld6 A00 = AbstractC46920Kp1.A00(userSession);
                MsysThreadId A03 = JRE.A03(c3o9);
                C14360o3.A0B(A03, 0);
                android.net.Uri fromFile = android.net.Uri.fromFile(c183978Ee.A03());
                UserSession userSession2 = A00.A00;
                String str2 = userSession2.userId;
                long A0t = AbstractC25232BEp.A0t(AbstractC166997dE.A0Y(userSession2).BTC());
                L53 l53 = new L53(new C47667L3a(new L3Z(Integer.valueOf(c183978Ee.A09), Integer.valueOf(c183978Ee.A06), fromFile.toString(), fromFile.toString(), 2), Integer.valueOf(c183978Ee.A09), Integer.valueOf(c183978Ee.A06), null, 2), str, null, str2, AbstractC166997dE.A0Y(userSession2).getUsername(), AbstractC43592JPx.A0w(AbstractC166997dE.A0Y(userSession2).A0C()), null, A0t, System.currentTimeMillis());
                C137096In A002 = AbstractC137166Iv.A00(userSession2);
                A002.A00.put(str, AbstractC166987dD.A19(fromFile));
                long j = A03.A00;
                Map map = A00.A02;
                Long valueOf = Long.valueOf(j);
                if (map.containsKey(valueOf)) {
                    A07 = (Map) map.get(valueOf);
                    if (A07 != null) {
                        A07.put(str, l53);
                    }
                    c7it.A02.Avk().E40();
                } else {
                    A07 = AbstractC06930Yk.A07(AbstractC25230BEn.A1b(str, l53));
                }
                map.put(valueOf, A07);
                c7it.A02.Avk().E40();
            }
        }
        C7IR c7ir = this.A02.A05;
        C183978Ee c183978Ee2 = this.A05;
        AnonymousClass442 anonymousClass442 = this.A03;
        String str3 = this.A08;
        c7ir.A04(this.A00, anonymousClass442, this.A04, c183978Ee2, str, str3, this.A06);
        return C0eB.A00;
    }
}
