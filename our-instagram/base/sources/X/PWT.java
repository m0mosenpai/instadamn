package X;

import com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository", f = "LimitsPlusRepository.kt", i = {0, 0, 0}, l = {66}, m = "savePreviouslyFetchedData", n = {"isEnabled", "startDate", "customizationEnabled"}, s = {"Z$0", "J$0", "Z$1"})
/* loaded from: classes9.dex */
public final class PWT extends C1Dq {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public boolean A06;
    public /* synthetic */ Object A07;
    public final /* synthetic */ LimitsPlusRepository A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PWT(LimitsPlusRepository limitsPlusRepository, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A08 = limitsPlusRepository;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A07 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return this.A08.A04(this, 0L, 0L, false, false, false, false, false, false, false);
    }
}
