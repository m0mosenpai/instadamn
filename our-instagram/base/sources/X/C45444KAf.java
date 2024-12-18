package X;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import java.io.Serializable;
import java.util.Locale;

/* renamed from: X.KAf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45444KAf extends AbstractC45465KBa implements InterfaceC50395MMx {
    public static final String __redex_internal_original_name = "AvatarMentionableFriendStickerGridFragment";
    public String A00;
    public boolean A01;
    public String A02;
    public String A03;
    public final InterfaceC09390do A04 = AbstractC25225BEi.A0a(C50254MHj.A02(this, 20), C50254MHj.A02(this, 19), new MHV(35, (Object) null, this), AbstractC25225BEi.A1D(C44500Jm6.class));
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);

    @Override // X.AbstractC45465KBa, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC31172DnG.A1B(view.getContext(), view.requireViewById(R.id.avatar_sticker_grid_container), R.color.fds_transparent);
        ImageView A0I = AbstractC31173DnH.A0I(view, R.id.avatar_sticker_grid_back_button);
        if (A0I != null) {
            AbstractC31173DnH.A11(requireContext(), A0I, R.color.design_dark_default_color_on_background);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = this.A02;
        if (str == null) {
            C14360o3.A0F("previousModuleName");
            throw C00O.createAndThrow();
        }
        return str;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        EnumC143286dT enumC143286dT;
        int A02 = C0f9.A02(1407312940);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("args_previous_module_name");
        if (string != null) {
            this.A02 = string;
            String string2 = requireArguments.getString("args_avatar_owner_id");
            if (string2 != null) {
                this.A00 = string2;
                String string3 = requireArguments.getString("args_username");
                if (string3 != null) {
                    this.A03 = string3;
                    Serializable serializable = requireArguments.getSerializable("args_surface");
                    if ((serializable instanceof EnumC143286dT) && (enumC143286dT = (EnumC143286dT) serializable) != null) {
                        super.A04 = enumC143286dT;
                        this.A01 = requireArguments.getBoolean("args_is_from_mentions_consumption_bottom_sheet");
                        this.A0L = true;
                        this.A0N = false;
                        this.A0O = true;
                        String string4 = getString(2131953489);
                        String str = this.A03;
                        if (str == null) {
                            C14360o3.A0F(AbstractC50529MSi.A00());
                            throw C00O.createAndThrow();
                        }
                        this.A0D = String.format(Locale.getDefault(), string4, str);
                        super.A00 = 4;
                        this.A0I = true;
                        C0f9.A09(1906282094, A02);
                        return;
                    }
                    A14 = AbstractC166987dD.A14("surface required");
                    i = 1226063889;
                } else {
                    A14 = AbstractC166987dD.A14("username required");
                    i = -284931250;
                }
            } else {
                A14 = AbstractC166987dD.A14("avatar owner id required");
                i = 1826635871;
            }
        } else {
            A14 = AbstractC166987dD.A14("previous module required");
            i = -975273047;
        }
        C0f9.A09(i, A02);
        throw A14;
    }
}
