package X;

/* renamed from: X.Mub, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51771Mub extends C0T6 implements InterfaceC58208PrE {
    public final C51773Mud A00;
    public final C51774Mue A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51771Mub) {
                C51771Mub c51771Mub = (C51771Mub) obj;
                if (!C14360o3.A0K(this.A01, c51771Mub.A01) || !C14360o3.A0K(this.A00, c51771Mub.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0G(this.A01));
    }

    public C51771Mub(C51773Mud c51773Mud, C51774Mue c51774Mue) {
        AbstractC167017dG.A1P(c51774Mue, c51773Mud);
        this.A01 = c51774Mue;
        this.A00 = c51773Mud;
    }
}
