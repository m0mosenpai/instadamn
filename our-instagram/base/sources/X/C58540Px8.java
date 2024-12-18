package X;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.Px8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58540Px8 {
    public static final C58540Px8 A02 = new C58540Px8();
    public final ConcurrentMap A00 = AbstractC58318PtA.A14();
    public final C62883SVn A01 = new C62883SVn();

    public final InterfaceC65595Tne A00(Class messageType) {
        Integer num;
        S3U s3u;
        SK5 sk5;
        SK0 sk0;
        S3S s3s;
        SST sst;
        SK0 sk02;
        S3S s3s2;
        Class cls;
        Charset charset = AbstractC62398S9x.A04;
        if (messageType != null) {
            ConcurrentMap concurrentMap = this.A00;
            InterfaceC65595Tne interfaceC65595Tne = (InterfaceC65595Tne) concurrentMap.get(messageType);
            if (interfaceC65595Tne == null) {
                C62883SVn c62883SVn = this.A01;
                SK0 sk03 = PxW.A01;
                if (!AbstractC58533Px1.class.isAssignableFrom(messageType) && (cls = PxW.A02) != null && !cls.isAssignableFrom(messageType)) {
                    throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
                }
                C62587SHm CpW = c62883SVn.A00.CpW(messageType);
                int i = CpW.A00;
                if ((i & 2) == 2) {
                    if (AbstractC58533Px1.class.isAssignableFrom(messageType)) {
                        sk02 = PxW.A01;
                        s3s2 = AbstractC62373S8x.A01;
                    } else {
                        sk02 = PxW.A00;
                        s3s2 = AbstractC62373S8x.A00;
                        if (s3s2 == null) {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    interfaceC65595Tne = new T9D(CpW.A01, s3s2, sk02);
                } else {
                    boolean isAssignableFrom = AbstractC58533Px1.class.isAssignableFrom(messageType);
                    if ((i & 1) != 0) {
                        num = C05F.A00;
                    } else {
                        num = C05F.A01;
                    }
                    int intValue = num.intValue();
                    boolean z = true;
                    if (intValue == 1) {
                        z = false;
                    }
                    if (isAssignableFrom) {
                        s3u = AbstractC62375S8z.A01;
                        sk5 = SK5.A01;
                        sk0 = PxW.A01;
                        if (z) {
                            s3s = AbstractC62373S8x.A01;
                            sst = AbstractC62374S8y.A01;
                        } else {
                            s3s = null;
                            sst = AbstractC62374S8y.A01;
                        }
                    } else {
                        s3u = AbstractC62375S8z.A00;
                        sk5 = SK5.A00;
                        sk0 = PxW.A00;
                        if (z) {
                            s3s = AbstractC62373S8x.A00;
                            if (s3s != null) {
                                sst = AbstractC62374S8y.A00;
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            s3s = null;
                            sst = AbstractC62374S8y.A00;
                        }
                    }
                    interfaceC65595Tne = C58543PxB.A02(s3s, sk5, sst, s3u, CpW, sk0);
                }
                InterfaceC65595Tne interfaceC65595Tne2 = (InterfaceC65595Tne) concurrentMap.putIfAbsent(messageType, interfaceC65595Tne);
                if (interfaceC65595Tne2 != null) {
                    return interfaceC65595Tne2;
                }
            }
            return interfaceC65595Tne;
        }
        throw new NullPointerException("messageType");
    }
}
