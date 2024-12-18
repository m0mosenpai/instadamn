package X;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.PuI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58378PuI {
    public static final C58378PuI A02 = new C58378PuI();
    public final ConcurrentMap A00 = AbstractC58318PtA.A14();
    public final InterfaceC65182TfQ A01 = new C58379PuJ();

    public final InterfaceC65588TnS A00(Class cls) {
        Integer num;
        InterfaceC65181TfP interfaceC65181TfP;
        AbstractC58385PuP abstractC58385PuP;
        C62622SJf c62622SJf;
        Rr4 rr4;
        InterfaceC65299ThX interfaceC65299ThX;
        C62622SJf c62622SJf2;
        Rr4 rr42;
        Class cls2;
        Charset charset = AbstractC58376PuG.A03;
        if (cls != null) {
            ConcurrentMap concurrentMap = this.A00;
            InterfaceC65588TnS interfaceC65588TnS = (InterfaceC65588TnS) concurrentMap.get(cls);
            if (interfaceC65588TnS == null) {
                C58379PuJ c58379PuJ = (C58379PuJ) this.A01;
                C62622SJf c62622SJf3 = AbstractC58382PuM.A02;
                if (!AbstractC58374PuE.class.isAssignableFrom(cls) && (cls2 = AbstractC58382PuM.A03) != null && !cls2.isAssignableFrom(cls)) {
                    throw AbstractC166987dD.A12("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                }
                InterfaceC65180TfO CpV = c58379PuJ.A00.CpV(cls);
                C58391PuV c58391PuV = (C58391PuV) CpV;
                int i = c58391PuV.A00;
                if ((i & 2) == 2) {
                    if (AbstractC58374PuE.class.isAssignableFrom(cls)) {
                        c62622SJf2 = AbstractC58382PuM.A02;
                        rr42 = AbstractC58399Pud.A01;
                    } else {
                        c62622SJf2 = AbstractC58382PuM.A00;
                        rr42 = AbstractC58399Pud.A00;
                        if (rr42 == null) {
                            throw AbstractC166987dD.A14("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    interfaceC65588TnS = new C63602SqA(rr42, c58391PuV.A01, c62622SJf2);
                } else {
                    boolean isAssignableFrom = AbstractC58374PuE.class.isAssignableFrom(cls);
                    if ((i & 1) == 1) {
                        num = C05F.A00;
                    } else {
                        num = C05F.A01;
                    }
                    boolean A1X = AbstractC167007dF.A1X(num, C05F.A00);
                    if (isAssignableFrom) {
                        interfaceC65181TfP = AbstractC58390PuU.A01;
                        abstractC58385PuP = AbstractC58385PuP.A01;
                        c62622SJf = AbstractC58382PuM.A02;
                        if (A1X) {
                            rr4 = AbstractC58399Pud.A01;
                            interfaceC65299ThX = AbstractC58398Puc.A01;
                        } else {
                            rr4 = null;
                            interfaceC65299ThX = AbstractC58398Puc.A01;
                        }
                    } else {
                        interfaceC65181TfP = AbstractC58390PuU.A00;
                        abstractC58385PuP = AbstractC58385PuP.A00;
                        if (A1X) {
                            c62622SJf = AbstractC58382PuM.A00;
                            rr4 = AbstractC58399Pud.A00;
                            if (rr4 != null) {
                                interfaceC65299ThX = AbstractC58398Puc.A00;
                            } else {
                                throw AbstractC166987dD.A14("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            c62622SJf = AbstractC58382PuM.A01;
                            rr4 = null;
                            interfaceC65299ThX = AbstractC58398Puc.A00;
                        }
                    }
                    interfaceC65588TnS = C58397Pub.A02(rr4, abstractC58385PuP, interfaceC65299ThX, CpV, interfaceC65181TfP, c62622SJf);
                }
                InterfaceC65588TnS interfaceC65588TnS2 = (InterfaceC65588TnS) concurrentMap.putIfAbsent(cls, interfaceC65588TnS);
                if (interfaceC65588TnS2 != null) {
                    return interfaceC65588TnS2;
                }
            }
            return interfaceC65588TnS;
        }
        throw AbstractC166987dD.A15("messageType");
    }
}
