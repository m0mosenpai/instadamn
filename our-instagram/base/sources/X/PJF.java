package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.streaming.common.BroadcastType;

/* loaded from: classes9.dex */
public final class PJF implements InterfaceC58192Pqy {
    public static AbstractC53633Nne A0K;
    public static AbstractC70118W4q A0L;
    public static AbstractC70118W4q A0M;
    public long A00;
    public YQR A01;
    public O6B A02;
    public AnonymousClass195 A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final InterfaceC174767qC A07;
    public final C56139Ovz A08;
    public final OL3 A09;
    public final C55085Oah A0A;
    public final BroadcastType A0B;
    public final InterfaceC58089PpE A0C;
    public final O9F A0D;
    public final String A0E;
    public final C19L A0F;
    public final boolean A0G;
    public final C12N A0H;
    public final UserSession A0I;
    public final C43647JSf A0J;

    public PJF(Context context, InterfaceC174767qC interfaceC174767qC, UserSession userSession, OL3 ol3, C55085Oah c55085Oah, InterfaceC58089PpE interfaceC58089PpE, O9F o9f, String str, boolean z) {
        AbstractC167007dF.A1H(str, 3, c55085Oah);
        C14360o3.A0B(interfaceC58089PpE, 9);
        this.A0I = userSession;
        this.A0E = str;
        this.A0D = o9f;
        this.A07 = interfaceC174767qC;
        this.A09 = ol3;
        this.A0A = c55085Oah;
        this.A0G = z;
        this.A0C = interfaceC58089PpE;
        this.A08 = MWJ.A00(context, userSession);
        this.A0J = new C43647JSf(new C56788PIf(this), 100);
        C12L c12l = C12L.A00;
        this.A0H = c12l;
        this.A0F = AbstractC25236BEt.A0e(c12l.A04);
        this.A02 = new O6B(this);
        this.A0B = BroadcastType.A03;
    }

    @Override // X.InterfaceC58192Pqy
    public final boolean CTr() {
        return false;
    }

    @Override // X.InterfaceC58192Pqy
    public final void CsN(YQR yqr) {
    }

    @Override // X.InterfaceC58192Pqy
    public final BroadcastType AiO() {
        return this.A0B;
    }

    @Override // X.InterfaceC58192Pqy
    public final long C9p() {
        return this.A00;
    }

    @Override // X.InterfaceC58192Pqy
    public final void CNo(AbstractC53633Nne abstractC53633Nne) {
        C57530Pg4 A00 = C57530Pg4.A00(abstractC53633Nne, this, 46);
        this.A03 = AbstractC25226BEj.A1L(new C57157PZb(A00, this, (InterfaceC23621Ds) null, 14), this.A0F);
    }

    @Override // X.InterfaceC58192Pqy
    public final void EE8(AbstractC70118W4q abstractC70118W4q, boolean z) {
        this.A08.A01(1, true);
        AbstractC70118W4q.A02(abstractC70118W4q, new O68(null));
        if (this.A05) {
            this.A0A.A01(C05F.A0C);
        }
        AnonymousClass194.A05(null, this.A0F);
    }

    @Override // X.InterfaceC58192Pqy
    public final void EQ2(boolean z) {
        this.A06 = z;
        this.A08.A0A.A7P(new C56621PBr(!z));
    }

    @Override // X.InterfaceC58192Pqy
    public final void EnI(AbstractC70118W4q abstractC70118W4q) {
        YQR yqr;
        this.A0J.A01();
        A0L = abstractC70118W4q;
        boolean z = this.A06;
        PBK pbk = this.A08.A0A;
        pbk.A7P(new C56621PBr(!z));
        pbk.A7P(new PBX(true));
        if (!this.A0G && !this.A04 && (yqr = this.A01) != null) {
            AbstractC70118W4q abstractC70118W4q2 = A0L;
            if (abstractC70118W4q2 != null) {
                abstractC70118W4q2.A04(AbstractC166987dD.A1J(yqr));
            }
            this.A04 = true;
        }
    }

    @Override // X.InterfaceC58192Pqy
    public final void EoX(AbstractC53633Nne abstractC53633Nne, boolean z) {
        this.A0J.A00();
        A0L = null;
        PBK pbk = this.A08.A0A;
        pbk.A7P(new C56621PBr(false));
        pbk.A7P(new PBX(false));
        if (abstractC53633Nne != null) {
            abstractC53633Nne.A00();
        }
    }
}
