package X;

import android.app.Activity;
import android.content.res.Resources;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;

/* loaded from: classes6.dex */
public final class EU5 extends C1P1 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C38321qM A01;
    public final /* synthetic */ Reel A02;
    public final /* synthetic */ C6WQ A03;
    public final /* synthetic */ C34570FLe A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ boolean A07;

    public EU5(Activity activity, C38321qM c38321qM, Reel reel, C6WQ c6wq, C34570FLe c34570FLe, String str, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        this.A00 = activity;
        this.A07 = z;
        this.A03 = c6wq;
        this.A01 = c38321qM;
        this.A05 = str;
        this.A04 = c34570FLe;
        this.A02 = reel;
        this.A06 = interfaceC16820sZ;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-170535485);
        this.A03.dismiss();
        Activity activity = this.A00;
        C9GR.A03(activity, activity.getString(2131976159), "UpdateHighlight_unknown_error_occured", 0);
        this.A06.invoke();
        C0f9.A0A(-1597931122, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(661700011);
        super.onStart();
        Activity activity = this.A00;
        int i = 2131972341;
        if (this.A07) {
            i = 2131952472;
        }
        String A0p = AbstractC166997dE.A0p(activity, i);
        C6WQ c6wq = this.A03;
        c6wq.A00(A0p);
        C0fJ.A00(c6wq);
        C0f9.A0A(848993637, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        String str;
        int A03 = C0f9.A03(-1715663740);
        EBB ebb = (EBB) obj;
        int A0N = AbstractC167017dG.A0N(ebb, -1104020667);
        this.A03.dismiss();
        boolean z = this.A07;
        C38321qM c38321qM = this.A01;
        String str2 = this.A05;
        if (z) {
            c38321qM.A4N(str2);
            i = 2131964512;
        } else {
            c38321qM.A4O(str2);
            i = 2131964513;
        }
        C37771pE c37771pE = ebb.A00;
        if (c37771pE != null) {
            C34570FLe c34570FLe = this.A04;
            c34570FLe.A00.A05(new C3DH(C1OU.A04(c34570FLe.A01).A0I(c37771pE, true)));
        }
        C34570FLe c34570FLe2 = this.A04;
        Activity activity = this.A00;
        Resources resources = activity.getResources();
        Reel reel = this.A02;
        ImageUrl imageUrl = null;
        if (reel != null) {
            str = reel.A0r;
        } else {
            str = null;
        }
        String A0r = AbstractC166997dE.A0r(resources, str, i);
        if (reel != null) {
            imageUrl = reel.A07();
        }
        G8O g8o = new G8O(1, activity, c34570FLe2);
        C2OG A01 = C2OG.A01();
        C34648FOf A00 = C35129FeW.A00(c34570FLe2.A01.userId);
        A00.A0G = AbstractC111324zv.A00(216);
        A00.A04 = imageUrl;
        A00.A0H = A0r;
        A00.A03 = PushChannelType.A09;
        A00.A08 = g8o;
        C35129FeW.A01(A00, A01);
        this.A06.invoke();
        C0f9.A0A(347206670, A0N);
        C0f9.A0A(-1876581784, A03);
    }
}
