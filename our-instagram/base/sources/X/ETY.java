package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class ETY extends C1P1 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ InterfaceC144306fC A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public ETY(Activity activity, View view, UserSession userSession, InterfaceC144306fC interfaceC144306fC, String str, String str2, int i) {
        this.A04 = interfaceC144306fC;
        this.A03 = userSession;
        this.A05 = str;
        this.A01 = activity;
        this.A00 = i;
        this.A06 = str2;
        this.A02 = view;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-485581782);
        C14360o3.A0B(abstractC115105If, 0);
        super.onFail(abstractC115105If);
        this.A04.EYT(false);
        C22961AAf c22961AAf = C210679Tk.A01;
        Activity activity = this.A01;
        c22961AAf.A00(activity, activity.getString(2131963183), 0).show();
        C0f9.A0A(720041886, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A03 = C0f9.A03(-891121027);
        int A032 = C0f9.A03(1370504945);
        InterfaceC144306fC interfaceC144306fC = this.A04;
        interfaceC144306fC.EYT(false);
        UserSession userSession = this.A03;
        C36269FzM A00 = AbstractC34105F3h.A00(userSession);
        String str = this.A05;
        A00.A00.add(str);
        interfaceC144306fC.FAS(userSession);
        Activity activity = this.A01;
        int i2 = this.A00;
        String str2 = this.A06;
        View view = this.A02;
        G90 g90 = new G90(activity, userSession, interfaceC144306fC, str, str2, i2);
        if (view != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            i = (AbstractC13890nF.A00(activity) - (iArr[1] + view.getHeight())) + ((int) AbstractC13880nE.A00(activity, 16.0f));
        } else {
            i = 0;
        }
        C146106i8 A0K = AbstractC31171DnF.A0K();
        AbstractC25226BEj.A1N(activity, A0K, 2131966373);
        AbstractC31175DnJ.A0l(activity, A0K, 2131976066);
        A0K.A0A = g90;
        A0K.A0L = true;
        A0K.A06();
        A0K.A0R = true;
        A0K.A02 = i;
        AbstractC25233BEq.A1F(A0K);
        C0f9.A0A(1304437568, A032);
        C0f9.A0A(731478407, A03);
    }
}
