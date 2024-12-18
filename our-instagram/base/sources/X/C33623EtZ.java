package X;

import android.os.Handler;
import com.instagram.base.activity.BaseFragmentActivity;

/* renamed from: X.EtZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33623EtZ {
    public Handler A00;
    public BaseFragmentActivity A01;
    public AbstractC12990ll A02;
    public String A03;
    public String A04;

    public final void A00() {
        AbstractC12990ll abstractC12990ll = this.A02;
        String str = this.A04;
        String str2 = this.A03;
        C25621Ms A0C = AbstractC31179DnN.A0C(abstractC12990ll);
        A0C.A0L("accounts/confirm_email/%s/%s/", str, str2);
        C1ON A0D = AbstractC31175DnJ.A0D(A0C, C32186ECh.class, FY1.class, true);
        A0D.A00 = new C32491ESr(this);
        BaseFragmentActivity baseFragmentActivity = this.A01;
        C1GJ.A00(baseFragmentActivity, AbstractC018607g.A00(baseFragmentActivity), A0D);
    }
}
