package X;

import com.facebook.pando.TreeJNI;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.IpC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C42350IpC implements InterfaceC25601Mq {
    public final int A00;
    public final JHF A01;
    public final InterfaceC16660sJ A02;

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x004a: INVOKE (r3 I:java.io.Closeable), (r1 I:java.lang.Throwable) STATIC call: X.20I.A00(java.io.Closeable, java.lang.Throwable):void A[Catch: RuntimeException -> 0x0065, MD:(java.io.Closeable, java.lang.Throwable):void (m), TRY_ENTER] (LINE:74), block:B:31:0x004a */
    @Override // X.InterfaceC25601Mq
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public AbstractC72082XNa then(C3JY c3jy) {
        InterfaceC26481Qd A00;
        InputStream AjT;
        InterfaceC26481Qd A002;
        try {
            int i = this.A00;
            try {
                if (i <= 0) {
                    if (c3jy != null && (A002 = c3jy.A00()) != null) {
                        AjT = A002.AjT();
                        while (true) {
                            byte[] bArr = new byte[Math.min(AjT.available(), 4096)];
                            int read = AjT.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            this.A01.parseByteArray(bArr, read);
                        }
                        AjT.close();
                    }
                    InterfaceC16660sJ interfaceC16660sJ = this.A02;
                    TreeJNI complete = this.A01.complete(C37960Gn2.class);
                    C14360o3.A07(complete);
                    return (AbstractC72082XNa) interfaceC16660sJ.invoke(complete);
                }
                byte[] bArr2 = new byte[i];
                if (c3jy != null && (A00 = c3jy.A00()) != null) {
                    AjT = A00.AjT();
                    for (int read2 = AjT.read(bArr2); read2 != -1; read2 = AjT.read(bArr2)) {
                        this.A01.parseByteArray(bArr2, read2);
                    }
                    AjT.close();
                }
                InterfaceC16660sJ interfaceC16660sJ2 = this.A02;
                TreeJNI complete2 = this.A01.complete(C37960Gn2.class);
                C14360o3.A07(complete2);
                return (AbstractC72082XNa) interfaceC16660sJ2.invoke(complete2);
            } finally {
            }
        } catch (RuntimeException e) {
            throw new IOException(e);
        }
    }

    public C42350IpC(JHF jhf, InterfaceC16660sJ interfaceC16660sJ, int i) {
        this.A02 = interfaceC16660sJ;
        this.A01 = jhf;
        this.A00 = i;
    }
}
