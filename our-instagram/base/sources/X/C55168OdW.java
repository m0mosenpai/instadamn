package X;

import android.content.Context;
import com.instagram.search.common.api.SerpApi;
import java.util.Map;

/* renamed from: X.OdW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55168OdW {
    public final Context A00;
    public final C92694De A01;
    public final C92694De A02;
    public final SerpApi A03;
    public final Map A04;
    public final Map A05;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.instagram.search.common.api.SerpApi] */
    public C55168OdW(Context context) {
        C14360o3.A0B(context, 1);
        this.A00 = context;
        this.A03 = new Object();
        this.A05 = AbstractC166987dD.A1I();
        this.A04 = AbstractC166987dD.A1I();
        C92674Dc c92674Dc = C92674Dc.A00;
        this.A02 = AbstractC166177bl.A00(c92674Dc);
        this.A01 = AbstractC166177bl.A00(c92674Dc);
    }

    public static final C05A A01(C55168OdW c55168OdW, String str, String str2) {
        Map map = c55168OdW.A04;
        String A0T = AnonymousClass001.A0T(str, str2, ':');
        Object obj = map.get(A0T);
        if (obj == null) {
            obj = AbstractC25225BEi.A1H(new C38679GzK());
            map.put(A0T, obj);
        }
        return (C05A) obj;
    }

    public static final C05A A02(C55168OdW c55168OdW, String str, String str2) {
        Map map = c55168OdW.A05;
        String A0T = AnonymousClass001.A0T(str, str2, ':');
        Object obj = map.get(A0T);
        if (obj == null) {
            C16930sl c16930sl = C16930sl.A00;
            Integer num = C05F.A00;
            obj = AbstractC25225BEi.A1H(new C51747MtW(null, new C51735MtI(), null, null, null, C52716NUc.A00, num, null, null, null, null, null, null, null, c16930sl, AbstractC06930Yk.A0E(), AbstractC166987dD.A1I(), 0, 0, false, false, false, false, false, false));
            map.put(A0T, obj);
        }
        return (C05A) obj;
    }

    public final void A04(String str, String str2, String str3) {
        C05A A02 = A02(this, str, str2);
        C51747MtW c51747MtW = (C51747MtW) A02.getValue();
        C14360o3.A0B(c51747MtW, 0);
        A02.Egh(C51747MtW.A00(null, null, null, null, null, null, c51747MtW, null, null, null, str3, null, null, null, null, null, null, 0, 0, 33552383, false, false, false, false, false, false));
    }

    public static C51747MtW A00(C55168OdW c55168OdW, String str, String str2) {
        return (C51747MtW) A02(c55168OdW, str, str2).getValue();
    }

    public static final void A03(C55168OdW c55168OdW, String str, String str2, InterfaceC16660sJ interfaceC16660sJ) {
        C05A A02 = A02(c55168OdW, str, str2);
        A02.Egh(interfaceC16660sJ.invoke(A02.getValue()));
    }
}
