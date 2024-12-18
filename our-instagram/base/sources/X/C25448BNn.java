package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import com.facebook.R;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.BNn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25448BNn extends AbstractC51572Yf {
    public final C25377BKu A00;
    public final ClipsViewerConfig A01;
    public final C120985dq A02;
    public final C37644Ghd A03;
    public final UserSession A04;
    public final C3PD A05;
    public final InterfaceC60442pS A06;
    public final InterfaceC31137Dmc A07;
    public final C37616GhB A08;
    public final boolean A09;
    public final boolean A0A;
    public final EnumC25478BOr A0B;
    public final InterfaceC30980Djb A0C;
    public final InterfaceC30865Dhe A0D;

    public static final void A07(View.OnClickListener onClickListener, C2Z1 c2z1, CharSequence charSequence, C14510oO c14510oO, C15370ps c15370ps) {
        c14510oO.A00 = false;
        ((SpannableStringBuilder) c15370ps.A00).append((CharSequence) AbstractC77623dm.A0F(c2z1, 2131961132));
        int length = ((SpannableStringBuilder) c15370ps.A00).length();
        ((SpannableStringBuilder) c15370ps.A00).append(charSequence);
        ((SpannableStringBuilder) c15370ps.A00).setSpan(new C50763MbU(onClickListener, 8), length, ((SpannableStringBuilder) c15370ps.A00).length(), 17);
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        InterfaceC30980Djb interfaceC30980Djb;
        C14360o3.A0B(c76223bS, 0);
        C120985dq c120985dq = this.A02;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            String moduleName = this.A06.getModuleName();
            C77123cy A00 = AbstractC77063cs.A00(c76223bS, C25450BNp.A00);
            UserSession userSession = this.A04;
            C14360o3.A0B(userSession, 0);
            ((C43746JWg) userSession.A01(C43746JWg.class, new MHO(userSession, 12))).A00 = "false";
            View.OnClickListener A02 = this.A08.A02(EnumC71343Hv.A0f, null, DRP.A00(this, 0));
            InterfaceC30865Dhe interfaceC30865Dhe = this.A0D;
            if (!(interfaceC30865Dhe instanceof C25472BOl) && (interfaceC30865Dhe instanceof C26245BjE)) {
                int i = 0;
                ArrayList A1E = AbstractC166987dD.A1E();
                C26245BjE c26245BjE = (C26245BjE) interfaceC30865Dhe;
                Iterator it = c26245BjE.A00.iterator();
                while (it.hasNext()) {
                    A1E.add(A03(A02, A00, c76223bS, c38321qM, (EnumC25478BOr) it.next(), moduleName, true));
                }
                for (InterfaceC30979Dja interfaceC30979Dja : c26245BjE.A01) {
                    i = interfaceC30979Dja.BXx();
                    if (interfaceC30979Dja instanceof BPQ) {
                        Context context = c76223bS.A05.A0C;
                        C14360o3.A07(context);
                        BPQ bpq = (BPQ) interfaceC30979Dja;
                        CharSequence A002 = BHX.A00(context, bpq.A03);
                        Drawable A0E = AbstractC77623dm.A0E(c76223bS, bpq.A01);
                        A0E.setColorFilter(C3DY.A00(c76223bS.BoZ().A02(R.color.audio_bar_action_color_enabled)));
                        long A07 = AbstractC77623dm.A07(c76223bS);
                        C75933ay c75933ay = C51722Yv.A02;
                        BNU bnu = new BNU(A0E, null, new C51722Yv(new C51722Yv(new C51722Yv(new C51722Yv(null, new C9CU(C05F.A00, 0, A07)), new C9CU(C05F.A01, 0, A07)), new C9CT(C05F.A0C, 0.0f, 1)), new C9CU(C05F.A08, 0, 9221401712017801224L)), false);
                        C51722Yv c51722Yv = new C51722Yv(null, new C9CU(C05F.A09, 0, AbstractC77623dm.A04(c76223bS)));
                        long A0B = AbstractC77623dm.A0B(c76223bS);
                        Integer num = C05F.A0u;
                        C51722Yv c51722Yv2 = new C51722Yv(c51722Yv, new C9CU(num, 0, A0B));
                        C2Z0 c2z0 = new C2Z0(c76223bS.ArD(), new ArrayList());
                        c2z0.A00(bnu);
                        c2z0.A00(A05(TextUtils.TruncateAt.END, ViewOnClickListenerC28664ClC.A00, null, c2z0, new C51722Yv(null, new C9CU(num, 0, AbstractC77623dm.A06(c2z0))), A002, Integer.valueOf(R.attr.igds_color_secondary_text_on_media), BRX.A00, BRW.A00, 0, true, false, false, false, false));
                        A1E.add(AbstractC76963ci.A0H(c2z0, c76223bS, c51722Yv2));
                    }
                }
                if (AbstractC166987dD.A1b(AbstractC001800i.A0X(A1E)) && (interfaceC30980Djb = this.A0C) != null) {
                    C37644Ghd c37644Ghd = this.A03;
                    if (!c37644Ghd.A0R) {
                        int A06 = c37644Ghd.A06();
                        InterfaceC31137Dmc interfaceC31137Dmc = this.A07;
                        InterfaceC89793zL interfaceC89793zL = C26568BoR.A09;
                        return new C26568BoR(c120985dq, c37644Ghd, userSession, c38321qM, interfaceC31137Dmc, interfaceC30980Djb, AbstractC001800i.A0X(A1E), A06, i);
                    }
                }
            }
            return A03(A02, A00, c76223bS, c38321qM, this.A0B, moduleName, false);
        }
        throw AbstractC166997dE.A0g();
    }

    private final C2WH A04(View.OnClickListener onClickListener, C51322Xf c51322Xf, C77123cy c77123cy, C2Z1 c2z1, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, boolean z) {
        CharSequence A0F = AbstractC77623dm.A0F(c2z1, i);
        Drawable A0E = AbstractC77623dm.A0E(c2z1, i2);
        AbstractC25233BEq.A10(A0E, c2z1, R.color.fundraiser_sticker_donate_button_background_color);
        long A07 = AbstractC77623dm.A07(c2z1);
        C75933ay c75933ay = C51722Yv.A02;
        Integer num = C05F.A00;
        BNU bnu = new BNU(A0E, null, C9CU.A00(AbstractC25230BEn.A0d(AbstractC25234BEr.A0L(null, num, 0, A07), C05F.A0C, 0.0f, 1), C05F.A08, 0, 9221401712017801224L), false);
        C51722Yv A00 = C9CU.A00(null, C05F.A09, 0, AbstractC77623dm.A04(c2z1));
        long A0B = AbstractC77623dm.A0B(c2z1);
        Integer num2 = C05F.A0u;
        C51722Yv A0e = AbstractC25230BEn.A0e(C9CU.A00(A00, num2, 0, A0B), num, DRY.A00(interfaceC16820sZ, c77123cy, 7), null);
        C2Z0 A11 = AbstractC25232BEp.A11(bnu, c2z1.ArD());
        return AbstractC25226BEj.A0k(A05(TextUtils.TruncateAt.END, onClickListener, c51322Xf, A11, C9CU.A00(null, num2, 0, AbstractC77623dm.A06(A11)), A0F, Integer.valueOf(R.attr.igds_color_secondary_text_on_media), BRX.A00, BRW.A00, 0, true, false, false, false, z), A11, c2z1, A0e);
    }

    private final C51682Yq A05(TextUtils.TruncateAt truncateAt, View.OnClickListener onClickListener, C51322Xf c51322Xf, C2Z1 c2z1, C51722Yv c51722Yv, CharSequence charSequence, Integer num, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Integer num2;
        long A0B;
        long j;
        long A0B2;
        int i2;
        C51722Yv c51722Yv2 = null;
        if (this.A0D instanceof C26245BjE) {
            num2 = Integer.valueOf(R.attr.igds_color_secondary_text_on_media);
        } else {
            num2 = null;
        }
        C51722Yv c51722Yv3 = C51722Yv.A02;
        if (charSequence != null) {
            c51722Yv3 = C9CV.A00(null, C05F.A0N, charSequence, 0);
        }
        if (z2) {
            A0B = 9221401712017801216L;
        } else {
            A0B = AbstractC77623dm.A0B(c2z1);
        }
        if (z3) {
            j = 9221401712017801216L;
        } else {
            j = 9221401712017801224L;
        }
        C9CU A0n = AbstractC25225BEi.A0n(C05F.A08, 0, j);
        if (c51722Yv3 == c51722Yv3) {
            c51722Yv3 = null;
        }
        C51722Yv A0S = AbstractC25233BEq.A0S(c51722Yv3, A0n, 0, A0B);
        if (z4) {
            A0B2 = AbstractC25229BEm.A0D();
        } else {
            A0B2 = AbstractC77623dm.A0B(c2z1);
        }
        C51722Yv A00 = C9CV.A00(C9CU.A00(A0S, C05F.A0u, 0, A0B2), C05F.A1F, DRP.A00(onClickListener, 1), 4);
        DRP A002 = DRP.A00(interfaceC16660sJ, 2);
        Integer num3 = C05F.A00;
        C51722Yv A0e = AbstractC25230BEn.A0e(A00, num3, A002, null);
        if (i != 0) {
            A0e = C9CV.A00(A0e, C05F.A0B, Integer.valueOf(i), 4);
        }
        C51722Yv A003 = C9CV.A00(A0e, C05F.A04, DRP.A00(interfaceC16660sJ2, 3), 4).A00(c51722Yv);
        if (z5) {
            c51722Yv2 = AbstractC25230BEn.A0d(null, C05F.A0C, 0.0f, 1);
        }
        C51722Yv A004 = A003.A00(c51722Yv2);
        C2XE ArD = c2z1.ArD();
        Context context = ArD.A0C;
        if (num != null) {
            i2 = num.intValue();
        } else if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = R.attr.igds_color_primary_text_on_media;
        }
        int A03 = AbstractC25232BEp.A03(context, c2z1, i2);
        long A0r = AbstractC25232BEp.A0r(12.0f);
        UserSession userSession = this.A04;
        long A04 = AbstractC25449BNo.A04(userSession);
        int A02 = AbstractC25449BNo.A02(c2z1, userSession);
        long A05 = AbstractC25449BNo.A05(userSession);
        Integer A06 = AbstractC25449BNo.A06(c2z1, userSession);
        Typeface typeface = Typeface.DEFAULT;
        long A0D = AbstractC25229BEm.A0D();
        C77723dw A0g = AbstractC25233BEq.A0g(ArD, charSequence, A03);
        AbstractC25230BEn.A1K(A0g, c2z1.BoZ(), 0, A0r);
        A0g.A0T(typeface);
        A0g.A0P(A02);
        AbstractC25234BEr.A18(A0g, c2z1, AbstractC25228BEl.A0A(c2z1, A04), A0D);
        AbstractC25234BEr.A1A(A0g, c2z1.BoZ(), A06, A05);
        A0g.A0X(num3);
        AbstractC25234BEr.A1E(A0g, num3, 0, z);
        AbstractC25229BEm.A1F(A0g);
        A0g.A0U(truncateAt);
        return AbstractC25230BEn.A0g(c51322Xf, A004, A0g);
    }

    private final C51682Yq A06(View.OnClickListener onClickListener, C2Z1 c2z1, CharSequence charSequence, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        return A05(TextUtils.TruncateAt.END, onClickListener, null, c2z1, null, charSequence, null, interfaceC16660sJ, interfaceC16660sJ2, 0, true, false, false, false, false);
    }

    public C25448BNn(C25377BKu c25377BKu, ClipsViewerConfig clipsViewerConfig, C120985dq c120985dq, C37644Ghd c37644Ghd, UserSession userSession, C3PD c3pd, InterfaceC60442pS interfaceC60442pS, InterfaceC31137Dmc interfaceC31137Dmc, EnumC25478BOr enumC25478BOr, InterfaceC30980Djb interfaceC30980Djb, InterfaceC30865Dhe interfaceC30865Dhe, C37616GhB c37616GhB, boolean z, boolean z2) {
        AbstractC25234BEr.A1R(userSession, interfaceC60442pS, c37644Ghd, c25377BKu, clipsViewerConfig);
        AbstractC167007dF.A1I(interfaceC31137Dmc, 7, c37616GhB);
        AbstractC25229BEm.A1O(c3pd, 10, enumC25478BOr);
        this.A02 = c120985dq;
        this.A04 = userSession;
        this.A06 = interfaceC60442pS;
        this.A03 = c37644Ghd;
        this.A00 = c25377BKu;
        this.A01 = clipsViewerConfig;
        this.A07 = interfaceC31137Dmc;
        this.A08 = c37616GhB;
        this.A05 = c3pd;
        this.A09 = z;
        this.A0D = interfaceC30865Dhe;
        this.A0C = interfaceC30980Djb;
        this.A0A = z2;
        this.A0B = enumC25478BOr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0421, code lost:
    
        if (r1 != null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0428, code lost:
    
        if (r4 != null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0112, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r3, 36326064590763630L) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02a2, code lost:
    
        if (X.AbstractC25381BKy.A02(r3, r39.A04) == false) goto L77;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [X.2Xf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v20, types: [X.0oO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [X.0oO, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.AbstractC50812Vc A03(android.view.View.OnClickListener r40, X.C77123cy r41, X.C2Z1 r42, X.C38321qM r43, X.EnumC25478BOr r44, java.lang.String r45, boolean r46) {
        /*
            Method dump skipped, instructions count: 1466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25448BNn.A03(android.view.View$OnClickListener, X.3cy, X.2Z1, X.1qM, X.BOr, java.lang.String, boolean):X.2Vc");
    }
}
