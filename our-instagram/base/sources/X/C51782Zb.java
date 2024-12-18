package X;

import android.graphics.Rect;
import java.util.List;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.2Zb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51782Zb extends C2ZY {
    public Rect A00 = null;
    public boolean A01 = false;

    @Override // X.C2ZY
    public final int A00() {
        return 1;
    }

    @Override // X.C2ZY
    public final String A01() {
        return MediaStreamTrack.VIDEO_TRACK_KIND;
    }

    @Override // X.C2ZY
    public final void A02(StringBuilder sb) {
        C14360o3.A0B(sb, 0);
        sb.append(this.A01);
    }

    @Override // X.C2ZY
    public final void A03(List list) {
        C14360o3.A0B(list, 0);
        this.A01 = AbstractC001900j.A0b((String) list.get(0));
    }

    @Override // X.C2ZY
    public final boolean A04(C1KR c1kr) {
        C14360o3.A0B(c1kr, 0);
        if (c1kr instanceof C93704Ja) {
            this.A01 = true;
            return true;
        }
        if (!(c1kr instanceof C4JY)) {
            return false;
        }
        this.A00 = ((C4JY) c1kr).A00;
        return true;
    }
}
