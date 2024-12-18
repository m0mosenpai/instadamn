package X;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.SZu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62974SZu {
    public long A00;
    public long A01;
    public Map A02;
    public boolean A03;
    public final long A04;
    public final SKI A05;
    public final SLU A06;
    public final String A07;
    public final String A08;
    public final Executor A09;
    public final Object A0A;
    public final SecureRandom A0B;

    public C62974SZu(SKI ski, String str, String str2, Executor executor, long j) {
        AbstractC167007dF.A1G(str, 2, executor);
        this.A05 = ski;
        this.A07 = str;
        this.A04 = j;
        this.A08 = str2;
        this.A09 = executor;
        this.A00 = -1L;
        SecureRandom secureRandom = new SecureRandom();
        this.A0B = secureRandom;
        this.A0A = AbstractC58318PtA.A0b();
        this.A01 = secureRandom.nextLong();
        SKI ski2 = this.A05;
        C09530e4 A00 = ski2.A00(EnumC61108RfO.A02);
        Object obj = A00.A00;
        Object obj2 = A00.A01;
        C09530e4 A002 = ski2.A00(EnumC61108RfO.A04);
        Object obj3 = A002.A00;
        Object obj4 = A002.A01;
        C09530e4 A003 = ski2.A00(EnumC61108RfO.A03);
        C09530e4 A1L = AbstractC166987dD.A1L(new C51u(obj, obj3, A003.A00), new C51u(obj2, obj4, A003.A01));
        this.A06 = new SLU((C51u) A1L.A00, (C51u) A1L.A01);
        executor.execute(new RunnableC64553TJq(this));
    }

    public static final void A00(C62974SZu c62974SZu) {
        int A00;
        EnumC61237Riz enumC61237Riz;
        synchronized (c62974SZu.A0A) {
            if (!c62974SZu.A03) {
                SUU.A00 = 824185612;
                C006802i c006802i = SUU.A01;
                c006802i.markerStart(824185612);
                SUU.A00("register_hybrid_config_start");
                AbstractC62875SUz.A00();
                SUU.A00("register_hybrid_config_end");
                SUU.A00("generate_keyset_start");
                SKI ski = c62974SZu.A05;
                C14360o3.A0B(ski, 0);
                LinkedHashMap A1I = AbstractC166987dD.A1I();
                SUU.A00("construct_keyset_handle_start");
                for (EnumC61108RfO enumC61108RfO : EnumC61108RfO.values()) {
                    byte[] A01 = AbstractC58562Pxe.A01((String) ski.A00(enumC61108RfO).A00);
                    SGZ sgz = new SGZ();
                    AbstractC61590RqE abstractC61590RqE = AbstractC58560Pxc.A00("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM").A00;
                    if (abstractC61590RqE != null) {
                        C14360o3.A0C(abstractC61590RqE, "null cannot be cast to non-null type com.google.crypto.tink.hybrid.HpkeParameters");
                        C60794RTf A002 = C60794RTf.A00((C60789RTa) abstractC61590RqE, C58526Pwu.A00(A01), 1);
                        SIW siw = new SIW(A002);
                        Integer A04 = A002.A04();
                        if (A04 != null) {
                            siw.A01 = new C63131Sdc(A04.intValue());
                        }
                        SGZ sgz2 = siw.A02;
                        if (sgz2 != null) {
                            Iterator it = sgz2.A02.iterator();
                            while (it.hasNext()) {
                                ((SIW) it.next()).A03 = false;
                            }
                        }
                        siw.A03 = true;
                        if (siw.A02 == null) {
                            List<SIW> list = sgz.A02;
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                ((SIW) it2.next()).A03 = false;
                            }
                            siw.A02 = sgz;
                            list.add(siw);
                            Integer num = null;
                            if (!sgz.A01) {
                                sgz.A01 = true;
                                PxJ pxJ = PxJ.DEFAULT_INSTANCE;
                                Integer num2 = C05F.A0Y;
                                C58553PxR c58553PxR = (C58553PxR) ((PxQ) pxJ.A0F(num2));
                                ArrayList A0q = AbstractC25230BEn.A0q(list);
                                for (int i = 0; i < AbstractC25226BEj.A05(list); i++) {
                                    C63131Sdc c63131Sdc = ((SIW) list.get(i)).A01;
                                    C63131Sdc c63131Sdc2 = C63131Sdc.A01;
                                    if (c63131Sdc == c63131Sdc2 && ((SIW) list.get(i + 1)).A01 != c63131Sdc2) {
                                        throw AbstractC58318PtA.A0x("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                                    }
                                }
                                HashSet A1H = AbstractC166987dD.A1H();
                                for (SIW siw2 : list) {
                                    SXw sXw = siw2.A00;
                                    C63131Sdc c63131Sdc3 = siw2.A01;
                                    if (c63131Sdc3 != null) {
                                        if (c63131Sdc3 != C63131Sdc.A01) {
                                            A00 = c63131Sdc3.A00;
                                        } else {
                                            do {
                                                A00 = AbstractC58538Px6.A00();
                                            } while (A1H.contains(Integer.valueOf(A00)));
                                        }
                                        Integer valueOf = Integer.valueOf(A00);
                                        if (!A1H.contains(valueOf)) {
                                            A1H.add(valueOf);
                                            AbstractC61589RqD abstractC61589RqD = siw2.A04;
                                            C58554PxT c58554PxT = new C58554PxT(abstractC61589RqD, sXw);
                                            C58551PxO c58551PxO = (C58551PxO) C58550PxN.A01.A07(abstractC61589RqD);
                                            Integer num3 = c58551PxO.A04;
                                            if (num3 == null || num3.intValue() == A00) {
                                                SXw sXw2 = SXw.A03;
                                                if (sXw2.equals(sXw)) {
                                                    enumC61237Riz = EnumC61237Riz.ENABLED;
                                                } else if (SXw.A02.equals(sXw)) {
                                                    enumC61237Riz = EnumC61237Riz.DISABLED;
                                                } else if (SXw.A01.equals(sXw)) {
                                                    enumC61237Riz = EnumC61237Riz.DESTROYED;
                                                } else {
                                                    throw AbstractC166987dD.A14("Unknown key status");
                                                }
                                                RUO ruo = (RUO) ((PxQ) PxI.DEFAULT_INSTANCE.A0F(num2));
                                                RUY ruy = (RUY) ((PxQ) PxG.DEFAULT_INSTANCE.A0F(num2));
                                                ruy.A07(c58551PxO.A05);
                                                ruy.A06(c58551PxO.A02);
                                                ruy.A05(c58551PxO.A00);
                                                PxI pxI = (PxI) PxQ.A00(ruo);
                                                PxG pxG = (PxG) ruy.A02();
                                                pxG.getClass();
                                                pxI.keyData_ = pxG;
                                                pxI.bitField0_ |= 1;
                                                ((PxI) PxQ.A00(ruo)).status_ = enumC61237Riz.A00;
                                                ((PxI) PxQ.A00(ruo)).keyId_ = A00;
                                                ((PxI) PxQ.A00(ruo)).outputPrefixType_ = c58551PxO.A01.A01();
                                                c58553PxR.A05((PxI) ruo.A02());
                                                if (siw2.A03) {
                                                    if (num == null) {
                                                        num = valueOf;
                                                        if (sXw != sXw2) {
                                                            throw AbstractC58318PtA.A0x("Primary key is not enabled");
                                                        }
                                                    } else {
                                                        throw AbstractC58318PtA.A0x("Two primaries were set");
                                                    }
                                                }
                                                A0q.add(c58554PxT);
                                            } else {
                                                throw AbstractC58318PtA.A0x("Wrong ID set for key with ID requirement");
                                            }
                                        } else {
                                            throw AbstractC58318PtA.A0x(AnonymousClass001.A0c("Id ", " is used twice in the keyset", A00));
                                        }
                                    } else {
                                        throw AbstractC58318PtA.A0x("No ID was set (with withFixedId or withRandomId)");
                                    }
                                }
                                if (num != null) {
                                    ((PxJ) PxQ.A00(c58553PxR)).primaryKeyId_ = num.intValue();
                                    PxJ pxJ2 = (PxJ) c58553PxR.A02();
                                    C58549PxM.A02(pxJ2);
                                    A1I.put(enumC61108RfO, new C58549PxM(sgz.A00, pxJ2, A0q));
                                } else {
                                    throw AbstractC58318PtA.A0x("No primary was set");
                                }
                            } else {
                                throw AbstractC58318PtA.A0x("KeysetHandle.Builder#build must only be called once");
                            }
                        } else {
                            throw AbstractC166987dD.A14("Entry has already been added to a KeysetHandle.Builder");
                        }
                    } else {
                        try {
                            C58550PxN.A01.A08(abstractC61590RqE);
                            throw C00O.createAndThrow();
                        } catch (GeneralSecurityException e) {
                            throw new RuntimeException(AbstractC167017dG.A0n(abstractC61590RqE, "Parsing parameters failed in getProto(). You probably want to call some Tink register function for ", AbstractC166987dD.A1C()), e);
                        }
                    }
                }
                SUU.A00("construct_keyset_handle_end");
                c62974SZu.A02 = A1I;
                SUU.A00("generate_keyset_end");
                c006802i.markerEnd(SUU.A00, (short) 2);
                c62974SZu.A03 = true;
            }
        }
    }

    public final long A01() {
        if (this.A00 == -1) {
            this.A00 = Instant.now().getEpochSecond();
        }
        return Instant.now().getEpochSecond() - this.A00;
    }

    public final C51u A02(Integer num) {
        ArrayList A00 = this.A06.A00(num, false, true);
        ArrayList A0q = AbstractC167017dG.A0q(A00);
        Iterator it = A00.iterator();
        while (it.hasNext()) {
            AbstractC166997dE.A1S(it.next(), A0q);
        }
        if (A0q.size() != 3) {
            return new C51u("", "", "");
        }
        return new C51u(A0q.get(0), A0q.get(1), A0q.get(2));
    }
}
