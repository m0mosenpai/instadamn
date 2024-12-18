package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9x2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225399x2 {
    public static void A00(Context context, InterfaceC178817wt interfaceC178817wt, InterfaceC178407wE interfaceC178407wE, AZB azb, U7W u7w, List list, boolean z) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaEffect mediaEffect = ((C69688VtY) it.next()).A01;
            if (mediaEffect instanceof C23504AbK) {
                interfaceC178817wt.B9w().A03(((C23504AbK) mediaEffect).A01);
            } else if (z) {
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("unsupported media effect received by composite media graph wrapper: ");
                throw AbstractC166987dD.A18(AbstractC166997dE.A0v(mediaEffect.getClass(), A1C));
            }
        }
        if (!A1E.isEmpty()) {
            Handler handler = interfaceC178817wt.getHandler();
            boolean A1P = u7w.A1P();
            ArrayList A1E2 = AbstractC166987dD.A1E();
            Iterator it2 = A1E.iterator();
            if (it2.hasNext()) {
                it2.next();
                throw AbstractC166987dD.A15("getEffectRenderer");
            }
            C178267w0 c178267w0 = new C178267w0();
            AbstractC167007dF.A1E(context, 1, interfaceC178407wE);
            C179107xM A00 = AbstractC179127xO.A00(context, handler, new AWF(azb, A1E, A1P), null, interfaceC178407wE, c178267w0, false, true, false, false, false, false, false, false);
            A00.A00 = 1.0f;
            A00.A0M.A00 = 1.0f;
            A00.A07 = A1E2;
            azb.A01 = A00;
        }
    }
}
