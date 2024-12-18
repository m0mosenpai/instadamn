package X;

import java.nio.charset.Charset;

/* loaded from: classes10.dex */
public abstract class SU0 {
    public static final Charset A00 = AbstractC58318PtA.A0u();

    public static C58565Pxh A00(PxJ keyset) {
        C58565Pxh c58565Pxh = C58565Pxh.DEFAULT_INSTANCE;
        Integer num = C05F.A0Y;
        PxQ pxQ = (PxQ) c58565Pxh.A0F(num);
        ((C58565Pxh) PxQ.A00(pxQ)).primaryKeyId_ = keyset.primaryKeyId_;
        for (PxI pxI : keyset.key_) {
            PxQ pxQ2 = (PxQ) C58566Pxi.DEFAULT_INSTANCE.A0F(num);
            PxG pxG = pxI.keyData_;
            if (pxG == null) {
                pxG = PxG.DEFAULT_INSTANCE;
            }
            String str = pxG.typeUrl_;
            C58566Pxi c58566Pxi = (C58566Pxi) PxQ.A00(pxQ2);
            str.getClass();
            c58566Pxi.typeUrl_ = str;
            EnumC61237Riz A0G = pxI.A0G();
            C58566Pxi c58566Pxi2 = (C58566Pxi) PxQ.A00(pxQ2);
            if (A0G != EnumC61237Riz.UNRECOGNIZED) {
                c58566Pxi2.status_ = A0G.A00;
                PxH A002 = PxH.A00(pxI.outputPrefixType_);
                if (A002 == null) {
                    A002 = PxH.UNRECOGNIZED;
                }
                ((C58566Pxi) PxQ.A00(pxQ2)).outputPrefixType_ = A002.A01();
                ((C58566Pxi) PxQ.A00(pxQ2)).keyId_ = pxI.keyId_;
                AbstractC58533Px1 A02 = pxQ2.A02();
                C58565Pxh c58565Pxh2 = (C58565Pxh) PxQ.A00(pxQ);
                A02.getClass();
                InterfaceC65690TsC interfaceC65690TsC = c58565Pxh2.keyInfo_;
                if (!((AbstractC58537Px5) interfaceC65690TsC).A00) {
                    interfaceC65690TsC = interfaceC65690TsC.Cq4(AbstractC58320PtC.A01(interfaceC65690TsC));
                    c58565Pxh2.keyInfo_ = interfaceC65690TsC;
                }
                interfaceC65690TsC.add(A02);
            } else {
                throw AbstractC166987dD.A12("Can't get the number of an unknown enum value.");
            }
        }
        return (C58565Pxh) pxQ.A02();
    }
}
