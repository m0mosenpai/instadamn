package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Boo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26591Boo extends AbstractC51572Yf {
    public final int A00;
    public final C51762Yz A01;
    public final C120985dq A02;
    public final C37644Ghd A03;
    public final UserSession A04;
    public final InterfaceC60442pS A05;
    public final C37526Gfi A06;
    public final InterfaceC31137Dmc A07;
    public final C25348BJr A08;
    public final CR0 A09;
    public final HashMap A0A;
    public final HashMap A0B;
    public final InterfaceC16820sZ A0C;
    public final C37644Ghd A0D;
    public final C64052vQ A0E;

    public C26591Boo(C51762Yz c51762Yz, C120985dq c120985dq, C37644Ghd c37644Ghd, C37644Ghd c37644Ghd2, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C64052vQ c64052vQ, C37526Gfi c37526Gfi, InterfaceC31137Dmc interfaceC31137Dmc, C25348BJr c25348BJr, CR0 cr0, HashMap hashMap, HashMap hashMap2, InterfaceC16820sZ interfaceC16820sZ, int i) {
        AbstractC25234BEr.A0k(3, c37644Ghd, interfaceC31137Dmc, userSession, interfaceC60442pS);
        AbstractC25234BEr.A0l(8, hashMap, hashMap2, c25348BJr, c37526Gfi);
        this.A00 = i;
        this.A02 = c120985dq;
        this.A03 = c37644Ghd;
        this.A0D = c37644Ghd2;
        this.A07 = interfaceC31137Dmc;
        this.A04 = userSession;
        this.A05 = interfaceC60442pS;
        this.A0A = hashMap;
        this.A0B = hashMap2;
        this.A08 = c25348BJr;
        this.A06 = c37526Gfi;
        this.A01 = c51762Yz;
        this.A0C = interfaceC16820sZ;
        this.A0E = c64052vQ;
        this.A09 = cr0;
    }

    public static final void A0A(View view, C26591Boo c26591Boo, Integer num) {
        Integer num2;
        int i;
        C75113Zb c75113Zb;
        String str;
        C120985dq c120985dq = c26591Boo.A02;
        String str2 = c120985dq.A06().A0e;
        Integer[] A00 = C05F.A00(5);
        int length = A00.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                num2 = A00[i2];
                switch (num2.intValue()) {
                    case 1:
                        str = "ENLARGED_VIEWER";
                        break;
                    case 2:
                        str = AbstractC111324zv.A00(633);
                        break;
                    case 3:
                        str = "SEED_AD";
                        break;
                    case 4:
                        str = "WATCH_AND_BROWSE";
                        break;
                    default:
                        str = "CTA_DESTINATION";
                        break;
                }
                if (!str.equalsIgnoreCase(str2)) {
                    i2++;
                }
            } else {
                num2 = C05F.A00;
            }
        }
        Integer A002 = C71113Gx.A00(Integer.valueOf(c120985dq.A03().A00));
        if (A002 == null) {
            A002 = C05F.A00;
        }
        C37644Ghd c37644Ghd = c26591Boo.A0D;
        C51737MtK c51737MtK = c37644Ghd.A09;
        if (c51737MtK.A00 == c26591Boo.A00) {
            i = c51737MtK.A01;
        } else {
            i = 0;
        }
        UserSession userSession = c26591Boo.A04;
        C14360o3.A0B(userSession, 0);
        if (C18U.A01(C06090Tz.A06, userSession, 36600684803002342L) > 0 && (c75113Zb = c37644Ghd.A0E) != null && !c75113Zb.A33) {
            num2 = C05F.A0C;
        }
        int intValue = num2.intValue();
        if (intValue != 1 && intValue != 4 && intValue != 2 && intValue != 3) {
            if (intValue == 0) {
                A0B(view, c26591Boo, C05F.A00);
                return;
            }
            throw B4Z.A00();
        }
        c26591Boo.A06.A03(c120985dq, num, c26591Boo.A03.A06());
        c26591Boo.A07.DU1(view, c120985dq, num2, A002, c26591Boo.A05.getModuleName(), i);
    }

    public static void A0C(C2Z0 c2z0, C26591Boo c26591Boo, int i, boolean z) {
        c2z0.A00(c26591Boo.A03(c2z0, AbstractC27809CNy.A00, AbstractC77623dm.A0D(c2z0, i), z));
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x03fd, code lost:
    
        if (r59 != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x06ea, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0241, code lost:
    
        if (r5 == X.C7O.A03) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0261, code lost:
    
        if (X.AbstractC28385Cfo.A00(r15) == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x026b, code lost:
    
        if (r23 != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x027b, code lost:
    
        if ((r36 instanceof X.C53) != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02ee, code lost:
    
        if (r59 != false) goto L85;
     */
    @Override // X.AbstractC51572Yf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC50812Vc A0Y(X.C76223bS r75) {
        /*
            Method dump skipped, instructions count: 1806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26591Boo.A0Y(X.3bS):X.2Vc");
    }

    private final C2WF A03(C2Z1 c2z1, List list, long j, boolean z) {
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A0h = AbstractC25225BEi.A0h(null, AbstractC25228BEl.A0n(C05F.A0Y, EnumC77933eL.ABSOLUTE));
        Integer num = C05F.A00;
        C51722Yv A0d = AbstractC25230BEn.A0d(A0h, num, 100.0f, 0);
        Integer num2 = C05F.A01;
        C51722Yv A00 = C9CU.A00(A0d, num2, 0, j);
        C2Z0 A0L = AbstractC25233BEq.A0L(c2z1);
        if (AbstractC28385Cfo.A00(this.A04) != EnumC27398C7b.A04) {
            A0L.A00(new C26633BpU(AbstractC25234BEr.A0N(AbstractC25233BEq.A0a(null, num2, 1.0f), num2, num, 100.0f, 0), list, 32, z));
        }
        return AbstractC76963ci.A02(A0L, c2z1, A00);
    }

    private final C2WH A04(C76223bS c76223bS, C38321qM c38321qM, boolean z, boolean z2, boolean z3) {
        long A06;
        String str;
        C75933ay c75933ay = C51722Yv.A02;
        EnumC77933eL enumC77933eL = EnumC77933eL.RELATIVE;
        Integer num = C05F.A0Y;
        C51722Yv A0h = AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0o(num, enumC77933eL, 3));
        long A09 = AbstractC25227BEk.A09(c76223bS);
        Integer num2 = C05F.A01;
        C51722Yv A00 = C9CU.A00(A0h, num2, 0, A09);
        Integer num3 = C05F.A00;
        C51722Yv A002 = C9CU.A00(AbstractC25230BEn.A0d(A00, num3, 100.0f, 0), C05F.A08, 0, AbstractC77623dm.A0A(c76223bS));
        if (z2) {
            A06 = AbstractC25229BEm.A0D();
        } else {
            A06 = AbstractC77623dm.A06(c76223bS);
        }
        C51722Yv A003 = C9CU.A00(A002, C05F.A1I, 0, A06);
        EnumC77683ds enumC77683ds = EnumC77683ds.CENTER;
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        if (!z) {
            if (z2 && z3) {
                C51722Yv A0h2 = AbstractC25225BEi.A0h(AbstractC25233BEq.A0Y(null, A12, num2, R.dimen.abc_select_dialog_padding_start_material, 0), AbstractC25230BEn.A0h(A12, num3, R.dimen.abc_select_dialog_padding_start_material, 0));
                C51722Yv A004 = C9CU.A00(C9CU.A00(null, num3, 0, AbstractC77623dm.A04(A12)), num2, 0, AbstractC77623dm.A04(A12));
                if (c38321qM != null) {
                    A12.A00(A07(A12, A0h2, A004, c38321qM, true, true));
                }
            }
            C51722Yv A0Y = AbstractC25231BEo.A0Y(AbstractC25233BEq.A0V(AbstractC25230BEn.A0d(AbstractC25233BEq.A0V(null, AbstractC25225BEi.A0o(C05F.A0D, "detached_info_view", 4), num, enumC77933eL, 3), num2, 1.0f, 1), AbstractC25225BEi.A0m(C05F.A0C, 1.0f, 1), num3, enumC77683ds, 3), new BQB(25, this, c76223bS, z));
            Integer num4 = C05F.A0N;
            InterfaceC104954oA interfaceC104954oA = this.A02.A06().A0O;
            if (interfaceC104954oA == null || (str = interfaceC104954oA.AZG()) == null) {
                str = "";
            }
            C2XE c2xe = A12.A00;
            int A0A = AbstractC25230BEn.A0A(c2xe, A12);
            long A092 = AbstractC77623dm.A09(A12);
            Typeface typeface = Typeface.DEFAULT;
            long A0D = AbstractC25229BEm.A0D();
            C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, str, 0);
            AbstractC25233BEq.A1B(A12, A0a, A0A, A092);
            A0a.A0S(0);
            AbstractC25234BEr.A0o(typeface, A12, A0a, A0D);
            A0a.A0X(num4);
            AbstractC25234BEr.A1C(A0a, num3, 1.0f);
            AbstractC25233BEq.A1A(A12, A0Y, A0a);
        }
        return AbstractC76963ci.A0H(A12, c76223bS, A003);
    }

    private final C2WH A05(C76223bS c76223bS, AbstractC27887CQy abstractC27887CQy, String str, String str2, boolean z) {
        boolean z2;
        long A0D;
        long A07;
        C89813zN A0f;
        C89813zN A0f2;
        boolean z3 = abstractC27887CQy instanceof C53;
        C7O c7o = abstractC27887CQy.A00;
        C7O c7o2 = C7O.A04;
        if (z3) {
            z2 = false;
            if (c7o != c7o2) {
                C09530e4 c09530e4 = (C09530e4) this.A01.A03;
                if (AbstractC166987dD.A1a(c09530e4.A00)) {
                    if (c7o == C7O.A03) {
                        if (!AbstractC166987dD.A1a(c09530e4.A01)) {
                            A0f2 = AbstractC51432Xq.A00(EnumC76913cd.LOCAL, "cta_fade_in");
                            A0f2.A03(AbstractC79463gt.A00);
                            A0f2.A01(0.0f);
                            AbstractC25226BEj.A1S(A0f2, C8S8.DEFAULT_SWIPE_ANIMATION_DURATION);
                            this.A0C.invoke();
                        }
                        A0f2 = AbstractC51432Xq.A01(AbstractC51432Xq.A04, new String[0]);
                    } else if (c7o == C7O.A05) {
                        if (!AbstractC166987dD.A1a(c09530e4.A01)) {
                            A0f2 = AbstractC25230BEn.A0f(EnumC76913cd.LOCAL, "cta_slide_up");
                            A0f2.A04(C89893zV.A00(c76223bS.A05.A0C, 10));
                            AbstractC25226BEj.A1S(A0f2, C8S8.DEFAULT_SWIPE_ANIMATION_DURATION);
                            this.A0C.invoke();
                        }
                        A0f2 = AbstractC51432Xq.A01(AbstractC51432Xq.A04, new String[0]);
                    }
                    AbstractC89903zW.A00(c76223bS, A0f2);
                }
            }
            C75933ay c75933ay = C51722Yv.A02;
            EnumC77933eL enumC77933eL = EnumC77933eL.RELATIVE;
            Integer num = C05F.A0Y;
            C51722Yv A0h = AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0o(num, enumC77933eL, 3));
            Integer num2 = C05F.A00;
            C51722Yv A0d = AbstractC25230BEn.A0d(A0h, num2, 100.0f, 0);
            long A0D2 = AbstractC77623dm.A0D(c76223bS, R.dimen.alert_dialog_button_cell_height);
            Integer num3 = C05F.A01;
            C51722Yv A00 = C9CV.A00(C9CU.A00(A0d, num3, 0, A0D2), C05F.A1F, DRR.A00(this, 45), 4);
            C2XE c2xe = c76223bS.A05;
            C51722Yv A0W = AbstractC25231BEo.A0W(c2xe, A00, EnumC76913cd.LOCAL, str2);
            Integer num4 = C05F.A0C;
            C51722Yv A0c = AbstractC25233BEq.A0c(A0W, num4, true);
            C3e8 c3e8 = C3e8.CENTER;
            EnumC77683ds enumC77683ds = EnumC77683ds.AUTO;
            C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
            C51722Yv A0Y = AbstractC25233BEq.A0Y(C9CV.A00(null, num, enumC77933eL, 3), A0P, num3, R.dimen.abc_dropdownitem_icon_width, 0);
            C51722Yv A002 = C9CV.A00(AbstractC25234BEr.A0E(AbstractC25232BEp.A14(A0Y, 0, AbstractC77623dm.A07(A0P)), AbstractC25227BEk.A0Z(0, AbstractC77623dm.A07(A0P)), 0, AbstractC77623dm.A07(A0P)), num2, AbstractC77623dm.A0E(A0P, R.drawable.clips_viewer_multi_media_card_cta_background), 4);
            C2Z0 A13 = AbstractC25232BEp.A13(A0P);
            C51722Yv A0N = AbstractC25234BEr.A0N(AbstractC25233BEq.A0T(C9CV.A00(null, num, enumC77933eL, 3), AbstractC25230BEn.A0h(A13, num3, R.dimen.abc_select_dialog_padding_start_material, 0), num2, 100.0f, 0), num3, num4, 0.0f, 1);
            C2XE c2xe2 = A13.A00;
            Context context = c2xe2.A0C;
            int A04 = AbstractC25228BEl.A04(context, A13);
            long A0C = AbstractC77623dm.A0C(A13);
            Typeface A0Q = AbstractC25226BEj.A0Q(context, num4);
            int A06 = AbstractC25228BEl.A06(context, A13, R.attr.igds_color_selected_text_background);
            long A0D3 = AbstractC25229BEm.A0D();
            C77723dw A0a = AbstractC25231BEo.A0a(c2xe2, null, str, 0);
            AbstractC25233BEq.A1B(A13, A0a, A04, A0C);
            AbstractC25234BEr.A14(A13, A0a, C2Z3.A00(AbstractC25233BEq.A0i(A0Q, A13, A0a, 0, A06), A0D3), A0D3);
            AbstractC25234BEr.A1F(A0a, num4, num2);
            A0a.A0M(1);
            AbstractC25233BEq.A1D(A0N, A0a, false);
            AbstractC25230BEn.A1G(A0a.A0A(), A13, A0P, A002);
            return AbstractC76963ci.A0K(A0P, c76223bS, A0c, enumC77683ds, c3e8);
        }
        z2 = false;
        if (c7o != c7o2) {
            C09530e4 c09530e42 = (C09530e4) this.A01.A03;
            if (AbstractC166987dD.A1a(c09530e42.A00)) {
                if (c7o == C7O.A03) {
                    if (!AbstractC166987dD.A1a(c09530e42.A01)) {
                        A0f = AbstractC51432Xq.A00(EnumC76913cd.LOCAL, "cta_fade_in");
                        A0f.A03(AbstractC79463gt.A00);
                        A0f.A01(0.0f);
                        AbstractC25226BEj.A1S(A0f, C8S8.DEFAULT_SWIPE_ANIMATION_DURATION);
                        this.A0C.invoke();
                    }
                    A0f = AbstractC51432Xq.A01(AbstractC51432Xq.A04, new String[0]);
                } else if (c7o == C7O.A05) {
                    if (!AbstractC166987dD.A1a(c09530e42.A01)) {
                        A0f = AbstractC25230BEn.A0f(EnumC76913cd.LOCAL, "cta_slide_up");
                        A0f.A04(C89893zV.A00(c76223bS.A05.A0C, 10));
                        AbstractC25226BEj.A1S(A0f, C8S8.DEFAULT_SWIPE_ANIMATION_DURATION);
                        this.A0C.invoke();
                    }
                    A0f = AbstractC51432Xq.A01(AbstractC51432Xq.A04, new String[0]);
                }
                AbstractC89903zW.A00(c76223bS, A0f);
            }
        }
        C75933ay c75933ay2 = C51722Yv.A02;
        EnumC77933eL enumC77933eL2 = EnumC77933eL.RELATIVE;
        Integer num5 = C05F.A0Y;
        C51722Yv A0h2 = AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0o(num5, enumC77933eL2, 3));
        Integer num6 = C05F.A00;
        C51722Yv A0d2 = AbstractC25230BEn.A0d(A0h2, num6, 100.0f, 0);
        if (z) {
            A0D = AbstractC77623dm.A0D(c76223bS, R.dimen.account_group_management_clickable_width);
        } else {
            A0D = AbstractC77623dm.A0D(c76223bS, R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        }
        Integer num7 = C05F.A01;
        C51722Yv A003 = C9CU.A00(A0d2, num7, 0, A0D);
        long A072 = AbstractC77623dm.A07(c76223bS);
        long A073 = AbstractC77623dm.A07(c76223bS);
        if (z) {
            A07 = AbstractC77623dm.A0B(c76223bS);
        } else {
            A07 = AbstractC77623dm.A07(c76223bS);
        }
        C51722Yv A0D4 = AbstractC25234BEr.A0D(C9CU.A00(A003, C05F.A04, 0, A072), AbstractC25227BEk.A0c(A07), 0, A073);
        C2XE c2xe3 = c76223bS.A05;
        C51722Yv A0d3 = AbstractC25233BEq.A0d(AbstractC25231BEo.A0W(c2xe3, A0D4, EnumC76913cd.LOCAL, str2), DRT.A00(this, 0));
        C2Z0 A0P2 = AbstractC167007dF.A0P(c2xe3);
        C51722Yv A0d4 = AbstractC25230BEn.A0d(null, num7, 1.0f, 1);
        Integer num8 = C05F.A0C;
        C51722Yv A0d5 = AbstractC25230BEn.A0d(A0d4, num8, 1.0f, 1);
        C2Z0 A132 = AbstractC25232BEp.A13(A0P2);
        C51722Yv A0N2 = AbstractC25234BEr.A0N(C9CV.A00(null, num5, enumC77933eL2, 3), num7, num8, 1.0f, 1);
        Integer num9 = C05F.A0N;
        C2XE c2xe4 = A132.A00;
        Context context2 = c2xe4.A0C;
        int A042 = AbstractC25228BEl.A04(context2, A132);
        long A0C2 = AbstractC77623dm.A0C(A132);
        Typeface A0Q2 = AbstractC25226BEj.A0Q(context2, num8);
        int A062 = AbstractC25228BEl.A06(context2, A132, R.attr.igds_color_selected_text_background);
        long A0D5 = AbstractC25229BEm.A0D();
        C77723dw A0a2 = AbstractC25231BEo.A0a(c2xe4, null, str, 0);
        AbstractC25233BEq.A1B(A132, A0a2, A042, A0C2);
        AbstractC25234BEr.A14(A132, A0a2, C2Z3.A00(AbstractC25233BEq.A0i(A0Q2, A132, A0a2, 0, A062), A0D5), A0D5);
        A0a2.A0X(num9);
        AbstractC25234BEr.A1C(A0a2, num6, 1.0f);
        AbstractC25233BEq.A1A(A132, A0N2, A0a2);
        if (abstractC27887CQy.A01) {
            C51722Yv A0N3 = AbstractC25234BEr.A0N(AbstractC25232BEp.A14(C9CV.A00(null, num5, enumC77933eL2, 3), 0, AbstractC77623dm.A0B(A132)), num7, num8, 0.0f, 1);
            Drawable A0N4 = AbstractC25228BEl.A0N(A132, R.drawable.instagram_chevron_right_pano_outline_12);
            AbstractC25231BEo.A0y(A0N4, A132, R.color.design_dark_default_color_on_background);
            AbstractC25228BEl.A1I(A0N4, null, A132, A0N3);
        }
        A0P2.A00(AbstractC76963ci.A0H(A132, A0P2, A0d5));
        return AbstractC76963ci.A0E(A0P2, c76223bS, A0d3);
        return new C2WH(null, null, null, null, null, null, z2);
    }

    public static final C2WH A06(C76223bS c76223bS, String str, boolean z) {
        long A0D;
        C75933ay c75933ay = C51722Yv.A02;
        EnumC77933eL enumC77933eL = EnumC77933eL.RELATIVE;
        Integer num = C05F.A0Y;
        C51722Yv A0h = AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0o(num, enumC77933eL, 3));
        Integer num2 = C05F.A00;
        C51722Yv A0d = AbstractC25230BEn.A0d(A0h, num2, 100.0f, 0);
        long A07 = AbstractC77623dm.A07(c76223bS);
        long A072 = AbstractC77623dm.A07(c76223bS);
        long A073 = AbstractC77623dm.A07(c76223bS);
        if (z) {
            A0D = AbstractC77623dm.A07(c76223bS);
        } else {
            A0D = AbstractC25229BEm.A0D();
        }
        C51722Yv A0D2 = AbstractC25234BEr.A0D(AbstractC25234BEr.A0F(A0d, AbstractC25227BEk.A0b(A07), 0, A073), AbstractC25225BEi.A0n(C05F.A1F, 0, A072), 0, A0D);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        Integer num3 = C05F.A01;
        C51722Yv A0d2 = AbstractC25230BEn.A0d(null, num3, 1.0f, 1);
        Integer num4 = C05F.A0C;
        C51722Yv A0d3 = AbstractC25230BEn.A0d(A0d2, num4, 1.0f, 1);
        C2Z0 A13 = AbstractC25232BEp.A13(A12);
        C51722Yv A0N = AbstractC25234BEr.A0N(C9CV.A00(null, num, enumC77933eL, 3), num3, num4, 1.0f, 1);
        Integer num5 = C05F.A0N;
        C2XE c2xe = A13.A00;
        Context context = c2xe.A0C;
        int A04 = AbstractC25228BEl.A04(context, A13);
        long A05 = AbstractC77623dm.A05(A13);
        int A06 = AbstractC25228BEl.A06(context, A13, R.attr.igds_color_selected_text_background);
        Typeface typeface = Typeface.DEFAULT;
        long A0D3 = AbstractC25229BEm.A0D();
        C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, str, 0);
        AbstractC25233BEq.A1B(A13, A0a, A04, A05);
        AbstractC25234BEr.A14(A13, A0a, C2Z3.A00(AbstractC25233BEq.A0i(typeface, A13, A0a, 0, A06), A0D3), A0D3);
        A0a.A0X(num5);
        AbstractC25233BEq.A1E(A0a, num2, 1.0f, false);
        A0a.A0M(2);
        AbstractC25233BEq.A1D(A0N, A0a, false);
        AbstractC25230BEn.A1G(A0a.A0A(), A13, A12, A0d3);
        return AbstractC76963ci.A0E(A12, c76223bS, A0D2);
    }

    private final C2WH A07(C2Z1 c2z1, C51722Yv c51722Yv, C51722Yv c51722Yv2, C38321qM c38321qM, boolean z, boolean z2) {
        C51722Yv c51722Yv3 = c51722Yv;
        boolean z3 = !z;
        EnumC77683ds enumC77683ds = EnumC77683ds.CENTER;
        Integer num = C05F.A0C;
        C9CT A0m = AbstractC25225BEi.A0m(num, 0.0f, 1);
        if (c51722Yv3 == C51722Yv.A02) {
            c51722Yv3 = null;
        }
        C51722Yv A00 = C9CV.A00(C9CV.A00(AbstractC25225BEi.A0h(c51722Yv3, A0m), C05F.A1F, DRR.A00(this, 49), 4), C05F.A08, "reels_multi_ads_card_profile_image", 4);
        C2Z0 A0L = AbstractC25233BEq.A0L(c2z1);
        User A2E = c38321qM.A2E(this.A04);
        if (A2E != null && z2) {
            C51722Yv A0d = AbstractC25230BEn.A0d(c51722Yv2, num, 0.0f, 1);
            ImageUrl Bhu = A2E.Bhu();
            InterfaceC60442pS interfaceC60442pS = this.A05;
            Context context = A0L.A00.A0C;
            A0L.A00(new C77973eP(A0d, interfaceC60442pS, Bhu, null, AbstractC25228BEl.A04(context, A0L), 0, AbstractC25228BEl.A04(context, A0L), false, false, false));
        }
        return AbstractC76963ci.A0J(A0L, c2z1, A00, null, null, enumC77683ds, null, null, z3);
    }

    private final C2WH A08(C2Z1 c2z1, C38321qM c38321qM, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        long A07;
        long j;
        long A0B;
        User A2E;
        C51722Yv A14;
        C9CU A0Z;
        C51722Yv c51722Yv = C51722Yv.A02;
        EnumC77933eL enumC77933eL = EnumC77933eL.RELATIVE;
        Integer num2 = C05F.A0Y;
        C51722Yv A0h = AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0o(num2, enumC77933eL, 3));
        long A0D = AbstractC77623dm.A0D(c2z1, R.dimen.abc_select_dialog_padding_start_material);
        Integer num3 = C05F.A01;
        C51722Yv A00 = C9CU.A00(A0h, num3, 0, A0D);
        if (num.intValue() != 0) {
            A07 = 9221401712017801216L;
            if (A0E(AbstractC25229BEm.A0M(c2z1)) && AbstractC166987dD.A1a(((C09530e4) this.A01.A03).A00)) {
                j = 9221401712017801216L;
            } else {
                j = AbstractC77623dm.A07(c2z1);
            }
        } else {
            A07 = AbstractC77623dm.A07(c2z1);
            j = 9221401712017801216L;
        }
        Integer num4 = C05F.A08;
        C51722Yv A0E = AbstractC25234BEr.A0E(A00, AbstractC25225BEi.A0n(num4, 0, A07), 0, j);
        Integer num5 = C05F.A00;
        C51722Yv A0d = AbstractC25230BEn.A0d(A0E, num5, 100.0f, 0);
        C2Z0 A0L = AbstractC25233BEq.A0L(c2z1);
        if (z) {
            if (!z2) {
                c51722Yv = AbstractC25225BEi.A0h(AbstractC25233BEq.A0Y(null, A0L, num3, R.dimen.asset_picker_redesign_sticker_height, 0), AbstractC25230BEn.A0h(A0L, num5, R.dimen.asset_picker_redesign_sticker_height, 0));
                C51722Yv A0Y = AbstractC25233BEq.A0Y(AbstractC25233BEq.A0Y(null, A0L, num5, R.dimen.asset_picker_section_title_horizontal_padding, 0), A0L, num3, R.dimen.asset_picker_section_title_horizontal_padding, 0);
                long A072 = AbstractC77623dm.A07(A0L);
                long A073 = AbstractC77623dm.A07(A0L);
                A14 = AbstractC25232BEp.A14(A0Y, 0, A072);
                A0Z = AbstractC25227BEk.A0Z(0, A073);
            } else {
                UserSession userSession = this.A04;
                C14360o3.A0B(userSession, 0);
                if (C18U.A06(C06090Tz.A06, userSession, 2342162219037629493L)) {
                    c51722Yv = AbstractC25233BEq.A0Y(null, A0L, num3, R.dimen.abc_star_medium, 0);
                }
                C51722Yv A0Y2 = AbstractC25233BEq.A0Y(AbstractC25233BEq.A0Y(null, A0L, num5, R.dimen.abc_select_dialog_padding_start_material, 0), A0L, num3, R.dimen.abc_select_dialog_padding_start_material, 0);
                long A074 = AbstractC77623dm.A07(A0L);
                long A0D2 = AbstractC25229BEm.A0D();
                A14 = AbstractC25232BEp.A14(A0Y2, 0, A074);
                A0Z = AbstractC25227BEk.A0Z(0, A0D2);
            }
            A0L.A00(A07(A0L, c51722Yv, AbstractC25225BEi.A0h(A14, A0Z), c38321qM, false, !z5));
        }
        C51722Yv A002 = C9CV.A00(null, num2, enumC77933eL, 3);
        UserSession userSession2 = this.A04;
        C14360o3.A0B(userSession2, 0);
        C06090Tz c06090Tz = C06090Tz.A06;
        if (C18U.A06(c06090Tz, userSession2, 2342162219037629493L)) {
            A002 = AbstractC25233BEq.A0Y(A002, A0L, num3, R.dimen.abc_star_medium, 0);
        }
        C51722Yv A0d2 = AbstractC25230BEn.A0d(A002, num3, 1.0f, 1);
        Integer num6 = C05F.A0C;
        C51722Yv A0d3 = AbstractC25230BEn.A0d(A0d2, num6, 1.0f, 1);
        if (!z) {
            A0B = AbstractC77623dm.A07(A0L);
        } else if (z4) {
            A0B = AbstractC77623dm.A0A(A0L);
        } else {
            A0B = AbstractC77623dm.A0B(A0L);
        }
        C51722Yv A003 = C9CU.A00(A0d3, C05F.A0u, 0, A0B);
        if (z2) {
            A003 = AbstractC25233BEq.A0d(A003, DRR.A00(this, 47));
        }
        C51722Yv A004 = C9CV.A00(A003, num4, "reels_multi_ads_card_username", 4);
        C2Z0 A13 = AbstractC25232BEp.A13(A0L);
        C51722Yv A005 = C9CV.A00(null, num2, enumC77933eL, 3);
        if (z3) {
            C51722Yv A0R = AbstractC25233BEq.A0R(A005, AbstractC25227BEk.A0Y(0, AbstractC77623dm.A0B(A13)), 0, AbstractC77623dm.A08(A13));
            float[] fArr = new float[8];
            int i = 0;
            do {
                fArr[i] = AbstractC13690mv.A01(AbstractC25226BEj.A0O(A13), 32);
                i++;
            } while (i < 8);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
            shapeDrawable.setAlpha(178);
            AbstractC166997dE.A1F(shapeDrawable, AbstractC77623dm.A01(A13));
            A005 = C9CV.A00(A0R, num5, shapeDrawable, 4);
        }
        C2Z0 A132 = AbstractC25232BEp.A13(A13);
        if (z2) {
            User A2E2 = c38321qM.A2E(userSession2);
            if (A2E2 != null) {
                String username = A2E2.getUsername();
                C2XE c2xe = A132.A00;
                Context context = c2xe.A0C;
                int A04 = AbstractC25228BEl.A04(context, A132);
                Typeface A0Q = AbstractC25226BEj.A0Q(context, num3);
                long A075 = AbstractC77623dm.A07(A132);
                long A0D3 = AbstractC25229BEm.A0D();
                C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, username, 0);
                AbstractC25233BEq.A1B(A132, A0a, A04, A075);
                A0a.A0S(0);
                AbstractC25234BEr.A0o(A0Q, A132, A0a, A0D3);
                AbstractC25230BEn.A1M(A0a, num5, num3);
                AbstractC25232BEp.A1M(A0a);
                A0a.A0c(true);
                AbstractC25232BEp.A1N(A0a, false);
                AbstractC25227BEk.A1J(A132, A0a);
                C38321qM c38321qM2 = this.A02.A02;
                if (c38321qM2 != null && (A2E = c38321qM2.A2E(userSession2)) != null && A2E.isVerified() && C18U.A06(c06090Tz, userSession2, 2342162219037105197L)) {
                    C51722Yv A142 = AbstractC25232BEp.A14(AbstractC25234BEr.A0J(C9CV.A00(null, num2, enumC77933eL, 3), A132, num3, num5), 0, AbstractC77623dm.A06(A132));
                    Drawable mutate = C85963sQ.A00(AbstractC77363dM.A00(A132)).mutate();
                    C2XE ArD = A132.ArD();
                    Context A0E2 = AbstractC25225BEi.A0E(ArD);
                    mutate.setBounds(0, 0, AbstractC13690mv.A01(A0E2, 12), AbstractC13690mv.A01(A0E2, 12));
                    AbstractC25234BEr.A0r(mutate, ArD, A132, A142);
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        AbstractC25230BEn.A1G(AbstractC76963ci.A0H(A132, A13, A005), A13, A0L, A004);
        C51722Yv A006 = C9CV.A00(null, num2, enumC77933eL, 3);
        int i2 = R.dimen.account_group_management_clickable_width;
        if (z2) {
            i2 = R.dimen.abc_star_medium;
        }
        C51722Yv A0Y3 = AbstractC25233BEq.A0Y(A006, A0L, num5, i2, 0);
        int i3 = R.dimen.account_group_management_clickable_width;
        if (z2) {
            i3 = R.dimen.abc_star_medium;
        }
        AbstractC25228BEl.A1I(AbstractC77623dm.A0E(A0L, R.drawable.instagram_more_vertical_outline_44), null, A0L, AbstractC25231BEo.A0Y(AbstractC25234BEr.A0N(AbstractC25233BEq.A0Y(A0Y3, A0L, num3, i3, 0), num3, num6, 0.0f, 1), DRR.A00(this, 48)));
        return AbstractC76963ci.A0H(A0L, c2z1, A0d);
    }

    public static final String A09(C40971v4 c40971v4) {
        List C8z;
        String str;
        C4o9 c4o9 = c40971v4.A0N;
        if (c4o9 == null || (C8z = c4o9.C8z()) == null || (str = (String) AbstractC166987dD.A16(C8z)) == null) {
            C84923qg A1V = c40971v4.A0K.A1V();
            if (A1V != null) {
                return A1V.A0e;
            }
            return null;
        }
        return str;
    }

    public static final void A0B(View view, C26591Boo c26591Boo, Integer num) {
        C37526Gfi c37526Gfi = c26591Boo.A06;
        C37644Ghd c37644Ghd = c26591Boo.A03;
        int A06 = c37644Ghd.A06();
        C120985dq c120985dq = c26591Boo.A02;
        c37526Gfi.A03(c120985dq, num, A06);
        C71313Hs.A00(c26591Boo.A04).A07(view, EnumC71343Hv.A0H, new String[0], 1);
        c26591Boo.A07.D4v(null, c120985dq, c37644Ghd, null, false, c26591Boo.A05.getModuleName(), null, 0.0f, 0.0f, false, false);
    }

    public static final void A0D(C26591Boo c26591Boo) {
        C64052vQ c64052vQ;
        C120985dq c120985dq = c26591Boo.A02;
        if (c120985dq.A03().A00 == 10) {
            UserSession userSession = c26591Boo.A04;
            if (C18U.A06(AbstractC25228BEl.A0l(userSession), userSession, 36319209827474520L) && (c64052vQ = c26591Boo.A0E) != null) {
                c64052vQ.A03(AbstractC25226BEj.A1E(c120985dq), c120985dq.A03().A01.A02, "1027920312221535");
            }
        }
    }

    private final boolean A0E(Context context) {
        C120985dq c120985dq = this.A02;
        C38321qM A0y = AbstractC25226BEj.A0y(c120985dq);
        List A04 = c120985dq.A06().A04();
        UserSession userSession = this.A04;
        AndroidLink A01 = AbstractC905941u.A01(context, userSession, A0y, A04, false);
        if (c120985dq.A06().A0d != null && A01 != null) {
            C14360o3.A0B(userSession, 0);
            if (C18U.A06(C06090Tz.A06, userSession, 2342162219037498419L)) {
                return true;
            }
        }
        return false;
    }
}
