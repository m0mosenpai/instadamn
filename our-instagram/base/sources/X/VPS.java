package X;

import com.instagram.api.schemas.XIGIGBoostDestination;

/* loaded from: classes11.dex */
public abstract class VPS {
    public static final XIGIGBoostDestination A00(String str) {
        XIGIGBoostDestination xIGIGBoostDestination = (XIGIGBoostDestination) XIGIGBoostDestination.A01.get(str);
        if (xIGIGBoostDestination == null) {
            return XIGIGBoostDestination.A0C;
        }
        return xIGIGBoostDestination;
    }
}
