package com.instagram.newsfeed.viewmodel;

import X.AbstractC129825tm;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C15370ps;
import X.InterfaceC16570sA;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.newsfeed.viewmodel.ActivityFeedViewModel$getUiState$2", f = "ActivityFeedViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class ActivityFeedViewModel$getUiState$2 extends AbstractC23611Dp implements InterfaceC16570sA {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public /* synthetic */ Object A03;
    public /* synthetic */ Object A04;
    public final /* synthetic */ AbstractC129825tm A05;
    public final /* synthetic */ ActivityFeedViewModel A06;
    public final /* synthetic */ C15370ps A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityFeedViewModel$getUiState$2(AbstractC129825tm abstractC129825tm, ActivityFeedViewModel activityFeedViewModel, InterfaceC23621Ds interfaceC23621Ds, C15370ps c15370ps) {
        super(6, interfaceC23621Ds);
        this.A07 = c15370ps;
        this.A06 = activityFeedViewModel;
        this.A05 = abstractC129825tm;
    }

    @Override // X.InterfaceC16570sA
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        C15370ps c15370ps = this.A07;
        ActivityFeedViewModel activityFeedViewModel = this.A06;
        ActivityFeedViewModel$getUiState$2 activityFeedViewModel$getUiState$2 = new ActivityFeedViewModel$getUiState$2(this.A05, activityFeedViewModel, (InterfaceC23621Ds) obj6, c15370ps);
        activityFeedViewModel$getUiState$2.A00 = obj;
        activityFeedViewModel$getUiState$2.A01 = obj2;
        activityFeedViewModel$getUiState$2.A02 = obj3;
        activityFeedViewModel$getUiState$2.A03 = obj4;
        activityFeedViewModel$getUiState$2.A04 = obj5;
        return activityFeedViewModel$getUiState$2.invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d9, code lost:
    
        if (r11 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0210, code lost:
    
        if (java.lang.Boolean.TRUE.equals(r10.A04.A03) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003c, code lost:
    
        if ((r3 instanceof X.C109384wN) != false) goto L11;
     */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r50) {
        /*
            Method dump skipped, instructions count: 1509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.newsfeed.viewmodel.ActivityFeedViewModel$getUiState$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
