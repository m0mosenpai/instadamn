package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.settings.privacy.messages.DirectMessagesOptionsFragment;

/* renamed from: X.Ewu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33830Ewu {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0021. Please report as an issue. */
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        C66277U6x A01;
        C34397FEn c34397FEn;
        int i;
        C140966Yy A0r;
        String str2;
        Object A03 = c6fw.A03(0);
        if (A03 instanceof String) {
            str = (String) A03;
        } else {
            str = null;
        }
        UserSession A0W = AbstractC31172DnG.A0W(c6fq);
        if (str != null) {
            FragmentActivity A04 = C6BQ.A04(c6fq);
            C14360o3.A0B(A0W, 0);
            C14360o3.A0B(A04, 1);
            switch (str.hashCode()) {
                case -1102697448:
                    if (str.equals("limits")) {
                        C09530e4 A1L = AbstractC166987dD.A1L(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "0");
                        C23031Ai A00 = AbstractC23021Ah.A00(A0W);
                        if (AbstractC167017dG.A1b(A00, A00.A6J, C23031Ai.A8c, 260)) {
                            str2 = "False";
                        } else {
                            str2 = "True";
                        }
                        A01 = C66277U6x.A01(MSV.A00(191), AbstractC06930Yk.A02(AbstractC25229BEm.A1b(MSV.A00(1223), str2, A1L)));
                        c34397FEn = new C34397FEn(A0W);
                        i = 2131965223;
                        String string = A04.getString(i);
                        IgBloksScreenConfig igBloksScreenConfig = c34397FEn.A00;
                        igBloksScreenConfig.A0U = string;
                        AbstractC31173DnH.A14(A04, igBloksScreenConfig, A01);
                        return null;
                    }
                    C0w9.A03("SafetyCheckUtil", "Invalid Safety Option Selected.");
                    break;
                case -385502252:
                    if (str.equals("hidden_words")) {
                        A0r = AbstractC31173DnH.A0P(A04, A0W);
                        A0r.A0B(null, F78.A00().A00.A00(A04, A0W, C05F.A0N));
                        A0r.A04();
                        return null;
                    }
                    C0w9.A03("SafetyCheckUtil", "Invalid Safety Option Selected.");
                    break;
                case -250538715:
                    if (str.equals("message_control")) {
                        DirectMessagesOptionsFragment directMessagesOptionsFragment = new DirectMessagesOptionsFragment();
                        A0r = AbstractC31173DnH.A0P(A04, A0W);
                        A0r.A0B(null, directMessagesOptionsFragment);
                        A0r.A04();
                        return null;
                    }
                    C0w9.A03("SafetyCheckUtil", "Invalid Safety Option Selected.");
                    break;
                case -54704478:
                    if (str.equals("two_factor")) {
                        EJU A02 = AbstractC35179FfW.A00().A02(C05F.A0C, false, false);
                        A0r = AbstractC25225BEi.A0r(A04, A0W);
                        A0r.A0A = AbstractC31581Du9.A02(60, 24, 5);
                        A0r.A0B(null, A02);
                        A0r.A0F = true;
                        A0r.A04();
                        return null;
                    }
                    C0w9.A03("SafetyCheckUtil", "Invalid Safety Option Selected.");
                    break;
                case 763636605:
                    if (str.equals("comment_control")) {
                        A01 = C66277U6x.A01(AbstractC111324zv.A00(192), AbstractC166987dD.A1G());
                        c34397FEn = new C34397FEn(A0W);
                        i = 2131956465;
                        String string2 = A04.getString(i);
                        IgBloksScreenConfig igBloksScreenConfig2 = c34397FEn.A00;
                        igBloksScreenConfig2.A0U = string2;
                        AbstractC31173DnH.A14(A04, igBloksScreenConfig2, A01);
                        return null;
                    }
                    C0w9.A03("SafetyCheckUtil", "Invalid Safety Option Selected.");
                    break;
                case 1950650808:
                    if (str.equals("tag_control")) {
                        FDS.A00(A04, A0W);
                        return null;
                    }
                    C0w9.A03("SafetyCheckUtil", "Invalid Safety Option Selected.");
                    break;
                default:
                    C0w9.A03("SafetyCheckUtil", "Invalid Safety Option Selected.");
                    break;
            }
        }
        return null;
    }
}
