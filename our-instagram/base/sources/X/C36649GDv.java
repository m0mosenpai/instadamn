package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.GDv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36649GDv implements GYB {
    public final FragmentActivity A00;
    public final AbstractC12990ll A01;

    public C36649GDv(FragmentActivity fragmentActivity, AbstractC12990ll abstractC12990ll) {
        this.A00 = fragmentActivity;
        this.A01 = abstractC12990ll;
    }

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        AbstractC31177DnL.A0m();
        AbstractC31174DnI.A0P();
        Bundle A08 = AbstractC31176DnK.A08("megaphone");
        A08.putBoolean("show_public_contacts_toggle", true);
        A08.putBoolean("extra_is_mv4b_verified", false);
        EO0 eo0 = new EO0();
        eo0.setArguments(A08);
        AbstractC31177DnL.A16(eo0, this.A00, this.A01);
    }
}
