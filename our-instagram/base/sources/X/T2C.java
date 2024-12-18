package X;

/* loaded from: classes10.dex */
public final class T2C implements InterfaceC65376Tj9 {
    public final /* synthetic */ C27061Tf A00;

    public T2C(C27061Tf c27061Tf) {
        this.A00 = c27061Tf;
    }

    @Override // X.InterfaceC65376Tj9
    public final void D6g(C58428Pv7 c58428Pv7) {
        String str;
        if (c58428Pv7.A07() && c58428Pv7.A04() != null && ((C62674SLm) c58428Pv7.A04()).A00 == 1) {
            str = "voltron sideload success";
        } else {
            str = "voltron sideload failed";
        }
        C0K8.A0C("i18n_VoltronFbtLanguagePackSideLoader", str);
    }
}
