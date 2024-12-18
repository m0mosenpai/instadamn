package X;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Guideline;
import com.facebook.R;
import com.instagram.api.schemas.WorldLocationPagesInfo;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.discovery.mediamap.fragment.bottomsheetbehavior.MapBottomSheetBehavior;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import java.io.Serializable;

/* renamed from: X.N5a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52127N5a extends AbstractC59962oe implements InterfaceC11380iw, InterfaceC58175Pqf, InterfaceC57947Pmt {
    public static final String __redex_internal_original_name = "WorldPagesFragment";
    public Nj6 A00;
    public C38321qM A01;
    public MapBottomSheetBehavior A02;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC57947Pmt
    public final float APE(float f, float f2, float f3) {
        return f3 > 0.0f ? (f < 0.7f || f2 < 0.7f) ? 0.55f : 0.7f : (f > 0.7f || f2 > 0.7f) ? 1.0f : 0.7f;
    }

    @Override // X.InterfaceC58175Pqf
    public final void CzJ() {
    }

    @Override // X.InterfaceC58175Pqf
    public final void DDg() {
    }

    @Override // X.InterfaceC58175Pqf
    public final void Dip(MapBottomSheetBehavior mapBottomSheetBehavior, float f, float f2, float f3) {
    }

    @Override // X.InterfaceC58175Pqf
    public final void Diw(MapBottomSheetBehavior mapBottomSheetBehavior, float f) {
    }

    @Override // X.InterfaceC58175Pqf
    public final void Dl6() {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [X.6cX, java.lang.Object] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String iconicHorizonWorldDeeplink;
        WorldLocationPagesInfo CHs;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Nj6 nj6 = this.A00;
        if (nj6 != null) {
            InterfaceC09390do interfaceC09390do = this.A03;
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            C38321qM c38321qM = this.A01;
            String str2 = "entryMedia";
            if (c38321qM != null) {
                C14360o3.A0B(A0r, 1);
                AbstractC54298NzI.A00(nj6, this, A0r, c38321qM, C05F.A01, null, AbstractC166987dD.A1I());
                ImageView A0D = AbstractC31176DnK.A0D(view, R.id.modal_close_button);
                Drawable drawable = requireContext().getDrawable(R.drawable.instagram_arrow_left_pano_outline_24);
                if (drawable != null) {
                    A0D.setImageDrawable(new C44351Jiq(requireActivity(), drawable));
                }
                ViewOnClickListenerC55463OkI.A00(A0D, 28, this);
                IgImageView A0T = AbstractC167007dF.A0T(view, R.id.background_cover);
                C38321qM c38321qM2 = this.A01;
                if (c38321qM2 != null) {
                    InterfaceC43580JMo A0t = AbstractC25226BEj.A0t(c38321qM2);
                    if (A0t != null && (CHs = A0t.CHs()) != null) {
                        str = CHs.getCoverPhoto();
                    } else {
                        str = null;
                    }
                    AbstractC25235BEs.A1I(this, A0T, str);
                    IgdsMediaButton igdsMediaButton = (IgdsMediaButton) AbstractC166997dE.A0R(view, R.id.go_to_world_button);
                    C38321qM c38321qM3 = this.A01;
                    if (c38321qM3 != null) {
                        InterfaceC43580JMo A0t2 = AbstractC25226BEj.A0t(c38321qM3);
                        if (A0t2 != null && (iconicHorizonWorldDeeplink = A0t2.getIconicHorizonWorldDeeplink()) != null) {
                            Ok6.A00(igdsMediaButton, this, iconicHorizonWorldDeeplink, 16);
                            ?? obj = new Object();
                            obj.A00 = R.drawable.instagram_app_horizon_pano_filled_16;
                            igdsMediaButton.setStartAddOn(obj, AbstractC166997dE.A0N(this).getString(2131977120));
                            igdsMediaButton.setVisibility(0);
                            Nj6 nj62 = this.A00;
                            if (nj62 != null) {
                                UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                                C38321qM c38321qM4 = this.A01;
                                if (c38321qM4 != null) {
                                    C14360o3.A0B(A0r2, 1);
                                    AbstractC54298NzI.A00(nj62, this, A0r2, c38321qM4, C05F.A0u, null, AbstractC166987dD.A1I());
                                }
                            }
                        }
                        Resources A0M = AbstractC166997dE.A0M(requireActivity());
                        View A0S = AbstractC166997dE.A0S(view, R.id.bottom_sheet);
                        this.A02 = AbstractC53971Nti.A00(A0S);
                        Guideline guideline = (Guideline) AbstractC166997dE.A0R(view, R.id.status_bar_adjustment_guideline);
                        MapBottomSheetBehavior mapBottomSheetBehavior = this.A02;
                        str2 = "bottomSheetBehavior";
                        if (mapBottomSheetBehavior != null) {
                            mapBottomSheetBehavior.A03 = this;
                            mapBottomSheetBehavior.A02 = this;
                            mapBottomSheetBehavior.A04 = Float.valueOf(0.55f);
                            ImageView A0D2 = AbstractC31176DnK.A0D(A0S, R.id.shadow);
                            int A0G = AbstractC53242c7.A0G(requireActivity(), R.attr.bottomSheetTopCornerRadius);
                            int A05 = AbstractC166997dE.A05(A0M);
                            float f = A0G;
                            A0D2.setImageDrawable(new U8M(new RoundRectShape(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f}, null, null), A05, Color.argb(Math.round(63.75f), 0, 0, 0), A05));
                            guideline.setGuidelineBegin(AbstractC56402iY.A01(requireActivity()) - A05);
                            C14240no c14240no = new C14240no(AbstractC31174DnI.A0I(this));
                            c14240no.A07(R.anim.fade_in, R.anim.fade_out, R.anim.fade_in, R.anim.fade_out);
                            Bundle requireArguments = requireArguments();
                            C52128N5b c52128N5b = new C52128N5b();
                            Bundle A0b = AbstractC166987dD.A0b();
                            A0b.putString("arg_entry_media_id", requireArguments.getString("arg_entry_media_id"));
                            A0b.putSerializable("arg_entry_surface", requireArguments.getSerializable("arg_entry_surface"));
                            c52128N5b.setArguments(A0b);
                            c14240no.A0A(c52128N5b, R.id.fragment_container);
                            c14240no.A00();
                            return;
                        }
                    }
                }
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
        C14360o3.A0F("entrySurface");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58175Pqf
    public final void D06() {
        MapBottomSheetBehavior mapBottomSheetBehavior = this.A02;
        if (mapBottomSheetBehavior == null) {
            C14360o3.A0F("bottomSheetBehavior");
            throw C00O.createAndThrow();
        }
        mapBottomSheetBehavior.A0R(true, 0.7f);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(-1328538718);
        super.onCreate(bundle);
        Serializable serializable = requireArguments().getSerializable("arg_entry_surface");
        C14360o3.A0C(serializable, "null cannot be cast to non-null type com.facebook.analytics.structuredlogger.enums.IgWorldPagesSurface");
        this.A00 = (Nj6) serializable;
        C1DX A0Z = AbstractC31176DnK.A0Z(this.A03);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str = bundle2.getString("arg_entry_media_id");
        } else {
            str = null;
        }
        C38321qM A022 = A0Z.A02(str);
        if (A022 != null) {
            this.A01 = A022;
            C0f9.A09(-1492434053, A02);
        } else {
            IllegalArgumentException A12 = AbstractC166987dD.A12("Entry Media must be provided");
            C0f9.A09(1287746220, A02);
            throw A12;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-542272140);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_world_pages_fragment, viewGroup, false);
        C0f9.A09(1828220057, A02);
        return inflate;
    }
}
