package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ofr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnClickListenerC55276Ofr implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public DialogInterfaceOnClickListenerC55276Ofr(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        OL7 ol7;
        OJY ojy;
        boolean z;
        C25671My A00;
        boolean z2;
        switch (this.A00) {
            case 0:
                ol7 = (OL7) this.A01;
                ojy = ol7.A05;
                ojy.A05 = true;
                z = this.A02;
                ojy.A00 = Boolean.valueOf(z);
                ol7.A01(z);
                return;
            case 1:
                ol7 = (OL7) this.A01;
                C173557o7 A002 = AbstractC173537o5.A00(ol7.A03);
                z = this.A02;
                A002.A01(z);
                ojy = ol7.A05;
                ojy.A05 = true;
                ojy.A00 = Boolean.valueOf(z);
                ol7.A01(z);
                return;
            case 2:
                ol7 = (OL7) this.A01;
                z = !this.A02;
                ol7.A01(z);
                return;
            case 3:
                C56348P0j c56348P0j = (C56348P0j) this.A01;
                NK4 nk4 = c56348P0j.A05;
                boolean z3 = this.A02;
                nk4.A08(z3);
                AbstractC59962oe abstractC59962oe = c56348P0j.A02;
                C55220Oej.A03(abstractC59962oe.requireContext(), c56348P0j.A04, abstractC59962oe.getModuleName(), z3);
                return;
            case 4:
                C56348P0j c56348P0j2 = (C56348P0j) this.A01;
                NK4 nk42 = c56348P0j2.A05;
                boolean z4 = this.A02;
                nk42.A08(z4);
                AbstractC37670Gi3.A0g(c56348P0j2.A03, c56348P0j2.A04, false, z4);
                return;
            case 5:
                A00 = AbstractC25651Mw.A00(((P1E) this.A01).A0J);
                z2 = this.A02;
                A00.E4s(new C55987OtK(z2));
                return;
            case 6:
                UserSession userSession = ((P1E) this.A01).A0J;
                C173557o7 A003 = AbstractC173537o5.A00(userSession);
                z2 = this.A02;
                A003.A01(z2);
                A00 = AbstractC25651Mw.A00(userSession);
                A00.E4s(new C55987OtK(z2));
                return;
            case 7:
                A00 = AbstractC25651Mw.A00(((P1E) this.A01).A0J);
                z2 = !this.A02;
                A00.E4s(new C55987OtK(z2));
                return;
            default:
                C46052Ka7 c46052Ka7 = (C46052Ka7) this.A01;
                if (c46052Ka7.A00 == null) {
                    C14360o3.A0F("analyticsLogger");
                    throw C00O.createAndThrow();
                }
                C47859LCf.A00(2L, "SETTINGS");
                C46052Ka7.A00(c46052Ka7, this.A02);
                return;
        }
    }
}
