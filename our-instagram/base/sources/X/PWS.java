package X;

import com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository", f = "LimitsPlusRepository.kt", i = {0, 0, 0, 0, 0}, l = {125}, m = "saveAudienceOption", n = {"this", "limitsEnabled", "newFollowers", "nonFollowers", "nonCloseFriends"}, s = {"L$0", "L$1", "Z$0", "Z$1", "Z$2"})
/* loaded from: classes9.dex */
public final class PWS extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public /* synthetic */ Object A06;
    public final /* synthetic */ LimitsPlusRepository A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PWS(LimitsPlusRepository limitsPlusRepository, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A07 = limitsPlusRepository;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A06 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return this.A07.A07(this, false, false, false);
    }
}
