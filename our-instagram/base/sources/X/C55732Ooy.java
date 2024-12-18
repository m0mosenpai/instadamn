package X;

import com.google.common.collect.ImmutableMap;

/* renamed from: X.Ooy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55732Ooy implements C5OM {
    public final /* synthetic */ InterfaceC94534Ng A00;

    public C55732Ooy(InterfaceC94534Ng interfaceC94534Ng) {
        this.A00 = interfaceC94534Ng;
    }

    @Override // X.C5OM
    public final ImmutableMap AEd() {
        C4NJ c4nj = ((C94524Nf) this.A00).A01;
        ImmutableMap of = ImmutableMap.of((Object) "isUncancelable", (Object) Boolean.toString(c4nj.A0K), (Object) "isByPassSurfaceDelay", (Object) Boolean.toString(c4nj.A0H));
        C14360o3.A07(of);
        return of;
    }
}
