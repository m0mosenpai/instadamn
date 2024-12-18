package X;

import java.nio.charset.Charset;

/* renamed from: X.SVq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62886SVq {
    public static final InterfaceC65526Tlv A01 = new TEW();
    public final InterfaceC65526Tlv A00;

    /* JADX WARN: Type inference failed for: r1v1, types: [X.TEV, X.Tlv, java.lang.Object] */
    public C62886SVq() {
        InterfaceC65526Tlv interfaceC65526Tlv;
        TEX tex = TEX.A00;
        try {
            interfaceC65526Tlv = (InterfaceC65526Tlv) AbstractC58321PtD.A0q("com.google.repack.protobuf.DescriptorMessageInfoFactory");
        } catch (Exception unused) {
            interfaceC65526Tlv = A01;
        }
        InterfaceC65526Tlv[] interfaceC65526TlvArr = {tex, interfaceC65526Tlv};
        ?? obj = new Object();
        obj.A00 = interfaceC65526TlvArr;
        Charset charset = SVC.A04;
        this.A00 = obj;
    }
}
