package X;

import android.app.Activity;

/* renamed from: X.Efj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32977Efj extends C32547EUx {
    public final int A00 = 1;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32977Efj(Activity activity, InterfaceC11380iw interfaceC11380iw, C07270a1 c07270a1, InterfaceC37227Gac interfaceC37227Gac, AbstractC33626Etc abstractC33626Etc, EKE eke, EnumC31713DwI enumC31713DwI, Integer num, String str, String str2, String str3) {
        super(activity, null, interfaceC11380iw, c07270a1, interfaceC37227Gac, abstractC33626Etc, enumC31713DwI, num, str, str2, str3, null);
        this.A01 = eke;
    }

    @Override // X.C32547EUx, X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        String str;
        if (2 - this.A00 != 0) {
            super.onFail(abstractC115105If);
            return;
        }
        int A03 = C0f9.A03(-568692903);
        KKB kkb = (KKB) this.A01;
        SPT spt = LIA.A07;
        Object A00 = abstractC115105If.A00();
        C40781ul c40781ul = (C40781ul) A00;
        if (c40781ul != null && c40781ul.getErrorMessage() != null && c40781ul.getErrorMessage().equals("Invalid nonce from autoconf authentication")) {
            C07270a1 c07270a1 = kkb.A03;
            String str2 = kkb.A06.A01;
            String str3 = kkb.A08;
            AbstractC167007dF.A1K(c07270a1, str2);
            C47989LJs.A00(c07270a1, false, str2, "client_auth_failed_error_message_from_server", "authentication error message received from server", str3, "ar_code_sms", null, null, "Invalid nonce from autoconf authentication", null);
            kkb.A04.A00();
        } else {
            C07270a1 c07270a12 = kkb.A03;
            String str4 = kkb.A06.A01;
            String str5 = kkb.A08;
            if (A00 != null) {
                str = c40781ul.getErrorMessage();
            } else {
                str = null;
            }
            String A002 = AbstractC43591JPw.A00(840);
            AbstractC167007dF.A1K(c07270a12, str4);
            C47989LJs.A00(c07270a12, false, str4, A002, "authentication error message received from server", str5, "ar_code_sms", str, null, null, null);
            super.onFail(abstractC115105If);
        }
        C0f9.A0A(-1837836367, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03;
        int i;
        switch (this.A00) {
            case 1:
                A03 = C0f9.A03(-868126771);
                super.onFinish();
                ((EMQ) this.A01).A03.A00();
                i = -1911339712;
                break;
            case 2:
                A03 = C0f9.A03(-728523258);
                AbstractC167007dF.A0x(((KKB) this.A01).A00);
                super.onFinish();
                i = -1006149861;
                break;
            case 3:
                A03 = C0f9.A03(1060694625);
                super.onFinish();
                EVN evn = ((EKE) this.A01).A07;
                if (evn != null) {
                    evn.A00();
                }
                i = -680682036;
                break;
            default:
                super.onFinish();
                return;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03;
        int i;
        switch (this.A00) {
            case 1:
                A03 = C0f9.A03(346016846);
                super.onStart();
                ((EMQ) this.A01).A03.A01();
                i = 5395291;
                break;
            case 2:
                A03 = C0f9.A03(1765715444);
                AbstractC167007dF.A0w(((KKB) this.A01).A00);
                super.onStart();
                i = -790984164;
                break;
            case 3:
                A03 = C0f9.A03(-1857643806);
                super.onStart();
                EVN evn = ((EKE) this.A01).A07;
                if (evn != null) {
                    evn.A01();
                }
                i = 1761765487;
                break;
            default:
                super.onStart();
                return;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32977Efj(Activity activity, InterfaceC11380iw interfaceC11380iw, C07270a1 c07270a1, InterfaceC37227Gac interfaceC37227Gac, C32983Efp c32983Efp, EnumC31713DwI enumC31713DwI, Integer num, String str) {
        super(activity, null, interfaceC11380iw, c07270a1, interfaceC37227Gac, enumC31713DwI, num, str);
        this.A01 = c32983Efp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32977Efj(Activity activity, InterfaceC11380iw interfaceC11380iw, C07270a1 c07270a1, InterfaceC37227Gac interfaceC37227Gac, KKB kkb, EnumC31713DwI enumC31713DwI, Integer num, String str) {
        super(activity, null, interfaceC11380iw, c07270a1, interfaceC37227Gac, null, enumC31713DwI, num, str, "111111", null, null);
        this.A01 = kkb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32977Efj(Activity activity, android.net.Uri uri, InterfaceC11380iw interfaceC11380iw, C07270a1 c07270a1, C32525EUb c32525EUb, EnumC31713DwI enumC31713DwI, Integer num) {
        super(activity, uri, interfaceC11380iw, c07270a1, null, enumC31713DwI, num, null);
        this.A01 = c32525EUb;
    }
}
