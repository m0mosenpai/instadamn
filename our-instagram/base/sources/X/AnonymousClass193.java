package X;

import java.io.Serializable;

/* renamed from: X.193, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass193 implements C12W, Serializable {
    public final C12V A00;
    public final C12W A01;

    public AnonymousClass193(C12V c12v, C12W c12w) {
        C14360o3.A0B(c12w, 1);
        this.A01 = c12w;
        this.A00 = c12v;
    }

    @Override // X.C12W
    public final Object fold(Object obj, InterfaceC16620sF interfaceC16620sF) {
        C14360o3.A0B(interfaceC16620sF, 1);
        return interfaceC16620sF.invoke(this.A01.fold(obj, interfaceC16620sF), this.A00);
    }

    @Override // X.C12W
    public final C12V get(InterfaceC212412b interfaceC212412b) {
        C14360o3.A0B(interfaceC212412b, 0);
        AnonymousClass193 anonymousClass193 = this;
        while (true) {
            C12V c12v = anonymousClass193.A00.get(interfaceC212412b);
            if (c12v == null) {
                C12W c12w = anonymousClass193.A01;
                if (c12w instanceof AnonymousClass193) {
                    anonymousClass193 = (AnonymousClass193) c12w;
                } else {
                    return c12w.get(interfaceC212412b);
                }
            } else {
                return c12v;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C12W
    public final C12W minusKey(InterfaceC212412b interfaceC212412b) {
        AnonymousClass193 anonymousClass193;
        C14360o3.A0B(interfaceC212412b, 0);
        C12V c12v = this.A00;
        if (c12v.get(interfaceC212412b) != null) {
            return this.A01;
        }
        C12W c12w = this.A01;
        C12W minusKey = c12w.minusKey(interfaceC212412b);
        if (minusKey == c12w) {
            anonymousClass193 = this;
        } else {
            anonymousClass193 = c12v;
            if (minusKey != AnonymousClass191.A00) {
                anonymousClass193 = new AnonymousClass193(c12v, minusKey);
            }
        }
        return anonymousClass193;
    }

    @Override // X.C12W
    public final C12W plus(C12W c12w) {
        C14360o3.A0B(c12w, 1);
        return c12w != AnonymousClass191.A00 ? (C12W) c12w.fold(this, AnonymousClass192.A00) : this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass193) {
                AnonymousClass193 anonymousClass193 = (AnonymousClass193) obj;
                int i = 2;
                AnonymousClass193 anonymousClass1932 = anonymousClass193;
                while (true) {
                    C12W c12w = anonymousClass1932.A01;
                    if (!(c12w instanceof AnonymousClass193) || (anonymousClass1932 = (AnonymousClass193) c12w) == null) {
                        break;
                    }
                    i++;
                }
                int i2 = 2;
                AnonymousClass193 anonymousClass1933 = this;
                while (true) {
                    C12W c12w2 = anonymousClass1933.A01;
                    if (!(c12w2 instanceof AnonymousClass193) || (anonymousClass1933 = (AnonymousClass193) c12w2) == null) {
                        break;
                    }
                    i2++;
                }
                if (i == i2) {
                    AnonymousClass193 anonymousClass1934 = this;
                    while (true) {
                        C12V c12v = anonymousClass1934.A00;
                        if (C14360o3.A0K(anonymousClass193.get(c12v.getKey()), c12v)) {
                            C12W c12w3 = anonymousClass1934.A01;
                            if (c12w3 instanceof AnonymousClass193) {
                                anonymousClass1934 = (AnonymousClass193) c12w3;
                            } else {
                                C14360o3.A0C(c12w3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                                C12V c12v2 = (C12V) c12w3;
                                if (C14360o3.A0K(anonymousClass193.get(c12v2.getKey()), c12v2)) {
                                    return true;
                                }
                                return false;
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return true;
        }
    }

    public final int hashCode() {
        return this.A01.hashCode() + this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass001.A0E((String) fold("", X6C.A00), '[', ']');
    }
}
