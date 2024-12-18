package X;

/* renamed from: X.Vue, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69744Vue {
    public final long A00;
    public final C69278Vkm A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C69744Vue) {
                C69744Vue c69744Vue = (C69744Vue) obj;
                if (this.A00 != c69744Vue.A00 || !C14360o3.A0K(this.A01, c69744Vue.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC25228BEl.A03(this.A00) * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductConfigValue(timestamp=");
        sb.append(this.A00);
        sb.append(", productConfig=");
        return AbstractC167017dG.A0o(this.A01, sb);
    }

    public C69744Vue(C69278Vkm c69278Vkm, long j) {
        this.A00 = j;
        this.A01 = c69278Vkm;
    }
}
