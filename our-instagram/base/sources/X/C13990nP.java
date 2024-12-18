package X;

/* renamed from: X.0nP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13990nP extends C12U {
    public static final C13980nO A01 = new Object();
    public final int A00;

    public C13990nP(int i) {
        super(A01);
        this.A00 = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CoroutineIgRunnableId(");
        int i = this.A00;
        sb.append(AbstractC14450oH.A00(i));
        sb.append(':');
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }
}
