package X;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

/* renamed from: X.455, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class AnonymousClass455 {
    public AbstractC910944l A03() {
        return ((AnonymousClass454) this).A03;
    }

    public Class A04() {
        return ((AnonymousClass454) this).A05;
    }

    public String A05() {
        return ((AnonymousClass454) this).A05.getName();
    }

    public Annotation A06(Class cls) {
        return ((AnonymousClass454) this).A04.AXU(cls);
    }

    public boolean A08(Class[] clsArr) {
        return ((AnonymousClass454) this).A04.CLT(clsArr);
    }

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract String toString();

    public AnnotatedElement A07() {
        throw C00O.createAndThrow();
    }
}
