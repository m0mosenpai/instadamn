package X;

import com.instagram.api.schemas.AdsAPIInstagramPosition;

/* renamed from: X.VNw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68362VNw {
    public static final AdsAPIInstagramPosition A00(String str) {
        AdsAPIInstagramPosition adsAPIInstagramPosition = (AdsAPIInstagramPosition) AdsAPIInstagramPosition.A01.get(str);
        if (adsAPIInstagramPosition == null) {
            return AdsAPIInstagramPosition.A0H;
        }
        return adsAPIInstagramPosition;
    }
}
