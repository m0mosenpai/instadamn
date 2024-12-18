package X;

import android.app.Activity;

/* renamed from: X.2oL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59782oL implements InterfaceC41501vz {
    public boolean A00;
    public final /* synthetic */ C59762oJ A01;

    public C59782oL(C59762oJ c59762oJ) {
        this.A01 = c59762oJ;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        int A03 = C0f9.A03(1430342134);
        C04020Js c04020Js = (C04020Js) obj;
        int A032 = C0f9.A03(-889260425);
        C14360o3.A0B(c04020Js, 0);
        if (c04020Js.A04) {
            C59762oJ c59762oJ = this.A01;
            Activity activity = c59762oJ.A00;
            if (!activity.isFinishing()) {
                if (this.A00) {
                    i = -1314200045;
                    C0f9.A0A(i, A032);
                    C0f9.A0A(152084340, A03);
                }
                C193328hC c193328hC = new C193328hC(activity);
                c193328hC.A0A(2131961880);
                c193328hC.A0s(false);
                c193328hC.A0r(activity.getResources().getString(2131962787, c04020Js.A03));
                c193328hC.A0J(new DialogInterfaceOnClickListenerC35340FiH(this, c59762oJ, c04020Js), 2131968948);
                C0fJ.A00(c193328hC.A02());
                this.A00 = true;
                i = -149819249;
                C0f9.A0A(i, A032);
                C0f9.A0A(152084340, A03);
            }
        }
        C59762oJ.A00(this.A01, c04020Js, false);
        i = -149819249;
        C0f9.A0A(i, A032);
        C0f9.A0A(152084340, A03);
    }
}
