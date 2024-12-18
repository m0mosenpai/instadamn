package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.HashCodeDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.HostAndPortDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.InternetDomainNameDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.RangeDeserializer;
import com.google.common.collect.Range;
import java.io.Serializable;

/* renamed from: X.4jA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C102354jA extends AbstractC102364jB implements Serializable {
    public static void A00(RD4 rd4, String str) {
        Class cls = ((AnonymousClass559) rd4).A00.A00;
        if (Comparable.class.isAssignableFrom(cls)) {
        } else {
            throw new IllegalArgumentException(AnonymousClass001.A11("Can not handle ", str, " with elements that are not Comparable<?> (", cls.getName(), ")"));
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, com.fasterxml.jackson.databind.JsonDeserializer] */
    @Override // X.AnonymousClass462
    public final JsonDeserializer AVN(C912845h c912845h, AbstractC910944l abstractC910944l, C45B c45b) {
        Class cls = abstractC910944l.A00;
        if (cls == SPS.class) {
            return new Object();
        }
        if (cls == Range.class) {
            return new RangeDeserializer(abstractC910944l, null, C63105Sd9.A00, null);
        }
        if (cls == TIC.class) {
            return HostAndPortDeserializer.A00;
        }
        if (cls == C63202Sf5.class) {
            return InternetDomainNameDeserializer.A00;
        }
        if (cls == AbstractC50542Tz.class) {
            return HashCodeDeserializer.A00;
        }
        return null;
    }
}
