package X;

/* renamed from: X.LxT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49698LxT implements InterfaceC42241xE {
    public final /* synthetic */ InterfaceC16600sD A00;

    public C49698LxT(InterfaceC16600sD interfaceC16600sD) {
        this.A00 = interfaceC16600sD;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        AbstractC1351869s abstractC1351869s = (AbstractC1351869s) obj;
        int A02 = AbstractC43592JPx.A02(abstractC1351869s);
        for (int i = 0; i < A02; i++) {
            String string = abstractC1351869s.mResultSet.getString(i, 0);
            if (string != null) {
                this.A00.invoke(string, Boolean.valueOf(abstractC1351869s.mResultSet.getBoolean(i, 1)), Boolean.valueOf(abstractC1351869s.mResultSet.getBoolean(i, 2)), Boolean.valueOf(abstractC1351869s.mResultSet.getBoolean(i, 3)));
            }
        }
    }
}
