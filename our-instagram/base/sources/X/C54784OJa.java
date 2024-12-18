package X;

import com.facebook.odin.model.OdinContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.OJa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54784OJa {
    public C006802i A01;
    public String A02;
    public final UserSession A03;
    public final InterfaceC09390do A05 = C57510Pfk.A00(this, 31);
    public final InterfaceC09390do A06 = C57510Pfk.A00(this, 32);
    public final InterfaceC09390do A04 = C57510Pfk.A00(this, 30);
    public int A00 = 1;

    public final boolean A00() {
        String str;
        C3SN E59 = ((C3SD) ((O8L) this.A04.getValue()).A00.getValue()).E59(null, OdinContext.A05);
        boolean z = E59.A02;
        if (z) {
            Number number = (Number) E59.A00;
            if (number.doubleValue() == 0.0d) {
                str = "bad_swiper";
            } else if (number.doubleValue() == 1.0d) {
                str = "good_swiper";
            } else {
                str = "not_swiper";
            }
        } else {
            str = null;
        }
        this.A02 = str;
        if (z && MSW.A00(E59.A00) == 1.0d) {
            return true;
        }
        return false;
    }

    public C54784OJa(UserSession userSession) {
        this.A03 = userSession;
    }
}
