package X;

import android.view.View;

/* renamed from: X.OjC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55401OjC implements View.OnClickListener {
    public final /* synthetic */ InterfaceC58289Psh A00;
    public final /* synthetic */ InterfaceC64002vL A01;
    public final /* synthetic */ String A02;

    public ViewOnClickListenerC55401OjC(InterfaceC58289Psh interfaceC58289Psh, InterfaceC64002vL interfaceC64002vL, String str) {
        this.A00 = interfaceC58289Psh;
        this.A01 = interfaceC64002vL;
        this.A02 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-357123640);
        EnumC53202Nfy Aix = this.A00.Aix();
        if (Aix != null) {
            this.A01.De5(Aix, this.A02);
        }
        C0f9.A0C(1981915888, A05);
    }
}
