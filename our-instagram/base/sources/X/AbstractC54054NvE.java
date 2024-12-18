package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;

/* renamed from: X.NvE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54054NvE {
    public static C54994OUd parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C54994OUd c54994OUd = new C54994OUd(null);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37301Gc2.A1V(c16l, A0q)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c54994OUd.A07 = A0m;
                } else if ("eimu".equals(A0q)) {
                    c54994OUd.A01 = c16l.A0y();
                } else if (AbstractC111324zv.A00(2585).equals(A0q)) {
                    c54994OUd.A00 = c16l.A1D();
                } else if (AbstractC58357Ptx.A00().equals(A0q)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c54994OUd.A09 = A0m2;
                } else if ("full_name".equals(A0q)) {
                    String A0m3 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m3, 0);
                    c54994OUd.A05 = A0m3;
                } else if ("short_name".equals(A0q)) {
                    c54994OUd.A08 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(4487).equals(A0q)) {
                    String A0m4 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m4, 0);
                    c54994OUd.A06 = A0m4;
                } else if ("profile_pic_url".equals(A0q)) {
                    SimpleImageUrl A00 = AbstractC222616c.A00(c16l);
                    C14360o3.A0B(A00, 0);
                    c54994OUd.A02 = A00;
                } else if ("is_verified".equals(A0q)) {
                    c54994OUd.A0H = c16l.A0d();
                } else if (AbstractC111324zv.A00(453).equals(A0q)) {
                    c54994OUd.A0B = c16l.A0d();
                } else if (AbstractC111324zv.A00(4790).equals(A0q)) {
                    c54994OUd.A0G = c16l.A0d();
                } else if ("is_blocking".equals(A0q)) {
                    c54994OUd.A0A = c16l.A0d();
                } else if ("is_restricted".equals(A0q)) {
                    c54994OUd.A0F = c16l.A0d();
                } else if ("is_connected".equals(A0q)) {
                    c54994OUd.A0C = c16l.A0d();
                } else if (AbstractC111324zv.A00(1209).equals(A0q)) {
                    c54994OUd.A04 = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC111324zv.A00(4755).equals(A0q)) {
                    c54994OUd.A0D = c16l.A0d();
                } else if (AbstractC111324zv.A00(4757).equals(A0q)) {
                    c54994OUd.A0E = c16l.A0d();
                }
                c16l.A0z();
            }
            return c54994OUd;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
