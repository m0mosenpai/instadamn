package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.7Ce, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159187Ce {
    public static final C159187Ce A00 = new Object();

    public static final boolean A04(UserSession userSession, C2EE c2ee) {
        C14360o3.A0B(userSession, 0);
        if (c2ee == null || !C14360o3.A0K(c2ee.An1(), false)) {
            return false;
        }
        C23031Ai A002 = AbstractC23021Ah.A00(userSession);
        String C7I = c2ee.C7I();
        if (C7I == null) {
            C7I = "";
        }
        if (A002.A01.getBoolean(AnonymousClass001.A0R("broadcast_chat_creator_education_nux/", C7I), false)) {
            return false;
        }
        return true;
    }

    public static final boolean A05(UserSession userSession, C2EE c2ee) {
        boolean z = false;
        if (c2ee.C7g() == 29) {
            z = true;
        }
        boolean A0g = AbstractC002300n.A0g(c2ee.Asv(), userSession.userId, false);
        boolean A002 = AbstractC159197Cf.A00(userSession, c2ee);
        if (z && A0g && !A002) {
            return A07(userSession, c2ee) || A06(userSession, c2ee);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.List] */
    public final void A08(Context context, View view, UserSession userSession, C7IK c7ik, C2EE c2ee) {
        View findViewById;
        EnumC33318EoD[] enumC33318EoDArr;
        EnumC33318EoD enumC33318EoD;
        ArrayList arrayList;
        int i;
        C14360o3.A0B(view, 4);
        if (c7ik != null && c2ee != null && c2ee.C7I() != null && (findViewById = view.findViewById(R.id.nux_banner)) != null) {
            if (!A05(userSession, c2ee)) {
                findViewById.setVisibility(8);
                return;
            }
            findViewById.setVisibility(0);
            View findViewById2 = view.findViewById(R.id.nux_banner);
            if (findViewById2 != null) {
                findViewById2.setVisibility(0);
            }
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.pills_container);
            viewGroup.removeAllViewsInLayout();
            String C7I = c2ee.C7I();
            if (C7I != null) {
                if (A04(userSession, c2ee)) {
                    arrayList = AbstractC16960so.A1Q(EnumC33318EoD.A0B, EnumC33318EoD.A07, EnumC33318EoD.A0C, EnumC33318EoD.A05, EnumC33318EoD.A0I, EnumC33318EoD.A0H);
                } else {
                    InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(userSession).A01;
                    String A0R = AnonymousClass001.A0R("broadcast_channel_upranked_replies_pill_impression_count/", C7I);
                    boolean z = false;
                    if (interfaceC19630xq.getInt(A0R, 0) < 3) {
                        z = true;
                    }
                    if (z && C18U.A06(C06090Tz.A05, userSession, 36319377334541712L)) {
                        enumC33318EoDArr = new EnumC33318EoD[9];
                        enumC33318EoDArr[0] = EnumC33318EoD.A0D;
                        enumC33318EoDArr[1] = EnumC33318EoD.A0B;
                        enumC33318EoDArr[2] = EnumC33318EoD.A07;
                        enumC33318EoDArr[3] = EnumC33318EoD.A0C;
                        enumC33318EoDArr[4] = EnumC33318EoD.A05;
                        enumC33318EoDArr[5] = EnumC33318EoD.A0A;
                        enumC33318EoDArr[6] = EnumC33318EoD.A0G;
                        enumC33318EoD = EnumC33318EoD.A06;
                    } else {
                        enumC33318EoDArr = new EnumC33318EoD[9];
                        enumC33318EoDArr[0] = EnumC33318EoD.A0B;
                        enumC33318EoDArr[1] = EnumC33318EoD.A07;
                        enumC33318EoDArr[2] = EnumC33318EoD.A0C;
                        enumC33318EoDArr[3] = EnumC33318EoD.A05;
                        enumC33318EoDArr[4] = EnumC33318EoD.A0A;
                        enumC33318EoDArr[5] = EnumC33318EoD.A0G;
                        enumC33318EoDArr[6] = EnumC33318EoD.A06;
                        enumC33318EoD = EnumC33318EoD.A0D;
                    }
                    enumC33318EoDArr[7] = enumC33318EoD;
                    enumC33318EoDArr[8] = EnumC33318EoD.A09;
                    ArrayList A1N = AbstractC16960so.A1N(enumC33318EoDArr);
                    arrayList = A1N;
                    if (!C18U.A06(C06090Tz.A05, userSession, 36319377334738323L)) {
                        A1N.add(EnumC33318EoD.A08);
                        arrayList = A1N;
                    }
                }
                AbstractC34067F1v.A00(context, viewGroup, userSession, c7ik, c2ee, arrayList);
                TextView textView = (TextView) view.findViewById(R.id.title);
                View findViewById3 = view.findViewById(R.id.divider);
                if (!C18U.A06(C06090Tz.A05, userSession, 36322671566334349L)) {
                    if (A07(userSession, c2ee)) {
                        i = 2131954253;
                        if (c2ee.AdZ() == 2) {
                            i = 2131974807;
                        }
                    } else if (A06(userSession, c2ee)) {
                        C23031Ai A002 = AbstractC23021Ah.A00(userSession);
                        String C7I2 = c2ee.C7I();
                        if (C7I2 == null) {
                            C7I2 = "";
                        }
                        if (!A002.A01.getBoolean(AnonymousClass001.A0R("broadcast_channel_engagement_conversation_starters_nux/", C7I2), false)) {
                            i = 2131954231;
                        }
                    }
                    Integer valueOf = Integer.valueOf(i);
                    if (valueOf != null) {
                        textView.setText(context.getText(valueOf.intValue()));
                        return;
                    }
                }
                textView.setVisibility(8);
                findViewById3.setVisibility(8);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A09(View view, UserSession userSession, InterfaceC148366m6 interfaceC148366m6, C7IK c7ik, C2EE c2ee) {
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36319377333558661L)) {
            boolean A06 = C18U.A06(c06090Tz, userSession, 36319377334017418L);
            if (A07(userSession, c2ee)) {
                A01(userSession, c2ee);
                A02(userSession, c2ee);
            } else if (A06) {
                return;
            }
            Context context = view.getContext();
            C14360o3.A07(context);
            A08(context, view, userSession, c7ik, c2ee);
            return;
        }
        A00(view, userSession, interfaceC148366m6, c2ee);
    }

    public static final void A00(View view, UserSession userSession, InterfaceC148366m6 interfaceC148366m6, C2EE c2ee) {
        View findViewById = view.findViewById(R.id.nux_banner);
        if (findViewById != null && findViewById.getVisibility() == 0) {
            findViewById.setVisibility(8);
            interfaceC148366m6.DWL();
            C159187Ce c159187Ce = A00;
            if (A07(userSession, c2ee)) {
                c159187Ce.A01(userSession, c2ee);
                return;
            }
            if (!A06(userSession, c2ee)) {
                return;
            }
            String C7I = c2ee.C7I();
            if (C7I == null) {
                C7I = "";
            }
            InterfaceC19610xo ARD = AbstractC23021Ah.A00(userSession).A01.ARD();
            ARD.E7G(AnonymousClass001.A0R("broadcast_channel_conversation_starters_last_dismissed/", C7I), System.currentTimeMillis());
            ARD.apply();
            A03(userSession, c2ee, true);
        }
    }

    private final void A01(UserSession userSession, C2EE c2ee) {
        C23031Ai A002 = AbstractC23021Ah.A00(userSession);
        String C7I = c2ee.C7I();
        if (C7I == null) {
            C7I = "";
        }
        InterfaceC19610xo ARD = A002.A01.ARD();
        ARD.E77(AnonymousClass001.A0R("broadcast_chat_creator_education_nux/", C7I), true);
        ARD.apply();
        A03(userSession, c2ee, false);
    }

    public static final void A02(UserSession userSession, C2EE c2ee) {
        Long l;
        String str;
        C142846ck A002 = AbstractC147806l5.A00(userSession);
        int AdZ = c2ee.AdZ();
        String C7I = c2ee.C7I();
        String C7q = c2ee.C7q();
        boolean z = !A04(userSession, c2ee);
        C25531Mh A0E = C25531Mh.A0E(A002.A03);
        if (((AbstractC02600Aj) A0E).A00.isSampled()) {
            A0E.A0g(Long.valueOf(A002.A02));
            A0E.A0k("first_message_banner_rendered");
            A0E.A0j("view");
            A0E.A0o("first_message_banner");
            A0E.A0p("thread_view");
            A0E.A0n(AbstractC147806l5.A01(Integer.valueOf(AdZ)));
            A0E.A0r(C7I);
            if (C7q != null) {
                l = AbstractC003100w.A0k(10, C7q);
            } else {
                l = null;
            }
            A0E.A0h(l);
            if (z) {
                str = "True";
            } else {
                str = "False";
            }
            A0E.A0v(AbstractC16850sd.A0M(new C09530e4("has_sent_first_message", str)));
            A0E.Cht();
        }
    }

    public static final void A03(UserSession userSession, C2EE c2ee, boolean z) {
        Long l;
        String str;
        C142846ck A002 = AbstractC147806l5.A00(userSession);
        int AdZ = c2ee.AdZ();
        String C7I = c2ee.C7I();
        String C7q = c2ee.C7q();
        C25531Mh A0E = C25531Mh.A0E(A002.A03);
        if (((AbstractC02600Aj) A0E).A00.isSampled()) {
            A0E.A0g(Long.valueOf(A002.A02));
            A0E.A0k("first_message_banner_dismissed");
            A0E.A0j("view");
            A0E.A0o("first_message_banner");
            A0E.A0p("thread_view");
            A0E.A0n(AbstractC147806l5.A01(Integer.valueOf(AdZ)));
            A0E.A0r(C7I);
            if (C7q != null) {
                l = AbstractC003100w.A0k(10, C7q);
            } else {
                l = null;
            }
            A0E.A0h(l);
            if (z) {
                str = "True";
            } else {
                str = "False";
            }
            A0E.A0v(AbstractC16850sd.A0M(new C09530e4("has_sent_first_message", str)));
            A0E.Cht();
        }
    }

    public static final boolean A06(UserSession userSession, C2EE c2ee) {
        String C7I = c2ee.C7I();
        if (C7I == null) {
            C7I = "";
        }
        long currentTimeMillis = System.currentTimeMillis() - AbstractC23021Ah.A00(userSession).A01.getLong(AnonymousClass001.A0R("broadcast_channel_conversation_starters_last_dismissed/", C7I), 0L);
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean z = false;
        if (currentTimeMillis >= C18U.A01(c06090Tz, userSession, 36600852310331441L) * 1000) {
            z = true;
        }
        if (!A04(userSession, c2ee) && C18U.A06(c06090Tz, userSession, 36319377333558661L) && z) {
            return true;
        }
        return false;
    }

    public static final boolean A07(UserSession userSession, C2EE c2ee) {
        if (A04(userSession, c2ee)) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36322671566334349L)) {
                C23031Ai A002 = AbstractC23021Ah.A00(userSession);
                String C7I = c2ee.C7I();
                if (C7I == null) {
                    C7I = "";
                }
                if (!A002.A01.getBoolean(AnonymousClass001.A0R("has_creator_activation_animation_been_seen", C7I), false) || !C18U.A06(c06090Tz, userSession, 36322671566399886L)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
