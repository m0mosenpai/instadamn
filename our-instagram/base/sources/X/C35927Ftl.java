package X;

import java.util.List;

/* renamed from: X.Ftl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35927Ftl implements InterfaceC37146GYh {
    public final /* synthetic */ InterfaceC37146GYh A00;
    public final /* synthetic */ C34688FPz A01;

    @Override // X.InterfaceC37146GYh
    public final void Dqc(ECM ecm) {
        C34688FPz c34688FPz = this.A01;
        boolean z = true;
        c34688FPz.A02 = true;
        String str = ecm.A00;
        if (str == null) {
            str = "";
        }
        c34688FPz.A00 = str;
        List list = ecm.A01;
        if (list == null || list.isEmpty()) {
            z = false;
        }
        c34688FPz.A03 = z;
        c34688FPz.A01 = false;
        this.A00.Dqc(ecm);
    }

    public C35927Ftl(InterfaceC37146GYh interfaceC37146GYh, C34688FPz c34688FPz) {
        this.A01 = c34688FPz;
        this.A00 = interfaceC37146GYh;
    }

    @Override // X.InterfaceC37146GYh
    public final void Dqb() {
        C34688FPz c34688FPz = this.A01;
        c34688FPz.A02 = true;
        c34688FPz.A01 = true;
        this.A00.Dqb();
    }
}
