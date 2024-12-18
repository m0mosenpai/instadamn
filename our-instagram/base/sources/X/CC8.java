package X;

import android.view.View;

/* loaded from: classes5.dex */
public abstract class CC8 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        View view;
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            C102884kP c102884kP = (C102884kP) c6fw.A01();
            if (c102884kP.A05 == 16444) {
                Object A06 = AnonymousClass634.A06(c6fg, c102884kP);
                A06.getClass();
                C28182CbU c28182CbU = (C28182CbU) A06;
                InterfaceC09390do interfaceC09390do = c28182CbU.A04;
                if (!((CUA) interfaceC09390do.getValue()).A02.isShowing() && !((CUA) interfaceC09390do.getValue()).A01 && (view = c28182CbU.A00) != null) {
                    CUA cua = (CUA) interfaceC09390do.getValue();
                    C65076Td9 c65076Td9 = new C65076Td9(16, c28182CbU, c102884kP);
                    C79243gV A00 = ((C69600Vs3) cua.A04.getValue()).A00(view, c102884kP);
                    if (A00 != null) {
                        BZF bzf = cua.A02;
                        View contentView = bzf.getContentView();
                        C14360o3.A0C(contentView, AbstractC111324zv.A00(480));
                        ((C131565ws) contentView).setRenderTree(A00);
                        c65076Td9.invoke(bzf);
                    }
                    C28182CbU.A00(c28182CbU, c102884kP, true, true);
                    return null;
                }
                return null;
            }
            AbstractC25241Le.A02(AbstractC111324zv.A00(758), "Signature called with invalid model.");
            return null;
        }
        throw AbstractC25227BEk.A0n();
    }
}
