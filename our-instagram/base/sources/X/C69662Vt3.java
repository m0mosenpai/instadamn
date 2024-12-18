package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Vt3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69662Vt3 {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public final FragmentActivity A08;
    public final C22P A09;
    public final UserSession A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final C131205w8 A0E;
    public final Integer A0F;

    public C69662Vt3(FragmentActivity fragmentActivity, C22P c22p, C131205w8 c131205w8, UserSession userSession, Integer num, String str, String str2, String str3) {
        C14360o3.A0B(c131205w8, 8);
        this.A08 = fragmentActivity;
        this.A0A = userSession;
        this.A09 = c22p;
        this.A0C = str;
        this.A0D = str2;
        this.A0F = num;
        this.A0B = str3;
        this.A0E = c131205w8;
    }

    public final void A00() {
        VEL vel;
        if (this.A0F.intValue() == 0) {
            vel = VEL.A05;
        } else {
            vel = VEL.A04;
        }
        C1Z8 A00 = AbstractC131165w4.A00();
        UserSession userSession = this.A0A;
        Context applicationContext = this.A08.getApplicationContext();
        C14360o3.A07(applicationContext);
        C23656Adr A02 = A00.A02(applicationContext, vel, new C68709Val(), userSession, "ar_ads_camera");
        A02.A01();
        A02.A03("ARCommerceCamerasQPLEffectID", this.A0C);
        String str = this.A0B;
        A02.A03("ARCommerceCamerasAdToken", str);
        String str2 = this.A00;
        if (str2 != null) {
            A02.A03("ARCommerceCamerasAdGroupId", str2);
        }
        String str3 = this.A05;
        if (str3 != null) {
            A02.A03("ARCommerceCamerasProductId", str3);
        }
        A02.A02(EnumC223239t9.A07, "", null);
        this.A0E.A01(str).A04(new C70400WUc(0, this, A02));
    }
}
