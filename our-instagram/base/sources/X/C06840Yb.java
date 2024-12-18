package X;

import java.io.Serializable;

/* renamed from: X.0Yb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C06840Yb implements C0s3, Serializable {
    public final int arity;
    public final int flags;
    public final boolean isTopLevel;
    public final String name;
    public final Class owner;
    public final Object receiver;
    public final String signature;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C06840Yb)) {
            return false;
        }
        C06840Yb c06840Yb = (C06840Yb) obj;
        return this.isTopLevel == c06840Yb.isTopLevel && this.arity == c06840Yb.arity && this.flags == c06840Yb.flags && C14360o3.A0K(this.receiver, c06840Yb.receiver) && C14360o3.A0K(this.owner, c06840Yb.owner) && this.name.equals(c06840Yb.name) && this.signature.equals(c06840Yb.signature);
    }

    @Override // X.C0s3
    public int getArity() {
        return this.arity;
    }

    public C0s5 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            return new C0YX(cls);
        }
        return new C0YZ(cls);
    }

    public int hashCode() {
        int i;
        Object obj = this.receiver;
        int i2 = 0;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Class cls = this.owner;
        if (cls != null) {
            i2 = cls.hashCode();
        }
        int hashCode = (((((i3 + i2) * 31) + this.name.hashCode()) * 31) + this.signature.hashCode()) * 31;
        int i4 = 1237;
        if (this.isTopLevel) {
            i4 = 1231;
        }
        return ((((hashCode + i4) * 31) + this.arity) * 31) + this.flags;
    }

    public C06840Yb(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = (i2 & 1) == 1;
        this.arity = i;
        this.flags = i2 >> 1;
    }

    public String toString() {
        return C15420px.A00(this);
    }

    public C06840Yb(int i, Class cls, String str, String str2, int i2) {
        this(i, AbstractC06830Ya.NO_RECEIVER, cls, str, str2, i2);
    }
}
