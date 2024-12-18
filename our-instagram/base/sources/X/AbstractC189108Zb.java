package X;

/* renamed from: X.8Zb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC189108Zb {
    public static final EnumC203578zI A00(C85B c85b) {
        C14360o3.A0B(c85b, 0);
        int ordinal = c85b.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 7) {
                    if (ordinal != 11) {
                        return null;
                    }
                    return EnumC203578zI.CAMERA_TOOL;
                }
                return EnumC203578zI.GALLERY_TOOLBAR;
            }
            return EnumC203578zI.EFFECT_TRAY;
        }
        return EnumC203578zI.MINI_GALLERY;
    }

    public static final String A01(C85D c85d) {
        C14360o3.A0B(c85d, 0);
        if (c85d instanceof C189118Zc) {
            C189118Zc c189118Zc = (C189118Zc) c85d;
            if (c189118Zc.A08) {
                return null;
            }
            return c189118Zc.A02;
        }
        if (c85d instanceof C85C) {
            return null;
        }
        throw new RuntimeException();
    }
}
