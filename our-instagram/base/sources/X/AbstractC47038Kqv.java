package X;

/* renamed from: X.Kqv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47038Kqv {
    public static final C225117n A00(C43900JbA c43900JbA, C43898Jb8 c43898Jb8, InterfaceC224417g interfaceC224417g) {
        C14360o3.A0B(c43898Jb8, 1);
        C225117n A04 = AbstractC224517h.A04(new C57561PgZ(c43900JbA, 1), interfaceC224417g);
        java.util.Set stringSet = JQ0.A0Y(c43898Jb8).getStringSet("suggestions_media_hide_prefs_key", null);
        if (stringSet == null) {
            stringSet = C16910sj.A00;
        }
        C50362MLo c50362MLo = new C50362MLo(11, stringSet, AbstractC31171DnF.A0l());
        C14360o3.A0B(A04, 0);
        return new C225117n(c50362MLo, A04, false);
    }
}
