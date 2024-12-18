package X;

import com.instagram.model.fundraiser.FundraiserDisplayInfoModel;

/* renamed from: X.Nqu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53804Nqu {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A01;
        String A0Z = AbstractC31175DnJ.A0Z(c6fw, "null cannot be cast to non-null type kotlin.String");
        Object A00 = c6fw.A00();
        C14360o3.A0C(A00, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C102884kP c102884kP = (C102884kP) A00;
        String str2 = "";
        String str3 = "";
        String A0G = c102884kP.A0G();
        if (A0G != null) {
            str3 = A0G;
        }
        String A0E = c102884kP.A0E();
        String str4 = "";
        String A0I = c102884kP.A0I();
        if (A0I != null) {
            str4 = A0I;
        }
        String A0F = c102884kP.A0F();
        String A0J = c102884kP.A0J();
        if (A0J != null) {
            str2 = A0J;
        }
        AbstractC25651Mw.A00(C6BQ.A0B(c6fq)).E4s(new C171437kZ(new FundraiserDisplayInfoModel(str3, A0E, str4, A0F, str2), str, A0Z));
        return null;
    }
}
