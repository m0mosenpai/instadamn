package X;

import java.io.File;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class Ai4 implements InterfaceC58039PoP {
    public final /* synthetic */ C189788ax A00;
    public final /* synthetic */ C195868lW A01;
    public final /* synthetic */ File A02;

    @Override // X.InterfaceC58039PoP
    public final void DG2(IOException iOException) {
        C14360o3.A0B(iOException, 0);
        C8GB c8gb = this.A00.A0F;
        c8gb.A00.A13.A04(this.A01);
        AbstractC12120kG.A05("MusicPrecaptureController", MSV.A00(770), iOException);
    }

    @Override // X.InterfaceC58039PoP
    public final void Dq9(File file) {
        C14360o3.A0B(file, 0);
        long currentTimeMillis = System.currentTimeMillis();
        C195868lW c195868lW = this.A01;
        int i = c195868lW.A0K;
        int i2 = c195868lW.A08;
        int i3 = c195868lW.A09;
        String str = c195868lW.A0f;
        File file2 = this.A02;
        C195868lW c195868lW2 = new C195868lW(file2, null, str, i, i2, i3, currentTimeMillis, currentTimeMillis, false, false, true);
        c195868lW2.A01 = c195868lW.A01;
        int A01 = ALf.A01(file2.getPath());
        c195868lW2.A07 = A01;
        c195868lW2.A0H = 0;
        c195868lW2.A06 = A01;
        c195868lW2.A19 = true;
        this.A00.A0F.A00.A13.A04(c195868lW2);
    }

    public Ai4(C189788ax c189788ax, C195868lW c195868lW, File file) {
        this.A01 = c195868lW;
        this.A02 = file;
        this.A00 = c189788ax;
    }
}
