package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.ItH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42598ItH implements C3A6 {
    public final UserSession A00;
    public final InterfaceC114805Gn A01;

    @Override // X.C3A6
    public final Class CAN(Object obj) {
        C14360o3.A0B(obj, 0);
        return obj.getClass();
    }

    @Override // X.C3A6
    public final Object CAM(int i) {
        C41551w4 Blt = this.A01.Blt(i);
        if (Blt != null) {
            return Blt.A08(this.A00);
        }
        return null;
    }

    public C42598ItH(UserSession userSession, InterfaceC114805Gn interfaceC114805Gn) {
        this.A00 = userSession;
        this.A01 = interfaceC114805Gn;
    }
}
