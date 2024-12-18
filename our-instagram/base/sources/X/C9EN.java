package X;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import instagram.features.feed.fragment.ContextualFeedFragment;

/* renamed from: X.9EN, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9EN extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9EN(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        switch (this.A00) {
            case 0:
                C59952od c59952od = (C59952od) this.A01;
                UserSession A01 = C59952od.A01(c59952od);
                ClipsViewerConfig A00 = C59952od.A00(c59952od);
                C37556GgC c37556GgC = c59952od.A0N;
                if (c37556GgC != null) {
                    C37546Gg2 c37546Gg2 = c59952od.A0C;
                    if (c37546Gg2 == null) {
                        str = "viewerAdapter";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    C37540Gfw c37540Gfw = c59952od.A09;
                    if (c37540Gfw != null) {
                        return new C37819GkZ(A00, A01, c37546Gg2, c37540Gfw.A1A, c37556GgC);
                    }
                    str = "clipsViewerFragmentViewModel";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                str = "clipsViewerViewPager";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 1:
                C37556GgC c37556GgC2 = ((C59952od) this.A01).A0N;
                if (c37556GgC2 != null) {
                    return c37556GgC2;
                }
                str = "clipsViewerViewPager";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 2:
                C62862tP c62862tP = ((C59952od) this.A01).A02;
                if (c62862tP != null) {
                    return c62862tP;
                }
                str = "bloksHost";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 3:
                C37559GgF c37559GgF = ((C59952od) this.A01).A0G;
                if (c37559GgF != null) {
                    return c37559GgF;
                }
                str = "endSceneController";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 4:
                C37563GgJ c37563GgJ = ((C59952od) this.A01).A08;
                if (c37563GgJ != null) {
                    return c37563GgJ;
                }
                str = "videoControllerDelegate";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 5:
                C37562GgI c37562GgI = ((C59952od) this.A01).A0E;
                if (c37562GgI != null) {
                    return c37562GgI;
                }
                str = "clipsAutoScrollController";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 6:
                C59952od c59952od2 = (C59952od) this.A01;
                Application application = c59952od2.requireActivity().getApplication();
                C14360o3.A07(application);
                UserSession A012 = C59952od.A01(c59952od2);
                C37540Gfw c37540Gfw2 = c59952od2.A09;
                if (c37540Gfw2 != null) {
                    return new C37544Gg0(application, AbstractC018607g.A00(c59952od2), A012, c37540Gfw2.A19, C41711wL.A01(C59952od.A01(c59952od2)).A09());
                }
                str = "clipsViewerFragmentViewModel";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 7:
                C59952od c59952od3 = (C59952od) this.A01;
                UserSession A013 = C59952od.A01(c59952od3);
                C37540Gfw c37540Gfw3 = c59952od3.A09;
                if (c37540Gfw3 != null) {
                    return new C37545Gg1(A013, c37540Gfw3.A19, C41711wL.A01(C59952od.A01(c59952od3)).A09());
                }
                str = "clipsViewerFragmentViewModel";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 8:
                return ((MVJ) ((C25359BKc) ((C59952od) this.A01).A10.getValue()).A00.A0D.getValue()).A00;
            case 9:
                return new MVG(C59952od.A01((C59952od) this.A01));
            case 10:
                C59952od c59952od4 = (C59952od) this.A01;
                Context requireContext = c59952od4.requireContext();
                FragmentActivity requireActivity = c59952od4.requireActivity();
                UserSession A014 = C59952od.A01(c59952od4);
                C37522Gfe c37522Gfe = (C37522Gfe) c59952od4.A0m.getValue();
                C37540Gfw c37540Gfw4 = c59952od4.A09;
                str = "clipsViewerFragmentViewModel";
                if (c37540Gfw4 != null) {
                    C37671Gi4 c37671Gi4 = c37540Gfw4.A1H;
                    ClipsViewerSource clipsViewerSource = C59952od.A00(c59952od4).A0J;
                    String str2 = C59952od.A00(c59952od4).A1G;
                    C37540Gfw c37540Gfw5 = c59952od4.A09;
                    if (c37540Gfw5 != null) {
                        return new BKA(requireContext, requireActivity, c59952od4, clipsViewerSource, A014, c37522Gfe, c37540Gfw5.A1E, c37671Gi4, str2, new C30506Dbp(c59952od4, 29), new C30519Dc2(c59952od4, 18));
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 11:
                C59952od c59952od5 = (C59952od) this.A01;
                String str3 = C59952od.A00(c59952od5).A02;
                if (str3 != null) {
                    return str3;
                }
                return AbstractC61112qZ.A00(c59952od5.requireArguments());
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 47:
                return ((Fragment) this.A01).requireActivity().getViewModelStore();
            case 14:
            case 17:
            case 30:
            case 36:
            default:
                return this.A01;
            case Process.SIGTERM /* 15 */:
            case 18:
            case 31:
            case 37:
                return ((InterfaceC16820sZ) this.A01).invoke();
            case 16:
            case Process.SIGSTOP /* 19 */:
            case 32:
            case 38:
                return ((InterfaceC018407e) ((InterfaceC09390do) this.A01).getValue()).getViewModelStore();
            case 20:
                C59952od c59952od6 = (C59952od) this.A01;
                return new C31413DrI(C59952od.A01(c59952od6), c59952od6.requireActivity());
            case 21:
                C59952od c59952od7 = (C59952od) this.A01;
                return new C37543Gfz(C59952od.A00(c59952od7).A0J, C59952od.A01(c59952od7));
            case 22:
                C59952od c59952od8 = (C59952od) this.A01;
                UserSession A015 = C59952od.A01(c59952od8);
                C37540Gfw c37540Gfw6 = c59952od8.A09;
                if (c37540Gfw6 != null) {
                    return new BKF(c59952od8, A015, c37540Gfw6.A19);
                }
                str = "clipsViewerFragmentViewModel";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 23:
                return C1337362e.A01((C1337362e) this.A01);
            case 24:
                return Boolean.valueOf(C18U.A06(C06090Tz.A05, ((C1337362e) this.A01).A0N, 36326056000894555L));
            case 25:
                return new C110024xW((UserSession) this.A01);
            case 26:
                return new C5RA((UserSession) this.A01);
            case 27:
                UserSession A002 = ContextualFeedFragment.A00((ContextualFeedFragment) this.A01);
                C14360o3.A0B(A002, 0);
                int A016 = (int) C18U.A01(C06090Tz.A05, A002, 36606148002190716L);
                if (A016 <= -1) {
                    A016 = 3;
                }
                return Integer.valueOf(A016);
            case 28:
                return new C61122qa(ContextualFeedFragment.A00((ContextualFeedFragment) this.A01));
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return AbstractC153636vY.A01(((Fragment) this.A01).requireArguments(), AbstractC111324zv.A00(3547));
            case 33:
                return new C61122qa(C38J.A01((C38J) this.A01));
            case 34:
                C38J c38j = (C38J) this.A01;
                return C39E.A00(c38j.requireActivity(), c38j, C38J.A01(c38j));
            case 35:
                return C38J.A01((C38J) this.A01);
            case 39:
                Bundle bundle = ((Fragment) this.A01).mArguments;
                if (bundle != null) {
                    return bundle.getString(AbstractC111324zv.A00(2126));
                }
                return null;
            case 40:
                return ((C64452w4) this.A01).A02.A0A().A0n().A09;
            case Seq.NULL_REFNUM /* 41 */:
                InterfaceC16820sZ interfaceC16820sZ = ((C61842rl) this.A01).A0L;
                if (interfaceC16820sZ != null) {
                    interfaceC16820sZ.invoke();
                }
                return C0eB.A00;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new C61122qa(((C60662pp) this.A01).getSession());
            case 43:
                return new C674932o(((C60662pp) this.A01).getSession());
            case 44:
                UserSession session = ((C60662pp) this.A01).getSession();
                C14360o3.A0B(session, 0);
                if (C18U.A06(C06090Tz.A05, session, 36327065318406422L)) {
                    return session.A01(C3H9.class, new C9EG(session, 6));
                }
                return null;
            case 45:
                final UserSession session2 = ((C60662pp) this.A01).getSession();
                return new AbstractC61132qb(session2) { // from class: X.2qi
                    public final UserSession A00;

                    {
                        C14360o3.A0B(session2, 1);
                        this.A00 = session2;
                    }

                    @Override // X.AbstractC61132qb
                    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
                        return new C60822q6(this.A00);
                    }
                };
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C60662pp c60662pp = (C60662pp) this.A01;
                c60662pp.A0A().A1y.F9f(c60662pp.A0j);
                return C0eB.A00;
            case 48:
                return ((Fragment) this.A01).requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
