package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Bpk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26649Bpk extends AbstractC77583di {
    public static final C51532Yb A0G = AbstractC25232BEp.A1B(C29024CrD.A00);
    public final int A00;
    public final long A01;
    public final long A02;
    public final C51750MtZ A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final InterfaceC31055Dkv A06;
    public final CR1 A07;
    public final String A08;
    public final HashMap A09;
    public final HashMap A0A;
    public final List A0B;
    public final List A0C;
    public final InterfaceC16660sJ A0D;
    public final boolean A0E;
    public final C51722Yv A0F;

    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        C14360o3.A0B(c77993eR, 0);
        return AbstractC25225BEi.A0g(this.A0F, C29064Crr.A00, AbstractC25229BEm.A0c(c77993eR, A0G, DGN.A00, DRY.A00(this, c77993eR, 40)));
    }

    public C26649Bpk(C51750MtZ c51750MtZ, C51722Yv c51722Yv, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC31055Dkv interfaceC31055Dkv, CR1 cr1, String str, HashMap hashMap, HashMap hashMap2, List list, List list2, InterfaceC16660sJ interfaceC16660sJ, int i, long j, long j2, boolean z) {
        AbstractC167017dG.A1P(userSession, interfaceC11380iw);
        AbstractC25234BEr.A0k(4, c51750MtZ, interfaceC31055Dkv, hashMap, hashMap2);
        AbstractC25229BEm.A1J(list, 8, cr1);
        C14360o3.A0B(str, 16);
        this.A05 = userSession;
        this.A04 = interfaceC11380iw;
        this.A0E = z;
        this.A03 = c51750MtZ;
        this.A06 = interfaceC31055Dkv;
        this.A09 = hashMap;
        this.A0A = hashMap2;
        this.A0B = list;
        this.A0C = list2;
        this.A07 = cr1;
        this.A02 = j;
        this.A01 = j2;
        this.A0D = interfaceC16660sJ;
        this.A00 = i;
        this.A0F = c51722Yv;
        this.A08 = str;
    }
}
