package X;

import com.instagram.api.schemas.WearablesAppAttributionType;

/* renamed from: X.9vG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC224309vG {
    public final WearablesAppAttributionType A01() {
        if (this instanceof C9NT) {
            return C9NT.A00;
        }
        if (this instanceof C9NU) {
            return C9NU.A00;
        }
        return null;
    }

    public final String A02() {
        if (this instanceof C9NT) {
            return "com.facebook.stella";
        }
        if (this instanceof C221689qX) {
            return "com.facebook.mako";
        }
        if (this instanceof C221679qW) {
            return MSV.A00(416);
        }
        if (this instanceof C9NS) {
            return "com.facebook.mwa.ai";
        }
        if (this instanceof C221669qV) {
            return "com.facebook.horizon";
        }
        if (this instanceof C9NU) {
            return "com.facebook.hammerhead";
        }
        return "com.facebook.greatwhite";
    }

    public final String A03() {
        if (this instanceof C9NT) {
            return "Stella";
        }
        if (this instanceof C221689qX) {
            return "Mako";
        }
        if (!(this instanceof C221679qW)) {
            if (!(this instanceof C9NS)) {
                if (!(this instanceof C221669qV)) {
                    if (!(this instanceof C9NU)) {
                        return "greatwhite";
                    }
                    return "Hammerhead";
                }
                return null;
            }
            return "Hammerhead";
        }
        return null;
    }

    public final boolean A04() {
        if (!(this instanceof C9NT) && !(this instanceof C221689qX) && !(this instanceof C9NS) && !(this instanceof C9NU) && !(this instanceof C221659qU)) {
            return false;
        }
        return true;
    }
}
