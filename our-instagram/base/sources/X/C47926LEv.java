package X;

/* renamed from: X.LEv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47926LEv {
    public W8w A00;
    public boolean A01;
    public final InterfaceC73573Rj A02;
    public final C94E A03;
    public final L7O A04;
    public final String A05;
    public final C19L A06;

    public C47926LEv(InterfaceC73573Rj interfaceC73573Rj, C94E c94e, L7O l7o, String str, C19L c19l) {
        AbstractC25234BEr.A0j(1, str, c94e, interfaceC73573Rj, c19l);
        this.A05 = str;
        this.A04 = l7o;
        this.A03 = c94e;
        this.A02 = interfaceC73573Rj;
        this.A06 = c19l;
    }

    public static final void A00(C47926LEv c47926LEv) {
        if (!c47926LEv.A01) {
            c47926LEv.A01 = true;
            InterfaceC73573Rj interfaceC73573Rj = c47926LEv.A02;
            L7O l7o = c47926LEv.A04;
            String str = c47926LEv.A05;
            String A00 = l7o.A00(str);
            C14360o3.A0B(A00, 0);
            if (((C3Ri) interfaceC73573Rj).A00.hasKey(A00)) {
                String string = interfaceC73573Rj.getString(l7o.A00(str));
                C73773Sh c73773Sh = AbstractC73763Sg.A03;
                C3R9[] c3r9Arr = W8w.A02;
                c47926LEv.A00 = (W8w) c73773Sh.A00(string, C71743X0i.A00);
            }
        }
    }
}
