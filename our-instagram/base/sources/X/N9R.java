package X;

/* loaded from: classes9.dex */
public final class N9R extends C1P1 {
    public final /* synthetic */ OIG A00;

    public N9R(OIG oig) {
        this.A00 = oig;
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        int i;
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -606236361);
        InterfaceC58014Pny interfaceC58014Pny = this.A00.A01;
        C40791um c40791um = (C40791um) abstractC115105If.A00();
        if (c40791um != null) {
            i = c40791um.mStatusCode;
        } else {
            i = -1;
        }
        interfaceC58014Pny.E1v(i);
        C0f9.A0A(-1362078103, A0N);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(510094648);
        NAJ naj = (NAJ) obj;
        int A0N = AbstractC167017dG.A0N(naj, 312574586);
        this.A00.A01.E1w(naj.A00);
        C0f9.A0A(622237410, A0N);
        C0f9.A0A(206214564, A03);
    }
}
