package X;

import com.instagram.model.reels.Reel;

/* renamed from: X.Mvy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51854Mvy extends C0T6 implements InterfaceC57848PlE {
    public final int A00;
    public final Object A01;

    public C51854Mvy(Reel reel, int i) {
        this.A00 = i;
        C14360o3.A0B(reel, 1);
        this.A01 = reel;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C51854Mvy) && ((C51854Mvy) obj).A00 == i) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this != obj) {
                i = 1;
            } else {
                return true;
            }
        } else if (this != obj) {
            i = 0;
        } else {
            return true;
        }
        if (!A00(obj, i) || !C14360o3.A0K(this.A01, ((C51854Mvy) obj).A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
