package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class NKK extends OX6 {
    public C47Z A00;
    public Integer A01;
    public final Context A02;
    public final OXR A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final AbstractC55082Oac A06;
    public final DateFormat A07;
    public final InterfaceC09390do A08;
    public final C05A A09;
    public final C0UO A0A;

    public static final C51754Mtd A00(C51754Mtd c51754Mtd, NKK nkk, Integer num) {
        C38709H2v c38709H2v;
        C51754Mtd A00;
        if (num != null && num.intValue() > 0) {
            c38709H2v = new C38709H2v(num, null);
        } else {
            c38709H2v = null;
        }
        C47Z c47z = nkk.A00;
        if (c47z != null) {
            c47z.A0v = c38709H2v;
        }
        A00 = C51754Mtd.A00(null, null, null, null, null, null, null, null, c38709H2v, null, null, null, c51754Mtd, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -134217729, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false);
        return A00;
    }

    public static final boolean A01(NKK nkk) {
        if (nkk.A06.A03() != EnumC53117NeU.A02) {
            return false;
        }
        Integer num = nkk.A01;
        UserSession userSession = nkk.A05;
        if (!C151866sW.A06(userSession) || num == null || num.intValue() < AbstractC25225BEi.A07(C06090Tz.A05, userSession, 36597296070396702L)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NKK(Context context, OXR oxr, InterfaceC11380iw interfaceC11380iw, UserSession userSession, AbstractC55082Oac abstractC55082Oac) {
        super(abstractC55082Oac);
        AbstractC167027dH.A13(abstractC55082Oac, userSession, interfaceC11380iw);
        this.A06 = abstractC55082Oac;
        this.A05 = userSession;
        this.A04 = interfaceC11380iw;
        this.A02 = context;
        this.A03 = oxr;
        this.A08 = C1XM.A00(C57525Pfz.A00(this, 48));
        this.A07 = new SimpleDateFormat("EEE, LLL d, h:mma z", Locale.US);
        C008002u A1H = AbstractC25225BEi.A1H(new C51735MtI(null, null, null, null, 63, 0, false, false, false));
        this.A09 = A1H;
        this.A0A = A1H;
    }
}
