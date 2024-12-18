package X;

/* loaded from: classes10.dex */
public final class T37 implements InterfaceC65508Tld {
    public final /* synthetic */ InterfaceC65508Tld A00;
    public final /* synthetic */ C62434SBm A01;
    public final /* synthetic */ String A02;

    public T37(InterfaceC65508Tld interfaceC65508Tld, C62434SBm c62434SBm, String str) {
        this.A00 = interfaceC65508Tld;
        this.A01 = c62434SBm;
        this.A02 = str;
    }

    @Override // X.InterfaceC65508Tld
    public final void DcL(Boolean bool, Integer num, Throwable th) {
        this.A00.DcL(bool, num, th);
    }

    @Override // X.InterfaceC65508Tld
    public final void DcO(String str) {
        this.A00.DcO(str);
        C62434SBm c62434SBm = this.A01;
        c62434SBm.A00.remove(this.A02);
    }
}
