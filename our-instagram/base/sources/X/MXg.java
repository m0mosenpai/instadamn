package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.Collection;
import java.util.List;

/* loaded from: classes9.dex */
public final class MXg implements C8R0 {
    public final /* synthetic */ C50643MXf A00;

    @Override // X.C8R0
    public final Integer BQ9() {
        return null;
    }

    public MXg(C50643MXf c50643MXf) {
        this.A00 = c50643MXf;
    }

    @Override // X.C8R0
    public final int BmJ() {
        return C8JT.A02(this.A00.A0U.A00);
    }

    @Override // X.C8R0
    public final C115475Kh CFQ() {
        C50643MXf c50643MXf = this.A00;
        if (c50643MXf.A0A != c50643MXf.A0X) {
            AbstractC12120kG.A07(C50643MXf.__redex_internal_original_name, "current review mode is not trim mode", null);
        }
        return (C115475Kh) c50643MXf.A0D.A03(c50643MXf.A05);
    }

    @Override // X.C8R0
    public final void D1v() {
        C50643MXf c50643MXf = this.A00;
        C448124l A0S = MSW.A0S(c50643MXf.A0Q);
        C25531Mh A0G = MSW.A0G(A0S);
        if (A0S.A0P() && AbstractC25226BEj.A1Z(A0G)) {
            MSW.A1W(A0G);
            MSZ.A1I(A0G, A0S, "GALLERY_TRIM_EDITOR_CANCEL");
            C22M c22m = A0S.A04;
            AbstractC167007dF.A14(A0G, c22m);
            MSW.A1P(EnumC50631MWs.A0J, A0G);
            AbstractC167007dF.A13(A0G);
            JQ0.A1C(A0G, c22m);
            AbstractC167017dG.A1D(A0G);
        }
        C50643MXf.A0B(c50643MXf, false);
    }

    @Override // X.C8R0
    public final void D6z() {
        ImmutableList of;
        ImmutableList immutableList;
        C8JT c8jt;
        C50643MXf c50643MXf = this.A00;
        UserSession userSession = c50643MXf.A0Q;
        AbstractC183338Bg.A00(userSession).A0M(AbstractC166997dE.A0t(userSession), "gallery_review");
        C115475Kh c115475Kh = (C115475Kh) c50643MXf.A0D.A03(c50643MXf.A05);
        int i = c50643MXf.A02;
        int i2 = c50643MXf.A01;
        if (i < i2) {
            C22C A01 = AnonymousClass229.A01(userSession);
            A01.A0m(MSW.A05(c115475Kh));
            C8RR c8rr = c50643MXf.A0X;
            int intValue = c8rr.A02.intValue();
            if (intValue != 1) {
                if (intValue != 0) {
                    if (intValue != 2) {
                        if (intValue != 3) {
                            if (intValue == 4) {
                                C9L5 c9l5 = c50643MXf.A0U;
                                C115525Km c115525Km = c115475Kh.A0G;
                                int i3 = c50643MXf.A02;
                                int i4 = c50643MXf.A01;
                                C14360o3.A0B(c115525Km, 0);
                                C8JT c8jt2 = c9l5.A00;
                                C8JT.A0z(c8jt2, c115525Km, i3, i4 - i3);
                                C8JT.A0g(c8jt2);
                                c50643MXf.A0D = (C84B) AbstractC55154OdI.A04(c50643MXf.A0D).A00;
                            }
                        } else {
                            C9L5 c9l52 = c50643MXf.A0U;
                            C115525Km c115525Km2 = c115475Kh.A0G;
                            int i5 = c50643MXf.A02;
                            int i6 = c50643MXf.A01;
                            C14360o3.A0B(c115525Km2, 0);
                            c8jt = c9l52.A00;
                            ImmutableList of2 = ImmutableList.of();
                            C14360o3.A07(of2);
                            C8JT.A0K(of2, null, c8jt, c115525Km2, C05F.A0N, c115525Km2.A0H, i5, i6, true);
                        }
                    } else {
                        C9L5 c9l53 = c50643MXf.A0U;
                        C115525Km c115525Km3 = c115475Kh.A0G;
                        boolean z = c8rr.A04;
                        int i7 = c50643MXf.A02;
                        int i8 = c50643MXf.A01;
                        C14360o3.A0B(c115525Km3, 0);
                        int i9 = i8 - i7;
                        c8jt = c9l53.A00;
                        if (c8jt.CLf() && c8jt.A0J.A00 > i9) {
                            AbstractC12120kG.A07("ClipsCaptureControllerImpl", "remix original trimmed to shorter than recorded content", null);
                        }
                        ImmutableList of3 = ImmutableList.of();
                        C14360o3.A07(of3);
                        C8JT.A0K(of3, null, c8jt, c115525Km3, C05F.A0C, c115525Km3.A0H, i7, i8, z);
                    }
                    C8JT.A0g(c8jt);
                } else {
                    if (c50643MXf.A0f == null) {
                        AbstractC12120kG.A07(C50643MXf.__redex_internal_original_name, "clipsDirectoryProvider is null", null);
                        return;
                    }
                    int i10 = c115475Kh.A09;
                    int i11 = c50643MXf.A02;
                    if (i10 != i11 || c115475Kh.A08 != c50643MXf.A01) {
                        C9L5 c9l54 = c50643MXf.A0U;
                        int i12 = c50643MXf.A05;
                        int i13 = c50643MXf.A01;
                        C8JT c8jt3 = c9l54.A00;
                        if (c8jt3.A0E == null) {
                            AbstractC12120kG.A07("ClipsCaptureControllerImpl", "viewHolder is null", null);
                        } else {
                            ClipsCreationViewModel clipsCreationViewModel = c8jt3.A1n;
                            ClipsCreationViewModel.A03(EnumC191648eM.A0g, clipsCreationViewModel, true);
                            ClipsCreationViewModel.A05(clipsCreationViewModel, i12, i11, i13);
                        }
                        c50643MXf.A0D = AbstractC55154OdI.A02(c115475Kh, c50643MXf.A0D, c50643MXf.A05);
                        AnonymousClass229.A01(userSession).A1G(EnumC50631MWs.A0J);
                    }
                }
            } else {
                C448124l c448124l = A01.A09;
                C25531Mh A0G = MSW.A0G(c448124l);
                if (c448124l.A0P() && AbstractC25226BEj.A1Z(A0G)) {
                    MSW.A1W(A0G);
                    MSZ.A1I(A0G, c448124l, "GALLERY_TRIM_EDITOR_ADD");
                    C22M c22m = c448124l.A04;
                    AbstractC167007dF.A14(A0G, c22m);
                    MSW.A1P(EnumC50631MWs.A0J, A0G);
                    AbstractC167007dF.A13(A0G);
                    JQ0.A1C(A0G, c22m);
                    AbstractC167017dG.A1D(A0G);
                }
                C115545Ko c115545Ko = c115475Kh.A0F;
                List list = c115545Ko.A03;
                List list2 = c115545Ko.A02;
                if (list2 != null) {
                    of = ImmutableList.copyOf((Collection) list2);
                } else {
                    of = ImmutableList.of();
                }
                C14360o3.A07(of);
                if (list != null) {
                    immutableList = ImmutableList.copyOf((Collection) list);
                } else {
                    immutableList = null;
                }
                C9L5 c9l55 = c50643MXf.A0U;
                C115525Km c115525Km4 = c115475Kh.A0G;
                boolean z2 = c8rr.A04;
                C14360o3.A0B(c115525Km4, 0);
                C8JT.A0K(of, immutableList, c9l55.A00, c115525Km4, C05F.A01, c115525Km4.A0H, i, i2, z2);
                c50643MXf.A0c.A00 = null;
            }
            if (c50643MXf.A0A == c8rr && c8rr.A02 != C05F.A00) {
                return;
            }
            C50643MXf.A0B(c50643MXf, true);
            return;
        }
        AbstractC183338Bg.A00(userSession).A0B("Video is too short");
        C9GR.A07(c50643MXf.A0L, 2131975755);
    }

    @Override // X.C8R0
    public final void DGx() {
        InterfaceC58267PsB interfaceC58267PsB;
        C50643MXf c50643MXf = this.A00;
        if (c50643MXf.A0H && (interfaceC58267PsB = c50643MXf.A0B) != null) {
            if (c50643MXf.A0I && c50643MXf.A0E != null) {
                interfaceC58267PsB.reset();
                C50643MXf.A05(c50643MXf);
                C50643MXf.A09(c50643MXf, (C115475Kh) c50643MXf.A0D.A03(c50643MXf.A05), c50643MXf.A02);
            } else {
                interfaceC58267PsB.start();
            }
            c50643MXf.A0G = false;
            c50643MXf.A0I = false;
            AnonymousClass229.A01(c50643MXf.A0Q).A1G(EnumC50631MWs.A0J);
        }
    }

    @Override // X.C8R0
    public final void DGy() {
        InterfaceC58267PsB interfaceC58267PsB;
        C50643MXf c50643MXf = this.A00;
        if (c50643MXf.A0H && (interfaceC58267PsB = c50643MXf.A0B) != null) {
            c50643MXf.A0G = true;
            interfaceC58267PsB.pause();
        }
    }

    @Override // X.C8R0
    public final void DUH() {
        AudioOverlayTrack audioOverlayTrack;
        C50643MXf c50643MXf = this.A00;
        ClipsCreationViewModel clipsCreationViewModel = c50643MXf.A0a;
        AbstractC193598he abstractC193598he = (AbstractC193598he) clipsCreationViewModel.A0K.A06.A02();
        C8BP c8bp = c50643MXf.A0Z;
        if (!(abstractC193598he instanceof C8ZT) && !(abstractC193598he instanceof C187398Sh)) {
            audioOverlayTrack = null;
        } else {
            audioOverlayTrack = (AudioOverlayTrack) abstractC193598he.A00();
        }
        c8bp.A0A(audioOverlayTrack, null, true, false);
        clipsCreationViewModel.A0L.A05.Egh(MusicProduct.A06);
        InterfaceC58267PsB interfaceC58267PsB = c50643MXf.A0B;
        if (interfaceC58267PsB != null) {
            interfaceC58267PsB.pause();
        }
    }

    @Override // X.C8R0
    public final void DiM() {
        C50643MXf c50643MXf = this.A00;
        C54671OCx c54671OCx = c50643MXf.A09;
        if (c54671OCx != null) {
            AnonymousClass229.A01(c50643MXf.A0Q).A2A(false, false);
            int i = c54671OCx.A01;
            int i2 = c54671OCx.A00;
            boolean z = c50643MXf.A0X.A04;
            if (c50643MXf.A07 == null) {
                AbstractC12120kG.A07(C50643MXf.__redex_internal_original_name, "textureView is null", null);
            } else {
                AbstractC13880nE.A0q(c50643MXf.A0N, new RunnableC24843Az3(c50643MXf, i, i2, z));
            }
            if (c50643MXf.A0B != null) {
                c50643MXf.A0M.setVisibility(8);
                InterfaceC58267PsB interfaceC58267PsB = c50643MXf.A0B;
                if (interfaceC58267PsB != null) {
                    interfaceC58267PsB.start();
                }
            }
        }
    }

    @Override // X.C8R0
    public final void Djz(int i) {
        C50643MXf c50643MXf = this.A00;
        InterfaceC58267PsB interfaceC58267PsB = c50643MXf.A0B;
        if (interfaceC58267PsB == null) {
            AKk.A02(c50643MXf.A0L, C05F.A0Y, A00(c50643MXf, "Failure user trimming video: startTimeInMs=", AbstractC166987dD.A1C(), i), 2131974293);
            C50643MXf.A0B(c50643MXf, false);
            return;
        }
        interfaceC58267PsB.seekTo(i);
    }

    @Override // X.C8R0
    public final void Dvq(int i) {
        C50643MXf c50643MXf = this.A00;
        if (c50643MXf.A0H) {
            if (c50643MXf.A0B == null) {
                AKk.A02(c50643MXf.A0L, C05F.A0Y, A00(c50643MXf, "Failure user trimming video: endTimeInMs=", AbstractC166987dD.A1C(), i), 2131974293);
                C50643MXf.A0B(c50643MXf, false);
                return;
            }
            c50643MXf.A0I = false;
            c50643MXf.A01 = i;
            c50643MXf.A0d.A01(c50643MXf.A05, i - c50643MXf.A02);
            InterfaceC58267PsB interfaceC58267PsB = c50643MXf.A0B;
            if (interfaceC58267PsB == null) {
                return;
            }
            interfaceC58267PsB.seekTo(i);
        }
    }

    @Override // X.C8R0
    public final void Dvs(int i) {
        C50643MXf c50643MXf = this.A00;
        if (c50643MXf.A0H) {
            if (c50643MXf.A0B == null) {
                AKk.A02(c50643MXf.A0L, C05F.A0Y, A00(c50643MXf, "Failure user trimming video: startTimeInMs=", AbstractC166987dD.A1C(), i), 2131974293);
                C50643MXf.A0B(c50643MXf, false);
                return;
            }
            c50643MXf.A0I = true;
            c50643MXf.A02 = i;
            c50643MXf.A0d.A01(c50643MXf.A05, c50643MXf.A01 - i);
            InterfaceC58267PsB interfaceC58267PsB = c50643MXf.A0B;
            if (interfaceC58267PsB == null) {
                return;
            }
            interfaceC58267PsB.seekTo(i);
        }
    }

    public static String A00(C50643MXf c50643MXf, String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        sb.append(" mSurface=");
        sb.append(c50643MXf.A06);
        sb.append(" mIsShowing= ");
        sb.append(c50643MXf.A0H);
        return sb.toString();
    }
}
