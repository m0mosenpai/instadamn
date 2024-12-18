package X;

/* loaded from: classes10.dex */
public final class T2I implements InterfaceC43641zu {
    public final /* synthetic */ C54732fW A00;

    public T2I(C54732fW c54732fW) {
        this.A00 = c54732fW;
    }

    @Override // X.InterfaceC43641zu
    public final void onTokenChange() {
        C54732fW c54732fW = this.A00;
        C1R0 C98 = c54732fW.A08.C98();
        if (C98 != null && C98.A00 != c54732fW.A00) {
            C54732fW.A03(c54732fW, false);
        }
    }
}
