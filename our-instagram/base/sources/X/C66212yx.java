package X;

import com.google.common.collect.ImmutableMap;

/* renamed from: X.2yx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66212yx implements InterfaceC66172yt {
    @Override // X.InterfaceC66172yt
    public final C5OL ABz(InterfaceC94534Ng interfaceC94534Ng, C49I c49i) {
        boolean z;
        C14360o3.A0B(interfaceC94534Ng, 0);
        C14360o3.A0B(c49i, 1);
        C4NJ c4nj = ((C94524Nf) interfaceC94534Ng).A01;
        final long j = c4nj.A04 * 1000;
        final long j2 = c4nj.A02 * 1000;
        final long j3 = c49i.A00;
        if ((j == 0 || j3 > j) && (j2 == 0 || j3 < j2)) {
            z = true;
        } else {
            z = false;
        }
        C5OM c5om = new C5OM(j, j2, j3) { // from class: X.5ON
            public final long A00;
            public final long A01;
            public final long A02;

            @Override // X.C5OM
            public final ImmutableMap AEd() {
                ImmutableMap.Builder builder = new ImmutableMap.Builder();
                builder.put("startTimeEpochMillis", String.valueOf(this.A02));
                builder.put("endTimeEpochMillis", String.valueOf(this.A01));
                builder.put("clientTimeInEpochMillis", String.valueOf(this.A00));
                ImmutableMap buildOrThrow = builder.buildOrThrow();
                C14360o3.A07(buildOrThrow);
                return buildOrThrow;
            }

            {
                this.A02 = j;
                this.A01 = j2;
                this.A00 = j3;
            }
        };
        if (z) {
            return C5OK.A01(c5om);
        }
        return C5OK.A02(c5om, "outside_of_enabled_time");
    }

    @Override // X.InterfaceC66172yt
    public final String FE2() {
        return "client_enabled_time";
    }
}
