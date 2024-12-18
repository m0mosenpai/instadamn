package X;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.2z1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66252z1 implements InterfaceC66172yt {
    public final C66262z2 A00 = new C66262z2();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC66172yt
    public final C5OL ABz(InterfaceC94534Ng interfaceC94534Ng, C49I c49i) {
        C5OX c5ox;
        C14360o3.A0B(interfaceC94534Ng, 0);
        C14360o3.A0B(c49i, 1);
        C94554Ni c94554Ni = ((C94524Nf) interfaceC94534Ng).A02;
        if (c94554Ni != null) {
            C94564Nj c94564Nj = c94554Ni.A00;
            if (c94564Nj.A00 != C05F.A0N) {
                try {
                    c5ox = C66262z2.A00(this.A00, interfaceC94534Ng, c49i, c94564Nj);
                } catch (C902140g | IllegalArgumentException | NullPointerException unused) {
                    c5ox = new C5OX(null, c94564Nj, false);
                }
                if (!c5ox.A02) {
                    final ImmutableList immutableList = c5ox.A00;
                    C5OM c5om = new C5OM(immutableList) { // from class: X.5OY
                        public final ImmutableList A00;

                        @Override // X.C5OM
                        public final ImmutableMap AEd() {
                            ImmutableMap.Builder builder = new ImmutableMap.Builder();
                            ImmutableList immutableList2 = this.A00;
                            if (immutableList2 != null && !immutableList2.isEmpty()) {
                                StringBuilder sb = new StringBuilder();
                                C1LC it = immutableList2.iterator();
                                C14360o3.A07(it);
                                while (it.hasNext()) {
                                    C94574Nk c94574Nk = (C94574Nk) it.next();
                                    if (sb.length() > 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(c94574Nk.A00.A00.name());
                                }
                                builder.put("filterNames", sb.toString());
                            }
                            ImmutableMap buildOrThrow = builder.buildOrThrow();
                            C14360o3.A07(buildOrThrow);
                            return buildOrThrow;
                        }

                        {
                            this.A00 = immutableList;
                        }
                    };
                    if (immutableList != null && !immutableList.isEmpty()) {
                        C94574Nk c94574Nk = (C94574Nk) immutableList.get(0);
                        C14360o3.A0A(c94574Nk);
                        C14360o3.A0B(c94574Nk, 1);
                        return new C5OL(c5om, c94574Nk, null, null, "Failed context filter", null, false, false, false);
                    }
                    C94564Nj c94564Nj2 = c5ox.A01;
                    if (c94564Nj2 != null) {
                        return new C5OL(c5om, null, c94564Nj2, null, "Failed filter clause", null, false, false, false);
                    }
                    return C5OK.A02(c5om, "failed_context_filter");
                }
            }
        }
        return C5OK.A00();
    }

    @Override // X.InterfaceC66172yt
    public final String FE2() {
        return "client_filters";
    }
}
