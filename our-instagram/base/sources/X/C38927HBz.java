package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.HBz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38927HBz extends AbstractC59962oe {
    public static final C41180IKt A03 = new Object();
    public static final String __redex_internal_original_name = "CutoutStickerFirstTimeNuxFragment";
    public boolean A00;
    public final InterfaceC09390do A01 = AbstractC09440dt.A00(EnumC09460dv.A02, new MHQ(this, 24));
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "cutout_sticker_first_time_nux_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        InterfaceC09390do interfaceC09390do;
        C38321qM A0F;
        boolean z;
        InterfaceC1118052h interfaceC1118052h;
        String str;
        String str2;
        String str3;
        String BS0;
        Integer num;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (string = bundle2.getString("media_id")) != null && (A0F = AbstractC37304Gc5.A0F(string, (interfaceC09390do = this.A02))) != null) {
            Bundle bundle3 = this.mArguments;
            boolean z2 = false;
            if (bundle3 != null) {
                z = bundle3.getBoolean("is_story", false);
            } else {
                z = false;
            }
            HE0 he0 = (HE0) AbstractC001800i.A0J(HE0.A08.A00(requireContext(), AbstractC166987dD.A0r(interfaceC09390do), A0F, z));
            if (he0 != null) {
                InterfaceC1118152j interfaceC1118152j = he0.A00;
                if (interfaceC1118152j != null && interfaceC1118152j.CcL() && !z) {
                    z2 = true;
                }
                this.A00 = z2;
                InterfaceC1118152j interfaceC1118152j2 = he0.A00;
                String str4 = null;
                if (interfaceC1118152j2 != null) {
                    interfaceC1118052h = interfaceC1118152j2.C0V();
                } else {
                    interfaceC1118052h = null;
                }
                IgImageView A0Z = AbstractC31172DnG.A0Z(view, R.id.user_image);
                if (interfaceC1118052h != null) {
                    str = interfaceC1118052h.getProfilePicUrl();
                } else {
                    str = null;
                }
                AbstractC25235BEs.A1I(this, A0Z, str);
                TextView A0T = AbstractC166997dE.A0T(view, R.id.username_text);
                if (interfaceC1118052h != null) {
                    str2 = interfaceC1118052h.getUsername();
                } else {
                    str2 = null;
                }
                A0T.setText(str2);
                View requireViewById = view.requireViewById(R.id.verified_badge);
                int i = 0;
                if (interfaceC1118052h == null || !interfaceC1118052h.isVerified()) {
                    i = 8;
                }
                requireViewById.setVisibility(i);
                IgImageView A0T2 = AbstractC167007dF.A0T(view, R.id.cutout_sticker);
                AbstractC23121AKf.A02(AbstractC31177DnL.A09(this), AbstractC166997dE.A0S(view, R.id.image_background), AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.abc_dialog_padding_material));
                InterfaceC1118152j interfaceC1118152j3 = he0.A00;
                if (interfaceC1118152j3 != null) {
                    str3 = interfaceC1118152j3.C0o();
                } else {
                    str3 = null;
                }
                boolean A0K = C14360o3.A0K(str3, "image");
                InterfaceC1118152j interfaceC1118152j4 = he0.A00;
                if (A0K) {
                    if (interfaceC1118152j4 != null) {
                        str4 = interfaceC1118152j4.BS0();
                    }
                    AbstractC25235BEs.A1I(this, A0T2, str4);
                } else if (interfaceC1118152j4 != null && (BS0 = interfaceC1118152j4.BS0()) != null) {
                    A0T2.setImageDrawable(new C8OT(requireContext(), null, AbstractC166987dD.A0r(interfaceC09390do), he0.A04, BS0, AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.call_participant_text_max_width), AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.video_cutout_sticker_height)));
                }
                int i2 = 2131957400;
                int i3 = 2131957399;
                if (this.A00) {
                    i2 = 2131957403;
                    i3 = 2131957402;
                }
                TextView A0T3 = AbstractC166997dE.A0T(view, R.id.title);
                Context context = view.getContext();
                AbstractC166987dD.A1P(context, A0T3, i2);
                AbstractC166987dD.A1P(context, AbstractC166997dE.A0T(view, R.id.subtitle), i3);
                C64P c64p = (C64P) AbstractC166997dE.A0R(view, R.id.action_buttons);
                int i4 = 2131957398;
                if (this.A00) {
                    i4 = 2131957401;
                }
                c64p.setPrimaryAction(context.getString(i4), new LPL(1, he0, A0F, this, z));
                C8EV c8ev = (C8EV) this.A01.getValue();
                if (z) {
                    num = C05F.A0C;
                } else {
                    num = C05F.A0N;
                }
                C14360o3.A0B(num, 0);
                C8EV.A00(c8ev, num, null, null, null, "attribution_upsell_impression");
                C23031Ai A00 = AbstractC23021Ah.A00(AbstractC166987dD.A0r(interfaceC09390do));
                AbstractC167007dF.A1L(A00, A00.A32, C23031Ai.A8c, 327, true);
            }
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-2042145848);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.cutout_sticker_first_time_nux_fragment, viewGroup, false);
        C0f9.A09(-1291037253, A02);
        return inflate;
    }
}
