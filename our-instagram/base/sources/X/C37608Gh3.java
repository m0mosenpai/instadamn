package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.api.schemas.ClipsMashupType;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Gh3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37608Gh3 implements CallerContextable {
    public static final C41719Idq A0V = new Object();
    public static final String __redex_internal_original_name = "ClipsOrganicMoreOptionsHelper";
    public C120985dq A00;
    public C37644Ghd A01;
    public C38321qM A02;
    public C75113Zb A03;
    public final FragmentActivity A04;
    public final AbstractC59962oe A05;
    public final XDF A06;
    public final ClipsViewerConfig A07;
    public final InterfaceC60142ow A08;
    public final InterfaceC31077DlK A09;
    public final UserSession A0B;
    public final InterfaceC60442pS A0C;
    public final InterfaceC43585JPa A0D;
    public final AnonymousClass388 A0E;
    public final InterfaceC43589JPu A0F;
    public final C37540Gfw A0G;
    public final ILW A0H;
    public final InterfaceC31137Dmc A0I;
    public final InterfaceC31069DlB A0J;
    public final BKZ A0K;
    public final C37609Gh4 A0L;
    public final C26914BuH A0M;
    public final C37611Gh6 A0N;
    public final C37610Gh5 A0O;
    public final C37607Gh2 A0P;
    public final IG5 A0Q;
    public final C37560GgG A0R;
    public final AbstractC37552Gg8 A0U;
    public final InterfaceC09390do A0S = C1XM.A00(C37740GjF.A00);
    public final CallerContext A0T = CallerContext.A01(__redex_internal_original_name);
    public final InterfaceC41501vz A0A = C37816GkW.A00(this, 51);

    public static final void A04(InterfaceC84163p3 interfaceC84163p3, C54842OMn c54842OMn, C37608Gh3 c37608Gh3) {
        C3x9 A0u;
        InterfaceC84163p3 interfaceC84163p32 = null;
        if (interfaceC84163p3 != null) {
            interfaceC84163p32 = interfaceC84163p3.F4H(C1DS.A00(c37608Gh3.A0B));
        } else {
            C120985dq c120985dq = c37608Gh3.A00;
            if (c120985dq == null) {
                C14360o3.A0F("clipsItem");
                throw C00O.createAndThrow();
            }
            C38321qM c38321qM = c120985dq.A02;
            if (c38321qM != null && (A0u = AbstractC25226BEj.A0u(c38321qM)) != null) {
                interfaceC84163p32 = A0u.BPh();
            }
        }
        A03(interfaceC84163p32, c54842OMn, c37608Gh3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:874:0x1123, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r5, 36325287201747944L) == false) goto L831;
     */
    /* JADX WARN: Code restructure failed: missing block: B:914:0x1232, code lost:
    
        if (X.C14360o3.A0K(r0.getId(), r6.getId()) == false) goto L871;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0067. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x0d23  */
    /* JADX WARN: Removed duplicated region for block: B:705:0x0e5b  */
    /* JADX WARN: Removed duplicated region for block: B:773:0x0f16  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:939:0x12c3  */
    /* JADX WARN: Removed duplicated region for block: B:940:0x12d3  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r34v0, types: [X.Gh3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v134, types: [X.Gl9] */
    /* JADX WARN: Type inference failed for: r4v53, types: [X.2oe] */
    /* JADX WARN: Type inference failed for: r4v54, types: [X.Ib3] */
    /* JADX WARN: Type inference failed for: r4v88, types: [X.0Zx, X.MnJ] */
    /* JADX WARN: Type inference failed for: r5v35, types: [X.2oe] */
    /* JADX WARN: Type inference failed for: r5v37, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0D(X.EnumC39627Hel r35) {
        /*
            Method dump skipped, instructions count: 5210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37608Gh3.A0D(X.Hel):void");
    }

    public static final void A00(ClipsViewerSource clipsViewerSource, C37608Gh3 c37608Gh3) {
        String str;
        InterfaceC60442pS interfaceC60442pS = c37608Gh3.A0C;
        FragmentActivity fragmentActivity = c37608Gh3.A04;
        AbstractC59962oe abstractC59962oe = c37608Gh3.A05;
        UserSession userSession = c37608Gh3.A0B;
        C38321qM c38321qM = c37608Gh3.A02;
        if (c38321qM == null) {
            str = "media";
        } else {
            C120985dq c120985dq = c37608Gh3.A00;
            if (c120985dq == null) {
                str = "clipsItem";
            } else {
                C37644Ghd c37644Ghd = c37608Gh3.A01;
                if (c37644Ghd == null) {
                    str = "clipsItemState";
                } else {
                    C41760Ieb.A00(fragmentActivity, abstractC59962oe, c37608Gh3.A07, clipsViewerSource, c120985dq, c37644Ghd, interfaceC60442pS, userSession, c38321qM, c37608Gh3.A0Q);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A01(ClipsViewerSource clipsViewerSource, C37608Gh3 c37608Gh3) {
        Integer num;
        String str;
        ClipsMashupType clipsMashupType;
        C37855Gl9 c37855Gl9 = C37855Gl9.A00;
        InterfaceC60442pS interfaceC60442pS = c37608Gh3.A0C;
        UserSession userSession = c37608Gh3.A0B;
        C38321qM c38321qM = c37608Gh3.A02;
        if (c38321qM == null) {
            str = "media";
        } else {
            C37644Ghd c37644Ghd = c37608Gh3.A01;
            if (c37644Ghd == null) {
                str = "clipsItemState";
            } else {
                C75113Zb c75113Zb = c37644Ghd.A0E;
                if (c75113Zb != null) {
                    num = AbstractC37301Gc2.A0d(c75113Zb);
                } else {
                    num = null;
                }
                String str2 = c37608Gh3.A0Q.A00;
                FragmentActivity fragmentActivity = c37608Gh3.A04;
                AbstractC59962oe abstractC59962oe = c37608Gh3.A05;
                C22P A00 = IB0.A00(clipsViewerSource);
                C120985dq c120985dq = c37608Gh3.A00;
                str = "clipsItem";
                if (c120985dq != null) {
                    String A08 = AbstractC41770Iem.A08(c120985dq);
                    C120985dq c120985dq2 = c37608Gh3.A00;
                    if (c120985dq2 != null) {
                        String A09 = AbstractC41770Iem.A09(c120985dq2);
                        C120985dq c120985dq3 = c37608Gh3.A00;
                        if (c120985dq3 != null) {
                            String A07 = AbstractC41770Iem.A07(c120985dq3);
                            C120985dq c120985dq4 = c37608Gh3.A00;
                            if (c120985dq4 != null) {
                                Boolean A06 = AbstractC41770Iem.A06(c120985dq4);
                                C120985dq c120985dq5 = c37608Gh3.A00;
                                if (c120985dq5 != null) {
                                    ImageUrl A01 = AbstractC41770Iem.A01(c120985dq5);
                                    if (clipsViewerSource != ClipsViewerSource.A28 && clipsViewerSource != ClipsViewerSource.A27) {
                                        if (clipsViewerSource != ClipsViewerSource.A2G && clipsViewerSource != ClipsViewerSource.A2F) {
                                            clipsMashupType = null;
                                        } else {
                                            clipsMashupType = ClipsMashupType.A0A;
                                        }
                                    } else {
                                        clipsMashupType = ClipsMashupType.A0B;
                                    }
                                    C14360o3.A0B(A00, 7);
                                    C37855Gl9.A04(abstractC59962oe, fragmentActivity, A00, clipsMashupType, interfaceC60442pS, userSession, A01, c38321qM, null, c37855Gl9, A06, num, str2, A08, A09, A07);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A03(InterfaceC84163p3 interfaceC84163p3, C54842OMn c54842OMn, C37608Gh3 c37608Gh3) {
        Context context;
        EnumC39627Hel enumC39627Hel;
        if (interfaceC84163p3 == null) {
            context = c37608Gh3.A05.getContext();
        } else {
            AbstractC59962oe abstractC59962oe = c37608Gh3.A05;
            c54842OMn.A02 = AbstractC166997dE.A0q(AbstractC166997dE.A0N(abstractC59962oe), 2131972169);
            ArrayList A1E = AbstractC166987dD.A1E();
            if (interfaceC84163p3.getHasBeenMashedUp() && interfaceC84163p3.getCanToggleMashupsAllowed()) {
                A1E.add(EnumC39627Hel.A1f);
            }
            C120985dq c120985dq = c37608Gh3.A00;
            if (c120985dq == null) {
                C14360o3.A0F("clipsItem");
                throw C00O.createAndThrow();
            }
            if (C76493bt.A0E(c120985dq, interfaceC84163p3, c37608Gh3.A0B)) {
                if (interfaceC84163p3.getMashupsAllowed()) {
                    enumC39627Hel = EnumC39627Hel.A23;
                } else {
                    enumC39627Hel = EnumC39627Hel.A2D;
                }
                A1E.add(enumC39627Hel);
            }
            c37608Gh3.A0G(c54842OMn, A1E);
            if (A1E.isEmpty()) {
                context = abstractC59962oe.getContext();
            } else {
                c37608Gh3.A0C(null, c54842OMn);
                return;
            }
        }
        C9GR.A0F(context, "remix_unavailable", 2131956197);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r2 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r3 != null) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A06(X.C37608Gh3 r5, java.lang.Boolean r6, java.lang.Boolean r7) {
        /*
            X.1qM r0 = r5.A02
            java.lang.String r4 = "media"
            if (r0 == 0) goto L4e
            X.1rF r0 = r0.A0C
            X.JKO r1 = r0.BQQ()
            if (r6 != 0) goto L45
            if (r1 == 0) goto L16
            com.instagram.api.schemas.MediaGiftingState r3 = r1.BQn()
            if (r3 != 0) goto L18
        L16:
            com.instagram.api.schemas.MediaGiftingState r3 = com.instagram.api.schemas.MediaGiftingState.A04
        L18:
            if (r7 != 0) goto L3c
            if (r1 == 0) goto L22
            com.instagram.api.schemas.MediaGiftCountVisibilityState r2 = r1.B9r()
            if (r2 != 0) goto L24
        L22:
            com.instagram.api.schemas.MediaGiftCountVisibilityState r2 = com.instagram.api.schemas.MediaGiftCountVisibilityState.A04
        L24:
            X.1qM r0 = r5.A02
            if (r0 == 0) goto L4e
            X.H4A r1 = new X.H4A
            r1.<init>(r2, r3)
            X.1rF r0 = r0.A0C
            r0.EYk(r1)
            X.1qM r1 = r5.A02
            if (r1 == 0) goto L4e
            com.instagram.common.session.UserSession r0 = r5.A0B
            r1.AEH(r0)
            return
        L3c:
            boolean r0 = r7.booleanValue()
            if (r0 != 0) goto L22
            com.instagram.api.schemas.MediaGiftCountVisibilityState r2 = com.instagram.api.schemas.MediaGiftCountVisibilityState.A05
            goto L24
        L45:
            boolean r0 = r6.booleanValue()
            if (r0 == 0) goto L16
            com.instagram.api.schemas.MediaGiftingState r3 = com.instagram.api.schemas.MediaGiftingState.A05
            goto L18
        L4e:
            X.C14360o3.A0F(r4)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37608Gh3.A06(X.Gh3, java.lang.Boolean, java.lang.Boolean):void");
    }

    public static final void A07(C37608Gh3 c37608Gh3, InterfaceC16620sF interfaceC16620sF, boolean z, boolean z2) {
        C196068lw.A00(c37608Gh3.A0B).A01(c37608Gh3.A0T, new C42406Iq7(interfaceC16620sF, 1, z, z2), AbstractC111324zv.A00(514));
    }

    private final void A08(boolean z) {
        String str;
        String str2 = ((BOX) new C52942bb(this.A04).A00(BOX.class)).A01;
        if (str2 == null || (str = (String) AbstractC001800i.A0J(AbstractC001900j.A0Q(str2, new char[]{'_'}, 0))) == null) {
            str = "";
        }
        C37609Gh4 c37609Gh4 = this.A0L;
        InterfaceC58202Pr8 A00 = AbstractC54314NzY.A00(c37609Gh4.A03);
        C14360o3.A07(A00);
        int Awe = A00.Awe(z);
        FragmentActivity fragmentActivity = c37609Gh4.A01;
        String A0p = AbstractC166997dE.A0p(fragmentActivity, A00.Awd(z));
        EnumC193348hE enumC193348hE = EnumC193348hE.A06;
        DialogInterfaceOnClickListenerC35446Fk3 dialogInterfaceOnClickListenerC35446Fk3 = new DialogInterfaceOnClickListenerC35446Fk3(str, c37609Gh4, 20);
        C37661Ghu.A03(c37609Gh4.A05.A00, false);
        C28482Cha.A02(dialogInterfaceOnClickListenerC35446Fk3, DialogInterfaceOnClickListenerC41833Ifn.A00, null, new DialogInterfaceOnDismissListenerC41843Ifx(c37609Gh4, 4), null, fragmentActivity, enumC193348hE, null, null, A0p, Awe, 2131957640, 2131954754);
    }

    private final void A09(boolean z) {
        Integer num;
        AbstractC166987dD.A1Z(new PZK(this, null, 24, z), AbstractC25235BEs.A0S(this.A05));
        C28221Yb A00 = C27S.A00();
        UserSession userSession = this.A0B;
        InterfaceC60442pS interfaceC60442pS = this.A0C;
        C54586O9n A01 = A00.A01(interfaceC60442pS, userSession, AbstractC25225BEi.A15(this.A0S), interfaceC60442pS.getModuleName());
        C38321qM c38321qM = this.A02;
        if (c38321qM == null) {
            C14360o3.A0F("media");
            throw C00O.createAndThrow();
        }
        String A2u = c38321qM.A2u();
        if (A2u != null) {
            LLN lln = A01.A00;
            boolean A04 = AbstractC63302u8.A00(A01.A02).A04(UserMonetizationProductType.A0A);
            Integer num2 = C05F.A03;
            if (z) {
                num = C05F.A0A;
            } else {
                num = C05F.A0B;
            }
            LLN.A03(lln, num2, num, A2u, A04, false);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    private final void A0A(boolean z) {
        Context requireContext = this.A05.requireContext();
        C38321qM c38321qM = this.A02;
        if (c38321qM == null) {
            C14360o3.A0F("media");
            throw C00O.createAndThrow();
        }
        C55220Oej.A02(requireContext, this.A0B, c38321qM, this.A0C.getModuleName(), z);
    }

    private final void A0B(boolean z) {
        Integer num;
        AbstractC166987dD.A1Z(new PZK(this, null, 25, z), AbstractC25235BEs.A0S(this.A05));
        C28221Yb A00 = C27S.A00();
        UserSession userSession = this.A0B;
        InterfaceC60442pS interfaceC60442pS = this.A0C;
        C54586O9n A01 = A00.A01(interfaceC60442pS, userSession, AbstractC25225BEi.A15(this.A0S), interfaceC60442pS.getModuleName());
        C38321qM c38321qM = this.A02;
        if (c38321qM == null) {
            C14360o3.A0F("media");
            throw C00O.createAndThrow();
        }
        String A2u = c38321qM.A2u();
        if (A2u != null) {
            LLN lln = A01.A00;
            boolean A04 = AbstractC63302u8.A00(A01.A02).A04(UserMonetizationProductType.A0A);
            Integer num2 = C05F.A03;
            if (z) {
                num = C05F.A15;
            } else {
                num = C05F.A1F;
            }
            LLN.A03(lln, num2, num, A2u, A04, false);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public final void A0C(View view, C54842OMn c54842OMn) {
        if (AbstractC166987dD.A1b(c54842OMn.A05)) {
            C37661Ghu.A03(this.A0H.A00, false);
            new OJT(c54842OMn).A00(this.A05.requireContext());
            C3DN A00 = C3DN.A00.A00(this.A04);
            if (A00 != null) {
                A00.A0R(new C33171EkI(3, this, view));
            }
        }
    }

    public final void A0E(EnumC39627Hel enumC39627Hel, C54842OMn c54842OMn) {
        String A0q = AbstractC166997dE.A0q(AbstractC166997dE.A0N(this.A05), A0V.A03(this.A0B, enumC39627Hel));
        ViewOnClickListenerC42027Ijw viewOnClickListenerC42027Ijw = new ViewOnClickListenerC42027Ijw(2, enumC39627Hel, this);
        int i = enumC39627Hel.A00;
        String A00 = C41719Idq.A00(enumC39627Hel);
        C38321qM c38321qM = this.A02;
        if (c38321qM == null) {
            C14360o3.A0F("media");
            throw C00O.createAndThrow();
        }
        float A002 = AbstractC40926IAy.A00(c38321qM, enumC39627Hel);
        C35200Ffs c35200Ffs = new C35200Ffs((View.OnClickListener) viewOnClickListenerC42027Ijw, (CharSequence) A0q, (String) null, false);
        c35200Ffs.A05 = i;
        c35200Ffs.A0A = A00;
        c35200Ffs.A00 = A002;
        c54842OMn.A05.add(c35200Ffs);
        A05(enumC39627Hel);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0162, code lost:
    
        if (r4 != true) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0F(X.EnumC39627Hel r25, X.C54842OMn r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37608Gh3.A0F(X.Hel, X.OMn, java.lang.String):void");
    }

    public C37608Gh3(FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, XDF xdf, ClipsViewerConfig clipsViewerConfig, InterfaceC60142ow interfaceC60142ow, InterfaceC31077DlK interfaceC31077DlK, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC43585JPa interfaceC43585JPa, AnonymousClass388 anonymousClass388, InterfaceC43589JPu interfaceC43589JPu, C37540Gfw c37540Gfw, ILW ilw, AbstractC37552Gg8 abstractC37552Gg8, InterfaceC31137Dmc interfaceC31137Dmc, InterfaceC31069DlB interfaceC31069DlB, BKZ bkz, C26914BuH c26914BuH, C37607Gh2 c37607Gh2, IG5 ig5, C37560GgG c37560GgG) {
        this.A0B = userSession;
        this.A04 = fragmentActivity;
        this.A05 = abstractC59962oe;
        this.A0C = interfaceC60442pS;
        this.A0F = interfaceC43589JPu;
        this.A0Q = ig5;
        this.A0G = c37540Gfw;
        this.A0H = ilw;
        this.A0E = anonymousClass388;
        this.A0U = abstractC37552Gg8;
        this.A09 = interfaceC31077DlK;
        this.A0K = bkz;
        this.A07 = clipsViewerConfig;
        this.A0D = interfaceC43585JPa;
        this.A0I = interfaceC31137Dmc;
        this.A0J = interfaceC31069DlB;
        this.A08 = interfaceC60142ow;
        this.A06 = xdf;
        this.A0P = c37607Gh2;
        this.A0M = c26914BuH;
        this.A0R = c37560GgG;
        this.A0L = new C37609Gh4(fragmentActivity, abstractC59962oe, userSession, c37540Gfw, ilw);
        this.A0O = new C37610Gh5(fragmentActivity, abstractC59962oe, userSession, ilw, abstractC37552Gg8);
        this.A0N = new C37611Gh6(fragmentActivity, abstractC59962oe, userSession);
        abstractC59962oe.registerLifecycleListener(new C37766Gjh(this, 6));
    }

    public static final void A02(ClipsViewerSource clipsViewerSource, C37608Gh3 c37608Gh3) {
        Context context;
        int i;
        String str;
        int ordinal = clipsViewerSource.ordinal();
        if (ordinal != 57 && ordinal != 54) {
            if (ordinal != 58 && ordinal != 60) {
                return;
            }
            context = c37608Gh3.A05.getContext();
            i = 2131956201;
            str = "sequencing_unavailable";
        } else {
            context = c37608Gh3.A05.getContext();
            i = 2131956197;
            str = "remix_unavailable";
        }
        C9GR.A0F(context, str, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    private final void A05(EnumC39627Hel enumC39627Hel) {
        UserSession userSession;
        C82G c82g;
        MU0 mu0;
        MU1 mu1;
        String A00;
        String str;
        C51411MnJ c51411MnJ;
        int ordinal = enumC39627Hel.ordinal();
        if (ordinal == 52 || ordinal == 53) {
            userSession = this.A0B;
            c82g = C82G.A0Q;
            mu0 = MU0.UNAVAILABLE;
            mu1 = MU1.REELS;
            C0Zx c0Zx = new C0Zx();
            C38321qM c38321qM = this.A02;
            if (c38321qM != null) {
                c0Zx.A06("media_id", c38321qM.getId());
                A00 = AbstractC111324zv.A00(157);
                str = "unavailable_reason";
                c51411MnJ = c0Zx;
                c51411MnJ.A06(str, A00);
                AbstractC50568MTz.A00(mu0, mu1, c82g, c51411MnJ, userSession);
                return;
            }
            C14360o3.A0F("media");
            throw C00O.createAndThrow();
        }
        switch (ordinal) {
            case 48:
            case 49:
            case 51:
                userSession = this.A0B;
                c82g = C82G.A0Q;
                mu0 = MU0.VIEW;
                mu1 = MU1.REELS;
                C0Zx c0Zx2 = new C0Zx();
                C38321qM c38321qM2 = this.A02;
                if (c38321qM2 != null) {
                    A00 = c38321qM2.getId();
                    str = "media_id";
                    c51411MnJ = c0Zx2;
                    c51411MnJ.A06(str, A00);
                    AbstractC50568MTz.A00(mu0, mu1, c82g, c51411MnJ, userSession);
                    return;
                }
                C14360o3.A0F("media");
                throw C00O.createAndThrow();
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
            default:
                return;
        }
    }

    public final void A0G(C54842OMn c54842OMn, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0F((EnumC39627Hel) it.next(), c54842OMn, null);
        }
    }
}
