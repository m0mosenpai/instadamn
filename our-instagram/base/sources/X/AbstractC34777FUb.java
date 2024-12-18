package X;

import android.content.res.Resources;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.FUb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34777FUb {
    public static final ImmutableList A00(C32050E6c c32050E6c) {
        C14360o3.A0B(c32050E6c, 0);
        Map map = c32050E6c.A08;
        if (map == null) {
            map = C16920sk.A00;
            C14360o3.A0C(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        }
        ArrayList A17 = AbstractC25225BEi.A17(map.size());
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            String A172 = AbstractC31172DnG.A17(A1K);
            A17.add(new DirectCountBasedReaction(A172, AbstractC166987dD.A0H(A1K.getValue()), C14360o3.A0K(A172, c32050E6c.A07)));
        }
        return AbstractC31173DnH.A0L(A17);
    }

    public static final C32869EdB A01(Resources resources, ImmutableList immutableList, UserSession userSession, AnonymousClass988 anonymousClass988, C7IH c7ih, C2EY c2ey, Long l, String str, String str2, String str3, String str4, String str5, boolean z) {
        Object obj;
        String str6;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str4, 6);
        MessageIdentifier messageIdentifier = null;
        if (AbstractC167007dF.A1M(immutableList.isEmpty() ? 1 : 0)) {
            C16930sl c16930sl = C16930sl.A00;
            C16920sk c16920sk = C16920sk.A00;
            C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
            if (str5 != null) {
                messageIdentifier = new MessageIdentifier(str5, null);
            }
            return new C32869EdB(userSession, anonymousClass988, c7ih, c2ey, messageIdentifier, l, "", str, str2, str3, str4, null, c16930sl, c16930sl, c16920sk, 0, z);
        }
        int size = immutableList.size();
        if (size > 3) {
            size = 3;
        }
        Iterator<E> it = immutableList.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((DirectCountBasedReaction) it.next()).A00;
        }
        ImmutableList A01 = AbstractC31325Dpn.A01(immutableList, size);
        ArrayList A0q = AbstractC167017dG.A0q(A01);
        Iterator<E> it2 = A01.iterator();
        while (it2.hasNext()) {
            A0q.add(((DirectCountBasedReaction) it2.next()).A01);
        }
        ImmutableList A0L = AbstractC31173DnH.A0L(A0q);
        String A04 = C84963qk.A04(resources, Integer.valueOf(i), 1000, true, false);
        C16930sl c16930sl2 = C16930sl.A00;
        String str7 = userSession.userId;
        C16920sk c16920sk2 = C16920sk.A00;
        C14360o3.A0C(c16920sk2, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        Iterator<E> it3 = immutableList.iterator();
        while (true) {
            if (it3.hasNext()) {
                obj = it3.next();
                if (((DirectCountBasedReaction) obj).A02) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        DirectCountBasedReaction directCountBasedReaction = (DirectCountBasedReaction) obj;
        if (directCountBasedReaction != null) {
            str6 = directCountBasedReaction.A01;
        } else {
            str6 = null;
        }
        if (str5 != null) {
            messageIdentifier = new MessageIdentifier(str5, null);
        }
        return new C32869EdB(userSession, anonymousClass988, c7ih, c2ey, messageIdentifier, l, A04, str, str2, str3, str7, str6, A0L, c16930sl2, c16920sk2, i, z);
    }
}
