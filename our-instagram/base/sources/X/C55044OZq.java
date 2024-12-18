package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.OZq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55044OZq {
    public final UserSession A00;
    public final O4S A01;
    public final OW9 A02;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A0E;
    public final InterfaceC19390xP A0G;
    public final InterfaceC09390do A08 = AbstractC09440dt.A01(new C57512Pfm(this, 1));
    public final InterfaceC09390do A06 = AbstractC09440dt.A01(new C57512Pfm(this, 0));
    public final InterfaceC09390do A04 = AbstractC09440dt.A01(C57422PeK.A00);
    public final InterfaceC09390do A09 = AbstractC09440dt.A01(C57423PeL.A00);
    public final InterfaceC09390do A0B = AbstractC09440dt.A01(C57424PeM.A00);
    public final InterfaceC09390do A0D = AbstractC09440dt.A01(C57426PeO.A00);
    public final InterfaceC09390do A03 = AbstractC09440dt.A01(C57421PeJ.A00);
    public final InterfaceC09390do A0A = AbstractC09440dt.A01(new C57512Pfm(this, 2));
    public final InterfaceC09390do A0C = AbstractC09440dt.A01(C57425PeN.A00);
    public final InterfaceC09390do A0F = C57512Pfm.A00(this, 8);

    public C55044OZq(Context context, UserSession userSession, O4S o4s, OW9 ow9) {
        this.A00 = userSession;
        this.A02 = ow9;
        this.A01 = o4s;
        this.A07 = C57536PgA.A00(context, this, 22);
        this.A0E = C57536PgA.A00(context, this, 23);
        this.A05 = C57536PgA.A00(context, this, 21);
        this.A0G = ow9.A0i;
    }

    public static final boolean A00(C55044OZq c55044OZq) {
        C55008OVq c55008OVq = c55044OZq.A02.A0D;
        C81663kb A00 = C55008OVq.A00(c55008OVq);
        if (A00 != null && MU6.A01(c55008OVq.A01, A00)) {
            return true;
        }
        return false;
    }

    public static final boolean A01(C55044OZq c55044OZq) {
        C55008OVq c55008OVq = c55044OZq.A02.A0D;
        C81663kb A00 = C55008OVq.A00(c55008OVq);
        if (A00 != null && MU6.A02(c55008OVq.A01, A00)) {
            return true;
        }
        return false;
    }
}
