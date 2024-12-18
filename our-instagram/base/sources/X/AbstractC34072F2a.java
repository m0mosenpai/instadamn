package X;

import android.view.View;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.F2a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34072F2a {
    public static final void A00(View view, C7AL c7al, C7J6 c7j6) {
        C14360o3.A0B(view, 0);
        switch (c7al.A02.ordinal()) {
            case 0:
                c7j6.Dso("info_button");
                return;
            case 1:
            case 3:
                c7j6.DoE(false);
                return;
            case 2:
            case 4:
                c7j6.Dnw(false);
                return;
            case 5:
                c7j6.D5n(view);
                return;
            case 6:
                c7j6.DoE(true);
                return;
            case 7:
                c7j6.Dnw(true);
                return;
            case 8:
                c7j6.DYI();
                return;
            case 9:
                c7j6.DsS();
                return;
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                c7j6.Dnq();
                return;
            case 14:
                c7j6.Cw9();
                return;
            case Process.SIGTERM /* 15 */:
                c7j6.CwF();
                return;
            case 16:
                c7j6.CwA();
                return;
            case 17:
                c7j6.DUu(true);
                return;
            case 18:
                c7j6.DUu(false);
                return;
            case Process.SIGSTOP /* 19 */:
                c7j6.DlQ();
                return;
            case 20:
                c7j6.DlR();
                return;
            case 21:
                c7j6.CvX();
                return;
            case 22:
            case 23:
                c7j6.Czg();
                return;
            case 24:
                throw AbstractC166987dD.A14("Does not use this click handler");
            case 25:
                throw AbstractC166987dD.A14("Does not use this click handler");
            default:
                throw B4Z.A00();
        }
    }
}
