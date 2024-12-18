package X;

import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.pendingmedia.store.PendingMediaStoreSerializer;

/* loaded from: classes9.dex */
public final class N9X extends C1P1 {
    public final /* synthetic */ C31291eY A00;
    public final /* synthetic */ C31271eW A01;

    public N9X(C31291eY c31291eY, C31271eW c31271eW) {
        this.A00 = c31291eY;
        this.A01 = c31271eW;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -1468281784);
        super.onFail(abstractC115105If);
        UserSession userSession = this.A00.A00;
        String str = this.A01.A07().A00;
        if (str == null) {
            str = "";
        }
        AbstractC46994KqD.A00(EnumC53373NjO.FILE_SENT_IN_ERROR, userSession, str);
        C0f9.A0A(-509134957, A0N);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1638372762);
        int A0N = AbstractC167017dG.A0N(obj, 802398735);
        super.onSuccess(obj);
        C31291eY c31291eY = this.A00;
        UserSession userSession = c31291eY.A00;
        C31271eW c31271eW = this.A01;
        String str = c31271eW.A07().A00;
        if (str == null) {
            str = "";
        }
        AbstractC46994KqD.A00(EnumC53373NjO.FILE_SENT_IN_SUCCESS, userSession, str);
        C47Z A032 = ((PendingMediaStore) c31291eY.A02.getValue()).A03(c31271eW.A02);
        if (A032 != null) {
            A032.A0Z(EnumC915447k.A02);
            ((PendingMediaStoreSerializer) c31291eY.A03.getValue()).A04();
        }
        C0f9.A0A(262242871, A0N);
        C0f9.A0A(1765292180, A03);
    }
}
