package X;

/* renamed from: X.08B, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C08B extends AbstractC06830Ya implements C0YS, C0s3 {
    public final int arity;
    public final int flags;

    @Override // X.AbstractC06830Ya
    public InterfaceC16520rx computeReflected() {
        return this;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C08B) {
                C08B c08b = (C08B) obj;
                if (!this.name.equals(c08b.name) || !this.signature.equals(c08b.signature) || this.flags != c08b.flags || this.arity != c08b.arity || !C14360o3.A0K(this.receiver, c08b.receiver) || !C14360o3.A0K(getOwner(), c08b.getOwner())) {
                    return false;
                }
            } else {
                if (!(obj instanceof C0YS)) {
                    return false;
                }
                return obj.equals(compute());
            }
        }
        return true;
    }

    public C08B(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }

    @Override // X.C0s3
    public int getArity() {
        return this.arity;
    }

    @Override // X.AbstractC06830Ya
    public C0YS getReflected() {
        return (C0YS) super.getReflected();
    }

    public int hashCode() {
        int hashCode;
        if (getOwner() == null) {
            hashCode = 0;
        } else {
            hashCode = getOwner().hashCode() * 31;
        }
        return ((hashCode + this.name.hashCode()) * 31) + this.signature.hashCode();
    }

    @Override // X.C0YS
    public boolean isExternal() {
        ((C0YS) super.getReflected()).isExternal();
        throw null;
    }

    @Override // X.C0YS
    public boolean isInfix() {
        ((C0YS) super.getReflected()).isInfix();
        throw null;
    }

    @Override // X.C0YS
    public boolean isInline() {
        ((C0YS) super.getReflected()).isInline();
        throw null;
    }

    @Override // X.C0YS
    public boolean isOperator() {
        ((C0YS) super.getReflected()).isOperator();
        throw null;
    }

    @Override // X.AbstractC06830Ya, X.InterfaceC16520rx, X.C0YS
    public boolean isSuspend() {
        ((C0YS) super.getReflected()).isSuspend();
        throw null;
    }

    public String toString() {
        InterfaceC16520rx compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        String str = this.name;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return AnonymousClass001.A0g("function ", str, " (Kotlin reflection is not available)");
    }

    @Override // X.AbstractC06830Ya
    public /* bridge */ /* synthetic */ InterfaceC16520rx getReflected() {
        return super.getReflected();
    }
}
