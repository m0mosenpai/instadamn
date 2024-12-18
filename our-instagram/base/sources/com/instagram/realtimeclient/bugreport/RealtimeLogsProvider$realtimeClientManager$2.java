package com.instagram.realtimeclient.bugreport;

import X.C0YY;
import X.InterfaceC16820sZ;
import com.instagram.realtimeclient.RealtimeClientManager;

/* loaded from: classes.dex */
public final class RealtimeLogsProvider$realtimeClientManager$2 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ RealtimeLogsProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealtimeLogsProvider$realtimeClientManager$2(RealtimeLogsProvider realtimeLogsProvider) {
        super(0);
        this.this$0 = realtimeLogsProvider;
    }

    @Override // X.InterfaceC16820sZ
    public final RealtimeClientManager invoke() {
        return (RealtimeClientManager) this.this$0.realtimeClientManagerProvider.get();
    }
}
