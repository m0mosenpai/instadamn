package X;

import com.instagram.model.shopping.clips.ClipsShoppingInfoIntf;
import com.instagram.model.shopping.clips.IGTVShoppingInfoIntf;
import java.util.List;

/* renamed from: X.3bY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC76283bY {
    public static final int A00(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        if (!c38321qM.A5M()) {
            return -1;
        }
        if (c38321qM.A53()) {
            int A0p = c38321qM.A0p();
            for (int i = 0; i < A0p; i++) {
                C38321qM A1e = c38321qM.A1e(i);
                if (A1e != null && A1e.A53()) {
                    return i;
                }
            }
        }
        if (!AbstractC82403m3.A05(c38321qM).isEmpty()) {
            return AbstractC82403m3.A00(c38321qM, null);
        }
        return 0;
    }

    public static final List A01(C38321qM c38321qM) {
        ClipsShoppingInfoIntf Buh;
        if (c38321qM.A5g()) {
            IGTVShoppingInfoIntf BGP = c38321qM.A0C.BGP();
            if (BGP == null) {
                return null;
            }
            return I3S.A00(BGP);
        }
        if (c38321qM.A5P()) {
            C3x9 clipsMetadata = c38321qM.A0C.getClipsMetadata();
            if (clipsMetadata == null || (Buh = clipsMetadata.Buh()) == null) {
                return null;
            }
            return I3Q.A00(Buh);
        }
        return c38321qM.A3J();
    }

    public static final boolean A02(C38321qM c38321qM) {
        List A3I;
        ClipsShoppingInfoIntf Buh;
        if (c38321qM.A5g()) {
            IGTVShoppingInfoIntf BGP = c38321qM.A0C.BGP();
            if (BGP == null) {
                return false;
            }
            A3I = I3S.A00(BGP);
        } else if (c38321qM.A5P()) {
            C3x9 clipsMetadata = c38321qM.A0C.getClipsMetadata();
            if (clipsMetadata == null || (Buh = clipsMetadata.Buh()) == null) {
                return false;
            }
            A3I = I3Q.A00(Buh);
        } else {
            A3I = c38321qM.A3I();
        }
        if (A3I == null || !(!A3I.isEmpty())) {
            return false;
        }
        return true;
    }
}
