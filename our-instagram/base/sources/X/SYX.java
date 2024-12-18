package X;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes10.dex */
public final class SYX {
    public static final SYX A02 = new SYX();
    public final ConcurrentMap A00 = AbstractC58318PtA.A14();
    public final C62885SVp A01 = new C62885SVp();

    public final InterfaceC65596Tnf A00(Class cls) {
        Integer num;
        C62232S3d c62232S3d;
        SK6 sk6;
        SK1 sk1;
        C62230S3b c62230S3b;
        C63074Sbw c63074Sbw;
        SK1 sk12;
        C62230S3b c62230S3b2;
        Class cls2;
        Charset charset = SVB.A04;
        if (cls != null) {
            ConcurrentMap concurrentMap = this.A00;
            InterfaceC65596Tnf interfaceC65596Tnf = (InterfaceC65596Tnf) concurrentMap.get(cls);
            if (interfaceC65596Tnf == null) {
                C62885SVp c62885SVp = this.A01;
                SK1 sk13 = AbstractC63408Sjh.A02;
                if (!RYn.class.isAssignableFrom(cls) && (cls2 = AbstractC63408Sjh.A03) != null && !cls2.isAssignableFrom(cls)) {
                    throw AbstractC166987dD.A12("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
                }
                C62590SHq CpX = c62885SVp.A00.CpX(cls);
                int i = CpX.A00;
                if ((i & 2) == 2) {
                    if (RYn.class.isAssignableFrom(cls)) {
                        sk12 = AbstractC63408Sjh.A02;
                        c62230S3b2 = S93.A01;
                    } else {
                        sk12 = AbstractC63408Sjh.A00;
                        c62230S3b2 = S93.A00;
                        if (c62230S3b2 == null) {
                            throw AbstractC166987dD.A14("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    interfaceC65596Tnf = new TET(CpX.A01, c62230S3b2, sk12);
                } else {
                    boolean isAssignableFrom = RYn.class.isAssignableFrom(cls);
                    if ((i & 1) == 1) {
                        num = C05F.A00;
                    } else {
                        num = C05F.A01;
                    }
                    boolean A1X = AbstractC167007dF.A1X(num, C05F.A00);
                    if (isAssignableFrom) {
                        c62232S3d = S95.A01;
                        sk6 = SK6.A01;
                        sk1 = AbstractC63408Sjh.A02;
                        if (A1X) {
                            c62230S3b = S93.A01;
                            c63074Sbw = S94.A01;
                        } else {
                            c62230S3b = null;
                            c63074Sbw = S94.A01;
                        }
                    } else {
                        c62232S3d = S95.A00;
                        sk6 = SK6.A00;
                        if (A1X) {
                            sk1 = AbstractC63408Sjh.A00;
                            c62230S3b = S93.A00;
                            if (c62230S3b != null) {
                                c63074Sbw = S94.A00;
                            } else {
                                throw AbstractC166987dD.A14("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            sk1 = AbstractC63408Sjh.A01;
                            c62230S3b = null;
                            c63074Sbw = S94.A00;
                        }
                    }
                    interfaceC65596Tnf = TEU.A0A(c62230S3b, sk6, c63074Sbw, c62232S3d, CpX, sk1);
                }
                InterfaceC65596Tnf interfaceC65596Tnf2 = (InterfaceC65596Tnf) concurrentMap.putIfAbsent(cls, interfaceC65596Tnf);
                if (interfaceC65596Tnf2 != null) {
                    return interfaceC65596Tnf2;
                }
            }
            return interfaceC65596Tnf;
        }
        throw AbstractC166987dD.A15("messageType");
    }
}
