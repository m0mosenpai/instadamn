package com.instagram.appreciation.funding;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C44360Jiz;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.MO5;
import androidx.fragment.app.FragmentActivity;
import com.instagram.appreciation.analytics.LoggingFanData;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.appreciation.funding.AppreciationBuyAndSendFragment$doOptimisticGifting$1", f = "AppreciationBuyAndSendFragment.kt", i = {0, 0, 0, 0}, l = {365}, m = "invokeSuspend", n = {"logger", "viewName", "bugReporter", "errorSnackBarEvent"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes8.dex */
public final class AppreciationBuyAndSendFragment$doOptimisticGifting$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final /* synthetic */ int A05;
    public final /* synthetic */ int A06;
    public final /* synthetic */ FragmentActivity A07;
    public final /* synthetic */ LoggingFanData A08;
    public final /* synthetic */ C44360Jiz A09;
    public final /* synthetic */ MO5 A0A;
    public final /* synthetic */ UserSession A0B;
    public final /* synthetic */ SimpleImageUrl A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ String A0F;
    public final /* synthetic */ String A0G;
    public final /* synthetic */ String A0H;
    public final /* synthetic */ List A0I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppreciationBuyAndSendFragment$doOptimisticGifting$1(FragmentActivity fragmentActivity, LoggingFanData loggingFanData, C44360Jiz c44360Jiz, MO5 mo5, UserSession userSession, SimpleImageUrl simpleImageUrl, String str, String str2, String str3, String str4, String str5, List list, InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        super(2, interfaceC23621Ds);
        this.A0B = userSession;
        this.A07 = fragmentActivity;
        this.A08 = loggingFanData;
        this.A0D = str;
        this.A0E = str2;
        this.A06 = i;
        this.A0C = simpleImageUrl;
        this.A0F = str3;
        this.A05 = i2;
        this.A0I = list;
        this.A0G = str4;
        this.A0H = str5;
        this.A0A = mo5;
        this.A09 = c44360Jiz;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        UserSession userSession = this.A0B;
        FragmentActivity fragmentActivity = this.A07;
        LoggingFanData loggingFanData = this.A08;
        String str = this.A0D;
        String str2 = this.A0E;
        int i = this.A06;
        SimpleImageUrl simpleImageUrl = this.A0C;
        String str3 = this.A0F;
        int i2 = this.A05;
        List list = this.A0I;
        String str4 = this.A0G;
        String str5 = this.A0H;
        return new AppreciationBuyAndSendFragment$doOptimisticGifting$1(fragmentActivity, loggingFanData, this.A09, this.A0A, userSession, simpleImageUrl, str, str2, str3, str4, str5, list, interfaceC23621Ds, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005f  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.appreciation.funding.AppreciationBuyAndSendFragment$doOptimisticGifting$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AppreciationBuyAndSendFragment$doOptimisticGifting$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
