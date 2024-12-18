package X;

import com.instagram.api.schemas.MediaTrialGraduationStrategy;
import java.io.IOException;

/* loaded from: classes9.dex */
public abstract class OOx {
    public static C51756Mtf parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C51756Mtf c51756Mtf = new C51756Mtf();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("graduation_strategy".equals(AbstractC166997dE.A0s(c16l))) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    MediaTrialGraduationStrategy mediaTrialGraduationStrategy = (MediaTrialGraduationStrategy) MediaTrialGraduationStrategy.A01.get(A1P);
                    if (mediaTrialGraduationStrategy == null) {
                        mediaTrialGraduationStrategy = MediaTrialGraduationStrategy.A06;
                    }
                    c51756Mtf.A00 = mediaTrialGraduationStrategy;
                }
                c16l.A0z();
            }
            return c51756Mtf;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(C51756Mtf c51756Mtf, AnonymousClass182 anonymousClass182) {
        anonymousClass182.A0d();
        MediaTrialGraduationStrategy mediaTrialGraduationStrategy = (MediaTrialGraduationStrategy) c51756Mtf.A00;
        if (mediaTrialGraduationStrategy != null) {
            anonymousClass182.A0S("graduation_strategy", mediaTrialGraduationStrategy.A00);
        }
        anonymousClass182.A0a();
    }
}
