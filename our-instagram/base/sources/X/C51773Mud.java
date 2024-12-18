package X;

import java.util.List;

/* renamed from: X.Mud, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51773Mud extends C0T6 implements InterfaceC58210PrG {
    public final List A00;

    public C51773Mud(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C51773Mud) && C14360o3.A0K(this.A00, ((C51773Mud) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
