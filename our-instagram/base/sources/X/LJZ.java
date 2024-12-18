package X;

import android.content.Context;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class LJZ {
    public final Context A00;
    public final C66362zD A01;
    public final UserSession A02;
    public final C47974LIk A03;
    public final Map A04;
    public final boolean A05;
    public final boolean A06;

    public static final List A00(LJZ ljz, Collection collection) {
        String str;
        C148336m3[] A07 = C148336m3.A04.A07(ljz.A02);
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : collection) {
            C148336m3 c148336m3 = (C148336m3) obj;
            C148336m3 c148336m32 = (C148336m3) AbstractC009903n.A06(A07, c148336m3.A00);
            if (c148336m32 != null) {
                str = c148336m32.A02;
            } else {
                str = null;
            }
            AbstractC43593JPy.A1R(str, c148336m3.A02, obj, A1E);
        }
        return A1E;
    }

    public static final void A01(ViewModelListUpdate viewModelListUpdate, LJZ ljz, List list, boolean z) {
        Map map = ljz.A04;
        map.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            L0O l0o = (L0O) it.next();
            EnumC61184Rgk enumC61184Rgk = l0o.A00;
            if (enumC61184Rgk != EnumC61184Rgk.A05 || z) {
                AbstractC37301Gc2.A1T(enumC61184Rgk, map, viewModelListUpdate.A00.size());
                viewModelListUpdate.A00(new C48318LZr(AbstractC166997dE.A0p(ljz.A00, enumC61184Rgk.A00)));
            }
            A02(viewModelListUpdate, l0o.A01, 1.0f);
        }
    }

    public LJZ(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C47974LIk c47974LIk, int i, boolean z, boolean z2) {
        this.A00 = context;
        this.A02 = userSession;
        this.A03 = c47974LIk;
        this.A05 = z2;
        C66392zG A00 = C66362zD.A00(context);
        A00.A01(new KI7(context, new C47401Kwq(this), i));
        this.A01 = AbstractC31173DnH.A0R(A00, new KIH(context, interfaceC11380iw, this.A02, new C49648Lwf(this, 1), i, this.A05));
        this.A06 = !z;
        this.A04 = AbstractC166987dD.A1I();
    }

    public static final void A02(ViewModelListUpdate viewModelListUpdate, List list, float f) {
        int i = 0;
        int A00 = C17x.A00(0, AbstractC25226BEj.A05(list), 6);
        if (A00 < 0) {
            return;
        }
        while (true) {
            viewModelListUpdate.A00(new C48302LZb(new C153126ug(list, i, 6), f));
            if (i != A00) {
                i += 6;
            } else {
                return;
            }
        }
    }
}
