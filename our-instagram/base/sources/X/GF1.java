package X;

import android.graphics.RectF;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.reels.Reel;
import java.util.List;

/* loaded from: classes6.dex */
public final class GF1 implements InterfaceC140686Xw {
    public final /* synthetic */ int A00;
    public final /* synthetic */ RectF A01;
    public final /* synthetic */ C7KE A02;
    public final /* synthetic */ Reel A03;
    public final /* synthetic */ C3G2 A04;
    public final /* synthetic */ C3M4 A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ List A08;

    @Override // X.InterfaceC140686Xw
    public final void Dbk(float f) {
    }

    public GF1(RectF rectF, C7KE c7ke, Reel reel, C3G2 c3g2, C3M4 c3m4, String str, String str2, List list, int i) {
        this.A02 = c7ke;
        this.A08 = list;
        this.A03 = reel;
        this.A04 = c3g2;
        this.A00 = i;
        this.A07 = str;
        this.A06 = str2;
        this.A05 = c3m4;
        this.A01 = rectF;
    }

    @Override // X.InterfaceC140686Xw
    public final void DhL(String str) {
        C7KE c7ke = this.A02;
        if (!c7ke.A07.isResumed()) {
            onCancel();
            return;
        }
        C141586ab A0U = AbstractC31171DnF.A0U();
        List list = this.A08;
        String id = this.A03.getId();
        UserSession userSession = c7ke.A06;
        A0U.A02(userSession, id, list);
        A0U.A03(this.A04);
        AbstractC31177DnL.A1P(A0U);
        A0U.A01(userSession);
        A0U.A04(Integer.valueOf(this.A00));
        A0U.A03 = c7ke.A00;
        AbstractC149546o6 abstractC149546o6 = c7ke.A01;
        if (abstractC149546o6 != null) {
            A0U.A06(abstractC149546o6.A02);
            String str2 = this.A07;
            if (str2 != null) {
                A0U.A0E = str2;
            }
            String str3 = this.A06;
            if (str3 != null) {
                A0U.A0B = str3;
            }
            C3M4 c3m4 = this.A05;
            RectF rectF = this.A01;
            AbstractC140596Xn abstractC140596Xn = c7ke.A02;
            if (abstractC140596Xn == null) {
                abstractC140596Xn = new C31559Dtj(c7ke.A04, rectF, c7ke, C05F.A01);
                c7ke.A02 = abstractC140596Xn;
            }
            A0U.A07(abstractC140596Xn.A03);
            A0U.A05(c3m4.A0x);
            AbstractC31178DnM.A0j(c7ke.A04, A0U.A00(), userSession, TransparentModalActivity.class, "reel_viewer");
            C006802i.A0p.markerEnd(18941461, (short) 2);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC140686Xw
    public final void onCancel() {
        C140626Xq c140626Xq = this.A02.A03;
        if (c140626Xq != null) {
            c140626Xq.A05(C05F.A0Y);
        }
    }
}
