package X;

import com.facebook.msys.mci.Database;

/* renamed from: X.5vw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131085vw implements InterfaceC136176Dz {
    public final /* synthetic */ InterfaceC136176Dz A00;
    public final /* synthetic */ AbstractC136036Di A01;

    public C131085vw(InterfaceC136176Dz interfaceC136176Dz, AbstractC136036Di abstractC136036Di) {
        this.A00 = interfaceC136176Dz;
        this.A01 = abstractC136036Di;
    }

    @Override // X.InterfaceC136176Dz
    public final Database.SchemaDeployer BHE() {
        return new C131145w2(this);
    }

    @Override // X.InterfaceC136176Dz
    public final Database.SchemaDeployer BHF() {
        return new C131125w0(this);
    }

    @Override // X.InterfaceC136176Dz
    public final Database.SchemaDeployer BHG() {
        return new C131135w1(this);
    }

    @Override // X.InterfaceC136176Dz
    public final Database.SchemaDeployer BXG() {
        return this.A00.BXG();
    }

    @Override // X.InterfaceC136176Dz
    public final Database.SchemaDeployer Bcc() {
        return this.A00.Bcc();
    }

    @Override // X.InterfaceC136176Dz
    public final Database.VirtualTableModuleRegistrator CGa() {
        return this.A00.CGa();
    }
}
