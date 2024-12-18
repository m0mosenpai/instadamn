package X;

import android.content.Context;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;

/* renamed from: X.GqL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38154GqL extends AbstractC154286wd {
    public boolean A00;
    public final /* synthetic */ C37934GmW A01;
    public final /* synthetic */ C93Z A02;
    public final /* synthetic */ C62112sC A03;
    public final /* synthetic */ boolean A04;

    public C38154GqL(C37934GmW c37934GmW, C93Z c93z, C62112sC c62112sC, boolean z) {
        this.A01 = c37934GmW;
        this.A02 = c93z;
        this.A03 = c62112sC;
        this.A04 = z;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x093b  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x094b  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0958  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x09c6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:433:0x0956 -> B:423:0x0939). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:456:0x0991 -> B:446:0x0974). Please report as a decompilation issue!!! */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r46) {
        /*
            Method dump skipped, instructions count: 2654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38154GqL.onSuccess(java.lang.Object):void");
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        Integer num;
        String localizedMessage;
        int A03 = C0f9.A03(1136989116);
        C14360o3.A0B(abstractC115105If, 0);
        C37934GmW c37934GmW = this.A01;
        C38136Gq3 c38136Gq3 = c37934GmW.A03;
        if (c38136Gq3 != null) {
            C93Z c93z = this.A02;
            System.currentTimeMillis();
            C38135Gq2 c38135Gq2 = c38136Gq3.A00;
            AbstractC37836Gkq.A01(c38135Gq2.A0D, c38135Gq2.A06, c38135Gq2.A09.A02, c38135Gq2.A0E, OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE);
            Throwable A01 = abstractC115105If.A01();
            if (A01 != null && (localizedMessage = A01.getLocalizedMessage()) != null) {
                c38135Gq2.A05.A00.A07(localizedMessage);
            } else {
                c38135Gq2.A05.A00.A01();
            }
            if (!c38135Gq2.A03) {
                c38135Gq2.A03 = true;
            }
            C38082GpB c38082GpB = c38135Gq2.A0A;
            boolean z = c93z.A0E;
            boolean z2 = c93z.A0I;
            if (z) {
                if (!z2) {
                    num = C05F.A00;
                } else {
                    num = C05F.A0N;
                }
            } else {
                num = C05F.A0C;
            }
            C61712rY c61712rY = c38082GpB.A08;
            String str = c38082GpB.A09;
            c61712rY.A01(null, num, C05F.A1I, str);
            c61712rY.A03(null, num, str);
            C69533Vqx c69533Vqx = c38135Gq2.A00;
            if (c69533Vqx != null) {
                C38P c38p = c69533Vqx.A00;
                if (c38p.isResumed()) {
                    C9GR.A01(c38p.getActivity(), "could_not_refresh_feed", 2131956848, 0);
                }
                C65823Tug c65823Tug = c69533Vqx.A00.A06;
                if (c65823Tug == null) {
                    AbstractC37300Gc1.A0a();
                    throw C00O.createAndThrow();
                }
                c65823Tug.A0E.update();
            }
        }
        C62112sC c62112sC = this.A03;
        if (c62112sC != null) {
            c62112sC.A00();
        }
        C38155GqM A00 = AbstractC38151GqI.A00(c37934GmW.A0D);
        C93Z c93z2 = this.A02;
        A00.A01(abstractC115105If, c93z2);
        if (c93z2.A0F) {
            c37934GmW.A0H.A00.markerEnd(480321640, (short) 3);
        }
        EnumC74603Ws enumC74603Ws = EnumC74603Ws.A04;
        java.util.Set set = c37934GmW.A07;
        if (set != null) {
            c37934GmW.A0N.FCF(enumC74603Ws, set);
        }
        C0f9.A0A(-1178259421, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        boolean z;
        int i;
        int A03 = C0f9.A03(2062616783);
        C37934GmW c37934GmW = this.A01;
        C38136Gq3 c38136Gq3 = c37934GmW.A03;
        if (c38136Gq3 != null) {
            C38135Gq2 c38135Gq2 = c38136Gq3.A00;
            AbstractC37836Gkq.A01(c38135Gq2.A0D, c38135Gq2.A06, c38135Gq2.A09.A02, c38135Gq2.A0E, "success");
            C69533Vqx c69533Vqx = c38135Gq2.A00;
            if (c69533Vqx != null) {
                C65823Tug c65823Tug = c69533Vqx.A00.A06;
                if (c65823Tug == null) {
                    AbstractC37300Gc1.A0a();
                    throw C00O.createAndThrow();
                }
                C65823Tug.A00(c65823Tug, false, true);
            }
        }
        UserSession userSession = c37934GmW.A0D;
        AbstractC38151GqI.A00(userSession);
        C93Z c93z = this.A02;
        int i2 = c93z.A01;
        if (AbstractC38151GqI.A01(i2)) {
            C006802i.A0p.markerPoint(1011615852, i2, "GRID_RESPONSE_RECEIVED");
        }
        if (c93z.A0F) {
            z = true;
            if (!c37934GmW.A09 && (i = AbstractC166987dD.A0x(userSession).getInt("explore_nonpersonalized_toast_shown_count", 0)) < 3) {
                C146106i8 A0K = AbstractC31171DnF.A0K();
                Context context = c37934GmW.A0A;
                AbstractC25226BEj.A1N(context, A0K, 2131962010);
                A0K.A0I = context.getString(2131962011);
                A0K.A06();
                AbstractC25233BEq.A1F(A0K);
                AbstractC167007dF.A18(AbstractC23021Ah.A00(userSession).A01, "explore_nonpersonalized_toast_shown_count", i + 1);
            }
        } else {
            z = false;
        }
        c37934GmW.A09 = z;
        C0f9.A0A(-1921352393, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        C69533Vqx c69533Vqx;
        String str;
        int A03 = C0f9.A03(1523443744);
        C37934GmW c37934GmW = this.A01;
        C38155GqM A00 = AbstractC38151GqI.A00(c37934GmW.A0D);
        C93Z c93z = this.A02;
        A00.A03(c93z, Integer.valueOf(c37934GmW.A0G.A01.A03.size()));
        if (c93z.A0F) {
            Integer num = c93z.A03;
            if (num == C05F.A0C) {
                str = c37934GmW.A0Q;
            } else if (num == C05F.A0N) {
                str = c37934GmW.A0P;
            } else {
                str = c37934GmW.A0O;
            }
            C38134Gq1 c38134Gq1 = c37934GmW.A0H;
            C14360o3.A0B(str, 0);
            C006802i c006802i = c38134Gq1.A00;
            c006802i.markerStart(480321640);
            c006802i.markerPoint(480321640, "RESPONSE_SENT");
            c006802i.markerAnnotate(480321640, "FETCH_REASON", str);
        }
        System.currentTimeMillis();
        C38136Gq3 c38136Gq3 = c37934GmW.A03;
        if (c38136Gq3 != null) {
            C38135Gq2 c38135Gq2 = c38136Gq3.A00;
            c38135Gq2.A05.A00.A04();
            if (AbstractC167007dF.A1Z(c38135Gq2.A0H) && (c69533Vqx = c38135Gq2.A00) != null) {
                C65823Tug c65823Tug = c69533Vqx.A00.A06;
                if (c65823Tug == null) {
                    AbstractC37300Gc1.A0a();
                    throw C00O.createAndThrow();
                }
                c65823Tug.A0E.update();
            }
        }
        C62112sC c62112sC = this.A03;
        if (c62112sC != null) {
            c62112sC.A01();
        }
        C0f9.A0A(-1967879209, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(-701001945);
        C0f9.A0A(-1993835369, C0f9.A03(-223822841));
        C0f9.A0A(342919278, A03);
    }
}
