package X;

import android.content.DialogInterface;
import android.os.Handler;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.Fiu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35379Fiu implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final String A08;
    public final String A09;

    public DialogInterfaceOnClickListenerC35379Fiu(Handler handler, AbstractC59962oe abstractC59962oe, C07270a1 c07270a1, GY6 gy6, RegFlowExtras regFlowExtras, EVN evn, EnumC31713DwI enumC31713DwI, String str, String str2, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A04 = c07270a1;
            this.A02 = abstractC59962oe;
            this.A01 = gy6;
            this.A03 = handler;
            this.A06 = regFlowExtras;
        } else {
            this.A06 = regFlowExtras;
            this.A04 = c07270a1;
            this.A02 = abstractC59962oe;
            this.A01 = gy6;
            this.A03 = handler;
        }
        this.A05 = evn;
        this.A08 = str;
        this.A07 = enumC31713DwI;
        this.A09 = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        RegFlowExtras regFlowExtras;
        C07270a1 c07270a1;
        EnumC31713DwI enumC31713DwI;
        C1Q9 c1q9;
        if (this.A00 != 0) {
            c07270a1 = (C07270a1) this.A04;
            AbstractC59962oe abstractC59962oe = (AbstractC59962oe) this.A02;
            GY6 gy6 = (GY6) this.A01;
            Handler handler = (Handler) this.A03;
            regFlowExtras = (RegFlowExtras) this.A06;
            EVN evn = (EVN) this.A05;
            String str = this.A08;
            enumC31713DwI = (EnumC31713DwI) this.A07;
            AbstractC35794FrW.A02(handler, abstractC59962oe, abstractC59962oe, c07270a1, null, gy6, regFlowExtras, evn, enumC31713DwI, regFlowExtras.A0Z, str, false);
            c1q9 = C1Q9.A16;
        } else {
            regFlowExtras = (RegFlowExtras) this.A06;
            regFlowExtras.A0l = true;
            c07270a1 = (C07270a1) this.A04;
            AbstractC59962oe abstractC59962oe2 = (AbstractC59962oe) this.A02;
            GY6 gy62 = (GY6) this.A01;
            Handler handler2 = (Handler) this.A03;
            EVN evn2 = (EVN) this.A05;
            String str2 = this.A08;
            enumC31713DwI = (EnumC31713DwI) this.A07;
            AbstractC35794FrW.A02(handler2, abstractC59962oe2, abstractC59962oe2, c07270a1, null, gy62, regFlowExtras, evn2, enumC31713DwI, regFlowExtras.A0Z, str2, false);
            c1q9 = C1Q9.A14;
        }
        C35037FcA A06 = c1q9.A02(c07270a1).A06(regFlowExtras.A01(), enumC31713DwI);
        A06.A04("existing_user_username", this.A09);
        A06.A02();
    }
}
