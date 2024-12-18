package com.facebook.browser.iabjs.ota.instagram;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC25232BEp;
import X.AnonymousClass001;
import X.C06090Tz;
import X.C0eB;
import X.C14360o3;
import X.C18U;
import X.C1C6;
import X.C1JX;
import X.C1QW;
import X.C1QY;
import X.C24891Jo;
import X.C54957OSh;
import X.C55010OVt;
import X.C55026OXd;
import X.C55936OsS;
import X.C65075Td4;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.InterfaceC27191Tt;
import X.LHL;
import X.MSW;
import X.O1I;
import android.content.Context;
import com.facebook.quicklog.QuickPerformanceLogger;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.browser.iabjs.ota.instagram.IgIABJSScriptFetcher$fetchScript$1", f = "IgIABJSScriptFetcher.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class IgIABJSScriptFetcher$fetchScript$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ O1I A03;
    public final /* synthetic */ C55026OXd A04;
    public final /* synthetic */ QuickPerformanceLogger A05;
    public final /* synthetic */ C1QW A06;
    public final /* synthetic */ C1QY A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;

    @DebugMetadata(c = "com.facebook.browser.iabjs.ota.instagram.IgIABJSScriptFetcher$fetchScript$1$1", f = "IgIABJSScriptFetcher.kt", i = {}, l = {349}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.facebook.browser.iabjs.ota.instagram.IgIABJSScriptFetcher$fetchScript$1$1, reason: invalid class name */
    /* loaded from: classes9.dex */
    public final class AnonymousClass1 extends AbstractC23611Dp implements InterfaceC16620sF {
        public int A00;
        public Object A01;
        public Object A02;
        public Object A03;
        public Object A04;
        public Object A05;
        public Object A06;
        public Object A07;
        public Object A08;
        public Object A09;
        public Object A0A;
        public final /* synthetic */ int A0B;
        public final /* synthetic */ Context A0C;
        public final /* synthetic */ O1I A0D;
        public final /* synthetic */ C55026OXd A0E;
        public final /* synthetic */ QuickPerformanceLogger A0F;
        public final /* synthetic */ C1QW A0G;
        public final /* synthetic */ C1QY A0H;
        public final /* synthetic */ String A0I;
        public final /* synthetic */ String A0J;
        public final /* synthetic */ String A0K;
        public final /* synthetic */ String A0L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, O1I o1i, C55026OXd c55026OXd, QuickPerformanceLogger quickPerformanceLogger, C1QW c1qw, C1QY c1qy, String str, String str2, String str3, String str4, InterfaceC23621Ds interfaceC23621Ds, int i) {
            super(2, interfaceC23621Ds);
            this.A0F = quickPerformanceLogger;
            this.A0B = i;
            this.A0J = str;
            this.A0K = str2;
            this.A0L = str3;
            this.A0E = c55026OXd;
            this.A0C = context;
            this.A0I = str4;
            this.A0D = o1i;
            this.A0G = c1qw;
            this.A0H = c1qy;
        }

        @Override // X.C1Dr
        public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
            QuickPerformanceLogger quickPerformanceLogger = this.A0F;
            int i = this.A0B;
            String str = this.A0J;
            String str2 = this.A0K;
            String str3 = this.A0L;
            C55026OXd c55026OXd = this.A0E;
            return new AnonymousClass1(this.A0C, this.A0D, c55026OXd, quickPerformanceLogger, this.A0G, this.A0H, str, str2, str3, this.A0I, interfaceC23621Ds, i);
        }

        @Override // X.C1Dr
        public final Object invokeSuspend(Object obj) {
            Object obj2 = obj;
            C1JX c1jx = C1JX.A02;
            if (this.A00 != 0) {
                AbstractC09560e7.A00(obj2);
            } else {
                AbstractC09560e7.A00(obj2);
                QuickPerformanceLogger quickPerformanceLogger = this.A0F;
                int i = this.A0B;
                String str = this.A0J;
                String str2 = this.A0K;
                String str3 = this.A0L;
                C55026OXd c55026OXd = this.A0E;
                Context context = this.A0C;
                String str4 = this.A0I;
                O1I o1i = this.A0D;
                C1QW c1qw = this.A0G;
                C1QY c1qy = this.A0H;
                this.A01 = quickPerformanceLogger;
                this.A02 = str;
                this.A03 = str2;
                this.A04 = str3;
                this.A05 = c55026OXd;
                this.A06 = context;
                this.A07 = str4;
                this.A08 = o1i;
                this.A09 = c1qw;
                this.A0A = c1qy;
                this.A00 = 1;
                C24891Jo A1H = AbstractC25232BEp.A1H(this);
                quickPerformanceLogger.markerStart(646459455, i);
                quickPerformanceLogger.markerAnnotate(646459455, i, "script_name", str);
                quickPerformanceLogger.markerAnnotate(646459455, i, "script_url", str2);
                quickPerformanceLogger.markerAnnotate(646459455, i, "script_version", str3);
                try {
                    InterfaceC27191Tt A02 = C1C6.A00().A02(new C55936OsS(context, o1i, c55026OXd, quickPerformanceLogger, str4, str2, str, str3, A1H, i), c1qw, c1qy);
                    C14360o3.A07(A02);
                    A1H.CPA(new C65075Td4(A02, 4));
                } catch (Exception e) {
                    A1H.resumeWith(MSW.A1D(e));
                }
                obj2 = A1H.A0E();
                if (obj2 == c1jx) {
                    return c1jx;
                }
            }
            return obj2;
        }

        @Override // X.InterfaceC16620sF
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgIABJSScriptFetcher$fetchScript$1(Context context, O1I o1i, C55026OXd c55026OXd, QuickPerformanceLogger quickPerformanceLogger, C1QW c1qw, C1QY c1qy, String str, String str2, String str3, String str4, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A04 = c55026OXd;
        this.A05 = quickPerformanceLogger;
        this.A01 = i;
        this.A0A = str;
        this.A09 = str2;
        this.A0B = str3;
        this.A03 = o1i;
        this.A02 = context;
        this.A08 = str4;
        this.A06 = c1qw;
        this.A07 = c1qy;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C55026OXd c55026OXd = this.A04;
        QuickPerformanceLogger quickPerformanceLogger = this.A05;
        int i = this.A01;
        String str = this.A0A;
        String str2 = this.A09;
        String str3 = this.A0B;
        O1I o1i = this.A03;
        return new IgIABJSScriptFetcher$fetchScript$1(this.A02, o1i, c55026OXd, quickPerformanceLogger, this.A06, this.A07, str, str2, str3, this.A08, interfaceC23621Ds, i);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        try {
            if (this.A00 != 0) {
                AbstractC09560e7.A00(obj);
            } else {
                AbstractC09560e7.A00(obj);
                long A01 = C18U.A01(C06090Tz.A05, C54957OSh.A01, 36611164519799042L);
                QuickPerformanceLogger quickPerformanceLogger = this.A05;
                int i = this.A01;
                String str = this.A09;
                String str2 = this.A0A;
                String str3 = this.A0B;
                C55026OXd c55026OXd = this.A04;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.A02, this.A03, c55026OXd, quickPerformanceLogger, this.A06, this.A07, str, str2, str3, this.A08, null, i);
                this.A00 = 1;
                if (LHL.A01(this, anonymousClass1, A01) == c1jx) {
                    return c1jx;
                }
            }
        } catch (Exception e) {
            QuickPerformanceLogger quickPerformanceLogger2 = this.A05;
            int i2 = this.A01;
            String message = e.getMessage();
            String str4 = "";
            if (message == null) {
                message = "";
            }
            C55026OXd.A00(quickPerformanceLogger2, "execute_http_request_error", message, i2, 646459455);
            String message2 = e.getMessage();
            if (message2 != null) {
                str4 = message2;
            }
            C55026OXd.A01(e, AnonymousClass001.A0R("execute_http_request_error ", str4), this.A0A, this.A09, this.A0B, 646454053);
            C55010OVt.A00(this.A03.A00);
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((IgIABJSScriptFetcher$fetchScript$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
