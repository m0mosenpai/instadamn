package X;

import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes9.dex */
public final class NK9 extends OX6 {
    public C56064Ouh A00;
    public C8YE A01;
    public final AbstractC55082Oac A02;
    public final InterfaceC19390xP A03;
    public final InterfaceC19390xP A04;
    public final C05A A05;
    public final C05A A06;

    public NK9(AbstractC55082Oac abstractC55082Oac) {
        super(abstractC55082Oac);
        this.A02 = abstractC55082Oac;
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A05 = A0o;
        this.A03 = A0o;
        C008002u A1H = AbstractC25225BEi.A1H("");
        this.A06 = A1H;
        this.A04 = A1H;
    }

    public final void A08(String str) {
        String str2;
        C51754Mtd A00;
        C51754Mtd A04 = A04();
        if (str == null) {
            str2 = MSW.A15(this.A06);
        } else {
            str2 = str;
        }
        A00 = C51754Mtd.A00(null, null, null, null, null, null, null, null, null, null, null, null, A04, null, null, null, null, null, null, str2, null, null, null, null, null, null, null, null, null, null, null, null, -5, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false);
        A07(A00);
        if (str == null) {
            str = MSW.A15(this.A06);
        }
        HashSet A002 = AbstractC53940NtD.A00(str);
        C05A c05a = this.A05;
        List A0a = AbstractC001800i.A0a(AbstractC31172DnG.A0w(c05a));
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : A0a) {
            if (A002.contains(((User) obj).getUsername())) {
                A1E.add(obj);
            }
        }
        c05a.Egh(AbstractC001800i.A0U(A1E));
    }
}
