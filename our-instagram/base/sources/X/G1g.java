package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class G1g implements InterfaceC37167GZe {
    public final /* synthetic */ C32726Ear A00;

    @Override // X.InterfaceC37167GZe
    public final void Dhb(String str, int i, Integer num) {
        C14360o3.A0B(str, 0);
        C35267Fh2.A06((C35267Fh2) this.A00.A04.getValue(), AbstractC31171DnF.A0V(i), str, C35267Fh2.A02(num), "inbox_invites_sheet", null, null, true);
    }

    @Override // X.InterfaceC37167GZe
    public final void Dhh(Integer num, String str, String str2, String str3, int i) {
        C14360o3.A0B(str, 0);
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 29) {
                C32726Ear c32726Ear = this.A00;
                UserSession A0r = AbstractC166987dD.A0r(c32726Ear.A05);
                FragmentActivity requireActivity = c32726Ear.requireActivity();
                C14360o3.A0B(A0r, 0);
                C36881nl A01 = C36881nl.A01(requireActivity, c32726Ear, A0r, "inbox_channel_invitation");
                A01.A00 = c32726Ear;
                AbstractC31179DnN.A1R(A01, str);
                A01.A0F = 107;
                A01.A0K = null;
                AbstractC31174DnI.A1P(A01);
            } else if (intValue == 32 && str2 != null && str3 != null) {
                C32726Ear c32726Ear2 = this.A00;
                c32726Ear2.A0E(num, str, str2, str3);
                ((EOD) c32726Ear2).A01 = str;
            }
        }
        C35267Fh2.A05((C35267Fh2) this.A00.A04.getValue(), AbstractC31171DnF.A0V(i), str, C35267Fh2.A02(num), "inbox_invites_sheet", null, null, true);
    }

    public G1g(C32726Ear c32726Ear) {
        this.A00 = c32726Ear;
    }

    @Override // X.InterfaceC37167GZe
    public final void Dhp(View view, String str, String str2, int i) {
        AbstractC167017dG.A1N(str, str2);
        this.A00.A0D(view, str, str2, i);
    }
}
