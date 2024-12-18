package X;

import com.facebook.R;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.BoX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26574BoX extends AbstractC51572Yf {
    public final C120985dq A00;
    public final C37644Ghd A01;
    public final UserSession A02;
    public final C37526Gfi A03;
    public final InterfaceC31137Dmc A04;
    public final ClipsViewerConfig A05;
    public final InterfaceC60442pS A06;
    public final C64052vQ A07;
    public final C25348BJr A08;
    public final InterfaceC31152Dmw A09;
    public final HashMap A0A;
    public final HashMap A0B;
    public final List A0C;
    public final boolean A0D;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009c, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r5, 36319209828064351L) != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ae A[LOOP:0: B:21:0x00a8->B:23:0x00ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b2  */
    @Override // X.AbstractC51572Yf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC50812Vc A0Y(X.C76223bS r46) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26574BoX.A0Y(X.3bS):X.2Vc");
    }

    private final AbstractC51572Yf A03(C2Z1 c2z1, C7P c7p) {
        if (c7p != C7P.A04) {
            return null;
        }
        UserSession userSession = this.A02;
        if (C18U.A06(C06090Tz.A05, userSession, 36328315153366476L)) {
            C120985dq c120985dq = this.A00;
            C37644Ghd c37644Ghd = (C37644Ghd) this.A0C.get(0);
            C75933ay c75933ay = C51722Yv.A02;
            C51722Yv A0X = AbstractC25233BEq.A0X(AbstractC25232BEp.A15(null, C05F.A00, EnumC77683ds.FLEX_START), c2z1, R.dimen.audition_flow_picker_subtitle_margin_bottom);
            long A09 = AbstractC25227BEk.A09(c2z1);
            return new C26502BnN(AbstractC25234BEr.A0E(A0X, AbstractC25227BEk.A0a(0, A09), 0, AbstractC77623dm.A04(c2z1)), this.A05, c120985dq, c37644Ghd, userSession, this.A06, null, null, null);
        }
        C120985dq c120985dq2 = this.A00;
        C37644Ghd c37644Ghd2 = (C37644Ghd) this.A0C.get(0);
        C75933ay c75933ay2 = C51722Yv.A02;
        C51722Yv A0X2 = AbstractC25233BEq.A0X(AbstractC25232BEp.A15(null, C05F.A00, EnumC77683ds.FLEX_START), c2z1, R.dimen.audition_flow_picker_subtitle_margin_bottom);
        long A092 = AbstractC25227BEk.A09(c2z1);
        return new BU2(AbstractC25234BEr.A0E(A0X2, AbstractC25227BEk.A0a(0, A092), 0, AbstractC77623dm.A04(c2z1)), this.A05, c120985dq2, c37644Ghd2, userSession, this.A06, null, null);
    }

    public C26574BoX(ClipsViewerConfig clipsViewerConfig, C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C64052vQ c64052vQ, C37526Gfi c37526Gfi, InterfaceC31137Dmc interfaceC31137Dmc, C25348BJr c25348BJr, InterfaceC31152Dmw interfaceC31152Dmw, HashMap hashMap, HashMap hashMap2, List list, boolean z) {
        AbstractC25234BEr.A1R(interfaceC60442pS, c120985dq, userSession, c37644Ghd, list);
        AbstractC25233BEq.A0y(7, hashMap, hashMap2, c25348BJr);
        AbstractC25229BEm.A1L(c37526Gfi, 10, clipsViewerConfig);
        this.A04 = interfaceC31137Dmc;
        this.A06 = interfaceC60442pS;
        this.A00 = c120985dq;
        this.A02 = userSession;
        this.A01 = c37644Ghd;
        this.A0C = list;
        this.A0A = hashMap;
        this.A0B = hashMap2;
        this.A08 = c25348BJr;
        this.A03 = c37526Gfi;
        this.A0D = z;
        this.A05 = clipsViewerConfig;
        this.A07 = c64052vQ;
        this.A09 = interfaceC31152Dmw;
    }
}
