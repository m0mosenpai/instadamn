package X;

import java.util.List;

/* renamed from: X.B8v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C25099B8v extends C0YY implements InterfaceC16660sJ {
    public static final C25099B8v A00 = new C25099B8v();

    public C25099B8v() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AKS aks = (AKS) obj;
        C14360o3.A0B(aks, 0);
        String str = aks.A01;
        List list = AKI.A01;
        boolean z = true;
        if (!C14360o3.A0K(str, list.get(1)) && !C14360o3.A0K(str, list.get(2))) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
