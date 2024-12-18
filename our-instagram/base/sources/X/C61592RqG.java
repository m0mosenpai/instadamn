package X;

/* renamed from: X.RqG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C61592RqG {
    public InterfaceC65394TjR A00;
    public boolean A01;

    public final void A00(ROZ roz) {
        if (this.A01) {
            AbstractC63398SjT.A0A("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            this.A00.EN0(new C60630REp(EnumC61103RfI.DEFAULT, roz));
        } catch (Throwable unused) {
            AbstractC63398SjT.A0A("BillingLogger", "logging failed.");
        }
    }
}
