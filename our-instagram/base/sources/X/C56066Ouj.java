package X;

import android.app.Activity;
import com.instagram.profilecard.domain.ProfileCardViewModel;
import com.instagram.share.handleractivity.CustomStoryShareHandlerActivity;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.Ouj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56066Ouj implements InterfaceC23471Cj {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C56066Ouj(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC23471Cj
    public final void DYE(Map map) {
        switch (this.A00) {
            case 0:
                Activity activity = (Activity) this.A01;
                if (AbstractC93174Ft.A03(activity)) {
                    ProfileCardViewModel.A03(activity, (ProfileCardViewModel) this.A02);
                    return;
                }
                return;
            case 1:
                CustomStoryShareHandlerActivity customStoryShareHandlerActivity = (CustomStoryShareHandlerActivity) this.A02;
                if (AbstractC93174Ft.A03(customStoryShareHandlerActivity)) {
                    ((Runnable) this.A01).run();
                    return;
                } else {
                    CustomStoryShareHandlerActivity.A01(customStoryShareHandlerActivity, "permission_failure");
                    customStoryShareHandlerActivity.finish();
                    return;
                }
            default:
                String[] strArr = (String[]) this.A01;
                for (String str : strArr) {
                    if (map.get(str) != EnumC172127lh.A05) {
                        C195988ln c195988ln = AbstractC195978lm.A02;
                        StringBuilder A1C = AbstractC166987dD.A1C();
                        A1C.append("User has denied permission: ");
                        OWe oWe = (OWe) this.A02;
                        ArrayList A1E = AbstractC166987dD.A1E();
                        for (String str2 : strArr) {
                            if (!AbstractC23451Ch.A07(oWe.A09, str2)) {
                                A1E.add(str2);
                            }
                        }
                        c195988ln.A04("sup:MediaStreamControllerDelegate", AbstractC166997dE.A0v(A1E, A1C), null);
                        C54845OMq c54845OMq = oWe.A01;
                        if (c54845OMq != null) {
                            c54845OMq.A0B.Cm6(null, new N1B("BT_PERMISSIONS_NOT_GRANTED"));
                            return;
                        }
                        return;
                    }
                }
                AbstractC55106ObM A01 = ((OWe) this.A02).A01();
                if (A01 != null) {
                    A01.A0E(true);
                    return;
                }
                return;
        }
    }
}
