package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: X.FaX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34947FaX {
    public C34483FHv A00;
    public final Deque A01 = new LinkedList();
    public final Map A02 = AbstractC166987dD.A1G();

    public static final void A00(C34947FaX c34947FaX) {
        C34483FHv c34483FHv = c34947FaX.A00;
        if (c34483FHv != null) {
            ImmutableList A0L = AbstractC31173DnH.A0L(c34947FaX.A01);
            C35155Fex c35155Fex = c34483FHv.A00;
            if (c35155Fex.A04) {
                UserSession userSession = c35155Fex.A07;
                InterfaceC11380iw interfaceC11380iw = c35155Fex.A06;
                C34947FaX c34947FaX2 = c35155Fex.A09;
                Map map = c34947FaX2.A02;
                ImmutableList A0L2 = AbstractC31173DnH.A0L(map.keySet());
                Deque deque = c34947FaX2.A01;
                HashMap A01 = C35155Fex.A01(AbstractC31173DnH.A0L(deque));
                String str = c35155Fex.A01;
                EnumC33492ErR enumC33492ErR = EnumC33492ErR.BLOCKED_ACCOUNTS;
                EnumC33486ErL enumC33486ErL = EnumC33486ErL.SUGGESTED_BLOCKS;
                boolean A1a = AbstractC167017dG.A1a(userSession, interfaceC11380iw);
                C14360o3.A0B(str, 4);
                FVC.A01(enumC33492ErR, enumC33486ErL, interfaceC11380iw, userSession, str, A0L2, A01, A1a ? 1 : 0);
                if (C18U.A06(C06090Tz.A06, userSession, 36314605617941227L) && !AbstractC31173DnH.A0L(deque).isEmpty()) {
                    FVC.A01(enumC33492ErR, enumC33486ErL, interfaceC11380iw, userSession, str, AbstractC31173DnH.A0L(map.keySet()), C35155Fex.A01(AbstractC31173DnH.A0L(deque)), 9);
                }
            }
            c35155Fex.A04 = false;
            c35155Fex.A0A.A01(C35155Fex.A00(c35155Fex, A0L));
        }
    }
}
