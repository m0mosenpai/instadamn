package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.Map;

/* renamed from: X.MIh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50278MIh extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ C26086BgF A00;
    public final /* synthetic */ C7IT A01;
    public final /* synthetic */ AnonymousClass442 A02;
    public final /* synthetic */ ClipInfo A03;
    public final /* synthetic */ C47Z A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50278MIh(C26086BgF c26086BgF, C7IT c7it, AnonymousClass442 anonymousClass442, ClipInfo clipInfo, C47Z c47z, String str, String str2, String str3, String str4) {
        super(1);
        this.A07 = str;
        this.A01 = c7it;
        this.A03 = clipInfo;
        this.A06 = str2;
        this.A04 = c47z;
        this.A02 = anonymousClass442;
        this.A08 = str3;
        this.A00 = c26086BgF;
        this.A05 = str4;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Map A07;
        C3o9 c3o9 = (C3o9) obj;
        C14360o3.A0B(c3o9, 0);
        String str = this.A07;
        if (str != null) {
            C7IT c7it = this.A01;
            ClipInfo clipInfo = this.A03;
            String str2 = this.A06;
            if (C7IT.A01(c7it, c3o9)) {
                UserSession userSession = c7it.A00;
                if (C18U.A06(C06090Tz.A05, userSession, 36315125308984353L)) {
                    Ld6 A00 = AbstractC46920Kp1.A00(userSession);
                    MsysThreadId A03 = JRE.A03(c3o9);
                    AbstractC167007dF.A1D(A03, 0, clipInfo);
                    android.net.Uri A0I = AbstractC167007dF.A0I(clipInfo.A0F);
                    UserSession userSession2 = A00.A00;
                    String str3 = userSession2.userId;
                    long A0t = AbstractC25232BEp.A0t(AbstractC166997dE.A0Y(userSession2).BTC());
                    String username = AbstractC166997dE.A0Y(userSession2).getUsername();
                    String A0w = AbstractC43592JPx.A0w(AbstractC166997dE.A0Y(userSession2).A0C());
                    long currentTimeMillis = System.currentTimeMillis();
                    Integer valueOf = Integer.valueOf(clipInfo.A09);
                    Integer valueOf2 = Integer.valueOf(clipInfo.A06);
                    L53 l53 = new L53(new C47667L3a(new L3Z(valueOf, valueOf2, str2, A0I.toString(), 4), valueOf, valueOf2, null, 4), str, null, str3, username, A0w, null, A0t, currentTimeMillis);
                    AbstractC137166Iv.A00(userSession2).A00.put(str, str2);
                    long j = A03.A00;
                    Map map = A00.A02;
                    Long valueOf3 = Long.valueOf(j);
                    if (map.containsKey(valueOf3)) {
                        A07 = (Map) map.get(valueOf3);
                        if (A07 != null) {
                            A07.put(str, l53);
                        }
                        c7it.A02.Avk().E40();
                    } else {
                        A07 = AbstractC06930Yk.A07(AbstractC25230BEn.A1b(str, l53));
                    }
                    map.put(valueOf3, A07);
                    c7it.A02.Avk().E40();
                }
            }
        }
        C7IT c7it2 = this.A01;
        C7IR c7ir = c7it2.A05;
        ClipInfo clipInfo2 = this.A03;
        String str4 = this.A06;
        C47Z c47z = this.A04;
        boolean A1b = AbstractC25231BEo.A1b(c7it2.A07);
        c7ir.A03(this.A00, this.A02, clipInfo2, c47z, str4, str, this.A08, this.A05, A1b);
        return C0eB.A00;
    }
}
