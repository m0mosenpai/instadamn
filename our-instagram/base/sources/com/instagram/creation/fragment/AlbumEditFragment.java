package com.instagram.creation.fragment;

import X.AbstractC001800i;
import X.AbstractC09440dt;
import X.AbstractC111324zv;
import X.AbstractC12120kG;
import X.AbstractC13880nE;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC23641Du;
import X.AbstractC25225BEi;
import X.AbstractC25226BEj;
import X.AbstractC25229BEm;
import X.AbstractC25651Mw;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC43591JPw;
import X.AbstractC43592JPx;
import X.AbstractC43840Ja3;
import X.AbstractC43841Ja4;
import X.AbstractC50697MZs;
import X.AbstractC53242c7;
import X.AbstractC53889NsL;
import X.AbstractC53982Ntt;
import X.AbstractC56832jG;
import X.AbstractC59962oe;
import X.AbstractC60492pY;
import X.AbstractC93174Ft;
import X.AnonymousClass229;
import X.AnonymousClass249;
import X.AnonymousClass840;
import X.AnonymousClass841;
import X.C00O;
import X.C05A;
import X.C05F;
import X.C06090Tz;
import X.C0f9;
import X.C12500ku;
import X.C12M;
import X.C14360o3;
import X.C184708Hl;
import X.C18U;
import X.C1UC;
import X.C22C;
import X.C25671My;
import X.C36A;
import X.C47811L9t;
import X.C47Z;
import X.C50166MDt;
import X.C50627MWo;
import X.C50634MWv;
import X.C50695MZq;
import X.C50723MaO;
import X.C50930Mez;
import X.C51172MjG;
import X.C51688MsJ;
import X.C52254NAu;
import X.C55942hf;
import X.C55965Osx;
import X.C56035Ou7;
import X.C56250Oxx;
import X.C56333Ozu;
import X.C57171PZp;
import X.C57256Pbe;
import X.C6WI;
import X.C72133Lm;
import X.C8Z9;
import X.C9KJ;
import X.C9KW;
import X.EnumC09460dv;
import X.EnumC50631MWs;
import X.EnumC53148Nf3;
import X.EnumC60792q3;
import X.InterfaceC09390do;
import X.InterfaceC189598ae;
import X.InterfaceC189608af;
import X.InterfaceC41501vz;
import X.InterfaceC57810Pkc;
import X.InterfaceC58029PoF;
import X.InterfaceC58189Pqv;
import X.InterfaceC58195Pr1;
import X.InterfaceC58203Pr9;
import X.InterfaceC58286Pse;
import X.InterfaceC60072op;
import X.InterfaceC678133v;
import X.LBO;
import X.MSW;
import X.MSX;
import X.MX5;
import X.NHE;
import X.NLE;
import X.NLF;
import X.OOP;
import X.OXA;
import X.OY2;
import X.TextureViewSurfaceTextureListenerC56204OxD;
import X.ViewOnClickListenerC44797JsK;
import X.ViewOnClickListenerC55457OkB;
import X.ViewOnClickListenerC55460OkF;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.MediaSession;
import com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar;
import com.instagram.creation.ml.VisualFeatureStore;
import com.instagram.creation.toolbar.CreationToolbarView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class AlbumEditFragment extends AbstractC59962oe implements InterfaceC60072op {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public ViewGroup A07;
    public ImageView A08;
    public ViewFlipper A09;
    public RecyclerView A0A;
    public ColorFilterAlphaImageView A0B;
    public IgImageView A0C;
    public C52254NAu A0D;
    public InterfaceC58203Pr9 A0E;
    public ViewOnClickListenerC44797JsK A0F;
    public AnonymousClass840 A0G;
    public AnonymousClass841 A0H;
    public C8Z9 A0I;
    public VisualFeatureStore A0J;
    public C47811L9t A0K;
    public C51172MjG A0L;
    public OXA A0M;
    public InterfaceC58286Pse A0N;
    public CreationToolbarView A0O;
    public InterfaceC678133v A0P;
    public InterfaceC189598ae A0Q;
    public Map A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public InterfaceC41501vz A0W;
    public boolean A0X;
    public boolean A0Y;
    public final String A0Z;
    public final String A0a;
    public final InterfaceC09390do A0b;
    public final InterfaceC09390do A0c;
    public final InterfaceC09390do A0d = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A0e;
    public final InterfaceC09390do A0f;

    public static final void A06(View view, InterfaceC58203Pr9 interfaceC58203Pr9, MediaEditActionBar mediaEditActionBar, AlbumEditFragment albumEditFragment) {
        String str;
        if (albumEditFragment.A0S) {
            AbstractC13880nE.A0f(albumEditFragment.requireView(), mediaEditActionBar.getLayoutParams().height / 2);
        }
        C55942hf A04 = C55942hf.A04(28.0d, 15.0d);
        C55942hf A042 = C55942hf.A04(0.0d, 3.8d);
        C14360o3.A0A(A04);
        interfaceC58203Pr9.EeZ(A04);
        C14360o3.A0A(A042);
        interfaceC58203Pr9.EdC(A042);
        interfaceC58203Pr9.ET3(ViewConfiguration.get(albumEditFragment.requireContext()).getScaledMinimumFlingVelocity() * 2.0f);
        FragmentActivity requireActivity = albumEditFragment.requireActivity();
        Context themedContext = albumEditFragment.getThemedContext();
        InterfaceC58286Pse interfaceC58286Pse = albumEditFragment.A0N;
        if (interfaceC58286Pse == null) {
            str = "provider";
        } else {
            InterfaceC189598ae interfaceC189598ae = albumEditFragment.A0Q;
            if (interfaceC189598ae == null) {
                str = "pendingMediaProvider";
            } else {
                AnonymousClass840 anonymousClass840 = albumEditFragment.A0G;
                if (anonymousClass840 == null) {
                    str = "cameraSession";
                } else {
                    AnonymousClass841 anonymousClass841 = albumEditFragment.A0H;
                    if (anonymousClass841 == null) {
                        str = "creationCameraSession";
                    } else {
                        CreationSession creationSession = ((MX5) anonymousClass841).A01;
                        C1UC activity = albumEditFragment.getActivity();
                        C14360o3.A0C(activity, "null cannot be cast to non-null type com.instagram.creation.album.AlbumCoverFrameRenderProvider");
                        C52254NAu c52254NAu = new C52254NAu(themedContext, view, requireActivity, (InterfaceC57810Pkc) activity, interfaceC58203Pr9, creationSession, anonymousClass840, albumEditFragment, albumEditFragment, interfaceC58286Pse, interfaceC189598ae);
                        albumEditFragment.A0D = c52254NAu;
                        albumEditFragment.registerLifecycleListener(c52254NAu);
                        if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0r(albumEditFragment.A0d), 36326691655661607L)) {
                            albumEditFragment.A05(interfaceC58203Pr9.AuK());
                            return;
                        }
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A07(ImageView imageView, AlbumEditFragment albumEditFragment, int i) {
        if (imageView != null && albumEditFragment.A0K == null) {
            InterfaceC189598ae interfaceC189598ae = albumEditFragment.A0Q;
            if (interfaceC189598ae != null) {
                AnonymousClass841 anonymousClass841 = albumEditFragment.A0H;
                if (anonymousClass841 != null) {
                    C47Z A02 = MX5.A02(interfaceC189598ae, anonymousClass841);
                    if (A02 != null) {
                        InterfaceC09390do interfaceC09390do = albumEditFragment.A0d;
                        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                        Context themedContext = albumEditFragment.getThemedContext();
                        FragmentActivity requireActivity = albumEditFragment.requireActivity();
                        boolean A06 = C18U.A06(C06090Tz.A06, AbstractC166987dD.A0r(interfaceC09390do), 36326464022460303L);
                        C56333Ozu c56333Ozu = new C56333Ozu(albumEditFragment, A02);
                        AnonymousClass841 anonymousClass8412 = albumEditFragment.A0H;
                        if (anonymousClass8412 != null) {
                            InterfaceC189598ae interfaceC189598ae2 = albumEditFragment.A0Q;
                            if (interfaceC189598ae2 != null) {
                                C47811L9t c47811L9t = new C47811L9t(requireActivity, themedContext, imageView, albumEditFragment, A0r, anonymousClass8412, c56333Ozu, A02, interfaceC189598ae2, i, A06);
                                albumEditFragment.A0K = c47811L9t;
                                c47811L9t.A00(imageView);
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
                C14360o3.A0F("creationCameraSession");
                throw C00O.createAndThrow();
            }
            C14360o3.A0F("pendingMediaProvider");
            throw C00O.createAndThrow();
        }
    }

    public final void A0P() {
        String str;
        A0H(false);
        InterfaceC58286Pse interfaceC58286Pse = this.A0N;
        if (interfaceC58286Pse == null) {
            str = "provider";
        } else {
            A09(interfaceC58286Pse.BQj());
            InterfaceC58203Pr9 interfaceC58203Pr9 = this.A0E;
            if (interfaceC58203Pr9 == null) {
                str = "reboundHorizontalScrollView";
            } else {
                int AuK = interfaceC58203Pr9.AuK();
                int i = 1;
                AnonymousClass841 anonymousClass841 = this.A0H;
                if (anonymousClass841 == null) {
                    str = "creationCameraSession";
                } else {
                    if (AuK >= AbstractC31172DnG.A03(anonymousClass841.CpK(), 1)) {
                        i = 0;
                    }
                    A05(AuK + i);
                    UserSession A0r = AbstractC166987dD.A0r(this.A0d);
                    if (C18U.A06(AbstractC25225BEi.A0j(A0r, 0), A0r, 36319325787004084L)) {
                        AbstractC23641Du.A05(new C12M().AOT(1632833315, 3), new C57171PZp(this, null, 20), AbstractC25229BEm.A0a(this));
                        return;
                    }
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        String str;
        C14360o3.A0B(context, 0);
        super.onAttach(context);
        C1UC requireActivity = requireActivity();
        C14360o3.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.creation.base.sessionprovider.CameraSessionProvider");
        AnonymousClass840 Ak4 = ((InterfaceC189608af) requireActivity).Ak4();
        this.A0G = Ak4;
        if (Ak4 == null) {
            str = "cameraSession";
        } else {
            this.A0H = Ak4.A00();
            C1UC requireActivity2 = requireActivity();
            C14360o3.A0C(requireActivity2, "null cannot be cast to non-null type com.instagram.creation.photo.edit.ui.creationprovider.CreationProvider");
            this.A0N = (InterfaceC58286Pse) requireActivity2;
            C1UC requireActivity3 = requireActivity();
            C14360o3.A0C(requireActivity3, "null cannot be cast to non-null type com.instagram.pendingmedia.model.PendingMediaProvider");
            this.A0Q = (InterfaceC189598ae) requireActivity3;
            C50723MaO A03 = A03(this);
            InterfaceC189598ae interfaceC189598ae = this.A0Q;
            if (interfaceC189598ae == null) {
                str = "pendingMediaProvider";
            } else {
                A03.A03 = AbstractC25225BEi.A16(interfaceC189598ae);
                AnonymousClass841 anonymousClass841 = this.A0H;
                if (anonymousClass841 == null) {
                    str = "creationCameraSession";
                } else {
                    if (anonymousClass841.CpK().isEmpty()) {
                        AbstractC25226BEj.A1Q(this);
                        return;
                    }
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:212:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0745  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r29, android.os.Bundle r30) {
        /*
            Method dump skipped, instructions count: 1955
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.fragment.AlbumEditFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final C50723MaO A03(AlbumEditFragment albumEditFragment) {
        return (C50723MaO) albumEditFragment.A0f.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A04(com.instagram.creation.fragment.AlbumEditFragment r10, X.InterfaceC23621Ds r11) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.fragment.AlbumEditFragment.A04(com.instagram.creation.fragment.AlbumEditFragment, X.1Ds):java.lang.Object");
    }

    private final void A05(int i) {
        AnonymousClass841 anonymousClass841 = this.A0H;
        Integer num = null;
        if (anonymousClass841 == null) {
            C14360o3.A0F("creationCameraSession");
            throw C00O.createAndThrow();
        }
        MediaSession mediaSession = (MediaSession) AbstractC001800i.A0O(anonymousClass841.CpK(), i);
        if (mediaSession != null) {
            num = mediaSession.Btq();
        }
        A0R(AbstractC167007dF.A1X(num, C05F.A00));
    }

    public static final void A0A(AlbumEditFragment albumEditFragment) {
        ViewParent viewParent;
        if (albumEditFragment.A0M == null) {
            UserSession A0r = AbstractC166987dD.A0r(albumEditFragment.A0d);
            Context themedContext = albumEditFragment.getThemedContext();
            CreationToolbarView creationToolbarView = albumEditFragment.A0O;
            if (creationToolbarView != null) {
                viewParent = creationToolbarView.getParent();
            } else {
                viewParent = null;
            }
            AbstractC43592JPx.A1T(viewParent);
            albumEditFragment.A0M = new OXA(themedContext, (ViewGroup) viewParent, A0r);
        }
    }

    public static final void A0D(AlbumEditFragment albumEditFragment) {
        C8Z9 c8z9;
        C52254NAu c52254NAu = albumEditFragment.A0D;
        if (c52254NAu != null) {
            Iterator it = c52254NAu.A0E.iterator();
            while (it.hasNext()) {
                ((InterfaceC58195Pr1) it.next()).Ee2();
            }
        }
        C6WI.A01().A03(AbstractC166987dD.A0r(albumEditFragment.A0d), "share_screen");
        ViewGroup viewGroup = albumEditFragment.A07;
        if (viewGroup != null) {
            C12500ku c12500ku = new C12500ku(viewGroup);
            while (c12500ku.hasNext()) {
                MSW.A0A(c12500ku).setEnabled(false);
            }
        }
        if (AbstractC167007dF.A1Z(albumEditFragment.A0e)) {
            C1UC requireActivity = albumEditFragment.requireActivity();
            C14360o3.A0C(requireActivity, AbstractC43591JPw.A00(1206));
            ((InterfaceC58029PoF) requireActivity).Di2(false);
        } else {
            C50723MaO A03 = A03(albumEditFragment);
            C50634MWv c50634MWv = new C50634MWv(4, 3, true, false);
            A03.A00 = c50634MWv;
            A03.A0B.F8s(c50634MWv);
        }
        C8Z9 c8z92 = albumEditFragment.A0I;
        if (c8z92 != null && c8z92.A05() && (c8z9 = albumEditFragment.A0I) != null) {
            c8z9.A04(false);
        }
    }

    public static final void A0E(AlbumEditFragment albumEditFragment, EnumC53148Nf3 enumC53148Nf3) {
        String str;
        InterfaceC58203Pr9 interfaceC58203Pr9 = albumEditFragment.A0E;
        if (interfaceC58203Pr9 == null) {
            str = "reboundHorizontalScrollView";
        } else {
            int AuK = interfaceC58203Pr9.AuK();
            AnonymousClass841 anonymousClass841 = albumEditFragment.A0H;
            if (anonymousClass841 == null) {
                str = "creationCameraSession";
            } else {
                MediaSession mediaSession = (MediaSession) AbstractC001800i.A0O(anonymousClass841.CpK(), AuK);
                if (mediaSession != null) {
                    A08(mediaSession, albumEditFragment, enumC53148Nf3);
                    return;
                }
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A0F(AlbumEditFragment albumEditFragment, Integer num) {
        int i;
        if (num != null) {
            i = AbstractC53889NsL.A00(A03(albumEditFragment).A0A, num.intValue());
        } else {
            i = 0;
        }
        ViewOnClickListenerC44797JsK viewOnClickListenerC44797JsK = albumEditFragment.A0F;
        if (viewOnClickListenerC44797JsK != null) {
            viewOnClickListenerC44797JsK.setRestoreSelectedIndex(i);
        }
        ViewOnClickListenerC44797JsK viewOnClickListenerC44797JsK2 = albumEditFragment.A0F;
        if (viewOnClickListenerC44797JsK2 != null) {
            viewOnClickListenerC44797JsK2.A1H(i);
        }
        if (i > 0 && num != null) {
            C22C A01 = AnonymousClass229.A01(AbstractC166987dD.A0r(albumEditFragment.A0d));
            int intValue = num.intValue();
            if (A01.A0J() != null) {
                A01.A1B(AnonymousClass249.ALBUM, EnumC50631MWs.A0I, intValue, i);
            }
        }
    }

    public static final void A0G(AlbumEditFragment albumEditFragment, boolean z, boolean z2) {
        TextureViewSurfaceTextureListenerC56204OxD textureViewSurfaceTextureListenerC56204OxD;
        C9KJ c9kj;
        int i;
        ColorFilterAlphaImageView colorFilterAlphaImageView = albumEditFragment.A0B;
        if (colorFilterAlphaImageView != null) {
            C50723MaO A03 = A03(albumEditFragment);
            InterfaceC189598ae interfaceC189598ae = albumEditFragment.A0Q;
            if (interfaceC189598ae == null) {
                C14360o3.A0F("pendingMediaProvider");
                throw C00O.createAndThrow();
            }
            A03.A04(interfaceC189598ae, z);
            colorFilterAlphaImageView.setSelected(z);
            if (z2) {
                Context context = albumEditFragment.getContext();
                if (C36A.A05(AbstractC166987dD.A0r(albumEditFragment.A0d))) {
                    i = 2131976686;
                    if (z) {
                        i = 2131976683;
                    }
                } else {
                    i = 2131952897;
                    if (z) {
                        i = 2131952896;
                    }
                }
                AbstractC31173DnH.A13(context, albumEditFragment, i);
            }
            C52254NAu c52254NAu = albumEditFragment.A0D;
            if (c52254NAu != null && (textureViewSurfaceTextureListenerC56204OxD = c52254NAu.A0B) != null && (c9kj = textureViewSurfaceTextureListenerC56204OxD.A01) != null) {
                C9KW c9kw = c9kj.A08;
                if (z) {
                    if (c9kw != null) {
                        c9kw.A09();
                    }
                } else if (c9kw != null) {
                    c9kw.A0A();
                }
            }
            C6WI.A01().A0Q = true;
        }
    }

    private final void A0H(boolean z) {
        ColorFilterAlphaImageView colorFilterAlphaImageView = this.A0B;
        if (colorFilterAlphaImageView != null) {
            if (this.A0H != null) {
                boolean z2 = true;
                if (!r0.FDe().isEmpty()) {
                    colorFilterAlphaImageView.setVisibility(0);
                    C50723MaO A03 = A03(this);
                    InterfaceC189598ae interfaceC189598ae = this.A0Q;
                    if (interfaceC189598ae != null) {
                        List A02 = A03.A02(interfaceC189598ae);
                        if (!(A02 instanceof Collection) || !A02.isEmpty()) {
                            Iterator it = A02.iterator();
                            while (it.hasNext()) {
                                if (AbstractC43592JPx.A0l(it).A5F) {
                                    break;
                                }
                            }
                        }
                        InterfaceC189598ae interfaceC189598ae2 = this.A0Q;
                        if (interfaceC189598ae2 != null) {
                            AnonymousClass841 anonymousClass841 = this.A0H;
                            if (anonymousClass841 != null) {
                                C47Z A022 = MX5.A02(interfaceC189598ae2, anonymousClass841);
                                if (A022 == null || A022.A1J == null) {
                                    AnonymousClass841 anonymousClass8412 = this.A0H;
                                    if (anonymousClass8412 != null) {
                                        if (!anonymousClass8412.CLO()) {
                                            z2 = false;
                                        }
                                    }
                                }
                                colorFilterAlphaImageView.setSelected(z2);
                                C50723MaO A032 = A03(this);
                                InterfaceC189598ae interfaceC189598ae3 = this.A0Q;
                                if (interfaceC189598ae3 != null) {
                                    A032.A04(interfaceC189598ae3, colorFilterAlphaImageView.isSelected());
                                    if (z) {
                                        ViewOnClickListenerC55460OkF.A00(colorFilterAlphaImageView, 38, this);
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                    }
                    C14360o3.A0F("pendingMediaProvider");
                    throw C00O.createAndThrow();
                }
                colorFilterAlphaImageView.setVisibility(8);
                return;
            }
            C14360o3.A0F("creationCameraSession");
            throw C00O.createAndThrow();
        }
    }

    private final boolean A0I() {
        String str;
        InterfaceC189598ae interfaceC189598ae = this.A0Q;
        if (interfaceC189598ae == null) {
            str = "pendingMediaProvider";
        } else {
            AnonymousClass841 anonymousClass841 = this.A0H;
            str = "creationCameraSession";
            if (anonymousClass841 != null) {
                C47Z A02 = MX5.A02(interfaceC189598ae, anonymousClass841);
                if (A02 == null || A02.A1J == null) {
                    AnonymousClass841 anonymousClass8412 = this.A0H;
                    if (anonymousClass8412 != null) {
                        if (!anonymousClass8412.CMB()) {
                            UserSession A0r = AbstractC166987dD.A0r(this.A0d);
                            C14360o3.A0B(A0r, 0);
                            if (C36A.A09(A0r) && C18U.A06(C06090Tz.A05, A0r, 36326223504226042L)) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final boolean A0J(AlbumEditFragment albumEditFragment) {
        AnonymousClass841 anonymousClass841 = albumEditFragment.A0H;
        if (anonymousClass841 == null) {
            C14360o3.A0F("creationCameraSession");
            throw C00O.createAndThrow();
        }
        if (anonymousClass841.CpK().size() > 1) {
            return true;
        }
        return false;
    }

    public static final boolean A0K(AlbumEditFragment albumEditFragment) {
        InterfaceC09390do interfaceC09390do = albumEditFragment.A0d;
        if (C36A.A0B(AbstractC166987dD.A0r(interfaceC09390do))) {
            AnonymousClass841 anonymousClass841 = albumEditFragment.A0H;
            if (anonymousClass841 != null) {
                boolean isEmpty = anonymousClass841.FDe().isEmpty();
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                AnonymousClass841 anonymousClass8412 = albumEditFragment.A0H;
                if (anonymousClass8412 != null) {
                    if (OY2.A02(A0r, MX5.A01(anonymousClass8412), isEmpty, A0J(albumEditFragment)) && !C50723MaO.A01(albumEditFragment)) {
                        return true;
                    }
                }
            }
            C14360o3.A0F("creationCameraSession");
            throw C00O.createAndThrow();
        }
        return false;
    }

    public final UserSession A0L() {
        return AbstractC166987dD.A0r(this.A0d);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0Z;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(this.A0d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:196:0x01ae, code lost:
    
        if (A03(r19).A04 == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x025d, code lost:
    
        if (r13.B6P() == null) goto L140;
     */
    @Override // X.InterfaceC60072op
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onBackPressed() {
        /*
            Method dump skipped, instructions count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.fragment.AlbumEditFragment.onBackPressed():boolean");
    }

    public AlbumEditFragment() {
        C50166MDt c50166MDt = new C50166MDt(this, 35);
        C50166MDt c50166MDt2 = new C50166MDt(this, 28);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new C50166MDt(c50166MDt2, 29));
        this.A0f = AbstractC25225BEi.A0a(new C50166MDt(A00, 30), c50166MDt, new C57256Pbe(48, null, A00), AbstractC25225BEi.A1D(C50723MaO.class));
        this.A0a = AbstractC167017dG.A0j();
        this.A0S = true;
        this.A0e = AbstractC09440dt.A00(enumC09460dv, new C50166MDt(this, 34));
        this.A0c = AbstractC09440dt.A00(enumC09460dv, new C50166MDt(this, 22));
        C50166MDt c50166MDt3 = new C50166MDt(this, 20);
        InterfaceC09390do A002 = AbstractC09440dt.A00(enumC09460dv, new C50166MDt(new C50166MDt(this, 31), 32));
        this.A0b = AbstractC25225BEi.A0a(new C50166MDt(A002, 33), c50166MDt3, new C57256Pbe(49, null, A002), AbstractC25225BEi.A1D(C50930Mez.class));
        this.A0T = true;
        this.A0Z = "carousel_gallery";
    }

    private final View A00() {
        C52254NAu c52254NAu;
        if (AbstractC93174Ft.A03(requireContext())) {
            AnonymousClass841 anonymousClass841 = this.A0H;
            if (anonymousClass841 == null) {
                C14360o3.A0F("creationCameraSession");
                throw C00O.createAndThrow();
            }
            if (!((MX5) anonymousClass841).A01.A0G && (c52254NAu = this.A0D) != null) {
                UserSession userSession = c52254NAu.A0P;
                boolean booleanValue = OOP.A00(userSession).booleanValue();
                InterfaceC58203Pr9 interfaceC58203Pr9 = c52254NAu.A0R;
                if (booleanValue) {
                    interfaceC58203Pr9.EkJ();
                } else {
                    View Br3 = interfaceC58203Pr9.Br3();
                    View findViewById = Br3.findViewById(R.id.add_item_content_view);
                    if (findViewById == null) {
                        ViewGroup viewGroup = (ViewGroup) Br3;
                        findViewById = LayoutInflater.from(c52254NAu.A0N).inflate(R.layout.album_add_item_view, viewGroup, false);
                        viewGroup.addView(findViewById);
                    }
                    View requireViewById = findViewById.requireViewById(R.id.add_item_view_icon);
                    if (!AbstractC43840Ja3.A00(userSession)) {
                        int A01 = AbstractC53242c7.A01(c52254NAu.A0N);
                        Drawable background = requireViewById.getBackground();
                        background.getClass();
                        AbstractC166997dE.A1F(background, A01);
                    }
                    ViewOnClickListenerC55457OkB.A01(requireViewById, 5, c52254NAu);
                    interfaceC58203Pr9.EeY(true);
                    findViewById.setVisibility(0);
                    return findViewById;
                }
            }
        }
        return null;
    }

    private final View A01(View view) {
        View view2 = null;
        if (AbstractC93174Ft.A03(requireContext())) {
            AnonymousClass841 anonymousClass841 = this.A0H;
            if (anonymousClass841 == null) {
                C14360o3.A0F("creationCameraSession");
                throw C00O.createAndThrow();
            }
            if (!((MX5) anonymousClass841).A01.A0G && this.A0S) {
                InterfaceC09390do interfaceC09390do = this.A0d;
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                if (C18U.A06(AbstractC25225BEi.A0j(A0r, 0), A0r, 36320390939353525L)) {
                    view2 = AbstractC166997dE.A0S(view, R.id.gallery_add_container);
                    IgImageView A0Z = AbstractC31172DnG.A0Z(view2, R.id.gallery_add_button);
                    this.A0C = A0Z;
                    if (A0Z != null) {
                        A0Z.setActivated(true);
                        C184708Hl c184708Hl = new C184708Hl(A0Z);
                        c184708Hl.A00 = new C56250Oxx(this, 0);
                        c184708Hl.A00();
                        LBO.A00(requireActivity(), requireContext(), this, A03(this).A05, AbstractC166987dD.A0r(interfaceC09390do));
                        view2.setVisibility(0);
                        View view3 = this.A05;
                        if (view3 != null) {
                            ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                            if (layoutParams != null) {
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                marginLayoutParams.setMargins(0, 0, 0, 0);
                                view3.setLayoutParams(marginLayoutParams);
                            } else {
                                throw AbstractC166987dD.A15(AbstractC111324zv.A00(0));
                            }
                        }
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
            }
        }
        return view2;
    }

    private final ImageView A02(ViewGroup viewGroup, int i, int i2) {
        View inflate = LayoutInflater.from(getThemedContext()).inflate(R.layout.media_edit_button, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) inflate;
        imageView.setImageResource(i);
        imageView.setContentDescription(getString(i2));
        AbstractC56832jG.A00(imageView, getThemedContext().getColor(AbstractC53242c7.A08(getThemedContext())), AbstractC31173DnH.A03(getThemedContext(), getThemedContext(), R.attr.igds_color_creation_tools_blue), 255);
        viewGroup.addView(imageView, 0);
        return imageView;
    }

    public static final void A08(MediaSession mediaSession, AlbumEditFragment albumEditFragment, EnumC53148Nf3 enumC53148Nf3) {
        AbstractC50697MZs nlf;
        C8Z9 c8z9;
        Context context = albumEditFragment.getContext();
        if (context != null) {
            C50723MaO A03 = A03(albumEditFragment);
            InterfaceC189598ae interfaceC189598ae = albumEditFragment.A0Q;
            if (interfaceC189598ae == null) {
                C14360o3.A0F("pendingMediaProvider");
                throw C00O.createAndThrow();
            }
            boolean A06 = C18U.A06(C06090Tz.A05, AbstractC166987dD.A0r(albumEditFragment.A0d), 36323388825808070L);
            Boolean bool = (Boolean) albumEditFragment.A0c.getValue();
            A03.A09.A02++;
            A03.A03(context, mediaSession, interfaceC189598ae, false, A06);
            UserSession userSession = A03.A06;
            if (mediaSession.Btq() == C05F.A00) {
                nlf = new NLE(enumC53148Nf3, bool, true);
            } else {
                nlf = new NLF(EnumC53148Nf3.NONE, "video_edit_button", true, false);
            }
            C50695MZq.A00(userSession, nlf);
            C8Z9 c8z92 = albumEditFragment.A0I;
            if (c8z92 != null && c8z92.A05() && (c8z9 = albumEditFragment.A0I) != null) {
                c8z9.A04(false);
                return;
            }
            return;
        }
        AbstractC12120kG.A07("AlbumEditFragment", "onItemClick: context is null", null);
    }

    private final void A09(MediaEditActionBar mediaEditActionBar) {
        String str;
        if (!A0K(this) && !C50723MaO.A01(this)) {
            InterfaceC189598ae interfaceC189598ae = this.A0Q;
            if (interfaceC189598ae == null) {
                str = "pendingMediaProvider";
            } else {
                AnonymousClass841 anonymousClass841 = this.A0H;
                str = "creationCameraSession";
                if (anonymousClass841 != null) {
                    if (MX5.A02(interfaceC189598ae, anonymousClass841) != null) {
                        LinearLayout linearLayout = mediaEditActionBar.A0A;
                        AnonymousClass841 anonymousClass8412 = this.A0H;
                        if (anonymousClass8412 != null) {
                            boolean isEmpty = anonymousClass8412.FDe().isEmpty();
                            UserSession A0r = AbstractC166987dD.A0r(this.A0d);
                            AnonymousClass841 anonymousClass8413 = this.A0H;
                            if (anonymousClass8413 != null) {
                                if (OY2.A02(A0r, MX5.A01(anonymousClass8413), isEmpty, A0J(this)) && this.A08 == null) {
                                    View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(getThemedContext()), linearLayout, R.layout.media_edit_button);
                                    C14360o3.A0C(A0A, "null cannot be cast to non-null type android.widget.ImageView");
                                    ImageView imageView = (ImageView) A0A;
                                    this.A08 = imageView;
                                    A07(imageView, this, R.drawable.instagram_music_pano_outline_24);
                                    linearLayout.addView(this.A08);
                                    return;
                                }
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    public static final void A0B(AlbumEditFragment albumEditFragment) {
        ViewOnClickListenerC44797JsK viewOnClickListenerC44797JsK;
        int indexOf;
        Integer A0Z = MSX.A0Z(A0K(albumEditFragment) ? 1 : 0);
        C50723MaO A03 = A03(albumEditFragment);
        A03.A02 = null;
        A03.A06(A0Z, false);
        NHE nhe = A03(albumEditFragment).A01;
        if (nhe != null && (viewOnClickListenerC44797JsK = albumEditFragment.A0F) != null && (indexOf = viewOnClickListenerC44797JsK.A03.indexOf(nhe)) > -1) {
            viewOnClickListenerC44797JsK.A1H(indexOf);
        }
    }

    public static final void A0C(AlbumEditFragment albumEditFragment) {
        C50723MaO A03 = A03(albumEditFragment);
        Integer num = C05F.A01;
        A03.A01 = A03.A02;
        A03.A02 = null;
        A03.A06(num, true);
    }

    public final void A0M() {
        C6WI.A01().A00++;
        this.A0Y = false;
        C50695MZq.A00(AbstractC166987dD.A0r(this.A0d), new NLF(EnumC53148Nf3.NONE, "album_add", true, false));
    }

    public final void A0N() {
        C50723MaO A03 = A03(this);
        C50634MWv c50634MWv = A03.A00;
        C50634MWv c50634MWv2 = new C50634MWv(false, c50634MWv.A01, c50634MWv.A02, 3);
        A03.A00 = c50634MWv2;
        A03.A0B.F8s(c50634MWv2);
    }

    public final void A0O() {
        C50723MaO A03 = A03(this);
        C50634MWv c50634MWv = new C50634MWv(false, A03.A00.A01, false, 3);
        A03.A00 = c50634MWv;
        A03.A0B.F8s(c50634MWv);
    }

    public final void A0Q() {
        this.A00 = A00();
        View view = this.mView;
        if (view != null) {
            this.A01 = A01(view);
            InterfaceC58203Pr9 interfaceC58203Pr9 = this.A0E;
            if (interfaceC58203Pr9 == null) {
                C14360o3.A0F("reboundHorizontalScrollView");
                throw C00O.createAndThrow();
            }
            A05(interfaceC58203Pr9.AuK());
            return;
        }
        AbstractC12120kG.A07("AlbumEditFragment", "onItemsReRendered: view is null", null);
    }

    public final void A0R(boolean z) {
        C05A c05a = A03(this).A0L;
        do {
        } while (!c05a.AIi(c05a.getValue(), new C51688MsJ(z, 3)));
    }

    public final boolean A0S() {
        if (C50723MaO.A01(this)) {
            return false;
        }
        C50627MWo A00 = C50723MaO.A00(this);
        if (A00.A00 == null) {
            if (!A0K(this)) {
                return false;
            }
            Object obj = A00.A01;
            if (obj != C05F.A0C && obj != C05F.A0N && obj != C05F.A00) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(-2005487848);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A0d;
        if (AbstractC43840Ja3.A00(AbstractC166987dD.A0r(interfaceC09390do))) {
            setDayNightMode(EnumC60792q3.A03);
        }
        this.A0W = C56035Ou7.A00(this, 26);
        C25671My A00 = AbstractC25651Mw.A00(AbstractC166987dD.A0r(interfaceC09390do));
        InterfaceC41501vz interfaceC41501vz = this.A0W;
        if (interfaceC41501vz == null) {
            str = "saveAlbumListener";
        } else {
            A00.A01(interfaceC41501vz, C55965Osx.class);
            InterfaceC189598ae interfaceC189598ae = this.A0Q;
            if (interfaceC189598ae == null) {
                str = "pendingMediaProvider";
            } else {
                AnonymousClass841 anonymousClass841 = this.A0H;
                if (anonymousClass841 == null) {
                    str = "creationCameraSession";
                } else {
                    C47Z BcC = interfaceC189598ae.BcC(anonymousClass841.E3z());
                    if (BcC != null) {
                        AbstractC53982Ntt.A00(AbstractC166987dD.A0r(interfaceC09390do)).A02(requireContext(), BcC);
                    }
                    C0f9.A09(358172979, A02);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1280810336);
        C14360o3.A0B(layoutInflater, 0);
        this.A0S = AbstractC43841Ja4.A04(requireContext());
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fragment_album_filter, false);
        C0f9.A09(525299944, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-594881771);
        super.onDestroy();
        C25671My A00 = AbstractC25651Mw.A00(AbstractC166987dD.A0r(this.A0d));
        InterfaceC41501vz interfaceC41501vz = this.A0W;
        if (interfaceC41501vz == null) {
            C14360o3.A0F("saveAlbumListener");
            throw C00O.createAndThrow();
        }
        A00.A02(interfaceC41501vz, C55965Osx.class);
        C0f9.A09(1150066134, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1726943142);
        super.onDestroyView();
        A03(this).A06(C05F.A00, false);
        ViewOnClickListenerC44797JsK viewOnClickListenerC44797JsK = this.A0F;
        if (viewOnClickListenerC44797JsK != null) {
            viewOnClickListenerC44797JsK.A02 = null;
            viewOnClickListenerC44797JsK.setAdapter(null);
        }
        this.A0F = null;
        unregisterLifecycleListener(this.A0D);
        this.A0D = null;
        C47811L9t c47811L9t = this.A0K;
        if (c47811L9t != null) {
            c47811L9t.A01.A07.A0F();
        }
        InterfaceC678133v interfaceC678133v = this.A0P;
        if (interfaceC678133v != null) {
            interfaceC678133v.release();
        }
        this.A08 = null;
        this.A0B = null;
        this.A07 = null;
        this.A00 = null;
        this.A01 = null;
        this.A0O = null;
        this.A0M = null;
        C0f9.A09(-827813553, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1010694696);
        super.onPause();
        C72133Lm.A03.A02(getActivity(), AbstractC166987dD.A0r(this.A0d));
        InterfaceC58189Pqv interfaceC58189Pqv = (InterfaceC58189Pqv) C50723MaO.A00(this).A00;
        if (interfaceC58189Pqv != null) {
            interfaceC58189Pqv.onPause();
        }
        InterfaceC678133v interfaceC678133v = this.A0P;
        if (interfaceC678133v != null && interfaceC678133v.isPlaying()) {
            InterfaceC678133v interfaceC678133v2 = this.A0P;
            if (interfaceC678133v2 != null) {
                interfaceC678133v2.pause();
            }
            this.A0X = true;
        }
        C0f9.A09(754059713, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        InterfaceC678133v interfaceC678133v;
        int A02 = C0f9.A02(-1093514100);
        super.onResume();
        C72133Lm.A03.A03(getActivity(), AbstractC166987dD.A0r(this.A0d));
        InterfaceC58189Pqv interfaceC58189Pqv = (InterfaceC58189Pqv) C50723MaO.A00(this).A00;
        if (interfaceC58189Pqv != null) {
            interfaceC58189Pqv.onResume();
        }
        if (this.A0X && !this.A0V && (interfaceC678133v = this.A0P) != null) {
            interfaceC678133v.E4S();
        }
        C0f9.A09(658541008, A02);
    }
}
