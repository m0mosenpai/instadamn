package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.share.facebook.model.FBReelsAudienceType;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class NKM extends OX6 {
    public C47Z A00;
    public final UserSession A01;
    public final AbstractC55082Oac A02;
    public final C51022MgU A03;
    public final C8B7 A04;
    public final C05A A05;
    public final C0UO A06;
    public final C0UO A07;
    public final C0UO A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final CallerContext A0C;
    public final C50899MeU A0D;
    public final String A0E;
    public final C05A A0F;

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0137, code lost:
    
        if (r25 != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0143, code lost:
    
        if (r24 != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x019e, code lost:
    
        if (r11.isEmpty() != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x01a0, code lost:
    
        r29 = X.C05F.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x01c6, code lost:
    
        r9 = r11.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x01ce, code lost:
    
        if (r9.hasNext() == false) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x01d0, code lost:
    
        r7 = (X.C5JD) r9.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x01dc, code lost:
    
        if (X.C14360o3.A0K(r7.A0A, "original_remix") == false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x01e0, code lost:
    
        if (r7.A0I == false) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x01e8, code lost:
    
        if (X.AbstractC166997dE.A1Z(r7.A07, true) == false) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x01ea, code lost:
    
        r29 = X.C05F.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x01c3, code lost:
    
        if (r9 != false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005e, code lost:
    
        if (X.AbstractC166987dD.A1b(r0) != true) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009c, code lost:
    
        if (r7.A5i != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00cd, code lost:
    
        if (r1 != false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.NKM r40) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NKM.A00(X.NKM):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.NKM r10) {
        /*
            Method dump skipped, instructions count: 709
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NKM.A01(X.NKM):void");
    }

    public final C51624MrH A08() {
        return C200108tF.A01(this.A0C, this.A03.A00);
    }

    public final EnumC53249Ngn A09(boolean z) {
        AbstractC53534Nm0 abstractC53534Nm0;
        C51624MrH A08;
        C51760Mtj c51760Mtj = (C51760Mtj) this.A06.getValue();
        if (z) {
            abstractC53534Nm0 = (AbstractC53534Nm0) c51760Mtj.A00;
            if (A08() == null || (A08 = A08()) == null || A08.A01 == FBReelsAudienceType.A07) {
                return EnumC53249Ngn.A0C;
            }
        } else {
            abstractC53534Nm0 = (AbstractC53534Nm0) c51760Mtj.A01;
        }
        if (abstractC53534Nm0 == null) {
            return EnumC53249Ngn.A0E;
        }
        if (abstractC53534Nm0 instanceof NVh) {
            return ((NVh) abstractC53534Nm0).A00();
        }
        return null;
    }

    public final void A0A(EnumC53249Ngn enumC53249Ngn, boolean z) {
        C22C A01 = AnonymousClass229.A01(this.A01);
        EnumC50631MWs enumC50631MWs = EnumC50631MWs.A0L;
        MYO A02 = C55183Odo.A02(this.A00);
        EnumC53377NjS enumC53377NjS = enumC53249Ngn.A00;
        Boolean valueOf = Boolean.valueOf(z);
        String str = this.A0E;
        C448824s c448824s = A01.A0G;
        C14360o3.A0B(A02, 1);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c448824s.A01, "ig_camera_ui_tool_impression");
        if (A0f.isSampled()) {
            MSW.A1N(C81X.A2G, A0f);
            MSW.A1V(A0f, "IG_CAMERA_CLIPS_SHARE_TO_FACEBOOK_UNAVAILABLE");
            C22M c22m = c448824s.A04;
            AbstractC166987dD.A1S(A0f, MSX.A0f(c22m));
            AbstractC167017dG.A1A(c22m.A09, A0f);
            MSZ.A1A(enumC50631MWs, A0f);
            A0f.A8R(A02, "media_source");
            AbstractC167007dF.A11(A0f, c448824s);
            AbstractC31171DnF.A1D(A0f, str);
            A0f.A8R(enumC53377NjS, "reason");
            A0f.A7v("is_crosspost", valueOf);
            AbstractC167017dG.A1C(A0f);
        }
    }

    public final void A0B(List list) {
        boolean z;
        boolean z2;
        InterfaceC19610xo ARD;
        FBReelsAudienceType fBReelsAudienceType;
        Object obj;
        C47Z c47z = this.A00;
        if (c47z != null) {
            UserSession userSession = this.A01;
            C51674Ms5 c51674Ms5 = (C51674Ms5) this.A08.getValue();
            C51760Mtj c51760Mtj = (C51760Mtj) this.A06.getValue();
            C51624MrH A08 = A08();
            c47z.A1y = false;
            c47z.A23 = false;
            List list2 = null;
            c47z.A3R = null;
            c47z.A2C = null;
            c47z.A4N = null;
            boolean z3 = list instanceof Collection;
            if (!z3 || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AbstractC53462Nkp abstractC53462Nkp = (AbstractC53462Nkp) it.next();
                    if ((abstractC53462Nkp instanceof NJV) && ((NJV) abstractC53462Nkp).A00 == C05F.A0H) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (!z3 || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    AbstractC53462Nkp abstractC53462Nkp2 = (AbstractC53462Nkp) it2.next();
                    if ((abstractC53462Nkp2 instanceof NJV) && ((NJV) abstractC53462Nkp2).A00 == C05F.A0E) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            C46552Bt A00 = AbstractC46542Bs.A00(userSession);
            Object obj2 = null;
            if (z && c51674Ms5 != null && c51674Ms5.A02 == C05F.A00 && c51674Ms5.A04 && A08 != null && (fBReelsAudienceType = A08.A01) != FBReelsAudienceType.A07) {
                if (c51760Mtj != null) {
                    obj = c51760Mtj.A00;
                } else {
                    obj = null;
                }
                if ((obj instanceof C52740NVi) && C200108tF.A03(null, userSession)) {
                    c47z.A23 = true;
                    c47z.A3R = A08.A03;
                    c47z.A2C = C05F.A01;
                    if (c51674Ms5.A03) {
                        list2 = AbstractC166987dD.A1J("AUTO_CROSSPOST_SETTING");
                    }
                    c47z.A4N = list2;
                    if (C18U.A06(C06090Tz.A05, userSession, 36320107470790721L)) {
                        c47z.A1n = fBReelsAudienceType;
                    }
                    ARD = A00.A04.ARD();
                    ARD.E7D("PREFERENCE_REELS_RECOMMEND_ON_FACEBOOK_ENABLED_CONSECUTIVE_SHARE_COUNT", 0);
                    ARD.apply();
                }
            }
            if (z2 && c51674Ms5 != null && c51674Ms5.A02 == C05F.A0Y && c51674Ms5.A05) {
                if (c51760Mtj != null) {
                    obj2 = c51760Mtj.A01;
                }
                if ((obj2 instanceof C52740NVi) && C173057nJ.A00.A00(userSession, true)) {
                    c47z.A1y = true;
                    InterfaceC19630xq interfaceC19630xq = A00.A04;
                    int i = interfaceC19630xq.getInt("PREFERENCE_REELS_RECOMMEND_ON_FACEBOOK_ENABLED_CONSECUTIVE_SHARE_COUNT", 0) + 1;
                    ARD = interfaceC19630xq.ARD();
                    ARD.E7D("PREFERENCE_REELS_RECOMMEND_ON_FACEBOOK_ENABLED_CONSECUTIVE_SHARE_COUNT", i);
                    ARD.apply();
                }
            }
            ARD = A00.A04.ARD();
            ARD.E7D("PREFERENCE_REELS_RECOMMEND_ON_FACEBOOK_ENABLED_CONSECUTIVE_SHARE_COUNT", 0);
            ARD.apply();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NKM(CallerContext callerContext, UserSession userSession, AbstractC55082Oac abstractC55082Oac, C51022MgU c51022MgU, C50899MeU c50899MeU, C8B7 c8b7, String str, boolean z, boolean z2, boolean z3) {
        super(abstractC55082Oac);
        AbstractC25234BEr.A1R(userSession, c51022MgU, c50899MeU, c8b7, str);
        C14360o3.A0B(callerContext, 7);
        this.A02 = abstractC55082Oac;
        this.A01 = userSession;
        this.A03 = c51022MgU;
        this.A0D = c50899MeU;
        this.A04 = c8b7;
        this.A0E = str;
        this.A0C = callerContext;
        this.A09 = z;
        this.A0A = z2;
        this.A0B = z3;
        this.A08 = c51022MgU.A04;
        this.A07 = c50899MeU.A02;
        this.A05 = C10E.A00(null);
        C008002u A1H = AbstractC25225BEi.A1H(new C51760Mtj(20, (Object) null, (Object) null, (Object) null));
        this.A0F = A1H;
        this.A06 = A1H;
        AbstractC166987dD.A1Z(new MCE(this, null, 12), AbstractC141776au.A00(c51022MgU));
    }
}
