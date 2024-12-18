package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Date;

/* renamed from: X.9ZY, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9ZY extends C0T6 {
    public int A02 = 0;
    public boolean A06 = false;
    public boolean A05 = false;
    public Date A03 = null;
    public Date A04 = null;
    public int A01 = 0;
    public int A00 = 0;

    public final void A00(Context context) {
        long j;
        SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName(), 0);
        C14360o3.A07(sharedPreferences);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        Date date = this.A03;
        long j2 = -1;
        if (date != null) {
            j = date.getTime();
        } else {
            j = -1;
        }
        edit.putLong("APPIRATER_FIRST_USE_DATE", j);
        Date date2 = this.A04;
        if (date2 != null) {
            j2 = date2.getTime();
        }
        edit.putLong("APPIRATER_REMINDER_REQUEST_DATE", j2);
        edit.putInt("APPIRATER_USE_COUNT", this.A02);
        edit.putInt("APPIRATER_SIG_EVENT_COUNT", this.A01);
        edit.putInt("APPIRATER_CURRENT_VERSION", this.A00);
        edit.putBoolean("APPIRATER_RATED_CURRENT_VERSION", this.A06);
        edit.putBoolean("APPIRATER_DECLINED_TO_RATE", this.A05);
        edit.apply();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9ZY) {
                C9ZY c9zy = (C9ZY) obj;
                if (this.A02 != c9zy.A02 || this.A06 != c9zy.A06 || this.A05 != c9zy.A05 || !C14360o3.A0K(this.A03, c9zy.A03) || !C14360o3.A0K(this.A04, c9zy.A04) || this.A01 != c9zy.A01 || this.A00 != c9zy.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A06, this.A02 * 31)) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC166997dE.A0I(this.A04)) * 31) + this.A01) * 31) + this.A00;
    }
}
