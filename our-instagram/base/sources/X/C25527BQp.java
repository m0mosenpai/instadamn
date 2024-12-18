package X;

import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;
import com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState;
import java.lang.ref.WeakReference;

/* renamed from: X.BQp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25527BQp extends AbstractC51572Yf {
    public final C206209Bd A00;
    public final UserSession A01;
    public final InterfaceC904941j A02;
    public final C39G A03;
    public final InterfaceC30939Dit A04;
    public final InterfaceC60442pS A05;
    public final InterfaceC16820sZ A06;
    public final InterfaceC16660sJ A07;
    public final boolean A08;
    public final boolean A09;
    public final C51722Yv A0A;
    public final C86493tM A0B;
    public final InterfaceC30807Dgi A0C;
    public final InterfaceC80043ht A0D;
    public final C75113Zb A0E;
    public final WeakReference A0F;
    public final InterfaceC16820sZ A0G;
    public final boolean A0H;

    public C25527BQp(C206209Bd c206209Bd, C51722Yv c51722Yv, UserSession userSession, InterfaceC904941j interfaceC904941j, C86493tM c86493tM, InterfaceC30807Dgi interfaceC30807Dgi, C39G c39g, InterfaceC80043ht interfaceC80043ht, InterfaceC30939Dit interfaceC30939Dit, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, WeakReference weakReference, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2, boolean z3) {
        AbstractC167017dG.A1T(interfaceC30807Dgi, interfaceC16660sJ);
        C14360o3.A0B(interfaceC16820sZ, 8);
        AbstractC25229BEm.A1M(c206209Bd, 11, c39g);
        C14360o3.A0B(interfaceC80043ht, 14);
        C14360o3.A0B(interfaceC16820sZ2, 17);
        C14360o3.A0B(c75113Zb, 18);
        this.A0B = c86493tM;
        this.A01 = userSession;
        this.A05 = interfaceC60442pS;
        this.A0A = c51722Yv;
        this.A0C = interfaceC30807Dgi;
        this.A07 = interfaceC16660sJ;
        this.A04 = interfaceC30939Dit;
        this.A06 = interfaceC16820sZ;
        this.A08 = z;
        this.A09 = z2;
        this.A00 = c206209Bd;
        this.A02 = interfaceC904941j;
        this.A03 = c39g;
        this.A0D = interfaceC80043ht;
        this.A0F = weakReference;
        this.A0H = z3;
        this.A0G = interfaceC16820sZ2;
        this.A0E = c75113Zb;
    }

    public static C26573BoW A03(C51722Yv c51722Yv, C26188BiE c26188BiE, C25528BQq c25528BQq, C25527BQp c25527BQp, int i) {
        C26053Bfg c26053Bfg = c26188BiE.A00;
        UserSession userSession = c25527BQp.A01;
        C14360o3.A0B(userSession, i);
        C06090Tz c06090Tz = C06090Tz.A05;
        long A01 = C18U.A01(c06090Tz, userSession, 36602093549785670L) + C18U.A01(c06090Tz, userSession, 36602093549654596L);
        InterfaceC30808Dgj interfaceC30808Dgj = c25528BQq.A00;
        InterfaceC60442pS interfaceC60442pS = c25527BQp.A05;
        InterfaceC16660sJ interfaceC16660sJ = c25527BQp.A07;
        InterfaceC30939Dit interfaceC30939Dit = c25527BQp.A04;
        return new C26573BoW(c25527BQp.A00, c26053Bfg, c51722Yv, userSession, c25527BQp.A02, interfaceC30808Dgj, c25527BQp.A03, interfaceC30939Dit, interfaceC60442pS, interfaceC16660sJ, A01, c25527BQp.A08, c25527BQp.A09);
    }

    private final BRG A04(C51722Yv c51722Yv, SocialContextBubbleUiState socialContextBubbleUiState, C25528BQq c25528BQq, long j, boolean z) {
        UserSession userSession = this.A01;
        InterfaceC60442pS interfaceC60442pS = this.A05;
        InterfaceC16660sJ interfaceC16660sJ = this.A07;
        InterfaceC30939Dit interfaceC30939Dit = this.A04;
        C206209Bd c206209Bd = this.A00;
        boolean z2 = this.A08;
        boolean z3 = this.A09;
        InterfaceC80043ht interfaceC80043ht = this.A0D;
        InterfaceC16820sZ interfaceC16820sZ = this.A0G;
        return new BRG(c206209Bd, c51722Yv, interfaceC60442pS, userSession, socialContextBubbleUiState, c25528BQq, interfaceC80043ht, interfaceC30939Dit, this.A0E, this.A0F, interfaceC16820sZ, interfaceC16660sJ, j, z, z2, z3);
    }

    private final C25562BRz A05(C51722Yv c51722Yv, NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, InterfaceC30808Dgj interfaceC30808Dgj, long j, boolean z) {
        UserSession userSession = this.A01;
        InterfaceC60442pS interfaceC60442pS = this.A05;
        InterfaceC16660sJ interfaceC16660sJ = this.A07;
        InterfaceC30939Dit interfaceC30939Dit = this.A04;
        return new C25562BRz(this.A00, c51722Yv, null, userSession, this.A02, null, notesPogThoughtBubbleUiState, interfaceC30808Dgj, this.A03, interfaceC30939Dit, interfaceC60442pS, interfaceC16660sJ, 65552, j, z, this.A08, this.A09);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r27 == X.C05F.A0N) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A06(X.C2Z0 r25, X.C25528BQq r26, java.lang.Integer r27, java.util.List r28) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25527BQp.A06(X.2Z0, X.BQq, java.lang.Integer, java.util.List):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0109, code lost:
    
        if (r4 == X.C05F.A0N) goto L39;
     */
    @Override // X.AbstractC51572Yf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC50812Vc A0Y(X.C76223bS r20) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25527BQp.A0Y(X.3bS):X.2Vc");
    }
}
