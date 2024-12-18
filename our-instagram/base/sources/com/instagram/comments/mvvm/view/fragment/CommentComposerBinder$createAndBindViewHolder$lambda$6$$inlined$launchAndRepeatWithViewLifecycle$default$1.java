package com.instagram.comments.mvvm.view.fragment;

import X.AbstractC09560e7;
import X.AbstractC13100lw;
import X.AbstractC23611Dp;
import X.AbstractC59962oe;
import X.C07S;
import X.C07T;
import X.C07X;
import X.C0eB;
import X.C14510oO;
import X.C149766oT;
import X.C166627cY;
import X.C1JX;
import X.C1M1;
import X.C25814BbV;
import X.C26025BfE;
import X.C3HN;
import X.InterfaceC16620sF;
import X.InterfaceC168087f3;
import X.InterfaceC16820sZ;
import X.InterfaceC23621Ds;
import X.InterfaceC60442pS;
import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.comments.mvvm.view.fragment.CommentComposerBinder$createAndBindViewHolder$lambda$6$$inlined$launchAndRepeatWithViewLifecycle$default$1", f = "CommentComposerBinder.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class CommentComposerBinder$createAndBindViewHolder$lambda$6$$inlined$launchAndRepeatWithViewLifecycle$default$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ C07S A03;
    public final /* synthetic */ C07X A04;
    public final /* synthetic */ AbstractC59962oe A05;
    public final /* synthetic */ InterfaceC168087f3 A06;
    public final /* synthetic */ C26025BfE A07;
    public final /* synthetic */ C166627cY A08;
    public final /* synthetic */ C25814BbV A09;
    public final /* synthetic */ UserSession A0A;
    public final /* synthetic */ AbstractC13100lw A0B;
    public final /* synthetic */ InterfaceC60442pS A0C;
    public final /* synthetic */ C149766oT A0D;
    public final /* synthetic */ C1M1 A0E;
    public final /* synthetic */ InterfaceC16820sZ A0F;
    public final /* synthetic */ InterfaceC16820sZ A0G;
    public final /* synthetic */ C14510oO A0H;

    @DebugMetadata(c = "com.instagram.comments.mvvm.view.fragment.CommentComposerBinder$createAndBindViewHolder$lambda$6$$inlined$launchAndRepeatWithViewLifecycle$default$1$1", f = "CommentComposerBinder.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.instagram.comments.mvvm.view.fragment.CommentComposerBinder$createAndBindViewHolder$lambda$6$$inlined$launchAndRepeatWithViewLifecycle$default$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass1 extends AbstractC23611Dp implements InterfaceC16620sF {
        public int A00;
        public /* synthetic */ Object A01;
        public final /* synthetic */ Context A02;
        public final /* synthetic */ View A03;
        public final /* synthetic */ AbstractC59962oe A04;
        public final /* synthetic */ InterfaceC168087f3 A05;
        public final /* synthetic */ C26025BfE A06;
        public final /* synthetic */ C166627cY A07;
        public final /* synthetic */ C25814BbV A08;
        public final /* synthetic */ UserSession A09;
        public final /* synthetic */ AbstractC13100lw A0A;
        public final /* synthetic */ InterfaceC60442pS A0B;
        public final /* synthetic */ C149766oT A0C;
        public final /* synthetic */ C1M1 A0D;
        public final /* synthetic */ InterfaceC16820sZ A0E;
        public final /* synthetic */ InterfaceC16820sZ A0F;
        public final /* synthetic */ C14510oO A0G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, View view, AbstractC59962oe abstractC59962oe, InterfaceC168087f3 interfaceC168087f3, C26025BfE c26025BfE, C166627cY c166627cY, C25814BbV c25814BbV, UserSession userSession, AbstractC13100lw abstractC13100lw, InterfaceC60442pS interfaceC60442pS, C149766oT c149766oT, C1M1 c1m1, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, C14510oO c14510oO) {
            super(2, interfaceC23621Ds);
            this.A08 = c25814BbV;
            this.A09 = userSession;
            this.A04 = abstractC59962oe;
            this.A05 = interfaceC168087f3;
            this.A07 = c166627cY;
            this.A0E = interfaceC16820sZ;
            this.A03 = view;
            this.A02 = context;
            this.A0B = interfaceC60442pS;
            this.A0A = abstractC13100lw;
            this.A06 = c26025BfE;
            this.A0C = c149766oT;
            this.A0D = c1m1;
            this.A0F = interfaceC16820sZ2;
            this.A0G = c14510oO;
        }

        @Override // X.C1Dr
        public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
            C25814BbV c25814BbV = this.A08;
            UserSession userSession = this.A09;
            AbstractC59962oe abstractC59962oe = this.A04;
            InterfaceC168087f3 interfaceC168087f3 = this.A05;
            C166627cY c166627cY = this.A07;
            InterfaceC16820sZ interfaceC16820sZ = this.A0E;
            View view = this.A03;
            Context context = this.A02;
            InterfaceC60442pS interfaceC60442pS = this.A0B;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, view, abstractC59962oe, interfaceC168087f3, this.A06, c166627cY, c25814BbV, userSession, this.A0A, interfaceC60442pS, this.A0C, this.A0D, interfaceC23621Ds, interfaceC16820sZ, this.A0F, this.A0G);
            anonymousClass1.A01 = obj;
            return anonymousClass1;
        }

        @Override // X.InterfaceC16620sF
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0110 A[RETURN] */
        /* JADX WARN: Type inference failed for: r29v0, types: [X.0oO, java.lang.Object] */
        @Override // X.C1Dr
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r35) {
            /*
                Method dump skipped, instructions count: 333
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.view.fragment.CommentComposerBinder$createAndBindViewHolder$lambda$6$$inlined$launchAndRepeatWithViewLifecycle$default$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentComposerBinder$createAndBindViewHolder$lambda$6$$inlined$launchAndRepeatWithViewLifecycle$default$1(Context context, View view, C07S c07s, C07X c07x, AbstractC59962oe abstractC59962oe, InterfaceC168087f3 interfaceC168087f3, C26025BfE c26025BfE, C166627cY c166627cY, C25814BbV c25814BbV, UserSession userSession, AbstractC13100lw abstractC13100lw, InterfaceC60442pS interfaceC60442pS, C149766oT c149766oT, C1M1 c1m1, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, C14510oO c14510oO) {
        super(2, interfaceC23621Ds);
        this.A04 = c07x;
        this.A03 = c07s;
        this.A09 = c25814BbV;
        this.A0A = userSession;
        this.A05 = abstractC59962oe;
        this.A06 = interfaceC168087f3;
        this.A08 = c166627cY;
        this.A0F = interfaceC16820sZ;
        this.A02 = view;
        this.A01 = context;
        this.A0C = interfaceC60442pS;
        this.A0B = abstractC13100lw;
        this.A07 = c26025BfE;
        this.A0D = c149766oT;
        this.A0E = c1m1;
        this.A0G = interfaceC16820sZ2;
        this.A0H = c14510oO;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C07X c07x = this.A04;
        C07S c07s = this.A03;
        C25814BbV c25814BbV = this.A09;
        UserSession userSession = this.A0A;
        AbstractC59962oe abstractC59962oe = this.A05;
        InterfaceC168087f3 interfaceC168087f3 = this.A06;
        C166627cY c166627cY = this.A08;
        InterfaceC16820sZ interfaceC16820sZ = this.A0F;
        View view = this.A02;
        Context context = this.A01;
        InterfaceC60442pS interfaceC60442pS = this.A0C;
        return new CommentComposerBinder$createAndBindViewHolder$lambda$6$$inlined$launchAndRepeatWithViewLifecycle$default$1(context, view, c07s, c07x, abstractC59962oe, interfaceC168087f3, this.A07, c166627cY, c25814BbV, userSession, this.A0B, interfaceC60442pS, this.A0D, this.A0E, interfaceC23621Ds, interfaceC16820sZ, this.A0G, this.A0H);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommentComposerBinder$createAndBindViewHolder$lambda$6$$inlined$launchAndRepeatWithViewLifecycle$default$1) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            C07T lifecycle = this.A04.getLifecycle();
            C07S c07s = this.A03;
            C25814BbV c25814BbV = this.A09;
            UserSession userSession = this.A0A;
            AbstractC59962oe abstractC59962oe = this.A05;
            InterfaceC168087f3 interfaceC168087f3 = this.A06;
            C166627cY c166627cY = this.A08;
            InterfaceC16820sZ interfaceC16820sZ = this.A0F;
            View view = this.A02;
            Context context = this.A01;
            InterfaceC60442pS interfaceC60442pS = this.A0C;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, view, abstractC59962oe, interfaceC168087f3, this.A07, c166627cY, c25814BbV, userSession, this.A0B, interfaceC60442pS, this.A0D, this.A0E, null, interfaceC16820sZ, this.A0G, this.A0H);
            this.A00 = 1;
            if (C3HN.A00(c07s, lifecycle, this, anonymousClass1) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }
}
