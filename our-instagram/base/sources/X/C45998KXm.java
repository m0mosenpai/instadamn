package X;

import android.location.Location;
import com.instagram.common.session.UserSession;
import com.instagram.friendmap.data.FriendMapRepository;
import com.instagram.friendmap.data.MapText;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.KXm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45998KXm extends JQC {
    public String A00;
    public final UserSession A01;
    public final LLR A02;
    public final FriendMapRepository A03;
    public final List A04;
    public final List A05;
    public final TFA A06;
    public final Comparator A07;
    public final boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45998KXm(UserSession userSession, TFA tfa, LLR llr, FriendMapRepository friendMapRepository, boolean z) {
        super(new C45289K2r(C16930sl.A00, false, false));
        AbstractC167027dH.A0a(1, userSession, tfa, friendMapRepository, llr);
        this.A01 = userSession;
        this.A06 = tfa;
        this.A03 = friendMapRepository;
        this.A02 = llr;
        this.A08 = z;
        this.A05 = AbstractC166987dD.A1E();
        this.A04 = AbstractC166987dD.A1E();
        this.A00 = "";
        this.A07 = new C50040M7d(this, 5);
        MBp.A01(this, AbstractC141776au.A00(this), 45);
    }

    public final void A0P(String str) {
        C14360o3.A0B(str, 0);
        this.A00 = str;
        List list = this.A05;
        if (!list.isEmpty()) {
            if (AbstractC167007dF.A1N(str.length())) {
                List list2 = this.A04;
                list2.clear();
                list2.addAll(list);
            } else {
                List list3 = this.A04;
                list3.clear();
                C50361MLn c50361MLn = new C50361MLn(str, 37);
                ArrayList A1E = AbstractC166987dD.A1E();
                for (Object obj : list) {
                    if (AbstractC166987dD.A1a(c50361MLn.invoke(obj))) {
                        A1E.add(obj);
                    }
                }
                list3.addAll(A1E);
            }
            A01(null, this);
        }
    }

    private final C49463Ltb A00(C45128JyU c45128JyU, int i) {
        C09530e4 c09530e4;
        float f;
        float f2;
        String str;
        String str2;
        Location A00 = this.A06.A00("FriendMapUpdatesViewModel");
        String str3 = null;
        if (A00 != null) {
            c09530e4 = AbstractC166987dD.A1L(Float.valueOf(A00.distanceTo(c45128JyU.A03)), Float.valueOf((float) (A00.bearingTo(r1) - ((45.0d * 3.141592653589793d) / 180.0d))));
        } else {
            c09530e4 = new C09530e4(null, null);
        }
        Float f3 = (Float) c09530e4.A00;
        Float f4 = (Float) c09530e4.A01;
        if (f3 != null) {
            float floatValue = f3.floatValue();
            if (this.A08) {
                f = 1609.34f;
                f2 = 10.0f;
                str = "mi";
            } else {
                f = 1000.0f;
                f2 = 20.0f;
                str = "km";
            }
            float f5 = floatValue / f;
            Object[] objArr = new Object[1];
            if (f5 > f2) {
                AbstractC25235BEs.A1R(objArr, (int) f5, 0);
                str2 = "%d ";
            } else {
                objArr[0] = Float.valueOf(f5);
                str2 = "%.1f ";
            }
            str3 = AnonymousClass001.A0R(AbstractC13670mt.A06(str2, objArr), str);
        }
        return new C49463Ltb(c45128JyU, f3, f4, str3, i);
    }

    public static final void A01(C45128JyU c45128JyU, C45998KXm c45998KXm) {
        ArrayList A1E;
        Comparator jud;
        int i;
        List list;
        if (C18U.A06(C06090Tz.A05, c45998KXm.A01, 36321722379609845L)) {
            List list2 = c45998KXm.A04;
            HashSet A1H = AbstractC166987dD.A1H();
            ArrayList A1E2 = AbstractC166987dD.A1E();
            for (Object obj : list2) {
                AbstractC25231BEo.A1F(C45128JyU.A01(obj), obj, A1H, A1E2);
            }
            ArrayList A1E3 = AbstractC166987dD.A1E();
            ArrayList A1E4 = AbstractC166987dD.A1E();
            Iterator it = A1E2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C45128JyU c45128JyU2 = (C45128JyU) next;
                if (c45128JyU2.A0G && (c45128JyU == null || !C14360o3.A0K(c45128JyU.A0B, c45128JyU2.A0B))) {
                    A1E3.add(next);
                } else {
                    A1E4.add(next);
                }
            }
            A1E = AbstractC166987dD.A1E();
            if (AbstractC166987dD.A1b(A1E3)) {
                A1E.add(new C49462Lta(new MapText.Res(2131962880, new String[0])));
                ArrayList A0i = AbstractC167007dF.A0i(A1E3);
                Iterator it2 = A1E3.iterator();
                while (it2.hasNext()) {
                    A0i.add(c45998KXm.A00(AbstractC43592JPx.A0j(it2), 0));
                }
                A1E.addAll(AbstractC001800i.A0g(A0i, c45998KXm.A07));
            }
            if (AbstractC166987dD.A1b(A1E4)) {
                A1E.add(new C49462Lta(new MapText.Res(2131962903, new String[0])));
                ArrayList A0i2 = AbstractC167007dF.A0i(A1E4);
                Iterator it3 = A1E4.iterator();
                while (it3.hasNext()) {
                    A0i2.add(c45998KXm.A00(AbstractC43592JPx.A0j(it3), 0));
                }
                jud = c45998KXm.A07;
                list = A0i2;
            }
            c45998KXm.A0O(new C50355MLh(A1E, 45));
        }
        A1E = AbstractC166987dD.A1E();
        List list3 = c45998KXm.A04;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        for (Object obj2 : list3) {
            ((List) JQ0.A0h(C45128JyU.A01(obj2), A1I)).add(obj2);
        }
        Collection<List> values = A1I.values();
        ArrayList A1E5 = AbstractC166987dD.A1E();
        for (List list4 : values) {
            C45128JyU c45128JyU3 = (C45128JyU) AbstractC001800i.A0J(list4);
            if (c45128JyU3 != null) {
                if ((list4 instanceof Collection) && list4.isEmpty()) {
                    i = 0;
                } else {
                    Iterator it4 = list4.iterator();
                    i = 0;
                    while (it4.hasNext()) {
                        C45128JyU A0j = AbstractC43592JPx.A0j(it4);
                        if (A0j.A0G && A0j.A05 != null && (i = i + 1) < 0) {
                            AbstractC16960so.A1T();
                            throw C00O.createAndThrow();
                        }
                    }
                }
                A1E5.add(c45998KXm.A00(c45128JyU3, i));
            }
        }
        List A0g = AbstractC001800i.A0g(A1E5, c45998KXm.A07);
        jud = new JUD(46);
        list = A0g;
        A1E.addAll(AbstractC001800i.A0g(list, jud));
        c45998KXm.A0O(new C50355MLh(A1E, 45));
    }
}
