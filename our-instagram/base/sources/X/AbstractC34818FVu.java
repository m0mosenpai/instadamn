package X;

import android.content.Context;
import android.content.DialogInterface;

/* renamed from: X.FVu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34818FVu {
    public static DialogInterface.OnClickListener A00(Context context, C07270a1 c07270a1, FM6 fm6, C34691FQc c34691FQc, InterfaceC37227Gac interfaceC37227Gac, String str) {
        Object obj = EnumC33316EoB.A01.get(fm6.A00);
        obj.getClass();
        EnumC33316EoB enumC33316EoB = (EnumC33316EoB) obj;
        EnumC33368Ep1 enumC33368Ep1 = EnumC33368Ep1.GO_TO_HELPER_URL;
        EnumC33368Ep1 enumC33368Ep12 = fm6.A00;
        if (enumC33368Ep1 == enumC33368Ep12) {
            C35203Ffv.A00(c07270a1, null, null, null, "access_dialog", enumC33316EoB.A00);
            return new DialogInterfaceOnClickListenerC35448Fk5(4, enumC33316EoB, c07270a1, fm6, context);
        }
        EnumC33368Ep1 enumC33368Ep13 = EnumC33368Ep1.STOP_ACCOUNT_DELETION;
        String str2 = enumC33316EoB.A00;
        if (enumC33368Ep13 == enumC33368Ep12) {
            C35203Ffv.A00(c07270a1, null, null, null, "access_dialog", str2);
            return new DialogInterfaceOnClickListenerC35362Fid(enumC33316EoB, fm6, interfaceC37227Gac, c07270a1, str, 3);
        }
        C35203Ffv.A00(c07270a1, null, null, null, "access_dialog", str2);
        return new DialogInterfaceOnClickListenerC35448Fk5(5, enumC33316EoB, c34691FQc, interfaceC37227Gac, c07270a1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (r22 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(android.app.Activity r16, X.C07270a1 r17, X.C34691FQc r18, X.EfU r19, X.InterfaceC37227Gac r20, java.lang.String r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC34818FVu.A01(android.app.Activity, X.0a1, X.FQc, X.EfU, X.Gac, java.lang.String, java.lang.String):void");
    }
}
