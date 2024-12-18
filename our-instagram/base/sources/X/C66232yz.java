package X;

import com.google.common.collect.ImmutableMap;

/* renamed from: X.2yz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66232yz implements InterfaceC66172yt {
    @Override // X.InterfaceC66172yt
    public final C5OL ABz(InterfaceC94534Ng interfaceC94534Ng, C49I c49i) {
        C5OM c55732Ooy;
        C14360o3.A0B(interfaceC94534Ng, 0);
        C14360o3.A0B(c49i, 1);
        if (c49i.A0D) {
            return C5OK.A00();
        }
        C4NJ c4nj = ((C94524Nf) interfaceC94534Ng).A01;
        if (!c4nj.A0K && !c4nj.A0H) {
            final C5OP c5op = new C5OP(c49i);
            c55732Ooy = new C5OM(c5op) { // from class: X.5OQ
                public final C5OP A00;

                @Override // X.C5OM
                public final ImmutableMap AEd() {
                    ImmutableMap.Builder builder = new ImmutableMap.Builder();
                    builder.put("currentTimeEpochMillis", String.valueOf(this.A00.A00.A00));
                    ImmutableMap buildOrThrow = builder.buildOrThrow();
                    C14360o3.A07(buildOrThrow);
                    return buildOrThrow;
                }

                {
                    this.A00 = c5op;
                }
            };
        } else {
            c55732Ooy = new C55732Ooy(interfaceC94534Ng);
        }
        return C5OK.A01(c55732Ooy);
    }

    @Override // X.InterfaceC66172yt
    public final String FE2() {
        return "client_surface_delay";
    }
}
