package X;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* renamed from: X.3hB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79603hB extends C0YY implements InterfaceC16600sD {
    public static final C79603hB A00 = new C79603hB();

    public C79603hB() {
        super(4);
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        InterfaceC80083hx interfaceC80083hx = (InterfaceC80083hx) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        Context context = (Context) obj4;
        C14360o3.A0B(interfaceC80083hx, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(context, 3);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        AnonymousClass773.A05(spannableStringBuilder, new C39401Hal(interfaceC80083hx, context.getColor(AbstractC53242c7.A0E(context))), str);
        return spannableStringBuilder;
    }
}
