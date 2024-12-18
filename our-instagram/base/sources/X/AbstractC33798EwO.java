package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.EwO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33798EwO {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        EfU parseFromJson = C35072Fcj.parseFromJson(C16V.A00(AbstractC31177DnL.A0d(c6fw)));
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        C14360o3.A0C(A0B, AbstractC58317Pt9.A00(3));
        Fragment A01 = C6BQ.A01(c6fq);
        C14360o3.A0C(A01, "null cannot be cast to non-null type com.instagram.nux.fragment.LoginLandingFragment");
        new C32969Efa(c6fq, (C07270a1) A0B, (C32316ELf) A01).onFail(new C115115Ig(parseFromJson));
        return null;
    }
}
