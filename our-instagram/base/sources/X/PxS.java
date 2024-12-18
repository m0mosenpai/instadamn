package X;

import java.util.Iterator;

/* loaded from: classes10.dex */
public final class PxS {
    public final C58553PxR A00;

    public final synchronized C58549PxM A01() {
        return C58549PxM.A01((PxJ) this.A00.A02());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void A02(int keyId) {
        int i = 0;
        while (true) {
            C58553PxR c58553PxR = this.A00;
            if (i < ((PxJ) c58553PxR.A00).key_.size()) {
                PxI pxI = (PxI) ((PxJ) c58553PxR.A00).key_.get(i);
                if (pxI.keyId_ == keyId) {
                    if (pxI.A0G().equals(EnumC61237Riz.ENABLED)) {
                        ((PxJ) PxQ.A00(c58553PxR)).primaryKeyId_ = keyId;
                    } else {
                        throw AbstractC58320PtC.A1A("cannot set key as primary because it's not enabled: ", keyId);
                    }
                } else {
                    i++;
                }
            } else {
                throw AbstractC58320PtC.A1A("key not found: ", keyId);
            }
        }
    }

    public final synchronized void A03(C58561Pxd keyTemplate) {
        T91 t91;
        PxG CsS;
        C58553PxR c58553PxR;
        AbstractC61590RqE abstractC61590RqE = keyTemplate.A00;
        if (abstractC61590RqE instanceof RTA) {
            t91 = ((RTA) abstractC61590RqE).A00;
        } else {
            t91 = (T91) C58550PxN.A01.A08(abstractC61590RqE);
        }
        RVD rvd = t91.A00;
        synchronized (C63113SdH.class) {
            try {
                C63190Ses c63190Ses = C63190Ses.A02;
                InterfaceC65428Tjz A00 = C63190Ses.A00(c63190Ses, rvd.typeUrl_);
                if (AbstractC166987dD.A1a(c63190Ses.A01.get(rvd.typeUrl_))) {
                    CsS = A00.CsS(rvd.value_);
                } else {
                    throw AbstractC58318PtA.A0x(AnonymousClass001.A0R("newKey-operation not permitted for key type ", rvd.typeUrl_));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        PxH A0G = rvd.A0G();
        try {
            int A002 = AbstractC58538Px6.A00();
            loop0: while (true) {
                c58553PxR = this.A00;
                Iterator A13 = AbstractC31174DnI.A13(((PxJ) c58553PxR.A00).key_);
                while (A13.hasNext()) {
                    if (((PxI) A13.next()).keyId_ == A002) {
                        break;
                    }
                }
                try {
                    break loop0;
                } catch (Throwable th2) {
                    throw th2;
                }
                A002 = AbstractC58538Px6.A00();
            }
            if (A0G != PxH.UNKNOWN_PREFIX) {
                RUO ruo = (RUO) ((PxQ) PxI.DEFAULT_INSTANCE.A0F(C05F.A0Y));
                PxI pxI = (PxI) PxQ.A00(ruo);
                CsS.getClass();
                pxI.keyData_ = CsS;
                pxI.bitField0_ |= 1;
                ((PxI) PxQ.A00(ruo)).keyId_ = A002;
                ((PxI) PxQ.A00(ruo)).status_ = 1;
                ((PxI) PxQ.A00(ruo)).outputPrefixType_ = A0G.A01();
                c58553PxR.A05((PxI) ruo.A02());
            } else {
                throw AbstractC58318PtA.A0x("unknown output prefix type");
            }
        } catch (Throwable th3) {
        }
    }

    public static PxS A00(C58549PxM val) {
        PxJ pxJ = val.A01;
        PxQ pxQ = (PxQ) pxJ.A0F(C05F.A0Y);
        if (!pxQ.A01.equals(pxJ)) {
            AbstractC58533Px1 A00 = PxQ.A00(pxQ);
            AbstractC58320PtC.A0d(A00).CpL(A00, pxJ);
        }
        return new PxS((C58553PxR) pxQ);
    }

    public PxS(C58553PxR val) {
        this.A00 = val;
    }
}
