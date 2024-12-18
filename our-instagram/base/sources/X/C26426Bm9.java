package X;

import android.content.Context;
import android.text.Layout;
import android.util.SparseArray;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Bm9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26426Bm9 extends AbstractC51572Yf {
    public final C206259Bi A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final C57332k8 A03;
    public final boolean A04;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        Layout layout;
        C84923qg A1W;
        C14360o3.A0B(c76223bS, 0);
        AbstractC77063cs.A00(c76223bS, DCL.A00);
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(R.id.post_impression_view_tracking_node, EnumC77673dr.A0B);
        C206259Bi c206259Bi = this.A00;
        C51762Yz A01 = AbstractC77273dD.A01(c76223bS, (C75113Zb) c206259Bi.A04, DO9.A00, 4, true);
        C76623c7 c76623c7 = (C76623c7) c206259Bi.A03;
        C38321qM c38321qM = c76623c7.A01;
        if (c38321qM.A5M()) {
            c38321qM = c38321qM.A1e(AbstractC166987dD.A0H(A01.A03));
        }
        C51722Yv c51722Yv = null;
        if (c38321qM != null && (A1W = c38321qM.A1W()) != null) {
            C57332k8 c57332k8 = this.A03;
            Context A0A = AbstractC25227BEk.A0A(c76223bS);
            layout = c57332k8.A0C(A0A, A1W, AbstractC53242c7.A0F(A0A, R.attr.textColorBoldLink));
        } else {
            layout = (Layout) c206259Bi.A02;
        }
        Integer num = (Integer) c206259Bi.A01;
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A00 = AbstractC77823e9.A00(EnumC71343Hv.A0j, AbstractC25234BEr.A0D(C9CV.A00(null, C05F.A0E, sparseArray, 4), AbstractC25227BEk.A0Y(0, AbstractC77623dm.A0C(c76223bS)), 0, AbstractC77623dm.A06(c76223bS)), this.A01, c76623c7, this.A02, num, false, false);
        if (this.A04) {
            c51722Yv = C9CV.A00(null, C05F.A0j, 4, 0);
        }
        return new AnonymousClass416(layout, A00.A00(c51722Yv), num);
    }

    public C26426Bm9(C206259Bi c206259Bi, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C57332k8 c57332k8, boolean z) {
        AbstractC167017dG.A1P(userSession, interfaceC60442pS);
        this.A01 = userSession;
        this.A02 = interfaceC60442pS;
        this.A00 = c206259Bi;
        this.A04 = z;
        this.A03 = c57332k8;
    }
}
