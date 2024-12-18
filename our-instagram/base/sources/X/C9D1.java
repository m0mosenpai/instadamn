package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel;
import com.instagram.quicksnap.data.repository.QuickSnapRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.9D1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9D1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public Object A00;
    public final int A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9D1(Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A00 = obj;
        this.A02 = obj2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        int i;
        Object obj3;
        Object obj4;
        int i2;
        switch (this.A01) {
            case 0:
                obj2 = this.A02;
                i = 0;
                break;
            case 1:
                return new C9D1(this.A00, this.A02, interfaceC23621Ds, 1);
            case 2:
                obj2 = this.A02;
                i = 2;
                break;
            case 3:
                obj2 = this.A02;
                i = 3;
                break;
            case 4:
                obj3 = this.A02;
                obj4 = this.A00;
                i2 = 4;
                return new C9D1(obj4, obj3, interfaceC23621Ds, i2);
            case 5:
                obj3 = this.A02;
                obj4 = this.A00;
                i2 = 5;
                return new C9D1(obj4, obj3, interfaceC23621Ds, i2);
            default:
                obj3 = this.A02;
                obj4 = this.A00;
                i2 = 6;
                return new C9D1(obj4, obj3, interfaceC23621Ds, i2);
        }
        C9D1 c9d1 = new C9D1(obj2, interfaceC23621Ds, i);
        c9d1.A00 = obj;
        return c9d1;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C9D1) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C104544nK c104544nK;
        int min;
        Object obj2;
        C226618u c226618u;
        switch (this.A01) {
            case 0:
                AbstractC09560e7.A00(obj);
                C9BT c9bt = (C9BT) this.A00;
                AbstractC58182la abstractC58182la = (AbstractC58182la) this.A02;
                InterfaceC54232eZ interfaceC54232eZ = abstractC58182la.A0D;
                C54672fP c54672fP = abstractC58182la.A0E;
                C14360o3.A0B(c9bt, 1);
                c54672fP.A01.put(interfaceC54232eZ, c9bt);
                abstractC58182la.A00 = c9bt;
                return C0eB.A00;
            case 1:
                AbstractC09560e7.A00(obj);
                return Boolean.valueOf(((AbstractC55352ga) this.A00).AVr((java.util.Set) this.A02));
            case 2:
                AbstractC09560e7.A00(obj);
                C19L c19l = (C19L) this.A00;
                QuickSnapArchiveViewModel quickSnapArchiveViewModel = (QuickSnapArchiveViewModel) this.A02;
                C0UO c0uo = quickSnapArchiveViewModel.A08.A02;
                QuickSnapRepository quickSnapRepository = quickSnapArchiveViewModel.A09;
                AbstractC18560vj.A03(c19l, new C15340po(new PZI(quickSnapArchiveViewModel, null, 19), C10Q.A00(new C57184PaK(quickSnapArchiveViewModel, null, 5), c0uo, quickSnapRepository.A0A, quickSnapArchiveViewModel.A0G)));
                AbstractC18560vj.A03(c19l, new C15340po(new PZI(quickSnapArchiveViewModel, null, 20), new C15430py(quickSnapRepository.A09)));
                return C0eB.A00;
            case 3:
                AbstractC09560e7.A00(obj);
                AbstractC46483Khh abstractC46483Khh = (AbstractC46483Khh) this.A00;
                if (abstractC46483Khh instanceof C46041KZk) {
                    C148176ln c148176ln = (C148176ln) this.A02;
                    K8S k8s = ((C46041KZk) abstractC46483Khh).A00;
                    C148246lu c148246lu = c148176ln.A0J;
                    if (c148246lu != null) {
                        c148246lu.A00 = new C220689os(k8s);
                    }
                    c148176ln.A0I.A00 = k8s;
                    AbstractC148266lw.A03.set(false);
                    ArrayList arrayList = c148176ln.A0P;
                    arrayList.clear();
                    for (C148276lx c148276lx : k8s.A00()) {
                        C148286ly c148286ly = (C148286ly) AbstractC001800i.A0O(c148276lx.A0O, 0);
                        if (c148286ly != null) {
                            c148286ly.A0c = "STORIES_QUICK_REACTION_AVATAR_STICKER_GRID";
                        }
                        arrayList.add(new C148306m0(c148276lx));
                    }
                    C148176ln.A05(c148176ln);
                } else if (abstractC46483Khh instanceof KZl) {
                    C148176ln c148176ln2 = (C148176ln) this.A02;
                    AbstractC148266lw.A03.set(false);
                    C6dP c6dP = c148176ln2.A0L;
                    c6dP.A01.flowEndFail(c6dP.A00, "error", null);
                    C148246lu c148246lu2 = c148176ln2.A0J;
                    if (c148246lu2 != null) {
                        C220699ot c220699ot = C220699ot.A00;
                        if (c148246lu2.A02) {
                            C148246lu.A00(c148246lu2);
                        }
                        c148246lu2.A00 = c220699ot;
                    }
                } else {
                    throw new RuntimeException();
                }
                return C0eB.A00;
            case 4:
                AbstractC09560e7.A00(obj);
                java.util.Set entrySet = ((C104484nE) this.A02).A03.entrySet();
                C104744ne c104744ne = (C104744ne) this.A00;
                Iterator it = entrySet.iterator();
                while (it.hasNext()) {
                    C104524nI c104524nI = (C104524nI) ((Map.Entry) it.next()).getValue();
                    C14360o3.A0B(c104744ne, 0);
                    java.util.Set set = c104524nI.A06;
                    C09530e4 c09530e4 = c104744ne.A01;
                    if (set.contains(c09530e4)) {
                        Object obj3 = c09530e4.A01;
                        if (obj3 == EnumC104534nJ.A05) {
                            c104544nK = c104524nI.A03;
                            int i = c104544nK.A00;
                            AbstractC104504nG abstractC104504nG = c104524nI.A04;
                            int A01 = i + abstractC104504nG.A01();
                            c104544nK.A00 = A01;
                            min = Math.min(A01, abstractC104504nG.A03());
                        } else {
                            boolean z = false;
                            Object obj4 = null;
                            if (obj3 == EnumC104534nJ.A02) {
                                Map map = c104744ne.A00;
                                if (map != null) {
                                    String str = (String) map.get("MEDIA_IDS");
                                    if (str != null) {
                                        obj4 = AbstractC001800i.A0k(AbstractC001900j.A0R(str, new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0));
                                    }
                                    Object obj5 = map.get("MAX_ID");
                                    if (obj5 != null && obj4 != null) {
                                        c104524nI.A05.put(obj5, obj4);
                                    }
                                }
                            } else if (obj3 == EnumC104534nJ.A04) {
                                Map map2 = c104744ne.A00;
                                if (map2 != null && (obj2 = map2.get("MEDIA_ID")) != null) {
                                    Map map3 = c104524nI.A05;
                                    for (Map.Entry entry : map3.entrySet()) {
                                        if (((java.util.Set) entry.getValue()).contains(obj2)) {
                                            obj4 = entry.getKey();
                                            z = true;
                                        }
                                    }
                                    if (z) {
                                        C15500q5.A04(map3).remove(obj4);
                                    }
                                }
                            } else if (obj3 == EnumC104534nJ.A03 && (!c104524nI.A05.isEmpty())) {
                                c104544nK = c104524nI.A03;
                                int i2 = c104544nK.A00;
                                AbstractC104504nG abstractC104504nG2 = c104524nI.A04;
                                int A00 = i2 - abstractC104504nG2.A00();
                                c104544nK.A00 = A00;
                                min = Math.max(A00, abstractC104504nG2.A04());
                            }
                        }
                        c104544nK.A00 = min;
                    }
                }
                return C0eB.A00;
            case 5:
                AbstractC09560e7.A00(obj);
                ((AnonymousClass523) this.A02).A00 = new AnonymousClass524((C1CA) this.A00, System.currentTimeMillis(), -1L);
                return C0eB.A00;
            default:
                AbstractC09560e7.A00(obj);
                C139006Rh c139006Rh = (C139006Rh) this.A02;
                C22905A8a c22905A8a = c139006Rh.A0C;
                if (c22905A8a != null) {
                    String str2 = c139006Rh.A0A.A05;
                    C138636Pt c138636Pt = (C138636Pt) this.A00;
                    short s = c138636Pt.A02;
                    long j = c138636Pt.A00;
                    C14360o3.A0B(str2, 0);
                    Map map4 = c22905A8a.A01;
                    C49679LxA c49679LxA = (C49679LxA) map4.get(str2);
                    if (c49679LxA != null) {
                        C0k4 c0k4 = c49679LxA.A00;
                        if (c0k4 != null) {
                            C18720vz c18720vz = AbstractC12960li.A00;
                            C226218q.A01(c18720vz);
                            C226418s.A07(c0k4, "termination_from_slate", true);
                            C226418s A012 = C226218q.A01(c18720vz);
                            if (s == 2) {
                                c226618u = C226618u.A03;
                            } else if (s != 4 && s != 630) {
                                c226618u = AbstractC226518t.A00(AnonymousClass001.A0O("failure_from_slate: ", s));
                            } else {
                                String A0O = AnonymousClass001.A0O("cancel_from_slate: ", s);
                                C14360o3.A0B(A0O, 0);
                                c226618u = new C226618u(A0O, true, true);
                            }
                            A012.A0M(c0k4, c226618u, Long.valueOf(j));
                        }
                        map4.remove(str2);
                    }
                }
                return C0eB.A00;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9D1(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A02 = obj;
    }
}
