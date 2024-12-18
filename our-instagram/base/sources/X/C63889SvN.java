package X;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.SvN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63889SvN implements InterfaceC65330TiB {
    public final int A00;
    public final Object A01;

    public C63889SvN(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC65330TiB
    public final /* bridge */ /* synthetic */ Object ALN() {
        switch (this.A00) {
            case 0:
                SFT sft = (SFT) this.A01;
                return new RunnableC64732TRo(sft.A01, sft.A02);
            case 1:
                C62612SIu c62612SIu = (C62612SIu) this.A01;
                ExecutorServiceC64807TUv executorServiceC64807TUv = c62612SIu.A04;
                ExecutorServiceC64807TUv executorServiceC64807TUv2 = c62612SIu.A05;
                ExecutorServiceC64807TUv executorServiceC64807TUv3 = c62612SIu.A06;
                ExecutorServiceC64807TUv executorServiceC64807TUv4 = c62612SIu.A03;
                return new C63891SvP(c62612SIu.A00, c62612SIu.A01, c62612SIu.A02, executorServiceC64807TUv, executorServiceC64807TUv2, executorServiceC64807TUv3, executorServiceC64807TUv4);
            default:
                try {
                    return new C63890SvO(MessageDigest.getInstance("SHA-256"));
                } catch (NoSuchAlgorithmException e) {
                    throw AbstractC58318PtA.A0f(e);
                }
        }
    }
}
