package X;

import com.facebook.rp.platform.metaai.rsys.pregeneratesdp.PregenerateSdpWrapper;

/* renamed from: X.Ph8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57596Ph8 extends C0YY implements InterfaceC16660sJ {
    public static final C57596Ph8 A00 = new C57596Ph8();

    public C57596Ph8() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        long A0N = AbstractC166987dD.A0N(obj);
        synchronized (PregenerateSdpWrapper.A01) {
            z = PregenerateSdpWrapper.A02;
        }
        int i = 4;
        if (z) {
            i = 5;
        }
        return new PregenerateSdpWrapper(i, A0N);
    }
}
