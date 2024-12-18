package com.instagram.common.util.concurrent;

import X.AbstractC09560e7;
import X.AbstractC14390oB;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C0o9;
import X.C14980pD;
import X.C1JX;
import X.InterfaceC06180Ui;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.PW2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.common.util.concurrent.StuckAwareDispatcherManager$3", f = "StuckAwareDispatcherManager.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class StuckAwareDispatcherManager$3 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ C0o9 A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StuckAwareDispatcherManager$3(C0o9 c0o9, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A01 = c0o9;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new StuckAwareDispatcherManager$3(this.A01, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StuckAwareDispatcherManager$3) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            InterfaceC06180Ui interfaceC06180Ui = AbstractC14390oB.A01;
            C14980pD c14980pD = new C14980pD(this.A01, 0);
            this.A00 = 1;
            if (interfaceC06180Ui.collect(c14980pD, this) == c1jx) {
                return c1jx;
            }
        }
        throw new PW2();
    }
}
