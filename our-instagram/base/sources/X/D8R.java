package X;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes5.dex */
public final class D8R extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final String A02;
    public final boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D8R(Object obj, String str, int i, boolean z) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = z;
        this.A02 = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        String A00;
        String str;
        String str2;
        switch (this.A00) {
            case 2:
                EOK eok = (EOK) this.A01;
                boolean z = this.A03;
                String str3 = this.A02;
                C193328hC c193328hC = new C193328hC((Activity) eok.requireActivity());
                int i = 2131958991;
                if (z) {
                    i = 2131959000;
                }
                c193328hC.A0A(i);
                c193328hC.A09(2131958992);
                c193328hC.A0M(new DialogInterfaceOnClickListenerC28563Civ(eok, str3, 2), 2131960774);
                c193328hC.A0D(new DialogInterfaceOnClickListenerC28563Civ(eok, str3, 3));
                c193328hC.A0s(true);
                c193328hC.A0t(true);
                AbstractC166987dD.A1W(c193328hC);
                C36297Fzr c36297Fzr = eok.A02;
                if (c36297Fzr == null) {
                    str2 = "dailyPromptsLogger";
                } else {
                    String str4 = eok.A0C;
                    if (str4 == null) {
                        str2 = "threadId";
                    } else {
                        DirectThreadKey directThreadKey = eok.A08;
                        if (directThreadKey == null) {
                            str2 = "threadKey";
                        } else {
                            String str5 = directThreadKey.A01;
                            int i2 = eok.A00;
                            String str6 = eok.A0D;
                            if (str6 == null) {
                                str2 = "userType";
                            } else {
                                boolean z2 = eok.A0H;
                                C09530e4 A1L = AbstractC166987dD.A1L("user_type", str6);
                                if (z2) {
                                    str = "ACTIVE";
                                } else {
                                    str = "ENDED";
                                }
                                C36297Fzr.A02(c36297Fzr, str4, str5, "delete_daily_prompt_response_dialog_rendered", "tap", "delete_button", AbstractC43591JPw.A00(330), AbstractC25232BEp.A1F("daily_prompt_submission_id", str3, A1L, AbstractC166987dD.A1L("daily_prompt_status", str)), i2);
                                return C0eB.A00;
                            }
                        }
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 3:
                boolean z3 = this.A03;
                L8o l8o = (L8o) this.A01;
                String str7 = this.A02;
                if (z3) {
                    l8o.A00(str7, null, 99, 0);
                    l8o.A00(str7, null, 84, 0);
                } else {
                    l8o.A00(str7, null, 85, 0);
                }
                return C0eB.A00;
            case 4:
                AbstractC44190Jft abstractC44190Jft = (AbstractC44190Jft) this.A01;
                abstractC44190Jft.A01.flowAnnotate(abstractC44190Jft.A00, this.A02, this.A03);
                return C0eB.A00;
            case 5:
                boolean z4 = this.A03;
                C54976OTi c54976OTi = ((OH5) this.A01).A00.A0M;
                String str8 = this.A02;
                C14360o3.A0B(str8, 0);
                InterfaceC58268PsC interfaceC58268PsC = c54976OTi.A00;
                String str9 = c54976OTi.A01;
                Bundle A002 = C54976OTi.A00(c54976OTi, str8, null);
                String A003 = MSV.A00(222);
                if (z4) {
                    A00 = "discard_confirmation_pop_up_dialog_stay_button";
                } else {
                    A00 = MSV.A00(1132);
                }
                interfaceC58268PsC.Ci4(A002, str9, A003, A00, "click");
                return C0eB.A00;
            case 6:
                UserSession userSession = (UserSession) this.A01;
                boolean z5 = this.A03;
                C200108tF.A0A(userSession, this.A02, z5, false);
                AbstractC25651Mw.A00(userSession).A05(new C56020Otr(C05F.A01, z5, false));
                return C0eB.A00;
            case 7:
                C41691IdK c41691IdK = (C41691IdK) this.A01;
                String str10 = this.A02;
                C41691IdK.A01(c41691IdK, str10, new C43211J8i(str10, this.A03, 5));
                return C0eB.A00;
            case 8:
                super/*X.1CN*/.A0w(this.A02, this.A03);
                return C0eB.A00;
            case 9:
                super/*X.1CN*/.CjO(this.A02, this.A03);
                return C0eB.A00;
            case 10:
                super/*X.1CN*/.CjP(this.A02, this.A03);
                return C0eB.A00;
            case 11:
                super/*X.1CN*/.CjQ(this.A02, this.A03);
                return C0eB.A00;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                super/*X.1CN*/.CkD(this.A02, this.A03);
                return C0eB.A00;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                super/*X.1CN*/.CkE(this.A02, this.A03);
                return C0eB.A00;
            default:
                super/*X.1CN*/.CkF(this.A02, this.A03);
                return C0eB.A00;
        }
    }
}
