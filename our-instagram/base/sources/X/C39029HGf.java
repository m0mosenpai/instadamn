package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.HGf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39029HGf extends C1P1 {
    public long A00;
    public final /* synthetic */ InterfaceC1116050z A01;
    public final /* synthetic */ InterfaceC17600tv A02;
    public final /* synthetic */ C62272sS A03;
    public final /* synthetic */ C1EU A04;
    public final /* synthetic */ C111344zx A05;
    public final /* synthetic */ boolean A06;

    public C39029HGf(InterfaceC1116050z interfaceC1116050z, InterfaceC17600tv interfaceC17600tv, C62272sS c62272sS, C1EU c1eu, C111344zx c111344zx, boolean z) {
        this.A05 = c111344zx;
        this.A03 = c62272sS;
        this.A06 = z;
        this.A02 = interfaceC17600tv;
        this.A04 = c1eu;
        this.A01 = interfaceC1116050z;
        this.A00 = AbstractC31175DnJ.A03(AbstractC166987dD.A0x(c111344zx.A04), AbstractC111324zv.A00(2653));
    }

    private final void A00(boolean z) {
        C77383dO c77383dO = C77383dO.A00;
        C111344zx c111344zx = this.A05;
        c77383dO.A00(c111344zx.A03, c111344zx.A04, C05F.A00, ((C1I1) this.A03).A00.A09, this.A00, z);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int i;
        int A03 = C0f9.A03(-1417902034);
        C14360o3.A0B(abstractC115105If, 0);
        this.A01.AVi(AbstractC111324zv.A00(2374));
        C40791um c40791um = (C40791um) abstractC115105If.A00();
        if (c40791um != null) {
            i = c40791um.mStatusCode;
        } else {
            i = -1;
        }
        C61852rm.A00(this.A05.A04).A04(abstractC115105If, this.A03, i);
        A00(false);
        C0f9.A0A(-595160048, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-175300603);
        C111344zx c111344zx = this.A05;
        UserSession userSession = c111344zx.A04;
        C61852rm.A00(userSession).A09(this.A04);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36328431117942294L) || C18U.A06(c06090Tz, userSession, 36328431117876757L)) {
            Nv4.A00(AbstractC166987dD.A0O(c111344zx.A03), userSession).A03();
        }
        C0f9.A0A(-2117549716, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(1039059691);
        UserSession userSession = this.A05.A04;
        C61852rm.A00(userSession).A08(this.A03, "background_prefetcher", this.A06);
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC19610xo A0w = AbstractC166987dD.A0w(A00);
        A0w.E7G(AbstractC111324zv.A00(2653), currentTimeMillis);
        A0w.apply();
        C0f9.A0A(-489383750, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        Map map;
        int A03 = C0f9.A03(307975164);
        C74283Vj c74283Vj = (C74283Vj) obj;
        int A0N = AbstractC167017dG.A0N(c74283Vj, -196023736);
        ArrayList A1F = AbstractC166987dD.A1F(c74283Vj.A00());
        ArrayList A1E = AbstractC166987dD.A1E();
        A1E.addAll(A1F);
        C111344zx c111344zx = this.A05;
        C111344zx.A03(this.A01, c111344zx, AbstractC001800i.A0a(AbstractC001800i.A0j(A1E)));
        UserSession userSession = c111344zx.A04;
        C61862rn A00 = C61852rm.A00(userSession);
        C1EU c1eu = this.A04;
        A00.A0A(c1eu, c74283Vj, EnumC73363Qm.A05);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36323775372930662L)) {
            C23031Ai A002 = AbstractC23021Ah.A00(userSession);
            String name = ((C1I1) this.A03).A00.A04.name();
            InterfaceC19610xo A0w = AbstractC166987dD.A0w(A002);
            A0w.E7K("last_feed_head_load_fetch_reason", name);
            A0w.apply();
        }
        A00(true);
        this.A02.Dg5(c1eu.A03, A1F, true);
        c111344zx.A01 = A1F;
        C111344zx.A07(c111344zx);
        if (C18U.A06(c06090Tz, userSession, 36328602916175519L) && (map = c74283Vj.A0M) != null) {
            I21.A00(userSession).A01(map);
        }
        if (c74283Vj.A0B != null) {
            AbstractC166987dD.A0x(userSession).getBoolean("is_ifr_eligible", true);
        }
        C0f9.A0A(2024399337, A0N);
        C0f9.A0A(-331525203, A03);
    }
}
