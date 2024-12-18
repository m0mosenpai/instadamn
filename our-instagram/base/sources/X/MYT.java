package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.music.search.MusicOverlayResultsListController;
import com.instagram.music.search.tabloader.MusicOverlaySearchTab;
import java.util.AbstractCollection;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class MYT extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60072op, InterfaceC58197Pr3, InterfaceC62612t0, InterfaceC58055Pog, InterfaceC58054Pof {
    public static final String __redex_internal_original_name = "MusicOverlayBrowseResultsFragment";
    public C8BN A00;
    public MusicProduct A01;
    public MusicBrowseCategory A02;
    public C677733r A03;
    public MusicOverlayResultsListController A04;
    public InterfaceC57964PnA A05;
    public C50668MYm A06;
    public C50668MYm A07;
    public EnumC1810381f A08;
    public Map A09;
    public boolean A0A;
    public View A0B;
    public ImmutableList A0C;
    public N2A A0D;
    public MusicOverlaySearchTab A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public final long A0V = 1;
    public final MusicBrowseCategory A0W = MusicOverlaySearchTab.A04.A01;
    public final List A0X = AbstractC166987dD.A1E();
    public final InterfaceC09390do A0N = AbstractC25225BEi.A0a(C57528Pg2.A00(this, 39), C57528Pg2.A00(this, 27), C57531Pg5.A00(null, this, 23), AbstractC25225BEi.A1D(C50664MYh.class));
    public final InterfaceC09390do A0Q = AbstractC25225BEi.A0a(C57528Pg2.A00(this, 40), C57528Pg2.A00(this, 30), C57531Pg5.A00(null, this, 24), AbstractC25225BEi.A1D(ClipsCreationViewModel.class));
    public final InterfaceC09390do A0P = AbstractC25225BEi.A0a(C57528Pg2.A00(this, 41), C57528Pg2.A00(this, 29), C57531Pg5.A00(null, this, 25), AbstractC25225BEi.A1D(C87D.class));
    public final InterfaceC09390do A0O = AbstractC25225BEi.A0a(C57528Pg2.A00(this, 38), C57528Pg2.A00(this, 28), C57531Pg5.A00(null, this, 22), AbstractC25225BEi.A1D(C50858Mdp.class));
    public final InterfaceC09390do A0R = AbstractC09440dt.A01(C57528Pg2.A00(this, 31));
    public final InterfaceC09390do A0T = AbstractC09440dt.A01(C57528Pg2.A00(this, 42));
    public final InterfaceC58027PoD A0M = new LXC(this, 3);
    public final C05A A0U = AbstractC25225BEi.A1H(EnumC53162NfH.A06);
    public final InterfaceC09390do A0S = AbstractC60492pY.A02(this);

    public static final void A02(MYT myt) {
        MusicOverlayResultsListController musicOverlayResultsListController = myt.A04;
        if (musicOverlayResultsListController == null) {
            C14360o3.A0F("resultsListController");
            throw C00O.createAndThrow();
        }
        C8BO c8bo = C8BO.A03;
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("referrer_audio_id", "browserTrendingAudio");
        A0b.putSerializable(AbstractC43591JPw.A00(41), c8bo);
        C45507KCw c45507KCw = new C45507KCw();
        c45507KCw.setArguments(A0b);
        AbstractC54063NvN.A00(musicOverlayResultsListController.A09, c45507KCw, musicOverlayResultsListController.A0K);
        AbstractC37670Gi3.A0P(EnumC39652Hih.A03, myt, AbstractC166987dD.A0r(myt.A0S), null, null, null, myt.A0V);
        AbstractC50522MSa.A14(myt, new C50534MSn(myt, null, 43), ((Gt5) AbstractC166987dD.A17(myt.A0T)).A09);
    }

    @Override // X.InterfaceC58197Pr3
    public final Object BoC() {
        return null;
    }

    @Override // X.InterfaceC58197Pr3
    public final /* synthetic */ void DVK(String str, Object obj, int i) {
    }

    @Override // X.InterfaceC58197Pr3
    public final /* synthetic */ void DVL(int i, Object obj, boolean z) {
    }

    @Override // X.InterfaceC58197Pr3
    public final void Dg2(Object obj, int i) {
        this.A0A = false;
        A00();
    }

    @Override // X.InterfaceC58197Pr3
    public final boolean EjU() {
        return true;
    }

    @Override // X.InterfaceC58197Pr3
    public final boolean EjZ() {
        return true;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "music_overlay_detail";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if (r1 == 0) goto L13;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MYT.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final void A00() {
        View view;
        if (C18U.A06(C06090Tz.A05, AbstractC31178DnM.A0M(this.A0S), 36326764670105714L) && (view = this.A0B) != null) {
            view.setVisibility(AbstractC167007dF.A05(this.A0A ? 1 : 0));
        }
    }

    public static void A01(EnumC53180Nfc enumC53180Nfc, AbstractCollection abstractCollection, int i, int i2) {
        abstractCollection.add(new OAW(enumC53180Nfc, i, i2));
    }

    private final boolean A03() {
        MusicBrowseCategory musicBrowseCategory = this.A02;
        if (musicBrowseCategory != null) {
            if (!C14360o3.A0K(musicBrowseCategory.A00(), "artist_song_list")) {
                MusicBrowseCategory musicBrowseCategory2 = this.A02;
                if (musicBrowseCategory2 != null) {
                    if (!C14360o3.A0K(musicBrowseCategory2.A00(), "saved_music")) {
                        MusicBrowseCategory musicBrowseCategory3 = this.A02;
                        if (musicBrowseCategory3 != null) {
                            if (!C14360o3.A0K(musicBrowseCategory3.A00(), "saved_original_audio")) {
                                MusicBrowseCategory musicBrowseCategory4 = this.A02;
                                if (musicBrowseCategory4 != null) {
                                    if (C14360o3.A0K(musicBrowseCategory4.A00(), "playlists")) {
                                        MusicBrowseCategory musicBrowseCategory5 = this.A02;
                                        if (musicBrowseCategory5 != null) {
                                            if (!C14360o3.A0K(musicBrowseCategory5.A04, "bookmarked")) {
                                                return true;
                                            }
                                            return false;
                                        }
                                    } else {
                                        return true;
                                    }
                                }
                            } else {
                                return false;
                            }
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        C14360o3.A0F("musicBrowseCategory");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC62612t0
    public final void AD4() {
        C50668MYm c50668MYm = this.A07;
        if (c50668MYm != null) {
            if (c50668MYm.A01.A06()) {
                C50668MYm c50668MYm2 = this.A07;
                if (c50668MYm2 != null) {
                    c50668MYm2.A00(null, false);
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F("resultsLoader");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    @Override // X.InterfaceC58197Pr3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1ON ANK(X.InterfaceC25601Mq r21, java.lang.Integer r22, java.lang.Long r23, java.lang.Object r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MYT.ANK(X.1Mq, java.lang.Integer, java.lang.Long, java.lang.Object, java.lang.String):X.1ON");
    }

    @Override // X.InterfaceC58197Pr3
    public final boolean CLl() {
        MusicOverlayResultsListController musicOverlayResultsListController = this.A04;
        if (musicOverlayResultsListController == null) {
            C14360o3.A0F("resultsListController");
            throw C00O.createAndThrow();
        }
        C50979Mfm c50979Mfm = musicOverlayResultsListController.A0F;
        if (c50979Mfm.A09.size() <= 0 && c50979Mfm.A08.size() <= 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC58197Pr3
    public final void DgI(Object obj, int i) {
        String str;
        this.A0U.Egh(EnumC53162NfH.A05);
        MusicOverlayResultsListController musicOverlayResultsListController = this.A04;
        if (musicOverlayResultsListController == null) {
            str = "resultsListController";
        } else {
            musicOverlayResultsListController.A0C.notifyDataSetChanged();
            N2A n2a = this.A0D;
            str = "navigationPerfLogger";
            if (n2a != null) {
                n2a.A00.A04();
                N2A n2a2 = this.A0D;
                if (n2a2 != null) {
                    MusicBrowseCategory musicBrowseCategory = this.A02;
                    if (musicBrowseCategory == null) {
                        str = "musicBrowseCategory";
                    } else {
                        n2a2.A0J("tab", musicBrowseCategory.A00());
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x018e  */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.InterfaceC58197Pr3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DgT(X.InterfaceC57963Pn9 r20, java.lang.Object r21, int r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MYT.DgT(X.Pn9, java.lang.Object, int, boolean, boolean):void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0S);
    }

    @Override // X.InterfaceC58055Pog
    public final boolean isScrolledToBottom() {
        MusicOverlayResultsListController musicOverlayResultsListController = this.A04;
        if (musicOverlayResultsListController != null && !musicOverlayResultsListController.A0A()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC58055Pog
    public final boolean isScrolledToTop() {
        MusicOverlayResultsListController musicOverlayResultsListController = this.A04;
        if (musicOverlayResultsListController != null && !musicOverlayResultsListController.A0B()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (!this.A0J) {
            MusicBrowseCategory musicBrowseCategory = this.A02;
            if (musicBrowseCategory == null) {
                C14360o3.A0F("musicBrowseCategory");
                throw C00O.createAndThrow();
            }
            if (musicBrowseCategory.A07) {
                return false;
            }
        }
        AbstractC10360h2 abstractC10360h2 = this.mFragmentManager;
        if (abstractC10360h2 == null) {
            return false;
        }
        abstractC10360h2.A0b();
        return true;
    }

    @Override // X.InterfaceC58197Pr3
    public final void Dfr(AbstractC115105If abstractC115105If, int i) {
        String str;
        Throwable A01 = abstractC115105If.A01();
        String str2 = null;
        if (A01 != null) {
            str2 = A01.getMessage();
        }
        MSZ.A0V(this.A0S).A0D(str2, "");
        N2A n2a = this.A0D;
        if (n2a == null) {
            str = "navigationPerfLogger";
        } else {
            C69613Av c69613Av = n2a.A00;
            if (str2 == null) {
                str2 = "";
            }
            c69613Av.A07(str2);
            MusicOverlayResultsListController musicOverlayResultsListController = this.A04;
            if (musicOverlayResultsListController == null) {
                str = "resultsListController";
            } else {
                C9GR.A0B(musicOverlayResultsListController.A09.getContext(), "RequestFail");
                musicOverlayResultsListController.A0C.notifyDataSetChanged();
                this.A0U.Egh(EnumC53162NfH.A03);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x02cb, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, X.AbstractC25230BEn.A0k(r6, 0), 36326227800110854L) == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02e5, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, X.AbstractC25230BEn.A0k(r6, 0), 36326227800045317L) != false) goto L90;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r50) {
        /*
            Method dump skipped, instructions count: 795
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MYT.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1371506090);
        C14360o3.A0B(layoutInflater, 0);
        if (this.A0L) {
            layoutInflater = AbstractC43593JPy.A0C(getContext(), layoutInflater, R.style.MusicCreationLightOverlayTheme);
        }
        View inflate = layoutInflater.inflate(R.layout.fragment_music_overlay_results_detail, viewGroup, false);
        C0f9.A09(1877511350, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-242220465);
        super.onDestroyView();
        OT7.A01.A00 = null;
        C0f9.A09(-1220019924, A02);
    }

    @Override // X.InterfaceC58054Pof
    public final /* bridge */ /* synthetic */ InterfaceC58054Pof EZK(C677733r c677733r) {
        this.A03 = c677733r;
        return this;
    }

    @Override // X.InterfaceC58054Pof
    public final /* bridge */ /* synthetic */ InterfaceC58054Pof Eg5(InterfaceC57964PnA interfaceC57964PnA) {
        this.A05 = interfaceC57964PnA;
        return this;
    }
}
