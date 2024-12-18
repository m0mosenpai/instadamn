package X;

import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.UpcomingEvent;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

@Deprecated(message = "This will be deleted after the CTA MVVM migration is completed. During the migration, please maintain the consistency of this legacy component with ClipsCTAComponent", replaceWith = @ReplaceWith(expression = "instagram.features.clips.viewer.adapter.organic.cta.ClipsCTAComponent", imports = {}))
/* renamed from: X.BSt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25581BSt extends AbstractC51572Yf {
    public final C120985dq A00;
    public final InterfaceC31137Dmc A01;
    public final InterfaceC16820sZ A02;
    public final InterfaceC16610sE A03;
    public final C25377BKu A04;
    public final C37644Ghd A05;
    public final UserSession A06;
    public final InterfaceC60442pS A07;
    public final BVO A08;
    public final C25348BJr A09;
    public final InterfaceC30883Dhw A0A;
    public final InterfaceC31067Dl9 A0B;
    public final C37616GhB A0C;
    public final Boolean A0D;
    public final Integer A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final boolean A0d;
    public final boolean A0e;

    private final ViewOnClickListenerC77633dn A04(float f, float f2, boolean z) {
        Integer num;
        C37616GhB c37616GhB = this.A0C;
        EnumC71343Hv enumC71343Hv = EnumC71343Hv.A0H;
        if (!this.A00.A0F() || (num = this.A0E) == null) {
            num = null;
        }
        return c37616GhB.A02(enumC71343Hv, num, new C29921DHj(this, f, f2, 1, z));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x006e. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0pO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0pO, java.lang.Object] */
    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C37644Ghd c37644Ghd;
        C75113Zb c75113Zb;
        EnumC71343Hv enumC71343Hv;
        UserSession userSession;
        CT0 c5f;
        C14360o3.A0B(c76223bS, 0);
        ?? obj = new Object();
        ?? obj2 = new Object();
        C75933ay c75933ay = C51722Yv.A02;
        InterfaceC30988Djn interfaceC30988Djn = null;
        C51722Yv A0h = AbstractC25225BEi.A0h(null, AbstractC25228BEl.A0o(C05F.A04, C30170DRa.A00(obj2, obj, 33)));
        EnumC25466BOf enumC25466BOf = this.A04.A00;
        if (this.A0O && !this.A0N) {
            if (!this.A0S && enumC25466BOf != EnumC25466BOf.A0B) {
                return AbstractC76963ci.A0M(c76223bS, C9CU.A00(null, C05F.A1I, 0, AbstractC77623dm.A0D(c76223bS, R.dimen.abc_edit_text_inset_top_material)));
            }
        } else {
            ViewOnClickListenerC77633dn A04 = A04(obj.A00, obj2.A00, false);
            ViewOnClickListenerC77633dn A042 = A04(obj.A00, obj2.A00, true);
            C120985dq c120985dq = this.A00;
            C38321qM c38321qM = c120985dq.A02;
            if (c38321qM != null && (c75113Zb = (c37644Ghd = this.A05).A0E) != null) {
                if (enumC25466BOf != null) {
                    switch (enumC25466BOf.ordinal()) {
                        case 0:
                        case 1:
                            UserSession userSession2 = this.A06;
                            if (C18U.A06(AbstractC25225BEi.A0j(userSession2, 0), userSession2, 36314850430815088L)) {
                                enumC71343Hv = EnumC71343Hv.A0H;
                            } else {
                                enumC71343Hv = EnumC71343Hv.A05;
                            }
                            C51722Yv A01 = AbstractC25396BLn.A01(enumC71343Hv, c75933ay, c120985dq, userSession2, this.A07);
                            String str = this.A0H;
                            if (str == null) {
                                str = c120985dq.A06().A0b;
                            }
                            return A03(A04, A042, c76223bS, A01, A0h, c75113Zb, this.A08, str, AbstractC167007dF.A1X(c37644Ghd.A0B, EnumC39550HdM.A06));
                        case 2:
                            InterfaceC31137Dmc interfaceC31137Dmc = this.A01;
                            C27910CRv c27910CRv = new C27910CRv(this.A02, new C25344BJn(interfaceC31137Dmc, 44), new C25344BJn(interfaceC31137Dmc, 45));
                            UserSession userSession3 = this.A06;
                            C25348BJr c25348BJr = this.A09;
                            if (c25348BJr != null) {
                                interfaceC30988Djn = new C42152Im0(c25348BJr.A01, c25348BJr.A03, c25348BJr.A04, c25348BJr.A06, c25348BJr.A07, c25348BJr.A0J, c25348BJr.A0K);
                            }
                            return new C26589Bom(interfaceC30988Djn, c120985dq, c37644Ghd, userSession3, this.A07, c27910CRv, this.A0I, this.A0M);
                        case 4:
                            InterfaceC31137Dmc interfaceC31137Dmc2 = this.A01;
                            C25348BJr c25348BJr2 = this.A09;
                            if (c25348BJr2 != null) {
                                interfaceC30988Djn = c25348BJr2.A05;
                            }
                            return new C26439BmM(interfaceC30988Djn, c120985dq, c37644Ghd, this.A06, interfaceC31137Dmc2);
                        case 9:
                            if (!C76493bt.A0Z(c38321qM)) {
                                C25348BJr c25348BJr3 = this.A09;
                                if (c25348BJr3 != null) {
                                    interfaceC30988Djn = c25348BJr3.A00();
                                }
                                return new C26494BnF(interfaceC30988Djn, c120985dq, c37644Ghd, this.A06, c75113Zb, this.A01, null, false);
                            }
                            break;
                        case 10:
                            UserSession userSession4 = this.A06;
                            UpcomingEvent A2B = c38321qM.A2B(userSession4);
                            C25348BJr c25348BJr4 = this.A09;
                            if (c25348BJr4 != null) {
                                interfaceC30988Djn = c25348BJr4.A00();
                            }
                            return new C26476Bmx(interfaceC30988Djn, c120985dq, c37644Ghd, userSession4, c75113Zb, A2B, this.A01);
                        case 11:
                            return new C26374BlJ(this.A06, c38321qM, this.A01);
                        case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                            userSession = this.A06;
                            c5f = new C5G(c120985dq, userSession, this.A01);
                            return new C26548Bo7(this.A07, userSession, c5f);
                        case 14:
                            userSession = this.A06;
                            c5f = new C5F(c120985dq, c37644Ghd, userSession, this.A0A, this.A0B);
                            return new C26548Bo7(this.A07, userSession, c5f);
                    }
                }
                return A03(A04, null, c76223bS, null, null, c75113Zb, null, this.A0H, false);
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00de, code lost:
    
        if (r76.A0N == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0105, code lost:
    
        if (X.C18U.A06(r2, r1, 36326167669847776L) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x009f, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r1, 36321537697654350L) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C2WH A03(android.view.View.OnClickListener r77, android.view.View.OnClickListener r78, X.C2Z1 r79, X.C51722Yv r80, X.C51722Yv r81, X.C75113Zb r82, X.BVO r83, java.lang.String r84, boolean r85) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25581BSt.A03(android.view.View$OnClickListener, android.view.View$OnClickListener, X.2Z1, X.2Yv, X.2Yv, X.3Zb, X.BVO, java.lang.String, boolean):X.2WH");
    }

    public C25581BSt(C25377BKu c25377BKu, C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, InterfaceC60442pS interfaceC60442pS, BVO bvo, InterfaceC31137Dmc interfaceC31137Dmc, C25348BJr c25348BJr, InterfaceC30883Dhw interfaceC30883Dhw, InterfaceC31067Dl9 interfaceC31067Dl9, C37616GhB c37616GhB, Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16610sE interfaceC16610sE, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        this.A06 = userSession;
        this.A0L = str;
        this.A0K = str2;
        this.A00 = c120985dq;
        this.A05 = c37644Ghd;
        this.A04 = c25377BKu;
        this.A09 = c25348BJr;
        this.A0M = z;
        this.A0N = z2;
        this.A0D = bool;
        this.A0H = str3;
        this.A02 = interfaceC16820sZ;
        this.A07 = interfaceC60442pS;
        this.A0C = c37616GhB;
        this.A0G = str4;
        this.A0F = str5;
        this.A0O = z3;
        this.A0P = z4;
        this.A0I = str6;
        this.A0Q = z5;
        this.A0d = z6;
        this.A0S = z7;
        this.A0V = z8;
        this.A0U = z9;
        this.A0T = z10;
        this.A0E = num;
        this.A0J = str7;
        this.A01 = interfaceC31137Dmc;
        this.A0e = z11;
        this.A08 = bvo;
        this.A0X = z12;
        this.A0b = z13;
        this.A0Y = z14;
        this.A0a = z15;
        this.A0W = z16;
        this.A0Z = z17;
        this.A0c = z18;
        this.A0R = z19;
        this.A03 = interfaceC16610sE;
        this.A0A = interfaceC30883Dhw;
        this.A0B = interfaceC31067Dl9;
    }
}
