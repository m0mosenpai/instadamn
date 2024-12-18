package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;

/* renamed from: X.EyM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33920EyM {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Context context;
        InterfaceC103384lE A0t = AbstractC25228BEl.A0t(c6fw.A00, 0);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            context = c6fg.A00;
        } else {
            context = null;
        }
        C25671My A00 = AbstractC25651Mw.A00(A0B);
        C36156FxV c36156FxV = new C36156FxV(c6fq, A0t, 1);
        AbstractC70197WGf.A07(A04, new G0J(0, A04, A00, context, A0B, c36156FxV), C50472Tr.A01(), new int[]{A04.getColor(R.color.fan_club_purple), A04.getColor(R.color.fan_club_pink)}, new int[]{0, 0, 0, 1}, 0.2f);
        return null;
    }
}
