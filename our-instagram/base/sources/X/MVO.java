package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.igsignals.core.IgSignalsFeature;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class MVO {
    public int A00;
    public int A01;
    public int A02;
    public C07T A03;
    public C38321qM A04;
    public NMN A05;
    public NMJ A06;
    public String A07;
    public String A08;
    public List A09;
    public List A0A;
    public List A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final UserSession A0G;
    public final MVP A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;
    public final InterfaceC09390do A0K;
    public final InterfaceC09390do A0L;
    public final InterfaceC09390do A0M;
    public final C19L A0N;
    public final InterfaceC14020nS A0O;

    public MVO(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A0G = userSession;
        C0o0 A00 = AbstractC14350nz.A00();
        A00.A01 = "IgSignalsClipsOpenComments";
        C18240vB c18240vB = new C18240vB(A00);
        this.A0O = c18240vB;
        C19K A02 = AnonymousClass194.A02(new C12M(c18240vB).AOT(1853356536, 3));
        this.A0N = A02;
        this.A0H = new MVP(userSession);
        this.A0I = AbstractC09440dt.A01(new C57241PbP(this, 32));
        this.A0M = AbstractC09440dt.A01(new C57241PbP(this, 36));
        this.A0J = AbstractC09440dt.A01(new C57241PbP(this, 33));
        this.A0L = AbstractC09440dt.A01(new C57241PbP(this, 35));
        this.A0K = AbstractC09440dt.A01(new C57241PbP(this, 34));
        this.A0A = new ArrayList();
        this.A0B = new ArrayList();
        this.A09 = new ArrayList();
        PZS pzs = new PZS(this, null, 0);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, pzs, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [X.52C, X.NMH] */
    public static final void A00(MVO mvo) {
        MVQ.A01(mvo.A0A, true);
        MVQ.A01(mvo.A0B, mvo.A0D);
        MVQ.A01(mvo.A09, mvo.A0C);
        C23031Ai A00 = AbstractC23021Ah.A00(mvo.A0G);
        String A0P = AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", mvo.A0A, null);
        InterfaceC16530ry interfaceC16530ry = A00.A83;
        C0YR[] c0yrArr = C23031Ai.A8c;
        AbstractC31171DnF.A1S(A00, A0P, interfaceC16530ry, c0yrArr, 41);
        AbstractC31171DnF.A1S(A00, AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", mvo.A0B, null), A00.A82, c0yrArr, 42);
        AbstractC31171DnF.A1S(A00, AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", mvo.A09, null), A00.A81, c0yrArr, 45);
        if (!mvo.A0D) {
            NMJ nmj = mvo.A06;
            if (nmj != 0) {
                long currentTimeMillis = System.currentTimeMillis();
                NMH nmh = nmj.A01;
                NMH nmh2 = nmh;
                if (nmh == null) {
                    String str = ((AbstractC55167OdV) nmj).A02;
                    double d = ((AbstractC55167OdV) nmj).A01;
                    ArrayList A03 = AbstractC55167OdV.A03(nmj);
                    C14360o3.A0B(A03, 3);
                    ?? c52c = new C52C(str, A03, d, currentTimeMillis);
                    nmj.A05(c52c);
                    nmj.A00 = c52c;
                    nmj.A01 = c52c;
                    nmh2 = c52c;
                }
                nmh2.A02(AbstractC166987dD.A1J(new IgSignalsFeature(7000004, "open_reel_comments", 0.0d)));
            }
            mvo.A06 = null;
        }
        mvo.A0D = false;
        mvo.A0C = false;
        mvo.A0E = false;
    }

    public final void A01() {
        AbstractC37302Gc3.A1W(this, this.A0N, 3);
    }

    public final void A02() {
        AbstractC37302Gc3.A1W(this, this.A0N, 5);
    }
}
