package X;

import java.util.Map;

/* renamed from: X.2bf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52982bf {
    public final InterfaceC52932ba A00;
    public final C018307d A01;
    public final AbstractC52972be A02;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.2ba] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.2be, X.2bg] */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.2be] */
    /* JADX WARN: Type inference failed for: r2v7, types: [X.2bZ] */
    public final AbstractC52922bZ A00(String str, InterfaceC16510rw interfaceC16510rw) {
        AbstractC52922bZ abstractC52922bZ;
        AbstractC52922bZ abstractC52922bZ2;
        C14360o3.A0B(str, 1);
        Map map = this.A01.A00;
        AbstractC52922bZ abstractC52922bZ3 = (AbstractC52922bZ) map.get(str);
        if (AbstractC13230m9.A02(((C0YZ) interfaceC16510rw).A00, abstractC52922bZ3)) {
            Object obj = this.A00;
            if (obj instanceof AbstractC61592rM) {
                C14360o3.A0A(abstractC52922bZ3);
                ((AbstractC61592rM) obj).A01(abstractC52922bZ3);
            }
            C14360o3.A0C(abstractC52922bZ3, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            abstractC52922bZ2 = abstractC52922bZ3;
        } else {
            ?? c52992bg = new C52992bg(this.A02);
            c52992bg.A01(C52952bc.A00, str);
            ?? r1 = this.A00;
            try {
                try {
                    c52992bg = r1.create(interfaceC16510rw, c52992bg);
                    abstractC52922bZ = c52992bg;
                } catch (AbstractMethodError unused) {
                    abstractC52922bZ = r1.create(AbstractC53012bi.A00(interfaceC16510rw));
                }
            } catch (AbstractMethodError unused2) {
                abstractC52922bZ = r1.create(AbstractC53012bi.A00(interfaceC16510rw), c52992bg);
            }
            C14360o3.A0B(abstractC52922bZ, 1);
            AbstractC52922bZ abstractC52922bZ4 = (AbstractC52922bZ) map.put(str, abstractC52922bZ);
            abstractC52922bZ2 = abstractC52922bZ;
            if (abstractC52922bZ4 != null) {
                abstractC52922bZ4.clear$lifecycle_viewmodel_release();
                return abstractC52922bZ;
            }
        }
        return abstractC52922bZ2;
    }

    public C52982bf(InterfaceC52932ba interfaceC52932ba, C018307d c018307d, AbstractC52972be abstractC52972be) {
        this.A01 = c018307d;
        this.A00 = interfaceC52932ba;
        this.A02 = abstractC52972be;
    }
}
