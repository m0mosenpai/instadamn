package com.instagram.perf.userflowpattern;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C1JX;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.MIY;
import com.instagram.preferences.device.AppRestartLoggerPrefs;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.perf.userflowpattern.AppRestartLogger$onNavigation$1", f = "AppRestartLogger.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class AppRestartLogger$onNavigation$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppRestartLogger$onNavigation$1(String str, String str2, String str3, String str4, String str5, InterfaceC23621Ds interfaceC23621Ds, long j) {
        super(2, interfaceC23621Ds);
        this.A06 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A01 = j;
        this.A02 = str4;
        this.A03 = str5;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new AppRestartLogger$onNavigation$1(this.A06, this.A04, this.A05, this.A02, this.A03, interfaceC23621Ds, this.A01);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            AppRestartLoggerPrefs appRestartLoggerPrefs = AppRestartLoggerPrefs.A00;
            String str = this.A06;
            String str2 = this.A04;
            String str3 = this.A05;
            long j = this.A01;
            MIY miy = new MIY(this.A03, str2, str3, str, this.A02, 0, j);
            this.A00 = 1;
            if (appRestartLoggerPrefs.A02(this, miy) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AppRestartLogger$onNavigation$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
