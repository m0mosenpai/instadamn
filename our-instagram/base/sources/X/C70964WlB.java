package X;

import android.location.Location;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.WlB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70964WlB implements InterfaceC127465pP {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UFT A01;

    public C70964WlB(FragmentActivity fragmentActivity, UFT uft) {
        this.A01 = uft;
        this.A00 = fragmentActivity;
    }

    @Override // X.InterfaceC127465pP
    public final void DEF(Exception exc) {
        String str;
        Object value;
        C66628UPq c66628UPq;
        UFT uft = this.A01;
        if (exc != null) {
            str = exc.getLocalizedMessage();
        } else {
            str = null;
        }
        C50120MBu.A01(uft, String.valueOf(str), AbstractC141776au.A00(uft), 24);
        C05A c05a = uft.A02.A04;
        do {
            value = c05a.getValue();
            c66628UPq = (C66628UPq) value;
        } while (!c05a.AIi(value, C66628UPq.A00(c66628UPq.A03, c66628UPq.A02, c66628UPq.A05, c66628UPq.A04, c66628UPq.A00, c66628UPq.A01, false)));
    }

    @Override // X.InterfaceC127465pP
    public final void onLocationChanged(Location location) {
        UFT.A01(this.A00, this.A01);
    }
}
