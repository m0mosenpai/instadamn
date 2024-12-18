package X;

import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.tigon.tigonhuc.HucClient;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 1, 2}, l = {113, HucClient.BODY_UPLOAD_TIMEOUT_SECONDS, StringTreeSet.MAX_SYMBOL_COUNT}, m = "collect", n = {"this", "$this$onCompletion_u24lambda_u242", "e", "sc"}, s = {"L$0", "L$1", "L$0", "L$0"})
/* renamed from: X.0Zm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07140Zm extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public /* synthetic */ Object A03;
    public final /* synthetic */ C16410rm A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C07140Zm(InterfaceC23621Ds interfaceC23621Ds, C16410rm c16410rm) {
        super(interfaceC23621Ds);
        this.A04 = c16410rm;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A03 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return this.A04.collect(null, this);
    }
}
