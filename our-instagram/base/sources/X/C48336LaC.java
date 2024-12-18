package X;

/* renamed from: X.LaC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48336LaC implements C6D2 {
    public final /* synthetic */ C7W4 A00;

    public C48336LaC(C7W4 c7w4) {
        this.A00 = c7w4;
    }

    @Override // X.C6D2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C7IO c7io = this.A00.A0j.A04;
        if (c7io != null) {
            return Boolean.valueOf(c7io.CYr());
        }
        C14360o3.A0F("dmStatusProvider");
        throw C00O.createAndThrow();
    }
}
