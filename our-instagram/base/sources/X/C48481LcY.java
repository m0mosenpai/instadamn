package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;

/* renamed from: X.LcY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C48481LcY implements InterfaceC1345866i {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ C1345666g A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ Integer A07;
    public final /* synthetic */ Integer A08;
    public final /* synthetic */ Integer A09;
    public final /* synthetic */ Integer A0A;
    public final /* synthetic */ Long A0B;
    public final /* synthetic */ Long A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ String A0F;
    public final /* synthetic */ String A0G;
    public final /* synthetic */ String A0H;
    public final /* synthetic */ String A0I;
    public final /* synthetic */ boolean A0J;

    public /* synthetic */ C48481LcY(C1345666g c1345666g, UserSession userSession, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, long j, long j2, boolean z) {
        this.A04 = c1345666g;
        this.A02 = j;
        this.A01 = i;
        this.A0H = str;
        this.A07 = num;
        this.A08 = num2;
        this.A09 = num3;
        this.A0A = num4;
        this.A0I = str2;
        this.A03 = j2;
        this.A00 = i2;
        this.A0D = str3;
        this.A0E = str4;
        this.A0J = z;
        this.A06 = num5;
        this.A0B = l;
        this.A05 = userSession;
        this.A0C = l2;
        this.A0F = str5;
        this.A0G = str6;
    }

    @Override // X.InterfaceC1345866i
    public final void EpD(C1346766r c1346766r) {
        C1345666g c1345666g = this.A04;
        long j = this.A02;
        int i = this.A01;
        String str = this.A0H;
        Integer num = this.A07;
        Integer num2 = this.A08;
        Integer num3 = this.A09;
        Integer num4 = this.A0A;
        String str2 = this.A0I;
        long j2 = this.A03;
        int i2 = this.A00;
        String str3 = this.A0D;
        String str4 = this.A0E;
        boolean z = this.A0J;
        Integer num5 = this.A06;
        Long l = this.A0B;
        UserSession userSession = this.A05;
        Long l2 = this.A0C;
        String str5 = this.A0F;
        String str6 = this.A0G;
        Integer valueOf = Integer.valueOf(i);
        List singletonList = Collections.singletonList(valueOf);
        List singletonList2 = Collections.singletonList(str);
        List singletonList3 = Collections.singletonList(Integer.valueOf(AbstractC167017dG.A0K(num)));
        List singletonList4 = Collections.singletonList(Integer.valueOf(AbstractC167017dG.A0K(num2)));
        List singletonList5 = Collections.singletonList("image/jpeg");
        List singletonList6 = Collections.singletonList(Integer.valueOf(AbstractC167017dG.A0K(num3)));
        List singletonList7 = Collections.singletonList(Integer.valueOf(AbstractC167017dG.A0K(num4)));
        List singletonList8 = Collections.singletonList(AbstractC166987dD.A11(str2).getName());
        List singletonList9 = Collections.singletonList(Long.valueOf(j2));
        List singletonList10 = Collections.singletonList(Integer.valueOf(i2));
        List singletonList11 = Collections.singletonList(AbstractC25227BEk.A0p());
        if (str3 == null) {
            str3 = "";
        }
        List singletonList12 = Collections.singletonList(str3);
        List singletonList13 = Collections.singletonList(str4);
        c1345666g.A00(JRS.A00(c1346766r, 70), num5, l2, null, AbstractC46872KoF.A00(userSession, valueOf, num5, null, null, l, null, z), str5, str6, singletonList, singletonList2, singletonList3, singletonList4, singletonList5, singletonList6, singletonList7, singletonList8, singletonList9, singletonList10, singletonList11, singletonList12, singletonList13, j, z);
    }
}
