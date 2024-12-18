package X;

import android.view.View;

/* renamed from: X.Ih9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41871Ih9 implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass308 A00;

    public ViewOnClickListenerC41871Ih9(AnonymousClass308 anonymousClass308) {
        this.A00 = anonymousClass308;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer valueOf;
        int A05 = C0f9.A05(-635840718);
        AnonymousClass308 anonymousClass308 = this.A00;
        FA7.A00(anonymousClass308.A0T).A02(EnumC33422Ept.A0A, null);
        InterfaceC156276zx interfaceC156276zx = anonymousClass308.A0A;
        if (interfaceC156276zx != null && (valueOf = Integer.valueOf(interfaceC156276zx.BXv())) != null && valueOf.intValue() >= 3) {
            C193328hC A0I = AbstractC31171DnF.A0I(anonymousClass308.A0P);
            A0I.A0A(2131969646);
            A0I.A09(2131969645);
            A0I.A0J(DialogInterfaceOnClickListenerC41836Ifq.A00(anonymousClass308, 13), 2131956564);
            A0I.A0s(true);
            A0I.A06();
            AbstractC166987dD.A1W(A0I);
        } else {
            AnonymousClass308.A01(anonymousClass308);
        }
        C0f9.A0C(2100985883, A05);
    }
}
