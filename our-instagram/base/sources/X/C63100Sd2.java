package X;

import java.util.HashSet;
import java.util.LinkedHashMap;

/* renamed from: X.Sd2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63100Sd2 {
    public static final C63100Sd2 A00 = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.SEA, java.lang.Object] */
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type kotlin.String");
        String A0y = AbstractC43593JPy.A0y(c6fw, 1);
        InterfaceC103384lE A0I = AbstractC31175DnJ.A0I(c6fw, 2);
        InterfaceC103384lE A0I2 = AbstractC31175DnJ.A0I(c6fw, 3);
        String A002 = new C49352Or(C023409i.A0A.A08(A00).userId).A00();
        LinkedHashMap A07 = AbstractC06930Yk.A07(AbstractC167007dF.A1b("device_key", A002, AbstractC166987dD.A1L("cred_id", A03), AbstractC166987dD.A1L("secret_and_key", AnonymousClass001.A0i("proof.", A002, A0y, '.'))));
        HashSet A1H = AbstractC166987dD.A1H();
        A1H.add("secret_and_key");
        C62639SJw c62639SJw = SXG.A0A;
        C63346Si2 A01 = C63174SeZ.A01();
        ?? obj = new Object();
        obj.A00 = A07;
        obj.A01 = A1H;
        SXG A003 = c62639SJw.A00(A01, obj, "SEND_E2EE_DATA", AbstractC06930Yk.A0E(), C16910sj.A00);
        C63618SqQ c63618SqQ = new C63618SqQ(A0I2, A0I, c6fq, A002, 0);
        Q8J A012 = AbstractC63245Sfz.A01(A003);
        C14360o3.A07(A012);
        AbstractC63246Sg0.A01(null, A012, c63618SqQ);
        return null;
    }
}
