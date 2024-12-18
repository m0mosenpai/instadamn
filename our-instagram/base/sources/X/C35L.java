package X;

import android.view.View;
import com.facebook.litho.ComponentHost;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.35L, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C35L {
    public final C65502xm A00;
    public final C35M A01;
    public final C114735Ge A02;
    public final InterfaceC16610sE A03;

    public C35L(UserSession userSession, java.util.Set set, InterfaceC16610sE interfaceC16610sE) {
        C114735Ge c114735Ge;
        this.A03 = interfaceC16610sE;
        C65502xm A00 = AbstractC65492xl.A00(userSession);
        this.A00 = A00;
        this.A01 = new C35M(A00.A00);
        if (!set.isEmpty()) {
            c114735Ge = new C114735Ge(set, C25111B9h.A00, new C30191DRw(userSession, 23));
        } else {
            c114735Ge = null;
        }
        this.A02 = c114735Ge;
    }

    public final void A00(View view, C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        Object valueOf;
        String str;
        Integer CFq = interfaceC57162jr.CFq(c59062n7);
        C14360o3.A07(CFq);
        Object obj = c59062n7.A03;
        C38321qM c38321qM = (C38321qM) obj;
        String id = c38321qM.getId();
        if (id != null) {
            if (CFq != C05F.A0C) {
                if (view != null) {
                    C35M c35m = this.A01;
                    if (interfaceC57162jr.CGk(c59062n7) >= c35m.A00) {
                        c35m.A01.add(id);
                    }
                    if (c35m.A01.contains(id)) {
                        this.A03.invoke(c59062n7, interfaceC57162jr, id);
                        C114735Ge c114735Ge = this.A02;
                        if (c114735Ge != null) {
                            Object invoke = c114735Ge.A03.invoke(obj);
                            HashMap hashMap = c114735Ge.A01;
                            if (!hashMap.containsKey(invoke)) {
                                hashMap.put(invoke, new C211739Zk((Map) c114735Ge.A04.invoke(obj, c59062n7.A04)));
                            }
                            C211739Zk c211739Zk = (C211739Zk) hashMap.get(invoke);
                            if (c211739Zk != null) {
                                float CGk = interfaceC57162jr.CGk(c59062n7);
                                c211739Zk.A02 = true;
                                for (Object obj2 : c114735Ge.A02) {
                                    View findViewWithTag = view.findViewWithTag(obj2);
                                    if (findViewWithTag != null) {
                                        Map map = (Map) c211739Zk.A04;
                                        Object obj3 = map.get(obj2);
                                        if (obj3 == null) {
                                            obj3 = new LinkedHashMap();
                                            map.put(obj2, obj3);
                                        }
                                        Map map2 = (Map) obj3;
                                        map2.put("is_shown", Boolean.valueOf(findViewWithTag.isShown()));
                                        if (findViewWithTag instanceof IgImageView) {
                                            IgImageView igImageView = (IgImageView) findViewWithTag;
                                            map2.put("is_fully_loaded", Boolean.valueOf(igImageView.A0N));
                                            boolean z = false;
                                            if (igImageView.getDrawable() == null) {
                                                z = true;
                                            }
                                            valueOf = Boolean.valueOf(z);
                                            str = "is_drawable_null";
                                        } else if (findViewWithTag instanceof ComponentHost) {
                                            valueOf = AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", ((ComponentHost) findViewWithTag).getTextContentText(), C25112B9i.A00);
                                            str = AbstractC111324zv.A00(3227);
                                        }
                                        map2.put(str, valueOf);
                                    }
                                }
                                ((List) c211739Zk.A01).add(Float.valueOf(CGk));
                                ((List) c211739Zk.A05).add(Long.valueOf(System.currentTimeMillis()));
                                return;
                            }
                            throw new IllegalStateException("Should have information about model");
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            C114735Ge c114735Ge2 = this.A02;
            if (c114735Ge2 != null) {
                LinkedHashMap A02 = AbstractC77703du.A02(id);
                HashMap hashMap2 = c114735Ge2.A01;
                if (hashMap2.containsKey(c38321qM.getId())) {
                    java.util.Set set = c114735Ge2.A02;
                    ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(set, 10));
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((EnumC77663dq) it.next()).A00);
                    }
                    int A0L = AbstractC16850sd.A0L(AbstractC06950Ym.A1E(arrayList, 10));
                    if (A0L < 16) {
                        A0L = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
                    for (Object obj4 : arrayList) {
                        linkedHashMap.put(obj4, A02.get(obj4));
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        List list = (List) entry.getValue();
                        if (list != null && !list.isEmpty() && (!(list instanceof Collection) || !list.isEmpty())) {
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                if (!((C0Zx) it2.next()).A00.isEmpty()) {
                                    break;
                                }
                            }
                        }
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                    if (!linkedHashMap2.isEmpty()) {
                        StringBuilder sb = new StringBuilder("Tracking nodes with missing data: \n");
                        for (Object obj5 : linkedHashMap2.keySet()) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(" - ");
                            sb2.append(obj5);
                            sb2.append('\n');
                            sb.append(sb2.toString());
                        }
                        sb.append("\n\n");
                        sb.append(String.valueOf(hashMap2.get(c38321qM.getId())));
                        C0f5 AEp = c114735Ge2.A00.AEp("litho_pc_mismatch", 817898450);
                        AEp.ERI(new Throwable(sb.toString()));
                        AEp.report();
                    }
                    C15500q5.A04(hashMap2).remove(c38321qM.getId());
                }
            }
            this.A01.A01.remove(id);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
