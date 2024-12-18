package com.fasterxml.jackson.databind.jsontype.impl;

import X.AbstractC166987dD;
import X.AbstractC43594JPz;
import X.AbstractC58318PtA;
import X.AbstractC60587RBe;
import X.AbstractC910944l;
import X.C44x;
import X.C44z;
import X.C45R;
import X.C45T;
import X.C45Y;
import X.C60590RBh;
import X.C60591RBi;
import X.C60592RBj;
import X.C60593RBk;
import X.C60596RBn;
import X.EnumC61124Rfe;
import X.EnumC61152RgD;
import X.InterfaceC65505Tla;
import X.InterfaceC65565Tmr;
import X.TI3;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes10.dex */
public class StdTypeResolverBuilder implements InterfaceC65505Tla {
    public InterfaceC65565Tmr _customIdResolver;
    public Class _defaultImpl;
    public EnumC61152RgD _idType;
    public EnumC61124Rfe _includeAs;
    public boolean _typeIdVisible = false;
    public String _typeProperty;

    /* JADX WARN: Code restructure failed: missing block: B:48:0x009f, code lost:
    
        if (r4 == r15._defaultImpl) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
    @Override // X.InterfaceC65505Tla
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.RBd AEn(X.C912845h r16, X.AbstractC910944l r17, java.util.Collection r18) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.AEn(X.45h, X.44l, java.util.Collection):X.RBd");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65505Tla
    public final AbstractC60587RBe AEo(AbstractC910944l abstractC910944l, C45R c45r, Collection collection) {
        if (this._idType == EnumC61152RgD.NONE || abstractC910944l.A00.isPrimitive()) {
            return null;
        }
        C44z c44z = ((C45T) c45r).A01.A05;
        C44z c44z2 = c44z;
        if (c44z == C44x.A00) {
            c44z2 = c44z;
            if ((((C45T) c45r).A00 & C45Y.A0F.A00) != 0) {
                c44z2 = new Object();
            }
        }
        InterfaceC65565Tmr A00 = A00(abstractC910944l, c45r, c44z2, collection, true, false);
        if (this._idType != EnumC61152RgD.DEDUCTION) {
            EnumC61124Rfe enumC61124Rfe = this._includeAs;
            int ordinal = enumC61124Rfe.ordinal();
            if (ordinal != 2) {
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                throw AbstractC43594JPz.A0o(enumC61124Rfe, "Do not know how to construct standard type serializer for inclusion type: ", AbstractC166987dD.A1C());
                            }
                        } else {
                            return new C60596RBn(null, A00, this._typeProperty);
                        }
                    } else {
                        return new AbstractC60587RBe(null, A00);
                    }
                } else {
                    return new C60590RBh(null, A00, this._typeProperty);
                }
            } else {
                return new AbstractC60587RBe(null, A00);
            }
        }
        return new C60590RBh(null, A00, this._typeProperty);
    }

    public final InterfaceC65565Tmr A00(AbstractC910944l abstractC910944l, C45T c45t, C44z c44z, Collection collection, boolean z, boolean z2) {
        HashMap A1G;
        ConcurrentHashMap concurrentHashMap;
        int lastIndexOf;
        InterfaceC65565Tmr interfaceC65565Tmr = this._customIdResolver;
        if (interfaceC65565Tmr == null) {
            EnumC61152RgD enumC61152RgD = this._idType;
            if (enumC61152RgD != null) {
                int ordinal = enumC61152RgD.ordinal();
                if (ordinal != 4 && ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal == 0) {
                                return null;
                            }
                            throw AbstractC43594JPz.A0o(enumC61152RgD, "Do not know how to construct standard type id resolver for idType: ", AbstractC166987dD.A1C());
                        }
                        if (z != z2) {
                            if (z) {
                                concurrentHashMap = AbstractC58318PtA.A14();
                                A1G = null;
                            } else {
                                A1G = AbstractC166987dD.A1G();
                                concurrentHashMap = new ConcurrentHashMap(4);
                            }
                            boolean A08 = c45t.A08(C45Y.A05);
                            if (collection != null) {
                                Iterator it = collection.iterator();
                                while (it.hasNext()) {
                                    TI3 ti3 = (TI3) it.next();
                                    Class cls = ti3.A01;
                                    String str = ti3.A00;
                                    if (str == null && (lastIndexOf = (str = cls.getName()).lastIndexOf(46)) >= 0) {
                                        str = AbstractC58318PtA.A0g(lastIndexOf, str);
                                    }
                                    if (z) {
                                        AbstractC58318PtA.A1P(cls, str, concurrentHashMap);
                                    }
                                    if (z2) {
                                        if (A08) {
                                            str = str.toLowerCase();
                                        }
                                        AbstractC910944l abstractC910944l2 = (AbstractC910944l) A1G.get(str);
                                        if (abstractC910944l2 == null || !cls.isAssignableFrom(abstractC910944l2.A00)) {
                                            A1G.put(str, c45t.A01.A07.A09(cls));
                                        }
                                    }
                                }
                            }
                            return new C60593RBk(abstractC910944l, c45t, A1G, concurrentHashMap);
                        }
                        throw AbstractC58318PtA.A0Y();
                    }
                    return new C60591RBi(abstractC910944l, c44z, c45t.A01.A07);
                }
                return new C60592RBj(abstractC910944l, c44z, c45t.A01.A07);
            }
            throw AbstractC166987dD.A14("Cannot build, 'init()' not yet called");
        }
        return interfaceC65565Tmr;
    }
}
