package X;

import java.util.Iterator;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.W6u, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70142W6u {
    public static final C71708WzZ A00(String str, InterfaceC16660sJ interfaceC16660sJ, C3RG c3rg, SerialDescriptor[] serialDescriptorArr) {
        C14360o3.A0B(str, 0);
        if (!AbstractC001900j.A0T(str)) {
            if (!c3rg.equals(C3TE.A00)) {
                C69634Vsb c69634Vsb = new C69634Vsb(str);
                interfaceC16660sJ.invoke(c69634Vsb);
                return new C71708WzZ(str, AbstractC009903n.A0J(serialDescriptorArr), c69634Vsb, c3rg, c69634Vsb.A03.size());
            }
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        throw new IllegalArgumentException("Blank serial names are prohibited");
    }

    public static final C71708WzZ A01(String str, InterfaceC16660sJ interfaceC16660sJ, SerialDescriptor[] serialDescriptorArr) {
        if (!AbstractC001900j.A0T(str)) {
            C69634Vsb c69634Vsb = new C69634Vsb(str);
            interfaceC16660sJ.invoke(c69634Vsb);
            return new C71708WzZ(str, AbstractC009903n.A0J(serialDescriptorArr), c69634Vsb, C3TE.A00, c69634Vsb.A03.size());
        }
        throw new IllegalArgumentException("Blank serial names are prohibited");
    }

    public static final C3RH A02(String str, C3RF c3rf) {
        if (!AbstractC001900j.A0T(str)) {
            Iterator A12 = AbstractC43593JPy.A12(AbstractC192298fX.A00);
            while (A12.hasNext()) {
                String A01 = AbstractC13230m9.A01(((C0YZ) ((InterfaceC16510rw) A12.next())).A00);
                C14360o3.A0A(A01);
                String A00 = AbstractC192298fX.A00(A01);
                if (str.equalsIgnoreCase(AnonymousClass001.A0R(AbstractC111324zv.A00(2650), A00)) || str.equalsIgnoreCase(A00)) {
                    throw new IllegalArgumentException(AbstractC16490ru.A0p(AnonymousClass001.A11("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exist ", AbstractC192298fX.A00(A00), "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            ")));
                }
            }
            return new C3RH(str, c3rf);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited");
    }
}
