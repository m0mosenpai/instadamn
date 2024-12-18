package X;

import com.instagram.api.schemas.ReelAutoArchiveSettingStr;
import com.instagram.user.model.User;

/* loaded from: classes9.dex */
public final class NA9 extends C1P1 {
    public final /* synthetic */ ReelAutoArchiveSettingStr A00;
    public final /* synthetic */ C1P1 A01;
    public final /* synthetic */ User A02;

    public NA9(ReelAutoArchiveSettingStr reelAutoArchiveSettingStr, C1P1 c1p1, User user) {
        this.A01 = c1p1;
        this.A02 = user;
        this.A00 = reelAutoArchiveSettingStr;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -1691737502);
        User user = this.A02;
        user.A03.EcH(this.A00);
        C1P1 c1p1 = this.A01;
        if (c1p1 != null) {
            c1p1.onFail(abstractC115105If);
        }
        C0f9.A0A(-472732834, A0N);
    }

    @Override // X.C1P1
    public final void onFailInBackground(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 749183660);
        C1P1 c1p1 = this.A01;
        if (c1p1 != null) {
            c1p1.onFailInBackground(abstractC115105If);
        }
        C0f9.A0A(278542365, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(1638675820);
        C1P1 c1p1 = this.A01;
        if (c1p1 != null) {
            c1p1.onFinish();
        }
        C0f9.A0A(931451157, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(326382319);
        C1P1 c1p1 = this.A01;
        if (c1p1 != null) {
            c1p1.onStart();
        }
        C0f9.A0A(-1772195725, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(82915879);
        int A0N = AbstractC167017dG.A0N(obj, 790200731);
        C1P1 c1p1 = this.A01;
        if (c1p1 != null) {
            c1p1.onSuccess(obj);
        }
        C0f9.A0A(-1636869653, A0N);
        C0f9.A0A(-1384434117, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(-1027514751);
        int A0N = AbstractC167017dG.A0N(obj, -1479147455);
        C1P1 c1p1 = this.A01;
        if (c1p1 != null) {
            c1p1.onSuccessInBackground(obj);
        }
        C0f9.A0A(2051485954, A0N);
        C0f9.A0A(43006761, A03);
    }
}
