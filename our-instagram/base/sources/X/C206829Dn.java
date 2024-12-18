package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.search.common.analytics.SearchContext;
import com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLoggingController;
import com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLoggingController;
import com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLoggingController;
import go.Seq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.9Dn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206829Dn extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206829Dn(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        String str2;
        EnumC37736GjB enumC37736GjB;
        switch (this.A00) {
            case 0:
                Object obj = (Context) this.A01;
                if (obj instanceof InterfaceC16020qw) {
                    return ((InterfaceC16020qw) obj).BlF();
                }
                return null;
            case 1:
                if (((C7Oi) this.A01).A01) {
                    return new C24200AoN();
                }
                return new Object();
            case 2:
                return new C6JS((UserSession) this.A01);
            case 3:
                C2Nz c2Nz = C2Nz.A01;
                C2O3 A00 = C2O3.A00();
                C2Nz.A00 = A00;
                C14360o3.A0A(A00);
                A00.A00 = -1L;
                A00.A04 = false;
                C2O3 c2o3 = C2Nz.A00;
                C14360o3.A0A(c2o3);
                c2o3.A03((UserSession) this.A01, true);
                return c2Nz;
            case 4:
                return new C2AP((UserSession) this.A01);
            case 5:
                return new C102574jq((AbstractC12990ll) this.A01);
            case 6:
                return new C3N4((AbstractC12990ll) this.A01);
            case 7:
                return new IGFOAMessagingLocalSendSpeedLoggingController((UserSession) this.A01);
            case 8:
                return new IGFOAMessagingReadyLoggingController((UserSession) this.A01);
            case 9:
                return new IGFOAMessagingSendToSentLoggingController((UserSession) this.A01);
            case 10:
                return new C124245je((UserSession) this.A01);
            case 11:
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, (AbstractC12990ll) this.A01, 36322216299735096L));
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return ((InterfaceC018407e) ((C7VI) this.A01).A00.A02.invoke()).getViewModelStore();
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new C37922GmJ(this.A01, 5);
            case 14:
                return new C62832tM((UserSession) this.A01);
            case Process.SIGTERM /* 15 */:
                C59952od c59952od = (C59952od) this.A01;
                UserSession A01 = C59952od.A01(c59952od);
                ClipsViewerConfig A002 = C59952od.A00(c59952od);
                String str3 = C59952od.A00(c59952od).A1I;
                List list = C37531Gfn.A01;
                return new C37522Gfe(new C37531Gfn(C59952od.A01(c59952od)), A002, A01, AbstractC111324zv.A00(3536), str3);
            case 16:
                C59952od c59952od2 = (C59952od) this.A01;
                return new BKB(c59952od2.requireActivity(), C59952od.A01(c59952od2), (C37522Gfe) c59952od2.A0m.getValue(), new C57515Pfp(c59952od2, 49));
            case 17:
                C59952od c59952od3 = (C59952od) this.A01;
                return new C1810881k(c59952od3.requireActivity(), C59952od.A01(c59952od3), false, false);
            case 18:
                return AnonymousClass229.A01(C59952od.A01((C59952od) this.A01));
            case Process.SIGSTOP /* 19 */:
                return AbstractC183338Bg.A00(C59952od.A01((C59952od) this.A01));
            case 20:
                return AbstractC226999zv.A00(C59952od.A01((C59952od) this.A01));
            case 21:
                C59952od c59952od4 = (C59952od) this.A01;
                UserSession A012 = C59952od.A01(c59952od4);
                C06090Tz c06090Tz = C06090Tz.A05;
                boolean A06 = C18U.A06(c06090Tz, A012, 36325716698084660L);
                UserSession A013 = C59952od.A01(c59952od4);
                if (A06) {
                    return new C37886Glg(C59952od.A00(c59952od4).A0J, A013, C59952od.A00(c59952od4).A1Y);
                }
                boolean A062 = C18U.A06(c06090Tz, A013, 36325716698150197L);
                UserSession A014 = C59952od.A01(c59952od4);
                ClipsViewerSource clipsViewerSource = C59952od.A00(c59952od4).A0J;
                boolean z = C59952od.A00(c59952od4).A1Y;
                if (A062) {
                    C14360o3.A0B(A014, 1);
                    C14360o3.A0B(clipsViewerSource, 2);
                    return new C37525Gfh(clipsViewerSource, A014, z);
                }
                return new C37525Gfh(clipsViewerSource, A014, z);
            case 22:
                return new C37521Gfd(this.A01, 0);
            case 23:
                C59952od c59952od5 = (C59952od) this.A01;
                UserSession A015 = C59952od.A01(c59952od5);
                C14360o3.A0B(A015, 0);
                C06090Tz c06090Tz2 = C06090Tz.A06;
                if (!C18U.A06(c06090Tz2, A015, 36319209827474520L)) {
                    UserSession A016 = C59952od.A01(c59952od5);
                    C14360o3.A0B(A016, 0);
                    if (!C18U.A06(c06090Tz2, A016, 36319209827343447L)) {
                        return null;
                    }
                }
                FragmentActivity requireActivity = c59952od5.requireActivity();
                UserSession A017 = C59952od.A01(c59952od5);
                UserSession A018 = C59952od.A01(c59952od5);
                C14360o3.A0B(A018, 0);
                return new C64052vQ(requireActivity, A017, C18U.A01(c06090Tz2, A018, 36600684804116457L));
            case 24:
                return new C37521Gfd(this.A01, 1);
            case 25:
                C59952od c59952od6 = (C59952od) this.A01;
                return new C41115IIg(C59952od.A01(c59952od6), C59952od.A00(c59952od6).A1I);
            case 26:
                return AbstractC37654Ghn.A01(C59952od.A01((C59952od) this.A01));
            case 27:
                C59952od c59952od7 = (C59952od) this.A01;
                FragmentActivity activity = c59952od7.getActivity();
                if (activity != null) {
                    return new BKP(activity, c59952od7, C59952od.A01(c59952od7), (C37522Gfe) c59952od7.A0m.getValue());
                }
                throw new IllegalStateException("Required value was null.");
            case 28:
                C59952od c59952od8 = (C59952od) this.A01;
                C37522Gfe c37522Gfe = (C37522Gfe) c59952od8.A0m.getValue();
                UserSession A019 = C59952od.A01(c59952od8);
                ClipsViewerConfig A003 = C59952od.A00(c59952od8);
                C37540Gfw c37540Gfw = c59952od8.A09;
                str = "clipsViewerFragmentViewModel";
                if (c37540Gfw != null) {
                    C37671Gi4 c37671Gi4 = c37540Gfw.A1H;
                    C37604Ggz c37604Ggz = c37540Gfw.A1D;
                    IG5 ig5 = c37540Gfw.A1E;
                    C37542Gfy c37542Gfy = (C37542Gfy) c59952od8.A12.getValue();
                    C37540Gfw c37540Gfw2 = c59952od8.A09;
                    if (c37540Gfw2 != null) {
                        final BK9 bk9 = new BK9(c37540Gfw2.A0S, A003, A019, c37540Gfw2.A0c, c37604Ggz, (C26914BuH) c59952od8.A15.getValue(), c37542Gfy, c37522Gfe, ig5, c37671Gi4);
                        return new AbstractC61132qb(bk9) { // from class: X.9I6
                            public final BK9 A00;

                            @Override // X.AbstractC61132qb
                            public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
                                return new C25359BKc(this.A00);
                            }

                            {
                                this.A00 = bk9;
                            }
                        };
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                C59952od c59952od9 = (C59952od) this.A01;
                UserSession A0110 = C59952od.A01(c59952od9);
                C37540Gfw c37540Gfw3 = c59952od9.A09;
                str2 = "clipsViewerFragmentViewModel";
                if (c37540Gfw3 != null) {
                    C37522Gfe c37522Gfe2 = c37540Gfw3.A19;
                    FragmentActivity requireActivity2 = c59952od9.requireActivity();
                    C37540Gfw c37540Gfw4 = c59952od9.A09;
                    if (c37540Gfw4 != null) {
                        return new C31414DrJ(requireActivity2, c59952od9, A0110, c37522Gfe2, c37540Gfw4.A15);
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 30:
                C59952od c59952od10 = (C59952od) this.A01;
                UserSession A0111 = C59952od.A01(c59952od10);
                C37540Gfw c37540Gfw5 = c59952od10.A09;
                str2 = "clipsViewerFragmentViewModel";
                if (c37540Gfw5 != null) {
                    C37522Gfe c37522Gfe3 = c37540Gfw5.A19;
                    SearchContext searchContext = C59952od.A00(c59952od10).A0S;
                    C37540Gfw c37540Gfw6 = c59952od10.A09;
                    if (c37540Gfw6 != null) {
                        C37604Ggz c37604Ggz2 = c37540Gfw6.A1D;
                        C37671Gi4 c37671Gi42 = ((C41115IIg) c59952od10.A0x.getValue()).A02;
                        C37540Gfw c37540Gfw7 = c59952od10.A09;
                        if (c37540Gfw7 != null) {
                            return new C37542Gfy(c37540Gfw7.A0S, A0111, c37522Gfe3, c37540Gfw7.A0c, searchContext, c37604Ggz2, c37540Gfw7.A1E, c37671Gi42);
                        }
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            case 31:
                C59952od c59952od11 = (C59952od) this.A01;
                UserSession A0112 = C59952od.A01(c59952od11);
                ClipsViewerSource clipsViewerSource2 = C59952od.A00(c59952od11).A0J;
                C14360o3.A0B(A0112, 0);
                C14360o3.A0B(clipsViewerSource2, 1);
                if (clipsViewerSource2 == ClipsViewerSource.A0I || (clipsViewerSource2 == ClipsViewerSource.A1W && AbstractC37827Gkh.A00(A0112))) {
                    enumC37736GjB = EnumC37736GjB.A09;
                } else if (clipsViewerSource2 != ClipsViewerSource.A0T && clipsViewerSource2 != ClipsViewerSource.A0U) {
                    if (clipsViewerSource2 == ClipsViewerSource.A0M) {
                        enumC37736GjB = EnumC37736GjB.A0C;
                    } else if (clipsViewerSource2 == ClipsViewerSource.A0K) {
                        enumC37736GjB = EnumC37736GjB.A0A;
                    } else {
                        if (clipsViewerSource2 == ClipsViewerSource.A0g) {
                            ArrayList A1N = AbstractC16960so.A1N(EnumC37736GjB.A08);
                            if (AbstractC37827Gkh.A00(A0112)) {
                                A1N.add(EnumC37736GjB.A09);
                            }
                            C06090Tz c06090Tz3 = C06090Tz.A05;
                            if (C18U.A06(c06090Tz3, A0112, 36318836160797216L)) {
                                A1N.add(EnumC37736GjB.A0B);
                            }
                            if (C18U.A06(c06090Tz3, A0112, 36320618574914291L) || C18U.A06(c06090Tz3, A0112, 36320618574324460L)) {
                                A1N.add(EnumC37736GjB.A0C);
                            }
                            if (C18U.A06(c06090Tz3, A0112, 36318836161387049L)) {
                                A1N.add(EnumC37736GjB.A0A);
                            }
                            if (C18U.A06(c06090Tz3, A0112, 36318836160928290L)) {
                                A1N.add(EnumC37736GjB.A0D);
                            }
                            if (C18U.A06(c06090Tz3, A0112, 36318836160993827L)) {
                                A1N.add(EnumC37736GjB.A0E);
                            }
                            if (C18U.A06(c06090Tz3, A0112, 36318836161583659L)) {
                                A1N.add(EnumC37736GjB.A0G);
                            }
                            if (!C18U.A06(c06090Tz3, A0112, 36318836161649196L)) {
                                return A1N;
                            }
                            A1N.add(EnumC37736GjB.A0F);
                            return A1N;
                        }
                        if (clipsViewerSource2 == ClipsViewerSource.A1q) {
                            enumC37736GjB = EnumC37736GjB.A0D;
                        } else if (clipsViewerSource2 == ClipsViewerSource.A2S) {
                            enumC37736GjB = EnumC37736GjB.A0E;
                        } else if (clipsViewerSource2 == ClipsViewerSource.A07) {
                            enumC37736GjB = EnumC37736GjB.A07;
                        } else {
                            enumC37736GjB = EnumC37736GjB.A08;
                        }
                    }
                } else {
                    enumC37736GjB = EnumC37736GjB.A0B;
                }
                List singletonList = Collections.singletonList(enumC37736GjB);
                C14360o3.A07(singletonList);
                return singletonList;
            case 32:
                C59952od c59952od12 = (C59952od) this.A01;
                return new BKY(C59952od.A01(c59952od12), C59952od.A00(c59952od12).A00);
            case 33:
                C59952od c59952od13 = (C59952od) this.A01;
                UserSession A0113 = C59952od.A01(c59952od13);
                C14360o3.A0B(A0113, 0);
                C06090Tz c06090Tz4 = C06090Tz.A05;
                if (C18U.A06(c06090Tz4, A0113, 36325343035929608L) || C18U.A06(c06090Tz4, A0113, 36325343035995145L)) {
                    return new C26914BuH(C59952od.A01(c59952od13));
                }
                return null;
            case 34:
                C59952od c59952od14 = (C59952od) this.A01;
                FragmentActivity requireActivity3 = c59952od14.requireActivity();
                UserSession A0114 = C59952od.A01(c59952od14);
                C37540Gfw c37540Gfw8 = c59952od14.A09;
                if (c37540Gfw8 != null) {
                    return new BKE(requireActivity3, A0114, c37540Gfw8.A19);
                }
                str = "clipsViewerFragmentViewModel";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 35:
                C59952od c59952od15 = (C59952od) this.A01;
                UserSession A0115 = C59952od.A01(c59952od15);
                IN9 in9 = c59952od15.A0J;
                if (in9 == null) {
                    str = "overlayFragmentController";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                return new C31411DrG(A0115, in9);
            case 36:
                C59952od c59952od16 = (C59952od) this.A01;
                Context requireContext = c59952od16.requireContext();
                FragmentActivity activity2 = c59952od16.getActivity();
                if (activity2 != null) {
                    return new C41704IdY(requireContext, activity2, c59952od16, C59952od.A01(c59952od16));
                }
                throw new IllegalStateException("Required value was null.");
            case 37:
                C59952od c59952od17 = (C59952od) this.A01;
                UserSession A0116 = C59952od.A01(c59952od17);
                FragmentActivity requireActivity4 = c59952od17.requireActivity();
                C37540Gfw c37540Gfw9 = c59952od17.A09;
                if (c37540Gfw9 == null) {
                    C14360o3.A0F("clipsViewerFragmentViewModel");
                    throw C00O.createAndThrow();
                }
                return new BKD(requireActivity4, A0116, c37540Gfw9.A0c, c37540Gfw9.A1H, new DRR(c59952od17, 10), new DRR(c59952od17, 11));
            case 38:
                C59952od c59952od18 = (C59952od) this.A01;
                return new C37614Gh9(c59952od18, (C37522Gfe) c59952od18.A0m.getValue(), C59952od.A01(c59952od18));
            case 39:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return this.A01;
            case 40:
            case 43:
                return ((InterfaceC16820sZ) this.A01).invoke();
            case Seq.NULL_REFNUM /* 41 */:
            case 44:
            default:
                return ((InterfaceC018407e) ((InterfaceC09390do) this.A01).getValue()).getViewModelStore();
            case 45:
                C3DN A004 = C3DN.A00.A00(((Fragment) this.A01).requireActivity());
                boolean z2 = true;
                if (A004 == null || !((C3DP) A004).A0h) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C37540Gfw c37540Gfw10 = ((C59952od) this.A01).A09;
                if (c37540Gfw10 != null) {
                    return c37540Gfw10.A0u;
                }
                str = "clipsViewerFragmentViewModel";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 47:
                C37546Gg2 c37546Gg2 = ((C59952od) this.A01).A0C;
                if (c37546Gg2 != null) {
                    return c37546Gg2;
                }
                str = "viewerAdapter";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 48:
                C37540Gfw c37540Gfw11 = ((C59952od) this.A01).A09;
                if (c37540Gfw11 != null) {
                    C37540Gfw.A05(c37540Gfw11, C16930sl.A00, false, false);
                    return C0eB.A00;
                }
                str = "clipsViewerFragmentViewModel";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 49:
                C59952od c59952od19 = (C59952od) this.A01;
                UserSession A0117 = C59952od.A01(c59952od19);
                ClipsViewerConfig A005 = C59952od.A00(c59952od19);
                C37556GgC c37556GgC = c59952od19.A0N;
                if (c37556GgC == null) {
                    str = "clipsViewerViewPager";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                C37546Gg2 c37546Gg22 = c59952od19.A0C;
                if (c37546Gg22 != null) {
                    C37540Gfw c37540Gfw12 = c59952od19.A09;
                    if (c37540Gfw12 != null) {
                        return new C37819GkZ(A005, A0117, c37546Gg22, c37540Gfw12.A1A, c37556GgC);
                    }
                    str = "clipsViewerFragmentViewModel";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                str = "viewerAdapter";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
        }
    }
}
