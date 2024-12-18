package X;

/* renamed from: X.0aE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC07400aE {
    public int A00 = -1;
    public final int A01;
    public final Class A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C14360o3.A0K(getClass(), obj.getClass())) {
                return false;
            }
            AbstractC07400aE abstractC07400aE = (AbstractC07400aE) obj;
            if (!C14360o3.A0K(this.A03, abstractC07400aE.A03) || !C14360o3.A0K(A00(), abstractC07400aE.A00()) || this.A01 != abstractC07400aE.A01 || this.A00 != abstractC07400aE.A00) {
                return false;
            }
        }
        return true;
    }

    private final String A00() {
        Class cls = this.A02;
        if (C14360o3.A0K(cls, String.class)) {
            return "String";
        }
        if (C14360o3.A0K(cls, Integer.class)) {
            return "Int";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported type: ");
        sb.append(cls);
        throw new IllegalArgumentException(sb.toString());
    }

    public final int hashCode() {
        return (((((this.A03.hashCode() * 17) + A00().hashCode()) * 17) + this.A01) * 17) + this.A00;
    }

    public AbstractC07400aE(Class cls, String str, int i) {
        this.A03 = str;
        this.A02 = cls;
        this.A01 = i;
    }
}
