package X;

import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;

/* renamed from: X.BnR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26506BnR extends AbstractC51572Yf {
    public final long A00;
    public final long A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final InterfaceC904941j A04;
    public final NotesPogThoughtBubbleUiState A05;
    public final C39G A06;
    public final InterfaceC60442pS A07;
    public final boolean A08;
    public final boolean A09;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        EnumC77683ds enumC77683ds = EnumC77683ds.FLEX_END;
        C3e8 c3e8 = C3e8.CENTER;
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A00 = C9CU.A00(C9CU.A00(null, C05F.A00, 0, this.A01), C05F.A01, 0, this.A00);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState = this.A05;
        UserSession userSession = this.A03;
        InterfaceC60442pS interfaceC60442pS = this.A07;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        C30063DMx c30063DMx = C30063DMx.A00;
        C29218CuN c29218CuN = C29218CuN.A00;
        boolean z = this.A08;
        boolean z2 = this.A09;
        C206209Bd c206209Bd = new C206209Bd(DBI.A00, C30065DMz.A00, DN0.A00, 3);
        InterfaceC904941j interfaceC904941j = this.A04;
        C39G c39g = this.A06;
        int i = 65568;
        Object[] objArr = 0 == true ? 1 : 0;
        A12.A00(new C25562BRz(c206209Bd, null, interfaceC11380iw, userSession, interfaceC904941j, objArr, notesPogThoughtBubbleUiState, BRD.A00, c39g, c29218CuN, interfaceC60442pS, c30063DMx, i, 0L, false, z, z2));
        return AbstractC76963ci.A0K(A12, c76223bS, A00, enumC77683ds, c3e8);
    }

    public C26506BnR(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC904941j interfaceC904941j, NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, C39G c39g, InterfaceC60442pS interfaceC60442pS, long j, long j2, boolean z, boolean z2) {
        AbstractC167027dH.A13(notesPogThoughtBubbleUiState, userSession, interfaceC60442pS);
        AbstractC167017dG.A1U(c39g, interfaceC11380iw);
        C14360o3.A0B(interfaceC904941j, 8);
        this.A05 = notesPogThoughtBubbleUiState;
        this.A03 = userSession;
        this.A07 = interfaceC60442pS;
        this.A08 = z;
        this.A09 = z2;
        this.A06 = c39g;
        this.A02 = interfaceC11380iw;
        this.A04 = interfaceC904941j;
        this.A01 = j;
        this.A00 = j2;
    }
}
