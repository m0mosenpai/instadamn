package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;

/* renamed from: X.Bsc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26814Bsc extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "KirbyCustomAiCreationFragment";
    public InterfaceC56362iU A00;
    public final InterfaceC09390do A05 = AbstractC25225BEi.A0a(DGX.A00(this, 19), DGX.A00(this, 20), new C29897DGl(7, null, this), AbstractC25235BEs.A0y());
    public final InterfaceC09390do A02 = C1XM.A00(DGX.A00(this, 18));
    public final InterfaceC09390do A01 = DH6.A01(this, "AiStudioArgumentKeys.creation_entry_point", EnumC09460dv.A02, 9);
    public final InterfaceC09390do A04 = C1XM.A00(new D5l(this));
    public final String A06 = "kirby_custom_ai_creation_fragment";
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        boolean z = true;
        interfaceC56362iU.EkS(true);
        interfaceC56362iU.Efu(2131952707);
        ViewOnClickListenerC28667ClF.A03(interfaceC56362iU, this, 12, 2131968535);
        if (((CharSequence) AbstractC25226BEj.A0n(this.A05).A0M.getValue()).length() <= 0) {
            z = false;
        }
        interfaceC56362iU.ARk(0, z);
        this.A00 = interfaceC56362iU;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        String str3 = null;
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
        C28484Chc A0q = AbstractC25226BEj.A0q(this.A02);
        String A02 = C25879Bce.A02(this.A05);
        Object value = this.A01.getValue();
        C25531Mh A01 = C28484Chc.A01(A0q, value, 1);
        if (AbstractC25226BEj.A1Z(A01)) {
            A01.A0k("ai_custom_creation_screen_shown");
            A01.A0u(A02);
            A01.A0w(AbstractC167017dG.A0u("condition", str3, AbstractC166987dD.A1L(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, value), AbstractC166987dD.A1L(DevServerEntity.COLUMN_DESCRIPTION, str), AbstractC166987dD.A1L("campaign_id", str2)));
            A01.Cht();
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AbstractC25226BEj.A0n(this.A05).A06.Egh("");
        return false;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A06;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-112758951);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A05;
        C25879Bce A0n = AbstractC25226BEj.A0n(interfaceC09390do);
        Object value = this.A01.getValue();
        C14360o3.A0B(value, 0);
        A0n.A09.Egh(value);
        Object value2 = this.A04.getValue();
        if (value2 != null) {
            AbstractC25226BEj.A0n(interfaceC09390do).A0C.Egh(value2);
        }
        C0f9.A09(1582631235, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1734119360);
        ComposeView A00 = AbstractC25319BIo.A00(this, C30480DbP.A00(this, 6), -1061403328);
        C0f9.A09(-1667167570, A02);
        return A00;
    }
}
