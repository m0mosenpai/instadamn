package X;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

/* loaded from: classes11.dex */
public final class WUH implements InterfaceC71969XDb {
    public final VY1 A00;
    public final C1V7 A01;
    public final String A02;
    public volatile C68895Vdr A03 = new C68895Vdr(null, null);

    public final synchronized InterfaceC71969XDb A00() {
        InterfaceC71969XDb interfaceC71969XDb;
        File file;
        C68895Vdr c68895Vdr = this.A03;
        if (c68895Vdr.A00 == null || (file = c68895Vdr.A01) == null || !file.exists()) {
            if (this.A03.A00 != null && this.A03.A01 != null) {
                AbstractC03440Gx.A02(this.A03.A01);
            }
            File file2 = new File((File) this.A01.get(), this.A02);
            try {
                AbstractC61758RtD.A00(file2);
                file2.getAbsolutePath();
                this.A03 = new C68895Vdr(new WUI(this.A00, file2), file2);
            } catch (C61011Rdf e) {
                throw e;
            }
        }
        interfaceC71969XDb = this.A03.A00;
        interfaceC71969XDb.getClass();
        return interfaceC71969XDb;
    }

    public WUH(VY1 vy1, C1V7 c1v7, String str) {
        this.A00 = vy1;
        this.A01 = c1v7;
        this.A02 = str;
    }

    @Override // X.InterfaceC71969XDb
    public final void AHb() {
        A00().AHb();
    }

    @Override // X.InterfaceC71969XDb
    public final Collection B2M() {
        return A00().B2M();
    }

    @Override // X.InterfaceC71969XDb
    public final void E6q() {
        try {
            A00().E6q();
        } catch (IOException e) {
            C0I2.A01(WUH.class, "purgeUnexpectedResources", e);
        }
    }

    @Override // X.InterfaceC71969XDb
    public final long EEf(C69583Vrm c69583Vrm) {
        return A00().EEf(c69583Vrm);
    }
}
