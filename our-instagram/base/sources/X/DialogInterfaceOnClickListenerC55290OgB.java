package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.OgB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnClickListenerC55290OgB implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;
    public final boolean A06;

    public DialogInterfaceOnClickListenerC55290OgB(UserSession userSession, InterfaceC914447a interfaceC914447a, EnumC53382NjX enumC53382NjX, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A06 = z;
        this.A03 = userSession;
        this.A05 = z2;
        this.A04 = enumC53382NjX;
        this.A01 = interfaceC914447a;
        this.A02 = interfaceC16820sZ;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        boolean z;
        int i2 = this.A00;
        boolean z2 = this.A06;
        if (i2 != 0) {
            if (z2) {
                C25671My A00 = AbstractC25651Mw.A00((AbstractC12990ll) this.A03);
                z = this.A05;
                A00.A05(new C56000OtX(z));
            } else {
                EnumC53382NjX enumC53382NjX = (EnumC53382NjX) this.A04;
                InterfaceC914447a interfaceC914447a = (InterfaceC914447a) this.A01;
                z = this.A05;
                enumC53382NjX.A08(interfaceC914447a, z);
            }
            UserSession userSession = (UserSession) this.A03;
            OQ9.A00(userSession).A01(userSession, "feed_composer", z);
        } else if (z2) {
            AbstractC25651Mw.A00((AbstractC12990ll) this.A03).A05(new C56000OtX(this.A05));
        } else {
            ((EnumC53382NjX) this.A04).A08((InterfaceC914447a) this.A01, this.A05);
        }
        AbstractC166987dD.A1Y(this.A02);
    }
}
