package X;

/* loaded from: classes4.dex */
public final class AiI implements MQV {
    public final /* synthetic */ C66486UJo A00;
    public final /* synthetic */ C66017TyF A01;
    public final /* synthetic */ AAF A02;

    public AiI(C66486UJo c66486UJo, C66017TyF c66017TyF, AAF aaf) {
        this.A01 = c66017TyF;
        this.A00 = c66486UJo;
        this.A02 = aaf;
    }

    @Override // X.MQV
    public final void DJD() {
        C66486UJo c66486UJo = this.A00;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        if (c66486UJo.A05) {
            this.A01.A06.DDb();
            c66486UJo.A05 = false;
        }
    }

    @Override // X.MQV
    public final void DQT() {
        InterfaceC71977XDk interfaceC71977XDk = this.A01.A06;
        if (interfaceC71977XDk.CSk()) {
            C66486UJo c66486UJo = this.A00;
            int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
            if (!c66486UJo.A05) {
                c66486UJo.A05 = true;
                interfaceC71977XDk.Dnz(c66486UJo);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r1 == null) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    @Override // X.MQV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DmZ() {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AiI.DmZ():void");
    }
}
