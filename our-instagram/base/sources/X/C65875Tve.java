package X;

import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.Comparator;

/* renamed from: X.Tve, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65875Tve implements Comparator {
    public final QuickPromotionSurface A00;
    public final C55382gd A01;

    public C65875Tve(QuickPromotionSurface quickPromotionSurface, C55382gd c55382gd) {
        C14360o3.A0B(c55382gd, 2);
        this.A01 = c55382gd;
        this.A00 = quickPromotionSurface == null ? c55382gd.A00[3] : quickPromotionSurface;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C4NL c4nl = (C4NL) obj;
        C4NL c4nl2 = (C4NL) obj2;
        AbstractC167017dG.A1N(c4nl, c4nl2);
        C4NJ c4nj = (C4NJ) c4nl;
        C4NJ c4nj2 = (C4NJ) c4nl2;
        int i = c4nj.A01;
        int i2 = c4nj2.A01;
        if (i != i2) {
            if (i >= i2) {
                return 1;
            }
            return -1;
        }
        C55382gd c55382gd = this.A01;
        QuickPromotionSurface quickPromotionSurface = this.A00;
        QuickPromotionSurface quickPromotionSurface2 = c4nj.A06;
        QuickPromotionSurface quickPromotionSurface3 = c4nj2.A06;
        C14360o3.A0B(quickPromotionSurface, 0);
        QuickPromotionSurface[] quickPromotionSurfaceArr = c55382gd.A00;
        int A00 = C55392ge.A00(quickPromotionSurface2, quickPromotionSurfaceArr);
        int A002 = C55392ge.A00(quickPromotionSurface3, quickPromotionSurfaceArr);
        int A003 = C55392ge.A00(quickPromotionSurface, quickPromotionSurfaceArr);
        int i3 = A00 - A003;
        if (A003 >= A00) {
            i3 = A00 + (4 - A003);
        }
        int i4 = A002 - A003;
        if (A003 >= A002) {
            i4 = A002 + (4 - A003);
        }
        if (i3 == i4) {
            return 0;
        }
        if (i3 <= i4) {
            return -1;
        }
        return 1;
    }
}
