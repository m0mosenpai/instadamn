package X;

import android.graphics.RectF;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelViewerConfig;
import java.util.List;

/* renamed from: X.P8a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56528P8a implements InterfaceC140686Xw {
    public final /* synthetic */ long A00;
    public final /* synthetic */ RectF A01;
    public final /* synthetic */ C3G2 A02;
    public final /* synthetic */ C3M4 A03;
    public final /* synthetic */ C63972vI A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;
    public final /* synthetic */ boolean A08;

    @Override // X.InterfaceC140686Xw
    public final void Dbk(float f) {
    }

    @Override // X.InterfaceC140686Xw
    public final void onCancel() {
    }

    public C56528P8a(RectF rectF, C3G2 c3g2, C3M4 c3m4, C63972vI c63972vI, Integer num, String str, List list, long j, boolean z) {
        this.A04 = c63972vI;
        this.A07 = list;
        this.A02 = c3g2;
        this.A06 = str;
        this.A05 = num;
        this.A00 = j;
        this.A08 = z;
        this.A01 = rectF;
        this.A03 = c3m4;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, X.6ab] */
    @Override // X.InterfaceC140686Xw
    public final void DhL(String str) {
        C63972vI c63972vI = this.A04;
        AbstractC149546o6 abstractC149546o6 = c63972vI.A00;
        if (abstractC149546o6 == null) {
            UserSession userSession = c63972vI.A04;
            MSW.A1X(userSession);
            abstractC149546o6 = new C143536ds(userSession);
            c63972vI.A00 = abstractC149546o6;
        }
        C1OU c1ou = C1OU.$redex_init_class;
        ?? obj = new Object();
        List list = this.A07;
        UserSession userSession2 = c63972vI.A04;
        obj.A02(userSession2, str, list);
        C3G2 c3g2 = this.A02;
        obj.A03(c3g2);
        obj.A08(c63972vI.A07.A04);
        obj.A0F = this.A06;
        obj.A08 = this.A05;
        obj.A01(userSession2);
        obj.A06(abstractC149546o6.A02);
        obj.A01 = this.A00;
        obj.A0d = this.A08;
        obj.A0U = true;
        String obj2 = c3g2.toString();
        C14360o3.A0B(obj2, 0);
        obj.A0I = obj2;
        AbstractC60672pq abstractC60672pq = c63972vI.A03;
        obj.A07(new C31559Dtj(abstractC60672pq.getActivity(), this.A01, c63972vI, C05F.A01).A03);
        obj.A05(this.A03.A0x);
        obj.A03 = ReelViewerConfig.A00();
        AbstractC31173DnH.A1I(abstractC60672pq, C6XJ.A01(abstractC60672pq.requireActivity(), obj.A00(), userSession2));
    }
}
