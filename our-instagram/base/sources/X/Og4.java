package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class Og4 implements DialogInterface.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    public Og4(Object obj, String str, String str2, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
        this.A03 = str;
        this.A04 = str2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        UserSession userSession;
        int i2;
        String str;
        String str2;
        int i3;
        switch (this.A00) {
            case 0:
                userSession = (UserSession) this.A02;
                i2 = this.A01;
                str = this.A03;
                str2 = this.A04;
                i3 = 2;
                AbstractC35213Fg6.A04(userSession, str, str2, i3, i2);
                dialogInterface.dismiss();
                return;
            case 1:
                userSession = (UserSession) this.A02;
                i2 = this.A01;
                str = this.A03;
                str2 = this.A04;
                i3 = 3;
                AbstractC35213Fg6.A04(userSession, str, str2, i3, i2);
                dialogInterface.dismiss();
                return;
            case 2:
                C142846ck c142846ck = (C142846ck) this.A02;
                int i4 = this.A01;
                String str3 = this.A03;
                String str4 = this.A04;
                C25531Mh A0I = AbstractC31172DnG.A0I(c142846ck);
                if (AbstractC25226BEj.A1Z(A0I)) {
                    AbstractC31175DnJ.A1B(A0I, c142846ck);
                    AbstractC31174DnI.A1I(A0I, "resign_collaborator_cancel");
                    A0I.A0o("resign_collaborator_dialog");
                    A0I.A0h(AbstractC31179DnN.A0a(A0I, "thread_details", str3, str4, i4));
                    A0I.Cht();
                }
                dialogInterface.dismiss();
                return;
            case 3:
                C7DU c7du = (C7DU) this.A02;
                int i5 = this.A01;
                AbstractC34065F1s.A00(c7du.A00, this.A03, this.A04, "resign_moderator_cancel", "tap", "resign_moderator_dialog", "thread_details", null, i5);
                dialogInterface.dismiss();
                return;
            default:
                C28179CbR c28179CbR = ((OJ6) this.A02).A02;
                String str5 = this.A03;
                int i6 = this.A01;
                String str6 = this.A04;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c28179CbR.A00, "instagram_clips_viewer_link_tap");
                Long A00 = C28179CbR.A00(str5);
                if (A0f.isSampled() && A00 != null) {
                    A0f.AAP("containermodule", "add_spin_nux");
                    AbstractC37300Gc1.A0h(A0f, A00);
                    AbstractC25229BEm.A19(A0f, i6);
                    AbstractC25225BEi.A1P(A0f, str6);
                    AbstractC37300Gc1.A0e(BQL.A1E, A0f);
                    AbstractC25225BEi.A1M(EnumC120795dP.A0E, A0f);
                    AbstractC167017dG.A1C(A0f);
                    return;
                }
                return;
        }
    }
}
