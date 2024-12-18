package X;

/* renamed from: X.TwW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65925TwW implements XB8 {
    public final int A00;
    public final Object A01;

    public C65925TwW(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.XB8
    public final String E6U() {
        switch (this.A00) {
            case 0:
                return ((V1F) this.A01).A07;
            case 1:
                return ((AbstractC65919TwQ) this.A01).A01.A01;
            default:
                String str = ((AbstractC67878V0j) this.A01).A06().A0J;
                if (str == null) {
                    C14360o3.A0F("query");
                    throw C00O.createAndThrow();
                }
                return str;
        }
    }
}
