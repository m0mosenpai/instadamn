package X;

import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.FtK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35900FtK implements GXB {
    public final /* synthetic */ C38321qM A00;

    public C35900FtK(C38321qM c38321qM) {
        this.A00 = c38321qM;
    }

    @Override // X.GXB
    public final boolean EjJ(Reel reel) {
        C38321qM c38321qM = this.A00;
        String id = reel.getId();
        List BE4 = c38321qM.A0C.BE4();
        if (BE4 != null && AbstractC001800i.A0u(BE4, id)) {
            return true;
        }
        return false;
    }
}
