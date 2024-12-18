package X;

import com.facebook.msys.mci.Database;
import com.facebook.systrace.Systrace;

/* renamed from: X.6Ds, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC136106Ds {
    public static final InterfaceC09390do A04 = AbstractC09440dt.A01(C136116Dt.A00);
    public static final InterfaceC09390do A02 = AbstractC09440dt.A01(C136126Du.A00);
    public static final InterfaceC09390do A01 = AbstractC09440dt.A01(C136136Dv.A00);
    public static final InterfaceC09390do A03 = AbstractC09440dt.A01(C136146Dw.A00);
    public static final InterfaceC09390do A05 = AbstractC09440dt.A01(C136156Dx.A00);
    public static final InterfaceC136176Dz A00 = new InterfaceC136176Dz() { // from class: X.6Dy
        @Override // X.InterfaceC136176Dz
        public final Database.SchemaDeployer BHE() {
            return (Database.SchemaDeployer) AbstractC136106Ds.A01.getValue();
        }

        @Override // X.InterfaceC136176Dz
        public final Database.SchemaDeployer BHF() {
            return (Database.SchemaDeployer) AbstractC136106Ds.A02.getValue();
        }

        @Override // X.InterfaceC136176Dz
        public final Database.SchemaDeployer BHG() {
            return (Database.SchemaDeployer) AbstractC136106Ds.A03.getValue();
        }

        @Override // X.InterfaceC136176Dz
        public final Database.SchemaDeployer BXG() {
            if (Systrace.A0E(1L)) {
                C0fO.A01("getNonVirtualTablePersistentSchemaDeployer", 1532518241);
            }
            AYY ayy = AYY.A00;
            if (Systrace.A0E(1L)) {
                C0fO.A00(1816255984);
            }
            return ayy;
        }

        @Override // X.InterfaceC136176Dz
        public final Database.SchemaDeployer Bcc() {
            return (Database.SchemaDeployer) AbstractC136106Ds.A04.getValue();
        }

        @Override // X.InterfaceC136176Dz
        public final Database.VirtualTableModuleRegistrator CGa() {
            return (Database.VirtualTableModuleRegistrator) AbstractC136106Ds.A05.getValue();
        }
    };
}
