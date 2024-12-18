package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.music.search.AudioBrowserBrowseLandingPageFragment;
import com.instagram.music.search.tabloader.MusicOverlaySearchTab;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class MYM implements MOQ, InterfaceC50496MQz, InterfaceC57964PnA {
    public InterfaceC56392iX A00;
    public AbstractC50663MYg A01;
    public MusicOverlaySearchTab A02;
    public String A03;
    public Map A04;
    public EnumC53139Nes A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final int A09;
    public final View A0A;
    public final AbstractC10360h2 A0B;
    public final C8BN A0C;
    public final EnumC50631MWs A0D;
    public final ImmutableList A0E;
    public final ImmutableList A0F;
    public final MusicProduct A0G;
    public final InterfaceC41501vz A0H;
    public final UserSession A0I;
    public final ViewOnFocusChangeListenerC44078Je3 A0J;
    public final AnonymousClass844 A0K;
    public final MusicAttributionConfig A0L;
    public final C677733r A0M;
    public final InterfaceC58154PqJ A0N;
    public final C54426O3g A0O;
    public final InterfaceC58052Pod A0P;
    public final EnumC1810381f A0Q;
    public final String A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final Button A0U;
    public final Integer A0V;
    public final HashMap A0W;
    public final List A0X;

    public final void A06() {
        if (!this.A08) {
            this.A08 = true;
            Button button = this.A0U;
            if (button != null) {
                int i = 8;
                if (!this.A0J.A04.hasFocus()) {
                    i = 0;
                }
                button.setVisibility(i);
            }
        }
    }

    public final void A07(MusicOverlaySearchTab musicOverlaySearchTab, Integer num) {
        EnumC53139Nes enumC53139Nes;
        this.A02 = musicOverlaySearchTab;
        if (!this.A07) {
            this.A07 = true;
            this.A03 = AbstractC166997dE.A0n();
            if (this.A06) {
                this.A0J.A05(true);
                enumC53139Nes = EnumC53139Nes.A04;
            } else {
                enumC53139Nes = EnumC53139Nes.A02;
                this.A05 = enumC53139Nes;
            }
            A05(enumC53139Nes, false);
        }
        ViewOnFocusChangeListenerC44078Je3 viewOnFocusChangeListenerC44078Je3 = this.A0J;
        viewOnFocusChangeListenerC44078Je3.A00 = true;
        if (viewOnFocusChangeListenerC44078Je3.A04.hasFocus() && viewOnFocusChangeListenerC44078Je3.A01.getVisibility() == 8) {
            viewOnFocusChangeListenerC44078Je3.A05(true);
        }
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                this.A0A.setVisibility(0);
            } else {
                View view = this.A0A;
                view.setVisibility(0);
                view.setTranslationY(AbstractC166987dD.A08(view) * 0.15f);
                AbstractC125325le A01 = AbstractC125325le.A01(view, 0);
                A01.A0I(1.0f);
                A01.A0K(0.0f);
                A01.A0F(true).A0H();
            }
        } else {
            View view2 = this.A0A;
            view2.setTranslationY(0.0f);
            AbstractC167007dF.A0y(view2, true);
        }
        Fragment A012 = A01(this);
        if (A012 != null) {
            A012.setUserVisibleHint(true);
        }
        AbstractC25651Mw.A00(this.A0I).A01(this.A0H, C55994OtR.class);
        this.A0N.DUV();
    }

    public final void A08(Integer num) {
        if (this.A07) {
            this.A0J.A01();
            A09(num);
            for (EnumC53139Nes enumC53139Nes : this.A0X) {
                String Aer = this.A0P.Aer(enumC53139Nes);
                AbstractC10360h2 abstractC10360h2 = this.A0B;
                if (C06P.A01(abstractC10360h2)) {
                    abstractC10360h2.A18(Aer, 1);
                }
                AbstractC125325le.A05(new View[]{A00(enumC53139Nes)}, false);
            }
            this.A01 = null;
            this.A0N.DUT();
            AnonymousClass229.A01(this.A0I).A03.A01();
        }
        this.A07 = false;
    }

    @Override // X.InterfaceC50496MQz
    public final void CxQ(String str) {
        C14360o3.A0B(str, 0);
        if (!C36A.A01(this.A0G, this.A0I)) {
            if (str.length() == 0) {
                A05(EnumC53139Nes.A02, true);
            } else {
                A04();
            }
        }
        if (!this.A06) {
            AbstractC50663MYg abstractC50663MYg = this.A01;
            if (abstractC50663MYg != null) {
                if (abstractC50663MYg.isResumed()) {
                    abstractC50663MYg.A02(str);
                    return;
                } else {
                    abstractC50663MYg.A00 = new PR3(abstractC50663MYg, str);
                    return;
                }
            }
            return;
        }
        this.A06 = false;
    }

    @Override // X.InterfaceC50496MQz
    public final void CxR(String str) {
        AbstractC50663MYg abstractC50663MYg = this.A01;
        if (abstractC50663MYg != null && abstractC50663MYg.isResumed()) {
            abstractC50663MYg.A03(str, false);
        }
    }

    @Override // X.InterfaceC57964PnA
    public final void Dug(JIN jin, MusicBrowseCategory musicBrowseCategory, String str) {
        C14360o3.A0B(jin, 0);
        this.A0N.DUj(jin, musicBrowseCategory, str, AbstractC167007dF.A0g(this.A0J.A04));
    }

    private final View A00(EnumC53139Nes enumC53139Nes) {
        HashMap hashMap = this.A0W;
        View view = (View) hashMap.get(enumC53139Nes);
        if (view == null) {
            View requireViewById = this.A0A.requireViewById(this.A0P.B8Q(enumC53139Nes));
            hashMap.put(enumC53139Nes, requireViewById);
            return requireViewById;
        }
        return view;
    }

    public static final EnumC53139Nes A03(MYM mym) {
        Object obj;
        Iterator it = mym.A0X.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (mym.A00((EnumC53139Nes) obj).getVisibility() == 0) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (EnumC53139Nes) obj;
    }

    private final void A04() {
        InterfaceC58052Pod interfaceC58052Pod = this.A0P;
        EnumC53139Nes enumC53139Nes = EnumC53139Nes.A04;
        AbstractC10360h2 abstractC10360h2 = this.A0B;
        C14360o3.A0B(enumC53139Nes, 1);
        Fragment A0O = abstractC10360h2.A0O(interfaceC58052Pod.B8Q(enumC53139Nes));
        if (A0O != null && A0O != this.A01) {
            String Aer = interfaceC58052Pod.Aer(enumC53139Nes);
            if (C06P.A01(abstractC10360h2)) {
                abstractC10360h2.A18(Aer, 0);
            }
        }
        A05(enumC53139Nes, true);
    }

    public final void A09(Integer num) {
        this.A0J.A02();
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue == 0) {
                    this.A0A.setVisibility(4);
                } else {
                    throw B4Z.A00();
                }
            } else {
                View view = this.A0A;
                AbstractC125325le A01 = AbstractC125325le.A01(view, 0);
                A01.A0I(0.0f);
                A01.A0K(AbstractC166987dD.A08(view) * 0.15f);
                PHM.A00(A01.A0F(true), this, 4);
            }
        } else {
            AbstractC166997dE.A1L(this.A0A, true);
        }
        Fragment A012 = A01(this);
        if (A012 != null) {
            A012.setUserVisibleHint(false);
        }
        this.A0N.DUU();
        AbstractC25651Mw.A00(this.A0I).A02(this.A0H, C55994OtR.class);
    }

    @Override // X.MOQ
    public final Integer Acu() {
        return this.A0V;
    }

    @Override // X.InterfaceC50496MQz
    public final void CxO() {
        UserSession userSession = this.A0I;
        if (C36A.A01(this.A0G, userSession)) {
            A05(this.A05, true);
        }
        if (this.A08) {
            AbstractC167007dF.A0y(this.A0U, true);
        }
        AnonymousClass229.A01(userSession).A03.A07 = "not_search";
    }

    @Override // X.InterfaceC50496MQz
    public final void CxP() {
        if (this.A08) {
            AbstractC166997dE.A1L(this.A0U, true);
        }
        if (C36A.A01(this.A0G, this.A0I)) {
            EnumC53139Nes A03 = A03(this);
            EnumC53139Nes enumC53139Nes = EnumC53139Nes.A04;
            if (A03 == enumC53139Nes && (A01(this) instanceof MYT)) {
                AbstractC50663MYg abstractC50663MYg = this.A01;
                if (abstractC50663MYg != null) {
                    InterfaceC58052Pod interfaceC58052Pod = this.A0P;
                    AbstractC10360h2 abstractC10360h2 = this.A0B;
                    C14360o3.A0B(enumC53139Nes, 1);
                    int B8Q = interfaceC58052Pod.B8Q(enumC53139Nes);
                    String Aer = interfaceC58052Pod.Aer(enumC53139Nes);
                    C14240no c14240no = new C14240no(abstractC10360h2);
                    c14240no.A0A(abstractC50663MYg, B8Q);
                    c14240no.A0I(Aer);
                    c14240no.A01();
                    return;
                }
                return;
            }
            A04();
        }
    }

    @Override // X.InterfaceC50496MQz
    public final boolean EiJ() {
        return !C36A.A01(this.A0G, this.A0I);
    }

    public static final Fragment A01(MYM mym) {
        EnumC53139Nes A03 = A03(mym);
        if (A03 != null) {
            return mym.A0B.A0O(mym.A0P.B8Q(A03));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Fragment A02(EnumC53139Nes enumC53139Nes) {
        String str;
        MusicBrowseCategory A01;
        MusicAttributionConfig musicAttributionConfig;
        String BVY;
        MusicOverlaySearchTab musicOverlaySearchTab;
        boolean z;
        Map map;
        String str2;
        String str3;
        AudioBrowserBrowseLandingPageFragment audioBrowserBrowseLandingPageFragment;
        ArrayList<? extends Parcelable> A1E;
        NQJ nqj;
        Bundle A0b = AbstractC166987dD.A0b();
        UserSession userSession = this.A0I;
        AbstractC31173DnH.A1C(A0b, userSession);
        MusicProduct musicProduct = this.A0G;
        A0b.putSerializable("music_product", musicProduct);
        ImmutableList immutableList = this.A0F;
        A0b.putParcelableArrayList("audio_type_to_exclude", AbstractC166987dD.A1F(immutableList));
        AnonymousClass844 anonymousClass844 = this.A0K;
        A0b.putSerializable("browse_session_full_id", anonymousClass844.BVY());
        EnumC1810381f enumC1810381f = this.A0Q;
        A0b.putSerializable("capture_state", enumC1810381f);
        EnumC50631MWs enumC50631MWs = this.A0D;
        A0b.putSerializable("camera_surface_type", enumC50631MWs);
        C8BN c8bn = this.A0C;
        A0b.putSerializable("camera_music_browser_entry_point", c8bn);
        ImmutableList immutableList2 = this.A0E;
        A0b.putSerializable("camera_already_attached_tracks", immutableList2);
        int i = this.A09;
        A0b.putInt("list_bottom_padding_px", i);
        String str4 = this.A0R;
        A0b.putString("media_id", str4);
        int ordinal = enumC53139Nes.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    A01 = C50535MSo.A02("bookmarked", AbstractC166997dE.A0p(this.A0A.getContext(), 2131968036));
                    musicAttributionConfig = this.A0L;
                    BVY = anonymousClass844.BVY();
                    musicOverlaySearchTab = this.A02;
                    z = this.A0T;
                    map = this.A04;
                    str2 = null;
                    str3 = "full_list";
                } else {
                    throw B4Z.A00();
                }
            } else {
                if (C36A.A00(musicProduct, userSession)) {
                    NQI nqi = new NQI();
                    C677733r c677733r = this.A0M;
                    C54426O3g c54426O3g = this.A0O;
                    nqi.A03 = this;
                    nqi.A00 = c677733r;
                    nqi.A01 = c54426O3g;
                    nqj = nqi;
                } else {
                    NQJ nqj2 = new NQJ();
                    nqj2.A03 = this;
                    nqj2.A00 = this.A0M;
                    nqj = nqj2;
                }
                A0b.putString("browse_session_single_id", this.A03);
                A0b.putSerializable("capture_state", enumC1810381f);
                A0b.putBoolean("should_use_light_mode", this.A0T);
                A0b.putSerializable("visual_features", (Serializable) this.A04);
                nqj.setArguments(A0b);
                NQJ nqj3 = nqj;
                this.A01 = nqj3;
                return nqj3;
            }
        } else {
            if (C36A.A03(userSession)) {
                A0b.putSerializable("music_product", musicProduct);
                A0b.putBoolean("should_use_light_mode", this.A0T);
                A0b.putParcelableArrayList("ineligible_audio_types", AbstractC166987dD.A1F(immutableList));
                A0b.putSerializable("music_browser_entry_point", c8bn);
                if (immutableList2 != null) {
                    A1E = AbstractC166987dD.A1F(immutableList2);
                } else {
                    A1E = AbstractC166987dD.A1E();
                }
                A0b.putParcelableArrayList("attached_tracks", A1E);
                A0b.putSerializable("browse_session_id", anonymousClass844.BVY());
                A0b.putSerializable("surface_type", enumC50631MWs);
                A0b.putString("media_id", str4);
                A0b.putSerializable("capture_state", enumC1810381f);
                C52168N6x c52168N6x = new C52168N6x();
                c52168N6x.A09 = this;
                c52168N6x.A06 = this.A0M;
                audioBrowserBrowseLandingPageFragment = c52168N6x;
            } else {
                if (C36A.A00(musicProduct, userSession)) {
                    if (musicProduct != MusicProduct.A07 && musicProduct != MusicProduct.A06) {
                        if (musicProduct == MusicProduct.A0G) {
                            str = "feed_browse";
                        } else if (AbstractC65993Txo.A02(musicProduct)) {
                            str = "stories_browse";
                        } else if (musicProduct == MusicProduct.A0H) {
                            str = "notes_browse";
                        }
                    } else {
                        str = "clips_browse";
                    }
                    A01 = C50535MSo.A01(str);
                    musicAttributionConfig = this.A0L;
                    BVY = anonymousClass844.BVY();
                    musicOverlaySearchTab = this.A02;
                    z = this.A0T;
                    map = this.A04;
                    str2 = null;
                    str3 = "preview";
                }
                AudioBrowserBrowseLandingPageFragment audioBrowserBrowseLandingPageFragment2 = new AudioBrowserBrowseLandingPageFragment();
                audioBrowserBrowseLandingPageFragment2.A0A = this;
                audioBrowserBrowseLandingPageFragment2.A08 = this.A0M;
                InterfaceC56392iX interfaceC56392iX = this.A00;
                if (interfaceC56392iX != null) {
                    audioBrowserBrowseLandingPageFragment2.A09 = new C54691ODr(audioBrowserBrowseLandingPageFragment2, userSession, interfaceC56392iX);
                }
                MusicOverlaySearchTab musicOverlaySearchTab2 = this.A02;
                if (musicOverlaySearchTab2 != null) {
                    A0b.putParcelable("defaultFocusedTab", musicOverlaySearchTab2);
                }
                A0b.putBoolean("shouldUseLightMode", this.A0T);
                A0b.putSerializable("visualFeatures", (Serializable) this.A04);
                A0b.putParcelable("MusicOverlayBrowseResultsFragment.music_attribution_config", this.A0L);
                audioBrowserBrowseLandingPageFragment = audioBrowserBrowseLandingPageFragment2;
            }
            audioBrowserBrowseLandingPageFragment.setArguments(A0b);
            return audioBrowserBrowseLandingPageFragment;
        }
        MYT A00 = AbstractC54062NvM.A00(c8bn, enumC50631MWs, immutableList, immutableList2, musicProduct, userSession, musicAttributionConfig, A01, musicOverlaySearchTab, enumC1810381f, BVY, str2, str3, map, i, false, z);
        A00.A05 = this;
        A00.A03 = this.A0M;
        return A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void A05(EnumC53139Nes enumC53139Nes, boolean z) {
        Fragment fragment;
        if (enumC53139Nes != A03(this)) {
            for (EnumC53139Nes enumC53139Nes2 : this.A0X) {
                if (enumC53139Nes2 != enumC53139Nes) {
                    AbstractC166997dE.A1L(A00(enumC53139Nes2), z);
                    InterfaceC58052Pod interfaceC58052Pod = this.A0P;
                    AbstractC10360h2 abstractC10360h2 = this.A0B;
                    C14360o3.A0B(enumC53139Nes2, 1);
                    Fragment A0O = abstractC10360h2.A0O(interfaceC58052Pod.B8Q(enumC53139Nes2));
                    if (A0O != null) {
                        A0O.setUserVisibleHint(false);
                    }
                }
            }
            InterfaceC58052Pod interfaceC58052Pod2 = this.A0P;
            AbstractC10360h2 abstractC10360h22 = this.A0B;
            C14360o3.A0B(enumC53139Nes, 1);
            Fragment A0O2 = abstractC10360h22.A0O(interfaceC58052Pod2.B8Q(enumC53139Nes));
            if (A0O2 != 0) {
                EnumC53139Nes enumC53139Nes3 = EnumC53139Nes.A04;
                if (enumC53139Nes == enumC53139Nes3) {
                    Fragment fragment2 = A0O2;
                    if (A0O2 instanceof MYT) {
                        fragment2 = A02(enumC53139Nes3);
                    }
                    this.A01 = (AbstractC50663MYg) fragment2;
                }
                boolean z2 = A0O2 instanceof InterfaceC58054Pof;
                fragment = A0O2;
                if (z2) {
                    InterfaceC58054Pof interfaceC58054Pof = (InterfaceC58054Pof) A0O2;
                    interfaceC58054Pof.Eg5(this);
                    interfaceC58054Pof.EZK(this.A0M);
                    fragment = A0O2;
                }
            } else {
                Fragment A02 = A02(enumC53139Nes);
                AbstractC167007dF.A1E(enumC53139Nes, 1, A02);
                int B8Q = interfaceC58052Pod2.B8Q(enumC53139Nes);
                String Aer = interfaceC58052Pod2.Aer(enumC53139Nes);
                C14240no c14240no = new C14240no(abstractC10360h22);
                c14240no.A0A(A02, B8Q);
                c14240no.A0I(Aer);
                c14240no.A01();
                fragment = A02;
            }
            AbstractC167007dF.A0y(A00(enumC53139Nes), z);
            fragment.setUserVisibleHint(true);
        }
    }

    public final boolean A0A() {
        Editable text;
        InterfaceC08430c6 A01 = A01(this);
        if ((A01 instanceof InterfaceC60072op) && ((InterfaceC60072op) A01).onBackPressed()) {
            return true;
        }
        ViewOnFocusChangeListenerC44078Je3 viewOnFocusChangeListenerC44078Je3 = this.A0J;
        SearchEditText searchEditText = viewOnFocusChangeListenerC44078Je3.A04;
        if ((!searchEditText.hasFocus() || (text = searchEditText.getText()) == null || text.length() == 0) && AbstractC167007dF.A0g(searchEditText).length() <= 0) {
            return false;
        }
        viewOnFocusChangeListenerC44078Je3.A01();
        return true;
    }

    public MYM(View view, AbstractC10360h2 abstractC10360h2, C8BN c8bn, ImmutableList immutableList, ImmutableList immutableList2, MusicProduct musicProduct, UserSession userSession, AnonymousClass844 anonymousClass844, MusicAttributionConfig musicAttributionConfig, C677733r c677733r, InterfaceC58154PqJ interfaceC58154PqJ, InterfaceC58052Pod interfaceC58052Pod, EnumC1810381f enumC1810381f, String str, String str2, Map map, int i, boolean z, boolean z2, boolean z3) {
        EnumC50631MWs enumC50631MWs;
        AbstractC25229BEm.A1I(musicProduct, 1, userSession);
        this.A0G = musicProduct;
        this.A0F = immutableList;
        this.A0P = interfaceC58052Pod;
        this.A0A = view;
        this.A0B = abstractC10360h2;
        this.A0I = userSession;
        this.A0K = anonymousClass844;
        this.A0M = c677733r;
        this.A0Q = enumC1810381f;
        this.A0C = c8bn;
        this.A0E = immutableList2;
        this.A0L = musicAttributionConfig;
        this.A09 = i;
        this.A0N = interfaceC58154PqJ;
        this.A06 = z;
        this.A0R = str;
        this.A0S = z2;
        this.A0T = z3;
        this.A04 = map;
        this.A0H = C56034Ou6.A00(this, 22);
        this.A0W = AbstractC166987dD.A1G();
        this.A03 = AbstractC167017dG.A0j();
        EnumC53139Nes enumC53139Nes = EnumC53139Nes.A02;
        this.A05 = enumC53139Nes;
        this.A0V = C05F.A00;
        int ordinal = this.A0Q.ordinal();
        if (ordinal == 1 || ordinal == 3) {
            enumC50631MWs = EnumC50631MWs.A0J;
        } else if (ordinal != 2) {
            enumC50631MWs = EnumC50631MWs.A0G;
        } else {
            enumC50631MWs = this.A0S ? EnumC50631MWs.A0L : EnumC50631MWs.A0I;
        }
        this.A0D = enumC50631MWs;
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A0X = A1E;
        A1E.add(enumC53139Nes);
        A1E.add(EnumC53139Nes.A04);
        A1E.add(EnumC53139Nes.A03);
        View A0E = AbstractC31173DnH.A0E(AbstractC167007dF.A0M(view, R.id.search_bar_container_view_stub), R.layout.asset_search_bar);
        C14360o3.A07(A0E);
        ViewOnFocusChangeListenerC44078Je3 viewOnFocusChangeListenerC44078Je3 = new ViewOnFocusChangeListenerC44078Je3(A0E, userSession, this, this);
        this.A0J = viewOnFocusChangeListenerC44078Je3;
        Button button = (Button) view.findViewById(R.id.music_cancel_button);
        this.A0U = button;
        if (button != null) {
            ViewOnClickListenerC55456OkA.A00(button, 26, this);
        }
        View findViewById = view.findViewById(R.id.qp_megaphone_stub);
        if (findViewById != null) {
            this.A00 = AbstractC56372iV.A00(findViewById);
        }
        if (str2 != null) {
            SearchEditText searchEditText = viewOnFocusChangeListenerC44078Je3.A04;
            if (!str2.equals(AbstractC167007dF.A0g(searchEditText))) {
                searchEditText.setText(str2);
            }
        }
        this.A0O = new C54426O3g(this);
    }
}
