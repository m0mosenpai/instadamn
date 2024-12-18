package com.fasterxml.jackson.datatype.guava.deser;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC58318PtA;
import X.AbstractC58322PtE;
import X.AbstractC63020Sal;
import X.AbstractC910944l;
import X.AnonymousClass469;
import X.C00O;
import X.C05F;
import X.C16L;
import X.C16R;
import X.C18C;
import X.C45T;
import X.C63105Sd9;
import X.C912845h;
import X.InterfaceC102474jf;
import X.InterfaceC65620ToB;
import X.MSY;
import X.TIF;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.google.common.base.Strings;
import com.google.common.collect.BoundType;
import com.google.common.collect.Cut;
import com.google.common.collect.Range;
import java.util.Arrays;

/* loaded from: classes10.dex */
public class RangeDeserializer extends StdDeserializer implements InterfaceC102474jf {
    public final TIF A00;
    public final BoundType A01;
    public final AbstractC910944l A02;
    public final JsonDeserializer A03;

    private BoundType A00(C16L c16l, AnonymousClass469 anonymousClass469) {
        C16R c16r = C16R.A0J;
        C16R A11 = c16l.A11();
        if (A11 != c16r) {
            anonymousClass469.A0h(String.format("Problem deserializing %s: expecting %s, found %s", A0H().getName(), c16r, A11), new Object[0]);
            throw C00O.createAndThrow();
        }
        String A1P = c16l.A1P();
        try {
            return BoundType.valueOf(A1P);
        } catch (IllegalArgumentException unused) {
            anonymousClass469.A0e(BoundType.class, A1P, "not a valid BoundType name (should be one oF: %s)", Arrays.asList(BoundType.values()));
            throw C00O.createAndThrow();
        }
    }

    private Comparable A01(C16L c16l, AnonymousClass469 anonymousClass469) {
        Object A0D = this.A03.A0D(c16l, anonymousClass469);
        if (!(A0D instanceof Comparable)) {
            AbstractC58318PtA.A1N(anonymousClass469, this.A02, "Field [%s] deserialized to [%s], which does not implement Comparable.", new Object[]{c16l.A0q(), MSY.A0h(A0D)});
            throw C00O.createAndThrow();
        }
        return (Comparable) A0D;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Integer A0I() {
        return C05F.A0N;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public final AbstractC910944l A0T() {
        return this.A02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC102474jf
    public final JsonDeserializer ALr(InterfaceC65620ToB interfaceC65620ToB, AnonymousClass469 anonymousClass469) {
        JsonDeserializer jsonDeserializer;
        C912845h c912845h = anonymousClass469.A02;
        TIF A00 = C63105Sd9.A00(((C45T) c912845h).A01.A02, c912845h);
        JsonDeserializer jsonDeserializer2 = this.A03;
        if (jsonDeserializer2 == 0) {
            jsonDeserializer = anonymousClass469.A0B(interfaceC65620ToB, AbstractC58322PtE.A0a(this.A02, 0));
        } else {
            boolean z = jsonDeserializer2 instanceof InterfaceC102474jf;
            jsonDeserializer = jsonDeserializer2;
            if (z) {
                jsonDeserializer = ((InterfaceC102474jf) jsonDeserializer2).ALr(interfaceC65620ToB, anonymousClass469);
            }
        }
        if (jsonDeserializer == jsonDeserializer2 && A00 == this.A00) {
            return this;
        }
        return new RangeDeserializer(this.A02, jsonDeserializer, A00, this.A01);
    }

    public RangeDeserializer(AbstractC910944l abstractC910944l, JsonDeserializer jsonDeserializer, TIF tif, BoundType boundType) {
        super(abstractC910944l);
        this.A02 = abstractC910944l;
        this.A03 = jsonDeserializer;
        this.A01 = boundType;
        this.A00 = tif;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        Cut cut;
        Cut cut2;
        C16R A11 = c16l.A11();
        if (A11 == C16R.A0D) {
            A11 = c16l.A1J();
        }
        BoundType boundType = this.A01;
        Comparable comparable = null;
        BoundType boundType2 = boundType;
        Comparable comparable2 = null;
        while (A11 != C16R.A09) {
            C16R c16r = C16R.A0A;
            if (A11 != c16r) {
                anonymousClass469.A0h(String.format("Problem deserializing %s: expecting %s, found %s", A0H().getName(), c16r, A11), new Object[0]);
                throw C00O.createAndThrow();
            }
            String A0q = c16l.A0q();
            try {
                TIF tif = this.A00;
                if (A0q.equals(tif.A01)) {
                    c16l.A1J();
                    comparable2 = A01(c16l, anonymousClass469);
                } else if (A0q.equals(tif.A03)) {
                    c16l.A1J();
                    comparable = A01(c16l, anonymousClass469);
                } else if (A0q.equals(tif.A00)) {
                    c16l.A1J();
                    boundType = A00(c16l, anonymousClass469);
                } else if (A0q.equals(tif.A02)) {
                    c16l.A1J();
                    boundType2 = A00(c16l, anonymousClass469);
                } else {
                    anonymousClass469.A0S(c16l, this, Range.class, A0q);
                }
                A11 = c16l.A1J();
            } catch (IllegalStateException e) {
                anonymousClass469.A09(e.getMessage(), A0H());
                throw C00O.createAndThrow();
            }
        }
        boolean z = true;
        if (comparable2 != null) {
            if (comparable != null) {
                Class<?> cls = comparable2.getClass();
                Class<?> cls2 = comparable.getClass();
                boolean A1X = AbstractC167007dF.A1X(cls, cls2);
                String name = cls.getName();
                String name2 = cls2.getName();
                if (A1X) {
                    C18C.A0H(AbstractC167007dF.A1W(boundType), "'lowerEndpoint' field found, but not 'lowerBoundType'");
                    if (boundType2 == null) {
                        z = false;
                    }
                    C18C.A0H(z, "'upperEndpoint' field found, but not 'upperBoundType'");
                    Range range = Range.A00;
                    boundType.getClass();
                    boundType2.getClass();
                    BoundType boundType3 = BoundType.OPEN;
                    if (boundType == boundType3) {
                        cut = new Cut(comparable2);
                    } else {
                        cut = new Cut(comparable2);
                    }
                    if (boundType2 != boundType3) {
                        cut2 = new Cut(comparable);
                    } else {
                        cut2 = new Cut(comparable);
                    }
                    return new Range(cut, cut2);
                }
                throw AbstractC166987dD.A14(Strings.A00("Endpoint types are not the same - 'lowerEndpoint' deserialized to [%s], and 'upperEndpoint' deserialized to [%s].", name, name2));
            }
            if (boundType == null) {
                z = false;
            }
            C18C.A0H(z, "'lowerEndpoint' field found, but not 'lowerBoundType'");
            Range range2 = Range.A00;
            int ordinal = boundType.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    return new Range(new Cut(comparable2), Cut.AboveAll.A00);
                }
                throw AbstractC58318PtA.A0V();
            }
            return new Range(new Cut(comparable2), Cut.AboveAll.A00);
        }
        if (comparable != null) {
            if (boundType2 == null) {
                z = false;
            }
            C18C.A0H(z, "'upperEndpoint' field found, but not 'upperBoundType'");
            Range range3 = Range.A00;
            int ordinal2 = boundType2.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 == 1) {
                    return new Range(Cut.BelowAll.A00, new Cut(comparable));
                }
                throw AbstractC58318PtA.A0V();
            }
            return new Range(Cut.BelowAll.A00, new Cut(comparable));
        }
        return Range.A00;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0J(C16L c16l, AnonymousClass469 anonymousClass469, AbstractC63020Sal abstractC63020Sal) {
        return abstractC63020Sal.A05(c16l, anonymousClass469);
    }
}
