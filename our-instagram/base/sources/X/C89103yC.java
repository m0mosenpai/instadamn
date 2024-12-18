package X;

import com.facebook.flexiblesampling.SamplingPolicyConfig;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.3yC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89103yC {
    public final InterfaceC89033y5 A00;
    public final InterfaceC88913xs A01;
    public final InterfaceC38631qu A02;
    public final SamplingPolicyConfig A03;

    public final void A00(IOException iOException) {
        InterfaceC89033y5 interfaceC89033y5 = this.A00;
        if (interfaceC89033y5.CLC()) {
            interfaceC89033y5.unlock();
        }
        this.A01.DG2(iOException);
    }

    public final void A01(InputStream inputStream, int i) {
        InterfaceC89033y5 interfaceC89033y5;
        try {
            try {
            } catch (IOException e) {
                this.A01.DG2(e);
                interfaceC89033y5 = this.A00;
            }
            if (i == 200) {
                SamplingPolicyConfig samplingPolicyConfig = this.A03;
                if (samplingPolicyConfig != null) {
                    samplingPolicyConfig.FBo(this.A02, inputStream);
                }
                interfaceC89033y5 = this.A00;
                interfaceC89033y5.CnF();
                this.A01.onSuccess();
                if (interfaceC89033y5.CLC()) {
                    interfaceC89033y5.unlock();
                }
                inputStream.close();
                return;
            }
            throw new IOException(AnonymousClass001.A0O("Unexpected HTTP code ", i));
        } catch (Throwable th) {
            InterfaceC89033y5 interfaceC89033y52 = this.A00;
            if (interfaceC89033y52.CLC()) {
                interfaceC89033y52.unlock();
            }
            inputStream.close();
            throw th;
        }
    }

    public C89103yC(InterfaceC89033y5 interfaceC89033y5, InterfaceC88913xs interfaceC88913xs, InterfaceC38631qu interfaceC38631qu, SamplingPolicyConfig samplingPolicyConfig) {
        this.A00 = interfaceC89033y5;
        this.A03 = samplingPolicyConfig;
        this.A02 = interfaceC38631qu;
        this.A01 = interfaceC88913xs;
    }
}
