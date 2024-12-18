package X;

/* renamed from: X.Sp7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63539Sp7 implements C00V {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C63539Sp7(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.C00V
    public final /* bridge */ /* synthetic */ void Cv1(Object obj) {
        if (this.A00 != 0) {
            if (obj != null) {
                try {
                    android.net.Uri A0B = AbstractC25227BEk.A0B(obj.toString());
                    SHD shd = (SHD) this.A01;
                    String A19 = AbstractC166987dD.A19(A0B);
                    STA.A00.A00.add(A19);
                    C131845xK.A00(shd.A00, AbstractC31179DnN.A0I(A19).A00(), shd.A03);
                } catch (SecurityException e) {
                    SHD shd2 = (SHD) this.A01;
                    C131845xK.A00(shd2.A00, AbstractC31179DnN.A0I(e.toString()).A00(), shd2.A02);
                }
            } else {
                SHD shd3 = (SHD) this.A01;
                C14360o3.A0B(R7b.A00, 0);
                C131845xK.A00(shd3.A00, AbstractC25225BEi.A0s().A00(), shd3.A01);
            }
            C00X c00x = ((OTQ) this.A02).A00;
            if (c00x == null) {
                C14360o3.A0F("activityResultLauncher");
                throw C00O.createAndThrow();
            }
            c00x.A00();
            return;
        }
        ((OJB) this.A01).A00();
        InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A02;
        if (interfaceC16660sJ != null) {
            interfaceC16660sJ.invoke(obj);
        }
    }
}
