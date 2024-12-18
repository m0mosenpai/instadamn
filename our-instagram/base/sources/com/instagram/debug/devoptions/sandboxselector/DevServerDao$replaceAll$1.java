package com.instagram.debug.devoptions.sandboxselector;

import X.C1Dq;
import X.InterfaceC23621Ds;
import com.facebook.react.modules.dialog.DialogModule;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.sandboxselector.DevServerDao", f = "DevServerDao.kt", i = {0, 0}, l = {27, 28}, m = "replaceAll$suspendImpl", n = {"$this", DialogModule.KEY_ITEMS}, s = {"L$0", "L$1"})
/* loaded from: classes11.dex */
public final class DevServerDao$replaceAll$1 extends C1Dq {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DevServerDao this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevServerDao$replaceAll$1(DevServerDao devServerDao, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.this$0 = devServerDao;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DevServerDao.replaceAll$suspendImpl(this.this$0, null, this);
    }
}
