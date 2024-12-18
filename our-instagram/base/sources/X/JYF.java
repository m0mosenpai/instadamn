package X;

import com.instagram.model.direct.DirectSearchResult;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class JYF implements YO2 {
    public final int A00;
    public final Object A01;

    public JYF(InterfaceC16620sF interfaceC16620sF, int i) {
        this.A00 = i;
        this.A01 = interfaceC16620sF;
    }

    @Override // X.YO2
    public final /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                LAI lai = (LAI) obj;
                C44464JlW c44464JlW = (C44464JlW) this.A01;
                KPI kpi = c44464JlW.A08;
                kpi.A05("CONFIRM_PIN_SETUP_ATTEMPT");
                kpi.A07("SETUP_TYPE", "PIN_CODE");
                C14360o3.A0A(lai);
                C14360o3.A0A(obj2);
                lai.A04(EnumC46206Kci.A09).A04(new LSI(7, c44464JlW, lai, obj2));
                if (c44464JlW.A0N) {
                    AbstractC43593JPy.A1S(c44464JlW, null, AbstractC141776au.A00(c44464JlW), 41);
                }
                return C0eB.A00;
            case 1:
            default:
                return ((InterfaceC16620sF) this.A01).invoke(obj, obj2);
            case 2:
                C65782Tu0 c65782Tu0 = (C65782Tu0) obj;
                C65782Tu0 c65782Tu02 = (C65782Tu0) obj2;
                int i = c65782Tu0.A01;
                if (i != c65782Tu02.A01 || c65782Tu0.A03 != c65782Tu02.A03) {
                    if (C18U.A06(C06090Tz.A05, ((JYZ) this.A01).A00, 36319171168181274L)) {
                        return C4JK.A00;
                    }
                }
                C4I3 c4i3 = (C4I3) c65782Tu0.A03;
                int i2 = c65782Tu02.A02 + c65782Tu0.A02;
                Long l = (Long) c65782Tu0.A04;
                Long l2 = (Long) c65782Tu02.A04;
                if (l != null) {
                    if (l2 != null) {
                        l = Long.valueOf(Math.min(l.longValue(), l2.longValue()));
                    }
                } else {
                    l = l2;
                    if (l2 == null) {
                        l = null;
                    }
                }
                return new C4JL(new C65782Tu0(c4i3, l, AnonymousClass090.A00((Iterable) c65782Tu02.A05, (java.util.Set) c65782Tu0.A05), i, i2));
            case 3:
                GFX gfx = (GFX) this.A01;
                C46h c46h = (C46h) obj;
                Map map = (Map) obj2;
                FQB fqb = gfx.A07;
                fqb.getClass();
                String str = gfx.A02;
                String str2 = (String) fqb.A01.A0W();
                if (str2 == null) {
                    str2 = "";
                }
                if (AbstractC13670mt.A0G(str, str2)) {
                    Map map2 = gfx.A0E;
                    map2.clear();
                    boolean z = gfx.A0H;
                    List A00 = GFX.A00(c46h, gfx);
                    if (z) {
                        ArrayList A12 = AbstractC166997dE.A12(A00, 0);
                        for (Object obj3 : A00) {
                            Boolean bool = ((DirectShareTarget) ((DirectSearchResult) obj3)).A0A;
                            if (bool != null && bool.booleanValue()) {
                                A12.add(obj3);
                            }
                        }
                        A00 = A12;
                    }
                    GFX.A03(map2, A00);
                }
                gfx.A0F.putAll(map);
                GFX.A02(gfx);
                return gfx.A0B;
            case 4:
                return GFX.A01((C46h) obj2, (GFX) this.A01, (List) obj, Collections.emptyMap());
        }
    }

    public JYF(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
