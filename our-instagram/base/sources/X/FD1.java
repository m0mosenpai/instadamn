package X;

/* loaded from: classes6.dex */
public abstract class FD1 {
    public static final void A00(AbstractC12990ll abstractC12990ll, C35161Ff3 c35161Ff3, String str, String str2, String str3, String str4, String str5) {
        Boolean bool;
        String str6;
        AbstractC167017dG.A1N(abstractC12990ll, str);
        double A01 = AbstractC31171DnF.A01();
        double A00 = AbstractC31171DnF.A00();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "log_in");
        AbstractC31172DnG.A1N(A0f);
        A0f.AAP("tracking_enabled", null);
        A0f.AAP("advertising_id", null);
        AbstractC31177DnL.A1B(A0f, A01, A00);
        AbstractC31175DnJ.A0y(A0f);
        AbstractC31177DnL.A1G(A0f, "instagram_id", str2, A00);
        AbstractC31176DnK.A1K(A0f, A01);
        if (c35161Ff3 != null) {
            bool = AbstractC31174DnI.A0n(c35161Ff3.A00, AbstractC31176DnK.A0r(EnumC33320EoF.A0C));
        } else {
            bool = null;
        }
        A0f.A7v("was_from_recovery_flow", bool);
        if (c35161Ff3 != null) {
            str6 = c35161Ff3.A00.getString(AbstractC31176DnK.A0r(EnumC33320EoF.A0B));
        } else {
            str6 = null;
        }
        A0f.AAP("recovery_type", str6);
        AbstractC31171DnF.A19(A0f, str3);
        A0f.AAP("reg_type", str4);
        A0f.A9K("actor_id", str5 != null ? AbstractC166997dE.A0j(str5) : null);
        AbstractC35274Fh9.A05(A0f);
        AbstractC35274Fh9.A04(A0f);
        AbstractC31171DnF.A1A(A0f, str);
        A0f.Cht();
    }
}
