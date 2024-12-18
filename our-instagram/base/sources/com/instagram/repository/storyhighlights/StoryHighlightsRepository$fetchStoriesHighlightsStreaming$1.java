package com.instagram.repository.storyhighlights;

import X.AbstractC151076r9;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C156186zn;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import android.content.Context;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.repository.storyhighlights.StoryHighlightsRepository$fetchStoriesHighlightsStreaming$1", f = "StoryHighlightsRepository.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class StoryHighlightsRepository$fetchStoriesHighlightsStreaming$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ AbstractC151076r9 A03;
    public final /* synthetic */ C156186zn A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryHighlightsRepository$fetchStoriesHighlightsStreaming$1(Context context, UserSession userSession, AbstractC151076r9 abstractC151076r9, C156186zn c156186zn, Integer num, String str, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(2, interfaceC23621Ds);
        this.A01 = context;
        this.A02 = userSession;
        this.A06 = str;
        this.A07 = z;
        this.A03 = abstractC151076r9;
        this.A05 = num;
        this.A04 = c156186zn;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Context context = this.A01;
        UserSession userSession = this.A02;
        String str = this.A06;
        boolean z = this.A07;
        return new StoryHighlightsRepository$fetchStoriesHighlightsStreaming$1(context, userSession, this.A03, this.A04, this.A05, str, interfaceC23621Ds, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005c, code lost:
    
        if (r5 == X.C05F.A0Y) goto L11;
     */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.repository.storyhighlights.StoryHighlightsRepository$fetchStoriesHighlightsStreaming$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StoryHighlightsRepository$fetchStoriesHighlightsStreaming$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
