package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.Locale;

/* renamed from: X.EzV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33990EzV {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        int i;
        String str;
        EnumC33408Epf enumC33408Epf;
        C189478aR A02;
        Object A03 = c6fw.A03(1);
        AbstractC25225BEi.A1S(A03);
        String str2 = (String) A03;
        int A0D = AbstractC25230BEn.A0D(c6fw.A03(2), "null cannot be cast to non-null type kotlin.Number");
        MHW mhw = new MHW(38, c6fw, c6fq);
        UserSession A0K = AbstractC31179DnN.A0K(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        Fragment A022 = C6BQ.A02(c6fq);
        C14360o3.A0B(A0K, 0);
        AbstractC167007dF.A1E(A04, 1, str2);
        C1VE c1ve = C1VE.A02;
        if (c1ve != null) {
            FI9 fi9 = new FI9(mhw);
            Integer[] A00 = C05F.A00(2);
            int length = A00.length;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                Integer num = A00[i3];
                if (1 - num.intValue() != 0) {
                    i = 0;
                } else {
                    i = 1;
                }
                if (i == A0D) {
                    int intValue = num.intValue();
                    if (intValue != 0) {
                        if (intValue == 1) {
                            C1VE.A00(c1ve);
                            C33206Ekt c33206Ekt = new C33206Ekt();
                            C14360o3.A0C(c33206Ekt, "null cannot be cast to non-null type com.instagram.wellbeing.timespent.fragment.TakeABreakMenuFragment");
                            if (!str2.equals("ig_ts_entry_point_similar_posts_nudge") && !str2.equals("ig_ts_entry_point_profile_qp")) {
                                A02 = C1VE.A00(c1ve).A02(A04, A022, A04, A0K, new C36727GGw(4, fi9, A0K), c33206Ekt);
                            } else {
                                long A023 = AbstractC31175DnJ.A02(A0K);
                                A02 = C1VE.A00(c1ve).A02(A04, A022, A04, A0K, new GH4(A04, AE1.A00(A04, R.drawable.instagram_clock_dotted_pano_outline_24), A022, A04, A0K, A0K, fi9, str2, A023, true), c33206Ekt);
                            }
                            A02.A02(A04, c33206Ekt);
                        }
                    } else if (C18U.A06(C06090Tz.A05, A0K, 2342161673576389008L)) {
                        C140966Yy A0P = AbstractC31173DnH.A0P(A04, A0K);
                        A0P.A0B(null, FBR.A00(EnumC72365Xc1.A05, null));
                        A0P.A04();
                    } else {
                        C189478aR A002 = AbstractC35219FgC.A00(A04, A0K, c1ve, fi9);
                        C1VE.A00(c1ve);
                        A002.A02(A04, new C33200Ekn());
                    }
                    long A003 = C461529z.A00();
                    if (intValue != 0) {
                        str = "take_break";
                    } else {
                        str = "daily_limit";
                    }
                    EnumC33408Epf[] values = EnumC33408Epf.values();
                    int length2 = values.length;
                    while (true) {
                        if (i2 < length2) {
                            enumC33408Epf = values[i2];
                            if (C14360o3.A0K(enumC33408Epf.name(), AbstractC166997dE.A10(Locale.ROOT, str2))) {
                                break;
                            }
                            i2++;
                        } else {
                            enumC33408Epf = EnumC33408Epf.A0K;
                            break;
                        }
                    }
                    C461329x.A05(A0K, enumC33408Epf, str, A003, AbstractC31174DnI.A07(A0K));
                    return null;
                }
                i3++;
            }
            throw AbstractC166987dD.A12("Invalid reminder type");
        }
        return null;
    }
}
