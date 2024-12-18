package X;

import com.facebook.pando.TreeJNI;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.In4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42218In4 implements InterfaceC23761Ei {
    public final int A00;
    public final C1EY A01;
    public final AnonymousClass506 A02;
    public final InterfaceC16660sJ A03;

    public /* synthetic */ C42218In4(AnonymousClass506 anonymousClass506, InterfaceC16660sJ interfaceC16660sJ, int i) {
        C25611Mr c25611Mr = new C25611Mr(null);
        AbstractC167017dG.A1P(interfaceC16660sJ, anonymousClass506);
        this.A03 = interfaceC16660sJ;
        this.A02 = anonymousClass506;
        this.A00 = i;
        this.A01 = c25611Mr;
    }

    @Override // X.InterfaceC23761Ei
    public final /* bridge */ /* synthetic */ InterfaceC40801un AWy(C3JY c3jy, InputStream inputStream) {
        C23781El A01;
        C14360o3.A0B(inputStream, 1);
        JHF createApiFrameworkParser = this.A02.createApiFrameworkParser(false);
        try {
            int i = this.A00;
            if (i <= 0) {
                while (true) {
                    byte[] bArr = new byte[Math.min(inputStream.available(), 4096)];
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    createApiFrameworkParser.parseByteArray(bArr, read);
                }
            } else {
                byte[] bArr2 = new byte[i];
                int read2 = inputStream.read(bArr2);
                while (read2 != -1) {
                    createApiFrameworkParser.parseByteArray(bArr2, read2);
                    read2 = inputStream.read(bArr2);
                }
            }
            InterfaceC16660sJ interfaceC16660sJ = this.A03;
            TreeJNI complete = createApiFrameworkParser.complete(C37960Gn2.class);
            C14360o3.A07(complete);
            C3DC c3dc = (AbstractC72082XNa) interfaceC16660sJ.invoke(complete);
            if ((c3dc instanceof InterfaceC55612h1) && (A01 = c3jy.A01(AbstractC111324zv.A00(1866))) != null) {
                String str = A01.A01;
                C14360o3.A06(str);
                ((InterfaceC55612h1) c3dc).EQi(Long.parseLong(str));
            }
            return c3dc;
        } catch (RuntimeException e) {
            throw new IOException(e);
        }
    }

    @Override // X.InterfaceC23761Ei
    public final void onStart() {
    }

    @Override // X.InterfaceC23761Ei
    public final void onFinish() {
        this.A01.onFinish();
    }
}
