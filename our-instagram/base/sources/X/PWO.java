package X;

import com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository", f = "LimitsPlusRepository.kt", i = {0, 0, 0, 0}, l = {163}, m = "saveFeatureOption", n = {"this", "limitsEnabled", "someInteractions", "mostInteractions"}, s = {"L$0", "L$1", "Z$0", "Z$1"})
/* loaded from: classes9.dex */
public final class PWO extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public boolean A04;
    public /* synthetic */ Object A05;
    public final /* synthetic */ LimitsPlusRepository A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PWO(LimitsPlusRepository limitsPlusRepository, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A06 = limitsPlusRepository;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A05 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return this.A06.A06(this, false, false);
    }
}
