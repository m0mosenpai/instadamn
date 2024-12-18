package X;

import java.nio.charset.Charset;

/* loaded from: classes10.dex */
public final class T60 implements InterfaceC65256Tgm {
    public static final InterfaceC65515Tlk A01 = new Object();
    public final InterfaceC65515Tlk A00;

    public T60() {
        InterfaceC65515Tlk interfaceC65515Tlk;
        C64247T5w c64247T5w = C64247T5w.A00;
        try {
            interfaceC65515Tlk = (InterfaceC65515Tlk) AbstractC58321PtD.A0q("com.google.protobuf.DescriptorMessageInfoFactory");
        } catch (Exception unused) {
            interfaceC65515Tlk = A01;
        }
        C64246T5v c64246T5v = new C64246T5v(c64247T5w, interfaceC65515Tlk);
        Charset charset = AbstractC62394S9t.A02;
        this.A00 = c64246T5v;
    }
}
