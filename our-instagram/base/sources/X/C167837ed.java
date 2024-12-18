package X;

import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.7ed, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C167837ed extends C0T6 implements InterfaceC166277bw {
    public final UUID A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C167837ed) && C14360o3.A0K(this.A00, ((C167837ed) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public /* synthetic */ C167837ed(UUID uuid, DefaultConstructorMarker defaultConstructorMarker, int i) {
        UUID randomUUID = UUID.randomUUID();
        C14360o3.A0B(randomUUID, 1);
        this.A00 = randomUUID;
    }

    public C167837ed() {
        UUID randomUUID = UUID.randomUUID();
        C14360o3.A0B(randomUUID, 1);
        this.A00 = randomUUID;
    }
}
