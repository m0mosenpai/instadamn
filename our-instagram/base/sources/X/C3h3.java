package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.3h3, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3h3 {
    public static final C116355Oo A00(InterfaceC38401qU interfaceC38401qU, ImageUrl imageUrl, C3h2 c3h2, int i, boolean z) {
        InterfaceC109094vY BRN;
        String BU6;
        SimpleImageUrl simpleImageUrl;
        C14360o3.A0B(interfaceC38401qU, 0);
        C14360o3.A0B(c3h2, 2);
        if (i != -1 && (interfaceC38401qU instanceof C38321qM)) {
            C38321qM c38321qM = (C38321qM) interfaceC38401qU;
            C38321qM A1e = c38321qM.A1e(i);
            if (A1e == null) {
                A1e = c38321qM;
            }
            BRN = A1e.BRN();
            C38321qM A1e2 = c38321qM.A1e(i);
            if (A1e2 == null) {
                A1e2 = c38321qM;
            }
            BU6 = A1e2.BU6();
        } else {
            BRN = interfaceC38401qU.BRN();
            BU6 = interfaceC38401qU.BU6();
        }
        String str = null;
        if (BRN == null) {
            return null;
        }
        InterfaceC109864xE A01 = BFB.A01(BRN);
        InterfaceC109864xE A00 = BFB.A00(BRN);
        if (BU6 != null) {
            simpleImageUrl = new SimpleImageUrl(AnonymousClass001.A0R("preview:/", BU6));
        } else {
            simpleImageUrl = null;
        }
        int A002 = AbstractC46598Kjb.A00(BRN.BEg());
        String title = BRN.getTitle();
        boolean z2 = false;
        if (A01 != null) {
            z2 = true;
        }
        boolean z3 = false;
        if (A00 != null) {
            z3 = true;
            str = A00.getText();
        }
        return new C116355Oo(new C9BW(27, new C30544DcR(A01, BRN, interfaceC38401qU, c3h2, i), new C9FR(i, 3, interfaceC38401qU, A00, c3h2)), simpleImageUrl, imageUrl, title, str, A002, z2, z3, z);
    }
}
