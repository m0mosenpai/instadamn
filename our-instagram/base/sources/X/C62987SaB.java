package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.SaB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62987SaB {
    public static C62987SaB A01 = new C62987SaB();
    public final AtomicReference A00 = new AtomicReference(new C62504SEg(AbstractC166987dD.A1G(), AbstractC166987dD.A1G()));

    public final synchronized void A01(InterfaceC65549TmS wrapper) {
        AtomicReference atomicReference = this.A00;
        C62504SEg c62504SEg = (C62504SEg) atomicReference.get();
        HashMap A10 = AbstractC58318PtA.A10(c62504SEg.A00);
        HashMap A102 = AbstractC58318PtA.A10(c62504SEg.A01);
        Class BgT = wrapper.BgT();
        if (A102.containsKey(BgT)) {
            Object obj = A102.get(BgT);
            if (!obj.equals(wrapper) || !wrapper.equals(obj)) {
                throw AbstractC58320PtC.A19(BgT, "Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type", AbstractC166987dD.A1C());
            }
        } else {
            A102.put(BgT, wrapper);
        }
        atomicReference.set(new C62504SEg(A10, A102));
    }

    public final synchronized void A02(C62549SGa constructor) {
        AtomicReference atomicReference = this.A00;
        C62504SEg c62504SEg = (C62504SEg) atomicReference.get();
        HashMap A10 = AbstractC58318PtA.A10(c62504SEg.A00);
        HashMap A102 = AbstractC58318PtA.A10(c62504SEg.A01);
        C58527Pwv c58527Pwv = new C58527Pwv(constructor.A00, constructor.A01);
        if (A10.containsKey(c58527Pwv)) {
            Object obj = A10.get(c58527Pwv);
            if (!obj.equals(constructor) || !constructor.equals(obj)) {
                throw AbstractC58320PtC.A19(c58527Pwv, "Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ", AbstractC166987dD.A1C());
            }
        } else {
            A10.put(c58527Pwv, constructor);
        }
        atomicReference.set(new C62504SEg(A10, A102));
    }

    public final Object A00(AbstractC61589RqD key, Class primitiveClass) {
        EnumC61105RfK enumC61105RfK;
        InterfaceC65273Th3 c64316T8z;
        byte[] bArr;
        ByteBuffer allocate;
        InterfaceC65518Tln A012;
        C58526Pwu c58526Pwu;
        byte[] bArr2;
        ByteBuffer allocate2;
        byte[] bArr3;
        ByteBuffer allocate3;
        byte[] bArr4;
        ByteBuffer allocate4;
        byte[] bArr5;
        ByteBuffer allocate5;
        C62504SEg c62504SEg = (C62504SEg) this.A00.get();
        C58527Pwv c58527Pwv = new C58527Pwv(key.getClass(), primitiveClass);
        Map map = c62504SEg.A00;
        if (map.containsKey(c58527Pwv)) {
            switch (((C58360Pu0) ((C62549SGa) map.get(c58527Pwv)).A02).A00) {
                case 0:
                    return new C64305T8o((C60798RTj) key);
                case 1:
                    return new T94((C60798RTj) key);
                case 2:
                    return T8X.A00((RTE) key);
                case 3:
                    return T8Y.A00((RTC) key);
                case 4:
                    RTB rtb = (RTB) key;
                    if (T8Z.A05.A00()) {
                        RTO rto = rtb.A00;
                        int i = rto.A02;
                        if (i == 16) {
                            return new T8Z(rtb.A02.A00.A01(), rtb.A01.A01(), rto.A00);
                        }
                        throw AbstractC58320PtC.A1A("AesEaxJce only supports 16 byte tag size, not ", i);
                    }
                    throw AbstractC58318PtA.A0x("Can not use AES-EAX in FIPS-mode.");
                case 5:
                    RTD rtd = (RTD) key;
                    ThreadLocal threadLocal = T8V.A02;
                    return new T8V(rtd.A02.A00.A01(), rtd.A01.A01());
                case 6:
                    C60795RTg c60795RTg = (C60795RTg) key;
                    C62717SNg c62717SNg = C64300T8j.A06;
                    C60790RTb c60790RTb = c60795RTg.A00;
                    EnumC61105RfK enumC61105RfK2 = (EnumC61105RfK) c62717SNg.A00(c60790RTb.A01);
                    ECPoint eCPoint = c60795RTg.A04;
                    byte[] byteArray = eCPoint.getAffineX().toByteArray();
                    byte[] byteArray2 = eCPoint.getAffineY().toByteArray();
                    ECParameterSpec A00 = AbstractC63316ShO.A00(enumC61105RfK2);
                    ECPoint eCPoint2 = new ECPoint(new BigInteger(1, byteArray), new BigInteger(1, byteArray2));
                    AbstractC63391SjD.A07(eCPoint2, A00.getCurve());
                    ECPublicKey eCPublicKey = (ECPublicKey) InterfaceC65621ToC.A01(A00, eCPoint2);
                    byte[] bArr6 = new byte[0];
                    C58526Pwu c58526Pwu2 = c60790RTb.A05;
                    if (c58526Pwu2 != null) {
                        bArr6 = c58526Pwu2.A01();
                    }
                    String A013 = C64300T8j.A01(c60790RTb.A02);
                    return new C64300T8j(C64300T8j.A00(c60790RTb.A00), (EnumC61106RfL) C64300T8j.A07.A00(c60790RTb.A03), A013, eCPublicKey, bArr6, c60795RTg.A01.A01());
                case 7:
                    C60793RTe c60793RTe = (C60793RTe) key;
                    C62717SNg c62717SNg2 = C64300T8j.A06;
                    C60795RTg c60795RTg2 = c60793RTe.A00;
                    C60790RTb c60790RTb2 = c60795RTg2.A00;
                    EnumC61105RfK enumC61105RfK3 = (EnumC61105RfK) c62717SNg2.A00(c60790RTb2.A01);
                    byte[] A002 = SSS.A00(c60793RTe.A01.A00);
                    ECPrivateKey eCPrivateKey = (ECPrivateKey) ((KeyFactory) InterfaceC65621ToC.A00(C62890SVv.A03, "EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, A002), AbstractC63316ShO.A00(enumC61105RfK3)));
                    byte[] bArr7 = new byte[0];
                    C58526Pwu c58526Pwu3 = c60790RTb2.A05;
                    if (c58526Pwu3 != null) {
                        bArr7 = c58526Pwu3.A01();
                    }
                    C64300T8j.A01(c60790RTb2.A02);
                    C64300T8j.A07.A00(c60790RTb2.A03);
                    InterfaceC65522Tlr A003 = C64300T8j.A00(c60790RTb2.A00);
                    if (c60795RTg2 instanceof C60794RTf) {
                        throw new NullPointerException("outputPrefix");
                    }
                    return new C64297T8g(A003, eCPrivateKey, bArr7, c60795RTg2.A01.A01());
                case 8:
                    C60794RTf c60794RTf = (C60794RTf) key;
                    C60789RTa c60789RTa = c60794RTf.A00;
                    C58526Pwu c58526Pwu4 = c60794RTf.A02;
                    return new C64301T8k(C64301T8k.A00(c60789RTa.A01), C64301T8k.A01(c60789RTa.A00), C64301T8k.A02(c60789RTa.A02), c58526Pwu4, c60794RTf.A01);
                case 9:
                    C60792RTd c60792RTd = (C60792RTd) key;
                    C60794RTf c60794RTf2 = c60792RTd.A00;
                    C60789RTa c60789RTa2 = c60794RTf2.A00;
                    RTZ rtz = c60789RTa2.A02;
                    InterfaceC65520Tlp A02 = C64301T8k.A02(rtz);
                    C62986SaA A004 = C64301T8k.A00(c60789RTa2.A01);
                    InterfaceC65550TmT A014 = C64301T8k.A01(c60789RTa2.A00);
                    RTZ rtz2 = RTZ.A03;
                    if (!rtz.equals(rtz2) && !rtz.equals(RTZ.A00) && !rtz.equals(RTZ.A01) && !rtz.equals(RTZ.A02)) {
                        throw AbstractC58318PtA.A0x("Unrecognized HPKE KEM identifier");
                    }
                    if (rtz.equals(rtz2)) {
                        byte[] A015 = c60792RTd.A01.A00.A01();
                        c64316T8z = new T90(A015, SSU.A00(A015));
                    } else {
                        RTZ rtz3 = RTZ.A00;
                        if (!rtz.equals(rtz3) && !rtz.equals(RTZ.A01) && !rtz.equals(RTZ.A02)) {
                            throw AbstractC58318PtA.A0x("Unrecognized HPKE KEM identifier");
                        }
                        byte[] A016 = c60792RTd.A01.A00.A01();
                        byte[] A017 = c60794RTf2.A02.A01();
                        if (rtz.equals(rtz3)) {
                            enumC61105RfK = EnumC61105RfK.NIST_P256;
                        } else if (rtz.equals(RTZ.A01)) {
                            enumC61105RfK = EnumC61105RfK.NIST_P384;
                        } else if (rtz.equals(RTZ.A02)) {
                            enumC61105RfK = EnumC61105RfK.NIST_P521;
                        } else {
                            throw AbstractC58318PtA.A0x("Unrecognized NIST HPKE KEM identifier");
                        }
                        ECParameterSpec A005 = AbstractC63316ShO.A00(enumC61105RfK);
                        ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(AbstractC63316ShO.A01(A005.getCurve(), A017), A005);
                        InterfaceC65621ToC interfaceC65621ToC = C62890SVv.A03.A00;
                        ECPublicKey eCPublicKey2 = (ECPublicKey) ((KeyFactory) interfaceC65621ToC.BIY("EC")).generatePublic(eCPublicKeySpec);
                        ECPrivateKey eCPrivateKey2 = (ECPrivateKey) ((KeyFactory) interfaceC65621ToC.BIY("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, A016), AbstractC63316ShO.A00(enumC61105RfK)));
                        AbstractC63316ShO.A02(eCPrivateKey2, eCPublicKey2);
                        AbstractC63391SjD.A07(eCPublicKey2.getW(), eCPrivateKey2.getParams().getCurve());
                        c64316T8z = new C64316T8z(A016, A017);
                    }
                    if (c60794RTf2 instanceof C60794RTf) {
                        return new C64296T8f(A004, A014, A02, c64316T8z, c60794RTf2.A01);
                    }
                    throw new NullPointerException("outputPrefix");
                case 10:
                    C58551PxO c58551PxO = ((RT5) key).A00;
                    InterfaceC65518Tln interfaceC65518Tln = (InterfaceC65518Tln) C63113SdH.A00(AbstractC58532Px0.A01(c58551PxO), InterfaceC65518Tln.class);
                    PxH pxH = c58551PxO.A01;
                    int ordinal = pxH.ordinal();
                    if (ordinal != 3) {
                        if (ordinal != 2 && ordinal != 4) {
                            if (ordinal == 1) {
                                allocate = ByteBuffer.allocate(5);
                                allocate.put((byte) 1);
                            } else {
                                throw AbstractC58320PtC.A19(pxH, "unknown output prefix type ", AbstractC166987dD.A1C());
                            }
                        } else {
                            allocate = ByteBuffer.allocate(5);
                            allocate.put((byte) 0);
                        }
                        bArr = AbstractC58320PtC.A1Y(c58551PxO.A04, allocate);
                    } else {
                        bArr = new byte[0];
                    }
                    return new T8P(interfaceC65518Tln, bArr);
                case 11:
                    RTH rth = (RTH) key;
                    C62549SGa c62549SGa = S9T.A02;
                    Object obj = T8U.A02.get();
                    byte[] A018 = rth.A02.A00.A01();
                    byte[] A019 = rth.A01.A01();
                    if (obj != null) {
                        return new T8U(A018, A019);
                    }
                    return new T8Q(A018, A019);
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    RTF rtf = (RTF) key;
                    Th6 th6 = S9U.A01;
                    String str = rtf.A00.A01;
                    A012 = AbstractC62852STz.A00(str).A01(str);
                    c58526Pwu = rtf.A01;
                    break;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    RTG rtg = (RTG) key;
                    Th6 th62 = S9V.A01;
                    RTP rtp = rtg.A00;
                    String str2 = rtp.A02;
                    RT7 rt7 = rtp.A00;
                    try {
                        A012 = new T8W(AbstractC62852STz.A00(str2).A01(str2), (RVD) AbstractC58533Px1.A06(C58534Px2.A00(), RVD.DEFAULT_INSTANCE, SSQ.A01(rt7)));
                        c58526Pwu = rtg.A01;
                        break;
                    } catch (C61032Re1 e) {
                        throw new GeneralSecurityException(e);
                    }
                case 14:
                    RTI rti = (RTI) key;
                    Th6 th63 = AbstractC62379S9e.A01;
                    EnumC61068Rei enumC61068Rei = T8T.A02;
                    Object obj2 = T8U.A02.get();
                    byte[] A0110 = rti.A02.A00.A01();
                    byte[] A0111 = rti.A01.A01();
                    if (obj2 != null) {
                        return new T8T(A0110, A0111);
                    }
                    return new T8R(A0110, A0111);
                case Process.SIGTERM /* 15 */:
                    RT6 rt6 = (RT6) key;
                    C58556PxX c58556PxX = rt6.A00;
                    C62549SGa c62549SGa2 = AbstractC62380S9f.A03;
                    int i2 = c58556PxX.A00;
                    if (i2 == 64) {
                        Collection collection = C64293T8c.A04;
                        return new C64293T8c(rt6.A01, rt6.A02.A00.A01());
                    }
                    throw new InvalidAlgorithmParameterException(AnonymousClass001.A0n("invalid key size: ", ". Valid keys must have ", " bytes.", i2, 64));
                case 16:
                    C58551PxO c58551PxO2 = ((RT5) key).A00;
                    InterfaceC65519Tlo interfaceC65519Tlo = (InterfaceC65519Tlo) C63113SdH.A00(AbstractC58532Px0.A01(c58551PxO2), InterfaceC65519Tlo.class);
                    PxH pxH2 = c58551PxO2.A01;
                    int ordinal2 = pxH2.ordinal();
                    if (ordinal2 != 3) {
                        if (ordinal2 != 2 && ordinal2 != 4) {
                            if (ordinal2 == 1) {
                                allocate2 = ByteBuffer.allocate(5);
                                allocate2.put((byte) 1);
                            } else {
                                throw AbstractC58320PtC.A1A("unknown output prefix type ", pxH2.A01());
                            }
                        } else {
                            allocate2 = ByteBuffer.allocate(5);
                            allocate2.put((byte) 0);
                        }
                        bArr2 = AbstractC58320PtC.A1Y(c58551PxO2.A04, allocate2);
                    } else {
                        bArr2 = new byte[0];
                    }
                    return new C64292T8b(interfaceC65519Tlo, pxH2, bArr2);
                case 17:
                    C58551PxO c58551PxO3 = ((RT5) key).A00;
                    InterfaceC65269Tgz interfaceC65269Tgz = (InterfaceC65269Tgz) C63113SdH.A00(AbstractC58532Px0.A01(c58551PxO3), InterfaceC65269Tgz.class);
                    PxH pxH3 = c58551PxO3.A01;
                    int ordinal3 = pxH3.ordinal();
                    if (ordinal3 != 3) {
                        if (ordinal3 != 2 && ordinal3 != 4) {
                            if (ordinal3 == 1) {
                                allocate3 = ByteBuffer.allocate(5);
                                allocate3.put((byte) 1);
                            } else {
                                throw AbstractC58320PtC.A19(pxH3, "unknown output prefix type ", AbstractC166987dD.A1C());
                            }
                        } else {
                            allocate3 = ByteBuffer.allocate(5);
                            allocate3.put((byte) 0);
                        }
                        bArr3 = AbstractC58320PtC.A1Y(c58551PxO3.A04, allocate3);
                    } else {
                        bArr3 = new byte[0];
                    }
                    return new C64295T8e(interfaceC65269Tgz, bArr3);
                case 18:
                    C58551PxO c58551PxO4 = ((RT5) key).A00;
                    InterfaceC65427Tjy interfaceC65427Tjy = (InterfaceC65427Tjy) C63113SdH.A00(AbstractC58532Px0.A01(c58551PxO4), InterfaceC65427Tjy.class);
                    PxH pxH4 = c58551PxO4.A01;
                    int ordinal4 = pxH4.ordinal();
                    if (ordinal4 != 3) {
                        if (ordinal4 != 2 && ordinal4 != 4) {
                            if (ordinal4 == 1) {
                                allocate4 = ByteBuffer.allocate(5);
                                allocate4.put((byte) 1);
                            } else {
                                throw AbstractC58320PtC.A19(pxH4, "unknown output prefix type ", AbstractC166987dD.A1C());
                            }
                        } else {
                            allocate4 = ByteBuffer.allocate(5);
                            allocate4.put((byte) 0);
                        }
                        bArr4 = AbstractC58320PtC.A1Y(c58551PxO4.A04, allocate4);
                    } else {
                        bArr4 = new byte[0];
                    }
                    return new C64299T8i(interfaceC65427Tjy, bArr4);
                case Process.SIGSTOP /* 19 */:
                    C60797RTi c60797RTi = (C60797RTi) key;
                    C62549SGa c62549SGa3 = AbstractC62381S9g.A02;
                    if (c60797RTi.A00.A00 == 32) {
                        return new T93(c60797RTi);
                    }
                    throw AbstractC58318PtA.A0x("AesCmacKey size wrong, must be 32 bytes");
                case 20:
                    C60797RTi c60797RTi2 = (C60797RTi) key;
                    C62549SGa c62549SGa4 = AbstractC62381S9g.A02;
                    if (c60797RTi2.A00.A00 == 32) {
                        return new C64305T8o(c60797RTi2);
                    }
                    throw AbstractC58318PtA.A0x("AesCmacKey size wrong, must be 32 bytes");
                default:
                    C58551PxO c58551PxO5 = ((RT5) key).A00;
                    InterfaceC65429Tk0 interfaceC65429Tk0 = (InterfaceC65429Tk0) C63113SdH.A00(AbstractC58532Px0.A01(c58551PxO5), InterfaceC65429Tk0.class);
                    int ordinal5 = c58551PxO5.A01.ordinal();
                    if (ordinal5 != 3) {
                        if (ordinal5 != 2 && ordinal5 != 4) {
                            if (ordinal5 == 1) {
                                allocate5 = ByteBuffer.allocate(5);
                                allocate5.put((byte) 1);
                            } else {
                                throw AbstractC58318PtA.A0x("unknown output prefix type");
                            }
                        } else {
                            allocate5 = ByteBuffer.allocate(5);
                            allocate5.put((byte) 0);
                        }
                        bArr5 = AbstractC58320PtC.A1Y(c58551PxO5.A04, allocate5);
                    } else {
                        bArr5 = new byte[0];
                    }
                    return new C64303T8m(interfaceC65429Tk0, bArr5);
            }
            return new T8P(A012, c58526Pwu.A01());
        }
        throw AbstractC58321PtD.A11(c58527Pwv, "No PrimitiveConstructor for ", AbstractC166987dD.A1C());
    }
}
