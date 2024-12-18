package X;

import android.os.Bundle;
import android.view.View;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EEE extends AbstractC32247EIg {
    public static final String __redex_internal_original_name = "ReelAvatarMusicStickerBottomSheetFragment";
    public int A00 = R.drawable.ig_avatar_assets_ig_avatar_nux_music;
    public C53O A01 = new C35909FtT(this, 5);
    public C189478aR A02;
    public String A03;
    public String A04;
    public String A05;

    @Override // X.AbstractC32247EIg, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0S = AbstractC166997dE.A0S(view, R.id.avatar_upsell_icon);
        A0S.getLayoutParams().height = -2;
        A0S.getLayoutParams().width = -1;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = this.A05;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("moduleName");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC32247EIg, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        String string;
        String string2;
        String string3;
        int A02 = C0f9.A02(-58057331);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (string = bundle2.getString("args_editor_logging_surface")) != null) {
            this.A04 = string;
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null && (string2 = bundle3.getString("args_editor_logging_mechanism")) != null) {
                this.A03 = string2;
                Bundle bundle4 = this.mArguments;
                if (bundle4 != null && (string3 = bundle4.getString("args_previous_module_name")) != null) {
                    this.A05 = string3;
                    C0f9.A09(-1543373310, A02);
                    return;
                } else {
                    A14 = AbstractC166987dD.A14("previous module required");
                    i = -965756816;
                }
            } else {
                A14 = AbstractC166987dD.A14("editor logging mechanism required");
                i = -988804201;
            }
        } else {
            A14 = AbstractC166987dD.A14("editor logging surface required");
            i = -836614393;
        }
        C0f9.A09(i, A02);
        throw A14;
    }
}
