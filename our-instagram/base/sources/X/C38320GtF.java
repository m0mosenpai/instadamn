package X;

import com.instagram.common.session.UserSession;
import com.instagram.interactive.prompt.pivot.repository.PromptPivotPageRepository;

/* renamed from: X.GtF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38320GtF extends AbstractC52922bZ {
    public final PromptPivotPageRepository A03;
    public final C62832tM A04;
    public final String A05;
    public final InterfaceC24731Iq A06;
    public final InterfaceC19390xP A07;
    public final C0UO A08;
    public final C0UO A09;
    public final C0UO A0A;
    public final C0UO A0B;
    public final UserSession A0C;
    public final C69749Vuj A01 = AbstractC37301Gc2.A0C(2131971042);
    public final C69749Vuj A02 = AbstractC37301Gc2.A0C(2131971043);
    public final C69749Vuj A00 = AbstractC37301Gc2.A0C(2131971040);

    public C38320GtF(UserSession userSession, PromptPivotPageRepository promptPivotPageRepository, C62832tM c62832tM, String str) {
        this.A0C = userSession;
        this.A04 = c62832tM;
        this.A05 = str;
        this.A03 = promptPivotPageRepository;
        C24721Ip c24721Ip = new C24721Ip(Integer.MAX_VALUE);
        this.A06 = c24721Ip;
        this.A07 = AbstractC07080Za.A03(c24721Ip);
        J6L j6l = new J6L(promptPivotPageRepository.A0C, 0);
        C141796aw A00 = AbstractC141776au.A00(this);
        C10H c10h = C10I.A01;
        this.A0B = AbstractC208910l.A01(null, A00, j6l, c10h);
        this.A08 = promptPivotPageRepository.A09;
        this.A09 = promptPivotPageRepository.A0D;
        this.A0A = AbstractC208910l.A01(null, AbstractC141776au.A00(this), C10Q.A00(new C57183PaJ(this, null, 1), C0JE.A00(new PZP(promptPivotPageRepository, AbstractC166987dD.A1E(), null, 13)), promptPivotPageRepository.A0B, promptPivotPageRepository.A0A), c10h);
    }
}
