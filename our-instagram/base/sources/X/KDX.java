package X;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class KDX extends AbstractC59962oe implements InterfaceC1119153d {
    public static final String __redex_internal_original_name = "AvatarExitNuxBottomSheetFragment";
    public int A00;
    public Activity A01;
    public Resources A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public ConstraintLayout A06;
    public ConstraintLayout A07;
    public IgImageView A08;
    public IgImageView A09;
    public IgImageView A0A;
    public IgImageView A0B;
    public IgImageView A0C;
    public IgImageView A0D;
    public C189478aR A0E;
    public SpinnerImageView A0F;
    public List A0G;
    public boolean A0H;
    public String A0I;
    public final C48541Lde A0J;
    public final InterfaceC09390do A0K;
    public final InterfaceC09390do A0L;

    @Override // X.InterfaceC1119153d
    public final void D00() {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = AbstractC166997dE.A0N(this);
        C44486Jls c44486Jls = (C44486Jls) this.A0L.getValue();
        C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(c44486Jls.A00, "ig_exit_nux_impression_event"), 220);
        A0A.A0R(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c44486Jls.A02);
        A0A.Cht();
        this.A05 = AbstractC166997dE.A0T(view, R.id.avatar_exit_nux_title);
        this.A04 = AbstractC166997dE.A0T(view, R.id.avatar_exit_nux_subtitle);
        this.A03 = AbstractC166997dE.A0T(view, R.id.avatar_exit_nux_cta_button);
        this.A06 = (ConstraintLayout) view.requireViewById(R.id.exit_nux_sticker_layout);
        this.A07 = (ConstraintLayout) view.requireViewById(R.id.avatar_stickers);
        this.A0F = (SpinnerImageView) view.requireViewById(R.id.avatar_exit_nux_loading_spinner);
        this.A0B = AbstractC31172DnG.A0Z(view, R.id.avatar_sticker_top_left);
        this.A08 = AbstractC31172DnG.A0Z(view, R.id.avatar_sticker_bottom_left);
        this.A0A = AbstractC31172DnG.A0Z(view, R.id.avatar_sticker_center);
        this.A0C = AbstractC31172DnG.A0Z(view, R.id.avatar_sticker_top_right);
        this.A09 = AbstractC31172DnG.A0Z(view, R.id.avatar_sticker_bottom_right);
        IgImageView A0Z = AbstractC31172DnG.A0Z(view, R.id.exit_nux_sticker);
        this.A0D = A0Z;
        if (A0Z != null) {
            AbstractC166997dE.A19(requireContext(), A0Z, R.drawable.exit_nux_sticker_asset);
            IgImageView igImageView = this.A0B;
            if (igImageView == null) {
                str = "avatarStickerTopLeft";
            } else {
                IgImageView igImageView2 = this.A08;
                if (igImageView2 == null) {
                    str = "avatarStickerBottomLeft";
                } else {
                    IgImageView igImageView3 = this.A0A;
                    if (igImageView3 == null) {
                        str = "avatarStickerCenter";
                    } else {
                        IgImageView igImageView4 = this.A0C;
                        if (igImageView4 == null) {
                            str = "avatarStickerTopRight";
                        } else {
                            IgImageView igImageView5 = this.A09;
                            if (igImageView5 == null) {
                                str = "avatarStickerBottomRight";
                            } else {
                                List A1Q = AbstractC16960so.A1Q(igImageView, igImageView2, igImageView3, igImageView4, igImageView5);
                                this.A0G = A1Q;
                                Iterator it = A1Q.iterator();
                                while (it.hasNext()) {
                                    View A09 = AbstractC43592JPx.A09(it);
                                    A09.setScaleX(0.0f);
                                    A09.setScaleY(0.0f);
                                    A09.setAlpha(0.0f);
                                }
                                IgImageView igImageView6 = this.A0D;
                                if (igImageView6 != null) {
                                    igImageView6.setScaleX(0.0f);
                                    igImageView6.setScaleY(0.0f);
                                    TextView textView = this.A03;
                                    if (textView != null) {
                                        ViewOnClickListenerC48064LPp.A00(textView, 12, this);
                                        TextView textView2 = this.A05;
                                        if (textView2 == null) {
                                            str = "titleView";
                                        } else {
                                            Resources resources = this.A02;
                                            if (resources != null) {
                                                AbstractC31173DnH.A19(resources, textView2, 2131953479);
                                                TextView textView3 = this.A04;
                                                if (textView3 == null) {
                                                    str = "subtitleView";
                                                } else {
                                                    Resources resources2 = this.A02;
                                                    if (resources2 != null) {
                                                        AbstractC31173DnH.A19(resources2, textView3, 2131953478);
                                                        TextView textView4 = this.A03;
                                                        if (textView4 != null) {
                                                            Resources resources3 = this.A02;
                                                            if (resources3 != null) {
                                                                AbstractC31173DnH.A19(resources3, textView4, 2131953477);
                                                                C07S c07s = C07S.STARTED;
                                                                C07X viewLifecycleOwner = getViewLifecycleOwner();
                                                                AbstractC166987dD.A1Z(new MCQ(viewLifecycleOwner, c07s, this, null, 36), C07Y.A00(viewLifecycleOwner));
                                                                return;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            C14360o3.A0F("contextResources");
                                            throw C00O.createAndThrow();
                                        }
                                    }
                                    str = "primaryCtaButton";
                                }
                            }
                        }
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        str = "exitNuxSticker";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        if (this.A0H) {
            AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A0K);
            String str = this.A0I;
            if (str == null) {
                C14360o3.A0F("previousModuleName");
                throw C00O.createAndThrow();
            }
            AbstractC31173DnH.A0Z(this.A01, AbstractC31178DnM.A06("previous_module_name", str), A0o, ModalActivity.class, AbstractC111324zv.A00(3978)).A0C(this.A01);
        }
        this.A01 = null;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = this.A0I;
        if (str == null) {
            C14360o3.A0F("previousModuleName");
            throw C00O.createAndThrow();
        }
        return AnonymousClass001.A0R(str, "_context_sheet_post_avatar_creation");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0K);
    }

    public KDX() {
        C50254MHj A02 = C50254MHj.A02(this, 24);
        InterfaceC09390do A00 = C50254MHj.A00(C50254MHj.A02(this, 21), EnumC09460dv.A02, 22);
        this.A0L = AbstractC25225BEi.A0a(C50254MHj.A02(A00, 23), A02, new MHV(36, (Object) null, A00), AbstractC25225BEi.A1D(C44486Jls.class));
        this.A0J = new C48541Lde(this, 1);
        this.A0K = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(2066355404);
        super.onCreate(bundle);
        String string = requireArguments().getString("args_previous_module_name");
        if (string != null) {
            this.A0I = string;
            C0f9.A09(-331002420, A02);
        } else {
            IllegalStateException A14 = AbstractC166987dD.A14("previous module required");
            C0f9.A09(1408791664, A02);
            throw A14;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(2059478318);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.avatar_sticker_exit_nux_bottom_sheet_fragment, viewGroup, false);
        C0f9.A09(614250744, A02);
        return inflate;
    }
}
