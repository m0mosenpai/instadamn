package X;

/* loaded from: classes9.dex */
public final class N9T extends C1P1 {
    public final InterfaceC16620sF A00;

    public N9T(InterfaceC16620sF interfaceC16620sF) {
        this.A00 = interfaceC16620sF;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 295171250);
        C52085N2l c52085N2l = (C52085N2l) abstractC115105If.A00();
        if (c52085N2l != null) {
            this.A00.invoke(Integer.valueOf(c52085N2l.mStatusCode), c52085N2l.A00);
        }
        C0f9.A0A(-966748456, A0N);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1208443362);
        C52085N2l c52085N2l = (C52085N2l) obj;
        int A0N = AbstractC167017dG.A0N(c52085N2l, -1996335718);
        this.A00.invoke(Integer.valueOf(c52085N2l.mStatusCode), c52085N2l.A00);
        C0f9.A0A(1293888449, A0N);
        C0f9.A0A(-1604139190, A03);
    }
}
