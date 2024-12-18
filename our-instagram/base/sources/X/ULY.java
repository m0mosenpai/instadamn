package X;

import android.graphics.Canvas;
import com.facebook.android.maps.model.CameraPosition;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes11.dex */
public class ULY extends AbstractC66278U6y implements InterfaceC71889X8w {
    public static final C2TB A0E;
    public VZu A00;
    public VZu A01;
    public InterfaceC71968XDa A02;
    public C68828Vcj A03;
    public Map A04;
    public CameraPosition A05;
    public boolean A06;
    public final C69321VlT A07;
    public final C2TB A08;
    public final ArrayList A09;
    public final List A0A;
    public final java.util.Set A0B;
    public final C2TB A0C;
    public final double[] A0D;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.2TB, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.2TB, java.lang.Object] */
    public ULY(InterfaceC71968XDa interfaceC71968XDa, C70394WTw c70394WTw) {
        super(c70394WTw);
        this.A0B = new HashSet();
        this.A08 = new Object();
        this.A0C = new Object();
        this.A0D = new double[2];
        this.A0A = new ArrayList();
        this.A09 = new ArrayList(10);
        this.A06 = false;
        this.A02 = interfaceC71968XDa;
        this.A04 = new HashMap();
        this.A07 = new C69321VlT(this);
        c70394WTw.A0N.add(this);
    }

    public final void A0H() {
        VZu vZu = this.A00;
        if (vZu != null) {
            vZu.A00.A07();
        }
        this.A00 = null;
        Iterator A12 = AbstractC43593JPy.A12(this.A04);
        while (A12.hasNext()) {
            A12.next();
        }
        this.A07.A03 = null;
        this.A06 = true;
        A05();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2TB, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.A01 = 0.0d;
        obj.A03 = 0.0d;
        obj.A02 = 1.0d;
        obj.A00 = 1.0d;
        A0E = obj;
    }

    public static void A00(ULY uly, java.util.Set set) {
        ULQ ulq;
        VZu ALm;
        int size;
        Map map = uly.A04;
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry entry = (Map.Entry) A15.next();
            Object key = entry.getKey();
            C71196Wpl c71196Wpl = (C71196Wpl) entry.getValue();
            double[] dArr = uly.A0D;
            c71196Wpl.Amj(dArr);
            if (!uly.A08.A00(dArr[0], dArr[1]) || !set.remove(c71196Wpl)) {
                A15.remove();
                uly.A02.EF8(c71196Wpl);
                VZu vZu = uly.A00;
                if (key == vZu) {
                    if (vZu != null) {
                        vZu.A00.A07();
                    }
                    uly.A00 = null;
                }
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C71196Wpl c71196Wpl2 = (C71196Wpl) it.next();
            double[] dArr2 = uly.A0D;
            c71196Wpl2.Amj(dArr2);
            double d = dArr2[0];
            double d2 = dArr2[1];
            if (c71196Wpl2.A03 != 0 && uly.A08.A00(d, d2)) {
                InterfaceC71968XDa interfaceC71968XDa = uly.A02;
                ArrayList arrayList = uly.A09;
                if (!arrayList.isEmpty() && (size = arrayList.size() - 1) >= 0) {
                    ALm = (VZu) arrayList.get(size);
                    arrayList.remove(size);
                } else {
                    ALm = interfaceC71968XDa.ALm(c71196Wpl2, 1);
                }
                interfaceC71968XDa.ADe(c71196Wpl2, ALm);
                AbstractC66278U6y abstractC66278U6y = ALm.A00;
                c71196Wpl2.A05 = abstractC66278U6y;
                map.put(ALm, c71196Wpl2);
                abstractC66278U6y.A06();
            }
        }
        C68828Vcj c68828Vcj = uly.A03;
        if (c68828Vcj != null) {
            C69717VuC c69717VuC = c68828Vcj.A00;
            c69717VuC.A00++;
            InterfaceC71981XDq interfaceC71981XDq = c69717VuC.A07;
            InterfaceC72044XLa BgP = interfaceC71981XDq.BgP();
            if (BgP != null) {
                Reference reference = (Reference) c69717VuC.A08.A01.get(BgP.getId());
                if (reference != null && (ulq = (ULQ) reference.get()) != null) {
                    interfaceC71981XDq.EGh(c69717VuC, ulq);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    linkedHashSet.add(ulq);
                    c69717VuC.A01(linkedHashSet);
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    linkedHashSet2.add(BgP);
                    Iterator it2 = c69717VuC.A00(linkedHashSet2).iterator();
                    while (it2.hasNext()) {
                        interfaceC71981XDq.EGg(c69717VuC, (ULQ) it2.next());
                    }
                }
            }
        }
    }

    @Override // X.AbstractC66278U6y
    public final void A0D(Canvas canvas) {
        AbstractRunnableC71645Wxs c66530ULk;
        long j;
        if (this.A06) {
            this.A06 = false;
            float f = super.A07.A02().A02;
            WFW wfw = super.A08;
            C2TB c2tb = this.A0C;
            wfw.A05(c2tb);
            C69321VlT c69321VlT = this.A07;
            Float f2 = c69321VlT.A03;
            if (f2 == null || f2.floatValue() != f || !this.A08.A01(c2tb)) {
                if (f <= 5.0f) {
                    C2TB c2tb2 = this.A08;
                    C2TB c2tb3 = A0E;
                    c2tb2.A00 = c2tb3.A00;
                    c2tb2.A03 = c2tb3.A03;
                    c2tb2.A01 = c2tb3.A01;
                    c2tb2.A02 = c2tb3.A02;
                } else {
                    double d = c2tb.A02;
                    double d2 = c2tb.A01;
                    double d3 = c2tb.A00;
                    double d4 = c2tb.A03;
                    double d5 = d3 - d4;
                    double d6 = (d - d2) / 2.0d;
                    double d7 = d2 - d6;
                    double d8 = d + d6;
                    double d9 = d8 - d7;
                    C2TB c2tb4 = this.A08;
                    if (d9 >= 1.0d) {
                        c2tb4.A01 = 0.0d;
                        c2tb4.A02 = 1.0d;
                    } else {
                        c2tb4.A01 = C71196Wpl.A00(d7);
                        c2tb4.A02 = C71196Wpl.A00(d8);
                    }
                    double d10 = d5 / 2.0d;
                    c2tb4.A03 = Math.max(0.0d, d4 - d10);
                    c2tb4.A00 = Math.min(1.0d, d3 + d10);
                }
                Float f3 = c69321VlT.A03;
                if (f3 != null && f > f3.floatValue()) {
                    AbstractRunnableC71645Wxs abstractRunnableC71645Wxs = c69321VlT.A01;
                    if (abstractRunnableC71645Wxs != null) {
                        C70184WFm.A01.removeCallbacks(abstractRunnableC71645Wxs);
                        c69321VlT.A01 = null;
                    }
                    if (c69321VlT.A04.A01 == null && c69321VlT.A00 == null) {
                        c66530ULk = new C66525ULf(c69321VlT);
                        c69321VlT.A00 = c66530ULk;
                        C69022Vfy c69022Vfy = c69321VlT.A02;
                        if (c69022Vfy == null) {
                            j = 400;
                        } else if (System.currentTimeMillis() - c69022Vfy.A00 < 1000) {
                            j = 0;
                        } else {
                            j = 300;
                        }
                        C70184WFm.A01.postDelayed(c66530ULk, j);
                    }
                } else {
                    U70 u70 = c69321VlT.A04.A01;
                    if (u70 != null) {
                        u70.A03();
                    }
                    AbstractRunnableC71645Wxs abstractRunnableC71645Wxs2 = c69321VlT.A00;
                    if (abstractRunnableC71645Wxs2 != null) {
                        C70184WFm.A01.removeCallbacks(abstractRunnableC71645Wxs2);
                        c69321VlT.A00 = null;
                    }
                    if (c69321VlT.A01 == null) {
                        c66530ULk = new C66530ULk(c69321VlT, f);
                        c69321VlT.A01 = c66530ULk;
                        j = 150;
                        C70184WFm.A01.postDelayed(c66530ULk, j);
                    }
                }
            }
        }
        if (this instanceof ULR) {
            ULR ulr = (ULR) this;
            java.util.Set<VZu> keySet = ((ULY) ulr).A04.keySet();
            TreeMap treeMap = new TreeMap();
            for (VZu vZu : keySet) {
                Integer valueOf = Integer.valueOf(ulr.A00.A01.BPe(vZu.A00));
                java.util.Set set = (java.util.Set) treeMap.get(valueOf);
                if (set == null) {
                    set = new HashSet();
                    treeMap.put(valueOf, set);
                }
                set.add(vZu);
            }
            Iterator A0k = AbstractC167007dF.A0k(treeMap);
            while (A0k.hasNext()) {
                for (VZu vZu2 : (java.util.Set) A0k.next()) {
                    if (vZu2 != ((ULY) ulr).A00) {
                        java.util.Set set2 = ulr.A01;
                        AbstractC66278U6y abstractC66278U6y = vZu2.A00;
                        if (!set2.contains(abstractC66278U6y) && abstractC66278U6y.A04) {
                            abstractC66278U6y.A0D(canvas);
                        }
                    }
                }
            }
            VZu vZu3 = ((ULY) ulr).A00;
            if (vZu3 != null && !ulr.A01.contains(vZu3.A00)) {
                AbstractC66278U6y abstractC66278U6y2 = ((ULY) ulr).A00.A00;
                if (abstractC66278U6y2.A04) {
                    abstractC66278U6y2.A0D(canvas);
                }
            }
            for (AbstractC66278U6y abstractC66278U6y3 : ulr.A01) {
                if (abstractC66278U6y3.A04) {
                    abstractC66278U6y3.A0D(canvas);
                }
            }
            return;
        }
        Iterator A12 = AbstractC43593JPy.A12(this.A04);
        while (A12.hasNext()) {
            VZu vZu4 = (VZu) A12.next();
            if (vZu4 != this.A00) {
                AbstractC66278U6y abstractC66278U6y4 = vZu4.A00;
                if (abstractC66278U6y4.A04) {
                    abstractC66278U6y4.A0D(canvas);
                }
            }
        }
        VZu vZu5 = this.A00;
        if (vZu5 != null) {
            AbstractC66278U6y abstractC66278U6y5 = vZu5.A00;
            if (abstractC66278U6y5.A04) {
                abstractC66278U6y5.A0D(canvas);
            }
        }
    }

    @Override // X.InterfaceC71889X8w
    public final void D1N(CameraPosition cameraPosition) {
        if (!cameraPosition.equals(this.A05)) {
            this.A06 = true;
        }
        this.A05 = cameraPosition;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.2TB, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.2TB, java.lang.Object] */
    public ULY(C68229VIp c68229VIp, C70394WTw c70394WTw) {
        super(c70394WTw);
        this.A0B = new HashSet();
        this.A08 = new Object();
        this.A0C = new Object();
        this.A0D = new double[2];
        this.A0A = new ArrayList();
        this.A09 = new ArrayList(10);
        this.A06 = false;
        this.A02 = c68229VIp.A00;
        this.A04 = new HashMap();
        this.A07 = new C69321VlT(this);
        c70394WTw.A0N.add(this);
    }
}
