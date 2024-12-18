package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.ENi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32361ENi extends C53Z {
    public static final String __redex_internal_original_name = "ZeroVideoSettingDrawerFragment";
    public View A00;
    public InterfaceC26681Qx A01;
    public C23031Ai A02;
    public boolean A03 = false;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "zero_video_setting_drawer";
    }

    public static void A00(FO8 fo8, C32361ENi c32361ENi) {
        fo8.A04.setBackgroundDrawable(c32361ENi.requireContext().getDrawable(R.drawable.video_setting_drawer_auto_play_disabled_border));
        fo8.A02.setImageResource(R.drawable.unselected_check);
        fo8.A03.setBackgroundDrawable(c32361ENi.requireContext().getDrawable(R.drawable.video_setting_drawer_auto_play_enabled_border));
        fo8.A01.setImageResource(R.drawable.selected_check);
        AbstractC31180DnO.A13(AbstractC166997dE.A0N(c32361ENi), fo8.A07, 2131977229);
    }

    public static void A01(FO8 fo8, C32361ENi c32361ENi) {
        fo8.A03.setBackgroundDrawable(c32361ENi.requireContext().getDrawable(R.drawable.video_setting_drawer_auto_play_disabled_border));
        fo8.A01.setImageResource(R.drawable.unselected_check);
        fo8.A04.setBackgroundDrawable(c32361ENi.requireContext().getDrawable(R.drawable.video_setting_drawer_auto_play_enabled_border));
        fo8.A02.setImageResource(R.drawable.selected_check);
        AbstractC31180DnO.A13(AbstractC166997dE.A0N(c32361ENi), fo8.A07, 2131977230);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(380672087);
        super.onCreate(bundle);
        this.A02 = AbstractC23021Ah.A00(getSession());
        this.A01 = C26661Qv.A00(getSession());
        C0f9.A09(-796977416, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1588502844);
        this.A00 = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.zero_rating_video_settings_drawer);
        this.A03 = C3FU.A01(getSession(), this.A02);
        C1R0 C98 = this.A01.C98();
        String str = C98.A06;
        if (TextUtils.isEmpty(str)) {
            str = getString(2131977206);
        }
        String A0r = AbstractC166997dE.A0r(AbstractC166997dE.A0N(this), str, 2131977231);
        String str2 = C98.A07;
        if (!AbstractC116315Ok.A00(str2)) {
            A0r = AbstractC166997dE.A0v(TextUtils.concat(" ", AbstractC166997dE.A0r(AbstractC166997dE.A0N(this), str2, 2131977232)), AbstractC166997dE.A11(A0r));
        }
        FO8 fo8 = new FO8(this.A00);
        fo8.A06.setText(A0r);
        ViewOnClickListenerC35670Fp5.A00(fo8.A03, 29, this, fo8);
        ViewOnClickListenerC35670Fp5.A00(fo8.A04, 30, this, fo8);
        ViewOnClickListenerC35678FpD.A00(fo8.A05, 12, this);
        if (C3FU.A01(getSession(), this.A02)) {
            A00(fo8, this);
        } else {
            A01(fo8, this);
        }
        C9SB c9sb = new C9SB(AbstractC166997dE.A0N(this));
        fo8.A00.setImageDrawable(c9sb);
        c9sb.A01.setDuration(3000L).start();
        View view = this.A00;
        C0f9.A09(-1265127498, A02);
        return view;
    }
}
