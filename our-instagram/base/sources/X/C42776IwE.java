package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.util.Collections;
import java.util.List;

/* renamed from: X.IwE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42776IwE implements InterfaceC71989XEc {
    public II4 A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;
    public final InterfaceC60442pS A03;
    public final C34709FQu A04;
    public final ReelDashboardFragment A05;
    public final InterfaceC63982vJ A06;
    public final C38E A07;
    public final GIS A08;
    public final ReelDashboardFragment A09;
    public final String A0A;

    @Override // X.InterfaceC71989XEc
    public final void Cw7(C69141ViW c69141ViW) {
        C140966Yy A0r;
        Fragment CsU;
        C41181vS A0G;
        List BlY;
        C1NB c1nb = c69141ViW.A02.A0W;
        c1nb.getClass();
        int intValue = c1nb.BWG().intValue();
        if (intValue != 2) {
            if (intValue != 3) {
                if (intValue == 5 && (A0G = this.A05.A0G()) != null && (BlY = A0G.BlY(EnumC75383a5.A0y)) != null && !BlY.isEmpty()) {
                    C84823qW c84823qW = (C84823qW) AbstractC166987dD.A16(BlY);
                    C42130Ile A0L = C1XJ.A00.A0L(this.A01.requireActivity(), this.A02, this.A03, c84823qW.A0H(), AbstractC111324zv.A00(2963), null);
                    A0L.A02(A0G.A0b, null);
                    A0L.A06 = c84823qW;
                    C42130Ile.A01(A0L);
                    return;
                }
                return;
            }
            String id = c1nb.getId();
            FragmentActivity requireActivity = this.A01.requireActivity();
            UserSession userSession = this.A02;
            A0r = AbstractC25225BEi.A0r(requireActivity, userSession);
            CsU = WE2.A02(userSession, AbstractC1120253r.A00(id), this.A03.getModuleName(), "DEFAULT");
        } else {
            String id2 = c1nb.getId();
            A0r = AbstractC25225BEi.A0r(this.A01.requireActivity(), this.A02);
            C1VW c1vw = C1VW.A00;
            c1vw.getClass();
            CsU = c1vw.getFragmentFactory().CsU(id2);
        }
        A0r.A0E(CsU);
        A0r.A04();
    }

    @Override // X.InterfaceC71989XEc
    public final void Czl(C38266GsB c38266GsB) {
        this.A08.A01(c38266GsB);
    }

    @Override // X.InterfaceC71989XEc
    public final void D4K(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        AbstractC59962oe abstractC59962oe = this.A01;
        AbstractC10360h2 abstractC10360h2 = abstractC59962oe.mFragmentManager;
        FragmentActivity activity = abstractC59962oe.getActivity();
        if (C06P.A01(abstractC10360h2) && activity != null) {
            List singletonList = Collections.singletonList(reel);
            C38E c38e = this.A07;
            c38e.A0C = this.A0A;
            c38e.A05 = new C31559Dtj(abstractC59962oe.getActivity(), gradientSpinnerAvatarView.getAvatarBounds(), this.A06);
            c38e.A0A(reel, C3G2.A1g, gradientSpinnerAvatarView, singletonList, singletonList, singletonList);
        }
    }

    @Override // X.InterfaceC71989XEc
    public final void DAN(C38266GsB c38266GsB, C41181vS c41181vS, User user, boolean z) {
        EnumC75383a5 enumC75383a5;
        String str;
        int i;
        String str2;
        int i2;
        AbstractC59962oe abstractC59962oe = this.A01;
        Context context = abstractC59962oe.getContext();
        C3DN A01 = C3DN.A00.A01(context);
        if (context != null && A01 != null) {
            boolean z2 = c38266GsB.A0B;
            C28501Zl c28501Zl = C28531Zo.A04.A02;
            UserSession userSession = this.A02;
            C34725FRo A06 = c28501Zl.A06(this.A03, userSession, "reel_dashboard_viewer");
            A06.A03(c41181vS.A0k);
            A06.A04(c41181vS.A0j);
            Bundle bundle = A06.A01;
            bundle.putBoolean("DirectReplyModalFragment.is_archive_reel", z);
            A06.A06(user.getId());
            A06.A01(AbstractC111324zv.A00(1282));
            bundle.putBoolean(AbstractC111324zv.A00(1579), z2);
            String str3 = c38266GsB.A09;
            if (str3 != null) {
                bundle.putString(AbstractC111324zv.A00(1584), str3);
                A06.A05(c38266GsB.A09);
            } else {
                XFR xfr = c38266GsB.A01;
                if (xfr != null) {
                    str2 = ((H5N) xfr).A00;
                    C14360o3.A0B(str2, 0);
                    i2 = 613;
                } else {
                    C31200Dnj c31200Dnj = c38266GsB.A00;
                    if (c31200Dnj != null) {
                        str2 = c31200Dnj.A00;
                        C14360o3.A0B(str2, 0);
                        i2 = 615;
                    } else if ((c38266GsB.A07 != null || c38266GsB.A04 != null || c38266GsB.A03 != null) && C18U.A06(C06090Tz.A05, userSession, 36314794596240187L)) {
                        String str4 = c38266GsB.A07;
                        if (str4 != null) {
                            enumC75383a5 = EnumC75383a5.A16;
                        } else if (c38266GsB.A04 != null) {
                            enumC75383a5 = EnumC75383a5.A0x;
                        } else if (c38266GsB.A03 != null) {
                            enumC75383a5 = EnumC75383a5.A1C;
                        }
                        int ordinal = enumC75383a5.ordinal();
                        if (ordinal != 29) {
                            if (ordinal != 42) {
                                if (ordinal == 45) {
                                    Float f = c38266GsB.A03;
                                    f.getClass();
                                    bundle.putFloat(AbstractC111324zv.A00(1583), f.floatValue());
                                    A06.A05(abstractC59962oe.getString(2131974203));
                                    String str5 = c38266GsB.A0A;
                                    str5.getClass();
                                    A06.A07(str5, enumC75383a5.A00);
                                    i = 1307;
                                }
                            } else {
                                str4.getClass();
                                bundle.putString(AbstractC111324zv.A00(1582), str4);
                                A06.A05(AbstractC31174DnI.A0w(abstractC59962oe, c38266GsB.A07, 2131971431));
                                String str6 = c38266GsB.A08;
                                str6.getClass();
                                A06.A07(str6, enumC75383a5.A00);
                                i = 1302;
                            }
                        } else {
                            C41181vS c41181vS2 = c38266GsB.A0K;
                            c41181vS2.getClass();
                            C101394gx A00 = AbstractC140306Wi.A00(c41181vS2);
                            A00.getClass();
                            List A012 = AbstractC37865GlK.A01(A00);
                            Integer num = c38266GsB.A04;
                            num.getClass();
                            String text = ((InterfaceC101384gv) A012.get(num.intValue())).getText();
                            if (text == null) {
                                str = "";
                            } else {
                                str = text;
                            }
                            bundle.putString(AbstractC111324zv.A00(1580), str);
                            A06.A05(AbstractC31174DnI.A0w(abstractC59962oe, text, 2131969732));
                            String str7 = c38266GsB.A06;
                            str7.getClass();
                            A06.A07(str7, enumC75383a5.A00);
                            i = 3163;
                        }
                        A06.A01(AbstractC111324zv.A00(i));
                    }
                }
                bundle.putString(AbstractC111324zv.A00(i2), str2);
            }
            C38321qM c38321qM = c41181vS.A0b;
            if (c38321qM != null) {
                A06.A00 = new C34567FLb(c38321qM, user, this);
            }
            A01.A0J(A06.A00());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d4, code lost:
    
        if (r8 != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c5  */
    @Override // X.InterfaceC71989XEc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DTP(X.C38266GsB r14, X.C41181vS r15, com.instagram.user.model.User r16) {
        /*
            r13 = this;
            com.instagram.common.session.UserSession r12 = r13.A02
            X.2Fl r0 = X.C47382Fl.A00(r12)
            java.lang.Integer r1 = r0.A01()
            java.lang.Integer r0 = X.C05F.A0C
            boolean r0 = r1.equals(r0)
            r8 = 1
            r3 = r16
            if (r0 == 0) goto L34
            X.17P r0 = r3.A03
            java.lang.Boolean r0 = r0.BBx()
            if (r0 == 0) goto L34
            X.17P r0 = r3.A03
            java.lang.Boolean r0 = r0.BBx()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L34
            java.lang.String r0 = r3.getFullName()
            r3.A0s(r0)
            r13.DAN(r14, r15, r3, r8)
        L33:
            return
        L34:
            X.2oe r0 = r13.A01
            android.content.Context r5 = r0.getContext()
            X.8lv r1 = X.C196068lw.A00(r12)
            java.lang.String r0 = "DefaultReelDashboardViewersDelegateImpl"
            com.facebook.common.callercontext.CallerContext r0 = com.facebook.common.callercontext.CallerContext.A01(r0)
            X.5xZ r0 = r1.A00(r0)
            java.lang.String r11 = r0.A03
            if (r5 == 0) goto L33
            X.8aR r4 = X.AbstractC31175DnJ.A0N(r12)
            X.Dnj r0 = r14.A00
            boolean r7 = X.AbstractC167007dF.A1W(r0)
            java.lang.String r0 = r14.A09
            boolean r6 = X.AbstractC167007dF.A1W(r0)
            X.XFR r0 = r14.A01
            if (r0 != 0) goto L61
            r8 = 0
        L61:
            java.lang.String r1 = r3.B8y()
            r2 = 0
            if (r7 == 0) goto Lc7
            if (r6 == 0) goto Ld6
            r0 = 2131959950(0x7f13208e, float:1.9556555E38)
            java.lang.String r8 = X.AbstractC167007dF.A0f(r5, r1, r0)
            X.C14360o3.A0A(r8)
        L74:
            java.lang.String r10 = r3.getId()
            java.lang.String r9 = r3.B8y()
            com.instagram.common.typedurl.ImageUrl r7 = r3.Bhu()
            X.Dnj r1 = r14.A00
            java.lang.String r6 = r14.A09
            X.C14360o3.A0B(r12, r2)
            X.HBr r3 = new X.HBr
            r3.<init>()
            android.os.Bundle r2 = X.AbstractC166987dD.A0b()
            X.AbstractC03240Dh.A00(r2, r12)
            java.lang.String r0 = "args_media_owner_obid"
            r2.putString(r0, r11)
            r0 = 736(0x2e0, float:1.031E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r2.putString(r0, r10)
            java.lang.String r0 = "args_media_viewer_namme"
            r2.putString(r0, r9)
            java.lang.String r0 = "args_profile_pic_url"
            r2.putParcelable(r0, r7)
            java.lang.String r0 = "args_bottomsheet_title"
            r2.putString(r0, r8)
            if (r1 == 0) goto Lc5
            java.lang.String r1 = r1.A00
        Lb4:
            java.lang.String r0 = "args_emoji_unicode"
            r2.putString(r0, r1)
            java.lang.String r0 = "args_reply_text"
            r2.putString(r0, r6)
            r3.setArguments(r2)
            r4.A03(r5, r3)
            return
        Lc5:
            r1 = 0
            goto Lb4
        Lc7:
            if (r6 == 0) goto Ld1
            r0 = 2131959949(0x7f13208d, float:1.9556553E38)
        Lcc:
            java.lang.String r8 = X.AbstractC31177DnL.A0b(r5, r1, r0)
            goto L74
        Ld1:
            r0 = 2131959946(0x7f13208a, float:1.9556547E38)
            if (r8 == 0) goto Lcc
        Ld6:
            r0 = 2131959948(0x7f13208c, float:1.955655E38)
            goto Lcc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42776IwE.DTP(X.GsB, X.1vS, com.instagram.user.model.User):void");
    }

    @Override // X.InterfaceC71989XEc
    public final void DXH(C38266GsB c38266GsB) {
        this.A08.A02(c38266GsB);
    }

    @Override // X.InterfaceC71989XEc
    public final void DtW(C69141ViW c69141ViW) {
        String str;
        int i;
        C193328hC A0I;
        int i2;
        C41181vS A0G = this.A05.A0G();
        if (A0G != null) {
            II4 ii4 = this.A00;
            if (ii4 == null) {
                ii4 = new II4(this.A01, this.A02);
                this.A00 = ii4;
            }
            ReelDashboardFragment reelDashboardFragment = this.A09;
            C14360o3.A0B(c69141ViW, 0);
            ii4.A00 = AbstractC25225BEi.A16(reelDashboardFragment);
            C1NB c1nb = c69141ViW.A02.A0W;
            if (c1nb != null) {
                str = c1nb.getName();
            } else {
                str = null;
            }
            boolean A1o = A0G.A1o();
            boolean z = c69141ViW.A00;
            DialogInterfaceOnClickListenerC41837Ifr dialogInterfaceOnClickListenerC41837Ifr = new DialogInterfaceOnClickListenerC41837Ifr(5, reelDashboardFragment, A0G, ii4, c69141ViW);
            Context context = ii4.A01;
            if (z) {
                if (A1o) {
                    C14360o3.A0A(context);
                    i2 = 2131976104;
                } else {
                    C14360o3.A0A(context);
                    i2 = 2131976099;
                }
                String A0u = AbstractC25227BEk.A0u(context, i2);
                A0I = AbstractC31171DnF.A0I(context);
                A0I.A0m(ii4.A02, ii4.A03);
                A0I.A0f(dialogInterfaceOnClickListenerC41837Ifr, new CharSequence[]{A0u});
            } else {
                if (A1o) {
                    C14360o3.A0A(context);
                    i = 2131963559;
                } else {
                    C14360o3.A0A(context);
                    i = 2131963545;
                }
                String A0f = AbstractC167007dF.A0f(context, str, i);
                C14360o3.A0A(A0f);
                int i3 = 2131963544;
                if (A1o) {
                    i3 = 2131963558;
                }
                String A0f2 = AbstractC167007dF.A0f(context, str, i3);
                C14360o3.A0A(A0f2);
                int i4 = 2131963533;
                if (c69141ViW.A00) {
                    i4 = 2131968948;
                }
                A0I = AbstractC31171DnF.A0I(context);
                A0I.A05 = A0f;
                A0I.A0r(A0f2);
                A0I.A0D(new DialogInterfaceOnClickListenerC41789If5(2));
                A0I.A0J(dialogInterfaceOnClickListenerC41837Ifr, i4);
            }
            AbstractC31178DnM.A1R(A0I, true);
        }
    }

    @Override // X.InterfaceC71989XEc
    public final void DtX(User user) {
        this.A08.A04(user);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
    
        if (r10.equals("") != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
    
        if (r10.equals("") != false) goto L31;
     */
    @Override // X.InterfaceC71989XEc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E17(X.C38266GsB r12) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42776IwE.E17(X.GsB):void");
    }

    public C42776IwE(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC63982vJ interfaceC63982vJ, C38E c38e, C34709FQu c34709FQu, GIS gis, ReelDashboardFragment reelDashboardFragment, ReelDashboardFragment reelDashboardFragment2, String str) {
        this.A02 = userSession;
        this.A01 = abstractC59962oe;
        this.A06 = interfaceC63982vJ;
        this.A05 = reelDashboardFragment;
        this.A07 = c38e;
        this.A0A = str;
        this.A03 = interfaceC60442pS;
        this.A09 = reelDashboardFragment2;
        this.A04 = c34709FQu;
        this.A08 = gis;
    }
}
