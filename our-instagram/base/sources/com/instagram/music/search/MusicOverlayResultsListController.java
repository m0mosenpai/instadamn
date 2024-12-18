package com.instagram.music.search;

import X.AbstractC110854yx;
import X.AbstractC12120kG;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC208910l;
import X.AbstractC25227BEk;
import X.AbstractC25229BEm;
import X.AbstractC25231BEo;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31178DnM;
import X.AbstractC37300Gc1;
import X.AbstractC37301Gc2;
import X.AbstractC37302Gc3;
import X.AbstractC37304Gc5;
import X.AbstractC43592JPx;
import X.AbstractC43593JPy;
import X.AbstractC50522MSa;
import X.AbstractC54062NvM;
import X.AbstractC54063NvN;
import X.AbstractC56372iV;
import X.AbstractC59962oe;
import X.AbstractC60592pi;
import X.AbstractC65993Txo;
import X.AbstractC86593tX;
import X.AnonymousClass001;
import X.AnonymousClass229;
import X.C00O;
import X.C09530e4;
import X.C0w9;
import X.C14240no;
import X.C14360o3;
import X.C153146ui;
import X.C17z;
import X.C1GJ;
import X.C1I2;
import X.C22C;
import X.C22F;
import X.C22M;
import X.C24U;
import X.C25621Ms;
import X.C38067Gov;
import X.C42734IvU;
import X.C448724r;
import X.C448824s;
import X.C50534MSn;
import X.C50535MSo;
import X.C50664MYh;
import X.C50669MYn;
import X.C50858Mdp;
import X.C50979Mfm;
import X.C51198Mji;
import X.C54430O3k;
import X.C54690ODq;
import X.C55175Ode;
import X.C57268Pbq;
import X.C57387Pdl;
import X.C57528Pg2;
import X.C62882tR;
import X.C64842wi;
import X.C677733r;
import X.C81X;
import X.C8BN;
import X.C8JW;
import X.C9GR;
import X.C9PK;
import X.EnumC1810381f;
import X.EnumC50631MWs;
import X.H2I;
import X.ICV;
import X.InterfaceC02590Ai;
import X.InterfaceC11380iw;
import X.InterfaceC23621Ds;
import X.InterfaceC56392iX;
import X.InterfaceC57964PnA;
import X.InterfaceC62602sz;
import X.InterfaceC62612t0;
import X.InterfaceC71183He;
import X.JIN;
import X.JPe;
import X.KD2;
import X.MSW;
import X.MSX;
import X.MSY;
import X.MSZ;
import X.MUD;
import X.MYT;
import X.NQK;
import X.O8D;
import X.PYY;
import X.PZS;
import X.UGH;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.clips.model.metadata.AudioPageMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.modal.ModalActivity;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.constants.AudioTrackType;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.music.common.model.MusicSearchArtist;
import com.instagram.music.common.model.MusicSearchPlaylist;
import com.instagram.music.search.tabloader.MusicOverlaySearchTab;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes9.dex */
public final class MusicOverlayResultsListController extends AbstractC60592pi implements InterfaceC71183He, JPe {
    public int A00;
    public InterfaceC56392iX A01;
    public MusicBrowseCategory A02;
    public C54430O3k A03;
    public MusicOverlaySearchTab A04;
    public C64842wi A05;
    public KD2 A06;
    public final EnumC50631MWs A07;
    public final MusicProduct A08;
    public final AbstractC59962oe A09;
    public final UserSession A0A;
    public final O8D A0B;
    public final C38067Gov A0C;
    public final C9PK A0D;
    public final C50664MYh A0E;
    public final C50979Mfm A0F;
    public final C50669MYn A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final boolean A0K;
    public final int A0L;
    public final C8BN A0M;
    public final ImmutableList A0N;
    public final ImmutableList A0O;
    public final C24U A0P;
    public final C55175Ode A0Q;
    public final ClipsCreationViewModel A0R;
    public final InterfaceC62612t0 A0S;
    public final MusicAttributionConfig A0T;
    public final C677733r A0U;
    public final InterfaceC57964PnA A0V;
    public final InterfaceC62602sz A0W;
    public final EnumC1810381f A0X;
    public final String A0Y;
    public final Map A0Z;
    public final boolean A0a;
    public C62882tR dropFrameWatcher;
    public View eligibilityWarningView;
    public LinearLayoutManager layoutManager;
    public View parentView;
    public RecyclerView recyclerView;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r22 == false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011e  */
    /* JADX WARN: Type inference failed for: r11v0, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A09(com.instagram.music.common.model.MusicBrowseCategory r18, java.lang.String r19, java.lang.String r20, java.util.List r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 701
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.music.search.MusicOverlayResultsListController.A09(com.instagram.music.common.model.MusicBrowseCategory, java.lang.String, java.lang.String, java.util.List, boolean, boolean):void");
    }

    @Override // X.JPf, X.JPg
    public final void D2d(C42734IvU c42734IvU) {
        C14360o3.A0B(c42734IvU, 0);
        MusicBrowseCategory A03 = C50535MSo.A03("category", c42734IvU.getId(), c42734IvU.getTitle());
        A06();
        A02(A03);
        C55175Ode.A03(this.A07, this.A0A, this.A02.A00(), c42734IvU.getTitle(), this.A0I);
    }

    @Override // X.InterfaceC71183He
    public final void DID(Fragment fragment) {
    }

    @Override // X.InterfaceC43461JHz
    public final void DYv(JIN jin, String str, int i) {
        C14360o3.A0B(str, 2);
        UserSession userSession = this.A0A;
        A00(jin, this);
        String str2 = this.A0H;
        MusicBrowseCategory musicBrowseCategory = this.A02;
        String str3 = this.A0I;
        C55175Ode.A00(this.A07, this.A08, userSession, jin, musicBrowseCategory, str, str2, str3);
        this.A0E.A02(jin);
    }

    @Override // X.JPf, X.JPg
    public final void DZM(MusicSearchPlaylist musicSearchPlaylist) {
        UserSession userSession;
        String A00;
        String title;
        C14360o3.A0B(musicSearchPlaylist, 0);
        if (C14360o3.A0K(musicSearchPlaylist.getId(), "PLAYLIST_ID.FOR_YOU")) {
            String str = this.A02.A04;
            if (str == null) {
                str = "";
            }
            String A0q = AbstractC166997dE.A0q(AbstractC166997dE.A0N(this.A09), 2131967993);
            MusicBrowseCategory musicBrowseCategory = this.A02;
            MusicBrowseCategory A002 = C50535MSo.A00(musicBrowseCategory.A00, musicBrowseCategory.A01, "trending", str, A0q, null);
            A06();
            A02(A002);
            userSession = this.A0A;
            A00 = A002.A00();
            title = A002.A06;
            if (title == null) {
                title = "";
            }
        } else {
            MusicBrowseCategory A04 = MusicBrowseCategory.A08.A04(musicSearchPlaylist);
            A06();
            A02(A04);
            this.A0P.A07("DROP_playlist_selected");
            userSession = this.A0A;
            A00 = this.A02.A00();
            title = musicSearchPlaylist.getTitle();
        }
        C55175Ode.A03(this.A07, userSession, A00, title, this.A0I);
    }

    @Override // X.JGJ
    public final void Dj8(MusicSearchArtist musicSearchArtist, int i) {
        A06();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("music_search_session_id", musicSearchArtist.A00);
        H2I h2i = (H2I) musicSearchArtist.A01;
        String str = h2i.A03;
        String str2 = h2i.A01;
        if (str2 != null) {
            A02(C50535MSo.A00(A0b, null, "artist_song_list", str, str2, null));
            UserSession userSession = this.A0A;
            String str3 = this.A0I;
            String str4 = this.A0J;
            MusicProduct musicProduct = this.A08;
            EnumC50631MWs enumC50631MWs = this.A07;
            AbstractC167027dH.A0a(0, userSession, str3, str4, musicProduct);
            C14360o3.A0B(enumC50631MWs, 6);
            C22C A01 = AnonymousClass229.A01(userSession);
            String str5 = musicSearchArtist.A00;
            C448724r c448724r = A01.A0F;
            InterfaceC02590Ai A0M = MSZ.A0M(c448724r);
            if (A0M.isSampled()) {
                MSW.A1N(C81X.A1e, A0M);
                MSW.A1V(A0M, "IG_CAMERA_MUSIC_BROWSE_ARTIST_SELECT");
                C22M c22m = c448724r.A04;
                AbstractC166987dD.A1S(A0M, MSX.A0f(c22m));
                A0M.AAP("artist_name", str2);
                A0M.A9K("artist_id", AbstractC25231BEo.A0j(0, str));
                AbstractC167007dF.A11(A0M, c448724r);
                AbstractC167017dG.A1A(c22m.A09, A0M);
                A0M.AAP("browse_session_id", str3);
                A0M.AAP("alacorn_session_id", str5);
                MSY.A13(A0M, musicProduct);
                AbstractC31171DnF.A1D(A0M, str4);
                MSW.A1M(enumC50631MWs, A0M);
                MSZ.A1D(A0M, i);
                AbstractC37302Gc3.A0t(A0M);
                AbstractC50522MSa.A19(A0M, c448724r);
                A0M.Cht();
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.JPe
    public final void Dj9(MusicSearchArtist musicSearchArtist, int i) {
        C55175Ode c55175Ode = this.A0Q;
        UserSession userSession = this.A0A;
        String str = this.A0I;
        String str2 = this.A0J;
        MusicProduct musicProduct = this.A08;
        EnumC50631MWs enumC50631MWs = this.A07;
        AbstractC167027dH.A0a(0, userSession, str, str2, musicProduct);
        C14360o3.A0B(enumC50631MWs, 6);
        Set set = c55175Ode.A03;
        H2I h2i = (H2I) musicSearchArtist.A01;
        String str3 = h2i.A03;
        if (set.add(str3)) {
            C22C A01 = AnonymousClass229.A01(userSession);
            String str4 = musicSearchArtist.A00;
            C448824s c448824s = A01.A0G;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c448824s.A01, "ig_camera_ui_tool_impression");
            if (A0f.isSampled()) {
                MSW.A1N(C81X.A1e, A0f);
                MSW.A1V(A0f, "IG_CAMERA_MUSIC_BROWSE_ARTIST_IMPRESSION");
                C22M c22m = c448824s.A04;
                AbstractC166987dD.A1S(A0f, MSX.A0f(c22m));
                A0f.AAP("artist_name", h2i.A01);
                A0f.A9K("artist_id", AbstractC25231BEo.A0j(0, str3));
                AbstractC167007dF.A11(A0f, c448824s);
                AbstractC167017dG.A1A(c22m.A09, A0f);
                A0f.AAP("browse_session_id", str);
                A0f.AAP("alacorn_session_id", str4);
                MSY.A13(A0f, musicProduct);
                AbstractC31171DnF.A1D(A0f, str2);
                MSZ.A1D(A0f, i);
                MSW.A1M(enumC50631MWs, A0f);
                AbstractC37302Gc3.A0t(A0f);
                AbstractC50522MSa.A19(A0f, c448824s);
                A0f.Cht();
            }
        }
    }

    @Override // X.JGK
    public final void DjH(String str) {
        this.A0E.A03(false);
        C54430O3k c54430O3k = this.A03;
        if (c54430O3k != null) {
            c54430O3k.A00.DjH(str);
        }
    }

    @Override // X.JHE
    public final void Dnh(AudioPageMetadata audioPageMetadata, JIN jin, MusicSearchPlaylist musicSearchPlaylist, String str, String str2, int i) {
        C55175Ode c55175Ode = this.A0Q;
        UserSession userSession = this.A0A;
        c55175Ode.A07(userSession, jin, musicSearchPlaylist.getId(), musicSearchPlaylist.getTitle(), i);
        Bundle A02 = AbstractC86593tX.A02(null, C8JW.A03, audioPageMetadata, str2);
        A02.putBoolean("ClipsConstants.CLIPS_NAVIGATE_TO_AUDIO_PAGE_FROM_BROWSER", true);
        AbstractC59962oe abstractC59962oe = this.A09;
        AbstractC31173DnH.A0Z(abstractC59962oe.requireActivity(), A02, userSession, ModalActivity.class, "audio_page").A0D(abstractC59962oe, 9688);
    }

    @Override // X.JHE
    public final void Dni(InterfaceC11380iw interfaceC11380iw, JIN jin, MusicSearchPlaylist musicSearchPlaylist, int i) {
        C14360o3.A0B(interfaceC11380iw, 1);
        UserSession userSession = this.A0A;
        String id = musicSearchPlaylist.getId();
        String title = musicSearchPlaylist.getTitle();
        String moduleName = interfaceC11380iw.getModuleName();
        String str = this.A0I;
        C55175Ode.A01(this.A07, this.A08, userSession, jin, id, title, moduleName, str, i);
    }

    @Override // X.InterfaceC43461JHz
    public final void Dov(JIN jin, String str, int i) {
        C14360o3.A0B(str, 2);
        UserSession userSession = this.A0A;
        int A00 = A00(jin, this);
        String str2 = this.A0H;
        String A002 = this.A02.A00();
        String str3 = this.A02.A06;
        String str4 = this.A0I;
        C55175Ode.A02(this.A07, this.A08, userSession, jin, str, str2, A002, str3, str4, A00, AbstractC167007dF.A1T((Boolean) this.A0G.A00(jin).A02()));
        this.A0E.A03(false);
    }

    @Override // X.InterfaceC43461JHz
    public final void EJK(JIN jin, String str) {
        C14360o3.A0B(str, 1);
        if (jin != null) {
            A04(AbstractC167007dF.A1N(this.A0F.A09.size()));
            this.A0G.A01(jin, new C57268Pbq(jin, this, str, A00(jin, this), true, true), C57387Pdl.A00, true);
        }
    }

    @Override // X.InterfaceC43461JHz
    public final void EJN(JIN jin, String str) {
        C14360o3.A0B(str, 1);
        if (jin != null) {
            A04(AbstractC167007dF.A1N(this.A0F.A09.size()));
            this.A0G.A01(jin, new C57268Pbq(jin, this, str, A00(jin, this), false, false), C57387Pdl.A00, false);
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        this.parentView = view;
        RecyclerView A0G = AbstractC31172DnG.A0G(view, R.id.music_list);
        C14360o3.A0B(A0G, 0);
        this.recyclerView = A0G;
        A05().setAdapter(this.A0C);
        View view2 = this.parentView;
        if (view2 != null) {
            View findViewById = view2.findViewById(R.id.music_search_no_results);
            boolean z = false;
            if (findViewById != null) {
                this.A01 = AbstractC56372iV.A01(findViewById, false, false);
            }
            View view3 = this.parentView;
            if (view3 != null) {
                View findViewById2 = view3.findViewById(R.id.import_oa_gallery_container);
                if (C14360o3.A0K(this.A02.A00(), "gallery")) {
                    UserSession userSession = this.A0A;
                    C22C A01 = AnonymousClass229.A01(userSession);
                    A01.A1R(((C22F) A01).A04.A0C, "AUDIO_BROWSER_IMPORT_TAB");
                    C14360o3.A0B(userSession, 0);
                    KD2 kd2 = new KD2();
                    kd2.setArguments(AbstractC31178DnM.A05(userSession));
                    this.A06 = kd2;
                    C14240no A0F = AbstractC43593JPy.A0F(this.A09);
                    KD2 kd22 = this.A06;
                    if (kd22 != null) {
                        A0F.A0A(kd22, R.id.import_oa_gallery_container);
                        A0F.A00();
                        if (findViewById2 != null) {
                            findViewById2.setVisibility(0);
                        }
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
                this.layoutManager = new LinearLayoutManager(A05().getContext());
                RecyclerView A05 = A05();
                LinearLayoutManager linearLayoutManager = this.layoutManager;
                if (linearLayoutManager != null) {
                    A05.setLayoutManager(linearLayoutManager);
                    int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                    AbstractC59962oe abstractC59962oe = this.A09;
                    C62882tR c62882tR = new C62882tR(abstractC59962oe.requireActivity(), AbstractC31171DnF.A0D(AnonymousClass001.A0R("music_browser_", this.A02.A00())), this.A0A, 23592974);
                    this.dropFrameWatcher = c62882tR;
                    abstractC59962oe.registerLifecycleListener(c62882tR);
                    RecyclerView A052 = A05();
                    C62882tR c62882tR2 = this.dropFrameWatcher;
                    if (c62882tR2 != null) {
                        A052.A14(c62882tR2);
                        C51198Mji.A00(A05(), this, 10);
                        RecyclerView A053 = A05();
                        InterfaceC62612t0 interfaceC62612t0 = this.A0S;
                        C153146ui c153146ui = C153146ui.A0G;
                        LinearLayoutManager linearLayoutManager2 = this.layoutManager;
                        if (linearLayoutManager2 != null) {
                            AbstractC37304Gc5.A0y(linearLayoutManager2, A053, interfaceC62612t0, c153146ui);
                            A05().setItemAnimator(new UGH());
                            A05().setPadding(A05().getPaddingLeft(), A05().getPaddingTop(), A05().getPaddingRight(), this.A0L);
                            abstractC59962oe.addFragmentVisibilityListener(this);
                            if (!this.A0W.isLoading()) {
                                if (this.A0F.A09.size() == 0) {
                                    z = true;
                                }
                                A04(z);
                            }
                            AbstractC50522MSa.A14(abstractC59962oe, new C50534MSn(this, view, null, 48), AbstractC208910l.A02(this.A0B.A01));
                            A01(view, this);
                            return;
                        }
                    } else {
                        str = "dropFrameWatcher";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                }
                str = "layoutManager";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
        }
        str = "parentView";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final int A00(JIN jin, MusicOverlayResultsListController musicOverlayResultsListController) {
        LinearLayoutManager linearLayoutManager = musicOverlayResultsListController.layoutManager;
        if (linearLayoutManager != null) {
            int A1a = linearLayoutManager.A1a();
            while (true) {
                C38067Gov c38067Gov = musicOverlayResultsListController.A0C;
                if (A1a >= c38067Gov.getItemCount()) {
                    break;
                }
                LinearLayoutManager linearLayoutManager2 = musicOverlayResultsListController.layoutManager;
                if (linearLayoutManager2 != null) {
                    if (A1a > linearLayoutManager2.A1b() || A1a == -1) {
                        break;
                    }
                    Object obj = c38067Gov.mDiffer.A02.get(A1a);
                    C14360o3.A07(obj);
                    ICV icv = (ICV) obj;
                    if ((icv instanceof NQK) && ((NQK) icv).A00(jin)) {
                        return A1a;
                    }
                    A1a++;
                } else {
                    C14360o3.A0F("layoutManager");
                    throw C00O.createAndThrow();
                }
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b3, code lost:
    
        if (r1 != 2) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(android.view.View r13, com.instagram.music.search.MusicOverlayResultsListController r14) {
        /*
            X.O8D r2 = r14.A0B
            X.05A r11 = r2.A01
            java.lang.Object r0 = r11.getValue()
            X.NgN r10 = X.EnumC53225NgN.A04
            if (r0 == r10) goto L14
            java.lang.Object r1 = r11.getValue()
            X.NgN r0 = X.EnumC53225NgN.A06
            if (r1 != r0) goto Lc8
        L14:
            com.instagram.common.session.UserSession r7 = r2.A00
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36326403892918123(0x810eac0001376b, double:3.036302324344519E-306)
            boolean r0 = X.C18U.A06(r2, r7, r0)
            if (r0 == 0) goto Lc8
            r0 = 2131435466(0x7f0b1fca, float:1.8492775E38)
            android.view.ViewStub r1 = X.AbstractC31171DnF.A07(r13, r0)
            if (r1 == 0) goto L3c
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == 0) goto L3c
            android.view.View r1 = r1.inflate()
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            r14.eligibilityWarningView = r1
        L3c:
            X.2oe r0 = r14.A09
            boolean r0 = r0 instanceof X.MYT
            if (r0 == 0) goto Lb9
            android.view.View r5 = r14.eligibilityWarningView
            if (r5 == 0) goto Lcf
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.TextView"
            X.C14360o3.A0C(r5, r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
            android.content.Context r6 = r13.getContext()
            r0 = 2130970729(0x7f040869, float:1.7550176E38)
        L54:
            int r4 = X.AbstractC53242c7.A0F(r6, r0)
            X.C14360o3.A07(r6)
            r0 = 2131965052(0x7f13347c, float:1.9566903E38)
            java.lang.String r3 = X.AbstractC166997dE.A0p(r6, r0)
            java.lang.Object r0 = r11.getValue()
            r12 = 2
            r8 = 1
            if (r0 != r10) goto L91
            r0 = 36607878869816993(0x820eac000416a1, double:3.2143082331441223E-306)
            long r1 = X.C18U.A01(r2, r7, r0)
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 != 0) goto Lae
            r1 = 2131967942(0x7f133fc6, float:1.9572765E38)
        L7c:
            java.lang.String r1 = X.AbstractC166997dE.A0p(r6, r1)
            X.NXr r0 = new X.NXr
            r0.<init>(r14, r4)
            X.AnonymousClass773.A07(r0, r5, r3, r1)
            android.view.View r1 = r14.eligibilityWarningView
            if (r1 == 0) goto L90
            r0 = 0
        L8d:
            r1.setVisibility(r0)
        L90:
            return
        L91:
            java.lang.Object r1 = r11.getValue()
            X.NgN r0 = X.EnumC53225NgN.A06
            if (r1 != r0) goto Lb5
            r0 = 36607878869882530(0x820eac000516a2, double:3.214308233185568E-306)
            long r1 = X.C18U.A01(r2, r7, r0)
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 == 0) goto Laa
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 != 0) goto Lb5
        Laa:
            r1 = 2131967945(0x7f133fc9, float:1.957277E38)
            goto L7c
        Lae:
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            r1 = 2131967943(0x7f133fc7, float:1.9572767E38)
            if (r0 == 0) goto L7c
        Lb5:
            r1 = 2131967944(0x7f133fc8, float:1.9572769E38)
            goto L7c
        Lb9:
            r0 = 2131435467(0x7f0b1fcb, float:1.8492777E38)
            android.widget.TextView r5 = X.AbstractC167007dF.A0N(r13, r0)
            android.content.Context r6 = r13.getContext()
            r0 = 2130970730(0x7f04086a, float:1.7550178E38)
            goto L54
        Lc8:
            android.view.View r1 = r14.eligibilityWarningView
            if (r1 == 0) goto L90
            r0 = 8
            goto L8d
        Lcf:
            java.lang.String r0 = "eligibilityWarningView"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.music.search.MusicOverlayResultsListController.A01(android.view.View, com.instagram.music.search.MusicOverlayResultsListController):void");
    }

    private final void A02(MusicBrowseCategory musicBrowseCategory) {
        InterfaceC57964PnA interfaceC57964PnA = this.A0V;
        if (interfaceC57964PnA == null) {
            AbstractC12120kG.A05("MusicOverlayResultsListController", "itemSelectionController is null in navigateToDetailFragment()", null);
            return;
        }
        UserSession userSession = this.A0A;
        MusicProduct musicProduct = this.A08;
        ImmutableList immutableList = this.A0O;
        String str = this.A0I;
        EnumC1810381f enumC1810381f = this.A0X;
        EnumC50631MWs enumC50631MWs = this.A07;
        MYT A00 = AbstractC54062NvM.A00(this.A0M, enumC50631MWs, immutableList, this.A0N, musicProduct, userSession, null, musicBrowseCategory, null, enumC1810381f, str, null, "full_list", this.A0Z, this.A0L, false, this.A0a);
        A00.A05 = interfaceC57964PnA;
        C677733r c677733r = this.A0U;
        if (c677733r != null) {
            A00.A03 = c677733r;
        }
        AbstractC54063NvN.A00(this.A09, A00, this.A0K);
    }

    public static final void A03(MusicOverlayResultsListController musicOverlayResultsListController) {
        int size = musicOverlayResultsListController.A0F.A09.size() / 2;
        LinearLayoutManager linearLayoutManager = musicOverlayResultsListController.layoutManager;
        if (linearLayoutManager != null) {
            if (size >= linearLayoutManager.A1a() && size <= linearLayoutManager.A1b()) {
                musicOverlayResultsListController.A0S.AD4();
                return;
            }
            return;
        }
        C14360o3.A0F("layoutManager");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cb, code lost:
    
        if (X.C14360o3.A0K(r1, "server_loaded") != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A04(boolean r9) {
        /*
            r8 = this;
            com.instagram.music.common.model.MusicBrowseCategory r0 = r8.A02
            java.lang.String r1 = r0.A00()
            java.lang.String r0 = "gallery"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            r3 = 8
            r2 = 0
            if (r0 == 0) goto L20
            androidx.recyclerview.widget.RecyclerView r0 = r8.A05()
            r0.setVisibility(r3)
        L18:
            X.2iX r0 = r8.A01
            if (r0 == 0) goto L1f
            r0.setVisibility(r3)
        L1f:
            return r2
        L20:
            boolean r0 = r8.A0K
            if (r0 != 0) goto Lb9
            com.instagram.music.common.model.MusicBrowseCategory r0 = r8.A02
            java.lang.String r1 = r0.A00()
            java.lang.String r0 = "playlists"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto Lb9
            com.instagram.music.common.model.MusicBrowseCategory r0 = r8.A02
            java.lang.String r1 = r0.A04
            java.lang.String r0 = "bookmarked"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto Lb9
        L3e:
            androidx.recyclerview.widget.RecyclerView r0 = r8.A05()
            if (r9 == 0) goto Ld1
            r0.setVisibility(r3)
            X.2iX r1 = r8.A01
            r7 = 1
            if (r1 == 0) goto Lad
            boolean r0 = r1.CWW()
            if (r0 != 0) goto Lad
            r0 = 0
            android.view.View r3 = r1.getView()
            if (r3 == 0) goto Ld6
            r1 = 2131436779(0x7f0b24eb, float:1.8495438E38)
            android.widget.ImageView r6 = X.AbstractC31176DnK.A0D(r3, r1)
            r1 = 2131436780(0x7f0b24ec, float:1.849544E38)
            android.widget.TextView r5 = X.AbstractC167007dF.A0N(r3, r1)
            r1 = 2131436778(0x7f0b24ea, float:1.8495436E38)
            android.widget.TextView r4 = X.AbstractC167007dF.A0N(r3, r1)
            com.instagram.music.search.tabloader.MusicOverlaySearchTab r1 = r8.A04
            if (r1 == 0) goto Lb7
            com.instagram.music.common.model.MusicBrowseCategory r1 = r1.A01
            if (r1 == 0) goto Lb7
            java.lang.String r3 = r1.A00()
        L7a:
            java.lang.String r1 = "server_loaded"
            boolean r1 = X.C14360o3.A0K(r3, r1)
            if (r1 == 0) goto Lad
            com.instagram.music.search.tabloader.MusicOverlaySearchTab r1 = r8.A04
            if (r1 == 0) goto Lb5
            com.instagram.music.common.model.MusicBrowseCategory r1 = r1.A01
            if (r1 == 0) goto Lb5
            java.lang.String r3 = r1.A03
        L8c:
            java.lang.String r1 = "bookmarked"
            boolean r1 = X.C14360o3.A0K(r3, r1)
            if (r1 != 0) goto Lad
            r1 = 2131238641(0x7f081ef1, float:1.8093566E38)
            r6.setImageResource(r1)
            r1 = 2131967951(0x7f133fcf, float:1.9572783E38)
            r5.setText(r1)
            com.instagram.music.search.tabloader.MusicOverlaySearchTab r1 = r8.A04
            if (r1 == 0) goto Laa
            com.instagram.music.common.model.MusicBrowserCategoryModel r1 = r1.A02
            if (r1 == 0) goto Laa
            java.lang.String r0 = r1.A02
        Laa:
            r4.setText(r0)
        Lad:
            X.2iX r0 = r8.A01
            if (r0 == 0) goto Lb4
            r0.setVisibility(r2)
        Lb4:
            return r7
        Lb5:
            r3 = 0
            goto L8c
        Lb7:
            r3 = 0
            goto L7a
        Lb9:
            com.instagram.music.search.tabloader.MusicOverlaySearchTab r0 = r8.A04
            if (r0 == 0) goto Lcf
            com.instagram.music.common.model.MusicBrowseCategory r0 = r0.A01
            if (r0 == 0) goto Lcf
            java.lang.String r1 = r0.A00()
        Lc5:
            java.lang.String r0 = "server_loaded"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L1f
            goto L3e
        Lcf:
            r1 = 0
            goto Lc5
        Ld1:
            r0.setVisibility(r2)
            goto L18
        Ld6:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.music.search.MusicOverlayResultsListController.A04(boolean):boolean");
    }

    public final RecyclerView A05() {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            return recyclerView;
        }
        C14360o3.A0F("recyclerView");
        throw C00O.createAndThrow();
    }

    public final void A06() {
        if (this.A09.isResumed()) {
            A05().requestFocus();
        }
    }

    public final void A07() {
        A02(C50535MSo.A03("gallery", "import", AbstractC25227BEk.A0v(this.A09, 2131964345)));
    }

    public final boolean A0A() {
        KD2 kd2 = this.A06;
        if (kd2 != null) {
            if (!kd2.isScrolledToBottom()) {
                return false;
            }
        } else if (this.layoutManager == null) {
            return false;
        }
        LinearLayoutManager linearLayoutManager = this.layoutManager;
        if (linearLayoutManager != null) {
            if (AbstractC110854yx.A02(linearLayoutManager)) {
                return true;
            }
            return false;
        }
        C14360o3.A0F("layoutManager");
        throw C00O.createAndThrow();
    }

    public final boolean A0B() {
        View A0e;
        KD2 kd2 = this.A06;
        if (kd2 != null) {
            return kd2.isScrolledToTop();
        }
        LinearLayoutManager linearLayoutManager = this.layoutManager;
        if (linearLayoutManager != null && (A0e = linearLayoutManager.A0e(0)) != null) {
            int A1a = linearLayoutManager.A1a();
            Rect A0U = AbstractC166987dD.A0U();
            A0e.getLocalVisibleRect(A0U);
            if (A1a != 0 || A0U.top != 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC71183He
    public final void DI9(Fragment fragment) {
        C50664MYh c50664MYh = this.A0E;
        c50664MYh.A03(false);
        c50664MYh.A02.release();
    }

    @Override // X.JGG
    public final void DJB(MUD mud) {
        MusicBrowseCategory A03 = C50535MSo.A03("genres", mud.A01, mud.A02);
        A06();
        A02(A03);
    }

    @Override // X.JGH
    public final void DTm(MUD mud) {
        MusicBrowseCategory A03 = C50535MSo.A03("moods", mud.A01, mud.A02);
        A06();
        A02(A03);
    }

    @Override // X.JGI
    public final void DZN(MusicSearchPlaylist musicSearchPlaylist) {
        MusicBrowseCategory A04 = MusicBrowseCategory.A08.A04(musicSearchPlaylist);
        A06();
        A02(A04);
        this.A0P.A07("DROP_playlist_selected");
    }

    @Override // X.JPe, X.JPh
    public final void Dud(JIN jin, C54690ODq c54690ODq) {
        C55175Ode c55175Ode = this.A0Q;
        UserSession userSession = this.A0A;
        MusicBrowseCategory musicBrowseCategory = this.A02;
        String str = this.A0I;
        MusicProduct musicProduct = this.A08;
        String str2 = this.A0J;
        c55175Ode.A06(this.A0M, this.A07, musicProduct, userSession, jin, musicBrowseCategory, c54690ODq, str, str2, this.A0Y);
    }

    @Override // X.InterfaceC43461JHz
    public final void Duh(JIN jin, Integer num, String str, String str2) {
        boolean A1U = AbstractC167007dF.A1U(str2);
        C55175Ode c55175Ode = this.A0Q;
        UserSession userSession = this.A0A;
        String str3 = this.A0H;
        C50979Mfm c50979Mfm = this.A0F;
        String str4 = c50979Mfm.A04;
        MusicBrowseCategory musicBrowseCategory = this.A02;
        String str5 = this.A0I;
        MusicProduct musicProduct = this.A08;
        c55175Ode.A05(this.A0M, null, this.A07, musicProduct, userSession, jin, musicBrowseCategory, num, str, str2, str3, str4, str5, this.A0J, this.A0Y);
        this.A0E.A03(A1U);
        InterfaceC57964PnA interfaceC57964PnA = this.A0V;
        if (interfaceC57964PnA != null) {
            String str6 = c50979Mfm.A04;
            if (str6 == null || str6.length() == 0) {
                AnonymousClass229.A01(userSession).A03.A07 = "not_search";
            }
            interfaceC57964PnA.Dug(jin, this.A02, str);
            A06();
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        String str2;
        if (i == 9688) {
            C55175Ode c55175Ode = this.A0Q;
            if (i2 == 9689) {
                JIN jin = c55175Ode.A00;
                if (jin != null) {
                    C54690ODq c54690ODq = c55175Ode.A01;
                    if (c54690ODq == null || (str = c54690ODq.A04) == null) {
                        MusicBrowseCategory musicBrowseCategory = this.A02;
                        str = musicBrowseCategory.A04;
                        if (c54690ODq == null) {
                            str2 = musicBrowseCategory.A06;
                            if (str2 == null || str2.length() == 0) {
                                str2 = "unknown";
                            }
                            Duh(jin, null, str, str2);
                            return;
                        }
                    }
                    str2 = c54690ODq.A05;
                    Duh(jin, null, str, str2);
                    return;
                }
                AbstractC12120kG.A05("spotlight_banner_selection", "ResultListController state has been reaped on Audio Page track confirmed", null);
                C9GR.A01(this.A09.requireContext(), "music_browser_use_audio_error", 2131967923, 1);
                return;
            }
            if (c55175Ode.A00 != null) {
                return;
            }
            AbstractC12120kG.A05("spotlight_banner_selection", "ResultListController state has been reaped on Audio Page back navigation", null);
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroy() {
        List list = this.A0Q.A02;
        if (AbstractC166987dD.A1b(list)) {
            MusicProduct musicProduct = this.A08;
            UserSession userSession = this.A0A;
            String str = this.A0I;
            AbstractC167017dG.A1N(musicProduct, userSession);
            C25621Ms A0c = AbstractC167017dG.A0c(userSession);
            A0c.A0B("music/search_session_tracking/");
            String A00 = AbstractC65993Txo.A00(musicProduct);
            if (A00 == null) {
                A00 = "";
            }
            MSX.A1J(A0c, A00, str);
            AbstractC31173DnH.A1N(A0c);
            try {
                StringWriter A0O = AbstractC37300Gc1.A0O();
                C17z A06 = AbstractC37301Gc2.A06(A0O);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C09530e4 A17 = AbstractC43592JPx.A17(it);
                    JIN jin = (JIN) A17.A00;
                    C54690ODq c54690ODq = (C54690ODq) A17.A01;
                    A06.A0d();
                    A06.A0S("audio_asset_id", jin.getId());
                    String Aal = jin.Aal();
                    if (Aal != null) {
                        A06.A0S("alacorn_session_id", Aal);
                    }
                    A06.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "song_selection");
                    Long l = c54690ODq.A02;
                    if (l != null) {
                        A06.A0S("event_time", AbstractC43592JPx.A0y(l));
                    }
                    A06.A0a();
                }
                A06.A0Z();
                A0c.A9s("search_sessions", MSY.A0e(A06, A0O));
            } catch (IOException e) {
                C0w9.A06("MusicSearchApiUtil", "Failed to generate search session data", e);
            }
            C1GJ.A03(A0c.A0N());
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        C50664MYh c50664MYh = this.A0E;
        c50664MYh.A03(false);
        c50664MYh.A02.release();
    }

    public final void A08() {
        String str;
        A06();
        this.A0P.A07("DROP_saved_button_tapped");
        if (!this.A0O.contains(AudioTrackType.A03)) {
            str = "playlists";
        } else {
            str = "saved_music";
        }
        A02(C50535MSo.A03(str, "bookmarked", AbstractC25227BEk.A0v(this.A09, 2131968036)));
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        A05().A0a();
        AbstractC59962oe abstractC59962oe = this.A09;
        C62882tR c62882tR = this.dropFrameWatcher;
        if (c62882tR != null) {
            abstractC59962oe.unregisterLifecycleListener(c62882tR);
            abstractC59962oe.removeFragmentVisibilityListener(this);
            MusicOverlayResultsListControllerLifecycleUtil.cleanupReferences(this);
            return;
        }
        C14360o3.A0F("dropFrameWatcher");
        throw C00O.createAndThrow();
    }

    public MusicOverlayResultsListController(C8BN c8bn, EnumC50631MWs enumC50631MWs, ImmutableList immutableList, ImmutableList immutableList2, MusicProduct musicProduct, AbstractC59962oe abstractC59962oe, UserSession userSession, C50858Mdp c50858Mdp, ClipsCreationViewModel clipsCreationViewModel, InterfaceC62612t0 interfaceC62612t0, MusicAttributionConfig musicAttributionConfig, MusicBrowseCategory musicBrowseCategory, C677733r c677733r, InterfaceC57964PnA interfaceC57964PnA, C50664MYh c50664MYh, C50979Mfm c50979Mfm, C50669MYn c50669MYn, InterfaceC62602sz interfaceC62602sz, EnumC1810381f enumC1810381f, String str, String str2, String str3, String str4, Map map, int i, boolean z, boolean z2) {
        AbstractC25229BEm.A1J(userSession, 2, c50664MYh);
        C14360o3.A0B(str2, 15);
        C14360o3.A0B(enumC50631MWs, 17);
        C14360o3.A0B(c50858Mdp, 20);
        C14360o3.A0B(c50669MYn, 21);
        C14360o3.A0B(c50979Mfm, 22);
        C14360o3.A0B(clipsCreationViewModel, 23);
        this.A09 = abstractC59962oe;
        this.A0A = userSession;
        this.A08 = musicProduct;
        this.A0O = immutableList;
        this.A0I = str;
        this.A02 = musicBrowseCategory;
        this.A0V = interfaceC57964PnA;
        this.A0U = c677733r;
        this.A0T = musicAttributionConfig;
        this.A0E = c50664MYh;
        this.A0S = interfaceC62612t0;
        this.A0W = interfaceC62602sz;
        this.A0K = z;
        this.A0L = i;
        this.A0J = str2;
        this.A0X = enumC1810381f;
        this.A07 = enumC50631MWs;
        this.A0M = c8bn;
        this.A0N = immutableList2;
        this.A0G = c50669MYn;
        this.A0F = c50979Mfm;
        this.A0R = clipsCreationViewModel;
        this.A0Y = str3;
        this.A0a = z2;
        this.A0Z = map;
        this.A0H = str4;
        this.A0Q = new C55175Ode();
        C24U c24u = AnonymousClass229.A01(userSession).A03;
        C14360o3.A07(c24u);
        this.A0P = c24u;
        this.A0B = (O8D) userSession.A01(O8D.class, C57528Pg2.A00(userSession, 8));
        C9PK c9pk = new C9PK(c8bn, immutableList2, userSession, clipsCreationViewModel);
        this.A0D = c9pk;
        C38067Gov c38067Gov = new C38067Gov(abstractC59962oe.requireContext(), abstractC59962oe, musicProduct, abstractC59962oe instanceof InterfaceC11380iw ? abstractC59962oe : null, userSession, this.A02, this, c9pk, c50664MYh, c50669MYn, interfaceC62602sz, z2);
        this.A0C = c38067Gov;
        c38067Gov.setHasStableIds(true);
        AbstractC50522MSa.A14(abstractC59962oe, new C50534MSn(this, null, 45), c50979Mfm.A0B);
        AbstractC50522MSa.A14(abstractC59962oe, new C50534MSn(this, null, 46), c50858Mdp.A02);
        AbstractC50522MSa.A14(abstractC59962oe, new C50534MSn(this, null, 47), c50669MYn.A07);
        AbstractC50522MSa.A14(abstractC59962oe, new PZS(this, null, 42), c50664MYh.A05);
        AbstractC50522MSa.A14(abstractC59962oe, new PZS(this, null, 43), c50664MYh.A04);
        AbstractC50522MSa.A14(abstractC59962oe, new PYY(this, (InterfaceC23621Ds) null, 2), c50664MYh.A03);
    }
}
