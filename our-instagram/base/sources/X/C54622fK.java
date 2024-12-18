package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2fK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C54622fK implements InterfaceC54632fL {
    public C54432ex A00;
    public final InterfaceC25681Mz A01;
    public final Map A02;
    public final InterfaceC16820sZ A03;

    public C54622fK(InterfaceC25681Mz interfaceC25681Mz, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC25681Mz, 1);
        this.A01 = interfaceC25681Mz;
        this.A03 = interfaceC16820sZ;
        this.A00 = new C54432ex(EnumC54222eY.A09, null, 0, 0);
        this.A02 = new LinkedHashMap();
    }

    @Override // X.InterfaceC54632fL
    public final void AfE(InterfaceC54232eZ interfaceC54232eZ, C89573yx c89573yx, C54432ex c54432ex) {
        C14360o3.A0B(interfaceC54232eZ, 0);
        if (interfaceC54232eZ != EnumC54222eY.A09 && c54432ex != null) {
            Map map = this.A02;
            map.put(interfaceC54232eZ, c54432ex);
            C54432ex c54432ex2 = this.A00;
            List A0a = AbstractC001800i.A0a(map.values());
            int i = c54432ex2.A02;
            InterfaceC54232eZ interfaceC54232eZ2 = c54432ex2.A03;
            C14360o3.A0B(interfaceC54232eZ2, 0);
            C54432ex c54432ex3 = new C54432ex(interfaceC54232eZ2, A0a, 0, i);
            if (c54432ex3.A00 != this.A00.A00) {
                this.A03.invoke();
            }
            this.A00 = c54432ex3;
            if (interfaceC54232eZ == EnumC54222eY.A0a) {
                this.A01.E4s(new C71883Kl(c54432ex.A01 + c54432ex.A00));
            }
        }
        c89573yx.A00.resumeWith(new C54432ex(interfaceC54232eZ, null, 0, 0));
    }

    @Override // X.InterfaceC54632fL
    public final void AHc(InterfaceC54232eZ interfaceC54232eZ) {
        this.A02.clear();
        this.A00 = new C54432ex(EnumC54222eY.A09, null, 0, 0);
    }
}
