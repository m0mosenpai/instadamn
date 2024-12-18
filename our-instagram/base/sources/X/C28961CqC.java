package X;

/* renamed from: X.CqC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28961CqC implements C6FI {
    public final /* synthetic */ C51762Yz A00;
    public final /* synthetic */ BUI A01;

    public C28961CqC(C51762Yz c51762Yz, BUI bui) {
        this.A01 = bui;
        this.A00 = c51762Yz;
    }

    @Override // X.C6FI
    public final /* bridge */ /* synthetic */ void ASi(InterfaceC30791DgS interfaceC30791DgS) {
        String str;
        BUI bui = this.A01;
        synchronized (bui) {
            bui.A00.add(interfaceC30791DgS);
        }
        C51762Yz c51762Yz = this.A00;
        DR0 dr0 = DR0.A00;
        C14360o3.A0B(dr0, 0);
        C2VK c2vk = c51762Yz.A02;
        String str2 = c51762Yz.A04;
        int i = c51762Yz.A00;
        boolean z = c51762Yz.A05;
        if (!c2vk.AG4(str2, dr0, i, z)) {
            C124535kB c124535kB = new C124535kB(c51762Yz, dr0);
            AbstractC50812Vc abstractC50812Vc = c51762Yz.A01;
            if (abstractC50812Vc == null || (str = abstractC50812Vc.A0H()) == null) {
                str = "hook";
            }
            c2vk.FBC(c124535kB, str2, str, z);
        }
    }
}
