package X;

import com.google.common.collect.ImmutableMap;

/* renamed from: X.5OR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5OR implements C5OM {
    public C5OT A00;
    public C5OT A01;
    public C5OT A02;
    public C5OT A03;

    @Override // X.C5OM
    public final ImmutableMap AEd() {
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        C5OT c5ot = this.A01;
        if (c5ot != null) {
            builder.put("impressionCount", String.valueOf(c5ot.A00));
            builder.put("impressionLimit", String.valueOf(c5ot.A01));
        }
        C5OT c5ot2 = this.A02;
        if (c5ot2 != null) {
            builder.put("primaryActionCount", String.valueOf(c5ot2.A00));
            builder.put("primaryActionLimit", String.valueOf(c5ot2.A01));
        }
        C5OT c5ot3 = this.A03;
        if (c5ot3 != null) {
            builder.put("secondaryActionCount", String.valueOf(c5ot3.A00));
            builder.put("secondaryActionLimit", String.valueOf(c5ot3.A01));
        }
        C5OT c5ot4 = this.A00;
        if (c5ot4 != null) {
            builder.put("dismissActionCount", String.valueOf(c5ot4.A00));
            builder.put("dismissActionLimit", String.valueOf(c5ot4.A01));
        }
        ImmutableMap buildOrThrow = builder.buildOrThrow();
        C14360o3.A07(buildOrThrow);
        return buildOrThrow;
    }
}
