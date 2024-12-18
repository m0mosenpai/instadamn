package X;

import com.instagram.api.schemas.TextAppTextFragmentType;
import java.io.IOException;

/* renamed from: X.Hvj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40396Hvj {
    public static C38791H6g parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C38787H6c c38787H6c = null;
            TextAppTextFragmentType textAppTextFragmentType = null;
            C38788H6d c38788H6d = null;
            C38789H6e c38789H6e = null;
            String str = null;
            C38790H6f c38790H6f = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(933).equals(A0s)) {
                    c38787H6c = AbstractC40389Hvc.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(947).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    textAppTextFragmentType = (TextAppTextFragmentType) TextAppTextFragmentType.A01.get(A1P);
                    if (textAppTextFragmentType == null) {
                        textAppTextFragmentType = TextAppTextFragmentType.A09;
                    }
                } else if (AbstractC111324zv.A00(1079).equals(A0s)) {
                    c38788H6d = AbstractC40391Hve.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(1107).equals(A0s)) {
                    c38789H6e = AbstractC40393Hvg.parseFromJson(c16l);
                } else if ("plaintext".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(1322).equals(A0s)) {
                    c38790H6f = AbstractC40394Hvh.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C38791H6g(c38787H6c, c38788H6d, c38789H6e, c38790H6f, textAppTextFragmentType, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
