package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.webkit.URLUtil;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;

/* loaded from: classes6.dex */
public final class EEG extends AbstractC32247EIg implements InterfaceC189488aT {
    public static final String __redex_internal_original_name = "AvatarStickerMimicryUpsellBottomSheetFragment";
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public ImageUrl A05;
    public String A06;
    public String A07;
    public boolean A09;
    public String A0A;
    public InterfaceC16820sZ A08 = new MHS(this, 34);
    public final InterfaceC09390do A0B = AbstractC09440dt.A01(new MHS(this, 33));
    public C53O A04 = new C35909FtT(this, 3);

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ABC() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ANe() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final int Aqi() {
        return -2;
    }

    @Override // X.InterfaceC189488aT
    public final int C9V() {
        return 0;
    }

    @Override // X.InterfaceC189488aT
    /* renamed from: CO7 */
    public final float Cpk() {
        return 1.0f;
    }

    @Override // X.InterfaceC189488aT
    public final boolean CQm() {
        return true;
    }

    @Override // X.InterfaceC189488aT
    public final float Cnp() {
        return 1.0f;
    }

    @Override // X.InterfaceC189498aU
    public final void DOM() {
    }

    @Override // X.InterfaceC189498aU
    public final void DON(int i) {
    }

    @Override // X.InterfaceC189488aT
    public final boolean Ei2() {
        return true;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final boolean isScrolledToTop() {
        return true;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetClosed() {
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC32247EIg, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View view2 = super.A02;
        if (view2 != null) {
            view2.setVisibility(0);
        } else {
            C14360o3.A0F("dragHandle");
            throw C00O.createAndThrow();
        }
    }

    private final boolean A01() {
        Bundle bundle = this.mArguments;
        if (bundle != null) {
            return bundle.getBoolean("is_sender");
        }
        throw AbstractC166987dD.A14("is_sender arg expected");
    }

    @Override // X.AbstractC32247EIg
    public final void A0N() {
        Drawable drawable;
        ImageUrl imageUrl = this.A05;
        if (imageUrl != null) {
            String url = imageUrl.getUrl();
            if (!URLUtil.isContentUrl(url) && !URLUtil.isFileUrl(url)) {
                drawable = A00(imageUrl);
            } else {
                String A00 = AbstractC137166Iv.A00(AbstractC166987dD.A0r(this.A0E)).A00(imageUrl.getUrl());
                if (A00 != null) {
                    drawable = A00(AbstractC25225BEi.A0t(A00));
                } else {
                    drawable = requireContext().getDrawable(this.A03);
                }
            }
            A03().setImageDrawable(drawable);
            return;
        }
        super.A0N();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = this.A0A;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("moduleName");
        throw C00O.createAndThrow();
    }

    private final Drawable A00(ImageUrl imageUrl) {
        int dimensionPixelSize = AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.avatar_sticker_max_height);
        Context requireContext = requireContext();
        UserSession A0r = AbstractC166987dD.A0r(this.A0E);
        String url = imageUrl.getUrl();
        C14360o3.A07(url);
        return C74N.A02(requireContext, A0r, url, dimensionPixelSize, dimensionPixelSize, AbstractC47041Kqy.A00(A0r));
    }

    @Override // X.AbstractC32247EIg
    public final void A0O() {
        boolean z;
        String str;
        boolean z2;
        super.A0O();
        C36000Fuy c36000Fuy = (C36000Fuy) this.A0B.getValue();
        boolean z3 = this.A09;
        boolean A01 = A01();
        Bundle bundle = this.mArguments;
        if (bundle != null) {
            z = bundle.getBoolean("is_from_nux");
        } else {
            z = false;
        }
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str = bundle2.getString("sticker_template_id");
        } else {
            str = null;
        }
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            z2 = bundle3.getBoolean("args_is_restricted_logging");
        } else {
            z2 = true;
        }
        c36000Fuy.A00(str, z3, A01, z, z2);
    }

    @Override // X.AbstractC32247EIg
    public final void A0P() {
        boolean z;
        String str;
        boolean z2;
        super.A0P();
        C36000Fuy c36000Fuy = (C36000Fuy) this.A0B.getValue();
        boolean z3 = this.A09;
        boolean A01 = A01();
        Bundle bundle = this.mArguments;
        if (bundle != null) {
            z = bundle.getBoolean("is_from_nux");
        } else {
            z = false;
        }
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str = bundle2.getString("sticker_template_id");
        } else {
            str = null;
        }
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            z2 = bundle3.getBoolean("args_is_restricted_logging");
        } else {
            z2 = true;
        }
        c36000Fuy.A00(str, z3, A01, z, z2);
    }

    @Override // X.InterfaceC189488aT
    public final int Ahd(Context context) {
        return AbstractC31178DnM.A00(context);
    }

    @Override // X.InterfaceC189488aT
    public final View C5a() {
        return this.mView;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ float Cpk() {
        return 1.0f;
    }

    @Override // X.AbstractC32247EIg, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        Integer num;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        String str;
        boolean z2;
        String str2;
        int A02 = C0f9.A02(1716814113);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("args_editor_logging_surface");
        if (string != null) {
            this.A07 = string;
            String string2 = requireArguments.getString("args_editor_logging_mechanism");
            if (string2 != null) {
                this.A06 = string2;
                String string3 = requireArguments.getString("args_previous_module_name");
                if (string3 != null) {
                    this.A0A = string3;
                    this.A09 = requireArguments.getBoolean("has_avatar");
                    String string4 = requireArguments.getString("preview_url");
                    SimpleImageUrl simpleImageUrl = null;
                    if (string4 != null) {
                        simpleImageUrl = AbstractC25225BEi.A0t(string4);
                    }
                    this.A05 = simpleImageUrl;
                    if (A01()) {
                        num = C05F.A00;
                    } else {
                        num = C05F.A01;
                    }
                    int intValue = num.intValue();
                    if (intValue != 0) {
                        i2 = 2131971539;
                    } else {
                        i2 = 2131973311;
                    }
                    this.A02 = i2;
                    if (intValue != 0) {
                        i3 = 2131971538;
                    } else {
                        i3 = 2131973310;
                    }
                    this.A01 = i3;
                    if (intValue != 0) {
                        i4 = 2131971537;
                    } else {
                        i4 = 2131973309;
                    }
                    this.A00 = i4;
                    AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A0E);
                    C14360o3.A0B(A0o, 1);
                    C06090Tz A0j = AbstractC25225BEi.A0j(AbstractC50712Us.A00, 3);
                    if (C18U.A06(A0j, A0o, 36325278612206558L)) {
                        i5 = R.drawable.ig_avatars_style_2_g6_casual_alpha_style2;
                    } else {
                        boolean A06 = C18U.A06(A0j, A0o, 36322190529931313L);
                        i5 = R.drawable.ig_avatar_assets_avatar_nux_static;
                        if (A06) {
                            i5 = R.drawable.ig_avatar_assets_avatar_nux_sp;
                        }
                    }
                    this.A03 = i5;
                    C36000Fuy c36000Fuy = (C36000Fuy) this.A0B.getValue();
                    boolean z3 = this.A09;
                    boolean A01 = A01();
                    Bundle bundle2 = this.mArguments;
                    if (bundle2 != null) {
                        z = bundle2.getBoolean("is_from_nux");
                    } else {
                        z = false;
                    }
                    Bundle bundle3 = this.mArguments;
                    if (bundle3 != null) {
                        str = bundle3.getString("sticker_template_id");
                    } else {
                        str = null;
                    }
                    Bundle bundle4 = this.mArguments;
                    if (bundle4 != null) {
                        z2 = bundle4.getBoolean("args_is_restricted_logging");
                    } else {
                        z2 = true;
                    }
                    if (z) {
                        str2 = "create_avatar_nux";
                    } else {
                        str2 = "avatar_sticker";
                    }
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c36000Fuy.A00, "mimicry_upsell_shown");
                    AbstractC31171DnF.A1G(A0f, str2);
                    A0f.AAP("has_avatar", String.valueOf(z3));
                    A0f.AAP("is_sender", String.valueOf(A01));
                    A0f.AAP("ig_user_id", c36000Fuy.A01.userId);
                    if (!z2) {
                        if (str == null) {
                            str = "None";
                        }
                        A0f.AAP("sticker_template_id", str);
                    }
                    A0f.Cht();
                    C0f9.A09(1073743077, A02);
                    return;
                }
                A14 = AbstractC166987dD.A14("module name required");
                i = -868046444;
            } else {
                A14 = AbstractC166987dD.A14("editor logging mechanism required");
                i = -1046287806;
            }
        } else {
            A14 = AbstractC166987dD.A14("editor logging surface required");
            i = 564184870;
        }
        C0f9.A09(i, A02);
        throw A14;
    }
}
