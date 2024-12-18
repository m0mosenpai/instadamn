package X;

import java.util.List;

/* renamed from: X.MqZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51581MqZ extends C0T6 {
    public final List A00;

    public C51581MqZ(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C51581MqZ) && C14360o3.A0K(this.A00, ((C51581MqZ) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
