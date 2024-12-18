package X;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;

/* renamed from: X.BnS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26507BnS extends AbstractC51572Yf {
    public final C44471Jld A00;
    public final long A01;
    public final long A02;
    public final SpannableStringBuilder A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final InterfaceC904941j A06;
    public final NotesPogThoughtBubbleUiState A07;
    public final C39G A08;
    public final InterfaceC60442pS A09;

    public C26507BnS(SpannableStringBuilder spannableStringBuilder, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC904941j interfaceC904941j, NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, C39G c39g, C44471Jld c44471Jld, InterfaceC60442pS interfaceC60442pS, long j, long j2) {
        C14360o3.A0B(userSession, 2);
        AbstractC167017dG.A1U(c39g, interfaceC11380iw);
        C14360o3.A0B(c44471Jld, 9);
        this.A07 = notesPogThoughtBubbleUiState;
        this.A05 = userSession;
        this.A09 = interfaceC60442pS;
        this.A08 = c39g;
        this.A04 = interfaceC11380iw;
        this.A06 = interfaceC904941j;
        this.A00 = c44471Jld;
        this.A02 = j;
        this.A01 = j2;
        this.A03 = spannableStringBuilder;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        boolean A1Z = AbstractC25225BEi.A1Z(c76223bS);
        Integer num = C05F.A00;
        C51722Yv A16 = AbstractC25232BEp.A16(AbstractC25225BEi.A0h(null, AbstractC25228BEl.A0m(num, A1Z ? 1 : 0)), C05F.A04, new C50260MHp(this, 11));
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState = this.A07;
        UserSession userSession = this.A05;
        InterfaceC60442pS interfaceC60442pS = this.A09;
        A12.A00(new C26506BnR(this.A04, userSession, this.A06, notesPogThoughtBubbleUiState, this.A08, interfaceC60442pS, this.A02, this.A01, A1Z, A1Z));
        C51722Yv A00 = C9CU.A00(null, C05F.A05, A1Z ? 1 : 0, AbstractC25229BEm.A0J());
        SpannableStringBuilder spannableStringBuilder = this.A03;
        C2XE c2xe = A12.A00;
        int A06 = AbstractC25228BEl.A06(c2xe.A0C, A12, R.attr.igds_color_secondary_text_on_media);
        long A0L = AbstractC25230BEn.A0L();
        Typeface typeface = Typeface.DEFAULT;
        long A0D = AbstractC25229BEm.A0D();
        C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, spannableStringBuilder, A1Z ? 1 : 0);
        AbstractC25233BEq.A1B(A12, A0a, A06, A0L);
        A0a.A0S(A1Z ? 1 : 0);
        AbstractC25234BEr.A0o(typeface, A12, A0a, A0D);
        AbstractC25234BEr.A1I(A0a, num, A1Z);
        A0a.A0E();
        AbstractC25233BEq.A1D(A00, A0a, A1Z);
        AbstractC25227BEk.A1J(A12, A0a);
        return AbstractC76963ci.A01(A12, c76223bS, A16);
    }
}
