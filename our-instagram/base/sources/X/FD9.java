package X;

/* loaded from: classes6.dex */
public abstract class FD9 {
    public static final void A00(AbstractC12990ll abstractC12990ll, EnumC33445EqI enumC33445EqI, Integer num, Integer num2, String str) {
        String str2;
        double A00 = AbstractC31177DnL.A00(abstractC12990ll);
        double A002 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "register_account_request_submitted");
        AbstractC31177DnL.A1B(A0f, A00, A002);
        AbstractC31179DnN.A1A(A0f, "containermodule", "waterfall_log_in", A002);
        AbstractC31171DnF.A1A(A0f, "done");
        AbstractC31171DnF.A19(A0f, enumC33445EqI.A00);
        AbstractC35274Fh9.A07(A0f, A00);
        Long l = null;
        if (num != null) {
            str2 = AbstractC31178DnM.A0f(AbstractC34293FAn.A00(num));
        } else {
            str2 = null;
        }
        A0f.AAP("chosen_signup_type", str2);
        if (num2 != null) {
            l = AbstractC25229BEm.A0n(num2);
        }
        A0f.A9K("attempt_count", l);
        AbstractC35274Fh9.A0C(A0f, abstractC12990ll, "retry_strategy", str);
        A0f.Cht();
    }
}
