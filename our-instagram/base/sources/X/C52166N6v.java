package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.constants.AudioTrackType;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.music.search.tabloader.MusicOverlaySearchTab;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.ui.widget.audiobar.AudioBar;
import java.io.Serializable;
import java.util.Map;

/* renamed from: X.N6v, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52166N6v extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60072op, AnonymousClass844, C51D, InterfaceC58052Pod, InterfaceC58154PqJ {
    public static final String __redex_internal_original_name = "MusicBrowserFragment";
    public InterfaceC56392iX A01;
    public InterfaceC56392iX A02;
    public C8BS A03;
    public C677733r A04;
    public C8BR A05;
    public MYM A06;
    public C64842wi A07;
    public C51341Mm2 A08;
    public Map A09;
    public EnumC46263Kdv A0A;
    public C8BN A0B;
    public EnumC203578zI A0C;
    public ImmutableList A0D;
    public ImmutableList A0E;
    public C55175Ode A0F;
    public C8BF A0G;
    public MusicAttributionConfig A0H;
    public MusicOverlaySearchTab A0I;
    public EnumC1810381f A0J;
    public String A0K;
    public String A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public MusicProduct A00 = MusicProduct.A06;
    public final InterfaceC09390do A0T = AbstractC25225BEi.A0a(C57528Pg2.A00(this, 11), C57528Pg2.A00(this, 10), C57531Pg5.A00(null, this, 12), AbstractC25225BEi.A1D(C8BE.class));
    public final InterfaceC09390do A0S = AbstractC25225BEi.A0a(C57528Pg2.A00(this, 12), C57528Pg2.A00(this, 9), C57531Pg5.A00(null, this, 13), AbstractC25225BEi.A1D(C50664MYh.class));
    public final String A0R = "music_browser_fragment";
    public final InterfaceC09390do A0U = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC58052Pod
    public final int B8Q(EnumC53139Nes enumC53139Nes) {
        int A05 = AbstractC25227BEk.A05(enumC53139Nes, 0);
        if (A05 != 1) {
            if (A05 != 0) {
                if (A05 == 2) {
                    return R.id.music_search_clips_saved_container;
                }
                throw AbstractC166987dD.A12("Unsupported MusicSearchMode");
            }
            return R.id.music_search_clips_landing_page_container;
        }
        return R.id.music_search_clips_search_results_container;
    }

    @Override // X.InterfaceC58154PqJ
    public final void DUT() {
    }

    @Override // X.InterfaceC58154PqJ
    public final void DUU() {
    }

    @Override // X.InterfaceC58154PqJ
    public final void DUV() {
    }

    @Override // X.InterfaceC58154PqJ
    public final void DUj(JIN jin, MusicBrowseCategory musicBrowseCategory, String str, String str2) {
        this.A0Q = true;
        C8BR c8br = this.A05;
        if (c8br != null) {
            c8br.DUG(jin, musicBrowseCategory, str, str2);
        }
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r40, android.os.Bundle r41) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52166N6v.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(JIN jin, C52166N6v c52166N6v, EnumC53153Nf8 enumC53153Nf8) {
        int i;
        View view;
        Drawable mutate;
        PorterDuffColorFilter porterDuffColorFilter;
        InterfaceC56392iX interfaceC56392iX = c52166N6v.A01;
        if (jin != null) {
            if (interfaceC56392iX != null) {
                AudioBar audioBar = (AudioBar) interfaceC56392iX.getView();
                String title = jin.getTitle();
                String displayArtist = jin.getDisplayArtist();
                ImageUrl AsT = jin.AsT();
                boolean A1X = AbstractC167007dF.A1X(enumC53153Nf8, EnumC53153Nf8.A02);
                boolean A1a = AbstractC25229BEm.A1a(enumC53153Nf8, EnumC53153Nf8.A04);
                i = 0;
                boolean A1R = AbstractC167007dF.A1R(0, title, displayArtist);
                TextView textView = audioBar.A0A;
                textView.setText(title);
                textView.setSelected(A1R);
                TextView textView2 = audioBar.A09;
                textView2.setText(displayArtist);
                textView2.setSelected(A1R);
                audioBar.A07.setImageTintList(audioBar.A03);
                audioBar.A00 = AsT;
                AbstractC38055Goi.A00(audioBar.A06, AsT, audioBar);
                Context context = audioBar.getContext();
                int i2 = R.drawable.instagram_pause_pano_filled_24;
                if (A1X) {
                    i2 = R.drawable.instagram_play_pano_filled_24;
                }
                Drawable drawable = context.getDrawable(i2);
                if (drawable != null && (mutate = drawable.mutate()) != null) {
                    if (A1a) {
                        porterDuffColorFilter = audioBar.A05;
                    } else {
                        porterDuffColorFilter = audioBar.A04;
                    }
                    mutate.setColorFilter(porterDuffColorFilter);
                }
                ImageView imageView = audioBar.A08;
                imageView.setImageDrawable(drawable);
                imageView.setEnabled(A1a);
                audioBar.A02 = A1X;
                view = audioBar;
                view.setVisibility(i);
                return;
            }
            C14360o3.A0F("audioBarViewStubber");
            throw C00O.createAndThrow();
        }
        if (interfaceC56392iX != null) {
            i = 8;
            view = interfaceC56392iX.getView();
            view.setVisibility(i);
            return;
        }
        C14360o3.A0F("audioBarViewStubber");
        throw C00O.createAndThrow();
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0R;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0U);
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    @Override // X.C51E
    public final boolean isScrolledToBottom() {
        MYM mym = this.A06;
        if (mym != null) {
            InterfaceC08430c6 A01 = MYM.A01(mym);
            if (A01 instanceof InterfaceC58055Pog) {
                return ((InterfaceC58055Pog) A01).isScrolledToBottom();
            }
            return true;
        }
        return true;
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        MYM mym = this.A06;
        if (mym != null) {
            InterfaceC08430c6 A01 = MYM.A01(mym);
            if (A01 instanceof InterfaceC58055Pog) {
                return ((InterfaceC58055Pog) A01).isScrolledToTop();
            }
            if (A01 instanceof C51D) {
                return ((C51D) A01).isScrolledToTop();
            }
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        MYM mym = this.A06;
        if (mym != null && mym.A0A()) {
            return true;
        }
        return false;
    }

    @Override // X.C51D
    public final void onBottomSheetClosed() {
        C677733r c677733r = this.A04;
        if (c677733r != null) {
            c677733r.A00();
        }
        C8BR c8br = this.A05;
        if (c8br != null) {
            c8br.DUE();
        }
        C8BF c8bf = this.A0G;
        if (c8bf != null) {
            c8bf.A01 = false;
        }
        MusicProduct musicProduct = this.A00;
        if ((musicProduct != MusicProduct.A0G && musicProduct != MusicProduct.A0H) || !this.A0Q) {
            MSZ.A0V(this.A0U).A01();
        }
        if (!this.A0Q) {
            AbstractC53893NsP.A00(AbstractC166987dD.A0r(this.A0U));
        }
        this.A0Q = false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.InterfaceC58052Pod
    public final String Aer(EnumC53139Nes enumC53139Nes) {
        return AbstractC167017dG.A0n(enumC53139Nes, __redex_internal_original_name, AbstractC43594JPz.A0x(enumC53139Nes));
    }

    @Override // X.AnonymousClass844
    public final String BVY() {
        String string = requireArguments().getString("music_browse_session_id", "");
        C14360o3.A07(string);
        return string;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C8BR c8br = this.A05;
        if (c8br != null) {
            c8br.CJG(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        MusicOverlaySearchTab musicOverlaySearchTab;
        QuickPromotionSlot quickPromotionSlot;
        int A02 = C0f9.A02(-1371870209);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        requireContext().getTheme().applyStyle(R.style.AudioBrowserSearchBar, true);
        Serializable serializable = requireArguments.getSerializable("capture_state");
        if (serializable != null) {
            this.A0J = (EnumC1810381f) serializable;
            ImmutableList.Builder builder = new ImmutableList.Builder();
            builder.addAll(AbstractC153636vY.A02(requireArguments, AudioTrackType.class, "audio_track_type_to_exclude"));
            this.A0E = builder.build();
            this.A0H = (MusicAttributionConfig) requireArguments.getParcelable("preload_music_attribution_config");
            Serializable serializable2 = requireArguments.getSerializable("music_product");
            if (serializable2 != null) {
                this.A00 = (MusicProduct) serializable2;
                ImmutableList immutableList = null;
                if (requireArguments.containsKey("default_focused_tab")) {
                    musicOverlaySearchTab = (MusicOverlaySearchTab) requireArguments.getParcelable("default_focused_tab");
                } else {
                    musicOverlaySearchTab = null;
                }
                this.A0I = musicOverlaySearchTab;
                this.A0B = (C8BN) requireArguments.getSerializable("music_browser_entry_point");
                this.A0N = requireArguments.getBoolean("is_from_share_sheet", false);
                Serializable serializable3 = requireArguments.getSerializable("attached_tracks");
                if (serializable3 instanceof ImmutableList) {
                    immutableList = (ImmutableList) serializable3;
                }
                this.A0D = immutableList;
                this.A0K = requireArguments.getString("media_id");
                this.A0L = requireArguments.getString("args_pre_filled_search_term");
                this.A0C = (EnumC203578zI) requireArguments.getSerializable("surface_element");
                this.A0A = (EnumC46263Kdv) requireArguments.getSerializable("audio_editor_entry_point");
                this.A0O = requireArguments.getBoolean("should_use_light_mode", false);
                this.A09 = (Map) requireArguments.getSerializable("visual_features");
                this.A0M = requireArguments.getBoolean("enable_share_from_spotify", false);
                this.A0F = new C55175Ode();
                InterfaceC09390do interfaceC09390do = this.A0U;
                C24U A0V = MSZ.A0V(interfaceC09390do);
                String valueOf = String.valueOf(this.A0B);
                C14360o3.A0B(valueOf, 0);
                MSX.A1K(A0V.A0E, "music_browser_fragment_entry_point : ", valueOf, A0V.A02);
                C27961Xa A00 = AbstractC54912fq.A00();
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                int ordinal = this.A00.ordinal();
                if (ordinal != 5) {
                    if (ordinal != 18 && ordinal != 9) {
                        if (ordinal != 13) {
                            if (ordinal == 14) {
                                quickPromotionSlot = QuickPromotionSlot.A0i;
                            }
                        } else {
                            quickPromotionSlot = QuickPromotionSlot.A0h;
                        }
                    } else {
                        quickPromotionSlot = QuickPromotionSlot.A14;
                    }
                    C54922fr A0S = AbstractC31175DnJ.A0S();
                    P72.A00(A0S, this, 4);
                    A0S.A08 = P78.A00;
                    this.A07 = AbstractC31175DnJ.A0T(this, A0r, A0S, A00, quickPromotionSlot);
                    C0f9.A09(481717152, A02);
                    return;
                }
                quickPromotionSlot = QuickPromotionSlot.A0p;
                C54922fr A0S2 = AbstractC31175DnJ.A0S();
                P72.A00(A0S2, this, 4);
                A0S2.A08 = P78.A00;
                this.A07 = AbstractC31175DnJ.A0T(this, A0r, A0S2, A00, quickPromotionSlot);
                C0f9.A09(481717152, A02);
                return;
            }
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = -1197633182;
        } else {
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = 1157379353;
        }
        C0f9.A09(i, A02);
        throw A14;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1955952072);
        C14360o3.A0B(layoutInflater, 0);
        if (this.A0O) {
            layoutInflater = AbstractC43593JPy.A0C(requireContext(), layoutInflater, R.style.MusicCreationLightOverlayTheme);
        }
        View inflate = layoutInflater.inflate(R.layout.layout_music_search_clips, viewGroup, false);
        C0f9.A09(-1878148938, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1756930753);
        super.onDestroyView();
        MYM mym = this.A06;
        if (mym != null) {
            mym.A09(C05F.A00);
        }
        this.A0Q = false;
        C0f9.A09(-1188385792, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        InterfaceC1818984z interfaceC1818984z;
        int A02 = C0f9.A02(-1871290341);
        super.onPause();
        C8BS c8bs = this.A03;
        if (c8bs != null && (interfaceC1818984z = c8bs.A00.A0F) != null) {
            interfaceC1818984z.Elu();
        }
        MYM mym = this.A06;
        if (mym != null) {
            this.A0P = AbstractC167007dF.A1X(MYM.A03(mym), EnumC53139Nes.A04);
            C0f9.A09(-1504892426, A02);
        } else {
            IllegalStateException A0g = AbstractC166997dE.A0g();
            C0f9.A09(-1394772335, A02);
            throw A0g;
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        InterfaceC1818984z interfaceC1818984z;
        int A02 = C0f9.A02(-1699302314);
        super.onResume();
        C8BS c8bs = this.A03;
        if (c8bs != null && (interfaceC1818984z = c8bs.A00.A0F) != null) {
            interfaceC1818984z.Eki();
        }
        C0f9.A09(-2005814424, A02);
    }
}
