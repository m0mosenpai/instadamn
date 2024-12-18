package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.Am2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24065Am2 implements InterfaceC57997Pnh {
    public final /* synthetic */ C8JN A00;

    public C24065Am2(C8JN c8jn) {
        this.A00 = c8jn;
    }

    @Override // X.InterfaceC57997Pnh
    public final void Dd6(C54845OMq c54845OMq) {
        Long l;
        AbstractC53637Nni abstractC53637Nni;
        EnumC50631MWs enumC50631MWs;
        EnumC53335Nil enumC53335Nil;
        int A0I;
        N13 n13;
        N10 n10;
        C14360o3.A0B(c54845OMq, 0);
        MXK mxk = MXK.A0C;
        if (AbstractC166997dE.A1Z(mxk.A00(), true)) {
            C8JN c8jn = this.A00;
            if (!C14360o3.A0K(c8jn.A02, mxk.A05())) {
                UserSession userSession = c8jn.A08;
                boolean A03 = c8jn.A03();
                boolean A0Y = c8jn.A09.A0Y();
                AbstractC55198Oe5 abstractC55198Oe5 = c54845OMq.A09;
                EnumC53367NjI enumC53367NjI = null;
                if (abstractC55198Oe5 != null) {
                    l = ((N10) abstractC55198Oe5).A05.A01();
                } else {
                    l = null;
                }
                AbstractC55198Oe5 abstractC55198Oe52 = c54845OMq.A09;
                if ((abstractC55198Oe52 instanceof N10) && (n10 = (N10) abstractC55198Oe52) != null) {
                    abstractC53637Nni = n10.A05;
                } else {
                    abstractC53637Nni = null;
                }
                if ((abstractC53637Nni instanceof N13) && (n13 = (N13) abstractC53637Nni) != null) {
                    enumC53367NjI = n13.A03();
                }
                String A05 = mxk.A05();
                if (A0Y) {
                    enumC50631MWs = EnumC50631MWs.A0M;
                } else {
                    enumC50631MWs = EnumC50631MWs.A0J;
                }
                C448524p c448524p = AnonymousClass229.A01(userSession).A0D;
                String str = AbstractC53606NnD.A01;
                EnumC53334Nik enumC53334Nik = null;
                if (str != null) {
                    enumC53335Nil = OXp.A01(str);
                } else {
                    enumC53335Nil = null;
                }
                String str2 = AbstractC53606NnD.A03;
                if (str2 != null) {
                    enumC53334Nik = OXp.A00(str2);
                }
                String str3 = AbstractC53606NnD.A02;
                String str4 = AbstractC53606NnD.A00;
                C22M c22m = c448524p.A04;
                if (c22m.A0L != null) {
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c448524p.A01, "ig_camera_start_session");
                    if (A0f.isSampled()) {
                        if (A03) {
                            A0I = 4;
                        } else {
                            A0I = AbstractC167017dG.A0I(c22m);
                        }
                        A0f.AAP("entity", "SMART_GLASSES");
                        A0f.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                        AbstractC166997dE.A1N(A0f, "camera_position", A0I);
                        A0f.A8R(EnumC114925Hg.STORY, "camera_destination");
                        A0f.A8R(enumC50631MWs, "surface");
                        String str5 = c22m.A0L;
                        if (str5 == null) {
                            str5 = "";
                        }
                        AbstractC166987dD.A1S(A0f, str5);
                        A0f.A8R(enumC53335Nil, "device_type");
                        A0f.A8R(enumC53334Nik, "device_build_type");
                        A0f.AAP("soc_version", str3);
                        A0f.AAP("build_flavor", str4);
                        A0f.A9K("battery_level_pct", l);
                        A0f.A8R(enumC53367NjI, MSV.A00(592));
                        AbstractC167027dH.A0u(A0f, MSV.A00(454), A05);
                    }
                }
                c8jn.A02 = mxk.A05();
            }
        }
    }
}
