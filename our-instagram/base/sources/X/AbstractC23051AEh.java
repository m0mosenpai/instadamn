package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AEh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23051AEh {
    public static final C194808jg A00(Context context, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, C1816383s c1816383s, List list) {
        InterfaceC202578xb c9ss;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            if (C14360o3.A0K(obj, "standalone_fundraiser_sticker_id")) {
                if (!TextUtils.isEmpty(c1816383s.A04)) {
                    c9ss = new C9SS(context, userSession, targetViewSizeProvider, c1816383s);
                    A1E.add(c9ss);
                }
            } else if (C14360o3.A0K(obj, "multiple_avatar_standalone_sticker_id")) {
                c9ss = new C9SW(context, userSession, c1816383s);
                A1E.add(c9ss);
            }
        }
        C194808jg c194808jg = new C194808jg(context, userSession, null, A1E);
        c194808jg.A03 = c1816383s;
        return c194808jg;
    }

    public static final boolean A01(InteractiveDrawableContainer interactiveDrawableContainer) {
        Iterator it = interactiveDrawableContainer.A0T(Drawable.class).iterator();
        while (it.hasNext()) {
            Drawable A0Z = AbstractC166987dD.A0Z(it);
            if (A0Z instanceof C194808jg) {
                Iterator it2 = ((C194808jg) A0Z).A05().iterator();
                while (it2.hasNext()) {
                    Drawable A0Z2 = AbstractC166987dD.A0Z(it2);
                    C14360o3.A0A(A0Z2);
                    if (!(A0Z2 instanceof InterfaceC202578xb) && (!(A0Z2 instanceof C202598xd) || !((C202598xd) A0Z2).A07())) {
                        if ((A0Z2 instanceof C202638xh) && ((C202638xh) A0Z2).A00()) {
                            return true;
                        }
                    }
                    return true;
                }
            }
            if (A0Z instanceof InterfaceC202578xb) {
                return true;
            }
            if ((A0Z instanceof C202598xd) && ((C202598xd) A0Z).A07()) {
                return true;
            }
            if ((A0Z instanceof C202638xh) && ((C202638xh) A0Z).A00()) {
                return true;
            }
        }
        return false;
    }
}
