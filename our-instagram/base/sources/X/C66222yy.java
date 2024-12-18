package X;

import com.google.common.collect.ImmutableMap;

/* renamed from: X.2yy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66222yy implements InterfaceC66172yt {
    @Override // X.InterfaceC66172yt
    public final C5OL ABz(InterfaceC94534Ng interfaceC94534Ng, C49I c49i) {
        C14360o3.A0B(interfaceC94534Ng, 0);
        C14360o3.A0B(c49i, 1);
        final long j = ((C94524Nf) interfaceC94534Ng).A01.A05 * 1000;
        final long j2 = c49i.A00;
        return C5OK.A01(new C5OM(j, j2) { // from class: X.5OO
            public final long A00;
            public final long A01;

            @Override // X.C5OM
            public final ImmutableMap AEd() {
                ImmutableMap.Builder builder = new ImmutableMap.Builder();
                long j3 = this.A01;
                builder.put("ttlInMillis", String.valueOf(j3));
                long j4 = this.A00;
                builder.put("clientTimeInEpochMillis", String.valueOf(j4));
                builder.put("fetchTimeInEpochMillis", String.valueOf(0L));
                builder.put("deltaSinceFetchInMillis", String.valueOf((j4 - 0) - j3));
                ImmutableMap buildOrThrow = builder.buildOrThrow();
                C14360o3.A07(buildOrThrow);
                return buildOrThrow;
            }

            {
                this.A01 = j;
                this.A00 = j2;
            }
        });
    }

    @Override // X.InterfaceC66172yt
    public final String FE2() {
        return "client_ttl";
    }
}
