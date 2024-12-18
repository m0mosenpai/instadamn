package X;

import java.util.Locale;

/* renamed from: X.T7y, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64289T7y implements InterfaceC28041Xi {
    public static final C64289T7y A00 = new C64289T7y();

    @Override // X.InterfaceC28041Xi
    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        String str = (String) obj;
        if (str == null) {
            return false;
        }
        Locale locale = Locale.US;
        C14360o3.A08(locale);
        return AbstractC001900j.A0a(AbstractC31172DnG.A16(locale, str), ".mtk.", false);
    }
}
