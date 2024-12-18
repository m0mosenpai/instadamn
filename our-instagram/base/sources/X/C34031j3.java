package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1j3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34031j3 implements InterfaceC29421bJ {
    public static final C0KV A01 = C34041j4.A00;
    public final C35039FcC A00;

    private final void A00(MNP mnp, AbstractC33951iv abstractC33951iv) {
        String str;
        C35039FcC c35039FcC;
        C35039FcC c35039FcC2;
        C35039FcC c35039FcC3;
        Object obj;
        int indexOf;
        String str2 = abstractC33951iv.A03;
        if (str2 != null) {
            String str3 = ((JTV) mnp).A02;
            switch (str3.hashCode()) {
                case -948696717:
                    if (!str3.equals("queued") || (c35039FcC3 = this.A00) == null) {
                        return;
                    }
                    E6M e6m = new E6M(abstractC33951iv.A01, AbstractC46747Km4.A00(abstractC33951iv.A06), abstractC33951iv.A05, abstractC33951iv.A04, (int) TimeUnit.MICROSECONDS.toSeconds(((AbstractC29011ae) abstractC33951iv).A00));
                    synchronized (c35039FcC3) {
                        Map map = c35039FcC3.A00;
                        List list = (List) map.get(str2);
                        if (list == null) {
                            list = new ArrayList();
                        }
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (C14360o3.A0K(((E6M) obj).A03, e6m.A03)) {
                                }
                            } else {
                                obj = null;
                            }
                        }
                        E6M e6m2 = (E6M) obj;
                        if (e6m2 == null) {
                            list.add(0, e6m);
                            map.put(str2, list);
                        } else if (e6m2.A02 != e6m.A02 && (indexOf = list.indexOf(e6m2)) != -1) {
                            list.remove(e6m2);
                            list.add(indexOf, e6m);
                        }
                        C35039FcC.A00(c35039FcC3, str2);
                    }
                    return;
                case 1501196714:
                    if (!str3.equals("upload_failed_permanent") || (c35039FcC2 = this.A00) == null) {
                        return;
                    }
                    c35039FcC2.A03(str2, abstractC33951iv.A05);
                    return;
                case 1563991648:
                    str = "uploaded";
                    break;
                case 1885454214:
                    str = "upload_failed_transient";
                    break;
                default:
                    return;
            }
            if (!str3.equals(str) || (c35039FcC = this.A00) == null) {
                return;
            }
            String str4 = abstractC33951iv.A05;
            String str5 = abstractC33951iv.A06;
            synchronized (c35039FcC) {
                C14360o3.A0B(str5, 2);
                Map map2 = c35039FcC.A00;
                List<E6M> list2 = (List) map2.get(str2);
                if (list2 != null) {
                    ArrayList arrayList = new ArrayList();
                    for (E6M e6m3 : list2) {
                        String str6 = e6m3.A03;
                        if (C14360o3.A0K(str6, str4)) {
                            Integer A00 = AbstractC46747Km4.A00(str5);
                            C14360o3.A0B(A00, 1);
                            String str7 = e6m3.A04;
                            C7Q4 c7q4 = e6m3.A01;
                            int i = e6m3.A00;
                            C14360o3.A0B(str6, 0);
                            e6m3 = new E6M(c7q4, A00, str6, str7, i);
                        }
                        arrayList.add(e6m3);
                    }
                    map2.put(str2, arrayList);
                    C35039FcC.A00(c35039FcC, str2);
                }
            }
        }
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUn(C1OW c1ow, MNP mnp) {
        AbstractC33951iv abstractC33951iv = (AbstractC33951iv) c1ow;
        C14360o3.A0B(abstractC33951iv, 0);
        C14360o3.A0B(mnp, 1);
        A00(mnp, abstractC33951iv);
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUr(C1OW c1ow, MNP mnp) {
        AbstractC33951iv abstractC33951iv = (AbstractC33951iv) c1ow;
        C14360o3.A0B(abstractC33951iv, 0);
        C14360o3.A0B(mnp, 1);
        A00(mnp, abstractC33951iv);
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUs(C1OW c1ow, MNP mnp, MNP mnp2) {
        AbstractC33951iv abstractC33951iv = (AbstractC33951iv) c1ow;
        C14360o3.A0B(abstractC33951iv, 0);
        C14360o3.A0B(mnp2, 2);
        A00(mnp2, abstractC33951iv);
    }

    public C34031j3(C35039FcC c35039FcC) {
        this.A00 = c35039FcC;
    }
}
