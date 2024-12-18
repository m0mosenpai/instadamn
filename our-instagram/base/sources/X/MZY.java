package X;

import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes9.dex */
public final class MZY implements InterfaceC133315zy {
    public final /* synthetic */ XP9 A00;
    public final /* synthetic */ C43658JSq A01;
    public final /* synthetic */ C6VU A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ InterfaceC16820sZ A04;

    public MZY(XP9 xp9, C43658JSq c43658JSq, C6VU c6vu, String str, InterfaceC16820sZ interfaceC16820sZ) {
        this.A04 = interfaceC16820sZ;
        this.A02 = c6vu;
        this.A03 = str;
        this.A01 = c43658JSq;
        this.A00 = xp9;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.common.util.concurrent.ListenableFuture, X.1Ke, java.lang.Object] */
    @Override // X.InterfaceC133315zy
    public final /* bridge */ /* synthetic */ ListenableFuture ABq(Object obj) {
        BVA bva = (BVA) obj;
        try {
            if (bva != null) {
                InterfaceC16820sZ interfaceC16820sZ = this.A04;
                if (interfaceC16820sZ != null) {
                    interfaceC16820sZ.invoke();
                }
                return C2OD.A02(C6VU.A00(this.A00, bva));
            }
            throw new C53401Njq("renderableModel is null", null);
        } catch (C53401Njq e) {
            ?? obj2 = new Object();
            obj2.setException(e);
            return obj2;
        }
    }
}
