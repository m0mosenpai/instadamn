package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class D8T extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ InterfaceC16620sF A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D8T(UserSession userSession, String str, String str2, InterfaceC16620sF interfaceC16620sF, int i) {
        super(0);
        this.A00 = i;
        this.A01 = userSession;
        this.A02 = str;
        this.A04 = interfaceC16620sF;
        this.A03 = str2;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Integer num;
        String str;
        int i = this.A00;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    num = C05F.A0j;
                }
                return C0eB.A00;
            }
            num = C05F.A0Y;
        } else {
            num = C05F.A0N;
        }
        switch (num.intValue()) {
            case 3:
                str = "icebreaker_prompt_1";
                break;
            case 4:
                str = "icebreaker_prompt_2";
                break;
            default:
                str = "icebreaker_prompt_3";
                break;
        }
        UserSession userSession = this.A01;
        String str2 = this.A02;
        InterfaceC16620sF interfaceC16620sF = this.A04;
        String str3 = this.A03;
        new C28484Chc(userSession).A0C(str2, str);
        interfaceC16620sF.invoke(str, str3);
        return C0eB.A00;
    }
}
