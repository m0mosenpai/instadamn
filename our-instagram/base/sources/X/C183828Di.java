package X;

import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel.StoriesTemplateViewModel$special$$inlined$map$1$2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.8Di, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183828Di extends AbstractC52922bZ {
    public java.util.Set A00;
    public final C2GT A01;
    public final UserSession A02;
    public final C183838Dj A03;
    public final InterfaceC06180Ui A04;
    public final C05A A05;
    public final C05A A06;
    public final InterfaceC15070pN A07;
    public final C0UO A08;
    public final C0UO A09;

    public final void A06(java.util.Set set) {
        C14360o3.A0B(set, 0);
        java.util.Set A0k = AbstractC001800i.A0k(this.A00);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.util.Set A02 = AnonymousClass090.A02(A0k, set);
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A02, 10));
        Iterator it = A02.iterator();
        while (it.hasNext()) {
            arrayList.add(new C09530e4(Integer.valueOf(((Number) it.next()).intValue()), true));
        }
        AbstractC06930Yk.A0F(arrayList, linkedHashMap);
        java.util.Set A022 = AnonymousClass090.A02(set, A0k);
        ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(A022, 10));
        Iterator it2 = A022.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new C09530e4(Integer.valueOf(((Number) it2.next()).intValue()), false));
        }
        AbstractC06930Yk.A0F(arrayList2, linkedHashMap);
        this.A00 = AbstractC001800i.A0k(set);
        this.A06.Egh(AbstractC06930Yk.A0B(linkedHashMap));
    }

    public /* synthetic */ C183828Di(UserSession userSession) {
        C183838Dj c183838Dj = new C183838Dj();
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A03 = c183838Dj;
        C008002u A00 = C10E.A00(AbstractC06930Yk.A0E());
        this.A06 = A00;
        this.A09 = AbstractC208910l.A02(A00);
        C008002u c008002u = new C008002u(false);
        this.A05 = c008002u;
        this.A08 = AbstractC208910l.A02(c008002u);
        this.A00 = C16910sj.A00;
        final AnonymousClass057 A002 = C10M.A00(C05F.A00, 0, 0);
        this.A04 = A002;
        this.A07 = new C06160Ug(null, A002);
        this.A01 = AbstractC58232lf.A00(AnonymousClass191.A00, new InterfaceC19390xP() { // from class: X.8Dk
            @Override // X.InterfaceC19390xP
            public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
                Object collect = InterfaceC19390xP.this.collect(new StoriesTemplateViewModel$special$$inlined$map$1$2(interfaceC19960yQ), interfaceC23621Ds);
                if (collect != C1JX.A02) {
                    return C0eB.A00;
                }
                return collect;
            }
        });
    }

    public static final void A00(Drawable drawable, C183828Di c183828Di, int i) {
        Drawable drawable2;
        C194808jg c194808jg;
        C194808jg c194808jg2;
        java.util.Set A0j = AbstractC001800i.A0j(AbstractC001800i.A0k(c183828Di.A00));
        Integer valueOf = Integer.valueOf(i);
        A0j.add(valueOf);
        c183828Di.A00 = A0j;
        c183828Di.A06.Egh(AbstractC16850sd.A0M(new C09530e4(valueOf, true)));
        boolean z = drawable instanceof C194808jg;
        Drawable drawable3 = null;
        if (z && (c194808jg2 = (C194808jg) drawable) != null) {
            drawable2 = c194808jg2.A04();
        } else {
            drawable2 = null;
        }
        if (!(drawable2 instanceof C202728xq)) {
            if (z && (c194808jg = (C194808jg) drawable) != null) {
                drawable3 = c194808jg.A04();
            }
            if (!(drawable3 instanceof C202588xc)) {
                return;
            }
        }
        A02(new C219059mF(i), c183828Di);
    }

    public static final void A01(Drawable drawable, C183828Di c183828Di, int i, boolean z) {
        C194808jg c194808jg;
        java.util.Set A0j = AbstractC001800i.A0j(AbstractC001800i.A0k(c183828Di.A00));
        Integer valueOf = Integer.valueOf(i);
        A0j.remove(valueOf);
        c183828Di.A00 = A0j;
        c183828Di.A06.Egh(AbstractC16850sd.A0M(new C09530e4(valueOf, false)));
        Drawable drawable2 = null;
        if ((drawable instanceof C194808jg) && (c194808jg = (C194808jg) drawable) != null) {
            drawable2 = c194808jg.A04();
        }
        if (drawable2 instanceof C202728xq) {
            A02(new C219069mG(i), c183828Di);
        }
        if (drawable instanceof InterfaceC191058d1) {
            C183838Dj c183838Dj = c183828Di.A03;
            C14360o3.A0B(drawable, 0);
            c183838Dj.A00.remove(drawable);
        }
        if (z) {
            A02(new C219079mH(AbstractC001800i.A0k(AbstractC001800i.A0k(c183828Di.A00)), c183828Di.A07()), c183828Di);
        }
    }

    public final void A03() {
        AbstractC223849uT abstractC223849uT;
        C05A c05a = this.A05;
        c05a.Egh(Boolean.valueOf(!((Boolean) c05a.getValue()).booleanValue()));
        if (((Boolean) c05a.getValue()).booleanValue()) {
            abstractC223849uT = C219109mK.A00;
        } else {
            abstractC223849uT = C219119mL.A00;
        }
        A02(abstractC223849uT, this);
    }

    public final void A04() {
        C05A c05a = this.A05;
        boolean z = true;
        if (!((Boolean) c05a.getValue()).booleanValue() && !(!AbstractC001800i.A0k(this.A00).isEmpty())) {
            z = false;
        }
        c05a.Egh(false);
        this.A00 = C16910sj.A00;
        A02(C9M7.A00, this);
        if (z) {
            A02(new C219079mH(AbstractC001800i.A0k(AbstractC001800i.A0k(this.A00)), A07()), this);
        }
    }

    public final void A05(Integer num, Integer num2) {
        if (num != null && AbstractC001800i.A0k(this.A00).contains(num)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(num, false);
            java.util.Set A0j = AbstractC001800i.A0j(AbstractC001800i.A0k(this.A00));
            A0j.remove(num);
            if (num2 != null) {
                Integer valueOf = Integer.valueOf(num2.intValue());
                A0j.add(valueOf);
                linkedHashMap.put(valueOf, true);
            }
            this.A00 = A0j;
            this.A06.Egh(AbstractC06930Yk.A0B(linkedHashMap));
        }
    }

    public final boolean A07() {
        return ((Boolean) this.A05.getValue()).booleanValue();
    }

    public final boolean A08() {
        if (!AbstractC001800i.A0k(this.A00).isEmpty()) {
            java.util.Set set = this.A03.A00;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    C191048d0 c191048d0 = (C191048d0) ((InterfaceC191058d1) it.next());
                    if (c191048d0.A0I == C05F.A00 && c191048d0.A02 != null) {
                    }
                }
            }
            return true;
        }
        if (A07()) {
            return true;
        }
        return false;
    }

    public static final void A02(AbstractC223849uT abstractC223849uT, C183828Di c183828Di) {
        C141796aw A00 = AbstractC141776au.A00(c183828Di);
        C9D3 c9d3 = new C9D3(c183828Di, abstractC223849uT, (InterfaceC23621Ds) null, 36);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d3, A00);
    }
}
