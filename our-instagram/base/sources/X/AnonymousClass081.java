package X;

/* renamed from: X.081, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass081 extends AbstractC06830Ya implements C0YR {
    public final boolean A00;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AnonymousClass081) {
                AbstractC06830Ya abstractC06830Ya = (AbstractC06830Ya) obj;
                if (!getOwner().equals(abstractC06830Ya.getOwner()) || !this.name.equals(abstractC06830Ya.name) || !this.signature.equals(abstractC06830Ya.signature) || !C14360o3.A0K(this.receiver, abstractC06830Ya.receiver)) {
                    return false;
                }
            } else {
                if (!(obj instanceof C0YR)) {
                    return false;
                }
                return obj.equals(compute());
            }
        }
        return true;
    }

    public AnonymousClass081(Class cls, Object obj, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.A00 = (i & 2) == 2;
    }

    @Override // X.AbstractC06830Ya
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C0YR getReflected() {
        if (!this.A00) {
            return (C0YR) super.getReflected();
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
    }

    @Override // X.AbstractC06830Ya
    public final InterfaceC16520rx compute() {
        if (this.A00) {
            return this;
        }
        InterfaceC16520rx interfaceC16520rx = this.reflected;
        if (interfaceC16520rx == null) {
            this.reflected = this;
            return this;
        }
        return interfaceC16520rx;
    }

    public final int hashCode() {
        return (((getOwner().hashCode() * 31) + this.name.hashCode()) * 31) + this.signature.hashCode();
    }

    public final String toString() {
        InterfaceC16520rx compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return AnonymousClass001.A0g("property ", this.name, " (Kotlin reflection is not available)");
    }
}
