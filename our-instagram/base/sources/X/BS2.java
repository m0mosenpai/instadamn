package X;

import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;

/* loaded from: classes5.dex */
public final class BS2 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C37838Gks A00;
    public final /* synthetic */ C76223bS A01;
    public final /* synthetic */ C51762Yz A02;
    public final /* synthetic */ C51762Yz A03;
    public final /* synthetic */ C51762Yz A04;
    public final /* synthetic */ C51762Yz A05;
    public final /* synthetic */ C25562BRz A06;
    public final /* synthetic */ String A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BS2(C37838Gks c37838Gks, C76223bS c76223bS, C51762Yz c51762Yz, C51762Yz c51762Yz2, C51762Yz c51762Yz3, C51762Yz c51762Yz4, C25562BRz c25562BRz, String str) {
        super(0);
        this.A07 = str;
        this.A06 = c25562BRz;
        this.A03 = c51762Yz;
        this.A01 = c76223bS;
        this.A02 = c51762Yz2;
        this.A00 = c37838Gks;
        this.A04 = c51762Yz3;
        this.A05 = c51762Yz4;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str = this.A07;
        C25562BRz c25562BRz = this.A06;
        NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState = c25562BRz.A07;
        UserSession userSession = c25562BRz.A04;
        InterfaceC904941j interfaceC904941j = c25562BRz.A05;
        C51762Yz c51762Yz = this.A03;
        C50260MHp c50260MHp = new C50260MHp(this.A02, 20);
        C37838Gks c37838Gks = this.A00;
        C76223bS c76223bS = this.A01;
        return new C2Y0(AbstractC77363dM.A00(c76223bS), new BSH(c51762Yz, userSession, interfaceC904941j, notesPogThoughtBubbleUiState, str, AbstractC25225BEi.A1E(this.A04, 36), new ME7(32, c37838Gks, c25562BRz, this.A05, c76223bS), c50260MHp, new C30536DcJ(9, c76223bS, c25562BRz, c37838Gks)));
    }
}
