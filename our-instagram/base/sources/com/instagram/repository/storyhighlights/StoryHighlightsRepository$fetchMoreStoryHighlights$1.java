package com.instagram.repository.storyhighlights;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C156186zn;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import android.content.Context;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.repository.storyhighlights.StoryHighlightsRepository$fetchMoreStoryHighlights$1", f = "StoryHighlightsRepository.kt", i = {}, l = {193, 204, 205}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class StoryHighlightsRepository$fetchMoreStoryHighlights$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C156186zn A03;
    public final /* synthetic */ Boolean A04;
    public final /* synthetic */ Boolean A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ boolean A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryHighlightsRepository$fetchMoreStoryHighlights$1(Context context, UserSession userSession, C156186zn c156186zn, Boolean bool, Boolean bool2, Integer num, String str, String str2, String str3, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(2, interfaceC23621Ds);
        this.A01 = context;
        this.A02 = userSession;
        this.A09 = str;
        this.A08 = str2;
        this.A0A = z;
        this.A06 = num;
        this.A07 = str3;
        this.A05 = bool;
        this.A04 = bool2;
        this.A03 = c156186zn;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Context context = this.A01;
        UserSession userSession = this.A02;
        String str = this.A09;
        String str2 = this.A08;
        boolean z = this.A0A;
        Integer num = this.A06;
        String str3 = this.A07;
        return new StoryHighlightsRepository$fetchMoreStoryHighlights$1(context, userSession, this.A03, this.A05, this.A04, num, str, str2, str3, interfaceC23621Ds, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e8  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.repository.storyhighlights.StoryHighlightsRepository$fetchMoreStoryHighlights$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StoryHighlightsRepository$fetchMoreStoryHighlights$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
