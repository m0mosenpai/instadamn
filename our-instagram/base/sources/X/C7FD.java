package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.7FD, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7FD extends C0YY implements InterfaceC16820sZ {
    public static final C7FD A00 = new C7FD();

    public C7FD() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        return new C7FF() { // from class: X.7FE
            public final ConcurrentHashMap A02 = new ConcurrentHashMap();
            public final ConcurrentHashMap A03 = new ConcurrentHashMap();
            public final ConcurrentHashMap A01 = new ConcurrentHashMap();
            public final ConcurrentHashMap A00 = new ConcurrentHashMap();

            @Override // X.C7FF
            public final void ELx(C183978Ee c183978Ee, String str, int i) {
                C14360o3.A0B(str, 2);
                this.A03.put(AbstractC46923Kp4.A00(c183978Ee), str);
                this.A02.put(Integer.valueOf(i), c183978Ee);
            }

            @Override // X.C7FF
            public final void AHe() {
                this.A02.clear();
                this.A03.clear();
            }

            @Override // X.C7FF
            public final String BcE(int i) {
                C183978Ee c183978Ee = (C183978Ee) this.A02.get(Integer.valueOf(i));
                if (c183978Ee != null) {
                    return BcF(AbstractC46923Kp4.A00(c183978Ee));
                }
                return null;
            }

            @Override // X.C7FF
            public final String BcF(C51740MtP c51740MtP) {
                return (String) this.A03.get(c51740MtP);
            }

            @Override // X.C7FF
            public final C183978Ee Bcn(int i) {
                return (C183978Ee) this.A02.get(Integer.valueOf(i));
            }
        };
    }
}
