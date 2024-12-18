package X;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonMerge;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.Serializable;

/* renamed from: X.44V, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C44V extends C44W implements Serializable {
    public transient C910644i A00 = new C910644i(48, 48);
    public static final Class[] A02 = {JsonSerialize.class, JsonView.class, JsonFormat.class, JsonTypeInfo.class, JsonRawValue.class, JsonUnwrapped.class, JsonBackReference.class, JsonManagedReference.class};
    public static final Class[] A01 = {JsonDeserialize.class, JsonView.class, JsonFormat.class, JsonTypeInfo.class, JsonUnwrapped.class, JsonBackReference.class, JsonManagedReference.class, JsonMerge.class};

    static {
        try {
            AbstractC910544h abstractC910544h = AbstractC910544h.$redex_init_class;
        } catch (Throwable unused) {
        }
    }

    public static boolean A00(AbstractC910944l abstractC910944l, Class cls) {
        Class cls2 = abstractC910944l.A00;
        if (cls2.isPrimitive()) {
            if (cls2 != C914045z.A01(cls)) {
                return false;
            }
        } else if (!cls.isPrimitive() || cls != C914045z.A01(cls2)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC65505Tla A0q(X.C45T r7, X.AnonymousClass455 r8) {
        /*
            r6 = this;
            java.lang.Class<com.fasterxml.jackson.annotation.JsonTypeInfo> r0 = com.fasterxml.jackson.annotation.JsonTypeInfo.class
            java.lang.annotation.Annotation r5 = r8.A06(r0)
            com.fasterxml.jackson.annotation.JsonTypeInfo r5 = (com.fasterxml.jackson.annotation.JsonTypeInfo) r5
            java.lang.Class<com.fasterxml.jackson.databind.annotation.JsonTypeResolver> r0 = com.fasterxml.jackson.databind.annotation.JsonTypeResolver.class
            java.lang.annotation.Annotation r1 = r8.A06(r0)
            com.fasterxml.jackson.databind.annotation.JsonTypeResolver r1 = (com.fasterxml.jackson.databind.annotation.JsonTypeResolver) r1
            r0 = 0
            if (r1 == 0) goto L8c
            if (r5 == 0) goto Laf
            java.lang.Class r2 = r1.value()
            boolean r1 = r7.A05()
            java.lang.Object r4 = X.C914045z.A03(r2, r1)
            X.Tla r4 = (X.InterfaceC65505Tla) r4
        L23:
            java.lang.Class<com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver> r1 = com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver.class
            java.lang.annotation.Annotation r1 = r8.A06(r1)
            com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver r1 = (com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver) r1
            if (r1 == 0) goto L3b
            java.lang.Class r1 = r1.value()
            boolean r0 = r7.A05()
            java.lang.Object r0 = X.C914045z.A03(r1, r0)
            X.Tmr r0 = (X.InterfaceC65565Tmr) r0
        L3b:
            X.RgD r1 = r5.use()
            r3 = r4
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder r3 = (com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder) r3
            if (r1 == 0) goto La7
            r3._idType = r1
            r3._customIdResolver = r0
            java.lang.String r2 = r1.A00
            r3._typeProperty = r2
            X.Rfe r1 = r5.include()
            X.Rfe r0 = X.EnumC61124Rfe.EXTERNAL_PROPERTY
            if (r1 != r0) goto L82
            boolean r0 = r8 instanceof X.AnonymousClass454
            if (r0 == 0) goto L5a
            X.Rfe r1 = X.EnumC61124Rfe.PROPERTY
        L5a:
            r3._includeAs = r1
            java.lang.String r1 = r5.property()
            if (r1 == 0) goto L68
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L69
        L68:
            r1 = r2
        L69:
            r3._typeProperty = r1
            java.lang.Class r1 = r5.defaultImpl()
            java.lang.Class<X.XhK> r0 = X.AbstractC72581XhK.class
            if (r1 == r0) goto L7b
            boolean r0 = r1.isAnnotation()
            if (r0 != 0) goto L7b
            r3._defaultImpl = r1
        L7b:
            boolean r0 = r5.visible()
            r3._typeIdVisible = r0
            return r4
        L82:
            if (r1 != 0) goto L5a
            java.lang.String r1 = "includeAs cannot be null"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L8c:
            if (r5 == 0) goto Laf
            X.RgD r2 = r5.use()
            X.RgD r1 = X.EnumC61152RgD.NONE
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder r4 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder
            if (r2 != r1) goto La2
            r4.<init>()
            r4._idType = r1
            r4._customIdResolver = r0
            r4._typeProperty = r0
            return r4
        La2:
            r4.<init>()
            goto L23
        La7:
            java.lang.String r1 = "idType cannot be null"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        Laf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44V.A0q(X.45T, X.455):X.Tla");
    }

    public static boolean A01(Class cls, Class cls2) {
        if (cls.isPrimitive()) {
            if (cls == C914045z.A01(cls2)) {
                return true;
            }
            return false;
        }
        if (cls2.isPrimitive() && cls2 == C914045z.A01(cls)) {
            return true;
        }
        return false;
    }
}
