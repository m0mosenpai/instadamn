package X;

import com.instagram.model.reels.Reel;
import java.util.Map;

/* loaded from: classes9.dex */
public final class P8I implements C51R {
    public final int A00;
    public final Object A01;
    public final String A02;

    public P8I(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    @Override // X.C51R
    public final void DqI(Map map) {
        Reel reel;
        Reel reel2;
        if (this.A00 != 0) {
            if (map != null && (reel2 = (Reel) map.get(this.A02)) != null) {
                ((C51039Mgp) this.A01).A05(reel2);
                return;
            }
            return;
        }
        if (map != null && (reel = (Reel) map.get(this.A02)) != null) {
            N7V.A01((N7V) this.A01, reel);
        } else {
            C9GR.A0D(AbstractC31172DnG.A07(this.A01), "ReelLoad_network_error");
        }
    }

    @Override // X.C51R
    public final void onFailure() {
        if (this.A00 == 0) {
            C9GR.A0D(AbstractC31172DnG.A07(this.A01), "ReelLoad_network_error");
        }
    }
}
