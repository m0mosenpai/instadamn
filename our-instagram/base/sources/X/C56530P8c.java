package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelViewerConfig;
import java.util.List;

/* renamed from: X.P8c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56530P8c implements InterfaceC140686Xw {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ RecyclerView A03;
    public final /* synthetic */ C3G2 A04;
    public final /* synthetic */ C3M4 A05;
    public final /* synthetic */ InterfaceC72953Ov A06;
    public final /* synthetic */ C63972vI A07;
    public final /* synthetic */ Integer A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ List A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    public C56530P8c(RecyclerView recyclerView, C3G2 c3g2, C3M4 c3m4, InterfaceC72953Ov interfaceC72953Ov, C63972vI c63972vI, Integer num, String str, String str2, List list, float f, int i, long j, boolean z, boolean z2) {
        this.A07 = c63972vI;
        this.A0B = list;
        this.A04 = c3g2;
        this.A09 = str;
        this.A08 = num;
        this.A02 = j;
        this.A0C = z;
        this.A00 = f;
        this.A0A = str2;
        this.A01 = i;
        this.A03 = recyclerView;
        this.A0D = z2;
        this.A06 = interfaceC72953Ov;
        this.A05 = c3m4;
    }

    @Override // X.InterfaceC140686Xw
    public final void Dbk(float f) {
        ((C73203Pv) this.A06).CMM();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.6ab] */
    @Override // X.InterfaceC140686Xw
    public final void DhL(String str) {
        C63972vI c63972vI = this.A07;
        AbstractC60672pq abstractC60672pq = c63972vI.A03;
        if (!abstractC60672pq.isResumed()) {
            onCancel();
            return;
        }
        if (c63972vI.A00 == null) {
            UserSession userSession = c63972vI.A04;
            MSW.A1X(userSession);
            c63972vI.A00 = new C143536ds(userSession);
        }
        C1OU c1ou = C1OU.$redex_init_class;
        ?? obj = new Object();
        List list = this.A0B;
        UserSession userSession2 = c63972vI.A04;
        obj.A02(userSession2, str, list);
        C3G2 c3g2 = this.A04;
        obj.A03(c3g2);
        obj.A08(c63972vI.A07.A04);
        obj.A0F = this.A09;
        obj.A08 = this.A08;
        obj.A01(userSession2);
        AbstractC149546o6 abstractC149546o6 = c63972vI.A00;
        C14360o3.A0A(abstractC149546o6);
        obj.A06(abstractC149546o6.A02);
        obj.A01 = this.A02;
        obj.A0d = this.A0C;
        obj.A07 = Float.valueOf(this.A00);
        obj.A0I = this.A0A;
        int i = this.A01;
        if (i != -1) {
            obj.A04(Integer.valueOf(i));
        }
        RecyclerView recyclerView = this.A03;
        if (recyclerView != null) {
            MZ0 mz0 = new MZ0(abstractC60672pq.requireActivity(), recyclerView, abstractC60672pq, userSession2, c3g2, c63972vI, this.A0D);
            c63972vI.A01 = mz0;
            obj.A07(((AbstractC140596Xn) mz0).A03);
            obj.A05(this.A05.A0x);
            obj.A03 = ReelViewerConfig.A00();
            AbstractC31173DnH.A1I(abstractC60672pq, C6XJ.A01(abstractC60672pq.requireActivity(), obj.A00(), userSession2));
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC140686Xw
    public final void onCancel() {
        ((C73203Pv) this.A06).EkR(this.A07.A03);
    }
}
