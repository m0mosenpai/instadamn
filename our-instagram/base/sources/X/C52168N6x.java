package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.clips.model.metadata.AudioPageMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.modal.ModalActivity;
import com.instagram.music.common.constants.AudioTrackType;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.music.common.model.MusicModelEffectPair;
import com.instagram.music.common.model.MusicSearchArtist;
import com.instagram.music.common.model.MusicSearchPlaylist;
import java.io.Serializable;
import java.util.Collection;

/* renamed from: X.N6x, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52168N6x extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC58055Pog, JPe, InterfaceC58054Pof {
    public static final String __redex_internal_original_name = "MusicBrowserHomeFragment";
    public ComposeView A00;
    public RecyclerView A01;
    public C8BN A02;
    public ImmutableList A03;
    public ImmutableList A04;
    public MusicProduct A05;
    public C677733r A06;
    public C38067Gov A07;
    public C9PK A08;
    public InterfaceC57964PnA A09;
    public boolean A0A;
    public View A0B;
    public LinearLayoutManager A0C;
    public EnumC50631MWs A0D;
    public InterfaceC56392iX A0E;
    public InterfaceC56392iX A0F;
    public C55175Ode A0G;
    public EnumC1810381f A0H;
    public String A0I;
    public String A0J;
    public final String A0K;
    public final InterfaceC09390do A0L;
    public final InterfaceC09390do A0M;
    public final InterfaceC09390do A0N;
    public final InterfaceC09390do A0O;
    public final InterfaceC09390do A0P;
    public final InterfaceC09390do A0Q = AbstractC25225BEi.A0a(C57528Pg2.A00(this, 21), C57528Pg2.A00(this, 18), C57531Pg5.A00(null, this, 16), AbstractC25225BEi.A1D(C50669MYn.class));
    public final InterfaceC09390do A0R;

    @Override // X.JPf, X.JPg
    public final void D2d(C42734IvU c42734IvU) {
        String str;
        C14360o3.A0B(c42734IvU, 0);
        if (this.A0G == null) {
            str = "musicLogger";
        } else {
            UserSession A0r = AbstractC166987dD.A0r(this.A0R);
            String A00 = MSY.A0S(this.A0P).A00();
            String title = c42734IvU.getTitle();
            String str2 = this.A0I;
            if (str2 == null) {
                str = "browseSessionId";
            } else {
                EnumC50631MWs enumC50631MWs = this.A0D;
                if (enumC50631MWs == null) {
                    str = "surfaceType";
                } else {
                    C55175Ode.A03(enumC50631MWs, A0r, A00, title, str2);
                    A02(C50535MSo.A03("category", c42734IvU.getId(), c42734IvU.getTitle()));
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC43461JHz
    public final void DYv(JIN jin, String str, int i) {
        String str2;
        String str3;
        C14360o3.A0B(str, 2);
        if (this.A0G == null) {
            str3 = "musicLogger";
        } else {
            UserSession A0r = AbstractC166987dD.A0r(this.A0R);
            A00(jin, this);
            InterfaceC09390do interfaceC09390do = this.A0P;
            AbstractC51054Mh8 A01 = A01(interfaceC09390do);
            if (!(A01 instanceof NQS) && !(A01 instanceof NQT) && !(A01 instanceof NQR)) {
                str2 = "preview";
            } else {
                str2 = "full_list";
            }
            MusicBrowseCategory A0S = MSY.A0S(interfaceC09390do);
            String str4 = this.A0I;
            if (str4 == null) {
                str3 = "browseSessionId";
            } else {
                MusicProduct musicProduct = this.A05;
                if (musicProduct == null) {
                    str3 = "musicProduct";
                } else {
                    EnumC50631MWs enumC50631MWs = this.A0D;
                    if (enumC50631MWs == null) {
                        str3 = "surfaceType";
                    } else {
                        C55175Ode.A00(enumC50631MWs, musicProduct, A0r, jin, A0S, str, str2, str4);
                        MSW.A0m(this.A0L).A02(jin);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str3);
        throw C00O.createAndThrow();
    }

    @Override // X.JPf, X.JPg
    public final void DZM(MusicSearchPlaylist musicSearchPlaylist) {
        String str;
        C14360o3.A0B(musicSearchPlaylist, 0);
        if (this.A0G == null) {
            str = "musicLogger";
        } else {
            UserSession A0r = AbstractC166987dD.A0r(this.A0R);
            String A00 = MSY.A0S(this.A0P).A00();
            String title = musicSearchPlaylist.getTitle();
            String str2 = this.A0I;
            if (str2 == null) {
                str = "browseSessionId";
            } else {
                EnumC50631MWs enumC50631MWs = this.A0D;
                if (enumC50631MWs == null) {
                    str = "surfaceType";
                } else {
                    C55175Ode.A03(enumC50631MWs, A0r, A00, title, str2);
                    A02(MusicBrowseCategory.A08.A04(musicSearchPlaylist));
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.JGJ
    public final void Dj8(MusicSearchArtist musicSearchArtist, int i) {
    }

    @Override // X.JPe
    public final void Dj9(MusicSearchArtist musicSearchArtist, int i) {
    }

    @Override // X.JGK
    public final void DjH(String str) {
    }

    @Override // X.JHE
    public final void Dnh(AudioPageMetadata audioPageMetadata, JIN jin, MusicSearchPlaylist musicSearchPlaylist, String str, String str2, int i) {
        C55175Ode c55175Ode = this.A0G;
        if (c55175Ode == null) {
            C14360o3.A0F("musicLogger");
            throw C00O.createAndThrow();
        }
        InterfaceC09390do interfaceC09390do = this.A0R;
        c55175Ode.A07(AbstractC166987dD.A0r(interfaceC09390do), jin, musicSearchPlaylist.getId(), musicSearchPlaylist.getTitle(), i);
        Bundle A02 = AbstractC86593tX.A02(null, C8JW.A03, audioPageMetadata, str2);
        A02.putBoolean("ClipsConstants.CLIPS_NAVIGATE_TO_AUDIO_PAGE_FROM_BROWSER", true);
        AbstractC31173DnH.A0Z(requireActivity(), A02, AbstractC166987dD.A0o(interfaceC09390do), ModalActivity.class, "audio_page").A0D(this, 9688);
    }

    @Override // X.JHE
    public final void Dni(InterfaceC11380iw interfaceC11380iw, JIN jin, MusicSearchPlaylist musicSearchPlaylist, int i) {
        String str;
        C14360o3.A0B(interfaceC11380iw, 1);
        if (this.A0G == null) {
            str = "musicLogger";
        } else {
            UserSession A0r = AbstractC166987dD.A0r(this.A0R);
            String id = musicSearchPlaylist.getId();
            String title = musicSearchPlaylist.getTitle();
            String moduleName = interfaceC11380iw.getModuleName();
            String str2 = this.A0I;
            if (str2 == null) {
                str = "browseSessionId";
            } else {
                MusicProduct musicProduct = this.A05;
                if (musicProduct == null) {
                    str = "musicProduct";
                } else {
                    EnumC50631MWs enumC50631MWs = this.A0D;
                    if (enumC50631MWs == null) {
                        str = "surfaceType";
                    } else {
                        C55175Ode.A01(enumC50631MWs, musicProduct, A0r, jin, id, title, moduleName, str2, i);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC43461JHz
    public final void Dov(JIN jin, String str, int i) {
        String str2;
        String str3;
        C14360o3.A0B(str, 2);
        if (this.A0G == null) {
            str3 = "musicLogger";
        } else {
            UserSession A0r = AbstractC166987dD.A0r(this.A0R);
            int A00 = A00(jin, this);
            InterfaceC09390do interfaceC09390do = this.A0P;
            AbstractC51054Mh8 A01 = A01(interfaceC09390do);
            if (!(A01 instanceof NQS) && !(A01 instanceof NQT) && !(A01 instanceof NQR)) {
                str2 = "preview";
            } else {
                str2 = "full_list";
            }
            String A002 = MSY.A0S(interfaceC09390do).A00();
            String str4 = MSY.A0S(interfaceC09390do).A06;
            String str5 = this.A0I;
            if (str5 == null) {
                str3 = "browseSessionId";
            } else {
                MusicProduct musicProduct = this.A05;
                if (musicProduct == null) {
                    str3 = "musicProduct";
                } else {
                    EnumC50631MWs enumC50631MWs = this.A0D;
                    if (enumC50631MWs == null) {
                        str3 = "surfaceType";
                    } else {
                        C55175Ode.A02(enumC50631MWs, musicProduct, A0r, jin, str, str2, A002, str4, str5, A00, AbstractC31177DnL.A1a((Boolean) ((C50669MYn) this.A0Q.getValue()).A00(jin).A02()));
                        MSW.A0m(this.A0L).A03(false);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str3);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ComposeView composeView = (ComposeView) view.findViewById(R.id.tab_list_compose_view);
        this.A00 = composeView;
        if (composeView != null) {
            composeView.setViewCompositionStrategy(C25320BIp.A00);
            composeView.setContent(C5UA.A03(new C30496Dbf(this, 34), -285425891));
        }
        this.A01 = AbstractC43592JPx.A0B(view, R.id.content_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext());
        this.A0C = linearLayoutManager;
        RecyclerView recyclerView = this.A01;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        RecyclerView recyclerView2 = this.A01;
        if (recyclerView2 != null) {
            C38067Gov c38067Gov = this.A07;
            if (c38067Gov == null) {
                str = "adapter";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            recyclerView2.setAdapter(c38067Gov);
        }
        RecyclerView recyclerView3 = this.A01;
        if (recyclerView3 != null) {
            P2N p2n = new P2N(this, 2);
            C153146ui c153146ui = C153146ui.A0G;
            LinearLayoutManager linearLayoutManager2 = this.A0C;
            if (linearLayoutManager2 == null) {
                str = "layoutManager";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            AbstractC37304Gc5.A0y(linearLayoutManager2, recyclerView3, p2n, c153146ui);
        }
        RecyclerView recyclerView4 = this.A01;
        if (recyclerView4 != null) {
            recyclerView4.setItemAnimator(new UGH());
        }
        this.A0B = view.findViewById(R.id.loading_state);
        this.A0F = AbstractC31173DnH.A0U(view, R.id.error_state);
        this.A0E = AbstractC31173DnH.A0U(view, R.id.empty_state);
        A03(this, EnumC53173NfU.A07);
        InterfaceC09390do interfaceC09390do = this.A0P;
        AbstractC50522MSa.A14(this, new C50534MSn(this, null, 39), ((C51055Mh9) interfaceC09390do.getValue()).A09);
        AbstractC50522MSa.A14(this, new C50534MSn(this, null, 40), ((C51055Mh9) interfaceC09390do.getValue()).A08);
        AbstractC50522MSa.A14(this, new C50534MSn(this, null, 41), ((C51055Mh9) interfaceC09390do.getValue()).A0A);
        AbstractC50522MSa.A14(this, new C50534MSn(this, null, 42), ((C50669MYn) this.A0Q.getValue()).A07);
        InterfaceC09390do interfaceC09390do2 = this.A0L;
        AbstractC50522MSa.A14(this, new PZS(this, null, 40), MSW.A0m(interfaceC09390do2).A05);
        AbstractC50522MSa.A14(this, new PZS(this, null, 41), MSW.A0m(interfaceC09390do2).A04);
        AbstractC50522MSa.A14(this, new PYY(this, (InterfaceC23621Ds) null, 1), MSW.A0m(interfaceC09390do2).A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        X.C14360o3.A0F("adapter");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A00(X.JIN r5, X.C52168N6x r6) {
        /*
            androidx.recyclerview.widget.LinearLayoutManager r0 = r6.A0C
            r4 = -1
            if (r0 == 0) goto L50
            java.lang.String r3 = "layoutManager"
            int r2 = r0.A1a()
        Lb:
            X.Gov r0 = r6.A07
            java.lang.String r1 = "adapter"
            if (r0 == 0) goto L4c
            int r0 = r0.getItemCount()
            if (r2 >= r0) goto L50
            androidx.recyclerview.widget.LinearLayoutManager r0 = r6.A0C
            if (r0 != 0) goto L23
            X.C14360o3.A0F(r3)
        L1e:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L23:
            int r0 = r0.A1b()
            if (r2 > r0) goto L50
            if (r2 == r4) goto L50
            X.Gov r0 = r6.A07
            if (r0 == 0) goto L4c
            X.2xe r0 = r0.mDiffer
            java.util.List r0 = r0.A02
            java.lang.Object r1 = r0.get(r2)
            X.C14360o3.A07(r1)
            X.ICV r1 = (X.ICV) r1
            boolean r0 = r1 instanceof X.NQK
            if (r0 == 0) goto L49
            X.NQK r1 = (X.NQK) r1
            boolean r0 = r1.A00(r5)
            if (r0 == 0) goto L49
            return r2
        L49:
            int r2 = r2 + 1
            goto Lb
        L4c:
            X.C14360o3.A0F(r1)
            goto L1e
        L50:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52168N6x.A00(X.JIN, X.N6x):int");
    }

    private final void A02(MusicBrowseCategory musicBrowseCategory) {
        String str;
        UserSession A0r = AbstractC166987dD.A0r(this.A0R);
        MusicProduct musicProduct = this.A05;
        if (musicProduct == null) {
            str = "musicProduct";
        } else {
            ImmutableList immutableList = this.A04;
            if (immutableList == null) {
                str = "ineligibleAudioTypes";
            } else {
                String str2 = this.A0I;
                if (str2 == null) {
                    str = "browseSessionId";
                } else {
                    EnumC1810381f enumC1810381f = this.A0H;
                    if (enumC1810381f == null) {
                        str = "captureState";
                    } else {
                        EnumC50631MWs enumC50631MWs = this.A0D;
                        if (enumC50631MWs == null) {
                            str = "surfaceType";
                        } else {
                            C8BN c8bn = this.A02;
                            ImmutableList immutableList2 = this.A03;
                            if (immutableList2 == null) {
                                str = "attachedTracks";
                            } else {
                                MYT A00 = AbstractC54062NvM.A00(c8bn, enumC50631MWs, immutableList, immutableList2, musicProduct, A0r, null, musicBrowseCategory, null, enumC1810381f, str2, null, "full_list", null, 0, false, this.A0A);
                                InterfaceC57964PnA interfaceC57964PnA = this.A09;
                                if (interfaceC57964PnA != null) {
                                    A00.A05 = interfaceC57964PnA;
                                    C677733r c677733r = this.A06;
                                    if (c677733r != null) {
                                        A00.A03 = c677733r;
                                    }
                                    AbstractC54063NvN.A00(this, A00, false);
                                    return;
                                }
                                throw AbstractC166997dE.A0g();
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
    
        if (r5 == X.EnumC53173NfU.A06) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (r5 == X.EnumC53173NfU.A05) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.C52168N6x r4, X.EnumC53173NfU r5) {
        /*
            android.view.View r2 = r4.A0B
            r3 = 8
            if (r2 == 0) goto L14
            X.NfU r0 = X.EnumC53173NfU.A07
            if (r5 == r0) goto L10
            X.NfU r1 = X.EnumC53173NfU.A05
            r0 = 8
            if (r5 != r1) goto L11
        L10:
            r0 = 0
        L11:
            r2.setVisibility(r0)
        L14:
            androidx.recyclerview.widget.RecyclerView r2 = r4.A01
            if (r2 == 0) goto L25
            X.NfU r0 = X.EnumC53173NfU.A04
            if (r5 == r0) goto L21
            X.NfU r1 = X.EnumC53173NfU.A06
            r0 = 4
            if (r5 != r1) goto L22
        L21:
            r0 = 0
        L22:
            r2.setVisibility(r0)
        L25:
            X.2iX r2 = r4.A0F
            if (r2 == 0) goto L33
            X.NfU r1 = X.EnumC53173NfU.A03
            r0 = 8
            if (r5 != r1) goto L30
            r0 = 0
        L30:
            r2.setVisibility(r0)
        L33:
            X.2iX r1 = r4.A0E
            if (r1 == 0) goto L3f
            X.NfU r0 = X.EnumC53173NfU.A02
            if (r5 != r0) goto L3c
            r3 = 0
        L3c:
            r1.setVisibility(r3)
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52168N6x.A03(X.N6x, X.NfU):void");
    }

    @Override // X.JGG
    public final void DJB(MUD mud) {
        A02(C50535MSo.A03("genres", mud.A01, mud.A02));
    }

    @Override // X.JGH
    public final void DTm(MUD mud) {
        A02(C50535MSo.A03("moods", mud.A01, mud.A02));
    }

    @Override // X.JGI
    public final void DZN(MusicSearchPlaylist musicSearchPlaylist) {
        A02(MusicBrowseCategory.A08.A04(musicSearchPlaylist));
    }

    @Override // X.JPe, X.JPh
    public final void Dud(JIN jin, C54690ODq c54690ODq) {
        String str;
        C55175Ode c55175Ode = this.A0G;
        if (c55175Ode == null) {
            str = "musicLogger";
        } else {
            UserSession A0r = AbstractC166987dD.A0r(this.A0R);
            MusicBrowseCategory A0S = MSY.A0S(this.A0P);
            String str2 = this.A0I;
            if (str2 == null) {
                str = "browseSessionId";
            } else {
                MusicProduct musicProduct = this.A05;
                if (musicProduct == null) {
                    str = "musicProduct";
                } else {
                    String str3 = this.A0K;
                    EnumC50631MWs enumC50631MWs = this.A0D;
                    if (enumC50631MWs == null) {
                        str = "surfaceType";
                    } else {
                        c55175Ode.A06(this.A02, enumC50631MWs, musicProduct, A0r, jin, A0S, c54690ODq, str2, str3, this.A0J);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC43461JHz
    public final void Duh(JIN jin, Integer num, String str, String str2) {
        String str3;
        String str4;
        boolean A1U = AbstractC167007dF.A1U(str2);
        C55175Ode c55175Ode = this.A0G;
        if (c55175Ode == null) {
            str4 = "musicLogger";
        } else {
            UserSession A0r = AbstractC166987dD.A0r(this.A0R);
            InterfaceC09390do interfaceC09390do = this.A0P;
            AbstractC51054Mh8 A01 = A01(interfaceC09390do);
            if (!(A01 instanceof NQS) && !(A01 instanceof NQT) && !(A01 instanceof NQR)) {
                str3 = "preview";
            } else {
                str3 = "full_list";
            }
            MusicBrowseCategory A0S = MSY.A0S(interfaceC09390do);
            String str5 = this.A0I;
            if (str5 == null) {
                str4 = "browseSessionId";
            } else {
                MusicProduct musicProduct = this.A05;
                if (musicProduct == null) {
                    str4 = "musicProduct";
                } else {
                    EnumC50631MWs enumC50631MWs = this.A0D;
                    if (enumC50631MWs == null) {
                        str4 = "surfaceType";
                    } else {
                        c55175Ode.A05(this.A02, null, enumC50631MWs, musicProduct, A0r, jin, A0S, num, str, str2, str3, null, str5, this.A0K, this.A0J);
                        MSW.A0m(this.A0L).A03(A1U);
                        InterfaceC57964PnA interfaceC57964PnA = this.A09;
                        if (interfaceC57964PnA != null) {
                            interfaceC57964PnA.Dug(jin, MSY.A0S(interfaceC09390do), str);
                            return;
                        }
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str4);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC43461JHz
    public final void EJK(JIN jin, String str) {
        if (jin != null) {
            ((C50669MYn) this.A0Q.getValue()).A01(jin, C57386Pdk.A00, C57387Pdl.A00, true);
        }
    }

    @Override // X.InterfaceC43461JHz
    public final void EJN(JIN jin, String str) {
        if (jin != null) {
            ((C50669MYn) this.A0Q.getValue()).A01(jin, C57386Pdk.A00, C57387Pdl.A00, false);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0K;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0R);
    }

    @Override // X.InterfaceC58055Pog
    public final boolean isScrolledToBottom() {
        LinearLayoutManager linearLayoutManager = this.A0C;
        if (linearLayoutManager != null && AbstractC110854yx.A02(linearLayoutManager)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC58055Pog
    public final boolean isScrolledToTop() {
        View A0e;
        LinearLayoutManager linearLayoutManager = this.A0C;
        if (linearLayoutManager != null && (A0e = linearLayoutManager.A0e(0)) != null) {
            int A1a = linearLayoutManager.A1a();
            Rect A0U = AbstractC166987dD.A0U();
            A0e.getLocalVisibleRect(A0U);
            if (A1a != 0 || A0U.top != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        String str2;
        if (i == 9688) {
            C55175Ode c55175Ode = this.A0G;
            if (i2 == 9689) {
                if (c55175Ode != null) {
                    JIN jin = c55175Ode.A00;
                    if (jin != null) {
                        MusicBrowseCategory A0S = MSY.A0S(this.A0P);
                        C55175Ode c55175Ode2 = this.A0G;
                        if (c55175Ode2 != null) {
                            C54690ODq c54690ODq = c55175Ode2.A01;
                            if (c54690ODq == null || (str = c54690ODq.A04) == null) {
                                str = A0S.A04;
                                if (c54690ODq == null) {
                                    str2 = A0S.A06;
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
                    } else {
                        AbstractC12120kG.A05("spotlight_banner_selection", "MusicBrowserHomeFragment state has been reaped on Audio Page track confirmed", null);
                        C9GR.A01(requireContext(), "music_browser_use_audio_error", 2131967923, 1);
                        return;
                    }
                }
            } else if (c55175Ode != null) {
                if (c55175Ode.A00 != null) {
                    return;
                }
                AbstractC12120kG.A05("spotlight_banner_selection", "MusicBrowserHomeFragment state has been reaped on Audio Page back navigation", null);
                return;
            }
            C14360o3.A0F("musicLogger");
            throw C00O.createAndThrow();
        }
    }

    public C52168N6x() {
        C57528Pg2 A00 = C57528Pg2.A00(this, 17);
        InterfaceC09390do A002 = AbstractC09440dt.A00(EnumC09460dv.A02, C57528Pg2.A00(C57528Pg2.A00(this, 24), 25));
        this.A0P = AbstractC25225BEi.A0a(C57528Pg2.A00(A002, 26), A00, C57531Pg5.A00(null, A002, 19), AbstractC25225BEi.A1D(C51055Mh9.class));
        this.A0L = AbstractC25225BEi.A0a(C57528Pg2.A00(this, 22), C57528Pg2.A00(this, 13), C57531Pg5.A00(null, this, 17), AbstractC25225BEi.A1D(C50664MYh.class));
        this.A0O = AbstractC25225BEi.A0a(C57528Pg2.A00(this, 23), C57528Pg2.A00(this, 16), C57531Pg5.A00(null, this, 18), AbstractC25225BEi.A1D(ClipsCreationViewModel.class));
        this.A0N = AbstractC25225BEi.A0a(C57528Pg2.A00(this, 19), C57528Pg2.A00(this, 15), C57531Pg5.A00(null, this, 14), AbstractC25225BEi.A1D(C87D.class));
        this.A0M = AbstractC25225BEi.A0a(C57528Pg2.A00(this, 20), C57528Pg2.A00(this, 14), C57531Pg5.A00(null, this, 15), AbstractC25225BEi.A1D(C50858Mdp.class));
        this.A0K = "music_browser_home_fragment";
        this.A0R = AbstractC60492pY.A02(this);
    }

    public static AbstractC51054Mh8 A01(InterfaceC09390do interfaceC09390do) {
        C51055Mh9 c51055Mh9 = (C51055Mh9) interfaceC09390do.getValue();
        return C51055Mh9.A00((EnumC53226NgO) c51055Mh9.A0D.getValue(), c51055Mh9);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C8BN c8bn;
        String str;
        int A02 = C0f9.A02(1978343353);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Serializable serializable = requireArguments.getSerializable("music_product");
        C14360o3.A0C(serializable, "null cannot be cast to non-null type com.instagram.api.schemas.MusicProduct");
        this.A05 = (MusicProduct) serializable;
        this.A04 = ImmutableList.copyOf((Collection) AbstractC153636vY.A02(requireArguments, AudioTrackType.class, "ineligible_audio_types"));
        Serializable serializable2 = requireArguments.getSerializable("music_browser_entry_point");
        if (serializable2 instanceof C8BN) {
            c8bn = (C8BN) serializable2;
        } else {
            c8bn = null;
        }
        this.A02 = c8bn;
        this.A03 = ImmutableList.copyOf((Collection) AbstractC153636vY.A02(requireArguments, MusicModelEffectPair.class, "attached_tracks"));
        this.A0A = requireArguments.getBoolean("should_use_light_mode", false);
        this.A0I = AbstractC31173DnH.A0k(requireArguments, "browse_session_id");
        Serializable serializable3 = requireArguments.getSerializable("surface_type");
        C14360o3.A0C(serializable3, "null cannot be cast to non-null type com.facebook.analytics.structuredlogger.enums.InstagramCameraSurfaceTypes");
        this.A0D = (EnumC50631MWs) serializable3;
        this.A0J = requireArguments.getString("media_id");
        Serializable serializable4 = requireArguments.getSerializable("capture_state");
        C14360o3.A0C(serializable4, "null cannot be cast to non-null type instagram.core.camera.CaptureState");
        this.A0H = (EnumC1810381f) serializable4;
        InterfaceC09390do interfaceC09390do = this.A0R;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C8BN c8bn2 = this.A02;
        ImmutableList immutableList = this.A03;
        if (immutableList == null) {
            str = "attachedTracks";
        } else {
            this.A08 = new C9PK(c8bn2, immutableList, A0r, (ClipsCreationViewModel) this.A0O.getValue());
            this.A0G = new C55175Ode();
            AbstractC50522MSa.A14(this, new C50534MSn(this, null, 38), ((C50858Mdp) this.A0M.getValue()).A02);
            Context requireContext = requireContext();
            UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
            InterfaceC09390do interfaceC09390do2 = this.A0P;
            C51055Mh9 c51055Mh9 = (C51055Mh9) interfaceC09390do2.getValue();
            MusicBrowseCategory A0S = MSY.A0S(interfaceC09390do2);
            MusicProduct musicProduct = this.A05;
            if (musicProduct == null) {
                str = "musicProduct";
            } else {
                C50669MYn c50669MYn = (C50669MYn) this.A0Q.getValue();
                C50664MYh A0m = MSW.A0m(this.A0L);
                C9PK c9pk = this.A08;
                if (c9pk == null) {
                    str = "musicTrackStateDelegate";
                } else {
                    C38067Gov c38067Gov = new C38067Gov(requireContext, this, musicProduct, this, A0r2, A0S, this, c9pk, A0m, c50669MYn, c51055Mh9, this.A0A);
                    this.A07 = c38067Gov;
                    c38067Gov.setHasStableIds(true);
                    C0f9.A09(-651483605, A02);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(291867402);
        C14360o3.A0B(layoutInflater, 0);
        if (this.A0A) {
            layoutInflater = AbstractC43593JPy.A0C(getContext(), layoutInflater, R.style.MusicCreationLightOverlayTheme);
        }
        View inflate = layoutInflater.inflate(R.layout.fragment_music_browser_home, viewGroup, false);
        C0f9.A09(669481676, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(904440767);
        this.A00 = null;
        this.A0B = null;
        this.A01 = null;
        this.A0F = null;
        this.A0E = null;
        super.onDestroyView();
        C0f9.A09(1996598390, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-810162197);
        super.onPause();
        C50664MYh A0m = MSW.A0m(this.A0L);
        A0m.A03(false);
        A0m.A02.release();
        C0f9.A09(-1344173118, A02);
    }

    @Override // X.AbstractC59962oe, X.AbstractC59972of
    public final void onSetUserVisibleHint(boolean z, boolean z2) {
        super.onSetUserVisibleHint(z, z2);
        if (!z2 && z) {
            A01(this.A0P).A02();
        }
    }

    @Override // X.InterfaceC58054Pof
    public final /* bridge */ /* synthetic */ InterfaceC58054Pof EZK(C677733r c677733r) {
        this.A06 = c677733r;
        return this;
    }

    @Override // X.InterfaceC58054Pof
    public final /* bridge */ /* synthetic */ InterfaceC58054Pof Eg5(InterfaceC57964PnA interfaceC57964PnA) {
        this.A09 = interfaceC57964PnA;
        return this;
    }
}
