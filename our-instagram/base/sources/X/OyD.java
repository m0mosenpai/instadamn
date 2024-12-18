package X;

import com.instagram.camera.effect.models.CameraAREffect;
import java.util.Map;

/* loaded from: classes9.dex */
public final class OyD implements C8FH {
    public final /* synthetic */ C54614OAp A00;

    @Override // X.C8FH
    public final void AVq(C88X c88x, Map map) {
        CameraAREffect A00 = c88x.A00();
        if (A00 != null) {
            C54614OAp c54614OAp = this.A00;
            C54461O4p c54461O4p = c54614OAp.A00;
            if (c54461O4p != null) {
                int ordinal = c54461O4p.A00.A03.A07.ordinal();
                int i = 2;
                if (ordinal != 0) {
                    i = 7;
                    if (ordinal != 2) {
                        i = 3;
                    }
                }
                OI6 oi6 = c54614OAp.A02;
                String str = A00.A0K;
                C14360o3.A07(str);
                oi6.A00(new PB6(str, A00.A0B, map, i, A00.CcN()));
                return;
            }
            C14360o3.A0F("delegate");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.C8FH
    public final int BMv() {
        return 0;
    }

    public OyD(C54614OAp c54614OAp) {
        this.A00 = c54614OAp;
    }
}
