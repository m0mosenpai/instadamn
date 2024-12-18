package X;

import com.google.crypto.tink.BinaryKeysetReader;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.PxM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58549PxM {
    public final C62988SaC A00;
    public final PxJ A01;
    public final List A02;

    public static final C58549PxM A00(InterfaceC65518Tln reader, BinaryKeysetReader masterKey) {
        byte[] bArr = new byte[0];
        try {
            InputStream inputStream = masterKey.A00;
            AbstractC58533Px1 A05 = AbstractC58533Px1.A05(new C58557PxZ(inputStream), C58534Px2.A00(), C58558Pxa.DEFAULT_INSTANCE);
            AbstractC58533Px1.A09(A05);
            C58558Pxa c58558Pxa = (C58558Pxa) A05;
            inputStream.close();
            if (c58558Pxa != null) {
                AbstractC58536Px4 abstractC58536Px4 = c58558Pxa.encryptedKeyset_;
                if (abstractC58536Px4.A02() != 0) {
                    try {
                        PxJ pxJ = (PxJ) AbstractC58533Px1.A06(C58534Px2.A00(), PxJ.DEFAULT_INSTANCE, reader.AOR(abstractC58536Px4.A04(), bArr));
                        A02(pxJ);
                        return A01(pxJ);
                    } catch (C61032Re1 unused) {
                        throw AbstractC58318PtA.A0x("invalid keyset, corrupted key material");
                    }
                }
            }
            throw AbstractC58318PtA.A0x("empty keyset");
        } catch (Throwable th) {
            masterKey.A00.close();
            throw th;
        }
    }

    public static void A02(PxJ keyset) {
        if (keyset != null && keyset.key_.size() > 0) {
        } else {
            throw AbstractC58318PtA.A0x("empty keyset");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object A03(Class targetClassObject) {
        Class cls;
        Map map;
        try {
            map = ((C62504SEg) C62987SaB.A01.A00.get()).A01;
        } catch (GeneralSecurityException unused) {
            cls = null;
        }
        if (map.containsKey(targetClassObject)) {
            cls = ((InterfaceC65549TmS) map.get(targetClassObject)).BI2();
            if (cls != null) {
                PxJ pxJ = this.A01;
                int i = pxJ.primaryKeyId_;
                int i2 = 0;
                boolean z = false;
                boolean z2 = true;
                for (PxI pxI : pxJ.key_) {
                    EnumC61237Riz A0G = pxI.A0G();
                    if (A0G == EnumC61237Riz.ENABLED) {
                        boolean z3 = true;
                        if ((pxI.bitField0_ & 1) == 0) {
                            z3 = false;
                        }
                        if (z3) {
                            PxH A00 = PxH.A00(pxI.outputPrefixType_);
                            if (A00 == null) {
                                A00 = PxH.UNRECOGNIZED;
                            }
                            if (A00 != PxH.UNKNOWN_PREFIX) {
                                if (A0G != EnumC61237Riz.UNKNOWN_STATUS) {
                                    if (pxI.keyId_ == i) {
                                        if (!z) {
                                            z = true;
                                        } else {
                                            throw AbstractC58318PtA.A0x("keyset contains multiple primary keys");
                                        }
                                    }
                                    PxG pxG = pxI.keyData_;
                                    if (pxG == null) {
                                        pxG = PxG.DEFAULT_INSTANCE;
                                    }
                                    if (pxG.A0G() != Rj2.ASYMMETRIC_PUBLIC) {
                                        z2 = false;
                                    }
                                    i2++;
                                } else {
                                    throw AbstractC58319PtB.A0z("key %d has unknown status", AbstractC25228BEl.A1Y(pxI.keyId_));
                                }
                            } else {
                                throw AbstractC58319PtB.A0z("key %d has unknown prefix", AbstractC25228BEl.A1Y(pxI.keyId_));
                            }
                        } else {
                            throw AbstractC58319PtB.A0z("key %d has no key data", AbstractC25228BEl.A1Y(pxI.keyId_));
                        }
                    }
                }
                if (i2 != 0) {
                    if (!z && !z2) {
                        throw AbstractC58318PtA.A0x("keyset doesn't contain a valid primary key");
                    }
                    SJ4 sj4 = null;
                    HashMap A1G = AbstractC166987dD.A1G();
                    ArrayList A1E = AbstractC166987dD.A1E();
                    C62988SaC c62988SaC = this.A00;
                    int i3 = 0;
                    while (true) {
                        List list = this.A02;
                        if (i3 < list.size()) {
                            PxI pxI2 = (PxI) pxJ.key_.get(i3);
                            EnumC61237Riz A0G2 = pxI2.A0G();
                            EnumC61237Riz enumC61237Riz = EnumC61237Riz.ENABLED;
                            if (A0G2.equals(enumC61237Riz)) {
                                C58554PxT c58554PxT = (C58554PxT) list.get(i3);
                                if (c58554PxT != null) {
                                    AbstractC61589RqD abstractC61589RqD = c58554PxT.A00;
                                    try {
                                        Object A002 = C62987SaB.A01.A00(abstractC61589RqD, cls);
                                        int i4 = pxI2.keyId_;
                                        int i5 = pxJ.primaryKeyId_;
                                        EnumC61237Riz A0G3 = pxI2.A0G();
                                        if (i4 == i5) {
                                            if (A0G3 == enumC61237Riz) {
                                                C58526Pwu A003 = C58526Pwu.A00(AbstractC62851STy.A00(pxI2));
                                                EnumC61237Riz A0G4 = pxI2.A0G();
                                                PxH A004 = PxH.A00(pxI2.outputPrefixType_);
                                                if (A004 == null) {
                                                    A004 = PxH.UNRECOGNIZED;
                                                }
                                                int i6 = pxI2.keyId_;
                                                PxG pxG2 = pxI2.keyData_;
                                                if (pxG2 == null) {
                                                    pxG2 = PxG.DEFAULT_INSTANCE;
                                                }
                                                SJ4 sj42 = new SJ4(abstractC61589RqD, A0G4, A004, A003, A002, pxG2.typeUrl_, i6);
                                                C62916SWx.A00(sj42, A1E, A1G);
                                                if (sj4 == null) {
                                                    sj4 = sj42;
                                                } else {
                                                    throw AbstractC166987dD.A14("you cannot set two primary primitives");
                                                }
                                            } else {
                                                throw AbstractC58318PtA.A0x("only ENABLED key is allowed");
                                            }
                                        } else if (A0G3 == enumC61237Riz) {
                                            C58526Pwu A005 = C58526Pwu.A00(AbstractC62851STy.A00(pxI2));
                                            EnumC61237Riz A0G5 = pxI2.A0G();
                                            PxH A006 = PxH.A00(pxI2.outputPrefixType_);
                                            if (A006 == null) {
                                                A006 = PxH.UNRECOGNIZED;
                                            }
                                            int i7 = pxI2.keyId_;
                                            PxG pxG3 = pxI2.keyData_;
                                            if (pxG3 == null) {
                                                pxG3 = PxG.DEFAULT_INSTANCE;
                                            }
                                            C62916SWx.A00(new SJ4(abstractC61589RqD, A0G5, A006, A005, A002, pxG3.typeUrl_, i7), A1E, A1G);
                                        } else {
                                            throw AbstractC58318PtA.A0x("only ENABLED key is allowed");
                                        }
                                    } catch (GeneralSecurityException e) {
                                        StringBuilder A1C = AbstractC166987dD.A1C();
                                        A1C.append("Unable to get primitive ");
                                        A1C.append(cls);
                                        A1C.append(" for key of type ");
                                        PxG pxG4 = pxI2.keyData_;
                                        if (pxG4 == null) {
                                            pxG4 = PxG.DEFAULT_INSTANCE;
                                        }
                                        A1C.append(pxG4.typeUrl_);
                                        throw new GeneralSecurityException(AbstractC166997dE.A0x(", see https://developers.google.com/tink/faq/registration_errors", A1C), e);
                                    }
                                } else {
                                    PxG pxG5 = pxI2.keyData_;
                                    if (pxG5 == null) {
                                        pxG5 = PxG.DEFAULT_INSTANCE;
                                    }
                                    throw AbstractC58318PtA.A0x(AnonymousClass001.A08(i3, "Key parsing of key with index ", " and type_url ", pxG5.typeUrl_, " failed, unable to get primitive"));
                                }
                            }
                            i3++;
                        } else {
                            C62916SWx c62916SWx = new C62916SWx(sj4, c62988SaC, cls, A1E, A1G);
                            Map map2 = ((C62504SEg) C62987SaB.A01.A00.get()).A01;
                            if (map2.containsKey(targetClassObject)) {
                                InterfaceC65549TmS interfaceC65549TmS = (InterfaceC65549TmS) map2.get(targetClassObject);
                                Class cls2 = c62916SWx.A02;
                                Class BI2 = interfaceC65549TmS.BI2();
                                if (cls2.equals(BI2) && BI2.equals(cls2)) {
                                    return interfaceC65549TmS.FEE(c62916SWx);
                                }
                                throw AbstractC58318PtA.A0x("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
                            }
                            throw AbstractC58320PtC.A19(targetClassObject, "No wrapper found for ", AbstractC166987dD.A1C());
                        }
                    }
                } else {
                    throw AbstractC58318PtA.A0x("keyset must contain at least one ENABLED key");
                }
            } else {
                throw AbstractC58318PtA.A0x(AbstractC58319PtB.A0t(targetClassObject, "No wrapper found for "));
            }
        } else {
            throw AbstractC58321PtD.A11(targetClassObject, "No input primitive class for ", AbstractC166987dD.A1C());
        }
    }

    public final String toString() {
        return SU0.A00(this.A01).toString();
    }

    public C58549PxM(PxJ keyset, List entries) {
        this.A01 = keyset;
        this.A02 = entries;
        this.A00 = C62988SaC.A01;
    }

    public static final C58549PxM A01(PxJ keyset) {
        Integer valueOf;
        Throwable runtimeException;
        AbstractC61589RqD A05;
        int ordinal;
        SXw sXw;
        A02(keyset);
        ArrayList A0q = AbstractC25230BEn.A0q(keyset.key_);
        for (PxI pxI : keyset.key_) {
            int i = pxI.keyId_;
            try {
                PxH A00 = PxH.A00(pxI.outputPrefixType_);
                if (A00 == null) {
                    A00 = PxH.UNRECOGNIZED;
                }
                if (A00 == PxH.RAW) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(i);
                }
                try {
                    PxG pxG = pxI.keyData_;
                    PxG pxG2 = pxG;
                    if (pxG == null) {
                        pxG = PxG.DEFAULT_INSTANCE;
                    }
                    String str = pxG.typeUrl_;
                    PxG pxG3 = pxG2;
                    if (pxG2 == null) {
                        pxG3 = PxG.DEFAULT_INSTANCE;
                    }
                    AbstractC58536Px4 abstractC58536Px4 = pxG3.value_;
                    if (pxG2 == null) {
                        pxG2 = PxG.DEFAULT_INSTANCE;
                    }
                    C58551PxO A002 = C58551PxO.A00(pxG2.A0G(), A00, abstractC58536Px4, valueOf, str);
                    C58550PxN c58550PxN = C58550PxN.A01;
                    C62586SHl c62586SHl = (C62586SHl) c58550PxN.A00.get();
                    if (!c62586SHl.A00.containsKey(new C58528Pww(A002.A03, A002.getClass()))) {
                        A05 = new RT5(A002);
                    } else {
                        A05 = c58550PxN.A05(A002);
                    }
                    ordinal = pxI.A0G().ordinal();
                } catch (GeneralSecurityException e) {
                    runtimeException = new RuntimeException("Creating a protokey serialization failed", e);
                }
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            sXw = SXw.A01;
                        } else {
                            runtimeException = new GeneralSecurityException("Unknown key status");
                            throw runtimeException;
                            break;
                        }
                    } else {
                        sXw = SXw.A02;
                    }
                } else {
                    sXw = SXw.A03;
                }
                A0q.add(new C58554PxT(A05, sXw));
            } catch (GeneralSecurityException unused) {
                A0q.add(null);
            }
        }
        return new C58549PxM(keyset, Collections.unmodifiableList(A0q));
    }

    public C58549PxM(C62988SaC keyset, PxJ entries, List annotations) {
        this.A01 = entries;
        this.A02 = annotations;
        this.A00 = keyset;
    }
}
