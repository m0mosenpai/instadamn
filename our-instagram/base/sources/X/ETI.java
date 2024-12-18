package X;

import android.content.Context;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class ETI extends C1P1 {
    public final /* synthetic */ C684436h A00;
    public final /* synthetic */ FL3 A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ boolean A03;

    public ETI(C684436h c684436h, FL3 fl3, User user, boolean z) {
        this.A02 = user;
        this.A03 = z;
        this.A00 = c684436h;
        this.A01 = fl3;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 771074065);
        super.onFail(abstractC115105If);
        AbstractC34042F0v.A00(this.A00.A00, abstractC115105If, "update_feed_favorites_request_failure");
        FL3 fl3 = this.A01;
        if (fl3 != null) {
            boolean z = !this.A03;
            User user = fl3.A02;
            FOQ foq = fl3.A01;
            Context context = fl3.A00;
            user.A0y(z);
            FWX.A01(context, foq, z);
        }
        C0f9.A0A(-208689636, A0N);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.1vN] */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-595698771);
        int A0N = AbstractC167017dG.A0N(obj, 96255158);
        super.onSuccess(obj);
        User user = this.A02;
        boolean z = this.A03;
        user.A0y(z);
        AbstractC25651Mw.A00(this.A00.A01).E4s(new Object());
        FL3 fl3 = this.A01;
        if (fl3 != null) {
            User user2 = fl3.A02;
            FOQ foq = fl3.A01;
            Context context = fl3.A00;
            user2.A0y(z);
            FWX.A01(context, foq, z);
        }
        C0f9.A0A(1793377562, A0N);
        C0f9.A0A(804505704, A03);
    }
}
