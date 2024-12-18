package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LIq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47978LIq {
    public final AnonymousClass776 A00;
    public final C4KV A01;
    public final MR6 A02;
    public final Integer A03;
    public final boolean A04;
    public volatile C2EC A05;

    public static final void A00(C43707JUs c43707JUs, C47978LIq c47978LIq) {
        C4KV c4kv;
        if (c43707JUs != null && (c4kv = c47978LIq.A01) != null) {
            AnonymousClass776 anonymousClass776 = c47978LIq.A00;
            c4kv.A0B(anonymousClass776, "is_ttlc_thread", c43707JUs.A03());
            c4kv.A0B(anonymousClass776, "is_tlc_thread", c43707JUs.A03());
        }
        C4KV c4kv2 = c47978LIq.A01;
        if (c4kv2 != null) {
            c4kv2.A0C(c47978LIq.A00);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.AbstractC115105If r6) {
        /*
            r5 = this;
            boolean r4 = r6 instanceof X.C115115Ig
            java.lang.String r2 = "DirectThreadLoader"
            if (r4 != 0) goto L3e
            java.lang.String r0 = "thread fetch failed for an unknown reason"
        L8:
            X.C0K8.A0E(r2, r0)
        Lb:
            r0 = 1687(0x697, float:2.364E-42)
            java.lang.String r3 = X.MSV.A00(r0)
            if (r4 == 0) goto L22
            X.5Ig r6 = (X.C115115Ig) r6
            java.lang.Throwable r0 = r6.A01()
            if (r0 == 0) goto L35
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L1f:
            if (r0 == 0) goto L22
            r3 = r0
        L22:
            X.4KV r2 = r5.A01
            if (r2 == 0) goto L2d
            X.776 r1 = r5.A00
            java.lang.String r0 = "server"
            r2.A0A(r1, r0, r3)
        L2d:
            X.MR6 r0 = r5.A02
            if (r0 == 0) goto L34
            r0.onFailure()
        L34:
            return
        L35:
            java.lang.Object r0 = r6.A00
            X.1up r0 = (X.InterfaceC40821up) r0
            java.lang.String r0 = r0.getErrorMessage()
            goto L1f
        L3e:
            r0 = r6
            X.5Ig r0 = (X.C115115Ig) r0
            java.lang.Throwable r1 = r0.A01()
            if (r1 == 0) goto L4d
            java.lang.String r0 = "thread fetch failed because of a throwable"
            X.C0K8.A0J(r2, r0, r1)
            goto Lb
        L4d:
            java.lang.Object r0 = r0.A00
            X.1up r0 = (X.InterfaceC40821up) r0
            java.lang.String r1 = r0.getErrorMessage()
            if (r1 != 0) goto L59
            java.lang.String r1 = ""
        L59:
            int r0 = r0.getStatusCode()
            java.lang.String r0 = X.AnonymousClass001.A03(r0, r1)
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47978LIq.A01(X.5If):void");
    }

    public C47978LIq(AnonymousClass776 anonymousClass776, C4KV c4kv, MR6 mr6, Integer num, boolean z) {
        this.A02 = mr6;
        this.A04 = z;
        this.A03 = num;
        this.A01 = c4kv;
        this.A00 = anonymousClass776;
    }

    public final void A02(UserSession userSession, C43707JUs c43707JUs) {
        C81663kb FBa;
        String str;
        A00(c43707JUs, this);
        C2DS A00 = AbstractC28761aE.A00(userSession);
        A00.CoS("ThreadLoaderOnSuccess");
        if (c43707JUs == null) {
            AbstractC166987dD.A1T(C18950wb.A01, "DirectThreadLoader: threadPagedResult is null", 20134884);
            FBa = null;
        } else {
            FBa = A00.FBa(c43707JUs, c43707JUs.A0q, c43707JUs, this.A04);
        }
        this.A05 = FBa;
        C2EC c2ec = this.A05;
        if (c2ec != null) {
            A00.ELu(c2ec.BKb());
        }
        C2EC c2ec2 = this.A05;
        if (c2ec2 != null && (str = c2ec2.BKb().A00) != null && c2ec2.C7g() == 29 && AbstractC31171DnF.A1W(userSession, c2ec2.Asv()) && C18U.A06(C06090Tz.A05, userSession, 36319377330019668L)) {
            LL3.A05(userSession, this.A03, str, null);
        }
        MR6 mr6 = this.A02;
        if (mr6 != null) {
            mr6.onSuccessInBackground(this.A05);
        }
    }

    public C47978LIq() {
        this(null, null, null, null, false);
    }
}
