package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import java.util.regex.Pattern;

/* renamed from: X.Fnz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35608Fnz implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public ViewOnClickListenerC35608Fnz(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A01 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C5HW c5hw;
        InterfaceC58311Pt3 interfaceC58311Pt3;
        int i;
        OAY oay;
        String str;
        String A07;
        C51693MsO c51693MsO;
        C51693MsO c51693MsO2;
        String A06;
        String A062;
        switch (this.A00) {
            case 0:
                int A05 = C0f9.A05(1292741968);
                Fragment fragment = (Fragment) this.A04;
                EditText editText = (EditText) this.A02;
                C14360o3.A0A(editText);
                IgLinearLayout igLinearLayout = (IgLinearLayout) this.A03;
                int i2 = this.A01;
                AbstractC31171DnF.A14(editText);
                AbstractC35050FcN.A00(fragment.requireContext(), editText, i2, false);
                igLinearLayout.findViewById(R.id.poll_row_delete_icon).setVisibility(8);
                Drawable drawable = fragment.requireContext().getDrawable(R.drawable.comment_poll_option_row_hint_background);
                if (drawable != null) {
                    igLinearLayout.setBackground(drawable);
                    C0f9.A0C(-1737810393, A05);
                    return;
                }
                throw AbstractC166997dE.A0g();
            case 1:
                c5hw = (C5HW) this.A02;
                interfaceC58311Pt3 = (InterfaceC58311Pt3) this.A03;
                i = this.A01;
                oay = (OAY) this.A04;
                if (c5hw.A00 == 192 && c5hw.A02() != null && c5hw.A02() != null && c5hw.A02().A0D != null) {
                    interfaceC58311Pt3.DK8(new C51693MsO(oay), c5hw, c5hw.A02().A0D, i);
                    return;
                }
                str = c5hw.A04.A0f;
                str.getClass();
                interfaceC58311Pt3.Dxj(new C51693MsO(oay), c5hw, str, i);
                return;
            case 2:
                c5hw = (C5HW) this.A02;
                interfaceC58311Pt3 = (InterfaceC58311Pt3) this.A03;
                i = this.A01;
                oay = (OAY) this.A04;
                if (!c5hw.A0F()) {
                    if (!AbstractC70138W6q.A02(c5hw)) {
                        str = c5hw.A04.A0f;
                        if (str == null) {
                            C0w9.A03("newsfeed_user_follow_null_profile_id", "Profile ID should not be null.");
                            str = "";
                        }
                        interfaceC58311Pt3.Dxj(new C51693MsO(oay), c5hw, str, i);
                        return;
                    }
                    interfaceC58311Pt3.DHy(new C51693MsO(oay), c5hw, i);
                    return;
                }
                c51693MsO2 = new C51693MsO(oay);
                interfaceC58311Pt3.Dhk(c51693MsO2, c5hw, i);
                return;
            case 3:
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A02;
                c5hw = (C5HW) this.A03;
                interfaceC58311Pt3 = (InterfaceC58311Pt3) this.A04;
                i = this.A01;
                String str2 = c5hw.A04.A0U;
                if (str2 != null) {
                    String replaceFirst = str2.replaceFirst("^/", "");
                    C25621Ms c25621Ms = new C25621Ms(abstractC12990ll);
                    c25621Ms.A0B(replaceFirst);
                    c25621Ms.A05();
                    C1GJ.A03(AbstractC31172DnG.A0S(c25621Ms, C40781ul.class, C55702hA.class));
                }
                A07 = c5hw.A07();
                Pattern pattern = AbstractC13670mt.A01;
                if (A07 == null) {
                    A07 = "";
                }
                c51693MsO = new C51693MsO(null, EnumC33370Ep3.A02, null, i);
                interfaceC58311Pt3.DRM(c51693MsO, c5hw, A07, i);
                return;
            case 4:
                c5hw = (C5HW) this.A02;
                interfaceC58311Pt3 = (InterfaceC58311Pt3) this.A03;
                i = this.A01;
                OAY oay2 = (OAY) this.A04;
                if (c5hw.A03() != null) {
                    c51693MsO2 = new C51693MsO(oay2);
                    interfaceC58311Pt3.Dhk(c51693MsO2, c5hw, i);
                    return;
                }
                A07 = c5hw.A07();
                Pattern pattern2 = AbstractC13670mt.A01;
                if (A07 == null) {
                    A07 = "";
                }
                c51693MsO = new C51693MsO(oay2);
                interfaceC58311Pt3.DRM(c51693MsO, c5hw, A07, i);
                return;
            case 5:
                View view2 = (View) this.A02;
                InterfaceC58311Pt3 interfaceC58311Pt32 = (InterfaceC58311Pt3) this.A03;
                C5HW c5hw2 = (C5HW) this.A04;
                int i3 = this.A01;
                interfaceC58311Pt32.Dbb(AbstractC13880nE.A0G(view2), new C51693MsO(null, EnumC33370Ep3.A0C, null, i3), c5hw2, i3);
                return;
            default:
                c5hw = (C5HW) this.A02;
                interfaceC58311Pt3 = (InterfaceC58311Pt3) this.A03;
                i = this.A01;
                oay = (OAY) this.A04;
                if (c5hw.A07() != null) {
                    if (EnumC31336Dq1.A30 != c5hw.A03() && EnumC31336Dq1.A08 != c5hw.A03()) {
                        Boolean bool = c5hw.A04.A0J;
                        if ((bool != null && bool.booleanValue()) || c5hw.A08() != null || (((A06 = c5hw.A06()) != null && A06.equals("clips_home")) || ((A062 = c5hw.A06()) != null && (A062.equals(EnumC31336Dq1.A0L) || A062.equals(EnumC31336Dq1.A0M))))) {
                            interfaceC58311Pt3.DRM(new C51693MsO(oay), c5hw, c5hw.A07(), i);
                            return;
                        } else {
                            interfaceC58311Pt3.D6B(new C51693MsO(oay), c5hw, i);
                            return;
                        }
                    }
                    c51693MsO2 = new C51693MsO(oay);
                    interfaceC58311Pt3.Dhk(c51693MsO2, c5hw, i);
                    return;
                }
                interfaceC58311Pt3.DRQ(new C51693MsO(oay), c5hw, i);
                return;
        }
    }
}
