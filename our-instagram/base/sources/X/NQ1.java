package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class NQ1 extends N6E {
    public static final String __redex_internal_original_name = "CreatorRevshareAdsPreviewIntroFragment";
    public final InterfaceC09390do A01 = C57509Pfj.A00(this, 18);
    public final InterfaceC09390do A00 = C57509Pfj.A00(this, 17);

    @Override // X.N6E, X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        C06090Tz A0j;
        long j;
        String str;
        String str2;
        int A02 = C0f9.A02(355812106);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.creator_revshare_ads_onboarding_intro_preview_layout, viewGroup, false);
        InterfaceC09390do interfaceC09390do = this.A01;
        if (AbstractC50523MSb.A04(interfaceC09390do) == 2) {
            i = 2131963782;
        } else {
            i = 2131963815;
            if (AbstractC167007dF.A1Z(this.A00)) {
                i = 2131963862;
            }
        }
        String string = getString(i);
        C14360o3.A0A(string);
        if (AbstractC50523MSb.A04(interfaceC09390do) == 2) {
            i2 = 2131963781;
        } else {
            i2 = 2131963814;
            if (AbstractC167007dF.A1Z(this.A00)) {
                i2 = 2131963861;
            }
        }
        String string2 = getString(i2);
        C14360o3.A0A(string2);
        int A04 = AbstractC50523MSb.A04(interfaceC09390do);
        AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A02);
        if (A04 == 2) {
            A0j = C06090Tz.A05;
            j = 36878062377762968L;
        } else {
            A0j = AbstractC25225BEi.A0j(A0o, 0);
            j = 36878758162596039L;
        }
        String A042 = C18U.A04(A0j, A0o, j);
        C14360o3.A0A(A042);
        A04("impression", "feature_preview", __redex_internal_original_name, null);
        F9B.A00(null, new Ok6(A042, this, 8), inflate, this, string, string2, getString(2131969341), C16930sl.A00);
        String A0v = AbstractC25227BEk.A0v(this, 2131969333);
        Ok6 ok6 = new Ok6(A0v, this, 9);
        C14360o3.A0B(inflate, 0);
        ((C64P) inflate.requireViewById(R.id.bottom_button_layout)).setPrimaryAction(A0v, ok6);
        C51571MqP c51571MqP = (C51571MqP) A03().A02.A02();
        if (c51571MqP != null && (str2 = c51571MqP.A03) != null) {
            N6E.A00(inflate, str2);
        }
        if (AbstractC50523MSb.A04(interfaceC09390do) == 2) {
            String A0v2 = AbstractC25227BEk.A0v(this, 2131963766);
            SpannableStringBuilder A08 = AbstractC31178DnM.A08(this, A0v2, 2131963765);
            AnonymousClass773.A05(A08, new NY0(this, AbstractC31181DnP.A02(this)), A0v2);
            str = A08;
        } else {
            int i3 = 2131969332;
            if (AbstractC167007dF.A1Z(this.A00)) {
                i3 = 2131969336;
            }
            String string3 = getString(i3);
            C14360o3.A0A(string3);
            str = string3;
        }
        AbstractC167007dF.A1K(inflate, str);
        AbstractC31172DnG.A0j(inflate, R.id.bottom_button_layout).setFooterText(str);
        C0f9.A09(1378851705, A02);
        return inflate;
    }
}
