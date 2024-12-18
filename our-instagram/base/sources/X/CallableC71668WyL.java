package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: X.WyL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class CallableC71668WyL implements Callable {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public CallableC71668WyL(int i, int i2, Object obj, Object obj2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.Tyj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.VIr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.Tyj, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        InterfaceC58105PpU interfaceC58105PpU;
        Throwable th;
        Exception exc;
        C1125956n A04;
        String A00;
        int i = this.A00;
        Object obj = this.A03;
        if (i != 0) {
            InterfaceC71998XEm interfaceC71998XEm = (InterfaceC71998XEm) obj;
            interfaceC71998XEm.AJ6(this.A01);
            interfaceC71998XEm.start();
            interfaceC71998XEm.FDy();
            return interfaceC71998XEm;
        }
        MediaComposition mediaComposition = (MediaComposition) obj;
        boolean z = false;
        if (mediaComposition != null && (A04 = mediaComposition.A04(EnumC1125356h.AUDIO, this.A01)) != null) {
            File file = ((C1125756l) new ArrayList(A04.A04).get(0)).A04;
            if (file != null) {
                try {
                    A00 = AbstractC50672MYq.A00(file.getCanonicalPath(), "audio/mp4a-latm", false);
                } catch (IOException e) {
                    ?? obj2 = new Object();
                    C66046Tyj.A00(obj2, e);
                    Throwable th2 = obj2.A01;
                    if (th2 != null) {
                        throw new Exception(th2);
                    }
                }
            } else {
                A00 = "audio/mp4a-latm";
            }
            z = A00.equals("audio/mpeg");
        }
        WG8 wg8 = (WG8) this.A02;
        VK1 vk1 = wg8.A0I;
        C69489VoC c69489VoC = wg8.A08;
        C69377VmN c69377VmN = wg8.A0F;
        ByteBuffer byteBuffer = C70493WZa.A0K;
        X9V x9v = vk1.A03;
        InterfaceC58019Po5 interfaceC58019Po5 = vk1.A02;
        if (z) {
            interfaceC58105PpU = new Object();
        } else {
            interfaceC58105PpU = vk1.A04;
        }
        C70493WZa c70493WZa = new C70493WZa(c69377VmN, interfaceC58019Po5, x9v, interfaceC58105PpU, c69489VoC);
        try {
            c70493WZa.AJ6(this.A01);
            return c70493WZa;
        } finally {
            if (th != null) {
            }
        }
    }
}
