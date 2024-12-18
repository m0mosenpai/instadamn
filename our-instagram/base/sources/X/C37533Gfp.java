package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;

/* renamed from: X.Gfp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37533Gfp extends AbstractC64162vb {
    public static final InterfaceC08100bW A0D = AbstractC31175DnJ.A0B();
    public C120435cm A00;
    public final Context A01;
    public final IntentAwareAdsInfo A02;
    public final UserSession A03;
    public final InterfaceC60442pS A04;
    public final String A05;
    public final InterfaceC09390do A06;
    public final boolean A07;
    public final boolean A08;
    public final FragmentActivity A09;
    public final C30W A0A;
    public final InterfaceC43589JPu A0B;
    public final String A0C;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C37533Gfp(android.content.Context r5, androidx.fragment.app.FragmentActivity r6, com.instagram.api.schemas.IntentAwareAdsInfo r7, X.C1BX r8, com.instagram.common.session.UserSession r9, X.C30W r10, X.InterfaceC60442pS r11, X.InterfaceC43589JPu r12, java.lang.String r13, java.lang.String r14) {
        /*
            r4 = this;
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36321898472482692(0x810a9300052784, double:3.0334530783192805E-306)
            boolean r0 = X.C18U.A06(r2, r9, r0)
            if (r0 != 0) goto L4f
            X.2x4 r0 = new X.2x4
            r0.<init>()
        L12:
            X.2t9 r0 = (X.InterfaceC62702t9) r0
            r4.<init>(r8, r0)
            r4.A0C = r13
            r4.A05 = r14
            r4.A04 = r11
            r4.A0A = r10
            r4.A03 = r9
            r4.A0B = r12
            r4.A01 = r5
            r4.A02 = r7
            r4.A09 = r6
            X.0dv r3 = X.EnumC09460dv.A02
            r1 = 13
            X.J8Z r0 = new X.J8Z
            r0.<init>(r4, r1)
            X.0do r0 = X.AbstractC09440dt.A00(r3, r0)
            r4.A06 = r0
            r0 = 36315593460420022(0x8104d700040db6, double:3.029465763302602E-306)
            boolean r0 = X.C18U.A06(r2, r9, r0)
            r4.A07 = r0
            r0 = 36315593460354485(0x8104d700030db5, double:3.0294657632611563E-306)
            boolean r0 = X.C18U.A06(r2, r9, r0)
            r4.A08 = r0
            return
        L4f:
            X.GjL r0 = X.C37746GjL.A00
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37533Gfp.<init>(android.content.Context, androidx.fragment.app.FragmentActivity, com.instagram.api.schemas.IntentAwareAdsInfo, X.1BX, com.instagram.common.session.UserSession, X.30W, X.2pS, X.JPu, java.lang.String, java.lang.String):void");
    }

    private final void A00(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        int i;
        String Aw8;
        android.net.Uri A00;
        FragmentActivity fragmentActivity;
        UserSession userSession = this.A03;
        if (C18U.A06(C06090Tz.A05, userSession, 36330741809955845L)) {
            C38321qM A0y = AbstractC25226BEj.A0y(c120985dq);
            C75113Zb c75113Zb = c37644Ghd.A0E;
            if (c75113Zb != null) {
                i = c75113Zb.A02;
            } else {
                i = 0;
            }
            Context context = this.A01;
            AndroidLink A02 = AbstractC905941u.A02(context, userSession, A0y, i, false);
            if (A02 != null && (Aw8 = A02.Aw8()) != null && (A00 = AbstractC08820cl.A00(A0D, Aw8)) != null && A00.isHierarchical()) {
                String queryParameter = A00.getQueryParameter("app_id");
                String queryParameter2 = A00.getQueryParameter("merchant_id");
                String queryParameter3 = A00.getQueryParameter("ad_id");
                String queryParameter4 = A00.getQueryParameter("ad_tracking_token");
                if (C14360o3.A0K(queryParameter, "com.bloks.www.bloks.commerce.cart.singlemerchantcart") && queryParameter2 != null && queryParameter3 != null && queryParameter4 != null && (fragmentActivity = this.A09) != null) {
                    C1XJ.A00.A0d(context, fragmentActivity, userSession, queryParameter2, queryParameter3, queryParameter4, this.A04.getModuleName());
                }
            }
        }
    }

    private final void A01(C120985dq c120985dq, C37644Ghd c37644Ghd) {
        int i;
        EnumC906041v enumC906041v;
        if (c120985dq.A0X) {
            UserSession userSession = this.A03;
            if (C18U.A06(C06090Tz.A05, userSession, 2342155183881323476L)) {
                C38321qM A0y = AbstractC25226BEj.A0y(c120985dq);
                C75113Zb c75113Zb = c37644Ghd.A0E;
                if (c75113Zb != null) {
                    i = c75113Zb.A02;
                } else {
                    i = 0;
                }
                AndroidLink A02 = AbstractC905941u.A02(this.A01, userSession, A0y, i, false);
                if (A02 != null) {
                    enumC906041v = AbstractC114965Hm.A01(A02);
                } else {
                    enumC906041v = null;
                }
                if (enumC906041v == EnumC906041v.AD_DESTINATION_SHOPPING_PDP) {
                    C120435cm c120435cm = this.A00;
                    if (c120435cm == null) {
                        c120435cm = new C120435cm(userSession);
                        this.A00 = c120435cm;
                    }
                    c120435cm.A00(null);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:204:0x03b6, code lost:
    
        if (r4 != null) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x028d A[EDGE_INSN: B:149:0x028d->B:150:0x028d BREAK  A[LOOP:0: B:142:0x0364->B:148:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x035c  */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, X.ITF] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A02(X.C120985dq r19, X.C37644Ghd r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 963
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37533Gfp.A02(X.5dq, X.Ghd, java.lang.String):void");
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        int i;
        EnumC906041v enumC906041v;
        C120985dq c120985dq = (C120985dq) obj;
        C37644Ghd c37644Ghd = (C37644Ghd) obj2;
        AbstractC167007dF.A1K(c120985dq, c37644Ghd);
        c120985dq.A06();
        A02(c120985dq, c37644Ghd, "impression");
        C38321qM A0y = AbstractC25226BEj.A0y(c120985dq);
        C75113Zb c75113Zb = c37644Ghd.A0E;
        if (c75113Zb != null) {
            i = c75113Zb.A02;
        } else {
            i = 0;
        }
        Context context = this.A01;
        UserSession userSession = this.A03;
        AndroidLink A02 = AbstractC905941u.A02(context, userSession, A0y, i, false);
        if (A02 != null) {
            enumC906041v = AbstractC114965Hm.A01(A02);
        } else {
            enumC906041v = null;
        }
        if (enumC906041v == EnumC906041v.AD_DESTINATION_DIRECT_MESSAGE) {
            C5M8.A06("REELS_AD_IMPRESSION", userSession, AbstractC25226BEj.A0y(c120985dq));
        }
        C34H.A00(C05F.A0C);
        if (c75113Zb != null && c75113Zb.A0H == 0) {
            C34H.A00(C05F.A0N);
        }
        A01(c120985dq, c37644Ghd);
        A00(c120985dq, c37644Ghd);
        C37695GiW c37695GiW = (C37695GiW) this.A06.getValue();
        if (c37695GiW != null) {
            C37695GiW.A03(c120985dq, c37644Ghd, this.A04, c37695GiW, false);
        }
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        C120985dq c120985dq = (C120985dq) obj;
        C37644Ghd c37644Ghd = (C37644Ghd) obj2;
        boolean A1a = AbstractC167017dG.A1a(c120985dq, c37644Ghd);
        A02(c120985dq, c37644Ghd, "sub_impression");
        A01(c120985dq, c37644Ghd);
        A00(c120985dq, c37644Ghd);
        C37695GiW c37695GiW = (C37695GiW) this.A06.getValue();
        if (c37695GiW != null) {
            C37695GiW.A03(c120985dq, c37644Ghd, this.A04, c37695GiW, A1a);
        }
    }
}
