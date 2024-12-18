package X;

/* renamed from: X.WpP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71178WpP implements InterfaceC42241xE {
    public final /* synthetic */ InterfaceC71950XCc A00;

    public C71178WpP(InterfaceC71950XCc interfaceC71950XCc) {
        this.A00 = interfaceC71950XCc;
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        boolean A1b = AbstractC31177DnL.A1b(obj);
        InterfaceC71950XCc interfaceC71950XCc = this.A00;
        if (A1b) {
            if (interfaceC71950XCc != null) {
                interfaceC71950XCc.onSuccess();
            }
        } else {
            if (interfaceC71950XCc == null) {
                return;
            }
            interfaceC71950XCc.onFailure();
        }
    }
}
