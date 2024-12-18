package X;

import android.graphics.Typeface;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;

/* renamed from: X.Bmo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26467Bmo extends AbstractC51572Yf {
    public final C206209Bd A00;
    public final UserSession A01;
    public final InterfaceC904941j A02;
    public final C25816BbX A03;
    public final NotesPogThoughtBubbleUiState A04;
    public final C39G A05;
    public final InterfaceC60442pS A06;

    public C26467Bmo(C206209Bd c206209Bd, UserSession userSession, InterfaceC904941j interfaceC904941j, C25816BbX c25816BbX, NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, C39G c39g, InterfaceC60442pS interfaceC60442pS) {
        AbstractC167027dH.A0a(1, c25816BbX, notesPogThoughtBubbleUiState, userSession, interfaceC60442pS);
        C14360o3.A0B(c39g, 10);
        this.A03 = c25816BbX;
        this.A04 = notesPogThoughtBubbleUiState;
        this.A01 = userSession;
        this.A06 = interfaceC60442pS;
        this.A00 = c206209Bd;
        this.A02 = interfaceC904941j;
        this.A05 = c39g;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        EnumC77683ds enumC77683ds = EnumC77683ds.STRETCH;
        C3e8 c3e8 = C3e8.FLEX_END;
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A00 = C9CU.A00(C9CU.A00(null, C05F.A1I, 0, AbstractC25229BEm.A0J()), C05F.A01, 0, Double.doubleToRawLongBits(146.0d)).A00(null);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        C25816BbX c25816BbX = this.A03;
        NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState = this.A04;
        UserSession userSession = this.A01;
        InterfaceC60442pS interfaceC60442pS = this.A06;
        C29219CuO c29219CuO = C29219CuO.A00;
        A12.A00(new C25562BRz(this.A00, null, null, userSession, this.A02, c25816BbX, notesPogThoughtBubbleUiState, BRD.A00, this.A05, c29219CuO, interfaceC60442pS, C30064DMy.A00, 65584, 0L, false, false, false));
        EnumC77683ds enumC77683ds2 = EnumC77683ds.CENTER;
        Integer num = C05F.A00;
        C51722Yv A15 = AbstractC25232BEp.A15(null, num, enumC77683ds2);
        String B8y = notesPogThoughtBubbleUiState.A06.B8y();
        C2XE c2xe = A12.A00;
        int A07 = AbstractC25229BEm.A07(c2xe.A0C, A12);
        long A0r = AbstractC25232BEp.A0r(12.0f);
        Typeface typeface = Typeface.DEFAULT;
        long A0D = AbstractC25229BEm.A0D();
        C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, B8y, 0);
        AbstractC25233BEq.A1B(A12, A0a, A07, A0r);
        A0a.A0S(0);
        AbstractC25234BEr.A0o(typeface, A12, A0a, A0D);
        AbstractC25234BEr.A1I(A0a, num, false);
        A0a.A0M(1);
        AbstractC25233BEq.A1D(A15, A0a, false);
        AbstractC25227BEk.A1J(A12, A0a);
        return AbstractC76963ci.A07(A12, c76223bS, A00, enumC77683ds, c3e8);
    }
}
