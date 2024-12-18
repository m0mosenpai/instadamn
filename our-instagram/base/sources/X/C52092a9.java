package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.2a9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52092a9 {
    public static final C52092a9 A00 = new Object();
    public static final C19L A02 = AnonymousClass194.A02(C12L.A00.AOT(1562465960, 3).A00(1));
    public static final InterfaceC09390do A01 = AbstractC09440dt.A01(C52122aC.A00);

    public final void A01(EnumC82173le enumC82173le, ImageUrl imageUrl, String str, String str2, int i) {
        String str3 = str;
        C14360o3.A0B(str2, 4);
        int hashCode = imageUrl.getUrl().hashCode();
        if (str == null) {
            str3 = "unknown message";
        }
        A00(new C103664lk(enumC82173le, str3, str2, hashCode, i));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2a9, java.lang.Object] */
    static {
        C52142aE c52142aE = C52142aE.A00;
        C14360o3.A0B(c52142aE, 0);
        C1ON.A08 = c52142aE;
    }

    public static final void A00(AbstractC88103wI abstractC88103wI) {
        C19L c19l = A02;
        C206649Cv c206649Cv = new C206649Cv(abstractC88103wI, null, 44);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206649Cv, c19l);
    }
}
