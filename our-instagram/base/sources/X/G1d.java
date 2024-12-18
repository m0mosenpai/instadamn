package X;

import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes6.dex */
public final class G1d implements C7E7 {
    public final /* synthetic */ FOK A00;

    public G1d(FOK fok) {
        this.A00 = fok;
    }

    @Override // X.C7E7
    public final void DDK(String str, String str2, String str3) {
        FOK fok = this.A00;
        AbstractC59962oe abstractC59962oe = fok.A05;
        FragmentActivity requireActivity = abstractC59962oe.requireActivity();
        UserSession userSession = fok.A06;
        DirectThreadKey directThreadKey = fok.A09;
        int i = fok.A04;
        AnonymousClass989 anonymousClass989 = AnonymousClass988.A1Z;
        Parcelable.Creator creator = Capabilities.CREATOR;
        C16930sl c16930sl = C16930sl.A00;
        C7IM A06 = AbstractC86593tX.A06(requireActivity, anonymousClass989.A00(userSession, AbstractC2054797v.A00(c16930sl)));
        String str4 = directThreadKey.A00;
        if (str4 != null) {
            new G1e(requireActivity, userSession, AbstractC2054797v.A00(c16930sl), new G1c(userSession, directThreadKey), new G4U(requireActivity, abstractC59962oe, userSession), str4, AbstractC166987dD.A1E(), i, A06.A01).DDK(str, str3, str2);
        }
    }
}
