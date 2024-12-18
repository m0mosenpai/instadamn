package X;

/* renamed from: X.4jq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C102574jq {
    public Boolean A00;
    public Boolean A01;
    public final AbstractC12990ll A02;

    public C102574jq(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 1);
        this.A02 = abstractC12990ll;
    }

    public final synchronized boolean A00() {
        boolean z;
        Boolean bool = this.A01;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = true;
            this.A01 = true;
        }
        return z;
    }
}
