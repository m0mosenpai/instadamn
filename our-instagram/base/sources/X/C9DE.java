package X;

import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9DE, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9DE extends AbstractC23611Dp implements InterfaceC16610sE {
    public Object A00;
    public Object A01;
    public final int A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DE(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(3, interfaceC23621Ds);
        this.A02 = i;
        this.A03 = obj;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        int i;
        InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) obj3;
        switch (this.A02) {
            case 0:
                obj4 = this.A03;
                i = 0;
                break;
            case 1:
                obj4 = this.A03;
                i = 1;
                break;
            case 2:
                obj4 = this.A03;
                i = 2;
                break;
            default:
                obj4 = this.A03;
                i = 3;
                break;
        }
        C9DE c9de = new C9DE(obj4, interfaceC23621Ds, i);
        c9de.A00 = obj;
        c9de.A01 = obj2;
        return c9de.invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C2GS c2gs;
        Object obj2;
        int i = this.A02;
        AbstractC09560e7.A00(obj);
        switch (i) {
            case 0:
                List list = (List) this.A00;
                C24239Ap6 c24239Ap6 = (C24239Ap6) this.A01;
                if (c24239Ap6 != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (C14360o3.A0K(((C24239Ap6) next).A06, c24239Ap6.A06)) {
                                if (next != null) {
                                    return list;
                                }
                            }
                        }
                    }
                    ArrayList arrayList = new ArrayList(list);
                    arrayList.add(0, c24239Ap6);
                    return arrayList;
                }
                return list;
            case 1:
                Object obj3 = this.A00;
                AbstractC193598he abstractC193598he = (AbstractC193598he) this.A01;
                if (C14360o3.A0K(obj3, C8KB.A00)) {
                    return null;
                }
                int i2 = abstractC193598he.A00;
                if (i2 != 3 && i2 != 4) {
                    return abstractC193598he;
                }
                AbstractC52922bZ abstractC52922bZ = (AbstractC52922bZ) this.A03;
                C141796aw A00 = AbstractC141776au.A00(abstractC52922bZ);
                C25024B5f c25024B5f = new C25024B5f(abstractC52922bZ, null, 45);
                AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c25024B5f, A00);
                return abstractC193598he;
            case 2:
                C54432ex c54432ex = (C54432ex) this.A00;
                List list2 = (List) this.A01;
                InterfaceC54232eZ interfaceC54232eZ = ((C54492f3) this.A03).A00;
                int i3 = c54432ex.A01;
                return new C54432ex(interfaceC54232eZ, list2, i3, i3);
            default:
                C9B7 c9b7 = (C9B7) this.A00;
                X8Y x8y = (X8Y) this.A01;
                if (x8y != null) {
                    C147896lL c147896lL = (C147896lL) this.A03;
                    if (x8y instanceof C71148Woj) {
                        IgLiveQuestionsRepository igLiveQuestionsRepository = c147896lL.A08;
                        Long l = igLiveQuestionsRepository.A02;
                        if (l != null) {
                            long j = ((C71148Woj) x8y).A01;
                            if (l.longValue() == j) {
                                igLiveQuestionsRepository.A09(EnumC223199sy.A04, j);
                                obj2 = null;
                                igLiveQuestionsRepository.A02 = null;
                                c2gs = c147896lL.A03;
                                c2gs.A0B(obj2);
                            }
                        }
                    } else if ((x8y instanceof C71149Wok) && c147896lL.A05 != EnumC142806cg.A03) {
                        long j2 = ((C71149Wok) x8y).A01;
                        IgLiveQuestionsRepository igLiveQuestionsRepository2 = c147896lL.A08;
                        Long l2 = igLiveQuestionsRepository2.A02;
                        if (l2 == null || j2 != l2.longValue()) {
                            Long valueOf = Long.valueOf(j2);
                            igLiveQuestionsRepository2.A02 = valueOf;
                            igLiveQuestionsRepository2.A09(EnumC223199sy.A05, j2);
                            c2gs = c147896lL.A03;
                            obj2 = igLiveQuestionsRepository2.A08.get(valueOf);
                            c2gs.A0B(obj2);
                        }
                    }
                }
                return new C51745MtU(x8y, c9b7.A00, 8, c9b7.A01);
        }
    }
}
