package X;

import java.io.IOException;

/* renamed from: X.Nul, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54035Nul {
    public static NNM parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            NNM nnm = new NNM();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                OXx.A01(c16l, nnm, AbstractC166997dE.A0s(c16l));
                c16l.A0z();
            }
            return nnm;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
