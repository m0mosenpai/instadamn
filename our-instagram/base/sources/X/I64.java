package X;

import android.widget.TextView;

/* loaded from: classes7.dex */
public abstract class I64 {
    public static final void A00(C38482Gw3 c38482Gw3, C42315Iod c42315Iod) {
        InterfaceC09390do interfaceC09390do = c38482Gw3.A03;
        TextView A06 = AbstractC37302Gc3.A06(interfaceC09390do);
        C45126Jxv c45126Jxv = c42315Iod.A00;
        String str = c45126Jxv.A02;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        Object invoke = c42315Iod.A01.A00.invoke();
        if (invoke == null) {
            invoke = c45126Jxv.A01;
        }
        String A062 = AbstractC13670mt.A06("%s %s", invoke, str);
        int color = AbstractC167007dF.A0L(interfaceC09390do).getContext().getColor(AbstractC53242c7.A06(AbstractC167007dF.A0L(interfaceC09390do).getContext()));
        AnonymousClass773.A07(new HE9(new C012804r(16, (CharSequence) null), C05F.A01, c42315Iod, str, color, 2), A06, str2, A062);
    }
}
