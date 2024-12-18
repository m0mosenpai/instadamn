package X;

import android.os.Bundle;

/* renamed from: X.EwX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33807EwX {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        C32196ECr parseFromJson = AbstractC34814FVq.parseFromJson(C16V.A00(AbstractC31177DnL.A0e(c6fw, 1)));
        AbstractC12990ll A0A = C6BQ.A0A((C6FG) A03);
        C14360o3.A0A(parseFromJson);
        String str2 = parseFromJson.A01.A01;
        C14360o3.A07(str2);
        String str3 = parseFromJson.A01.A03;
        if (str3 != null) {
            AbstractC35179FfW.A02().A02(str2, str3);
        }
        C34643FOa c34643FOa = parseFromJson.A01;
        if (c34643FOa.A09 && (str = c34643FOa.A04) != null && str.length() != 0) {
            C35162Ff4 A02 = AbstractC35179FfW.A02();
            String str4 = parseFromJson.A01.A01;
            C14360o3.A07(str4);
            String str5 = parseFromJson.A01.A04;
            C14360o3.A07(str5);
            A02.A03(str4, str5);
        }
        String str6 = parseFromJson.A01.A01;
        C14360o3.A07(str6);
        C17280tP A0y = AbstractC166987dD.A0y();
        if (A0y.A09().contains(str6)) {
            A0y.A0H(AnonymousClass090.A03(str6, A0y.A09()));
        }
        C34643FOa c34643FOa2 = parseFromJson.A01;
        C14360o3.A07(c34643FOa2);
        Bundle A00 = C35002FbZ.A00(parseFromJson.A00);
        C34717FRd A0R = AbstractC31175DnJ.A0R();
        String str7 = c34643FOa2.A05;
        C14360o3.A07(str7);
        String str8 = c34643FOa2.A06;
        C14360o3.A07(str8);
        String str9 = c34643FOa2.A01;
        C14360o3.A07(str9);
        String str10 = c34643FOa2.A00;
        C14360o3.A07(str10);
        return AbstractC31180DnO.A0X(A0R.A02(A00, str7, str8, str9, str10, c34643FOa2.A02, true, c34643FOa2.A0A, c34643FOa2.A0E, c34643FOa2.A0F, c34643FOa2.A0B, false, c34643FOa2.A09, c34643FOa2.A07, c34643FOa2.A08), AbstractC25225BEi.A0r(C6BQ.A04(c6fq), A0A));
    }
}
