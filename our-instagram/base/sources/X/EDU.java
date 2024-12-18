package X;

import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class EDU extends C40781ul {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public ArrayList A04;
    public ArrayList A05;
    public ArrayList A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;

    public final Bundle A00() {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putBoolean("is_two_factor_enabled", this.A08);
        A0b.putBoolean("is_totp_two_factor_enabled", this.A07);
        A0b.putBoolean("can_add_additional_totp_seed", this.A09);
        A0b.putString(AbstractC31182DnR.A03(), this.A03);
        A0b.putString("country_code", this.A00);
        A0b.putString("national_number", this.A02);
        A0b.putBoolean("is_phone_confirmed", this.A0F);
        A0b.putStringArrayList("backup_codes", this.A04);
        A0b.putParcelableArrayList("trusted_devices", this.A06);
        A0b.putParcelableArrayList("totp_seeds", this.A05);
        A0b.putString("email", this.A01);
        A0b.putBoolean("is_eligible_for_multiple_totp", this.A0C);
        A0b.putBoolean("has_reachable_email", this.A0B);
        A0b.putBoolean("eligible_for_trusted_notifications", this.A0A);
        A0b.putBoolean("is_trusted_notifications_enabled", this.A0H);
        A0b.putBoolean("is_eligible_for_whatsapp_two_factor", this.A0E);
        A0b.putBoolean("is_whatsapp_two_factor_enabled", this.A0I);
        A0b.putBoolean("is_eligible_for_phone_number_confirmed_badge_toggle", this.A0D);
        A0b.putBoolean("is_phone_number_confirmed_badge_enabled", this.A0G);
        return A0b;
    }
}
