package X;

import android.app.Activity;
import android.content.Context;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes6.dex */
public final class FRN {
    public FHV A00;
    public final Activity A01;
    public final Context A02;
    public final Fragment A04;
    public final UserSession A05;
    public final C35033Fc6 A06;
    public final boolean A09;
    public final AbstractC10360h2 A0A;
    public final AbstractC018607g A0B;
    public final CompoundButton.OnCheckedChangeListener A03 = new C35745Fqd(this, 45);
    public final List A07 = AbstractC166987dD.A1E();
    public final java.util.Set A08 = AbstractC166987dD.A1H();

    public final void A00(FHV fhv) {
        this.A00 = fhv;
        C33111EjF c33111EjF = new C33111EjF(this.A0A, this, fhv, 0);
        Context context = this.A02;
        AbstractC018607g abstractC018607g = this.A0B;
        C1ON A00 = FXB.A00(this.A05, "notifications");
        A00.A00 = c33111EjF;
        C1GJ.A00(context, abstractC018607g, A00);
    }

    public final void A01(Boolean bool) {
        for (Object obj : this.A08) {
            if (obj instanceof GHY) {
                ((GHY) obj).A0A = !bool.booleanValue();
            }
            if (obj instanceof C33242Elc) {
                ((C36731GHa) obj).A0D = bool.booleanValue();
            }
        }
        FHV fhv = this.A00;
        fhv.getClass();
        fhv.A00.setItems(this.A07);
    }

    public FRN(Fragment fragment, UserSession userSession, C35033Fc6 c35033Fc6, boolean z) {
        this.A04 = fragment;
        this.A0B = AbstractC018607g.A00(fragment);
        this.A0A = fragment.mFragmentManager;
        this.A02 = fragment.requireContext();
        this.A01 = fragment.requireActivity();
        this.A05 = userSession;
        this.A06 = c35033Fc6;
        this.A09 = z;
    }
}
