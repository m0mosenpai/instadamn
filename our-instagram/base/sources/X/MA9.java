package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.wellbeing.teensafety.safetyinterventions.data.database.SafetyInterventionsMutationsDao", f = "SafetyInterventionsMutationsDao.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2}, l = {52, 58, 62, 69}, m = "incrementImpression$suspendImpl", n = {"$this", "queriesDao", "interventionType", "otherUserId", "timestamp", "$this", "queriesDao", "interventionType", "otherUserId", "timestamp", "$this", "interventionType", "otherUserId", "timestamp"}, s = {"L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1", "L$2", "J$0"})
/* loaded from: classes8.dex */
public final class MA9 extends C1Dq {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public /* synthetic */ Object A06;
    public final /* synthetic */ C164457Xk A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MA9(C164457Xk c164457Xk, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A07 = c164457Xk;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A06 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return C164457Xk.A00(this.A07, null, null, null, this);
    }
}
