package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.direct.model.DirectThreadThemeInfo;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Bsn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26825Bsn extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou, InterfaceC31032DkW {
    public static final String __redex_internal_original_name = "AiCreationEditingFragment";
    public InterfaceC56362iU A00;
    public final InterfaceC09390do A04 = AbstractC25225BEi.A0a(C29909DGx.A01(this, 10), C29909DGx.A01(this, 11), new C29898DGm(22, null, this), AbstractC25235BEs.A0y());
    public final InterfaceC09390do A02 = C29909DGx.A00(this, 9);
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A01 = C29909DGx.A00(this, 8);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ai_creation_editing_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        String str3 = null;
        AbstractC25231BEo.A1I(this, AbstractC25235BEs.A0S(this), 41);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str = bundle2.getString("AiStudioArgumentKeys.creation_ai_description");
        } else {
            str = null;
        }
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            str2 = bundle3.getString("AiStudioArgumentKeys.creation_ai_campaign_id");
        } else {
            str2 = null;
        }
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            str3 = bundle4.getString("AiStudioArgumentKeys.creation_ai_condition");
        }
        InterfaceC09390do interfaceC09390do = this.A02;
        C28484Chc A0q = AbstractC25226BEj.A0q(interfaceC09390do);
        String A02 = C25879Bce.A02(this.A04);
        InterfaceC09390do interfaceC09390do2 = this.A03;
        boolean A06 = C18U.A06(C06090Tz.A05, AbstractC25230BEn.A0k(interfaceC09390do2, 0), 36324011599212349L);
        C25531Mh A00 = C28484Chc.A00(A0q);
        if (AbstractC25226BEj.A1Z(A00)) {
            A00.A0k("edit_ai_details_screen_shown");
            A00.A0u(A02);
            A00.A0w(AbstractC167017dG.A0u("condition", str3, AbstractC166987dD.A1L("skip_pre_publish_screen", String.valueOf(A06)), AbstractC166987dD.A1L(DevServerEntity.COLUMN_DESCRIPTION, str), AbstractC166987dD.A1L("campaign_id", str2)));
            A00.Cht();
        }
        if (AbstractC28459ChB.A03(AbstractC166987dD.A0r(interfaceC09390do2))) {
            C25531Mh A022 = C28484Chc.A02(interfaceC09390do);
            if (AbstractC25226BEj.A1Z(A022)) {
                A022.A0k("edit_ai_details_screen_field_regeneration_icon_rendered");
                A022.Cht();
            }
        }
    }

    @Override // X.InterfaceC31032DkW
    public final void Cxm(String str) {
        AbstractC25226BEj.A0n(this.A04).A0E(str);
    }

    @Override // X.InterfaceC31032DkW
    public final void D5d() {
        AbstractC25226BEj.A0n(this.A04).A0B();
    }

    @Override // X.InterfaceC31032DkW
    public final void Dm2(boolean z) {
        AbstractC25226BEj.A0n(this.A04).A0I(z);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        InterfaceC09390do interfaceC09390do = this.A04;
        C27271C1v c27271C1v = AbstractC25226BEj.A0n(interfaceC09390do).A00;
        c27271C1v.A0Q.Egh(false);
        c27271C1v.A0R.Egh(false);
        List list = c27271C1v.A06;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC25236BEt.A0x(it);
        }
        list.clear();
        C7F6 A0r = AbstractC25226BEj.A0r(c27271C1v.A09);
        Integer num = C05F.A0C;
        A0r.A06(num);
        C28484Chc A0q = AbstractC25226BEj.A0q(this.A02);
        String str = (String) AbstractC25226BEj.A0n(interfaceC09390do).A0S.getValue();
        boolean A0L = AbstractC25226BEj.A0n(interfaceC09390do).A0L();
        boolean A0N = AbstractC25226BEj.A0n(interfaceC09390do).A0N();
        boolean A0M = AbstractC25226BEj.A0n(interfaceC09390do).A0M();
        String A02 = C25879Bce.A02(interfaceC09390do);
        C25531Mh A00 = C28484Chc.A00(A0q);
        if (AbstractC25226BEj.A1Z(A00)) {
            A00.A0i(AbstractC25233BEq.A0m(A00, "edit_ai_details_back_clicked", str));
            AbstractC25230BEn.A1F(A00, A02, AbstractC25232BEp.A1F("is_name_changed", String.valueOf(A0M), AbstractC166987dD.A1L("is_description_changed", String.valueOf(A0L)), AbstractC166987dD.A1L("is_tagline_changed", String.valueOf(A0N))));
        }
        InterfaceC09390do interfaceC09390do2 = this.A01;
        AbstractC25226BEj.A0r(interfaceC09390do2).A0A("quick_create_dismissed");
        AbstractC25226BEj.A0r(interfaceC09390do2).A07(num);
        if (AbstractC28459ChB.A04(AbstractC166987dD.A0r(this.A03))) {
            C27271C1v c27271C1v2 = AbstractC25226BEj.A0n(interfaceC09390do).A00;
            c27271C1v2.A0C.Egh(c27271C1v2.A0W.getValue());
        }
        return false;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        boolean z;
        boolean A10 = AbstractC25236BEt.A10(interfaceC56362iU);
        interfaceC56362iU.Efu(2131952707);
        InterfaceC09390do interfaceC09390do = this.A03;
        if (AbstractC28459ChB.A04(AbstractC166987dD.A0r(interfaceC09390do))) {
            ViewOnClickListenerC28667ClF.A03(interfaceC56362iU, this, 4, 2131961124);
            z = C25879Bce.A00(this.A04).A0F;
        } else {
            if (C18U.A06(C06090Tz.A05, AbstractC25230BEn.A0k(interfaceC09390do, A10 ? 1 : 0), 36324011599212349L)) {
                return;
            }
            ViewOnClickListenerC28667ClF.A03(interfaceC56362iU, this, 5, 2131968535);
            z = C25879Bce.A00(this.A04).A0H;
        }
        interfaceC56362iU.ARk(A10 ? 1 : 0, z);
        this.A00 = interfaceC56362iU;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        DirectThreadThemeInfo directThreadThemeInfo;
        C26083BgC c26083BgC;
        super.onActivityResult(i, i2, intent);
        if (i == 100 && i2 == -1) {
            if (intent != null && (directThreadThemeInfo = (DirectThreadThemeInfo) intent.getParcelableExtra("theme_info")) != null) {
                C27271C1v c27271C1v = AbstractC25226BEj.A0n(this.A04).A00;
                String str = directThreadThemeInfo.A0l;
                String str2 = directThreadThemeInfo.A0i;
                if (str != null && str2 != null) {
                    String str3 = directThreadThemeInfo.A0o;
                    C26069Bfx c26069Bfx = new C26069Bfx(str3, str, str3, str2, 3);
                    C05A c05a = c27271C1v.A0C;
                    C26083BgC A0s = AbstractC25226BEj.A0s(c05a);
                    if (A0s != null) {
                        c26083BgC = C26083BgC.A00(null, c26069Bfx, A0s, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388607, false, false);
                    } else {
                        c26083BgC = null;
                    }
                    c05a.Egh(c26083BgC);
                }
            }
            AbstractC25233BEq.A14(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        int A02 = C0f9.A02(-1990977974);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        String str = null;
        if (bundle2 != null && (string = bundle2.getString("AiStudioArgumentKeys.creation_ai_description")) != null) {
            InterfaceC09390do interfaceC09390do = this.A04;
            C25879Bce A0n = AbstractC25226BEj.A0n(interfaceC09390do);
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null) {
                str = bundle3.getString("AiStudioArgumentKeys.selected_template_option_id");
            }
            A0n.A00.A07(null, string, str, A0n.A02, null, null, null, false);
            AbstractC25226BEj.A0n(interfaceC09390do).A00.A0B.Egh(string);
        }
        C0f9.A09(-1667082070, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(2031078516);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30505Dbo(this, 37), -1236881664);
        C0f9.A09(1498329586, A02);
        return A00;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1584986340);
        super.onDestroyView();
        AbstractC25226BEj.A0n(this.A04).A00.A06();
        C0f9.A09(-667744503, A02);
    }
}
