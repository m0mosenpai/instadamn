package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2f0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C54462f0 {
    public final Context A00;
    public final UserSession A01;
    public final C54452ez A02;
    public final HashMap A03;

    public C54462f0(Context context, UserSession userSession, C54452ez c54452ez) {
        List A0S;
        List A01;
        EnumC54222eY enumC54222eY;
        C14360o3.A0B(c54452ez, 1);
        this.A02 = c54452ez;
        this.A01 = userSession;
        this.A00 = context;
        this.A03 = new HashMap();
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36321438911571395L) && !C18U.A06(C06090Tz.A06, userSession, 36322628616661367L)) {
            A0S = AbstractC54422ew.A00;
        } else {
            List list = AbstractC54422ew.A00;
            List singletonList = Collections.singletonList(EnumC54222eY.A0U);
            C14360o3.A07(singletonList);
            A0S = AbstractC001800i.A0S(singletonList, list);
        }
        if (!AbstractC54472f1.A04(18316910236091634L, true) && !AbstractC54472f1.A04(18316910236026097L, true) && !AbstractC54472f1.A06(userSession, 36331248615965919L)) {
            A01 = C16930sl.A00;
        } else {
            A01 = A01(this.A00);
        }
        this.A03.clear();
        if (C18U.A06(c06090Tz, this.A02.A00, 36310662837698780L)) {
            enumC54222eY = EnumC54222eY.A0o;
        } else {
            enumC54222eY = EnumC54222eY.A0a;
        }
        EnumC54222eY enumC54222eY2 = EnumC54222eY.A0V;
        C54492f3 A00 = A00(EnumC54222eY.A0b, new C54492f3[]{A00(enumC54222eY, new C54492f3[0]), A00(EnumC54222eY.A0Z, (C54492f3[]) A01.toArray(new C54492f3[0]))});
        EnumC54222eY enumC54222eY3 = EnumC54222eY.A09;
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A0S, 10));
        Iterator it = A0S.iterator();
        while (it.hasNext()) {
            arrayList.add(A00((EnumC54222eY) it.next(), new C54492f3[0]));
        }
        A00(enumC54222eY2, new C54492f3[]{A00, A00(enumC54222eY3, (C54492f3[]) arrayList.toArray(new C54492f3[0]))});
        A00(EnumC54222eY.A0Q, new C54492f3[]{A00(enumC54222eY3, new C54492f3[0])});
        A00(EnumC54222eY.A08, new C54492f3[0]);
        A00(EnumC54222eY.A0e, new C54492f3[0]);
        A00(EnumC54222eY.A0j, new C54492f3[0]);
        A00(EnumC54222eY.A0l, (C54492f3[]) A01(this.A00).toArray(new C54492f3[0]));
    }

    private final C54492f3 A00(InterfaceC54232eZ interfaceC54232eZ, C54492f3[] c54492f3Arr) {
        HashMap hashMap = this.A03;
        C54492f3 c54492f3 = (C54492f3) hashMap.get(interfaceC54232eZ);
        if (c54492f3 == null) {
            C54492f3 c54492f32 = new C54492f3(interfaceC54232eZ, this, AbstractC009903n.A0I(c54492f3Arr));
            hashMap.put(interfaceC54232eZ, c54492f32);
            return c54492f32;
        }
        return c54492f3;
    }

    private final List A01(Context context) {
        UserSession userSession = this.A01;
        List<String> BOc = C0BQ.A00(userSession).BOc(userSession.userId);
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(BOc, 10));
        for (String str : BOc) {
            C54552fC c54552fC = new C54552fC(null, str);
            List A00 = new C54562fD().A00(context, userSession);
            ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(A00, 10));
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                arrayList2.add(new C54552fC((EnumC54222eY) it.next(), str));
            }
            ArrayList arrayList3 = new ArrayList(AbstractC06950Ym.A1E(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(A00((C54552fC) it2.next(), new C54492f3[0]));
            }
            arrayList.add(A00(c54552fC, (C54492f3[]) arrayList3.toArray(new C54492f3[0])));
        }
        return arrayList;
    }

    public final void A02(C54432ex c54432ex) {
        HashMap hashMap = this.A03;
        InterfaceC54232eZ interfaceC54232eZ = c54432ex.A03;
        C54492f3 c54492f3 = (C54492f3) hashMap.get(interfaceC54232eZ);
        if (c54492f3 != null && C14360o3.A0K(c54492f3.A00, interfaceC54232eZ)) {
            c54492f3.A02.Egh(c54432ex);
        }
    }
}
