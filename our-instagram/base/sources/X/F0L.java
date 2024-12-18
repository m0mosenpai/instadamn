package X;

import com.facebook.proxygen.TraceFieldType;

/* loaded from: classes6.dex */
public abstract class F0L {
    public static void A00(C18920wW c18920wW, String str, String str2) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c18920wW, "instagram_insights_action");
        long A00 = C1Q9.A00();
        long currentTimeMillis = System.currentTimeMillis();
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1C(A0f, "tap");
            A0f.AAP("unit", str2);
            A0f.AAP("unit_state", "appeared");
            A0f.AAP("parent_unit", null);
            A0f.AAP("component", str);
            AbstractC31175DnJ.A10(A0f, currentTimeMillis);
            A0f.A9K(TraceFieldType.StartTime, Long.valueOf(A00));
            A0f.A9K("elapsed_time", Long.valueOf(currentTimeMillis - A00));
            AbstractC31175DnJ.A0y(A0f);
            A0f.A7v("is_internal_build", AbstractC166997dE.A0a());
            A0f.Cht();
        }
    }
}
