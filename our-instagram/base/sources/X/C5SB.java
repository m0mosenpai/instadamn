package X;

import com.instagram.quickpromotion.intf.QuickPromotionSurface;

/* renamed from: X.5SB, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5SB {
    public static final C4NJ A00(QuickPromotionSurface quickPromotionSurface, C4NM c4nm, C117045Rn c117045Rn, C4NQ c4nq, String str, int i, long j, long j2, long j3, boolean z, boolean z2) {
        C14360o3.A0B(quickPromotionSurface, 3);
        C5SC c5sc = C5SC.$redex_init_class;
        int ordinal = quickPromotionSurface.ordinal();
        if (ordinal != 1) {
            if (ordinal != 0 && ordinal != 11) {
                if (ordinal != 2) {
                    return new C4NJ(quickPromotionSurface, c4nm, c117045Rn, c4nq, str, i, j, j2, j3, z, z2);
                }
                return new C4NJ(quickPromotionSurface, c4nm, c117045Rn, c4nq, str, i, j, j2, j3, z, z2);
            }
            return new C4NJ(quickPromotionSurface, c4nm, c117045Rn, c4nq, str, i, j, j2, j3, z, z2);
        }
        return new C125715mI(quickPromotionSurface, c4nm, c117045Rn, c4nq, str, i, j, j2, j3, z, z2);
    }

    public static final C4NJ A01(QuickPromotionSurface quickPromotionSurface, C4NM c4nm, C117045Rn c117045Rn, C4NQ c4nq, String str, int i, long j, boolean z) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(c4nm, 1);
        C14360o3.A0B(quickPromotionSurface, 3);
        return A00(quickPromotionSurface, c4nm, c117045Rn, c4nq, str, i, 0L, j, 0L, false, z);
    }
}
