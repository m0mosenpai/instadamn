package com.instagram.partneranalytics.simcarrier;

import X.AbstractC09440dt;
import X.AbstractC23641Du;
import X.AnonymousClass139;
import X.AnonymousClass191;
import X.AnonymousClass194;
import X.AnonymousClass197;
import X.C05F;
import X.C06090Tz;
import X.C0f9;
import X.C12N;
import X.C14360o3;
import X.C18U;
import X.C19L;
import X.C206649Cv;
import X.C206919Dw;
import X.C218914p;
import X.C2ST;
import X.C9EQ;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import X.InterfaceC12870lZ;
import X.InterfaceC13000lm;
import X.InterfaceC23621Ds;
import X.PZG;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes2.dex */
public final class SimCarrierInfoLogger implements InterfaceC12870lZ, InterfaceC13000lm {
    public final UserSession A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final C12N A07;
    public final AnonymousClass139 A08 = new AnonymousClass139();
    public final C19L A06 = AnonymousClass194.A02(new AnonymousClass197(null));

    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf A[Catch: all -> 0x01da, TRY_LEAVE, TryCatch #3 {all -> 0x01da, blocks: (B:29:0x00a0, B:30:0x00a3, B:32:0x00bf, B:35:0x00c5, B:37:0x00d3, B:39:0x00d9, B:41:0x00ef, B:42:0x00fe, B:44:0x0104, B:45:0x011a, B:47:0x0120, B:49:0x012e, B:51:0x017f, B:53:0x0184, B:56:0x0189, B:58:0x019f, B:64:0x0087), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5 A[Catch: all -> 0x01da, TRY_ENTER, TryCatch #3 {all -> 0x01da, blocks: (B:29:0x00a0, B:30:0x00a3, B:32:0x00bf, B:35:0x00c5, B:37:0x00d3, B:39:0x00d9, B:41:0x00ef, B:42:0x00fe, B:44:0x0104, B:45:0x011a, B:47:0x0120, B:49:0x012e, B:51:0x017f, B:53:0x0184, B:56:0x0189, B:58:0x019f, B:64:0x0087), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.partneranalytics.simcarrier.SimCarrierInfoLogger r15, X.InterfaceC23621Ds r16) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.partneranalytics.simcarrier.SimCarrierInfoLogger.A00(com.instagram.partneranalytics.simcarrier.SimCarrierInfoLogger, X.1Ds):java.lang.Object");
    }

    private final void A01(InterfaceC09390do interfaceC09390do) {
        if (!C18U.A06(C06090Tz.A05, this.A00, 36326558511806430L)) {
            interfaceC09390do.getValue();
        }
    }

    public SimCarrierInfoLogger(Context context, C12N c12n, UserSession userSession) {
        this.A00 = userSession;
        this.A07 = c12n;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new C206919Dw(this, 47));
        A01(A00);
        this.A02 = A00;
        this.A05 = AbstractC09440dt.A00(enumC09460dv, new C9EQ(this, 0));
        InterfaceC09390do A002 = AbstractC09440dt.A00(enumC09460dv, new C206919Dw(context, 49));
        A01(A002);
        this.A04 = A002;
        InterfaceC09390do A003 = AbstractC09440dt.A00(enumC09460dv, new C206919Dw(this, 48));
        A01(A003);
        this.A03 = A003;
        this.A01 = AbstractC09440dt.A00(enumC09460dv, new C206919Dw(this, 46));
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(731457954);
        Object value = this.A01.getValue();
        C14360o3.A07(value);
        if (((Boolean) value).booleanValue()) {
            AbstractC23641Du.A05(this.A07.AOT(1667852427, 3), new PZG(this, (InterfaceC23621Ds) null, 25), this.A06);
        } else {
            C2ST.A00(AnonymousClass191.A00, new PZG(this, (InterfaceC23621Ds) null, 26));
        }
        C0f9.A0A(1156050005, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(1816449692);
        Object value = this.A01.getValue();
        C14360o3.A07(value);
        if (((Boolean) value).booleanValue()) {
            C19L c19l = this.A06;
            AbstractC23641Du.A03(C05F.A00, this.A07.AOT(1667852427, 3), new C206649Cv(this, null, 28), c19l);
        } else {
            C2ST.A00(AnonymousClass191.A00, new C206649Cv(this, null, 29));
        }
        C0f9.A0A(884872689, A03);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C218914p.A06(this);
        Object value = this.A01.getValue();
        C14360o3.A07(value);
        if (((Boolean) value).booleanValue()) {
            AbstractC23641Du.A05(this.A07.AOT(1667852427, 3), new PZG(this, (InterfaceC23621Ds) null, 27), this.A06);
        }
    }
}
