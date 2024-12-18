package X;

import android.content.Context;
import com.facebook.phonenumbers.PhoneNumberUtil;
import com.instagram.phonenumber.model.CountryCodeData;

/* loaded from: classes6.dex */
public final class G8D implements InterfaceC199918sv {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public G8D(Context context, FPK fpk, InterfaceC83713oG interfaceC83713oG, String str, int i) {
        this.A00 = i;
        this.A01 = context;
        this.A04 = str;
        this.A02 = fpk;
        this.A03 = interfaceC83713oG;
    }

    @Override // X.InterfaceC199918sv
    public final void onClick() {
        String A0g;
        switch (this.A00) {
            case 0:
                Context context = (Context) this.A01;
                AbstractC13900nG.A01(context, this.A04, AbstractC34875FYk.A00(8, 12, 76));
                ((FPK) this.A02).A00((InterfaceC83713oG) this.A03, "COPY");
                C9GR.A07(context, 2131956830);
                return;
            case 1:
                Context context2 = (Context) this.A01;
                String str = this.A04;
                CountryCodeData A00 = AnonymousClass780.A00(context2);
                PhoneNumberUtil A01 = PhoneNumberUtil.A01(context2);
                try {
                    A0g = AnonymousClass001.A0g("http://wa.me/", A01.A0I(A01.A0F(str, A00.A00), C05F.A00), "?source_surface=7");
                } catch (C40f unused) {
                    A0g = AnonymousClass001.A0g("http://wa.me/", str, "?source_surface=7");
                }
                if (AbstractC14490oL.A0G(context2)) {
                    AbstractC41776Ies.A02(context2, A0g);
                } else {
                    AbstractC14490oL.A07(context2, "com.whatsapp", "ig%26utm_campaign%3Dig_thread_pn");
                }
                ((FPK) this.A02).A00((InterfaceC83713oG) this.A03, "WHATSAPP_MESSAGE");
                return;
            default:
                return;
        }
    }
}
