package X;

import android.content.Context;
import com.facebook.phonenumbers.PhoneNumberUtil;

/* renamed from: X.3HS, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3HS implements InterfaceC41141vN {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A04;

    public C3HS(Context context, String str, String str2) {
        this.A04 = false;
        this.A03 = str;
        this.A02 = str2;
        try {
            AnonymousClass793 A0F = PhoneNumberUtil.A01(context).A0F(str2, null);
            this.A00 = String.valueOf(A0F.A00);
            this.A01 = String.valueOf(A0F.A02);
        } catch (C40f unused) {
            C0w9.A03("PhoneNumberVerifiedEvent", "Unable to parse verified phone number.");
            this.A04 = true;
        }
    }

    public C3HS() {
        this.A04 = false;
    }
}
