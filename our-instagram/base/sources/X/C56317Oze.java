package X;

/* renamed from: X.Oze, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56317Oze implements C87J {
    public final /* synthetic */ C50868Mdz A00;
    public final /* synthetic */ Integer A01;

    public C56317Oze(C50868Mdz c50868Mdz, Integer num) {
        this.A01 = num;
        this.A00 = c50868Mdz;
    }

    @Override // X.C87J
    public final int Bdt() {
        return MSW.A04(this.A00.A0E);
    }

    @Override // X.C87J
    public final int CFM() {
        Integer num = this.A01;
        if (num != null) {
            return num.intValue();
        }
        return this.A00.A01;
    }
}
