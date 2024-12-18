package X;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: X.Px1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58533Px1 extends AbstractC58532Px0 {
    public static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    public static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    public static final int UNINITIALIZED_HASH_CODE = 0;
    public static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    public static Map defaultInstanceMap = AbstractC58318PtA.A14();
    public int memoizedSerializedSize = -1;
    public C58555PxV unknownFields = C58555PxV.A05;

    /* JADX WARN: Type inference failed for: r0v8, types: [X.Re1, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.Re1, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.Re1, java.io.IOException] */
    public static AbstractC58533Px1 A06(C58534Px2 c58534Px2, AbstractC58533Px1 abstractC58533Px1, byte[] bArr) {
        C61032Re1 c61032Re1;
        int length = bArr.length;
        AbstractC58533Px1 abstractC58533Px12 = (AbstractC58533Px1) abstractC58533Px1.A0F(C05F.A0N);
        try {
            InterfaceC65595Tne A0d = AbstractC58320PtC.A0d(abstractC58533Px12);
            A0d.CpO(new C58548PxL(c58534Px2), abstractC58533Px12, bArr, 0, length);
            A0d.Cmk(abstractC58533Px12);
            A09(abstractC58533Px12);
            return abstractC58533Px12;
        } catch (C61032Re1 e) {
            boolean z = e.A01;
            c61032Re1 = e;
            if (z) {
                ?? iOException = new IOException(e.getMessage(), e);
                iOException.A00 = null;
                c61032Re1 = iOException;
            }
            c61032Re1.A00 = abstractC58533Px12;
            throw c61032Re1;
        } catch (TXL e2) {
            ?? iOException2 = new IOException(e2.getMessage());
            iOException2.A00 = null;
            c61032Re1 = iOException2;
            c61032Re1.A00 = abstractC58533Px12;
            throw c61032Re1;
        } catch (IOException e3) {
            if (e3.getCause() instanceof C61032Re1) {
                throw e3.getCause();
            }
            ?? iOException3 = new IOException(e3.getMessage(), e3);
            iOException3.A00 = null;
            c61032Re1 = iOException3;
            c61032Re1.A00 = abstractC58533Px12;
            throw c61032Re1;
        } catch (IndexOutOfBoundsException unused) {
            c61032Re1 = C61032Re1.A01("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            c61032Re1.A00 = abstractC58533Px12;
            throw c61032Re1;
        }
    }

    public static T9C A03(AbstractC58533Px1 abstractC58533Px1) {
        return new T9C(abstractC58533Px1);
    }

    public static AbstractC58533Px1 A04(AbstractC58536Px4 defaultInstance, C58534Px2 data, AbstractC58533Px1 extensionRegistry) {
        C58535Px3 c58535Px3 = (C58535Px3) defaultInstance;
        byte[] bArr = c58535Px3.A00;
        int A05 = c58535Px3.A05();
        int A02 = c58535Px3.A02();
        C58539Px7 c58539Px7 = new C58539Px7(bArr, A05, A02);
        try {
            c58539Px7.A0G(A02);
            AbstractC58533Px1 A052 = A05(c58539Px7, data, extensionRegistry);
            try {
                c58539Px7.A0P();
                A09(A052);
                return A052;
            } catch (C61032Re1 e) {
                e.A00 = A052;
                throw e;
            }
        } catch (C61032Re1 e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Throwable, X.Re1, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.Re1, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.Re1, java.io.IOException] */
    public static AbstractC58533Px1 A05(AbstractC61611Rqa abstractC61611Rqa, C58534Px2 c58534Px2, AbstractC58533Px1 abstractC58533Px1) {
        C61032Re1 c61032Re1;
        AbstractC58533Px1 abstractC58533Px12 = (AbstractC58533Px1) abstractC58533Px1.A0F(C05F.A0N);
        try {
            InterfaceC65595Tne A0d = AbstractC58320PtC.A0d(abstractC58533Px12);
            C58545PxD c58545PxD = abstractC61611Rqa.A01;
            if (c58545PxD == null) {
                c58545PxD = new C58545PxD(abstractC61611Rqa);
            }
            A0d.CpN(c58545PxD, c58534Px2, abstractC58533Px12);
            A0d.Cmk(abstractC58533Px12);
            return abstractC58533Px12;
        } catch (C61032Re1 e) {
            boolean z = e.A01;
            c61032Re1 = e;
            if (z) {
                ?? iOException = new IOException(e.getMessage(), e);
                iOException.A00 = null;
                c61032Re1 = iOException;
            }
            c61032Re1.A00 = abstractC58533Px12;
            throw c61032Re1;
        } catch (TXL e2) {
            ?? iOException2 = new IOException(e2.getMessage());
            iOException2.A00 = null;
            iOException2.A00 = abstractC58533Px12;
            throw iOException2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof C61032Re1) {
                throw e3.getCause();
            }
            ?? iOException3 = new IOException(e3.getMessage(), e3);
            iOException3.A00 = null;
            c61032Re1 = iOException3;
            c61032Re1.A00 = abstractC58533Px12;
            throw c61032Re1;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof C61032Re1) {
                throw e4.getCause();
            }
            throw e4;
        }
    }

    public static C62587SHm A07(AbstractC58532Px0 abstractC58532Px0, String str, Object[] objArr) {
        return new C62587SHm(abstractC58532Px0, str, objArr);
    }

    public static void A0A(AbstractC58533Px1 clazz, Class defaultInstance) {
        clazz.memoizedSerializedSize &= Integer.MAX_VALUE;
        defaultInstanceMap.put(defaultInstance, clazz);
    }

    public static final boolean A0B(AbstractC58533Px1 abstractC58533Px1) {
        byte byteValue = ((Number) abstractC58533Px1.A0F(C05F.A00)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean CWb = C58540Px8.A02.A00(abstractC58533Px1.getClass()).CWb(abstractC58533Px1);
        abstractC58533Px1.A0F(C05F.A01);
        return CWb;
    }

    public final Object A0F(Integer num) {
        InterfaceC65281ThE interfaceC65281ThE;
        InterfaceC65281ThE interfaceC65281ThE2;
        InterfaceC65281ThE interfaceC65281ThE3;
        InterfaceC65281ThE interfaceC65281ThE4;
        InterfaceC65281ThE interfaceC65281ThE5;
        InterfaceC65281ThE interfaceC65281ThE6;
        InterfaceC65281ThE interfaceC65281ThE7;
        InterfaceC65281ThE interfaceC65281ThE8;
        InterfaceC65281ThE interfaceC65281ThE9;
        InterfaceC65281ThE interfaceC65281ThE10;
        InterfaceC65281ThE interfaceC65281ThE11;
        InterfaceC65281ThE interfaceC65281ThE12;
        InterfaceC65281ThE interfaceC65281ThE13;
        InterfaceC65281ThE interfaceC65281ThE14;
        InterfaceC65281ThE interfaceC65281ThE15;
        InterfaceC65281ThE interfaceC65281ThE16;
        InterfaceC65281ThE interfaceC65281ThE17;
        InterfaceC65281ThE interfaceC65281ThE18;
        InterfaceC65281ThE interfaceC65281ThE19;
        InterfaceC65281ThE interfaceC65281ThE20;
        InterfaceC65281ThE interfaceC65281ThE21;
        InterfaceC65281ThE interfaceC65281ThE22;
        InterfaceC65281ThE interfaceC65281ThE23;
        InterfaceC65281ThE interfaceC65281ThE24;
        InterfaceC65281ThE interfaceC65281ThE25;
        InterfaceC65281ThE interfaceC65281ThE26;
        InterfaceC65281ThE interfaceC65281ThE27;
        InterfaceC65281ThE interfaceC65281ThE28;
        InterfaceC65281ThE interfaceC65281ThE29;
        InterfaceC65281ThE interfaceC65281ThE30;
        InterfaceC65281ThE interfaceC65281ThE31;
        InterfaceC65281ThE interfaceC65281ThE32;
        InterfaceC65281ThE interfaceC65281ThE33;
        InterfaceC65281ThE interfaceC65281ThE34;
        InterfaceC65281ThE interfaceC65281ThE35;
        InterfaceC65281ThE interfaceC65281ThE36;
        InterfaceC65281ThE interfaceC65281ThE37;
        InterfaceC65281ThE interfaceC65281ThE38;
        InterfaceC65281ThE interfaceC65281ThE39;
        InterfaceC65281ThE interfaceC65281ThE40;
        InterfaceC65281ThE interfaceC65281ThE41;
        InterfaceC65281ThE interfaceC65281ThE42;
        InterfaceC65281ThE interfaceC65281ThE43;
        InterfaceC65281ThE interfaceC65281ThE44;
        InterfaceC65281ThE interfaceC65281ThE45;
        InterfaceC65281ThE interfaceC65281ThE46;
        InterfaceC65281ThE interfaceC65281ThE47;
        if (this instanceof PxJ) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(PxJ.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", PxI.class});
                case 3:
                    return new PxJ();
                case 4:
                    return new C58553PxR();
                case 5:
                    return PxJ.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE48 = PxJ.PARSER;
                    if (interfaceC65281ThE48 == null) {
                        synchronized (PxJ.class) {
                            interfaceC65281ThE47 = PxJ.PARSER;
                            if (interfaceC65281ThE47 == null) {
                                C58534Px2 c58534Px2 = T9C.A01;
                                interfaceC65281ThE47 = A03(PxJ.DEFAULT_INSTANCE);
                                PxJ.PARSER = interfaceC65281ThE47;
                            }
                        }
                        return interfaceC65281ThE47;
                    }
                    return interfaceC65281ThE48;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof RVD) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(RVD.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
                case 3:
                    return new RVD();
                case 4:
                    return new RUZ();
                case 5:
                    return RVD.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE49 = RVD.PARSER;
                    if (interfaceC65281ThE49 == null) {
                        synchronized (RVD.class) {
                            interfaceC65281ThE46 = RVD.PARSER;
                            if (interfaceC65281ThE46 == null) {
                                C58534Px2 c58534Px22 = T9C.A01;
                                interfaceC65281ThE46 = A03(RVD.DEFAULT_INSTANCE);
                                RVD.PARSER = interfaceC65281ThE46;
                            }
                        }
                        return interfaceC65281ThE46;
                    }
                    return interfaceC65281ThE49;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof C60827RUm) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(C60827RUm.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
                case 3:
                    return new C60827RUm();
                case 4:
                    return new RU5();
                case 5:
                    return C60827RUm.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE50 = C60827RUm.PARSER;
                    if (interfaceC65281ThE50 == null) {
                        synchronized (C60827RUm.class) {
                            interfaceC65281ThE45 = C60827RUm.PARSER;
                            if (interfaceC65281ThE45 == null) {
                                C58534Px2 c58534Px23 = T9C.A01;
                                interfaceC65281ThE45 = A03(C60827RUm.DEFAULT_INSTANCE);
                                C60827RUm.PARSER = interfaceC65281ThE45;
                            }
                        }
                        return interfaceC65281ThE45;
                    }
                    return interfaceC65281ThE50;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof C58559Pxb) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(C58559Pxb.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
                case 3:
                    return new C58559Pxb();
                case 4:
                    return new RU1();
                case 5:
                    return C58559Pxb.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE51 = C58559Pxb.PARSER;
                    if (interfaceC65281ThE51 == null) {
                        synchronized (C58559Pxb.class) {
                            interfaceC65281ThE44 = C58559Pxb.PARSER;
                            if (interfaceC65281ThE44 == null) {
                                C58534Px2 c58534Px24 = T9C.A01;
                                interfaceC65281ThE44 = A03(C58559Pxb.DEFAULT_INSTANCE);
                                C58559Pxb.PARSER = interfaceC65281ThE44;
                            }
                        }
                        return interfaceC65281ThE44;
                    }
                    return interfaceC65281ThE51;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof C58558Pxa) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(C58558Pxa.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003ဉ\u0000", new Object[]{"bitField0_", "encryptedKeyset_", "keysetInfo_"});
                case 3:
                    return new C58558Pxa();
                case 4:
                    return new RUF();
                case 5:
                    return C58558Pxa.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE52 = C58558Pxa.PARSER;
                    if (interfaceC65281ThE52 == null) {
                        synchronized (C58558Pxa.class) {
                            interfaceC65281ThE43 = C58558Pxa.PARSER;
                            if (interfaceC65281ThE43 == null) {
                                C58534Px2 c58534Px25 = T9C.A01;
                                interfaceC65281ThE43 = A03(C58558Pxa.DEFAULT_INSTANCE);
                                C58558Pxa.PARSER = interfaceC65281ThE43;
                            }
                        }
                        return interfaceC65281ThE43;
                    }
                    return interfaceC65281ThE52;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof C60828RUn) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(C60828RUn.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"keySize_", "version_"});
                case 3:
                    return new AbstractC58533Px1();
                case 4:
                    return new RU6();
                case 5:
                    return C60828RUn.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE53 = C60828RUn.PARSER;
                    if (interfaceC65281ThE53 == null) {
                        synchronized (C60828RUn.class) {
                            interfaceC65281ThE42 = C60828RUn.PARSER;
                            if (interfaceC65281ThE42 == null) {
                                C58534Px2 c58534Px26 = T9C.A01;
                                interfaceC65281ThE42 = A03(C60828RUn.DEFAULT_INSTANCE);
                                C60828RUn.PARSER = interfaceC65281ThE42;
                            }
                        }
                        return interfaceC65281ThE42;
                    }
                    return interfaceC65281ThE53;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof C60824RUj) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(C60824RUj.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"keySize_", "version_"});
                case 3:
                    return new AbstractC58533Px1();
                case 4:
                    return new RU2();
                case 5:
                    return C60824RUj.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE54 = C60824RUj.PARSER;
                    if (interfaceC65281ThE54 == null) {
                        synchronized (C60824RUj.class) {
                            interfaceC65281ThE41 = C60824RUj.PARSER;
                            if (interfaceC65281ThE41 == null) {
                                C58534Px2 c58534Px27 = T9C.A01;
                                interfaceC65281ThE41 = A03(C60824RUj.DEFAULT_INSTANCE);
                                C60824RUj.PARSER = interfaceC65281ThE41;
                            }
                        }
                        return interfaceC65281ThE41;
                    }
                    return interfaceC65281ThE54;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof C58565Pxh) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(C58565Pxh.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", C58566Pxi.class});
                case 3:
                    return new C58565Pxh();
                case 4:
                    return new RUP();
                case 5:
                    return C58565Pxh.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE55 = C58565Pxh.PARSER;
                    if (interfaceC65281ThE55 == null) {
                        synchronized (C58565Pxh.class) {
                            interfaceC65281ThE40 = C58565Pxh.PARSER;
                            if (interfaceC65281ThE40 == null) {
                                C58534Px2 c58534Px28 = T9C.A01;
                                interfaceC65281ThE40 = A03(C58565Pxh.DEFAULT_INSTANCE);
                                C58565Pxh.PARSER = interfaceC65281ThE40;
                            }
                        }
                        return interfaceC65281ThE40;
                    }
                    return interfaceC65281ThE55;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof C58566Pxi) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(C58566Pxi.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
                case 3:
                    return new C58566Pxi();
                case 4:
                    return new RUQ();
                case 5:
                    return C58566Pxi.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE56 = C58566Pxi.PARSER;
                    if (interfaceC65281ThE56 == null) {
                        synchronized (C58566Pxi.class) {
                            interfaceC65281ThE39 = C58566Pxi.PARSER;
                            if (interfaceC65281ThE39 == null) {
                                C58534Px2 c58534Px29 = T9C.A01;
                                interfaceC65281ThE39 = A03(C58566Pxi.DEFAULT_INSTANCE);
                                C58566Pxi.PARSER = interfaceC65281ThE39;
                            }
                        }
                        return interfaceC65281ThE39;
                    }
                    return interfaceC65281ThE56;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof PxI) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(PxI.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"bitField0_", "keyData_", "status_", "keyId_", "outputPrefixType_"});
                case 3:
                    return new AbstractC58533Px1();
                case 4:
                    return new RUO();
                case 5:
                    return PxI.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE57 = PxI.PARSER;
                    if (interfaceC65281ThE57 == null) {
                        synchronized (PxI.class) {
                            interfaceC65281ThE38 = PxI.PARSER;
                            if (interfaceC65281ThE38 == null) {
                                C58534Px2 c58534Px210 = T9C.A01;
                                interfaceC65281ThE38 = A03(PxI.DEFAULT_INSTANCE);
                                PxI.PARSER = interfaceC65281ThE38;
                            }
                        }
                        return interfaceC65281ThE38;
                    }
                    return interfaceC65281ThE57;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof PxG) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(PxG.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
                case 3:
                    return new PxG();
                case 4:
                    return new RUY();
                case 5:
                    return PxG.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE58 = PxG.PARSER;
                    if (interfaceC65281ThE58 == null) {
                        synchronized (PxG.class) {
                            interfaceC65281ThE37 = PxG.PARSER;
                            if (interfaceC65281ThE37 == null) {
                                C58534Px2 c58534Px211 = T9C.A01;
                                interfaceC65281ThE37 = A03(PxG.DEFAULT_INSTANCE);
                                PxG.PARSER = interfaceC65281ThE37;
                            }
                        }
                        return interfaceC65281ThE37;
                    }
                    return interfaceC65281ThE58;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof C60832RUr) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(C60832RUr.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
                case 3:
                    return new C60832RUr();
                case 4:
                    return new RUW();
                case 5:
                    return C60832RUr.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE59 = C60832RUr.PARSER;
                    if (interfaceC65281ThE59 == null) {
                        synchronized (C60832RUr.class) {
                            interfaceC65281ThE36 = C60832RUr.PARSER;
                            if (interfaceC65281ThE36 == null) {
                                C58534Px2 c58534Px212 = T9C.A01;
                                interfaceC65281ThE36 = A03(C60832RUr.DEFAULT_INSTANCE);
                                C60832RUr.PARSER = interfaceC65281ThE36;
                            }
                        }
                        return interfaceC65281ThE36;
                    }
                    return interfaceC65281ThE59;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof C60838RUx) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(C60838RUx.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"bitField0_", "version_", "params_"});
                case 3:
                    return new AbstractC58533Px1();
                case 4:
                    return new RUT();
                case 5:
                    return C60838RUx.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE60 = C60838RUx.PARSER;
                    if (interfaceC65281ThE60 == null) {
                        synchronized (C60838RUx.class) {
                            interfaceC65281ThE35 = C60838RUx.PARSER;
                            if (interfaceC65281ThE35 == null) {
                                C58534Px2 c58534Px213 = T9C.A01;
                                interfaceC65281ThE35 = A03(C60838RUx.DEFAULT_INSTANCE);
                                C60838RUx.PARSER = interfaceC65281ThE35;
                            }
                        }
                        return interfaceC65281ThE35;
                    }
                    return interfaceC65281ThE60;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof C60837RUw) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(C60837RUw.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"bitField0_", "version_", "params_"});
                case 3:
                    return new AbstractC58533Px1();
                case 4:
                    return new RUR();
                case 5:
                    return C60837RUw.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE61 = C60837RUw.PARSER;
                    if (interfaceC65281ThE61 == null) {
                        synchronized (C60837RUw.class) {
                            interfaceC65281ThE34 = C60837RUw.PARSER;
                            if (interfaceC65281ThE34 == null) {
                                C58534Px2 c58534Px214 = T9C.A01;
                                interfaceC65281ThE34 = A03(C60837RUw.DEFAULT_INSTANCE);
                                C60837RUw.PARSER = interfaceC65281ThE34;
                            }
                        }
                        return interfaceC65281ThE34;
                    }
                    return interfaceC65281ThE61;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof RV6) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(RV6.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "params_", "keyValue_"});
                case 3:
                    return new RV6();
                case 4:
                    return new RUG();
                case 5:
                    return RV6.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE62 = RV6.PARSER;
                    if (interfaceC65281ThE62 == null) {
                        synchronized (RV6.class) {
                            interfaceC65281ThE33 = RV6.PARSER;
                            if (interfaceC65281ThE33 == null) {
                                C58534Px2 c58534Px215 = T9C.A01;
                                interfaceC65281ThE33 = A03(RV6.DEFAULT_INSTANCE);
                                RV6.PARSER = interfaceC65281ThE33;
                            }
                        }
                        return interfaceC65281ThE33;
                    }
                    return interfaceC65281ThE62;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof C60829RUo) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(C60829RUo.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
                case 3:
                    return new C60829RUo();
                case 4:
                    return new RU7();
                case 5:
                    return C60829RUo.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE63 = C60829RUo.PARSER;
                    if (interfaceC65281ThE63 == null) {
                        synchronized (C60829RUo.class) {
                            interfaceC65281ThE32 = C60829RUo.PARSER;
                            if (interfaceC65281ThE32 == null) {
                                C58534Px2 c58534Px216 = T9C.A01;
                                interfaceC65281ThE32 = A03(C60829RUo.DEFAULT_INSTANCE);
                                C60829RUo.PARSER = interfaceC65281ThE32;
                            }
                        }
                        return interfaceC65281ThE32;
                    }
                    return interfaceC65281ThE63;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof C60825RUk) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(C60825RUk.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
                case 3:
                    return new C60825RUk();
                case 4:
                    return new RU3();
                case 5:
                    return C60825RUk.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE64 = C60825RUk.PARSER;
                    if (interfaceC65281ThE64 == null) {
                        synchronized (C60825RUk.class) {
                            interfaceC65281ThE31 = C60825RUk.PARSER;
                            if (interfaceC65281ThE31 == null) {
                                C58534Px2 c58534Px217 = T9C.A01;
                                interfaceC65281ThE31 = A03(C60825RUk.DEFAULT_INSTANCE);
                                C60825RUk.PARSER = interfaceC65281ThE31;
                            }
                        }
                        return interfaceC65281ThE31;
                    }
                    return interfaceC65281ThE64;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof RV3) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(RV3.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "params_", "keyValue_"});
                case 3:
                    return new RV3();
                case 4:
                    return new C60813RTy();
                case 5:
                    return RV3.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE65 = RV3.PARSER;
                    if (interfaceC65281ThE65 == null) {
                        synchronized (RV3.class) {
                            interfaceC65281ThE30 = RV3.PARSER;
                            if (interfaceC65281ThE30 == null) {
                                C58534Px2 c58534Px218 = T9C.A01;
                                interfaceC65281ThE30 = A03(RV3.DEFAULT_INSTANCE);
                                RV3.PARSER = interfaceC65281ThE30;
                            }
                        }
                        return interfaceC65281ThE30;
                    }
                    return interfaceC65281ThE65;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof RV1) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(RV1.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "version_", "aesCtrKey_", "hmacKey_"});
                case 3:
                    return new AbstractC58533Px1();
                case 4:
                    return new C60808RTt();
                case 5:
                    return RV1.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE66 = RV1.PARSER;
                    if (interfaceC65281ThE66 == null) {
                        synchronized (RV1.class) {
                            interfaceC65281ThE29 = RV1.PARSER;
                            if (interfaceC65281ThE29 == null) {
                                C58534Px2 c58534Px219 = T9C.A01;
                                interfaceC65281ThE29 = A03(RV1.DEFAULT_INSTANCE);
                                RV1.PARSER = interfaceC65281ThE29;
                            }
                        }
                        return interfaceC65281ThE29;
                    }
                    return interfaceC65281ThE66;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof RV0) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(RV0.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"bitField0_", "version_", "keyValue_", "params_"});
                case 3:
                    return new RV0();
                case 4:
                    return new C60805RTq();
                case 5:
                    return RV0.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE67 = RV0.PARSER;
                    if (interfaceC65281ThE67 == null) {
                        synchronized (RV0.class) {
                            interfaceC65281ThE28 = RV0.PARSER;
                            if (interfaceC65281ThE28 == null) {
                                C58534Px2 c58534Px220 = T9C.A01;
                                interfaceC65281ThE28 = A03(RV0.DEFAULT_INSTANCE);
                                RV0.PARSER = interfaceC65281ThE28;
                            }
                        }
                        return interfaceC65281ThE28;
                    }
                    return interfaceC65281ThE67;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof C60820RUf) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(C60820RUf.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"version_"});
                case 3:
                    return new AbstractC58533Px1();
                case 4:
                    return new RUX();
                case 5:
                    return C60820RUf.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE68 = C60820RUf.PARSER;
                    if (interfaceC65281ThE68 == null) {
                        synchronized (C60820RUf.class) {
                            interfaceC65281ThE27 = C60820RUf.PARSER;
                            if (interfaceC65281ThE27 == null) {
                                C58534Px2 c58534Px221 = T9C.A01;
                                interfaceC65281ThE27 = A03(C60820RUf.DEFAULT_INSTANCE);
                                C60820RUf.PARSER = interfaceC65281ThE27;
                            }
                        }
                        return interfaceC65281ThE27;
                    }
                    return interfaceC65281ThE68;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof C60831RUq) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(C60831RUq.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", RVB.class});
                case 3:
                    return new C60831RUq();
                case 4:
                    return new RUV();
                case 5:
                    return C60831RUq.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE69 = C60831RUq.PARSER;
                    if (interfaceC65281ThE69 == null) {
                        synchronized (C60831RUq.class) {
                            interfaceC65281ThE26 = C60831RUq.PARSER;
                            if (interfaceC65281ThE26 == null) {
                                C58534Px2 c58534Px222 = T9C.A01;
                                interfaceC65281ThE26 = A03(C60831RUq.DEFAULT_INSTANCE);
                                C60831RUq.PARSER = interfaceC65281ThE26;
                            }
                        }
                        return interfaceC65281ThE26;
                    }
                    return interfaceC65281ThE69;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof C60839RUy) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(C60839RUy.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "kekUri_", "dekTemplate_"});
                case 3:
                    return new C60839RUy();
                case 4:
                    return new RUU();
                case 5:
                    return C60839RUy.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE70 = C60839RUy.PARSER;
                    if (interfaceC65281ThE70 == null) {
                        synchronized (C60839RUy.class) {
                            interfaceC65281ThE25 = C60839RUy.PARSER;
                            if (interfaceC65281ThE25 == null) {
                                C58534Px2 c58534Px223 = T9C.A01;
                                interfaceC65281ThE25 = A03(C60839RUy.DEFAULT_INSTANCE);
                                C60839RUy.PARSER = interfaceC65281ThE25;
                            }
                        }
                        return interfaceC65281ThE25;
                    }
                    return interfaceC65281ThE70;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof C60819RUe) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(C60819RUe.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"keyUri_"});
                case 3:
                    return new C60819RUe();
                case 4:
                    return new RUS();
                case 5:
                    return C60819RUe.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE71 = C60819RUe.PARSER;
                    if (interfaceC65281ThE71 == null) {
                        synchronized (C60819RUe.class) {
                            interfaceC65281ThE24 = C60819RUe.PARSER;
                            if (interfaceC65281ThE24 == null) {
                                C58534Px2 c58534Px224 = T9C.A01;
                                interfaceC65281ThE24 = A03(C60819RUe.DEFAULT_INSTANCE);
                                C60819RUe.PARSER = interfaceC65281ThE24;
                            }
                        }
                        return interfaceC65281ThE24;
                    }
                    return interfaceC65281ThE71;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof RVB) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(RVB.DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"primitiveName_", "typeUrl_", "keyManagerVersion_", "newKeyAllowed_", "catalogueName_"});
                case 3:
                    return new RVB();
                case 4:
                    return new RUN();
                case 5:
                    return RVB.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE72 = RVB.PARSER;
                    if (interfaceC65281ThE72 == null) {
                        synchronized (RVB.class) {
                            interfaceC65281ThE23 = RVB.PARSER;
                            if (interfaceC65281ThE23 == null) {
                                C58534Px2 c58534Px225 = T9C.A01;
                                interfaceC65281ThE23 = A03(RVB.DEFAULT_INSTANCE);
                                RVB.PARSER = interfaceC65281ThE23;
                            }
                        }
                        return interfaceC65281ThE23;
                    }
                    return interfaceC65281ThE72;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof RV9) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(RV9.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "params_", "publicKey_"});
                case 3:
                    return new RV9();
                case 4:
                    return new RUM();
                case 5:
                    return RV9.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE73 = RV9.PARSER;
                    if (interfaceC65281ThE73 == null) {
                        synchronized (RV9.class) {
                            interfaceC65281ThE22 = RV9.PARSER;
                            if (interfaceC65281ThE22 == null) {
                                C58534Px2 c58534Px226 = T9C.A01;
                                interfaceC65281ThE22 = A03(RV9.DEFAULT_INSTANCE);
                                RV9.PARSER = interfaceC65281ThE22;
                            }
                        }
                        return interfaceC65281ThE22;
                    }
                    return interfaceC65281ThE73;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof RV8) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(RV8.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "publicKey_", "privateKey_"});
                case 3:
                    return new RV8();
                case 4:
                    return new RUL();
                case 5:
                    return RV8.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE74 = RV8.PARSER;
                    if (interfaceC65281ThE74 == null) {
                        synchronized (RV8.class) {
                            interfaceC65281ThE21 = RV8.PARSER;
                            if (interfaceC65281ThE21 == null) {
                                C58534Px2 c58534Px227 = T9C.A01;
                                interfaceC65281ThE21 = A03(RV8.DEFAULT_INSTANCE);
                                RV8.PARSER = interfaceC65281ThE21;
                            }
                        }
                        return interfaceC65281ThE21;
                    }
                    return interfaceC65281ThE74;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof C60840RUz) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(C60840RUz.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"kem_", "kdf_", "aead_"});
                case 3:
                    return new AbstractC58533Px1();
                case 4:
                    return new RUK();
                case 5:
                    return C60840RUz.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE75 = C60840RUz.PARSER;
                    if (interfaceC65281ThE75 == null) {
                        synchronized (C60840RUz.class) {
                            interfaceC65281ThE20 = C60840RUz.PARSER;
                            if (interfaceC65281ThE20 == null) {
                                C58534Px2 c58534Px228 = T9C.A01;
                                interfaceC65281ThE20 = A03(C60840RUz.DEFAULT_INSTANCE);
                                C60840RUz.PARSER = interfaceC65281ThE20;
                            }
                        }
                        return interfaceC65281ThE20;
                    }
                    return interfaceC65281ThE75;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof C60823RUi) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(C60823RUi.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "params_"});
                case 3:
                    return new AbstractC58533Px1();
                case 4:
                    return new RUJ();
                case 5:
                    return C60823RUi.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE76 = C60823RUi.PARSER;
                    if (interfaceC65281ThE76 == null) {
                        synchronized (C60823RUi.class) {
                            interfaceC65281ThE19 = C60823RUi.PARSER;
                            if (interfaceC65281ThE19 == null) {
                                C58534Px2 c58534Px229 = T9C.A01;
                                interfaceC65281ThE19 = A03(C60823RUi.DEFAULT_INSTANCE);
                                C60823RUi.PARSER = interfaceC65281ThE19;
                            }
                        }
                        return interfaceC65281ThE19;
                    }
                    return interfaceC65281ThE76;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof C60830RUp) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(C60830RUp.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
                case 3:
                    return new AbstractC58533Px1();
                case 4:
                    return new RUI();
                case 5:
                    return C60830RUp.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE77 = C60830RUp.PARSER;
                    if (interfaceC65281ThE77 == null) {
                        synchronized (C60830RUp.class) {
                            interfaceC65281ThE18 = C60830RUp.PARSER;
                            if (interfaceC65281ThE18 == null) {
                                C58534Px2 c58534Px230 = T9C.A01;
                                interfaceC65281ThE18 = A03(C60830RUp.DEFAULT_INSTANCE);
                                C60830RUp.PARSER = interfaceC65281ThE18;
                            }
                        }
                        return interfaceC65281ThE18;
                    }
                    return interfaceC65281ThE77;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof RV7) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(RV7.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"bitField0_", "params_", "keySize_", "version_"});
                case 3:
                    return new AbstractC58533Px1();
                case 4:
                    return new RUH();
                case 5:
                    return RV7.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE78 = RV7.PARSER;
                    if (interfaceC65281ThE78 == null) {
                        synchronized (RV7.class) {
                            interfaceC65281ThE17 = RV7.PARSER;
                            if (interfaceC65281ThE17 == null) {
                                C58534Px2 c58534Px231 = T9C.A01;
                                interfaceC65281ThE17 = A03(RV7.DEFAULT_INSTANCE);
                                RV7.PARSER = interfaceC65281ThE17;
                            }
                        }
                        return interfaceC65281ThE17;
                    }
                    return interfaceC65281ThE78;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof RVC) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(RVC.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"curveType_", "hkdfHashType_", "hkdfSalt_"});
                case 3:
                    return new RVC();
                case 4:
                    return new RUE();
                case 5:
                    return RVC.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE79 = RVC.PARSER;
                    if (interfaceC65281ThE79 == null) {
                        synchronized (RVC.class) {
                            interfaceC65281ThE16 = RVC.PARSER;
                            if (interfaceC65281ThE16 == null) {
                                C58534Px2 c58534Px232 = T9C.A01;
                                interfaceC65281ThE16 = A03(RVC.DEFAULT_INSTANCE);
                                RVC.PARSER = interfaceC65281ThE16;
                            }
                        }
                        return interfaceC65281ThE16;
                    }
                    return interfaceC65281ThE79;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof RVA) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(RVA.DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"bitField0_", "version_", "params_", "x_", "y_"});
                case 3:
                    return new RVA();
                case 4:
                    return new RUD();
                case 5:
                    return RVA.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE80 = RVA.PARSER;
                    if (interfaceC65281ThE80 == null) {
                        synchronized (RVA.class) {
                            interfaceC65281ThE15 = RVA.PARSER;
                            if (interfaceC65281ThE15 == null) {
                                C58534Px2 c58534Px233 = T9C.A01;
                                interfaceC65281ThE15 = A03(RVA.DEFAULT_INSTANCE);
                                RVA.PARSER = interfaceC65281ThE15;
                            }
                        }
                        return interfaceC65281ThE15;
                    }
                    return interfaceC65281ThE80;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof RV5) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(RV5.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "publicKey_", "keyValue_"});
                case 3:
                    return new RV5();
                case 4:
                    return new RUC();
                case 5:
                    return RV5.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE81 = RV5.PARSER;
                    if (interfaceC65281ThE81 == null) {
                        synchronized (RV5.class) {
                            interfaceC65281ThE14 = RV5.PARSER;
                            if (interfaceC65281ThE14 == null) {
                                C58534Px2 c58534Px234 = T9C.A01;
                                interfaceC65281ThE14 = A03(RV5.DEFAULT_INSTANCE);
                                RV5.PARSER = interfaceC65281ThE14;
                            }
                        }
                        return interfaceC65281ThE14;
                    }
                    return interfaceC65281ThE81;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof RV4) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(RV4.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new Object[]{"bitField0_", "kemParams_", "demParams_", "ecPointFormat_"});
                case 3:
                    return new AbstractC58533Px1();
                case 4:
                    return new RUB();
                case 5:
                    return RV4.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE82 = RV4.PARSER;
                    if (interfaceC65281ThE82 == null) {
                        synchronized (RV4.class) {
                            interfaceC65281ThE13 = RV4.PARSER;
                            if (interfaceC65281ThE13 == null) {
                                C58534Px2 c58534Px235 = T9C.A01;
                                interfaceC65281ThE13 = A03(RV4.DEFAULT_INSTANCE);
                                RV4.PARSER = interfaceC65281ThE13;
                            }
                        }
                        return interfaceC65281ThE13;
                    }
                    return interfaceC65281ThE82;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof C60822RUh) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(C60822RUh.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "params_"});
                case 3:
                    return new AbstractC58533Px1();
                case 4:
                    return new RUA();
                case 5:
                    return C60822RUh.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE83 = C60822RUh.PARSER;
                    if (interfaceC65281ThE83 == null) {
                        synchronized (C60822RUh.class) {
                            interfaceC65281ThE12 = C60822RUh.PARSER;
                            if (interfaceC65281ThE12 == null) {
                                C58534Px2 c58534Px236 = T9C.A01;
                                interfaceC65281ThE12 = A03(C60822RUh.DEFAULT_INSTANCE);
                                C60822RUh.PARSER = interfaceC65281ThE12;
                            }
                        }
                        return interfaceC65281ThE12;
                    }
                    return interfaceC65281ThE83;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof C60821RUg) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(C60821RUg.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"bitField0_", "aeadDem_"});
                case 3:
                    return new AbstractC58533Px1();
                case 4:
                    return new RU9();
                case 5:
                    return C60821RUg.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE84 = C60821RUg.PARSER;
                    if (interfaceC65281ThE84 == null) {
                        synchronized (C60821RUg.class) {
                            interfaceC65281ThE11 = C60821RUg.PARSER;
                            if (interfaceC65281ThE11 == null) {
                                C58534Px2 c58534Px237 = T9C.A01;
                                interfaceC65281ThE11 = A03(C60821RUg.DEFAULT_INSTANCE);
                                C60821RUg.PARSER = interfaceC65281ThE11;
                            }
                        }
                        return interfaceC65281ThE11;
                    }
                    return interfaceC65281ThE84;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof C60815RUa) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(C60815RUa.DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 3:
                    return new AbstractC58533Px1();
                case 4:
                    return new RU8();
                case 5:
                    return C60815RUa.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE85 = C60815RUa.PARSER;
                    if (interfaceC65281ThE85 == null) {
                        synchronized (C60815RUa.class) {
                            interfaceC65281ThE10 = C60815RUa.PARSER;
                            if (interfaceC65281ThE10 == null) {
                                C58534Px2 c58534Px238 = T9C.A01;
                                interfaceC65281ThE10 = A03(C60815RUa.DEFAULT_INSTANCE);
                                C60815RUa.PARSER = interfaceC65281ThE10;
                            }
                        }
                        return interfaceC65281ThE10;
                    }
                    return interfaceC65281ThE85;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof C60826RUl) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(C60826RUl.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"version_", "keySize_"});
                case 3:
                    return new AbstractC58533Px1();
                case 4:
                    return new RU4();
                case 5:
                    return C60826RUl.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE86 = C60826RUl.PARSER;
                    if (interfaceC65281ThE86 == null) {
                        synchronized (C60826RUl.class) {
                            interfaceC65281ThE9 = C60826RUl.PARSER;
                            if (interfaceC65281ThE9 == null) {
                                C58534Px2 c58534Px239 = T9C.A01;
                                interfaceC65281ThE9 = A03(C60826RUl.DEFAULT_INSTANCE);
                                C60826RUl.PARSER = interfaceC65281ThE9;
                            }
                        }
                        return interfaceC65281ThE9;
                    }
                    return interfaceC65281ThE86;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof C60818RUd) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(C60818RUd.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
                case 3:
                    return new AbstractC58533Px1();
                case 4:
                    return new RU0();
                case 5:
                    return C60818RUd.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE87 = C60818RUd.PARSER;
                    if (interfaceC65281ThE87 == null) {
                        synchronized (C60818RUd.class) {
                            interfaceC65281ThE8 = C60818RUd.PARSER;
                            if (interfaceC65281ThE8 == null) {
                                C58534Px2 c58534Px240 = T9C.A01;
                                interfaceC65281ThE8 = A03(C60818RUd.DEFAULT_INSTANCE);
                                C60818RUd.PARSER = interfaceC65281ThE8;
                            }
                        }
                        return interfaceC65281ThE8;
                    }
                    return interfaceC65281ThE87;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof C60836RUv) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(C60836RUv.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"bitField0_", "params_", "keySize_"});
                case 3:
                    return new AbstractC58533Px1();
                case 4:
                    return new C60814RTz();
                case 5:
                    return C60836RUv.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE88 = C60836RUv.PARSER;
                    if (interfaceC65281ThE88 == null) {
                        synchronized (C60836RUv.class) {
                            interfaceC65281ThE7 = C60836RUv.PARSER;
                            if (interfaceC65281ThE7 == null) {
                                C58534Px2 c58534Px241 = T9C.A01;
                                interfaceC65281ThE7 = A03(C60836RUv.DEFAULT_INSTANCE);
                                C60836RUv.PARSER = interfaceC65281ThE7;
                            }
                        }
                        return interfaceC65281ThE7;
                    }
                    return interfaceC65281ThE88;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof C60817RUc) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(C60817RUc.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
                case 3:
                    return new AbstractC58533Px1();
                case 4:
                    return new C60812RTx();
                case 5:
                    return C60817RUc.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE89 = C60817RUc.PARSER;
                    if (interfaceC65281ThE89 == null) {
                        synchronized (C60817RUc.class) {
                            interfaceC65281ThE6 = C60817RUc.PARSER;
                            if (interfaceC65281ThE6 == null) {
                                C58534Px2 c58534Px242 = T9C.A01;
                                interfaceC65281ThE6 = A03(C60817RUc.DEFAULT_INSTANCE);
                                C60817RUc.PARSER = interfaceC65281ThE6;
                            }
                        }
                        return interfaceC65281ThE6;
                    }
                    return interfaceC65281ThE89;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof C60835RUu) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(C60835RUu.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"bitField0_", "params_", "keySize_"});
                case 3:
                    return new AbstractC58533Px1();
                case 4:
                    return new C60811RTw();
                case 5:
                    return C60835RUu.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE90 = C60835RUu.PARSER;
                    if (interfaceC65281ThE90 == null) {
                        synchronized (C60835RUu.class) {
                            interfaceC65281ThE5 = C60835RUu.PARSER;
                            if (interfaceC65281ThE5 == null) {
                                C58534Px2 c58534Px243 = T9C.A01;
                                interfaceC65281ThE5 = A03(C60835RUu.DEFAULT_INSTANCE);
                                C60835RUu.PARSER = interfaceC65281ThE5;
                            }
                        }
                        return interfaceC65281ThE5;
                    }
                    return interfaceC65281ThE90;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof RV2) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(RV2.DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"bitField0_", "version_", "params_", "keyValue_"});
                case 3:
                    return new RV2();
                case 4:
                    return new C60810RTv();
                case 5:
                    return RV2.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE91 = RV2.PARSER;
                    if (interfaceC65281ThE91 == null) {
                        synchronized (RV2.class) {
                            interfaceC65281ThE4 = RV2.PARSER;
                            if (interfaceC65281ThE4 == null) {
                                C58534Px2 c58534Px244 = T9C.A01;
                                interfaceC65281ThE4 = A03(RV2.DEFAULT_INSTANCE);
                                RV2.PARSER = interfaceC65281ThE4;
                            }
                        }
                        return interfaceC65281ThE4;
                    }
                    return interfaceC65281ThE91;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        if (this instanceof C60834RUt) {
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(C60834RUt.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "aesCtrKeyFormat_", "hmacKeyFormat_"});
                case 3:
                    return new AbstractC58533Px1();
                case 4:
                    return new C60809RTu();
                case 5:
                    return C60834RUt.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE92 = C60834RUt.PARSER;
                    if (interfaceC65281ThE92 == null) {
                        synchronized (C60834RUt.class) {
                            interfaceC65281ThE3 = C60834RUt.PARSER;
                            if (interfaceC65281ThE3 == null) {
                                C58534Px2 c58534Px245 = T9C.A01;
                                interfaceC65281ThE3 = A03(C60834RUt.DEFAULT_INSTANCE);
                                C60834RUt.PARSER = interfaceC65281ThE3;
                            }
                        }
                        return interfaceC65281ThE3;
                    }
                    return interfaceC65281ThE92;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        boolean z = this instanceof C60816RUb;
        int intValue = num.intValue();
        if (z) {
            switch (intValue) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return A07(C60816RUb.DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"tagSize_"});
                case 3:
                    return new AbstractC58533Px1();
                case 4:
                    return new C60807RTs();
                case 5:
                    return C60816RUb.DEFAULT_INSTANCE;
                case 6:
                    InterfaceC65281ThE interfaceC65281ThE93 = C60816RUb.PARSER;
                    if (interfaceC65281ThE93 == null) {
                        synchronized (C60816RUb.class) {
                            interfaceC65281ThE2 = C60816RUb.PARSER;
                            if (interfaceC65281ThE2 == null) {
                                C58534Px2 c58534Px246 = T9C.A01;
                                interfaceC65281ThE2 = A03(C60816RUb.DEFAULT_INSTANCE);
                                C60816RUb.PARSER = interfaceC65281ThE2;
                            }
                        }
                        return interfaceC65281ThE2;
                    }
                    return interfaceC65281ThE93;
                default:
                    throw AbstractC43592JPx.A11();
            }
        }
        switch (intValue) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return A07(C60833RUs.DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"bitField0_", "keySize_", "params_"});
            case 3:
                return new AbstractC58533Px1();
            case 4:
                return new C60806RTr();
            case 5:
                return C60833RUs.DEFAULT_INSTANCE;
            case 6:
                InterfaceC65281ThE interfaceC65281ThE94 = C60833RUs.PARSER;
                if (interfaceC65281ThE94 == null) {
                    synchronized (C60833RUs.class) {
                        interfaceC65281ThE = C60833RUs.PARSER;
                        if (interfaceC65281ThE == null) {
                            C58534Px2 c58534Px247 = T9C.A01;
                            interfaceC65281ThE = A03(C60833RUs.DEFAULT_INSTANCE);
                            C60833RUs.PARSER = interfaceC65281ThE;
                        }
                    }
                    return interfaceC65281ThE;
                }
                return interfaceC65281ThE94;
            default:
                throw AbstractC43592JPx.A11();
        }
    }

    public final boolean equals(Object other) {
        Class<?> cls;
        if (this == other) {
            return true;
        }
        if (other == null || (cls = getClass()) != other.getClass()) {
            return false;
        }
        return C58540Px8.A02.A00(cls).AT0(this, other);
    }

    public final int hashCode() {
        if ((this.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            return AbstractC58320PtC.A0d(this).CME(this);
        }
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int CME = AbstractC58320PtC.A0d(this).CME(this);
        this.memoizedHashCode = CME;
        return CME;
    }

    public static Object A08(Object method, Method object, Object... params) {
        try {
            return object.invoke(method, params);
        } catch (IllegalAccessException e) {
            throw AbstractC58318PtA.A0e("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (!(cause instanceof Error)) {
                    throw AbstractC58318PtA.A0e("Unexpected exception thrown by generated accessor method.", cause);
                }
                throw cause;
            }
            throw cause;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Throwable, X.Re1, java.io.IOException] */
    public static void A09(AbstractC58533Px1 message) {
        if (A0B(message)) {
            return;
        }
        ?? iOException = new IOException(new RuntimeException("Message was missing required fields.  (Lite runtime could not determine which fields were missing).").getMessage());
        iOException.A00 = null;
        iOException.A00 = message;
        throw iOException;
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = AbstractC63098Scz.A00;
        StringBuilder A0u = AbstractC58323PtF.A0u(obj);
        AbstractC63098Scz.A00(this, A0u, 0);
        return A0u.toString();
    }
}
