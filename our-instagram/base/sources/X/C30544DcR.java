package X;

import android.text.SpannableStringBuilder;

/* renamed from: X.DcR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30544DcR extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ int A00;
    public final /* synthetic */ InterfaceC109864xE A01;
    public final /* synthetic */ InterfaceC109094vY A02;
    public final /* synthetic */ InterfaceC38401qU A03;
    public final /* synthetic */ C3h2 A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30544DcR(InterfaceC109864xE interfaceC109864xE, InterfaceC109094vY interfaceC109094vY, InterfaceC38401qU interfaceC38401qU, C3h2 c3h2, int i) {
        super(3);
        this.A01 = interfaceC109864xE;
        this.A03 = interfaceC38401qU;
        this.A00 = i;
        this.A04 = c3h2;
        this.A02 = interfaceC109094vY;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        ViewOnClickListenerC42005Ija viewOnClickListenerC42005Ija;
        boolean A1a = AbstractC166987dD.A1a(obj3);
        C14360o3.A0B(obj, 0);
        InterfaceC109864xE interfaceC109864xE = this.A01;
        if (interfaceC109864xE != null) {
            viewOnClickListenerC42005Ija = new ViewOnClickListenerC42005Ija(this.A00, 0, obj2, interfaceC109864xE, this.A03, this.A04, A1a);
        } else {
            viewOnClickListenerC42005Ija = null;
        }
        String description = this.A02.getDescription();
        if (description != null) {
            SpannableStringBuilder A0H = AbstractC25225BEi.A0H(description);
            if (interfaceC109864xE != null) {
                String text = interfaceC109864xE.getText();
                A0H.append((CharSequence) " ");
                if (text != null) {
                    A0H.append((CharSequence) text);
                    A0H.setSpan(new C25715BYa(2, obj, viewOnClickListenerC42005Ija), AbstractC167007dF.A0A(A0H.toString()) - text.length(), AbstractC167007dF.A0A(A0H.toString()), 33);
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
            return A0H;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
