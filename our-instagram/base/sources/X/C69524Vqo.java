package X;

import android.content.Context;
import com.facebook.phonenumbers.PhoneNumberUtil;
import java.util.Locale;

/* renamed from: X.Vqo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69524Vqo {
    public final PhoneNumberUtil A00;

    public final String A00(Locale locale, String str) {
        String A0I;
        boolean A0h;
        try {
            PhoneNumberUtil phoneNumberUtil = this.A00;
            String country = locale.getCountry();
            AnonymousClass793 anonymousClass793 = new AnonymousClass793();
            PhoneNumberUtil.A06(phoneNumberUtil, anonymousClass793, str, country, true, true);
            if (anonymousClass793.A00 == 1) {
                A0I = phoneNumberUtil.A0I(anonymousClass793, C05F.A0C);
                C14360o3.A07(A0I);
                A0h = new C11L("^\\(\\d{3}\\) \\d{3}-\\d{4}$").A08(A0I);
            } else {
                A0I = phoneNumberUtil.A0I(anonymousClass793, C05F.A01);
                C14360o3.A07(A0I);
                A0h = AbstractC002300n.A0h(A0I, "+", false);
            }
        } catch (C40f unused) {
        }
        if (!A0h) {
            return null;
        }
        return A0I;
    }

    public C69524Vqo(Context context) {
        PhoneNumberUtil A01 = PhoneNumberUtil.A01(context);
        C14360o3.A07(A01);
        this.A00 = A01;
    }
}
