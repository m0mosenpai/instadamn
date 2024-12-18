package X;

/* loaded from: classes4.dex */
public final class AXA implements BCV {
    public final /* synthetic */ C24222Aoo A00;

    public AXA(C24222Aoo c24222Aoo) {
        this.A00 = c24222Aoo;
    }

    @Override // X.BCV
    public final void onExit() {
        AbstractC167027dH.A15(C05F.A05, this.A00.A04, AbstractC167027dH.A0X());
    }

    @Override // X.BCV
    public final void onTextChanged(String str) {
        C14360o3.A0B(str, 0);
        AbstractC167027dH.A14("newText", str, this.A00.A04, AbstractC167027dH.A0X(), AbstractC167027dH.A0Y(C05F.A06));
    }
}
