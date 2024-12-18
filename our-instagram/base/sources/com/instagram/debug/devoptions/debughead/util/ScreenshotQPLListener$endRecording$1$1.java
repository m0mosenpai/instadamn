package com.instagram.debug.devoptions.debughead.util;

import X.AbstractC001800i;
import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0XX;
import X.C0eB;
import X.C19L;
import X.C2BS;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import com.instagram.debug.devoptions.debughead.util.ScreenshotQPLListener;
import java.util.Comparator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.debughead.util.ScreenshotQPLListener$endRecording$1$1", f = "ScreenshotQPLListener.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class ScreenshotQPLListener$endRecording$1$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public final /* synthetic */ List $it;
    public final /* synthetic */ C0XX $quickEvent;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenshotQPLListener$endRecording$1$1(C0XX c0xx, List list, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.$quickEvent = c0xx;
        this.$it = list;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new ScreenshotQPLListener$endRecording$1$1(this.$quickEvent, this.$it, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16620sF
    public final Object invoke(C19L c19l, InterfaceC23621Ds interfaceC23621Ds) {
        return ((ScreenshotQPLListener$endRecording$1$1) create(c19l, interfaceC23621Ds)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AbstractC09560e7.A00(obj);
            ScreenshotQPLListener.INSTANCE.saveToDisk(this.$quickEvent, AbstractC001800i.A0g(this.$it, new Comparator() { // from class: com.instagram.debug.devoptions.debughead.util.ScreenshotQPLListener$endRecording$1$1$invokeSuspend$$inlined$sortedBy$1
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return C2BS.A00(Long.valueOf(((ScreenshotQPLListener.ScreenshotData) obj2).timestamp), Long.valueOf(((ScreenshotQPLListener.ScreenshotData) obj3).timestamp));
                }
            }));
            return C0eB.A00;
        }
        throw AbstractC166987dD.A13();
    }
}
