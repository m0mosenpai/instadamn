package X;

import com.facebook.R;
import com.instagram.model.direct.DirectShareTarget;

/* loaded from: classes8.dex */
public final class JS3 extends AbstractC46440Kh0 {
    public final int A00 = R.drawable.instagram_camera_pano_outline_24;
    public final int A01;
    public final DirectShareTarget A02;
    public final C3o9 A03;
    public final Integer A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof JS3) {
                JS3 js3 = (JS3) obj;
                if (this.A00 != js3.A00 || this.A01 != js3.A01 || !C14360o3.A0K(this.A03, js3.A03) || !C14360o3.A0K(this.A02, js3.A02) || this.A04 != js3.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A03, ((this.A00 * 31) + this.A01) * 31)) + 891516874 + this.A04.intValue();
    }

    public JS3(DirectShareTarget directShareTarget, C3o9 c3o9, Integer num, int i) {
        this.A01 = i;
        this.A03 = c3o9;
        this.A02 = directShareTarget;
        this.A04 = num;
    }
}
