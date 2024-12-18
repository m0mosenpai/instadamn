package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes8.dex */
public final class KMP extends AbstractRunnableC14200nk {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Bitmap A01;
    public final /* synthetic */ C206409Bx A02;
    public final /* synthetic */ C49674Lx5 A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMP(Bitmap bitmap, C206409Bx c206409Bx, C49674Lx5 c49674Lx5, int i, boolean z) {
        super(118, 2, false, false);
        this.A03 = c49674Lx5;
        this.A01 = bitmap;
        this.A00 = i;
        this.A04 = z;
        this.A02 = c206409Bx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C49674Lx5 c49674Lx5 = this.A03;
        UserSession userSession = c49674Lx5.A00.A0D;
        final C183978Ee A03 = AbstractC209669Pc.A03(this.A01, this.A02, userSession, C50472Tr.A01(), AbstractC917048o.A04("direct_temp_photo", ".jpg"), this.A00, this.A04);
        final DirectShareTarget directShareTarget = c49674Lx5.A01;
        final String str = c49674Lx5.A02;
        C11T.A02(new Runnable() { // from class: X.M6D
            @Override // java.lang.Runnable
            public final void run() {
                KMP kmp = KMP.this;
                C183978Ee c183978Ee = A03;
                DirectShareTarget directShareTarget2 = directShareTarget;
                String str2 = str;
                C8LZ c8lz = kmp.A03.A00;
                if (str2 == null) {
                    str2 = c8lz.A0I.A01.toString();
                }
                UserSession userSession2 = c8lz.A0D;
                Context applicationContext = c8lz.A0A.getApplicationContext();
                C14360o3.A0B(userSession2, 0);
                AbstractC25234BEr.A1P(applicationContext, c183978Ee, str2);
                DirectThreadKey A01 = AbstractC140956Yx.A01(AbstractC140946Yw.A01(directShareTarget2.A01()));
                C7TG A00 = AbstractC165967bO.A00(userSession2);
                C14360o3.A0B(A01, 0);
                DirectThreadKey A012 = JRE.A01(A01);
                JQn.A00(C42221xC.A06(new C48466LcJ(A00, A012, c183978Ee, C7TG.A00(A00, C2EY.A1C, A012.A00, false), str2, false)), c8lz.A0C, c8lz, 1);
            }
        });
    }
}
