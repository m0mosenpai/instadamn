package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.react.modules.base.IgReactQEModule;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.PxN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58550PxN {
    public static final C58550PxN A01;
    public final AtomicReference A00;

    public final synchronized void A09(C62500SEc parser) {
        AtomicReference atomicReference = this.A00;
        C62586SHl c62586SHl = (C62586SHl) atomicReference.get();
        HashMap A10 = AbstractC58318PtA.A10(c62586SHl.A01);
        HashMap A102 = AbstractC58318PtA.A10(c62586SHl.A00);
        HashMap A103 = AbstractC58318PtA.A10(c62586SHl.A03);
        HashMap A104 = AbstractC58318PtA.A10(c62586SHl.A02);
        C58528Pww c58528Pww = new C58528Pww(parser.A00, C58551PxO.class);
        if (A102.containsKey(c58528Pww)) {
            Object obj = A102.get(c58528Pww);
            if (!obj.equals(parser) || !parser.equals(obj)) {
                throw AbstractC58320PtC.A19(c58528Pww, "Attempt to register non-equal parser for already existing object of type: ", AbstractC166987dD.A1C());
            }
        } else {
            A102.put(c58528Pww, parser);
        }
        atomicReference.set(new C62586SHl(A102, A10, A104, A103));
    }

    public final synchronized void A0A(C62501SEd serializer) {
        AtomicReference atomicReference = this.A00;
        C62586SHl c62586SHl = (C62586SHl) atomicReference.get();
        HashMap A10 = AbstractC58318PtA.A10(c62586SHl.A01);
        HashMap A102 = AbstractC58318PtA.A10(c62586SHl.A00);
        HashMap A103 = AbstractC58318PtA.A10(c62586SHl.A03);
        HashMap A104 = AbstractC58318PtA.A10(c62586SHl.A02);
        C62741SOi c62741SOi = new C62741SOi(serializer.A00, C58551PxO.class);
        if (A10.containsKey(c62741SOi)) {
            Object obj = A10.get(c62741SOi);
            if (!obj.equals(serializer) || !serializer.equals(obj)) {
                throw AbstractC58320PtC.A19(c62741SOi, "Attempt to register non-equal serializer for already existing object of type: ", AbstractC166987dD.A1C());
            }
        } else {
            A10.put(c62741SOi, serializer);
        }
        atomicReference.set(new C62586SHl(A102, A10, A104, A103));
    }

    public final synchronized void A0B(C62502SEe parser) {
        AtomicReference atomicReference = this.A00;
        C62586SHl c62586SHl = (C62586SHl) atomicReference.get();
        HashMap A10 = AbstractC58318PtA.A10(c62586SHl.A01);
        HashMap A102 = AbstractC58318PtA.A10(c62586SHl.A00);
        HashMap A103 = AbstractC58318PtA.A10(c62586SHl.A03);
        HashMap A104 = AbstractC58318PtA.A10(c62586SHl.A02);
        C58528Pww c58528Pww = new C58528Pww(parser.A00, T91.class);
        if (A104.containsKey(c58528Pww)) {
            Object obj = A104.get(c58528Pww);
            if (!obj.equals(parser) || !parser.equals(obj)) {
                throw AbstractC58320PtC.A19(c58528Pww, "Attempt to register non-equal parser for already existing object of type: ", AbstractC166987dD.A1C());
            }
        } else {
            A104.put(c58528Pww, parser);
        }
        atomicReference.set(new C62586SHl(A102, A10, A104, A103));
    }

    public final synchronized void A0C(C62503SEf serializer) {
        AtomicReference atomicReference = this.A00;
        C62586SHl c62586SHl = (C62586SHl) atomicReference.get();
        HashMap A10 = AbstractC58318PtA.A10(c62586SHl.A01);
        HashMap A102 = AbstractC58318PtA.A10(c62586SHl.A00);
        HashMap A103 = AbstractC58318PtA.A10(c62586SHl.A03);
        HashMap A104 = AbstractC58318PtA.A10(c62586SHl.A02);
        C62741SOi c62741SOi = new C62741SOi(serializer.A00, T91.class);
        if (A103.containsKey(c62741SOi)) {
            Object obj = A103.get(c62741SOi);
            if (!obj.equals(serializer) || !serializer.equals(obj)) {
                throw AbstractC58320PtC.A19(c62741SOi, "Attempt to register non-equal serializer for already existing object of type: ", AbstractC166987dD.A1C());
            }
        } else {
            A103.put(c62741SOi, serializer);
        }
        atomicReference.set(new C62586SHl(A102, A10, A104, A103));
    }

    static {
        try {
            C58550PxN c58550PxN = new C58550PxN();
            c58550PxN.A0A(new C62501SEd(new C58363Pu3(13), RT5.class));
            A01 = c58550PxN;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static C58535Px3 A01(PxQ pxQ, C58552PxP c58552PxP) {
        byte[] A012 = c58552PxP.A00.A01();
        C58535Px3 A013 = AbstractC58536Px4.A01(A012, 0, A012.length);
        pxQ.A04();
        return A013;
    }

    public static GeneralSecurityException A03() {
        return new GeneralSecurityException("Only version 0 keys are accepted");
    }

    public final AbstractC61589RqD A05(InterfaceC65430Tk1 interfaceC65430Tk1) {
        SXt sXt;
        C62930SXx c62930SXx;
        C62931SXy c62931SXy;
        SXz sXz;
        SY0 sy0;
        SY1 sy1;
        SY2 sy2;
        C62586SHl c62586SHl = (C62586SHl) this.A00.get();
        C58528Pww c58528Pww = new C58528Pww(interfaceC65430Tk1.BYW(), interfaceC65430Tk1.getClass());
        Map map = c62586SHl.A00;
        if (map.containsKey(c58528Pww)) {
            int i = ((C58367Pu7) ((C62500SEc) map.get(c58528Pww)).A01).A00;
            C58551PxO c58551PxO = (C58551PxO) interfaceC65430Tk1;
            String str = c58551PxO.A05;
            switch (i) {
                case 0:
                    if (str.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                        try {
                            C60837RUw c60837RUw = (C60837RUw) AbstractC58533Px1.A04(c58551PxO.A02, C58534Px2.A00(), C60837RUw.DEFAULT_INSTANCE);
                            if (c60837RUw.version_ == 0) {
                                C60819RUe c60819RUe = c60837RUw.params_;
                                if (c60819RUe == null) {
                                    c60819RUe = C60819RUe.DEFAULT_INSTANCE;
                                }
                                String str2 = c60819RUe.keyUri_;
                                PxH pxH = c58551PxO.A01;
                                int ordinal = pxH.ordinal();
                                if (ordinal != 1) {
                                    if (ordinal == 3) {
                                        sXt = SXt.A01;
                                    } else {
                                        throw AbstractC58320PtC.A18(pxH);
                                    }
                                } else {
                                    sXt = SXt.A02;
                                }
                                return RTF.A00(new RTN(sXt, str2), c58551PxO.A04);
                            }
                            throw AbstractC58320PtC.A19(c60837RUw, "KmsAeadKey are only accepted with version 0, got ", AbstractC166987dD.A1C());
                        } catch (C61032Re1 e) {
                            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e);
                        }
                    }
                    throw AbstractC166987dD.A12("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
                case 1:
                    if (str.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                        try {
                            C60838RUx c60838RUx = (C60838RUx) AbstractC58533Px1.A04(c58551PxO.A02, C58534Px2.A00(), C60838RUx.DEFAULT_INSTANCE);
                            if (c60838RUx.version_ == 0) {
                                C60839RUy c60839RUy = c60838RUx.params_;
                                if (c60839RUy == null) {
                                    c60839RUy = C60839RUy.DEFAULT_INSTANCE;
                                }
                                return RTG.A00(AbstractC63118SdM.A00(c60839RUy, c58551PxO.A01), c58551PxO.A04);
                            }
                            throw AbstractC58320PtC.A19(c60838RUx, "KmsEnvelopeAeadKeys are only accepted with version 0, got ", AbstractC166987dD.A1C());
                        } catch (C61032Re1 e2) {
                            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e2);
                        }
                    }
                    throw AbstractC166987dD.A12("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
                case 2:
                    if (str.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                        try {
                            RV1 rv1 = (RV1) AbstractC58533Px1.A04(c58551PxO.A02, C58534Px2.A00(), RV1.DEFAULT_INSTANCE);
                            if (rv1.version_ == 0) {
                                RV2 rv2 = rv1.aesCtrKey_;
                                RV2 rv22 = rv2;
                                if (rv2 == null) {
                                    rv2 = RV2.DEFAULT_INSTANCE;
                                }
                                if (rv2.version_ == 0) {
                                    RV6 rv6 = rv1.hmacKey_;
                                    RV6 rv62 = rv6;
                                    if (rv6 == null) {
                                        rv6 = RV6.DEFAULT_INSTANCE;
                                    }
                                    if (rv6.version_ == 0) {
                                        RV2 rv23 = rv22;
                                        if (rv22 == null) {
                                            rv23 = RV2.DEFAULT_INSTANCE;
                                        }
                                        int A02 = rv23.keyValue_.A02();
                                        if (A02 == 16 || A02 == 24 || A02 == 32) {
                                            Integer valueOf = Integer.valueOf(A02);
                                            RV6 rv63 = rv62;
                                            if (rv62 == null) {
                                                rv63 = RV6.DEFAULT_INSTANCE;
                                            }
                                            int A022 = rv63.keyValue_.A02();
                                            if (A022 >= 16) {
                                                Integer valueOf2 = Integer.valueOf(A022);
                                                if (rv22 == null) {
                                                    rv22 = RV2.DEFAULT_INSTANCE;
                                                }
                                                C60817RUc c60817RUc = rv22.params_;
                                                if (c60817RUc == null) {
                                                    c60817RUc = C60817RUc.DEFAULT_INSTANCE;
                                                }
                                                int i2 = c60817RUc.ivSize_;
                                                if (i2 >= 12 && i2 <= 16) {
                                                    Integer valueOf3 = Integer.valueOf(i2);
                                                    RV6 rv64 = rv62;
                                                    if (rv62 == null) {
                                                        rv64 = RV6.DEFAULT_INSTANCE;
                                                    }
                                                    C60830RUp c60830RUp = rv64.params_;
                                                    if (c60830RUp == null) {
                                                        c60830RUp = C60830RUp.DEFAULT_INSTANCE;
                                                    }
                                                    int i3 = c60830RUp.tagSize_;
                                                    if (i3 >= 10) {
                                                        Integer valueOf4 = Integer.valueOf(i3);
                                                        if (rv62 == null) {
                                                            rv62 = RV6.DEFAULT_INSTANCE;
                                                        }
                                                        C60830RUp c60830RUp2 = rv62.params_;
                                                        if (c60830RUp2 == null) {
                                                            c60830RUp2 = C60830RUp.DEFAULT_INSTANCE;
                                                        }
                                                        Rj3 A00 = Rj3.A00(c60830RUp2.hash_);
                                                        if (A00 == null) {
                                                            A00 = Rj3.UNRECOGNIZED;
                                                        }
                                                        SYA A002 = AbstractC63267SgR.A00(A00);
                                                        PxH pxH2 = c58551PxO.A01;
                                                        int ordinal2 = pxH2.ordinal();
                                                        if (ordinal2 != 1) {
                                                            if (ordinal2 != 4 && ordinal2 != 2) {
                                                                if (ordinal2 == 3) {
                                                                    c62930SXx = C62930SXx.A02;
                                                                } else {
                                                                    throw AbstractC58320PtC.A18(pxH2);
                                                                }
                                                            } else {
                                                                c62930SXx = C62930SXx.A01;
                                                            }
                                                        } else {
                                                            c62930SXx = C62930SXx.A03;
                                                        }
                                                        RTQ A012 = SSR.A01(A002, c62930SXx, valueOf, valueOf2, valueOf3, valueOf4);
                                                        RV2 rv24 = rv1.aesCtrKey_;
                                                        if (rv24 == null) {
                                                            rv24 = RV2.DEFAULT_INSTANCE;
                                                        }
                                                        C58552PxP A023 = A02(rv24.keyValue_);
                                                        RV6 rv65 = rv1.hmacKey_;
                                                        if (rv65 == null) {
                                                            rv65 = RV6.DEFAULT_INSTANCE;
                                                        }
                                                        C58552PxP A024 = A02(rv65.keyValue_);
                                                        Integer num = c58551PxO.A04;
                                                        if (A012.A00 == A023.A00.A00.length) {
                                                            if (A012.A01 == A024.A00.A00.length) {
                                                                if (A012.A00()) {
                                                                    if (num == null) {
                                                                        throw AbstractC58318PtA.A0v();
                                                                    }
                                                                } else if (num != null) {
                                                                    throw AbstractC58318PtA.A0x("Cannot create key with ID requirement with parameters without ID requirement");
                                                                }
                                                                return new RTE(A012, S3C.A00(A012, num), A023, A024, num);
                                                            }
                                                            throw AbstractC58318PtA.A0x("HMAC key size mismatch");
                                                        }
                                                        throw AbstractC58318PtA.A0x("AES key size mismatch");
                                                    }
                                                    throw AbstractC58319PtB.A0z("Invalid tag size in bytes %d; must be at least 10 bytes", new Object[]{Integer.valueOf(i3)});
                                                }
                                                throw AbstractC58319PtB.A0z("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", new Object[]{Integer.valueOf(i2)});
                                            }
                                            throw AbstractC58319PtB.A10("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", new Object[]{Integer.valueOf(A022)});
                                        }
                                        throw AbstractC58319PtB.A10("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(A02)});
                                    }
                                    throw AbstractC58318PtA.A0x("Only version 0 keys inner HMAC keys are accepted");
                                }
                                throw AbstractC58318PtA.A0x("Only version 0 keys inner AES CTR keys are accepted");
                            }
                            throw A03();
                        } catch (C61032Re1 unused) {
                            throw AbstractC58318PtA.A0x("Parsing AesCtrHmacAeadKey failed");
                        }
                    }
                    throw AbstractC166987dD.A12("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
                case 3:
                    if (str.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                        try {
                            RV3 rv3 = (RV3) AbstractC58533Px1.A04(c58551PxO.A02, C58534Px2.A00(), RV3.DEFAULT_INSTANCE);
                            if (rv3.version_ == 0) {
                                int A025 = rv3.keyValue_.A02();
                                if (A025 == 16 || A025 == 24 || A025 == 32) {
                                    Integer valueOf5 = Integer.valueOf(A025);
                                    C60818RUd c60818RUd = rv3.params_;
                                    if (c60818RUd == null) {
                                        c60818RUd = C60818RUd.DEFAULT_INSTANCE;
                                    }
                                    int i4 = c60818RUd.ivSize_;
                                    if (i4 == 12 || i4 == 16) {
                                        Integer valueOf6 = Integer.valueOf(i4);
                                        PxH pxH3 = c58551PxO.A01;
                                        int ordinal3 = pxH3.ordinal();
                                        if (ordinal3 != 1) {
                                            if (ordinal3 != 4 && ordinal3 != 2) {
                                                if (ordinal3 == 3) {
                                                    c62931SXy = C62931SXy.A02;
                                                } else {
                                                    throw AbstractC58320PtC.A18(pxH3);
                                                }
                                            } else {
                                                c62931SXy = C62931SXy.A01;
                                            }
                                        } else {
                                            c62931SXy = C62931SXy.A03;
                                        }
                                        RTO A003 = S3E.A00(c62931SXy, valueOf6, valueOf5);
                                        C58552PxP A026 = A02(rv3.keyValue_);
                                        Integer num2 = c58551PxO.A04;
                                        if (A003.A01 == A026.A00.A00.length) {
                                            if (A003.A00()) {
                                                if (num2 == null) {
                                                    throw AbstractC58318PtA.A0v();
                                                }
                                            } else if (num2 != null) {
                                                throw AbstractC58318PtA.A0x("Cannot create key with ID requirement with parameters without ID requirement");
                                            }
                                            return new RTB(A003, S3D.A00(A003, num2), A026, num2);
                                        }
                                        throw AbstractC58318PtA.A0w();
                                    }
                                    throw AbstractC58319PtB.A0z("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", new Object[]{Integer.valueOf(i4)});
                                }
                                throw AbstractC58319PtB.A10("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(A025)});
                            }
                            throw A03();
                        } catch (C61032Re1 unused2) {
                            throw AbstractC58318PtA.A0x("Parsing AesEaxcKey failed");
                        }
                    }
                    throw AbstractC166987dD.A12("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
                case 4:
                    if (str.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                        try {
                            C58559Pxb c58559Pxb = (C58559Pxb) AbstractC58533Px1.A04(c58551PxO.A02, C58534Px2.A00(), C58559Pxb.DEFAULT_INSTANCE);
                            if (c58559Pxb.version_ == 0) {
                                int A027 = c58559Pxb.keyValue_.A02();
                                if (A027 == 16 || A027 == 24 || A027 == 32) {
                                    Integer valueOf7 = Integer.valueOf(A027);
                                    PxH pxH4 = c58551PxO.A01;
                                    int ordinal4 = pxH4.ordinal();
                                    if (ordinal4 != 1) {
                                        if (ordinal4 != 4 && ordinal4 != 2) {
                                            if (ordinal4 == 3) {
                                                sXz = SXz.A02;
                                            } else {
                                                throw AbstractC58320PtC.A18(pxH4);
                                            }
                                        } else {
                                            sXz = SXz.A01;
                                        }
                                    } else {
                                        sXz = SXz.A03;
                                    }
                                    if (valueOf7 != null) {
                                        C58529Pwx c58529Pwx = new C58529Pwx(sXz, valueOf7.intValue());
                                        C58552PxP A028 = A02(c58559Pxb.keyValue_);
                                        Integer num3 = c58551PxO.A04;
                                        if (c58529Pwx.A01 == A028.A00.A00.length) {
                                            if (c58529Pwx.A00()) {
                                                if (num3 == null) {
                                                    throw AbstractC58318PtA.A0v();
                                                }
                                            } else if (num3 != null) {
                                                throw AbstractC58318PtA.A0x("Cannot create key with ID requirement with parameters without ID requirement");
                                            }
                                            return new RTC(c58529Pwx, S3F.A00(c58529Pwx, num3), A028, num3);
                                        }
                                        throw AbstractC58318PtA.A0w();
                                    }
                                    throw AbstractC58318PtA.A0x("Key size is not set");
                                }
                                throw AbstractC58319PtB.A10("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(A027)});
                            }
                            throw A03();
                        } catch (C61032Re1 unused3) {
                            throw AbstractC58318PtA.A0x("Parsing AesGcmKey failed");
                        }
                    }
                    throw AbstractC166987dD.A12("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
                case 5:
                    if (str.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                        try {
                            C60825RUk c60825RUk = (C60825RUk) AbstractC58533Px1.A04(c58551PxO.A02, C58534Px2.A00(), C60825RUk.DEFAULT_INSTANCE);
                            if (c60825RUk.version_ == 0) {
                                int A029 = c60825RUk.keyValue_.A02();
                                if (A029 == 16 || A029 == 32) {
                                    Integer valueOf8 = Integer.valueOf(A029);
                                    PxH pxH5 = c58551PxO.A01;
                                    int ordinal5 = pxH5.ordinal();
                                    if (ordinal5 != 1) {
                                        if (ordinal5 != 4 && ordinal5 != 2) {
                                            if (ordinal5 == 3) {
                                                sy0 = SY0.A02;
                                            } else {
                                                throw AbstractC58320PtC.A18(pxH5);
                                            }
                                        } else {
                                            sy0 = SY0.A01;
                                        }
                                    } else {
                                        sy0 = SY0.A03;
                                    }
                                    if (valueOf8 != null) {
                                        RTM rtm = new RTM(sy0, valueOf8.intValue());
                                        C58552PxP A0210 = A02(c60825RUk.keyValue_);
                                        Integer num4 = c58551PxO.A04;
                                        if (rtm.A00 == A0210.A00.A00.length) {
                                            if (rtm.A00()) {
                                                if (num4 == null) {
                                                    throw AbstractC58318PtA.A0v();
                                                }
                                            } else if (num4 != null) {
                                                throw AbstractC58318PtA.A0x("Cannot create key with ID requirement with parameters without ID requirement");
                                            }
                                            return new RTD(rtm, S3G.A00(rtm, num4), A0210, num4);
                                        }
                                        throw AbstractC58318PtA.A0w();
                                    }
                                    throw AbstractC58318PtA.A0x("Key size is not set");
                                }
                                throw AbstractC58319PtB.A10("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(A029)});
                            }
                            throw A03();
                        } catch (C61032Re1 unused4) {
                            throw AbstractC58318PtA.A0x("Parsing AesGcmSivKey failed");
                        }
                    }
                    throw AbstractC166987dD.A12("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
                case 6:
                    if (str.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                        try {
                            C60829RUo c60829RUo = (C60829RUo) AbstractC58533Px1.A04(c58551PxO.A02, C58534Px2.A00(), C60829RUo.DEFAULT_INSTANCE);
                            if (c60829RUo.version_ == 0) {
                                PxH pxH6 = c58551PxO.A01;
                                int ordinal6 = pxH6.ordinal();
                                if (ordinal6 != 1) {
                                    if (ordinal6 != 4 && ordinal6 != 2) {
                                        if (ordinal6 != 3) {
                                            throw AbstractC58320PtC.A18(pxH6);
                                        }
                                        sy1 = SY1.A02;
                                    } else {
                                        sy1 = SY1.A01;
                                    }
                                } else {
                                    sy1 = SY1.A03;
                                }
                                return RTH.A00(sy1, A02(c60829RUo.keyValue_), c58551PxO.A04);
                            }
                            throw A03();
                        } catch (C61032Re1 unused5) {
                            throw AbstractC58318PtA.A0x("Parsing ChaCha20Poly1305Key failed");
                        }
                    }
                    throw AbstractC166987dD.A12("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
                case 7:
                    if (str.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                        try {
                            C60832RUr c60832RUr = (C60832RUr) AbstractC58533Px1.A04(c58551PxO.A02, C58534Px2.A00(), C60832RUr.DEFAULT_INSTANCE);
                            if (c60832RUr.version_ == 0) {
                                PxH pxH7 = c58551PxO.A01;
                                int ordinal7 = pxH7.ordinal();
                                if (ordinal7 != 1) {
                                    if (ordinal7 != 4 && ordinal7 != 2) {
                                        if (ordinal7 != 3) {
                                            throw AbstractC58320PtC.A18(pxH7);
                                        }
                                        sy2 = SY2.A02;
                                    } else {
                                        sy2 = SY2.A01;
                                    }
                                } else {
                                    sy2 = SY2.A03;
                                }
                                return RTI.A00(sy2, A02(c60832RUr.keyValue_), c58551PxO.A04);
                            }
                            throw A03();
                        } catch (C61032Re1 unused6) {
                            throw AbstractC58318PtA.A0x("Parsing XChaCha20Poly1305Key failed");
                        }
                    }
                    throw AbstractC166987dD.A12("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
                case 8:
                    if (str.equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
                        try {
                            C60827RUm c60827RUm = (C60827RUm) AbstractC58533Px1.A04(c58551PxO.A02, C58534Px2.A00(), C60827RUm.DEFAULT_INSTANCE);
                            if (c60827RUm.version_ == 0) {
                                int A0211 = c60827RUm.keyValue_.A02();
                                if (A0211 == 32 || A0211 == 48 || A0211 == 64) {
                                    Integer valueOf9 = Integer.valueOf(A0211);
                                    PxH pxH8 = c58551PxO.A01;
                                    Map map2 = SA0.A04;
                                    if (map2.containsKey(pxH8)) {
                                        SY3 sy3 = (SY3) map2.get(pxH8);
                                        if (valueOf9 != null) {
                                            if (sy3 != null) {
                                                C58556PxX c58556PxX = new C58556PxX(sy3, valueOf9.intValue());
                                                C58552PxP A0212 = A02(c60827RUm.keyValue_);
                                                Integer num5 = c58551PxO.A04;
                                                if (c58556PxX.A00 == A0212.A00.A00.length) {
                                                    if (c58556PxX.A00()) {
                                                        if (num5 == null) {
                                                            throw AbstractC58318PtA.A0v();
                                                        }
                                                    } else if (num5 != null) {
                                                        throw AbstractC58318PtA.A0x("Cannot create key with ID requirement with parameters without ID requirement");
                                                    }
                                                    return new RT6(c58556PxX, S3H.A00(c58556PxX, num5), A0212, num5);
                                                }
                                                throw AbstractC58318PtA.A0w();
                                            }
                                            throw AbstractC58318PtA.A0x("Variant is not set");
                                        }
                                        throw AbstractC58318PtA.A0x("Key size is not set");
                                    }
                                    throw AbstractC58320PtC.A18(pxH8);
                                }
                                throw AbstractC58319PtB.A10("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", new Object[]{Integer.valueOf(A0211)});
                            }
                            throw A03();
                        } catch (C61032Re1 unused7) {
                            throw AbstractC58318PtA.A0x("Parsing AesSivKey failed");
                        }
                    }
                    throw AbstractC166987dD.A12("Wrong type URL in call to AesSivParameters.parseParameters");
                case 9:
                    if (str.equals("type.googleapis.com/google.crypto.tink.HpkePublicKey")) {
                        try {
                            RV9 rv9 = (RV9) AbstractC58533Px1.A04(c58551PxO.A02, C58534Px2.A00(), RV9.DEFAULT_INSTANCE);
                            if (rv9.version_ == 0) {
                                PxH pxH9 = c58551PxO.A01;
                                C60840RUz c60840RUz = rv9.params_;
                                if (c60840RUz == null) {
                                    c60840RUz = C60840RUz.DEFAULT_INSTANCE;
                                }
                                C60789RTa A004 = AbstractC63331Shf.A00(c60840RUz, pxH9);
                                return C60794RTf.A00(A004, AbstractC63331Shf.A03(A004.A02, rv9.publicKey_.A04()), c58551PxO.A04);
                            }
                            throw A03();
                        } catch (C61032Re1 unused8) {
                            throw AbstractC58318PtA.A0x("Parsing HpkePublicKey failed");
                        }
                    }
                    throw AbstractC167007dF.A0c("Wrong type URL in call to HpkeProtoSerialization.parsePublicKey: ", str);
                case 10:
                    if (str.equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
                        try {
                            RV8 rv8 = (RV8) AbstractC58533Px1.A04(c58551PxO.A02, C58534Px2.A00(), RV8.DEFAULT_INSTANCE);
                            if (rv8.version_ == 0) {
                                RV9 rv92 = rv8.publicKey_;
                                if (rv92 == null) {
                                    rv92 = RV9.DEFAULT_INSTANCE;
                                }
                                PxH pxH10 = c58551PxO.A01;
                                C60840RUz c60840RUz2 = rv92.params_;
                                if (c60840RUz2 == null) {
                                    c60840RUz2 = C60840RUz.DEFAULT_INSTANCE;
                                }
                                C60789RTa A005 = AbstractC63331Shf.A00(c60840RUz2, pxH10);
                                RTZ rtz = A005.A02;
                                return C60792RTd.A00(C60794RTf.A00(A005, AbstractC63331Shf.A03(rtz, rv92.publicKey_.A04()), c58551PxO.A04), new C58552PxP(C58526Pwu.A00(SSS.A01(new BigInteger(1, rv8.privateKey_.A04()), AbstractC63126SdU.A00(rtz)))));
                            }
                            throw A03();
                        } catch (C61032Re1 unused9) {
                            throw AbstractC58318PtA.A0x("Parsing HpkePrivateKey failed");
                        }
                    }
                    throw AbstractC167007dF.A0c("Wrong type URL in call to HpkeProtoSerialization.parsePrivateKey: ", str);
                case 11:
                    if (str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
                        try {
                            RVA rva = (RVA) AbstractC58533Px1.A04(c58551PxO.A02, C58534Px2.A00(), RVA.DEFAULT_INSTANCE);
                            if (rva.version_ == 0) {
                                PxH pxH11 = c58551PxO.A01;
                                RV4 rv4 = rva.params_;
                                if (rv4 == null) {
                                    rv4 = RV4.DEFAULT_INSTANCE;
                                }
                                C60790RTb A013 = AbstractC63332Shg.A01(rv4, pxH11);
                                if (A013.A01.equals(SY7.A04)) {
                                    if (rva.y_.A02() == 0) {
                                        return C60795RTg.A00(A013, C58526Pwu.A00(rva.x_.A04()), c58551PxO.A04);
                                    }
                                    throw AbstractC58318PtA.A0x("Y must be empty for X25519 points");
                                }
                                return C60795RTg.A01(A013, c58551PxO.A04, new ECPoint(new BigInteger(1, rva.x_.A04()), new BigInteger(1, rva.y_.A04())));
                            }
                            throw A03();
                        } catch (C61032Re1 | IllegalArgumentException unused10) {
                            throw AbstractC58318PtA.A0x("Parsing EcdsaPublicKey failed");
                        }
                    }
                    throw AbstractC167007dF.A0c("Wrong type URL in call to EciesProtoSerialization.parsePublicKey: ", str);
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    if (str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
                        try {
                            RV5 rv5 = (RV5) AbstractC58533Px1.A04(c58551PxO.A02, C58534Px2.A00(), RV5.DEFAULT_INSTANCE);
                            if (rv5.version_ == 0) {
                                RVA rva2 = rv5.publicKey_;
                                if (rva2 == null) {
                                    rva2 = RVA.DEFAULT_INSTANCE;
                                }
                                PxH pxH12 = c58551PxO.A01;
                                RV4 rv42 = rva2.params_;
                                if (rv42 == null) {
                                    rv42 = RV4.DEFAULT_INSTANCE;
                                }
                                C60790RTb A014 = AbstractC63332Shg.A01(rv42, pxH12);
                                if (A014.A01.equals(SY7.A04)) {
                                    C60795RTg A006 = C60795RTg.A00(A014, C58526Pwu.A00(rva2.x_.A04()), c58551PxO.A04);
                                    C58552PxP A0213 = A02(rv5.keyValue_);
                                    C58526Pwu c58526Pwu = A006.A02;
                                    if (c58526Pwu != null) {
                                        byte[] A015 = A0213.A00.A01();
                                        byte[] A016 = c58526Pwu.A01();
                                        if (A015.length == 32) {
                                            if (Arrays.equals(SSU.A00(A015), A016)) {
                                                return new C60793RTe(A006, null, A0213);
                                            }
                                            throw AbstractC58318PtA.A0x("Invalid private key for public key.");
                                        }
                                        throw AbstractC58318PtA.A0x("Private key bytes length for X25519 curve must be 32");
                                    }
                                    throw AbstractC58318PtA.A0x("ECIES private key for X25519 curve cannot be constructed with NIST-curve public key");
                                }
                                return C60793RTe.A00(C60795RTg.A01(A014, c58551PxO.A04, new ECPoint(new BigInteger(1, rva2.x_.A04()), new BigInteger(1, rva2.y_.A04()))), new SC3(new BigInteger(1, rv5.keyValue_.A04())));
                            }
                            throw A03();
                        } catch (C61032Re1 | IllegalArgumentException unused11) {
                            throw AbstractC58318PtA.A0x("Parsing EcdsaPrivateKey failed");
                        }
                    }
                    throw AbstractC167007dF.A0c("Wrong type URL in call to EciesProtoSerialization.parsePrivateKey: ", str);
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    if (str.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                        try {
                            RV0 rv0 = (RV0) AbstractC58533Px1.A04(c58551PxO.A02, C58534Px2.A00(), RV0.DEFAULT_INSTANCE);
                            if (rv0.version_ == 0) {
                                int A0214 = rv0.keyValue_.A02();
                                if (A0214 == 16 || A0214 == 32) {
                                    Integer valueOf10 = Integer.valueOf(A0214);
                                    C60816RUb c60816RUb = rv0.params_;
                                    if (c60816RUb == null) {
                                        c60816RUb = C60816RUb.DEFAULT_INSTANCE;
                                    }
                                    int i5 = c60816RUb.tagSize_;
                                    if (i5 >= 10 && 16 >= i5) {
                                        C60799RTk A007 = S3O.A00(AbstractC63121SdP.A00(c58551PxO.A01), valueOf10, Integer.valueOf(i5));
                                        C58552PxP A0215 = A02(rv0.keyValue_);
                                        Integer num6 = c58551PxO.A04;
                                        if (A007.A00 == A0215.A00.A00.length) {
                                            if (A007.A00()) {
                                                if (num6 == null) {
                                                    throw AbstractC58318PtA.A0v();
                                                }
                                            } else if (num6 != null) {
                                                throw AbstractC58318PtA.A0x("Cannot create key with ID requirement with parameters without ID requirement");
                                            }
                                            return new C60797RTi(A007, S3N.A00(A007, num6), A0215, num6);
                                        }
                                        throw AbstractC58318PtA.A0w();
                                    }
                                    throw AbstractC58320PtC.A1A("Invalid tag size for AesCmacParameters: ", i5);
                                }
                                throw AbstractC58319PtB.A10("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", new Object[]{Integer.valueOf(A0214 * 8)});
                            }
                            throw A03();
                        } catch (C61032Re1 | IllegalArgumentException unused12) {
                            throw AbstractC58318PtA.A0x("Parsing AesCmacKey failed");
                        }
                    }
                    throw AbstractC166987dD.A12("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
                default:
                    if (str.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                        try {
                            RV6 rv66 = (RV6) AbstractC58533Px1.A04(c58551PxO.A02, C58534Px2.A00(), RV6.DEFAULT_INSTANCE);
                            if (rv66.version_ == 0) {
                                Integer valueOf11 = Integer.valueOf(rv66.keyValue_.A02());
                                C60830RUp c60830RUp3 = rv66.params_;
                                C60830RUp c60830RUp4 = c60830RUp3;
                                if (c60830RUp3 == null) {
                                    c60830RUp3 = C60830RUp.DEFAULT_INSTANCE;
                                }
                                Integer valueOf12 = Integer.valueOf(c60830RUp3.tagSize_);
                                C62717SNg c62717SNg = SVE.A00;
                                if (c60830RUp4 == null) {
                                    c60830RUp4 = C60830RUp.DEFAULT_INSTANCE;
                                }
                                Rj3 A008 = Rj3.A00(c60830RUp4.hash_);
                                if (A008 == null) {
                                    A008 = Rj3.UNRECOGNIZED;
                                }
                                C60800RTl A009 = S3Q.A00((SYC) c62717SNg.A01(A008), (SY9) SVE.A01.A01(c58551PxO.A01), valueOf11, valueOf12);
                                C58552PxP A0216 = A02(rv66.keyValue_);
                                Integer num7 = c58551PxO.A04;
                                if (A009.A00 == A0216.A00.A00.length) {
                                    if (A009.A00()) {
                                        if (num7 == null) {
                                            throw AbstractC58318PtA.A0v();
                                        }
                                    } else if (num7 != null) {
                                        throw AbstractC58318PtA.A0x("Cannot create key with ID requirement with parameters without ID requirement");
                                    }
                                    return new C60798RTj(A009, S3P.A00(A009, num7), A0216, num7);
                                }
                                throw AbstractC58318PtA.A0w();
                            }
                            throw A03();
                        } catch (C61032Re1 | IllegalArgumentException unused13) {
                            throw AbstractC58318PtA.A0x("Parsing HmacKey failed");
                        }
                    }
                    throw AbstractC166987dD.A12("Wrong type URL in call to HmacProtoSerialization.parseKey");
            }
        }
        throw AbstractC58321PtD.A11(c58528Pww, "No Key Parser for requested key type ", AbstractC166987dD.A1C());
    }

    public final AbstractC61590RqE A06(InterfaceC65430Tk1 serializedParameters) {
        SXt sXt;
        C62930SXx c62930SXx;
        C62931SXy c62931SXy;
        SXz sXz;
        SY0 sy0;
        SY1 sy1;
        SY2 sy2;
        C62586SHl c62586SHl = (C62586SHl) this.A00.get();
        C58528Pww c58528Pww = new C58528Pww(serializedParameters.BYW(), serializedParameters.getClass());
        Map map = c62586SHl.A02;
        if (map.containsKey(c58528Pww)) {
            int i = ((C58366Pu6) ((C62502SEe) map.get(c58528Pww)).A01).A00;
            RVD rvd = ((T91) serializedParameters).A00;
            String str = rvd.typeUrl_;
            switch (i) {
                case 0:
                    if (str.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                        try {
                            String str2 = ((C60819RUe) AbstractC58533Px1.A04(rvd.value_, C58534Px2.A00(), C60819RUe.DEFAULT_INSTANCE)).keyUri_;
                            PxH A0G = rvd.A0G();
                            int ordinal = A0G.ordinal();
                            if (ordinal != 1) {
                                if (ordinal == 3) {
                                    sXt = SXt.A01;
                                } else {
                                    throw AbstractC58320PtC.A18(A0G);
                                }
                            } else {
                                sXt = SXt.A02;
                            }
                            return new RTN(sXt, str2);
                        } catch (C61032Re1 e) {
                            throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e);
                        }
                    }
                    throw AbstractC167007dF.A0c("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ", str);
                case 1:
                    if (str.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                        try {
                            return AbstractC63118SdM.A00((C60839RUy) AbstractC58533Px1.A04(rvd.value_, C58534Px2.A00(), C60839RUy.DEFAULT_INSTANCE), rvd.A0G());
                        } catch (C61032Re1 e2) {
                            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e2);
                        }
                    }
                    throw AbstractC167007dF.A0c("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ", str);
                case 2:
                    if (str.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                        try {
                            C60834RUt c60834RUt = (C60834RUt) AbstractC58533Px1.A04(rvd.value_, C58534Px2.A00(), C60834RUt.DEFAULT_INSTANCE);
                            RV7 rv7 = c60834RUt.hmacKeyFormat_;
                            RV7 rv72 = rv7;
                            if (rv7 == null) {
                                rv7 = RV7.DEFAULT_INSTANCE;
                            }
                            if (rv7.version_ == 0) {
                                C60835RUu c60835RUu = c60834RUt.aesCtrKeyFormat_;
                                C60835RUu c60835RUu2 = c60835RUu;
                                if (c60835RUu == null) {
                                    c60835RUu = C60835RUu.DEFAULT_INSTANCE;
                                }
                                int i2 = c60835RUu.keySize_;
                                if (i2 != 16 && i2 != 24 && i2 != 32) {
                                    throw AbstractC58319PtB.A10("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", AbstractC25228BEl.A1Y(i2));
                                }
                                Integer valueOf = Integer.valueOf(i2);
                                RV7 rv73 = rv72;
                                if (rv72 == null) {
                                    rv73 = RV7.DEFAULT_INSTANCE;
                                }
                                int i3 = rv73.keySize_;
                                if (i3 >= 16) {
                                    Integer valueOf2 = Integer.valueOf(i3);
                                    if (c60835RUu2 == null) {
                                        c60835RUu2 = C60835RUu.DEFAULT_INSTANCE;
                                    }
                                    C60817RUc c60817RUc = c60835RUu2.params_;
                                    if (c60817RUc == null) {
                                        c60817RUc = C60817RUc.DEFAULT_INSTANCE;
                                    }
                                    int i4 = c60817RUc.ivSize_;
                                    if (i4 >= 12 && i4 <= 16) {
                                        Integer valueOf3 = Integer.valueOf(i4);
                                        RV7 rv74 = rv72;
                                        if (rv72 == null) {
                                            rv74 = RV7.DEFAULT_INSTANCE;
                                        }
                                        C60830RUp c60830RUp = rv74.params_;
                                        if (c60830RUp == null) {
                                            c60830RUp = C60830RUp.DEFAULT_INSTANCE;
                                        }
                                        int i5 = c60830RUp.tagSize_;
                                        if (i5 >= 10) {
                                            Integer valueOf4 = Integer.valueOf(i5);
                                            if (rv72 == null) {
                                                rv72 = RV7.DEFAULT_INSTANCE;
                                            }
                                            C60830RUp c60830RUp2 = rv72.params_;
                                            if (c60830RUp2 == null) {
                                                c60830RUp2 = C60830RUp.DEFAULT_INSTANCE;
                                            }
                                            Rj3 A00 = Rj3.A00(c60830RUp2.hash_);
                                            if (A00 == null) {
                                                A00 = Rj3.UNRECOGNIZED;
                                            }
                                            SYA A002 = AbstractC63267SgR.A00(A00);
                                            PxH A0G2 = rvd.A0G();
                                            int ordinal2 = A0G2.ordinal();
                                            if (ordinal2 != 1) {
                                                if (ordinal2 != 4 && ordinal2 != 2) {
                                                    if (ordinal2 == 3) {
                                                        c62930SXx = C62930SXx.A02;
                                                    } else {
                                                        throw AbstractC58320PtC.A18(A0G2);
                                                    }
                                                } else {
                                                    c62930SXx = C62930SXx.A01;
                                                }
                                            } else {
                                                c62930SXx = C62930SXx.A03;
                                            }
                                            return SSR.A01(A002, c62930SXx, valueOf, valueOf2, valueOf3, valueOf4);
                                        }
                                        throw AbstractC58319PtB.A0z("Invalid tag size in bytes %d; must be at least 10 bytes", AbstractC25228BEl.A1Y(i5));
                                    }
                                    throw AbstractC58319PtB.A0z("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", AbstractC25228BEl.A1Y(i4));
                                }
                                throw AbstractC58319PtB.A10("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", AbstractC25228BEl.A1Y(i3));
                            }
                            throw A03();
                        } catch (C61032Re1 e3) {
                            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e3);
                        }
                    }
                    throw AbstractC167007dF.A0c("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ", str);
                case 3:
                    if (str.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                        try {
                            C60836RUv c60836RUv = (C60836RUv) AbstractC58533Px1.A04(rvd.value_, C58534Px2.A00(), C60836RUv.DEFAULT_INSTANCE);
                            int i6 = c60836RUv.keySize_;
                            if (i6 != 16 && i6 != 24 && i6 != 32) {
                                throw AbstractC58319PtB.A10("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", AbstractC25228BEl.A1Y(i6));
                            }
                            Integer valueOf5 = Integer.valueOf(i6);
                            C60818RUd c60818RUd = c60836RUv.params_;
                            if (c60818RUd == null) {
                                c60818RUd = C60818RUd.DEFAULT_INSTANCE;
                            }
                            int i7 = c60818RUd.ivSize_;
                            if (i7 != 12 && i7 != 16) {
                                throw AbstractC58319PtB.A0z("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", AbstractC25228BEl.A1Y(i7));
                            }
                            Integer valueOf6 = Integer.valueOf(i7);
                            PxH A0G3 = rvd.A0G();
                            int ordinal3 = A0G3.ordinal();
                            if (ordinal3 != 1) {
                                if (ordinal3 != 4 && ordinal3 != 2) {
                                    if (ordinal3 == 3) {
                                        c62931SXy = C62931SXy.A02;
                                    } else {
                                        throw AbstractC58320PtC.A18(A0G3);
                                    }
                                } else {
                                    c62931SXy = C62931SXy.A01;
                                }
                            } else {
                                c62931SXy = C62931SXy.A03;
                            }
                            return S3E.A00(c62931SXy, valueOf6, valueOf5);
                        } catch (C61032Re1 e4) {
                            throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e4);
                        }
                    }
                    throw AbstractC167007dF.A0c("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ", str);
                case 4:
                    if (str.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                        try {
                            C60824RUj c60824RUj = (C60824RUj) AbstractC58533Px1.A04(rvd.value_, C58534Px2.A00(), C60824RUj.DEFAULT_INSTANCE);
                            if (c60824RUj.version_ == 0) {
                                int i8 = c60824RUj.keySize_;
                                if (i8 != 16 && i8 != 24 && i8 != 32) {
                                    throw AbstractC58319PtB.A10("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", AbstractC25228BEl.A1Y(i8));
                                }
                                Integer valueOf7 = Integer.valueOf(i8);
                                PxH A0G4 = rvd.A0G();
                                int ordinal4 = A0G4.ordinal();
                                if (ordinal4 != 1) {
                                    if (ordinal4 != 4 && ordinal4 != 2) {
                                        if (ordinal4 == 3) {
                                            sXz = SXz.A02;
                                        } else {
                                            throw AbstractC58320PtC.A18(A0G4);
                                        }
                                    } else {
                                        sXz = SXz.A01;
                                    }
                                } else {
                                    sXz = SXz.A03;
                                }
                                if (valueOf7 != null) {
                                    return new C58529Pwx(sXz, valueOf7.intValue());
                                }
                                throw AbstractC58318PtA.A0x("Key size is not set");
                            }
                            throw AbstractC58318PtA.A0x("Only version 0 parameters are accepted");
                        } catch (C61032Re1 e5) {
                            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e5);
                        }
                    }
                    throw AbstractC167007dF.A0c("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ", str);
                case 5:
                    if (str.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                        try {
                            C60826RUl c60826RUl = (C60826RUl) AbstractC58533Px1.A04(rvd.value_, C58534Px2.A00(), C60826RUl.DEFAULT_INSTANCE);
                            if (c60826RUl.version_ == 0) {
                                int i9 = c60826RUl.keySize_;
                                if (i9 != 16 && i9 != 32) {
                                    throw AbstractC58319PtB.A10("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", AbstractC25228BEl.A1Y(i9));
                                }
                                Integer valueOf8 = Integer.valueOf(i9);
                                PxH A0G5 = rvd.A0G();
                                int ordinal5 = A0G5.ordinal();
                                if (ordinal5 != 1) {
                                    if (ordinal5 != 4 && ordinal5 != 2) {
                                        if (ordinal5 == 3) {
                                            sy0 = SY0.A02;
                                        } else {
                                            throw AbstractC58320PtC.A18(A0G5);
                                        }
                                    } else {
                                        sy0 = SY0.A01;
                                    }
                                } else {
                                    sy0 = SY0.A03;
                                }
                                if (valueOf8 != null) {
                                    return new RTM(sy0, valueOf8.intValue());
                                }
                                throw AbstractC58318PtA.A0x("Key size is not set");
                            }
                            throw AbstractC58318PtA.A0x("Only version 0 parameters are accepted");
                        } catch (C61032Re1 e6) {
                            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e6);
                        }
                    }
                    throw AbstractC167007dF.A0c("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ", str);
                case 6:
                    if (str.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                        try {
                            AbstractC58533Px1.A04(rvd.value_, C58534Px2.A00(), C60815RUa.DEFAULT_INSTANCE);
                            PxH A0G6 = rvd.A0G();
                            int ordinal6 = A0G6.ordinal();
                            if (ordinal6 != 1) {
                                if (ordinal6 != 4 && ordinal6 != 2) {
                                    if (ordinal6 == 3) {
                                        sy1 = SY1.A02;
                                    } else {
                                        throw AbstractC58320PtC.A18(A0G6);
                                    }
                                } else {
                                    sy1 = SY1.A01;
                                }
                            } else {
                                sy1 = SY1.A03;
                            }
                            return new RTK(sy1);
                        } catch (C61032Re1 e7) {
                            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e7);
                        }
                    }
                    throw AbstractC167007dF.A0c("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ", str);
                case 7:
                    if (str.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                        try {
                            if (((C60820RUf) AbstractC58533Px1.A04(rvd.value_, C58534Px2.A00(), C60820RUf.DEFAULT_INSTANCE)).version_ == 0) {
                                PxH A0G7 = rvd.A0G();
                                int ordinal7 = A0G7.ordinal();
                                if (ordinal7 != 1) {
                                    if (ordinal7 != 4 && ordinal7 != 2) {
                                        if (ordinal7 == 3) {
                                            sy2 = SY2.A02;
                                        } else {
                                            throw AbstractC58320PtC.A18(A0G7);
                                        }
                                    } else {
                                        sy2 = SY2.A01;
                                    }
                                } else {
                                    sy2 = SY2.A03;
                                }
                                return new RTL(sy2);
                            }
                            throw AbstractC58318PtA.A0x("Only version 0 parameters are accepted");
                        } catch (C61032Re1 e8) {
                            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e8);
                        }
                    }
                    throw AbstractC167007dF.A0c("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ", str);
                case 8:
                    if (str.equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
                        try {
                            C60828RUn c60828RUn = (C60828RUn) AbstractC58533Px1.A04(rvd.value_, C58534Px2.A00(), C60828RUn.DEFAULT_INSTANCE);
                            if (c60828RUn.version_ == 0) {
                                int i10 = c60828RUn.keySize_;
                                if (i10 != 32 && i10 != 48 && i10 != 64) {
                                    throw AbstractC58319PtB.A10("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", AbstractC25228BEl.A1Y(i10));
                                }
                                Integer valueOf9 = Integer.valueOf(i10);
                                PxH A0G8 = rvd.A0G();
                                Map map2 = SA0.A04;
                                if (map2.containsKey(A0G8)) {
                                    SY3 sy3 = (SY3) map2.get(A0G8);
                                    if (valueOf9 != null) {
                                        if (sy3 != null) {
                                            return new C58556PxX(sy3, valueOf9.intValue());
                                        }
                                        throw AbstractC58318PtA.A0x("Variant is not set");
                                    }
                                    throw AbstractC58318PtA.A0x("Key size is not set");
                                }
                                throw AbstractC58320PtC.A18(A0G8);
                            }
                            throw A03();
                        } catch (C61032Re1 e9) {
                            throw new GeneralSecurityException("Parsing AesSivParameters failed: ", e9);
                        }
                    }
                    throw AbstractC167007dF.A0c("Wrong type URL in call to AesSivParameters.parseParameters: ", str);
                case 9:
                    if (str.equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
                        try {
                            C60823RUi c60823RUi = (C60823RUi) AbstractC58533Px1.A04(rvd.value_, C58534Px2.A00(), C60823RUi.DEFAULT_INSTANCE);
                            PxH A0G9 = rvd.A0G();
                            C60840RUz c60840RUz = c60823RUi.params_;
                            if (c60840RUz == null) {
                                c60840RUz = C60840RUz.DEFAULT_INSTANCE;
                            }
                            return AbstractC63331Shf.A00(c60840RUz, A0G9);
                        } catch (C61032Re1 e10) {
                            throw new GeneralSecurityException("Parsing HpkeParameters failed: ", e10);
                        }
                    }
                    throw AbstractC167007dF.A0c("Wrong type URL in call to HpkeProtoSerialization.parseParameters: ", str);
                case 10:
                    if (str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
                        try {
                            C60822RUh c60822RUh = (C60822RUh) AbstractC58533Px1.A04(rvd.value_, C58534Px2.A00(), C60822RUh.DEFAULT_INSTANCE);
                            PxH A0G10 = rvd.A0G();
                            RV4 rv4 = c60822RUh.params_;
                            if (rv4 == null) {
                                rv4 = RV4.DEFAULT_INSTANCE;
                            }
                            return AbstractC63332Shg.A01(rv4, A0G10);
                        } catch (C61032Re1 e11) {
                            throw new GeneralSecurityException("Parsing EciesParameters failed: ", e11);
                        }
                    }
                    throw AbstractC167007dF.A0c("Wrong type URL in call to EciesProtoSerialization.parseParameters: ", str);
                case 11:
                    if (str.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                        try {
                            C60833RUs c60833RUs = (C60833RUs) AbstractC58533Px1.A04(rvd.value_, C58534Px2.A00(), C60833RUs.DEFAULT_INSTANCE);
                            int i11 = c60833RUs.keySize_;
                            if (i11 != 16 && i11 != 32) {
                                throw AbstractC58319PtB.A10("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", AbstractC25228BEl.A1Y(i11 * 8));
                            }
                            Integer valueOf10 = Integer.valueOf(i11);
                            C60816RUb c60816RUb = c60833RUs.params_;
                            if (c60816RUb == null) {
                                c60816RUb = C60816RUb.DEFAULT_INSTANCE;
                            }
                            int i12 = c60816RUb.tagSize_;
                            if (i12 >= 10 && 16 >= i12) {
                                return S3O.A00(AbstractC63121SdP.A00(rvd.A0G()), valueOf10, Integer.valueOf(i12));
                            }
                            throw AbstractC58320PtC.A1A("Invalid tag size for AesCmacParameters: ", i12);
                        } catch (C61032Re1 e12) {
                            throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e12);
                        }
                    }
                    throw AbstractC167007dF.A0c("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ", str);
                default:
                    if (str.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                        try {
                            RV7 rv75 = (RV7) AbstractC58533Px1.A04(rvd.value_, C58534Px2.A00(), RV7.DEFAULT_INSTANCE);
                            int i13 = rv75.version_;
                            if (i13 == 0) {
                                Integer valueOf11 = Integer.valueOf(rv75.keySize_);
                                C60830RUp c60830RUp3 = rv75.params_;
                                C60830RUp c60830RUp4 = c60830RUp3;
                                if (c60830RUp3 == null) {
                                    c60830RUp3 = C60830RUp.DEFAULT_INSTANCE;
                                }
                                Integer valueOf12 = Integer.valueOf(c60830RUp3.tagSize_);
                                C62717SNg c62717SNg = SVE.A00;
                                if (c60830RUp4 == null) {
                                    c60830RUp4 = C60830RUp.DEFAULT_INSTANCE;
                                }
                                Rj3 A003 = Rj3.A00(c60830RUp4.hash_);
                                if (A003 == null) {
                                    A003 = Rj3.UNRECOGNIZED;
                                }
                                return S3Q.A00((SYC) c62717SNg.A01(A003), (SY9) SVE.A01.A01(rvd.A0G()), valueOf11, valueOf12);
                            }
                            throw AbstractC58320PtC.A1A("Parsing HmacParameters failed: unknown Version ", i13);
                        } catch (C61032Re1 e13) {
                            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e13);
                        }
                    }
                    throw AbstractC167007dF.A0c("Wrong type URL in call to HmacProtoSerialization.parseParameters: ", str);
            }
        }
        throw AbstractC58321PtD.A11(c58528Pww, "No Parameters Parser for requested key type ", AbstractC166987dD.A1C());
    }

    public final InterfaceC65430Tk1 A07(AbstractC61589RqD abstractC61589RqD) {
        C58535Px3 A00;
        Rj2 rj2;
        PxH pxH;
        Integer num;
        String str;
        byte[] A012;
        C62586SHl c62586SHl = (C62586SHl) this.A00.get();
        C62741SOi c62741SOi = new C62741SOi(abstractC61589RqD.getClass(), C58551PxO.class);
        Map map = c62586SHl.A01;
        if (map.containsKey(c62741SOi)) {
            switch (((C58363Pu3) ((C62501SEd) map.get(c62741SOi)).A01).A00) {
                case 0:
                    RTF rtf = (RTF) abstractC61589RqD;
                    C60837RUw c60837RUw = C60837RUw.DEFAULT_INSTANCE;
                    Integer num2 = C05F.A0Y;
                    PxQ pxQ = (PxQ) c60837RUw.A0F(num2);
                    PxQ pxQ2 = (PxQ) C60819RUe.DEFAULT_INSTANCE.A0F(num2);
                    RTN rtn = rtf.A00;
                    String str2 = rtn.A01;
                    C60819RUe c60819RUe = (C60819RUe) PxQ.A00(pxQ2);
                    str2.getClass();
                    c60819RUe.keyUri_ = str2;
                    C60819RUe c60819RUe2 = (C60819RUe) pxQ2.A02();
                    C60837RUw c60837RUw2 = (C60837RUw) PxQ.A00(pxQ);
                    c60819RUe2.getClass();
                    c60837RUw2.params_ = c60819RUe2;
                    c60837RUw2.bitField0_ |= 1;
                    A00 = A00(pxQ);
                    rj2 = Rj2.REMOTE;
                    SXt sXt = rtn.A00;
                    if (SXt.A02.equals(sXt)) {
                        pxH = PxH.TINK;
                    } else if (SXt.A01.equals(sXt)) {
                        pxH = PxH.RAW;
                    } else {
                        throw AbstractC58320PtC.A19(sXt, "Unable to serialize variant: ", AbstractC166987dD.A1C());
                    }
                    num = rtf.A02;
                    str = "type.googleapis.com/google.crypto.tink.KmsAeadKey";
                    break;
                case 1:
                    RTG rtg = (RTG) abstractC61589RqD;
                    PxQ pxQ3 = (PxQ) C60838RUx.DEFAULT_INSTANCE.A0F(C05F.A0Y);
                    RTP rtp = rtg.A00;
                    C60839RUy A013 = AbstractC63118SdM.A01(rtp);
                    C60838RUx c60838RUx = (C60838RUx) PxQ.A00(pxQ3);
                    A013.getClass();
                    c60838RUx.params_ = A013;
                    c60838RUx.bitField0_ |= 1;
                    A00 = A00(pxQ3);
                    rj2 = Rj2.REMOTE;
                    SXu sXu = rtp.A01;
                    if (SXu.A02.equals(sXu)) {
                        pxH = PxH.TINK;
                    } else if (SXu.A01.equals(sXu)) {
                        pxH = PxH.RAW;
                    } else {
                        throw AbstractC58320PtC.A19(sXu, "Unable to serialize variant: ", AbstractC166987dD.A1C());
                    }
                    num = rtg.A02;
                    str = "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
                    break;
                case 2:
                    RTE rte = (RTE) abstractC61589RqD;
                    RV1 rv1 = RV1.DEFAULT_INSTANCE;
                    Integer num3 = C05F.A0Y;
                    PxQ pxQ4 = (PxQ) rv1.A0F(num3);
                    PxQ pxQ5 = (PxQ) RV2.DEFAULT_INSTANCE.A0F(num3);
                    PxQ pxQ6 = (PxQ) C60817RUc.DEFAULT_INSTANCE.A0F(num3);
                    RTQ rtq = rte.A00;
                    ((C60817RUc) PxQ.A00(pxQ6)).ivSize_ = rtq.A02;
                    C60817RUc c60817RUc = (C60817RUc) pxQ6.A02();
                    RV2 rv2 = (RV2) PxQ.A00(pxQ5);
                    c60817RUc.getClass();
                    rv2.params_ = c60817RUc;
                    rv2.bitField0_ |= 1;
                    byte[] A014 = rte.A02.A00.A01();
                    ((RV2) PxQ.A00(pxQ5)).keyValue_ = AbstractC58536Px4.A01(A014, 0, A014.length);
                    RV2 rv22 = (RV2) pxQ5.A02();
                    RV1 rv12 = (RV1) PxQ.A00(pxQ4);
                    rv22.getClass();
                    rv12.aesCtrKey_ = rv22;
                    rv12.bitField0_ |= 1;
                    PxQ pxQ7 = (PxQ) RV6.DEFAULT_INSTANCE.A0F(num3);
                    C60830RUp A015 = AbstractC63267SgR.A01(rtq);
                    RV6 rv6 = (RV6) PxQ.A00(pxQ7);
                    A015.getClass();
                    rv6.params_ = A015;
                    rv6.bitField0_ |= 1;
                    byte[] A016 = rte.A03.A00.A01();
                    ((RV6) PxQ.A00(pxQ7)).keyValue_ = AbstractC58536Px4.A01(A016, 0, A016.length);
                    RV6 rv62 = (RV6) pxQ7.A02();
                    RV1 rv13 = (RV1) PxQ.A00(pxQ4);
                    rv62.getClass();
                    rv13.hmacKey_ = rv62;
                    rv13.bitField0_ |= 2;
                    A00 = A00(pxQ4);
                    rj2 = Rj2.SYMMETRIC;
                    pxH = AbstractC63267SgR.A02(rtq.A05);
                    num = rte.A04;
                    str = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
                    break;
                case 3:
                    RTB rtb = (RTB) abstractC61589RqD;
                    PxQ pxQ8 = (PxQ) RV3.DEFAULT_INSTANCE.A0F(C05F.A0Y);
                    RTO rto = rtb.A00;
                    C60818RUd A002 = AbstractC63119SdN.A00(rto);
                    RV3 rv3 = (RV3) PxQ.A00(pxQ8);
                    A002.getClass();
                    rv3.params_ = A002;
                    rv3.bitField0_ |= 1;
                    ((RV3) pxQ8.A00).keyValue_ = A01(pxQ8, rtb.A02);
                    A00 = A00(pxQ8);
                    rj2 = Rj2.SYMMETRIC;
                    pxH = AbstractC63119SdN.A01(rto.A03);
                    num = rtb.A03;
                    str = "type.googleapis.com/google.crypto.tink.AesEaxKey";
                    break;
                case 4:
                    RTC rtc = (RTC) abstractC61589RqD;
                    C58529Pwx c58529Pwx = rtc.A00;
                    AbstractC63120SdO.A01(c58529Pwx);
                    PxQ pxQ9 = (PxQ) C58559Pxb.DEFAULT_INSTANCE.A0F(C05F.A0Y);
                    ((C58559Pxb) pxQ9.A00).keyValue_ = A01(pxQ9, rtc.A02);
                    A00 = A00(pxQ9);
                    rj2 = Rj2.SYMMETRIC;
                    pxH = AbstractC63120SdO.A00(c58529Pwx.A03);
                    num = rtc.A03;
                    str = "type.googleapis.com/google.crypto.tink.AesGcmKey";
                    break;
                case 5:
                    RTD rtd = (RTD) abstractC61589RqD;
                    PxQ pxQ10 = (PxQ) C60825RUk.DEFAULT_INSTANCE.A0F(C05F.A0Y);
                    ((C60825RUk) pxQ10.A00).keyValue_ = A01(pxQ10, rtd.A02);
                    A00 = A00(pxQ10);
                    rj2 = Rj2.SYMMETRIC;
                    pxH = SV6.A00(rtd.A00.A01);
                    num = rtd.A03;
                    str = "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
                    break;
                case 6:
                    RTH rth = (RTH) abstractC61589RqD;
                    PxQ pxQ11 = (PxQ) C60829RUo.DEFAULT_INSTANCE.A0F(C05F.A0Y);
                    ((C60829RUo) pxQ11.A00).keyValue_ = A01(pxQ11, rth.A02);
                    A00 = A00(pxQ11);
                    rj2 = Rj2.SYMMETRIC;
                    pxH = SV7.A00(rth.A00.A00);
                    num = rth.A03;
                    str = "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
                    break;
                case 7:
                    RTI rti = (RTI) abstractC61589RqD;
                    PxQ pxQ12 = (PxQ) C60832RUr.DEFAULT_INSTANCE.A0F(C05F.A0Y);
                    ((C60832RUr) pxQ12.A00).keyValue_ = A01(pxQ12, rti.A02);
                    A00 = A00(pxQ12);
                    rj2 = Rj2.SYMMETRIC;
                    pxH = SV8.A00(rti.A00.A00);
                    num = rti.A03;
                    str = "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
                    break;
                case 8:
                    RT6 rt6 = (RT6) abstractC61589RqD;
                    PxQ pxQ13 = (PxQ) C60827RUm.DEFAULT_INSTANCE.A0F(C05F.A0Y);
                    ((C60827RUm) pxQ13.A00).keyValue_ = A01(pxQ13, rt6.A02);
                    A00 = A00(pxQ13);
                    rj2 = Rj2.SYMMETRIC;
                    SY3 sy3 = rt6.A00.A01;
                    Map map2 = SA0.A05;
                    if (map2.containsKey(sy3)) {
                        pxH = (PxH) map2.get(sy3);
                        num = rt6.A03;
                        str = "type.googleapis.com/google.crypto.tink.AesSivKey";
                        break;
                    } else {
                        throw AbstractC58320PtC.A19(sy3, "Unable to serialize variant: ", AbstractC166987dD.A1C());
                    }
                case 9:
                    C60794RTf c60794RTf = (C60794RTf) abstractC61589RqD;
                    A00 = AbstractC63331Shf.A02(c60794RTf).A0D();
                    rj2 = Rj2.ASYMMETRIC_PUBLIC;
                    pxH = (PxH) AbstractC63331Shf.A00.A00(c60794RTf.A00.A03);
                    num = c60794RTf.A03;
                    str = "type.googleapis.com/google.crypto.tink.HpkePublicKey";
                    break;
                case 10:
                    C60792RTd c60792RTd = (C60792RTd) abstractC61589RqD;
                    PxQ pxQ14 = (PxQ) RV8.DEFAULT_INSTANCE.A0F(C05F.A0Y);
                    ((RV8) PxQ.A00(pxQ14)).version_ = 0;
                    C60794RTf c60794RTf2 = c60792RTd.A00;
                    RV9 A02 = AbstractC63331Shf.A02(c60794RTf2);
                    RV8 rv8 = (RV8) PxQ.A00(pxQ14);
                    A02.getClass();
                    rv8.publicKey_ = A02;
                    rv8.bitField0_ |= 1;
                    byte[] A017 = c60792RTd.A01.A00.A01();
                    ((RV8) PxQ.A00(pxQ14)).privateKey_ = AbstractC58536Px4.A01(A017, 0, A017.length);
                    A00 = A00(pxQ14);
                    rj2 = Rj2.ASYMMETRIC_PRIVATE;
                    pxH = (PxH) AbstractC63331Shf.A00.A00(c60794RTf2.A00.A03);
                    num = c60792RTd.A04();
                    str = "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
                    break;
                case 11:
                    C60795RTg c60795RTg = (C60795RTg) abstractC61589RqD;
                    A00 = AbstractC63332Shg.A03(c60795RTg).A0D();
                    rj2 = Rj2.ASYMMETRIC_PUBLIC;
                    pxH = (PxH) AbstractC63332Shg.A00.A00(c60795RTg.A00.A04);
                    num = c60795RTg.A03;
                    str = "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    C60793RTe c60793RTe = (C60793RTe) abstractC61589RqD;
                    PxQ pxQ15 = (PxQ) RV5.DEFAULT_INSTANCE.A0F(C05F.A0Y);
                    ((RV5) PxQ.A00(pxQ15)).version_ = 0;
                    C60795RTg c60795RTg2 = c60793RTe.A00;
                    RVA A03 = AbstractC63332Shg.A03(c60795RTg2);
                    RV5 rv5 = (RV5) PxQ.A00(pxQ15);
                    A03.getClass();
                    rv5.publicKey_ = A03;
                    rv5.bitField0_ |= 1;
                    C60790RTb c60790RTb = c60795RTg2.A00;
                    SY7 sy7 = c60790RTb.A01;
                    if (sy7.equals(SY7.A04)) {
                        A012 = c60793RTe.A02.A00.A01();
                    } else {
                        A012 = SSS.A01(c60793RTe.A01.A00, AbstractC63332Shg.A00(sy7));
                    }
                    ((RV5) PxQ.A00(pxQ15)).keyValue_ = AbstractC58536Px4.A01(A012, 0, A012.length);
                    A00 = A00(pxQ15);
                    rj2 = Rj2.ASYMMETRIC_PRIVATE;
                    pxH = (PxH) AbstractC63332Shg.A00.A00(c60790RTb.A04);
                    num = c60793RTe.A04();
                    str = "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
                    break;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    return ((RT5) abstractC61589RqD).A00;
                case 14:
                    C60797RTi c60797RTi = (C60797RTi) abstractC61589RqD;
                    RV0 rv0 = RV0.DEFAULT_INSTANCE;
                    Integer num4 = C05F.A0Y;
                    PxQ pxQ16 = (PxQ) rv0.A0F(num4);
                    C60799RTk c60799RTk = c60797RTi.A00;
                    PxQ pxQ17 = (PxQ) C60816RUb.DEFAULT_INSTANCE.A0F(num4);
                    ((C60816RUb) PxQ.A00(pxQ17)).tagSize_ = c60799RTk.A01;
                    C60816RUb c60816RUb = (C60816RUb) pxQ17.A02();
                    RV0 rv02 = (RV0) PxQ.A00(pxQ16);
                    c60816RUb.getClass();
                    rv02.params_ = c60816RUb;
                    rv02.bitField0_ |= 1;
                    ((RV0) pxQ16.A00).keyValue_ = A01(pxQ16, c60797RTi.A02);
                    A00 = A00(pxQ16);
                    rj2 = Rj2.SYMMETRIC;
                    pxH = AbstractC63121SdP.A01(c60799RTk.A02);
                    num = c60797RTi.A03;
                    str = "type.googleapis.com/google.crypto.tink.AesCmacKey";
                    break;
                default:
                    C60798RTj c60798RTj = (C60798RTj) abstractC61589RqD;
                    PxQ pxQ18 = (PxQ) RV6.DEFAULT_INSTANCE.A0F(C05F.A0Y);
                    C60800RTl c60800RTl = c60798RTj.A00;
                    C60830RUp A003 = SVE.A00(c60800RTl);
                    RV6 rv63 = (RV6) PxQ.A00(pxQ18);
                    A003.getClass();
                    rv63.params_ = A003;
                    rv63.bitField0_ |= 1;
                    ((RV6) pxQ18.A00).keyValue_ = A01(pxQ18, c60798RTj.A02);
                    return C58551PxO.A00(Rj2.SYMMETRIC, (PxH) SVE.A01.A00(c60800RTl.A03), A00(pxQ18), c60798RTj.A03, "type.googleapis.com/google.crypto.tink.HmacKey");
            }
            return C58551PxO.A00(rj2, pxH, A00, num, str);
        }
        throw AbstractC58321PtD.A11(c62741SOi, "No Key serializer for ", AbstractC166987dD.A1C());
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0027. Please report as an issue. */
    public final InterfaceC65430Tk1 A08(AbstractC61590RqE abstractC61590RqE) {
        RUZ A02;
        PxH pxH;
        C62586SHl c62586SHl = (C62586SHl) this.A00.get();
        C62741SOi c62741SOi = new C62741SOi(abstractC61590RqE.getClass(), T91.class);
        Map map = c62586SHl.A03;
        if (map.containsKey(c62741SOi)) {
            switch (((C58365Pu5) ((C62503SEf) map.get(c62741SOi)).A01).A00) {
                case 0:
                    RTN rtn = (RTN) abstractC61590RqE;
                    A02 = AbstractC58532Px0.A02();
                    A02.A07("type.googleapis.com/google.crypto.tink.KmsAeadKey");
                    PxQ pxQ = (PxQ) C60819RUe.DEFAULT_INSTANCE.A0F(C05F.A0Y);
                    String str = rtn.A01;
                    C60819RUe c60819RUe = (C60819RUe) PxQ.A00(pxQ);
                    str.getClass();
                    c60819RUe.keyUri_ = str;
                    A04(A02, pxQ);
                    SXt sXt = rtn.A00;
                    if (!SXt.A02.equals(sXt)) {
                        if (!SXt.A01.equals(sXt)) {
                            throw AbstractC58320PtC.A19(sXt, "Unable to serialize variant: ", AbstractC166987dD.A1C());
                        }
                        pxH = PxH.RAW;
                        A02.A05(pxH);
                        RVD rvd = (RVD) A02.A02();
                        return new T91(rvd, AbstractC58538Px6.A01(rvd.typeUrl_));
                    }
                    pxH = PxH.TINK;
                    A02.A05(pxH);
                    RVD rvd2 = (RVD) A02.A02();
                    return new T91(rvd2, AbstractC58538Px6.A01(rvd2.typeUrl_));
                case 1:
                    RTP rtp = (RTP) abstractC61590RqE;
                    A02 = AbstractC58532Px0.A02();
                    A02.A07("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
                    A02.A06(AbstractC63118SdM.A01(rtp).A0D());
                    SXu sXu = rtp.A01;
                    if (!SXu.A02.equals(sXu)) {
                        if (!SXu.A01.equals(sXu)) {
                            throw AbstractC58320PtC.A19(sXu, "Unable to serialize variant: ", AbstractC166987dD.A1C());
                        }
                        pxH = PxH.RAW;
                        A02.A05(pxH);
                        RVD rvd22 = (RVD) A02.A02();
                        return new T91(rvd22, AbstractC58538Px6.A01(rvd22.typeUrl_));
                    }
                    pxH = PxH.TINK;
                    A02.A05(pxH);
                    RVD rvd222 = (RVD) A02.A02();
                    return new T91(rvd222, AbstractC58538Px6.A01(rvd222.typeUrl_));
                case 2:
                    RTQ rtq = (RTQ) abstractC61590RqE;
                    A02 = AbstractC58532Px0.A02();
                    A02.A07("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
                    C60834RUt c60834RUt = C60834RUt.DEFAULT_INSTANCE;
                    Integer num = C05F.A0Y;
                    PxQ pxQ2 = (PxQ) c60834RUt.A0F(num);
                    PxQ pxQ3 = (PxQ) C60835RUu.DEFAULT_INSTANCE.A0F(num);
                    PxQ pxQ4 = (PxQ) C60817RUc.DEFAULT_INSTANCE.A0F(num);
                    ((C60817RUc) PxQ.A00(pxQ4)).ivSize_ = rtq.A02;
                    C60817RUc c60817RUc = (C60817RUc) pxQ4.A02();
                    C60835RUu c60835RUu = (C60835RUu) PxQ.A00(pxQ3);
                    c60817RUc.getClass();
                    c60835RUu.params_ = c60817RUc;
                    c60835RUu.bitField0_ |= 1;
                    ((C60835RUu) PxQ.A00(pxQ3)).keySize_ = rtq.A00;
                    C60835RUu c60835RUu2 = (C60835RUu) pxQ3.A02();
                    C60834RUt c60834RUt2 = (C60834RUt) PxQ.A00(pxQ2);
                    c60835RUu2.getClass();
                    c60834RUt2.aesCtrKeyFormat_ = c60835RUu2;
                    c60834RUt2.bitField0_ |= 1;
                    PxQ pxQ5 = (PxQ) RV7.DEFAULT_INSTANCE.A0F(num);
                    C60830RUp A012 = AbstractC63267SgR.A01(rtq);
                    RV7 rv7 = (RV7) PxQ.A00(pxQ5);
                    A012.getClass();
                    rv7.params_ = A012;
                    rv7.bitField0_ |= 1;
                    ((RV7) PxQ.A00(pxQ5)).keySize_ = rtq.A01;
                    RV7 rv72 = (RV7) pxQ5.A02();
                    C60834RUt c60834RUt3 = (C60834RUt) PxQ.A00(pxQ2);
                    rv72.getClass();
                    c60834RUt3.hmacKeyFormat_ = rv72;
                    c60834RUt3.bitField0_ |= 2;
                    A04(A02, pxQ2);
                    pxH = AbstractC63267SgR.A02(rtq.A05);
                    A02.A05(pxH);
                    RVD rvd2222 = (RVD) A02.A02();
                    return new T91(rvd2222, AbstractC58538Px6.A01(rvd2222.typeUrl_));
                case 3:
                    RTO rto = (RTO) abstractC61590RqE;
                    A02 = AbstractC58532Px0.A02();
                    A02.A07("type.googleapis.com/google.crypto.tink.AesEaxKey");
                    PxQ pxQ6 = (PxQ) C60836RUv.DEFAULT_INSTANCE.A0F(C05F.A0Y);
                    C60818RUd A00 = AbstractC63119SdN.A00(rto);
                    C60836RUv c60836RUv = (C60836RUv) PxQ.A00(pxQ6);
                    A00.getClass();
                    c60836RUv.params_ = A00;
                    c60836RUv.bitField0_ |= 1;
                    ((C60836RUv) PxQ.A00(pxQ6)).keySize_ = rto.A01;
                    A04(A02, pxQ6);
                    pxH = AbstractC63119SdN.A01(rto.A03);
                    A02.A05(pxH);
                    RVD rvd22222 = (RVD) A02.A02();
                    return new T91(rvd22222, AbstractC58538Px6.A01(rvd22222.typeUrl_));
                case 4:
                    C58529Pwx c58529Pwx = (C58529Pwx) abstractC61590RqE;
                    AbstractC63120SdO.A01(c58529Pwx);
                    A02 = AbstractC58532Px0.A02();
                    A02.A07("type.googleapis.com/google.crypto.tink.AesGcmKey");
                    PxQ pxQ7 = (PxQ) C60824RUj.DEFAULT_INSTANCE.A0F(C05F.A0Y);
                    ((C60824RUj) PxQ.A00(pxQ7)).keySize_ = c58529Pwx.A01;
                    A04(A02, pxQ7);
                    pxH = AbstractC63120SdO.A00(c58529Pwx.A03);
                    A02.A05(pxH);
                    RVD rvd222222 = (RVD) A02.A02();
                    return new T91(rvd222222, AbstractC58538Px6.A01(rvd222222.typeUrl_));
                case 5:
                    RTM rtm = (RTM) abstractC61590RqE;
                    A02 = AbstractC58532Px0.A02();
                    A02.A07("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
                    PxQ pxQ8 = (PxQ) C60826RUl.DEFAULT_INSTANCE.A0F(C05F.A0Y);
                    ((C60826RUl) PxQ.A00(pxQ8)).keySize_ = rtm.A00;
                    A04(A02, pxQ8);
                    pxH = SV6.A00(rtm.A01);
                    A02.A05(pxH);
                    RVD rvd2222222 = (RVD) A02.A02();
                    return new T91(rvd2222222, AbstractC58538Px6.A01(rvd2222222.typeUrl_));
                case 6:
                    A02 = AbstractC58532Px0.A02();
                    A02.A07("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
                    A02.A06(C60815RUa.DEFAULT_INSTANCE.A0D());
                    pxH = SV7.A00(((RTK) abstractC61590RqE).A00);
                    A02.A05(pxH);
                    RVD rvd22222222 = (RVD) A02.A02();
                    return new T91(rvd22222222, AbstractC58538Px6.A01(rvd22222222.typeUrl_));
                case 7:
                    A02 = AbstractC58532Px0.A02();
                    A02.A07("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
                    A02.A06(C60820RUf.DEFAULT_INSTANCE.A0D());
                    pxH = SV8.A00(((RTL) abstractC61590RqE).A00);
                    A02.A05(pxH);
                    RVD rvd222222222 = (RVD) A02.A02();
                    return new T91(rvd222222222, AbstractC58538Px6.A01(rvd222222222.typeUrl_));
                case 8:
                    C58556PxX c58556PxX = (C58556PxX) abstractC61590RqE;
                    A02 = AbstractC58532Px0.A02();
                    A02.A07("type.googleapis.com/google.crypto.tink.AesSivKey");
                    PxQ pxQ9 = (PxQ) C60828RUn.DEFAULT_INSTANCE.A0F(C05F.A0Y);
                    ((C60828RUn) PxQ.A00(pxQ9)).keySize_ = c58556PxX.A00;
                    A04(A02, pxQ9);
                    SY3 sy3 = c58556PxX.A01;
                    Map map2 = SA0.A05;
                    if (map2.containsKey(sy3)) {
                        pxH = (PxH) map2.get(sy3);
                        A02.A05(pxH);
                        RVD rvd2222222222 = (RVD) A02.A02();
                        return new T91(rvd2222222222, AbstractC58538Px6.A01(rvd2222222222.typeUrl_));
                    }
                    throw AbstractC58320PtC.A19(sy3, "Unable to serialize variant: ", AbstractC166987dD.A1C());
                case 9:
                    C60789RTa c60789RTa = (C60789RTa) abstractC61590RqE;
                    A02 = AbstractC58532Px0.A02();
                    A02.A07("type.googleapis.com/google.crypto.tink.HpkePrivateKey");
                    PxQ pxQ10 = (PxQ) C60823RUi.DEFAULT_INSTANCE.A0F(C05F.A0Y);
                    C60840RUz A013 = AbstractC63331Shf.A01(c60789RTa);
                    C60823RUi c60823RUi = (C60823RUi) PxQ.A00(pxQ10);
                    A013.getClass();
                    c60823RUi.params_ = A013;
                    c60823RUi.bitField0_ |= 1;
                    A04(A02, pxQ10);
                    pxH = (PxH) AbstractC63331Shf.A00.A00(c60789RTa.A03);
                    A02.A05(pxH);
                    RVD rvd22222222222 = (RVD) A02.A02();
                    return new T91(rvd22222222222, AbstractC58538Px6.A01(rvd22222222222.typeUrl_));
                case 10:
                    C60790RTb c60790RTb = (C60790RTb) abstractC61590RqE;
                    A02 = AbstractC58532Px0.A02();
                    A02.A07("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
                    PxQ pxQ11 = (PxQ) C60822RUh.DEFAULT_INSTANCE.A0F(C05F.A0Y);
                    RV4 A022 = AbstractC63332Shg.A02(c60790RTb);
                    C60822RUh c60822RUh = (C60822RUh) PxQ.A00(pxQ11);
                    A022.getClass();
                    c60822RUh.params_ = A022;
                    c60822RUh.bitField0_ |= 1;
                    A04(A02, pxQ11);
                    pxH = (PxH) AbstractC63332Shg.A00.A00(c60790RTb.A04);
                    A02.A05(pxH);
                    RVD rvd222222222222 = (RVD) A02.A02();
                    return new T91(rvd222222222222, AbstractC58538Px6.A01(rvd222222222222.typeUrl_));
                case 11:
                    C60799RTk c60799RTk = (C60799RTk) abstractC61590RqE;
                    A02 = AbstractC58532Px0.A02();
                    A02.A07("type.googleapis.com/google.crypto.tink.AesCmacKey");
                    C60833RUs c60833RUs = C60833RUs.DEFAULT_INSTANCE;
                    Integer num2 = C05F.A0Y;
                    PxQ pxQ12 = (PxQ) c60833RUs.A0F(num2);
                    PxQ pxQ13 = (PxQ) C60816RUb.DEFAULT_INSTANCE.A0F(num2);
                    ((C60816RUb) PxQ.A00(pxQ13)).tagSize_ = c60799RTk.A01;
                    C60816RUb c60816RUb = (C60816RUb) pxQ13.A02();
                    C60833RUs c60833RUs2 = (C60833RUs) PxQ.A00(pxQ12);
                    c60816RUb.getClass();
                    c60833RUs2.params_ = c60816RUb;
                    c60833RUs2.bitField0_ |= 1;
                    ((C60833RUs) PxQ.A00(pxQ12)).keySize_ = c60799RTk.A00;
                    A04(A02, pxQ12);
                    pxH = AbstractC63121SdP.A01(c60799RTk.A02);
                    A02.A05(pxH);
                    RVD rvd2222222222222 = (RVD) A02.A02();
                    return new T91(rvd2222222222222, AbstractC58538Px6.A01(rvd2222222222222.typeUrl_));
                default:
                    C60800RTl c60800RTl = (C60800RTl) abstractC61590RqE;
                    A02 = AbstractC58532Px0.A02();
                    A02.A07("type.googleapis.com/google.crypto.tink.HmacKey");
                    PxQ pxQ14 = (PxQ) RV7.DEFAULT_INSTANCE.A0F(C05F.A0Y);
                    C60830RUp A002 = SVE.A00(c60800RTl);
                    RV7 rv73 = (RV7) PxQ.A00(pxQ14);
                    A002.getClass();
                    rv73.params_ = A002;
                    rv73.bitField0_ |= 1;
                    ((RV7) PxQ.A00(pxQ14)).keySize_ = c60800RTl.A00;
                    A04(A02, pxQ14);
                    pxH = (PxH) SVE.A01.A00(c60800RTl.A03);
                    A02.A05(pxH);
                    RVD rvd22222222222222 = (RVD) A02.A02();
                    return new T91(rvd22222222222222, AbstractC58538Px6.A01(rvd22222222222222.typeUrl_));
            }
        }
        throw AbstractC58321PtD.A11(c62741SOi, "No Key Format serializer for ", AbstractC166987dD.A1C());
    }

    public C58550PxN() {
        HashMap A1G = AbstractC166987dD.A1G();
        this.A00 = new AtomicReference(new C62586SHl(AbstractC166987dD.A1G(), A1G, AbstractC166987dD.A1G(), AbstractC166987dD.A1G()));
    }

    public static C58535Px3 A00(PxQ pxQ) {
        return pxQ.A02().A0D();
    }

    public static C58552PxP A02(AbstractC58536Px4 abstractC58536Px4) {
        return new C58552PxP(C58526Pwu.A00(abstractC58536Px4.A04()));
    }

    public static void A04(RUZ ruz, PxQ pxQ) {
        ruz.A06(pxQ.A02().A0D());
    }
}
