package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.widget.filmstrip.ClipsTrimFilmstrip;
import java.io.IOException;

/* renamed from: X.As1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24420As1 implements Runnable {
    public final /* synthetic */ C8RR A00;

    public RunnableC24420As1(C8RR c8rr) {
        this.A00 = c8rr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        String str;
        C49602Pt c49602Pt;
        C8RR c8rr = this.A00;
        C8R0 c8r0 = c8rr.A0D;
        C115475Kh CFQ = c8r0.CFQ();
        Context context = c8rr.A07.getContext();
        int A0C = AbstractC167017dG.A0C(context);
        try {
            int BmJ = c8r0.BmJ();
            if (CFQ != null) {
                i = CFQ.A08 - CFQ.A09;
            } else {
                i = 0;
            }
            int i3 = BmJ + i;
            if (CFQ == null) {
                i2 = 0;
            } else {
                i2 = CFQ.A0B();
            }
            Integer BQ9 = c8r0.BQ9();
            if (BQ9 != null) {
                i3 = BQ9.intValue();
            }
            if (i3 > i2) {
                i3 = i2;
            }
            if (CFQ != null) {
                c8rr.A0F.A0D(i2, i3, CFQ.A09, CFQ.A08);
            }
            ClipsTrimFilmstrip clipsTrimFilmstrip = c8rr.A0F;
            int i4 = (clipsTrimFilmstrip.A01 / A0C) + 1;
            UserSession userSession = c8rr.A09;
            Fragment fragment = c8rr.A08;
            String str2 = null;
            if (CFQ != null && (c49602Pt = c8rr.A0G) != null) {
                boolean z = false;
                if (c8rr.A02 != C05F.A00) {
                    z = true;
                }
                str = C80G.A02(CFQ, c49602Pt, z).getPath();
            } else {
                str = null;
            }
            int i5 = c8rr.A00;
            if (CFQ != null && AbstractC115515Kl.A05(CFQ)) {
                str2 = CFQ.A0G.A0I;
            }
            OYA.A00(context, fragment, userSession, clipsTrimFilmstrip.A07, AbstractC54906OQd.A01(str, str2, i5), "post_capture", i4, c8rr.A05, c8rr.A06);
        } catch (IOException unused) {
        }
    }
}
