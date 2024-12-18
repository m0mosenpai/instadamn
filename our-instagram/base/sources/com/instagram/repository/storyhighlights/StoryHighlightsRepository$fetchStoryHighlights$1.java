package com.instagram.repository.storyhighlights;

import X.AbstractC151076r9;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C156186zn;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import android.content.Context;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.repository.storyhighlights.StoryHighlightsRepository$fetchStoryHighlights$1", f = "StoryHighlightsRepository.kt", i = {1}, l = {115, 128, 137}, m = "invokeSuspend", n = {"it"}, s = {"L$2"})
/* loaded from: classes3.dex */
public final class StoryHighlightsRepository$fetchStoryHighlights$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final /* synthetic */ Context A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ AbstractC151076r9 A06;
    public final /* synthetic */ C156186zn A07;
    public final /* synthetic */ Boolean A08;
    public final /* synthetic */ Boolean A09;
    public final /* synthetic */ Boolean A0A;
    public final /* synthetic */ Integer A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ boolean A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryHighlightsRepository$fetchStoryHighlights$1(Context context, UserSession userSession, AbstractC151076r9 abstractC151076r9, C156186zn c156186zn, Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(2, interfaceC23621Ds);
        this.A04 = context;
        this.A05 = userSession;
        this.A0C = str;
        this.A0D = z;
        this.A06 = abstractC151076r9;
        this.A0B = num;
        this.A0A = bool;
        this.A08 = bool2;
        this.A09 = bool3;
        this.A07 = c156186zn;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Context context = this.A04;
        UserSession userSession = this.A05;
        String str = this.A0C;
        boolean z = this.A0D;
        AbstractC151076r9 abstractC151076r9 = this.A06;
        Integer num = this.A0B;
        return new StoryHighlightsRepository$fetchStoryHighlights$1(context, userSession, abstractC151076r9, this.A07, this.A0A, this.A08, this.A09, num, str, interfaceC23621Ds, z);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StoryHighlightsRepository$fetchStoryHighlights$1) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c3  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.repository.storyhighlights.StoryHighlightsRepository$fetchStoryHighlights$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
