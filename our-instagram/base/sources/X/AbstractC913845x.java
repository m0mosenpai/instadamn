package X;

import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import java.util.ArrayList;

/* renamed from: X.45x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC913845x {
    public final AbstractC910944l A06(AbstractC910944l abstractC910944l) {
        AnonymousClass464[] anonymousClass464Arr = ((AbstractC913745w) this).A00.A00;
        if (anonymousClass464Arr.length > 0) {
            C55A c55a = new C55A(anonymousClass464Arr);
            if (c55a.hasNext()) {
                c55a.next();
                throw new NullPointerException("findTypeMapping");
            }
        }
        return abstractC910944l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x020d, code lost:
    
        if (r1.contains("List") != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x022e, code lost:
    
        if (r2.contains("Set") != false) goto L121;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.JsonDeserializer A07(X.AnonymousClass469 r17, X.C45B r18, X.RD4 r19) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC913845x.A07(X.469, X.45B, X.RD4):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.16L] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.RBd] */
    public final RBd A08(C912845h c912845h, AbstractC910944l abstractC910944l) {
        ArrayList A03;
        AbstractC910944l A06;
        Class cls;
        Class cls2 = abstractC910944l.A00;
        AnonymousClass454 anonymousClass454 = c912845h.A02(cls2).A07;
        InterfaceC65505Tla A0K = c912845h.A00().A0K(c912845h, anonymousClass454);
        ?? r3 = 0;
        if (A0K == null) {
            A0K = ((C45T) c912845h).A01.A06;
            if (A0K == null) {
                return null;
            }
            A03 = null;
        } else {
            A03 = ((C45S) c912845h).A03.A03(c912845h, anonymousClass454);
        }
        StdTypeResolverBuilder stdTypeResolverBuilder = (StdTypeResolverBuilder) A0K;
        if (stdTypeResolverBuilder._defaultImpl == null && abstractC910944l.A0L() && (A06 = A06(abstractC910944l)) != null && (cls = A06.A00) != cls2) {
            if (stdTypeResolverBuilder._defaultImpl != cls) {
                C914045z.A0E(StdTypeResolverBuilder.class, stdTypeResolverBuilder, "withDefaultImpl");
                ?? obj = new Object();
                obj._typeIdVisible = false;
                obj._idType = stdTypeResolverBuilder._idType;
                obj._includeAs = stdTypeResolverBuilder._includeAs;
                obj._typeProperty = stdTypeResolverBuilder._typeProperty;
                obj._typeIdVisible = stdTypeResolverBuilder._typeIdVisible;
                obj._customIdResolver = stdTypeResolverBuilder._customIdResolver;
                obj._defaultImpl = cls;
                stdTypeResolverBuilder = obj;
            }
            A0K = stdTypeResolverBuilder;
        }
        try {
            r3 = A0K.AEn(c912845h, abstractC910944l, A03);
            return r3;
        } catch (IllegalArgumentException | IllegalStateException e) {
            R9A r9a = new R9A((C16L) r3, abstractC910944l, C914045z.A09(e));
            r9a.initCause(e);
            throw r9a;
        }
    }
}
