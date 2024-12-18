package X;

import android.view.View;
import com.instagram.common.api.base.CacheBehaviorLogger;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class LPP implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C160607Hu A01;
    public final /* synthetic */ L4K A02;
    public final /* synthetic */ InterfaceC16660sJ A03;
    public final /* synthetic */ boolean A04;

    public LPP(C160607Hu c160607Hu, L4K l4k, InterfaceC16660sJ interfaceC16660sJ, int i, boolean z) {
        this.A03 = interfaceC16660sJ;
        this.A02 = l4k;
        this.A01 = c160607Hu;
        this.A04 = z;
        this.A00 = i;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [X.Jfh, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int A05 = C0f9.A05(-112933199);
        InterfaceC16660sJ interfaceC16660sJ = this.A03;
        L4K l4k = this.A02;
        interfaceC16660sJ.invoke(l4k);
        C160607Hu c160607Hu = this.A01;
        C159777Ep c159777Ep = c160607Hu.A0N;
        String str2 = l4k.A04;
        C159737El c159737El = c159777Ep.A00;
        c159737El.A0b.A05(str2);
        c159777Ep.A00();
        if (this.A04) {
            String str3 = l4k.A00;
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            Integer num = l4k.A03;
            ?? obj = new Object();
            obj.A00 = C05F.A01;
            obj.A03 = "";
            obj.A02 = str2;
            obj.A01 = str3;
            obj.A00 = num;
            c159737El.A0b.A07 = obj;
            C7P0 c7p0 = c160607Hu.A03;
            if (c7p0 == null) {
                str = "tasLogger";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            String str5 = (String) AbstractC001800i.A0O(c160607Hu.A0P, 0);
            if (str5 != null) {
                str4 = str5;
            }
            String str6 = c160607Hu.A0M.userId;
            C14360o3.A0B(str6, 1);
            C7P0.A01(C7P0.A00(num), C7P1.CLICK, C7P2.SUGGESTED_REPLY_BANNER, c7p0, str4, str6);
        }
        LGj lGj = c160607Hu.A0A;
        if (lGj == null) {
            str = "suggestedReplyLogger";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        InterfaceC82343lw interfaceC82343lw = l4k.A02;
        String str7 = l4k.A05;
        int i = this.A00;
        String str8 = c160607Hu.A0E;
        HashMap A11 = AbstractC31174DnI.A11(str8, 3);
        A11.put(CacheBehaviorLogger.SOURCE, ((EnumC82333lv) interfaceC82343lw).A01);
        A11.put("position", String.valueOf(i));
        A11.put(AbstractC31688Dvt.A00(), str8);
        LGj.A00(lGj, interfaceC82343lw, "suggested_replies_row_tap", str7, A11);
        C0f9.A0C(-2072898817, A05);
    }
}
