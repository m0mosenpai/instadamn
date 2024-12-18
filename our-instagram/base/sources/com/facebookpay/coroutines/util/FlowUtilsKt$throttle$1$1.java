package com.facebookpay.coroutines.util;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC25226BEj;
import X.AbstractC89993zf;
import X.AnonymousClass195;
import X.C0eB;
import X.C15130pT;
import X.C15370ps;
import X.C1JX;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.InterfaceC71543Iw;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebookpay.coroutines.util.FlowUtilsKt$throttle$1$1", f = "FlowUtils.kt", i = {0}, l = {23}, m = "invokeSuspend", n = {"currentTime"}, s = {"J$0"})
/* loaded from: classes5.dex */
public final class FlowUtilsKt$throttle$1$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public long A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C15130pT A04;
    public final /* synthetic */ C15370ps A05;
    public final /* synthetic */ InterfaceC71543Iw A06;

    @DebugMetadata(c = "com.facebookpay.coroutines.util.FlowUtilsKt$throttle$1$1$1", f = "FlowUtils.kt", i = {}, l = {CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL, 30}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.facebookpay.coroutines.util.FlowUtilsKt$throttle$1$1$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public final class AnonymousClass1 extends AbstractC23611Dp implements InterfaceC16620sF {
        public int A00;
        public final /* synthetic */ int A01;
        public final /* synthetic */ long A02;
        public final /* synthetic */ Object A03;
        public final /* synthetic */ C15130pT A04;
        public final /* synthetic */ InterfaceC71543Iw A05;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Object obj, InterfaceC23621Ds interfaceC23621Ds, C15130pT c15130pT, InterfaceC71543Iw interfaceC71543Iw, int i, long j) {
            super(2, interfaceC23621Ds);
            this.A02 = j;
            this.A04 = c15130pT;
            this.A01 = i;
            this.A05 = interfaceC71543Iw;
            this.A03 = obj;
        }

        @Override // X.C1Dr
        public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
            long j = this.A02;
            C15130pT c15130pT = this.A04;
            int i = this.A01;
            return new AnonymousClass1(this.A03, interfaceC23621Ds, c15130pT, this.A05, i, j);
        }

        @Override // X.C1Dr
        public final Object invokeSuspend(Object obj) {
            C1JX c1jx = C1JX.A02;
            int i = this.A00;
            if (i != 0) {
                if (i != 1) {
                    AbstractC09560e7.A00(obj);
                    return C0eB.A00;
                }
                AbstractC09560e7.A00(obj);
            } else {
                AbstractC09560e7.A00(obj);
                long j = (this.A02 - this.A04.A00) + this.A01;
                this.A00 = 1;
                if (AbstractC89993zf.A01(this, j) == c1jx) {
                    return c1jx;
                }
            }
            InterfaceC71543Iw interfaceC71543Iw = this.A05;
            Object obj2 = this.A03;
            this.A00 = 2;
            if (interfaceC71543Iw.EMz(obj2, this) == c1jx) {
                return c1jx;
            }
            return C0eB.A00;
        }

        @Override // X.InterfaceC16620sF
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowUtilsKt$throttle$1$1(InterfaceC23621Ds interfaceC23621Ds, C15130pT c15130pT, C15370ps c15370ps, InterfaceC71543Iw interfaceC71543Iw, int i) {
        super(2, interfaceC23621Ds);
        this.A04 = c15130pT;
        this.A03 = i;
        this.A06 = interfaceC71543Iw;
        this.A05 = c15370ps;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C15130pT c15130pT = this.A04;
        int i = this.A03;
        FlowUtilsKt$throttle$1$1 flowUtilsKt$throttle$1$1 = new FlowUtilsKt$throttle$1$1(interfaceC23621Ds, c15130pT, this.A05, this.A06, i);
        flowUtilsKt$throttle$1$1.A02 = obj;
        return flowUtilsKt$throttle$1$1;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        long currentTimeMillis;
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            currentTimeMillis = this.A01;
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            Object obj2 = this.A02;
            currentTimeMillis = System.currentTimeMillis();
            C15130pT c15130pT = this.A04;
            long j = currentTimeMillis - c15130pT.A00;
            int i = this.A03;
            if (j > i) {
                InterfaceC71543Iw interfaceC71543Iw = this.A06;
                this.A01 = currentTimeMillis;
                this.A00 = 1;
                if (interfaceC71543Iw.EMz(obj2, this) == c1jx) {
                    return c1jx;
                }
            } else {
                C15370ps c15370ps = this.A05;
                AnonymousClass195 anonymousClass195 = (AnonymousClass195) c15370ps.A00;
                if (anonymousClass195 != null) {
                    anonymousClass195.AGH(null);
                }
                InterfaceC71543Iw interfaceC71543Iw2 = this.A06;
                c15370ps.A00 = AbstractC25226BEj.A1L(new AnonymousClass1(obj2, null, c15130pT, interfaceC71543Iw2, i, currentTimeMillis), interfaceC71543Iw2);
                return C0eB.A00;
            }
        }
        AnonymousClass195 anonymousClass1952 = (AnonymousClass195) this.A05.A00;
        if (anonymousClass1952 != null) {
            anonymousClass1952.AGH(null);
        }
        this.A04.A00 = currentTimeMillis;
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FlowUtilsKt$throttle$1$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
