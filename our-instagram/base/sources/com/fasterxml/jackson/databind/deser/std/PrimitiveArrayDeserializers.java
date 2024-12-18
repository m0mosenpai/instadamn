package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC25228BEl;
import X.AbstractC58318PtA;
import X.AbstractC58320PtC;
import X.AbstractC62751SPh;
import X.AbstractC63020Sal;
import X.AbstractC90183zz;
import X.AbstractC910944l;
import X.AnonymousClass469;
import X.C00O;
import X.C05F;
import X.C102314j6;
import X.C102374jC;
import X.C16L;
import X.C16R;
import X.C2I7;
import X.C45K;
import X.C45S;
import X.C45T;
import X.C64174T2d;
import X.C64175T2e;
import X.C911944v;
import X.C912845h;
import X.C913945y;
import X.EnumC61060ReZ;
import X.EnumC912945i;
import X.InterfaceC102444jN;
import X.InterfaceC102474jf;
import X.InterfaceC65620ToB;
import X.RDD;
import X.RDE;
import X.RDF;
import X.RDG;
import X.RDH;
import X.RDI;
import X.RDJ;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes10.dex */
public abstract class PrimitiveArrayDeserializers extends StdDeserializer implements InterfaceC102474jf {
    public final InterfaceC102444jN A00;
    public final Boolean A01;
    public transient Object A02;

    @JacksonStdImpl
    /* loaded from: classes10.dex */
    public final class BooleanDeser extends PrimitiveArrayDeserializers {
        public BooleanDeser() {
            super(boolean[].class);
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [X.RDD, java.lang.Object] */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final /* bridge */ /* synthetic */ Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
            boolean z;
            int i;
            if (!c16l.A16()) {
                return A0x(c16l, anonymousClass469);
            }
            C102374jC A0L = anonymousClass469.A0L();
            RDD rdd = A0L.A00;
            RDD rdd2 = rdd;
            if (rdd == null) {
                ?? obj = new Object();
                A0L.A00 = obj;
                rdd2 = obj;
            }
            boolean[] zArr = (boolean[]) rdd2.A00();
            int i2 = 0;
            while (true) {
                try {
                    C16R A1J = c16l.A1J();
                    if (A1J != C16R.A08) {
                        try {
                            if (A1J == C16R.A0K) {
                                z = true;
                            } else {
                                if (A1J != C16R.A0F) {
                                    if (A1J == C16R.A0G) {
                                        InterfaceC102444jN interfaceC102444jN = ((PrimitiveArrayDeserializers) this).A00;
                                        if (interfaceC102444jN != null) {
                                            interfaceC102444jN.BXX(anonymousClass469);
                                        } else {
                                            A0r(anonymousClass469);
                                        }
                                    } else {
                                        z = A0v(c16l, anonymousClass469);
                                    }
                                }
                                z = false;
                            }
                            zArr[i2] = z;
                            i2 = i;
                        } catch (Exception e) {
                            e = e;
                            i2 = i;
                            throw C102314j6.A03(zArr, e, rdd2.A00 + i2);
                        }
                        if (i2 >= zArr.length) {
                            zArr = (boolean[]) rdd2.A02(zArr, i2);
                            i2 = 0;
                        }
                        i = i2 + 1;
                    } else {
                        return rdd2.A03(zArr, i2);
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
        }
    }

    @JacksonStdImpl
    /* loaded from: classes10.dex */
    public final class ByteDeser extends PrimitiveArrayDeserializers {
        public ByteDeser() {
            super(byte[].class);
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [X.RDE, java.lang.Object] */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final /* bridge */ /* synthetic */ Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
            byte A0T;
            int i;
            Object A10 = c16l.A10();
            if (A10 == C16R.A0J) {
                try {
                    A10 = c16l.A1S(((C45T) anonymousClass469.A02).A01.A00);
                    return A10;
                } catch (AbstractC90183zz e) {
                    String A06 = e.A06();
                    if (A06.contains("base64")) {
                        anonymousClass469.A0e(byte[].class, c16l.A1P(), A06, new Object[0]);
                        throw C00O.createAndThrow();
                    }
                }
            }
            if (A10 == C16R.A0E) {
                Object A0V = c16l.A0V();
                if (A0V == null) {
                    return null;
                }
                if (A0V instanceof byte[]) {
                    return A0V;
                }
            }
            if (!c16l.A16()) {
                return A0x(c16l, anonymousClass469);
            }
            C102374jC A0L = anonymousClass469.A0L();
            RDE rde = A0L.A01;
            RDE rde2 = rde;
            if (rde == null) {
                ?? obj = new Object();
                A0L.A01 = obj;
                rde2 = obj;
            }
            byte[] bArr = (byte[]) rde2.A00();
            int i2 = 0;
            while (true) {
                try {
                    C16R A1J = c16l.A1J();
                    if (A1J != C16R.A08) {
                        try {
                            if (A1J == C16R.A0I) {
                                A0T = c16l.A0T();
                            } else if (A1J == C16R.A0G) {
                                InterfaceC102444jN interfaceC102444jN = ((PrimitiveArrayDeserializers) this).A00;
                                if (interfaceC102444jN != null) {
                                    interfaceC102444jN.BXX(anonymousClass469);
                                } else {
                                    A0r(anonymousClass469);
                                    A0T = 0;
                                }
                            } else {
                                A0T = A0N(c16l, anonymousClass469);
                            }
                            bArr[i2] = A0T;
                            i2 = i;
                        } catch (Exception e2) {
                            e = e2;
                            i2 = i;
                            throw C102314j6.A03(bArr, e, rde2.A00 + i2);
                        }
                        if (i2 >= bArr.length) {
                            bArr = (byte[]) rde2.A02(bArr, i2);
                            i2 = 0;
                        }
                        i = i2 + 1;
                    } else {
                        return rde2.A03(bArr, i2);
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            }
        }
    }

    @JacksonStdImpl
    /* loaded from: classes10.dex */
    public final class CharDeser extends PrimitiveArrayDeserializers {
        public CharDeser() {
            super(char[].class);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final /* bridge */ /* synthetic */ Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
            Class cls;
            String A05;
            String A1P;
            C16R c16r = C16R.A0J;
            if (c16l.A19(c16r)) {
                char[] A1T = c16l.A1T();
                int A1C = c16l.A1C();
                int A1B = c16l.A1B();
                char[] cArr = new char[A1B];
                System.arraycopy(A1T, A1C, cArr, 0, A1B);
                return cArr;
            }
            if (c16l.A16()) {
                StringBuilder A0q = AbstractC58318PtA.A0q(64);
                while (true) {
                    C16R A1J = c16l.A1J();
                    if (A1J != C16R.A08) {
                        if (A1J == c16r) {
                            A1P = c16l.A1P();
                        } else if (A1J == C16R.A0G) {
                            InterfaceC102444jN interfaceC102444jN = ((PrimitiveArrayDeserializers) this).A00;
                            if (interfaceC102444jN != null) {
                                interfaceC102444jN.BXX(anonymousClass469);
                            } else {
                                A0r(anonymousClass469);
                                A1P = "\u0000";
                            }
                        } else {
                            cls = Character.TYPE;
                            break;
                        }
                        int length = A1P.length();
                        if (length != 1) {
                            anonymousClass469.A0h("Cannot convert a JSON String of length %d into a char element of char array", AbstractC25228BEl.A1Y(length));
                            break;
                        }
                        A0q.append(A1P.charAt(0));
                    } else {
                        A05 = A0q.toString();
                        break;
                    }
                }
            } else {
                if (c16l.A19(C16R.A0E)) {
                    Object A0V = c16l.A0V();
                    if (A0V == null) {
                        return null;
                    }
                    if (A0V instanceof char[]) {
                        return A0V;
                    }
                    if (A0V instanceof String) {
                        A05 = (String) A0V;
                    } else if (A0V instanceof byte[]) {
                        A05 = C911944v.A01.A05((byte[]) A0V);
                    }
                    return A05.toCharArray();
                }
                cls = ((StdDeserializer) this).A00;
                anonymousClass469.A0T(c16l, cls);
            }
            throw C00O.createAndThrow();
        }
    }

    @JacksonStdImpl
    /* loaded from: classes10.dex */
    public final class DoubleDeser extends PrimitiveArrayDeserializers {
        public DoubleDeser() {
            super(double[].class);
        }

        /* JADX WARN: Type inference failed for: r5v2, types: [X.RDF, java.lang.Object] */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final /* bridge */ /* synthetic */ Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
            InterfaceC102444jN interfaceC102444jN;
            if (!c16l.A16()) {
                return A0x(c16l, anonymousClass469);
            }
            C102374jC A0L = anonymousClass469.A0L();
            RDF rdf = A0L.A02;
            AbstractC62751SPh abstractC62751SPh = rdf;
            if (rdf == null) {
                ?? obj = new Object();
                A0L.A02 = obj;
                abstractC62751SPh = obj;
            }
            double[] dArr = (double[]) abstractC62751SPh.A00();
            int i = 0;
            while (true) {
                try {
                    C16R A1J = c16l.A1J();
                    if (A1J != C16R.A08) {
                        if (A1J == C16R.A0G && (interfaceC102444jN = ((PrimitiveArrayDeserializers) this).A00) != null) {
                            interfaceC102444jN.BXX(anonymousClass469);
                        } else {
                            double A0O = A0O(c16l, anonymousClass469);
                            if (i >= dArr.length) {
                                dArr = (double[]) abstractC62751SPh.A02(dArr, i);
                                i = 0;
                            }
                            int i2 = i + 1;
                            try {
                                dArr[i] = A0O;
                                i = i2;
                            } catch (Exception e) {
                                e = e;
                                i = i2;
                                throw C102314j6.A03(dArr, e, abstractC62751SPh.A00 + i);
                            }
                        }
                    } else {
                        return abstractC62751SPh.A03(dArr, i);
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
        }
    }

    @JacksonStdImpl
    /* loaded from: classes10.dex */
    public final class FloatDeser extends PrimitiveArrayDeserializers {
        public FloatDeser() {
            super(float[].class);
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [X.RDG, java.lang.Object] */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final /* bridge */ /* synthetic */ Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
            InterfaceC102444jN interfaceC102444jN;
            if (!c16l.A16()) {
                return A0x(c16l, anonymousClass469);
            }
            C102374jC A0L = anonymousClass469.A0L();
            RDG rdg = A0L.A03;
            AbstractC62751SPh abstractC62751SPh = rdg;
            if (rdg == null) {
                ?? obj = new Object();
                A0L.A03 = obj;
                abstractC62751SPh = obj;
            }
            float[] fArr = (float[]) abstractC62751SPh.A00();
            int i = 0;
            while (true) {
                try {
                    C16R A1J = c16l.A1J();
                    if (A1J != C16R.A08) {
                        if (A1J == C16R.A0G && (interfaceC102444jN = ((PrimitiveArrayDeserializers) this).A00) != null) {
                            interfaceC102444jN.BXX(anonymousClass469);
                        } else {
                            float A0P = A0P(c16l, anonymousClass469);
                            if (i >= fArr.length) {
                                fArr = (float[]) abstractC62751SPh.A02(fArr, i);
                                i = 0;
                            }
                            int i2 = i + 1;
                            try {
                                fArr[i] = A0P;
                                i = i2;
                            } catch (Exception e) {
                                e = e;
                                i = i2;
                                throw C102314j6.A03(fArr, e, abstractC62751SPh.A00 + i);
                            }
                        }
                    } else {
                        return abstractC62751SPh.A03(fArr, i);
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
        }
    }

    @JacksonStdImpl
    /* loaded from: classes10.dex */
    public final class IntDeser extends PrimitiveArrayDeserializers {
        public static final IntDeser A00 = new IntDeser();

        public IntDeser() {
            super(int[].class);
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, X.RDH] */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final /* bridge */ /* synthetic */ Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
            int A0i;
            int i;
            if (!c16l.A16()) {
                return A0x(c16l, anonymousClass469);
            }
            C102374jC A0L = anonymousClass469.A0L();
            RDH rdh = A0L.A04;
            AbstractC62751SPh abstractC62751SPh = rdh;
            if (rdh == null) {
                ?? obj = new Object();
                A0L.A04 = obj;
                abstractC62751SPh = obj;
            }
            int[] iArr = (int[]) abstractC62751SPh.A00();
            int i2 = 0;
            while (true) {
                try {
                    C16R A1J = c16l.A1J();
                    if (A1J != C16R.A08) {
                        try {
                            if (A1J == C16R.A0I) {
                                A0i = c16l.A0i();
                            } else if (A1J == C16R.A0G) {
                                InterfaceC102444jN interfaceC102444jN = ((PrimitiveArrayDeserializers) this).A00;
                                if (interfaceC102444jN != null) {
                                    interfaceC102444jN.BXX(anonymousClass469);
                                } else {
                                    A0r(anonymousClass469);
                                    A0i = 0;
                                }
                            } else {
                                A0i = A0Q(c16l, anonymousClass469);
                            }
                            iArr[i2] = A0i;
                            i2 = i;
                        } catch (Exception e) {
                            e = e;
                            i2 = i;
                            throw C102314j6.A03(iArr, e, abstractC62751SPh.A00 + i2);
                        }
                        if (i2 >= iArr.length) {
                            iArr = (int[]) abstractC62751SPh.A02(iArr, i2);
                            i2 = 0;
                        }
                        i = i2 + 1;
                    } else {
                        return abstractC62751SPh.A03(iArr, i2);
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
        }
    }

    @JacksonStdImpl
    /* loaded from: classes10.dex */
    public final class LongDeser extends PrimitiveArrayDeserializers {
        public static final LongDeser A00 = new LongDeser();

        public LongDeser() {
            super(long[].class);
        }

        /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, X.RDI] */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final /* bridge */ /* synthetic */ Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
            long A0j;
            int i;
            if (!c16l.A16()) {
                return A0x(c16l, anonymousClass469);
            }
            C102374jC A0L = anonymousClass469.A0L();
            RDI rdi = A0L.A05;
            AbstractC62751SPh abstractC62751SPh = rdi;
            if (rdi == null) {
                ?? obj = new Object();
                A0L.A05 = obj;
                abstractC62751SPh = obj;
            }
            long[] jArr = (long[]) abstractC62751SPh.A00();
            int i2 = 0;
            while (true) {
                try {
                    C16R A1J = c16l.A1J();
                    if (A1J != C16R.A08) {
                        try {
                            if (A1J == C16R.A0I) {
                                A0j = c16l.A0j();
                            } else if (A1J == C16R.A0G) {
                                InterfaceC102444jN interfaceC102444jN = ((PrimitiveArrayDeserializers) this).A00;
                                if (interfaceC102444jN != null) {
                                    interfaceC102444jN.BXX(anonymousClass469);
                                } else {
                                    A0r(anonymousClass469);
                                    A0j = 0;
                                }
                            } else {
                                A0j = A0S(c16l, anonymousClass469);
                            }
                            jArr[i2] = A0j;
                            i2 = i;
                        } catch (Exception e) {
                            e = e;
                            i2 = i;
                            throw C102314j6.A03(jArr, e, abstractC62751SPh.A00 + i2);
                        }
                        if (i2 >= jArr.length) {
                            jArr = (long[]) abstractC62751SPh.A02(jArr, i2);
                            i2 = 0;
                        }
                        i = i2 + 1;
                    } else {
                        return abstractC62751SPh.A03(jArr, i2);
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
        }
    }

    @JacksonStdImpl
    /* loaded from: classes10.dex */
    public final class ShortDeser extends PrimitiveArrayDeserializers {
        public ShortDeser() {
            super(short[].class);
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, X.RDJ] */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final /* bridge */ /* synthetic */ Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
            short A0n;
            int i;
            if (!c16l.A16()) {
                return A0x(c16l, anonymousClass469);
            }
            C102374jC A0L = anonymousClass469.A0L();
            RDJ rdj = A0L.A06;
            RDJ rdj2 = rdj;
            if (rdj == null) {
                ?? obj = new Object();
                A0L.A06 = obj;
                rdj2 = obj;
            }
            short[] sArr = (short[]) rdj2.A00();
            int i2 = 0;
            while (true) {
                try {
                    C16R A1J = c16l.A1J();
                    if (A1J != C16R.A08) {
                        try {
                            if (A1J == C16R.A0G) {
                                InterfaceC102444jN interfaceC102444jN = ((PrimitiveArrayDeserializers) this).A00;
                                if (interfaceC102444jN != null) {
                                    interfaceC102444jN.BXX(anonymousClass469);
                                } else {
                                    A0r(anonymousClass469);
                                    A0n = 0;
                                }
                            } else {
                                A0n = A0n(c16l, anonymousClass469);
                            }
                            sArr[i2] = A0n;
                            i2 = i;
                        } catch (Exception e) {
                            e = e;
                            i2 = i;
                            throw C102314j6.A03(sArr, e, rdj2.A00 + i2);
                        }
                        if (i2 >= sArr.length) {
                            sArr = (short[]) rdj2.A02(sArr, i2);
                            i2 = 0;
                        }
                        i = i2 + 1;
                    } else {
                        return rdj2.A03(sArr, i2);
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Integer A0B() {
        return C05F.A01;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Integer A0I() {
        if (this instanceof ByteDeser) {
            return C05F.A02;
        }
        return C05F.A00;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0K(AnonymousClass469 anonymousClass469) {
        Object obj = this.A02;
        if (obj == null) {
            if (this instanceof ShortDeser) {
                obj = new short[0];
            } else if (this instanceof LongDeser) {
                obj = new long[0];
            } else if (this instanceof IntDeser) {
                obj = new int[0];
            } else if (this instanceof FloatDeser) {
                obj = new float[0];
            } else if (this instanceof DoubleDeser) {
                obj = new double[0];
            } else if (this instanceof CharDeser) {
                obj = new char[0];
            } else if (this instanceof ByteDeser) {
                obj = new byte[0];
            } else {
                obj = new boolean[0];
            }
            this.A02 = obj;
        }
        return obj;
    }

    public final Object A0x(C16L c16l, AnonymousClass469 anonymousClass469) {
        Class<?> componentType;
        if (c16l.A19(C16R.A0J)) {
            return A0h(c16l, anonymousClass469);
        }
        Boolean bool = this.A01;
        if (bool == Boolean.TRUE || (bool == null && anonymousClass469.A0j(EnumC912945i.A06))) {
            if (this instanceof ShortDeser) {
                return new short[]{A0n(c16l, anonymousClass469)};
            }
            if (this instanceof LongDeser) {
                return new long[]{A0S(c16l, anonymousClass469)};
            }
            if (this instanceof IntDeser) {
                return new int[]{A0Q(c16l, anonymousClass469)};
            }
            if (this instanceof FloatDeser) {
                return new float[]{A0P(c16l, anonymousClass469)};
            }
            if (this instanceof DoubleDeser) {
                return new double[]{A0O(c16l, anonymousClass469)};
            }
            if (!(this instanceof CharDeser)) {
                if (this instanceof ByteDeser) {
                    C16R A10 = c16l.A10();
                    if (A10 == C16R.A0I) {
                        return new byte[]{c16l.A0T()};
                    }
                    if (A10 == C16R.A0G) {
                        InterfaceC102444jN interfaceC102444jN = this.A00;
                        if (interfaceC102444jN != null) {
                            interfaceC102444jN.BXX(anonymousClass469);
                            return A0K(anonymousClass469);
                        }
                        A0r(anonymousClass469);
                        return null;
                    }
                    componentType = super.A00.getComponentType();
                    anonymousClass469.A0T(c16l, componentType);
                    throw C00O.createAndThrow();
                }
                return new boolean[]{A0v(c16l, anonymousClass469)};
            }
        }
        componentType = super.A00;
        anonymousClass469.A0T(c16l, componentType);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC102474jf
    public final JsonDeserializer ALr(InterfaceC65620ToB interfaceC65620ToB, AnonymousClass469 anonymousClass469) {
        C45K c45k;
        InterfaceC102444jN interfaceC102444jN;
        AbstractC910944l A03;
        C913945y B8w;
        Class cls = super.A00;
        Boolean A01 = AbstractC58320PtC.A0a(interfaceC65620ToB, anonymousClass469, cls).A01(EnumC61060ReZ.A01);
        if (interfaceC65620ToB != null) {
            c45k = interfaceC65620ToB.BTQ().A00;
        } else {
            c45k = ((C45S) anonymousClass469.A02).A01.A01.A00;
        }
        if (c45k == C45K.SKIP) {
            interfaceC102444jN = C64175T2e.A02;
        } else if (c45k == C45K.FAIL) {
            if (interfaceC65620ToB == null) {
                A03 = anonymousClass469.A0A(cls.getComponentType());
                B8w = null;
            } else {
                A03 = interfaceC65620ToB.CBP().A03();
                B8w = interfaceC65620ToB.B8w();
            }
            interfaceC102444jN = new C64174T2d(A03, B8w);
        } else {
            interfaceC102444jN = null;
        }
        if (C2I7.A00(A01, this.A01) && interfaceC102444jN == this.A00) {
            return this;
        }
        if (this instanceof ShortDeser) {
            return new PrimitiveArrayDeserializers(interfaceC102444jN, this, A01);
        }
        if (this instanceof LongDeser) {
            return new PrimitiveArrayDeserializers(interfaceC102444jN, this, A01);
        }
        if (this instanceof IntDeser) {
            return new PrimitiveArrayDeserializers(interfaceC102444jN, this, A01);
        }
        if (this instanceof FloatDeser) {
            return new PrimitiveArrayDeserializers(interfaceC102444jN, this, A01);
        }
        if (this instanceof DoubleDeser) {
            return new PrimitiveArrayDeserializers(interfaceC102444jN, this, A01);
        }
        if (this instanceof CharDeser) {
            return this;
        }
        if (this instanceof ByteDeser) {
            return new PrimitiveArrayDeserializers(interfaceC102444jN, this, A01);
        }
        return new PrimitiveArrayDeserializers(interfaceC102444jN, this, A01);
    }

    public PrimitiveArrayDeserializers(Class cls) {
        super(cls);
        this.A01 = null;
        this.A00 = null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0C(C16L c16l, AnonymousClass469 anonymousClass469, Object obj) {
        Object A0D = A0D(c16l, anonymousClass469);
        if (obj != null && Array.getLength(obj) != 0) {
            if (this instanceof ShortDeser) {
                short[] sArr = (short[]) obj;
                short[] sArr2 = (short[]) A0D;
                int length = sArr.length;
                int length2 = sArr2.length;
                short[] copyOf = Arrays.copyOf(sArr, length + length2);
                System.arraycopy(sArr2, 0, copyOf, length, length2);
                return copyOf;
            }
            if (this instanceof LongDeser) {
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) A0D;
                int length3 = jArr.length;
                int length4 = jArr2.length;
                long[] copyOf2 = Arrays.copyOf(jArr, length3 + length4);
                System.arraycopy(jArr2, 0, copyOf2, length3, length4);
                return copyOf2;
            }
            if (this instanceof IntDeser) {
                int[] iArr = (int[]) obj;
                int[] iArr2 = (int[]) A0D;
                int length5 = iArr.length;
                int length6 = iArr2.length;
                int[] copyOf3 = Arrays.copyOf(iArr, length5 + length6);
                System.arraycopy(iArr2, 0, copyOf3, length5, length6);
                return copyOf3;
            }
            if (this instanceof FloatDeser) {
                float[] fArr = (float[]) obj;
                float[] fArr2 = (float[]) A0D;
                int length7 = fArr.length;
                int length8 = fArr2.length;
                float[] copyOf4 = Arrays.copyOf(fArr, length7 + length8);
                System.arraycopy(fArr2, 0, copyOf4, length7, length8);
                return copyOf4;
            }
            if (this instanceof DoubleDeser) {
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) A0D;
                int length9 = dArr.length;
                int length10 = dArr2.length;
                double[] copyOf5 = Arrays.copyOf(dArr, length9 + length10);
                System.arraycopy(dArr2, 0, copyOf5, length9, length10);
                return copyOf5;
            }
            if (this instanceof CharDeser) {
                char[] cArr = (char[]) obj;
                char[] cArr2 = (char[]) A0D;
                int length11 = cArr.length;
                int length12 = cArr2.length;
                char[] copyOf6 = Arrays.copyOf(cArr, length11 + length12);
                System.arraycopy(cArr2, 0, copyOf6, length11, length12);
                return copyOf6;
            }
            if (this instanceof ByteDeser) {
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) A0D;
                int length13 = bArr.length;
                int length14 = bArr2.length;
                byte[] copyOf7 = Arrays.copyOf(bArr, length13 + length14);
                System.arraycopy(bArr2, 0, copyOf7, length13, length14);
                return copyOf7;
            }
            boolean[] zArr = (boolean[]) obj;
            boolean[] zArr2 = (boolean[]) A0D;
            int length15 = zArr.length;
            int length16 = zArr2.length;
            boolean[] copyOf8 = Arrays.copyOf(zArr, length15 + length16);
            System.arraycopy(zArr2, 0, copyOf8, length15, length16);
            return copyOf8;
        }
        return A0D;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Boolean A0G(C912845h c912845h) {
        return Boolean.TRUE;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0J(C16L c16l, AnonymousClass469 anonymousClass469, AbstractC63020Sal abstractC63020Sal) {
        return abstractC63020Sal.A04(c16l, anonymousClass469);
    }

    public PrimitiveArrayDeserializers(InterfaceC102444jN interfaceC102444jN, PrimitiveArrayDeserializers primitiveArrayDeserializers, Boolean bool) {
        super(((StdDeserializer) primitiveArrayDeserializers).A00);
        this.A01 = bool;
        this.A00 = interfaceC102444jN;
    }
}
