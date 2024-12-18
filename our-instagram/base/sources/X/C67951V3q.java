package X;

import com.instagram.model.venue.LocationDict;

/* renamed from: X.V3q, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67951V3q extends C1P1 {
    public final /* synthetic */ W5E A00;

    public C67951V3q(W5E w5e) {
        this.A00 = w5e;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1018966978);
        super.onFail(abstractC115105If);
        C0f9.A0A(-933221553, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-1921495337);
        InterfaceC71956XCi interfaceC71956XCi = this.A00.A06;
        if (interfaceC71956XCi != null) {
            interfaceC71956XCi.onFinish();
        }
        C0f9.A0A(-43391354, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        C0f9.A0A(42440113, C0f9.A03(510178269));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.instagram.model.venue.Venue, java.lang.Object] */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-189338419);
        C67819Uys c67819Uys = (C67819Uys) obj;
        int A032 = C0f9.A03(-595844626);
        InterfaceC71956XCi interfaceC71956XCi = this.A00.A06;
        if (interfaceC71956XCi != 0) {
            LocationDict locationDict = c67819Uys.A00;
            locationDict.getClass();
            ?? obj2 = new Object();
            obj2.A00 = locationDict;
            interfaceC71956XCi.Dyi(obj2);
        }
        C0f9.A0A(-1045002468, A032);
        C0f9.A0A(-1085919803, A03);
    }
}
