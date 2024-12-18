package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public abstract class CE6 {
    public static final L3A A00(C5Tl c5Tl, C27958CUc c27958CUc) {
        C14360o3.A0B(c27958CUc, 0);
        if (AbstractC25227BEk.A1U(c5Tl, -2075738238)) {
            C0fH.A01(-271997941, "com.instagram.barcelona.feed.post.toast.rememberPostToastHelper (PostToastHelper.kt:23)");
        }
        Object EEc = c5Tl.EEc();
        Object obj = C5UI.A00;
        C19L c19l = ((C137536Kz) AbstractC25234BEr.A0b(c5Tl, EEc, obj)).A00;
        Context A0P = AbstractC25230BEn.A0P(c5Tl);
        UserSession A0e = AbstractC25229BEm.A0e(c5Tl);
        InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) c5Tl.AJX(C5VZ.A00);
        Object A0q = AbstractC25227BEk.A0q(c5Tl, -444053679);
        if (A0q == obj) {
            A0q = new L3A(A0P, c27958CUc, interfaceC11380iw, A0e, c19l);
            c5Tl.FBy(A0q);
        }
        L3A l3a = (L3A) A0q;
        C117505Tk c117505Tk = (C117505Tk) c5Tl;
        if (AbstractC25227BEk.A1b(c117505Tk, false)) {
            C0fH.A00(899504914);
        }
        C117505Tk.A0L(c117505Tk, false);
        return l3a;
    }
}
