package X;

import android.view.View;
import com.instagram.common.api.base.CacheBehaviorLogger;

/* loaded from: classes8.dex */
public final class LOL implements View.OnClickListener {
    public final /* synthetic */ C160607Hu A00;

    public LOL(C160607Hu c160607Hu) {
        this.A00 = c160607Hu;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int A05 = C0f9.A05(-1651877040);
        C160607Hu c160607Hu = this.A00;
        C159777Ep c159777Ep = c160607Hu.A0N;
        c159777Ep.A00();
        c159777Ep.A00.A19();
        C47929LEy c47929LEy = c160607Hu.A05;
        if (c47929LEy == null) {
            str = "bottomSheetController";
        } else {
            C46048Ka1 c46048Ka1 = new C46048Ka1();
            c46048Ka1.A00 = c47929LEy;
            EnumC82333lv enumC82333lv = c47929LEy.A00;
            if (enumC82333lv == null) {
                str = CacheBehaviorLogger.SOURCE;
            } else {
                c46048Ka1.A01 = enumC82333lv;
                C189448aO A0y = AbstractC25225BEi.A0y(c47929LEy.A05);
                A0y.A1O = true;
                C189478aR A00 = C49623LwG.A00(A0y, c47929LEy, 7);
                c47929LEy.A01 = A00;
                A00.A03(c47929LEy.A04, c46048Ka1);
                C0f9.A0C(1267124514, A05);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
