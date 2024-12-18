package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Vxy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69933Vxy {
    public static final C194808jg A00(Context context, UserSession userSession, List list, int i, boolean z, boolean z2) {
        boolean A1V = AbstractC167007dF.A1V(list);
        VES ves = VES.A07;
        int i2 = VZJ.A00;
        C6S5 c6s5 = C6S5.A05;
        ArrayList A1M = AbstractC16960so.A1M(new V74(context, new C66646URk(ves, c6s5, null, null, null, "karaoke_caption_sticker_id", list, i, i2, z), null), new V73(context, new C66646URk(VES.A0B, c6s5, null, null, null, "karaoke_caption_sticker_id", list, i, i2, z)), new V77(context, new C66646URk(VES.A06, c6s5, null, null, null, "karaoke_caption_sticker_id", list, i, i2, z), null));
        if (z2) {
            A1M.add(new V72(context, new C66646URk(VES.A09, c6s5, null, null, null, "karaoke_caption_sticker_id", list, i, i2, z), null));
        }
        A1M.add(0, new V75(context, new C66646URk(VES.A0A, c6s5, null, null, null, "karaoke_caption_sticker_id", list, i, i2, z), null));
        A1M.add(A1V ? 1 : 0, new V76(context, new C66646URk(VES.A08, c6s5, null, null, null, "karaoke_caption_sticker_id", list, i, i2, z), null));
        return new C194808jg(context, userSession, AbstractC001800i.A0a(A1M));
    }

    public static final C5RU A01(Context context, C66646URk c66646URk, C70076W1t c70076W1t) {
        C14360o3.A0B(c66646URk, 1);
        VES ves = c66646URk.A02;
        switch (ves.ordinal()) {
            case 0:
                return new V75(context, c66646URk, c70076W1t);
            case 1:
                return new V76(context, c66646URk, c70076W1t);
            case 2:
                return new V74(context, c66646URk, c70076W1t);
            case 3:
                return new V73(context, c66646URk);
            case 4:
                return new V77(context, c66646URk, c70076W1t);
            case 5:
                return new V72(context, c66646URk, c70076W1t);
            default:
                throw AbstractC37303Gc4.A0M(ves, "Unhandled karaoke sticker style: ", new StringBuilder());
        }
    }
}
