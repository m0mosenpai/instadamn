package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Fij, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35368Fij implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public DialogInterfaceOnClickListenerC35368Fij(Object obj, Object obj2, Object obj3, String str, String str2, String str3, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A04 = str;
        this.A06 = str2;
        this.A05 = str3;
        this.A03 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.1ll, X.1OW] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String C7I;
        String str;
        Long BTC;
        switch (this.A00) {
            case 0:
                C18920wW c18920wW = (C18920wW) this.A01;
                User user = (User) this.A02;
                String str2 = this.A04;
                String str3 = this.A06;
                C75R.A0A(c18920wW, user, "approval_page_approve_and_unrestrict", str2, str3, this.A05);
                C25814BbV c25814BbV = (C25814BbV) this.A03;
                c25814BbV.A0b(str2, str3);
                c25814BbV.A0W(user, str2, str3);
                return;
            case 1:
                C18920wW c18920wW2 = (C18920wW) this.A01;
                User user2 = (User) this.A02;
                String str4 = this.A04;
                String str5 = this.A06;
                C75R.A0A(c18920wW2, user2, "approval_page_approve_this_comment", str4, str5, this.A05);
                dialogInterface.dismiss();
                ((C25814BbV) this.A03).A0b(str4, str5);
                return;
            default:
                G4W g4w = (G4W) this.A03;
                EnumC33511Erk enumC33511Erk = EnumC33511Erk.CONFIRM;
                String str6 = this.A05;
                C7U0 c7u0 = (C7U0) this.A01;
                G4W.A05(enumC33511Erk, (FRk) this.A02, c7u0, str6);
                String str7 = this.A04;
                String str8 = this.A06;
                if (str6 != null && (C7I = c7u0.C7r().C7I()) != null) {
                    UserSession userSession = g4w.A05;
                    JTa A08 = AbstractC31277Doz.A08(userSession, C35651ll.class);
                    User A0k = AbstractC31174DnI.A0k(userSession, str8);
                    if (A0k == null || (BTC = A0k.BTC()) == null || (str = BTC.toString()) == null) {
                        str = "";
                    }
                    C14360o3.A0B(A08, 1);
                    ?? c1ow = new C1OW(A08);
                    c1ow.A03 = C7I;
                    c1ow.A00 = str7;
                    c1ow.A01 = str;
                    c1ow.A02 = str6;
                    AbstractC31173DnH.A1U(userSession, c1ow);
                    return;
                }
                return;
        }
    }
}
