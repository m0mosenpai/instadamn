package X;

import com.instagram.user.model.User;

/* loaded from: classes11.dex */
public final class UP8 extends C0T6 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final User A04;

    public UP8(User user, float f, float f2, float f3, int i) {
        C14360o3.A0B(user, 5);
        this.A03 = i;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A04 = user;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UP8) {
                UP8 up8 = (UP8) obj;
                if (this.A03 != up8.A03 || Float.compare(this.A00, up8.A00) != 0 || Float.compare(this.A01, up8.A01) != 0 || Float.compare(this.A02, up8.A02) != 0 || !C14360o3.A0K(this.A04, up8.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A00(AbstractC166997dE.A00(AbstractC166997dE.A00(this.A03 * 31, this.A00), this.A01), this.A02) + this.A04.hashCode();
    }
}
