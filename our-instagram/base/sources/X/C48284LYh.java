package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.LYh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48284LYh implements InterfaceC12870lZ, InterfaceC13000lm {
    public final InterfaceC40711ue A00;
    public final C3Ri A01;
    public final C94D A02;
    public final C94E A03;
    public final UserSession A04;
    public final InterfaceC14020nS A05;
    public final Map A06;
    public final C19L A07;

    public static final C47926LEv A00(L7O l7o, C48284LYh c48284LYh) {
        Map map = c48284LYh.A06;
        String str = l7o.A01;
        String str2 = l7o.A02;
        String str3 = l7o.A00;
        C47926LEv c47926LEv = (C47926LEv) map.get(AnonymousClass001.A0j(str, str2, str3, ',', ','));
        if (c47926LEv == null) {
            String str4 = c48284LYh.A04.userId;
            C47926LEv c47926LEv2 = new C47926LEv(c48284LYh.A01, c48284LYh.A03, l7o, str4, c48284LYh.A07);
            map.put(AnonymousClass001.A0j(str, str2, str3, ',', ','), c47926LEv2);
            return c47926LEv2;
        }
        return c47926LEv;
    }

    public /* synthetic */ C48284LYh(UserSession userSession) {
        C0o0 A00 = AbstractC14350nz.A00();
        A00.A01 = "IgSignalsOdinServerFeaturesManager";
        C18240vB c18240vB = new C18240vB(A00);
        C19K A02 = AnonymousClass194.A02(new C12M(c18240vB).AOT(1466390445, 3));
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(A02, 3);
        this.A04 = userSession;
        this.A05 = c18240vB;
        this.A07 = A02;
        C218914p.A05(this);
        this.A06 = AbstractC166987dD.A1I();
        C1M7 A01 = C1M7.A01();
        C14360o3.A07(A01);
        this.A01 = new C3Ri(new C73563Rh(A01).A00());
        C40701ud A012 = AbstractC40691uc.A01(userSession);
        this.A00 = A012;
        C94D c94d = new C94D(A012);
        this.A02 = c94d;
        this.A03 = new C94E(c94d);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(-1984031363);
        AbstractC166987dD.A1Z(new MC2(this, null, 48), this.A07);
        C0f9.A0A(1766928929, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(-881135548, C0f9.A03(-1737129527));
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C218914p.A06(this);
    }
}
