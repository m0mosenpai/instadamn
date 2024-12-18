package com.instagram.bugreporter;

import X.AbstractC09560e7;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C1JX;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.JXD;
import com.instagram.preferences.device.AppRestartLoggerPrefs;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.bugreporter.BugReporterUploader$logSuccess$1", f = "BugReporterUploader.kt", i = {}, l = {725}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class BugReporterUploader$logSuccess$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ long A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BugReporterUploader$logSuccess$1(InterfaceC23621Ds interfaceC23621Ds, long j) {
        super(2, interfaceC23621Ds);
        this.A01 = j;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new BugReporterUploader$logSuccess$1(interfaceC23621Ds, this.A01);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new BugReporterUploader$logSuccess$1((InterfaceC23621Ds) obj2, this.A01).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            AppRestartLoggerPrefs appRestartLoggerPrefs = AppRestartLoggerPrefs.A00;
            JXD jxd = new JXD(this.A01, 4);
            this.A00 = 1;
            if (appRestartLoggerPrefs.A02(this, jxd) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }
}
