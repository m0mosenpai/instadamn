package X;

import android.os.Bundle;

/* renamed from: X.SqM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63614SqM implements InterfaceC58362lv {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C2GT A01;
    public final /* synthetic */ EnumC61149RgA A02;
    public final /* synthetic */ C63380Siu A03;

    public C63614SqM(C2GT c2gt, EnumC61149RgA enumC61149RgA, C63380Siu c63380Siu, long j) {
        this.A03 = c63380Siu;
        this.A01 = c2gt;
        this.A02 = enumC61149RgA;
        this.A00 = j;
    }

    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        String str;
        C63380Siu c63380Siu;
        boolean z;
        C61602RqR A09;
        String message;
        String str2;
        C62694SMi c62694SMi;
        SED sed = (SED) obj;
        if (sed != null) {
            this.A01.A08(this);
            Throwable th = sed.A01;
            boolean A1Z = AbstractC25229BEm.A1Z(th);
            EnumC61149RgA enumC61149RgA = this.A02;
            EnumC61149RgA enumC61149RgA2 = EnumC61149RgA.A04;
            if (A1Z) {
                if (enumC61149RgA == enumC61149RgA2) {
                    str2 = "SUCCEEDED_SAVE_NEW_CARD";
                } else {
                    str2 = "SUCCEEDED_SAVE_PAYMENT_OPT_IN_DATA";
                }
                c63380Siu = this.A03;
                z = false;
                A09 = c63380Siu.A09(str2, c63380Siu.A07.now() - this.A00, -1L, false);
                A09.A0E = (String) sed.A00;
                if (AbstractC31177DnL.A1U(C06090Tz.A05, c63380Siu.A0Q.A04.A00, 36322800422431382L) && (c62694SMi = c63380Siu.A08) != null) {
                    c62694SMi.A00();
                }
            } else {
                if (enumC61149RgA == enumC61149RgA2) {
                    str = "FAILED_SAVE_NEW_CARD";
                } else {
                    str = "FAILED_SAVE_PAYMENT_OPT_IN_DATA";
                }
                c63380Siu = this.A03;
                z = false;
                A09 = c63380Siu.A09(str, c63380Siu.A07.now() - this.A00, -1L, false);
                if (th == null) {
                    message = "Card save failed with empty error message";
                } else {
                    message = th.getMessage();
                }
                A09.A0E = message;
            }
            SZO A00 = A09.A00();
            Bundle A03 = c63380Siu.A03.A03();
            C5G6 c5g6 = c63380Siu.A0Q;
            AbstractC63402SjX.A0A(A03, c5g6, A00);
            C62620SJd c62620SJd = c5g6.A00;
            c62620SJd.A00.A05 = AbstractC166987dD.A1H();
            c63380Siu.A0I = z;
            ((C51688MsJ) c62620SJd.A0H.A00).A00 = z;
        }
    }
}
