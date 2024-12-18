package com.instagram.compose.perf.scroll;

import X.AbstractC09560e7;
import X.AbstractC23611Dp;
import X.BGh;
import X.C05F;
import X.C0eB;
import X.C15130pT;
import X.C25325BIu;
import X.C6M3;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.MRC;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.compose.perf.scroll.DropFrameWatcherKt$DropFrameWatcher$5$1$2", f = "DropFrameWatcher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class DropFrameWatcherKt$DropFrameWatcher$5$1$2 extends AbstractC23611Dp implements InterfaceC16620sF {
    public /* synthetic */ long A00;
    public final /* synthetic */ MRC A01;
    public final /* synthetic */ C25325BIu A02;
    public final /* synthetic */ C15130pT A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropFrameWatcherKt$DropFrameWatcher$5$1$2(MRC mrc, C25325BIu c25325BIu, InterfaceC23621Ds interfaceC23621Ds, C15130pT c15130pT) {
        super(2, interfaceC23621Ds);
        this.A03 = c15130pT;
        this.A01 = mrc;
        this.A02 = c25325BIu;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        DropFrameWatcherKt$DropFrameWatcher$5$1$2 dropFrameWatcherKt$DropFrameWatcher$5$1$2 = new DropFrameWatcherKt$DropFrameWatcher$5$1$2(this.A01, this.A02, interfaceC23621Ds, this.A03);
        dropFrameWatcherKt$DropFrameWatcher$5$1$2.A00 = ((BGh) obj).A00;
        return dropFrameWatcherKt$DropFrameWatcher$5$1$2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DropFrameWatcherKt$DropFrameWatcher$5$1$2) create(new BGh(((BGh) obj).A00), (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        Integer num;
        AbstractC09560e7.A00(obj);
        long j = this.A00;
        C15130pT c15130pT = this.A03;
        long j2 = c15130pT.A00;
        C6M3 BZd = this.A01.BZd();
        int i = (int) (j2 & 4294967295L);
        int i2 = (int) (j & 4294967295L);
        if (i == i2) {
            i2 = (int) (j >> 32);
            i = (int) (j2 >> 32);
        }
        int i3 = i2 - i;
        if (i3 != 0) {
            if (BZd == C6M3.Vertical) {
                if (i3 > 0) {
                    num = C05F.A01;
                } else {
                    num = C05F.A00;
                }
            } else if (i3 > 0) {
                num = C05F.A0N;
            } else {
                num = C05F.A0C;
            }
            this.A02.A00.A01.A0G.A09 = num;
        }
        c15130pT.A00 = j;
        return C0eB.A00;
    }
}
