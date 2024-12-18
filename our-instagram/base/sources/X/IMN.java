package X;

import android.graphics.drawable.Drawable;
import ca.psiphon.PsiphonTunnel;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes7.dex */
public final class IMN {
    public int A00 = PsiphonTunnel.VPN_INTERFACE_MTU;
    public Drawable A01;
    public ImageUrl A02;
    public InterfaceC58151PqG A03;
    public CharSequence A04;
    public String A05;
    public String A06;
    public String A07;

    public final IKG A00() {
        if (this.A04 != null) {
            if (this.A03 != null) {
                if (this.A06 != null) {
                    if (this.A07 != null) {
                        return new IKG(this);
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
