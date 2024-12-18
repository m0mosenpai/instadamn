package X;

import android.content.Context;
import com.google.gson.Gson;
import java.util.AbstractMap;
import java.util.List;

/* renamed from: X.Nr1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53811Nr1 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C1AD.A06(c06090Tz, 18316643948053644L)) {
            String A0e = AbstractC31177DnL.A0e(c6fw, 0);
            C6FG c6fg = c6fq.A03;
            if (c6fg != null) {
                Context context = c6fg.A00;
                C1AD.A01(c06090Tz, 18598118924818834L);
                Gson gson = new Gson();
                InterfaceC100484fC A00 = AbstractC50543MSw.A00(context, null, "underage_storage", new C50361MLn("underage_storage", 43));
                C03250Di c03250Di = C03250Di.A00;
                C14360o3.A07(c03250Di);
                C14360o3.A0B(A0e, 0);
                String str2 = (String) C2ST.A00(AnonymousClass191.A00, new MBX(A00, "{}", "underage", (InterfaceC23621Ds) null, 0));
                List A0m = AbstractC167007dF.A0m(A0e, "-", 0);
                if (A0m.size() > 2) {
                    str = AbstractC25226BEj.A1I(A0m, 2);
                } else {
                    str = "";
                }
                if (str.length() > 0) {
                    Object A09 = gson.A09(str2, new C60849RVm().type);
                    C14360o3.A07(A09);
                    AbstractMap abstractMap = (AbstractMap) A09;
                    AbstractC166997dE.A1U(str, abstractMap, AbstractC25227BEk.A06(AbstractC31171DnF.A0W(str, abstractMap), 0) + 1);
                    String A0B = new Gson().A0B(abstractMap);
                    C14360o3.A07(A0B);
                    InterfaceC105054oL ARC = A00.ARC();
                    ARC.E7J("underage", A0B);
                    ARC.AIX();
                    long now = c03250Di.now();
                    InterfaceC105054oL ARC2 = A00.ARC();
                    ARC2.E7F("underage_timestamp", now);
                    ARC2.AIX();
                }
            }
        }
        return null;
    }
}
