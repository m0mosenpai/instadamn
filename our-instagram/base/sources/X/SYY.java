package X;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes10.dex */
public final class SYY {
    public static final SYY A02 = new SYY();
    public final ConcurrentMap A01 = AbstractC58318PtA.A14();
    public final C62886SVq A00 = new C62886SVq();

    public final InterfaceC65567Tmt A00(Object obj) {
        Integer num;
        C62236S3h c62236S3h;
        S99 s99;
        C62238S3j c62238S3j;
        C62234S3f c62234S3f;
        C62235S3g c62235S3g;
        C62238S3j c62238S3j2;
        C62234S3f c62234S3f2;
        Class cls;
        Class<?> cls2 = obj.getClass();
        Charset charset = SVC.A04;
        if (cls2 != null) {
            ConcurrentMap concurrentMap = this.A01;
            InterfaceC65567Tmt interfaceC65567Tmt = (InterfaceC65567Tmt) concurrentMap.get(cls2);
            if (interfaceC65567Tmt == null) {
                C62886SVq c62886SVq = this.A00;
                C62238S3j c62238S3j3 = SV3.A02;
                if (!RaB.class.isAssignableFrom(cls2) && (cls = SV3.A03) != null && !cls.isAssignableFrom(cls2)) {
                    throw AbstractC166987dD.A12("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
                }
                SHr CpY = c62886SVq.A00.CpY(cls2);
                int i = CpY.A00;
                if ((i & 2) == 2) {
                    if (RaB.class.isAssignableFrom(cls2)) {
                        c62238S3j2 = SV3.A02;
                        c62234S3f2 = S98.A01;
                    } else {
                        c62238S3j2 = SV3.A00;
                        c62234S3f2 = S98.A00;
                        if (c62234S3f2 == null) {
                            throw AbstractC166987dD.A14("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    interfaceC65567Tmt = new C64443TEb(CpY.A01, c62234S3f2, c62238S3j2);
                } else {
                    boolean isAssignableFrom = RaB.class.isAssignableFrom(cls2);
                    if ((i & 1) == 1) {
                        num = C05F.A00;
                    } else {
                        num = C05F.A01;
                    }
                    boolean A1X = AbstractC167007dF.A1X(num, C05F.A00);
                    if (isAssignableFrom) {
                        c62236S3h = S9B.A01;
                        s99 = S99.A01;
                        c62238S3j = SV3.A02;
                        if (A1X) {
                            c62234S3f = S98.A01;
                            c62235S3g = S9A.A01;
                        } else {
                            c62234S3f = null;
                            c62235S3g = S9A.A01;
                        }
                    } else {
                        c62236S3h = S9B.A00;
                        s99 = S99.A00;
                        if (A1X) {
                            c62238S3j = SV3.A00;
                            c62234S3f = S98.A00;
                            if (c62234S3f != null) {
                                c62235S3g = S9A.A00;
                            } else {
                                throw AbstractC166987dD.A14("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            c62238S3j = SV3.A01;
                            c62234S3f = null;
                            c62235S3g = S9A.A00;
                        }
                    }
                    interfaceC65567Tmt = C64444TEc.A00(c62234S3f, s99, c62235S3g, c62236S3h, CpY, c62238S3j);
                }
                InterfaceC65567Tmt interfaceC65567Tmt2 = (InterfaceC65567Tmt) concurrentMap.putIfAbsent(cls2, interfaceC65567Tmt);
                if (interfaceC65567Tmt2 != null) {
                    return interfaceC65567Tmt2;
                }
            }
            return interfaceC65567Tmt;
        }
        throw AbstractC166987dD.A15("messageType");
    }
}
