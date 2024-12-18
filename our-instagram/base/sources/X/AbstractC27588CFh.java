package X;

/* renamed from: X.CFh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27588CFh {
    public static final void A00(String str, C5Tl c5Tl, int i) {
        int i2;
        C14360o3.A0B(str, 0);
        c5Tl.Enr(212626117);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1481622023, "com.instagram.comments.mvvm.view.compose.CommentLoadText (CommentLoadText.kt:10)");
            }
            C5WR.A0l(c5Tl, AbstractC25226BEj.A0f(c5Tl), str, 1, 1, i2 & 14, 390, 11258, AbstractC25226BEj.A0M(c5Tl));
            if (C0fH.A02()) {
                C0fH.A00(1161033119);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30500Dbj.A01(ASZ, str, i, 1);
        }
    }
}
