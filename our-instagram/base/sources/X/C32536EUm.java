package X;

/* renamed from: X.EUm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32536EUm extends C1P1 {
    public final AbstractC12990ll A00;
    public final String A01;
    public final String A02;

    private final void A00(boolean z, String str) {
        AbstractC12990ll abstractC12990ll = this.A00;
        C18920wW A02 = AbstractC12220kQ.A02(abstractC12990ll);
        long currentTimeMillis = System.currentTimeMillis();
        String A0c = AbstractC31179DnN.A0c(abstractC12990ll);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A02, "phone_id_response_received");
        AbstractC31175DnJ.A10(A0f, currentTimeMillis);
        AbstractC31178DnM.A15(A0f, currentTimeMillis, C1Q9.A00());
        A0f.A7v("prefill_available", Boolean.valueOf(z));
        AbstractC31175DnJ.A0y(A0f);
        AbstractC31176DnK.A1J(A0f, AbstractC31171DnF.A00());
        AbstractC31178DnM.A13(A0f);
        A0f.AAP("fb_family_device_id", AbstractC35274Fh9.A02(abstractC12990ll));
        AbstractC31171DnF.A1A(A0f, this.A02);
        A0f.AAP("prefill_type", str);
        AbstractC31171DnF.A1D(A0f, this.A01);
        AbstractC31175DnJ.A16(A0f, A0c);
    }

    public C32536EUm(AbstractC12990ll abstractC12990ll, String str, String str2) {
        this.A00 = abstractC12990ll;
        this.A02 = str;
        this.A01 = str2;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-212460487);
        C14360o3.A0B(abstractC115105If, 0);
        super.onFail(abstractC115105If);
        A00(false, null);
        C0f9.A0A(1556787418, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        String str2;
        int A03 = C0f9.A03(1421642919);
        C32202ECx c32202ECx = (C32202ECx) obj;
        int A0N = AbstractC167017dG.A0N(c32202ECx, -84819245);
        String str3 = c32202ECx.A00;
        boolean z = false;
        if (str3 != null && str3.length() != 0 && (str2 = c32202ECx.A01) != null && str2.length() != 0) {
            FEW.A01 = str2;
            FEW.A00 = c32202ECx.A00;
            str = "both";
        } else {
            String str4 = c32202ECx.A01;
            if (str4 != null && str4.length() != 0) {
                FEW.A01 = str4;
                str = "phone";
            } else if (str3 != null && str3.length() != 0) {
                FEW.A00 = str3;
                str = "email";
            } else {
                str = null;
                A00(z, str);
                C0f9.A0A(1708604872, A0N);
                C0f9.A0A(1821568030, A03);
            }
        }
        z = true;
        A00(z, str);
        C0f9.A0A(1708604872, A0N);
        C0f9.A0A(1821568030, A03);
    }
}
