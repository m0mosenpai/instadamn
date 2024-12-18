package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.business.PublicPhoneContact;
import java.io.IOException;

/* renamed from: X.GKl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36812GKl implements Runnable {
    public final /* synthetic */ ELV A00;

    public RunnableC36812GKl(ELV elv) {
        this.A00 = elv;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        ELV elv = this.A00;
        Context requireContext = elv.requireContext();
        C08790ch A00 = AbstractC018607g.A00(elv);
        UserSession userSession = elv.A05;
        PublicPhoneContact submitPublicPhoneContact = elv.A03.getSubmitPublicPhoneContact();
        C14360o3.A0B(userSession, 2);
        String str2 = null;
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("business/account/validate_phone_number/");
        A0c.A0R = true;
        if (submitPublicPhoneContact != null && (str = submitPublicPhoneContact.A02) != null && str.length() != 0) {
            try {
                str2 = AbstractC34250F8w.A00(submitPublicPhoneContact);
            } catch (IOException unused) {
                C0w9.A03("edit_business_profile", "Couldn't serialize create business public phone contact");
            }
            A0c.A9s("public_phone_contact", str2);
        }
        A0c.A0Q(new C56150OwG(C52073N1y.A00, new C36014FvC(1)));
        C1ON A0N = A0c.A0N();
        C31456Ds0.A00(A0N, requireContext, elv, 11);
        C1GJ.A00(requireContext, A00, A0N);
    }
}
