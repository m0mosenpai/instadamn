package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.R;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GPY implements Runnable {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ EfS A01;
    public final /* synthetic */ C32525EUb A02;

    public GPY(Bundle bundle, EfS efS, C32525EUb c32525EUb) {
        this.A02 = c32525EUb;
        this.A00 = bundle;
        this.A01 = efS;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putAll(this.A00);
        C32525EUb c32525EUb = this.A02;
        C006802i.A0p.markerEnd(725096125, (short) 4);
        EfS efS = this.A01;
        if (TextUtils.isEmpty(efS.A03)) {
            str = c32525EUb.A07;
        } else {
            str = efS.A03;
        }
        A0b.putString("lookup_user_input", str);
        User user = efS.A00;
        if (user != null) {
            A0b.putParcelable("user_profile_pic", user.Bhu());
        }
        A0b.putBoolean("can_email_reset", efS.A06);
        A0b.putBoolean("can_sms_reset", efS.A07);
        A0b.putBoolean("can_wa_reset", efS.A08);
        A0b.putBoolean("has_fb_login_option", efS.A0A);
        A0b.putString("lookup_source", efS.A04);
        Boolean bool = efS.A01;
        if (bool != null) {
            A0b.putBoolean("is_autoconf_test_user", bool.booleanValue());
        }
        ELH elh = c32525EUb.A05;
        if (!elh.A0K && !elh.requireActivity().isFinishing()) {
            AbstractC31172DnG.A1A();
            C07270a1 c07270a1 = c32525EUb.A04;
            AbstractC31173DnH.A1B(A0b);
            ELA ela = new ELA();
            ela.setArguments(A0b);
            AbstractC016706m abstractC016706m = c32525EUb.A02;
            if (abstractC016706m != null) {
                abstractC016706m.A0A(ela, R.id.layout_container_main);
                abstractC016706m.A0I("recovery_lookup_screen");
                abstractC016706m.A00();
                return;
            }
            AbstractC31177DnL.A15(ela, c32525EUb.A01, c07270a1);
        }
    }
}
