package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.VxA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69883VxA {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        String str = (String) c6fw.A01();
        int intValue = ((Number) c6fw.A02()).intValue();
        int intValue2 = ((Number) c6fw.A00()).intValue();
        A01(C6BQ.A04(c6fq), C6BQ.A08(c6fq), (UserSession) C6BQ.A0B(c6fq), EnumC39619HeT.A06, str, intValue, intValue2);
        return null;
    }

    public static void A01(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC39619HeT enumC39619HeT, String str, int i, int i2) {
        EnumC65855TvH enumC65855TvH;
        String valueOf = String.valueOf(i2);
        EnumC65855TvH[] values = EnumC65855TvH.values();
        int length = values.length;
        int i3 = 0;
        while (true) {
            if (i3 < length) {
                enumC65855TvH = values[i3];
                if (C14360o3.A0K(enumC65855TvH.A00, valueOf)) {
                    break;
                } else {
                    i3++;
                }
            } else {
                enumC65855TvH = null;
                break;
            }
        }
        String valueOf2 = String.valueOf(i);
        WEz A01 = AbstractC69993VzD.A01(fragmentActivity, interfaceC11380iw, userSession, enumC65855TvH, VXS.A00(valueOf2), str);
        A01.A07(enumC39619HeT);
        VG2 A00 = VXS.A00(valueOf2);
        if (A00 == VG2.A0B || A00 == VG2.A0D || A00 == VG2.A0F || A00 == VG2.A0A || A00 == VG2.A0C || A00 == VG2.A0E || A00 == VG2.A09 || A00 == VG2.A08) {
            A01.A0E = true;
        }
        WEz.A00(null, A01);
    }
}
