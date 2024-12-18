package X;

import com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.video.live.mvvm.model.repository.IgLiveExploreRepository", f = "IgLiveExploreRepository.kt", i = {0, 0, 0, 0, 0}, l = {116}, m = "locallyUpdateUpcomingEventReminderStatus", n = {"this", "upcomingEvent", "eventList", "reminderOn", "index$iv"}, s = {"L$0", "L$1", "L$2", "Z$0", "I$0"})
/* renamed from: X.J6a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43163J6a extends C1Dq {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public boolean A06;
    public /* synthetic */ Object A07;
    public final /* synthetic */ IgLiveExploreRepository A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43163J6a(IgLiveExploreRepository igLiveExploreRepository, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A08 = igLiveExploreRepository;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        this.A07 = obj;
        this.A01 |= Integer.MIN_VALUE;
        return IgLiveExploreRepository.A00(null, this.A08, this, false);
    }
}
