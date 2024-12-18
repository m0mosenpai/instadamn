package X;

import com.instagram.debug.devoptions.apiperf.DebugHeadPlugin;
import com.instagram.debug.devoptions.debughead.config.DebugHeadConfigurations;
import com.instagram.debug.devoptions.debughead.data.provider.DebugHeadMemoryMetricsListener;
import java.util.HashSet;

/* loaded from: classes12.dex */
public final class YJI implements InterfaceC08830cm {
    public static final YJI A00 = new YJI();

    /* JADX WARN: Type inference failed for: r0v4, types: [X.Y9t, java.lang.Object] */
    public static C73363Y9t A00(C005001p c005001p) {
        c005001p.put(C72182XRs.class, new Object());
        c005001p.put(C72183XRt.class, new Object());
        c005001p.put(C72179XRp.class, new Object());
        c005001p.put(C72184XRu.class, new Object());
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, X.Y9i] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, X.Y9i] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, X.Y9h] */
    @Override // X.InterfaceC08830cm
    public final /* bridge */ /* synthetic */ Object get() {
        boolean z;
        HashSet A1H = AbstractC166987dD.A1H();
        if (DebugHeadPlugin.isAvailable() && DebugHeadConfigurations.isMemoryMetricsDebuggingEnabled) {
            C005001p c005001p = new C005001p(0);
            c005001p.put(C72181XRr.class, new Object());
            C73358Y9o c73358Y9o = new C73358Y9o(c005001p);
            if (DebugHeadPlugin.sInstance != null) {
                DebugHeadMemoryMetricsListener debugHeadMemoryMetricsListener = DebugHeadMemoryMetricsListener.getInstance();
                ?? obj = new Object();
                obj.A01 = c73358Y9o;
                obj.A00 = debugHeadMemoryMetricsListener;
                z = obj;
            } else {
                throw AbstractC166997dE.A0g();
            }
        } else {
            C005001p c005001p2 = new C005001p(0);
            c005001p2.put(C72182XRs.class, new Object());
            c005001p2.put(C72183XRt.class, new Object());
            c005001p2.put(C72179XRp.class, new Object());
            c005001p2.put(C72184XRu.class, new Object());
            c005001p2.put(C72185XRv.class, new Object());
            c005001p2.put(C72180XRq.class, new Object());
            C73358Y9o c73358Y9o2 = new C73358Y9o(c005001p2);
            C005001p c005001p3 = new C005001p(0);
            c005001p3.put(C72185XRv.class, A00(c005001p3));
            c005001p3.put(C72180XRq.class, new Object());
            YA0 ya0 = new YA0(c005001p3);
            C18720vz c18720vz = AbstractC12960li.A00;
            C73362Y9s c73362Y9s = new C73362Y9s(AbstractC11060iN.A00(c18720vz));
            YA3 ya3 = YA3.A00;
            ?? obj2 = new Object();
            obj2.A00 = c73358Y9o2;
            obj2.A02 = ya0;
            obj2.A01 = c73362Y9s;
            obj2.A03 = ya3;
            A1H.add(obj2);
            C005001p c005001p4 = new C005001p(0);
            c005001p4.put(C72182XRs.class, new Object());
            c005001p4.put(C72183XRt.class, new Object());
            c005001p4.put(C72179XRp.class, new Object());
            c005001p4.put(C72184XRu.class, new Object());
            c005001p4.put(C72185XRv.class, new Object());
            c005001p4.put(C72178XRo.class, new Object());
            c005001p4.put(C72180XRq.class, new Object());
            C73358Y9o c73358Y9o3 = new C73358Y9o(c005001p4);
            C005001p c005001p5 = new C005001p(0);
            c005001p5.put(C72185XRv.class, A00(c005001p5));
            c005001p5.put(C72178XRo.class, new Object());
            c005001p5.put(C72180XRq.class, new Object());
            YA0 ya02 = new YA0(c005001p5);
            C73362Y9s c73362Y9s2 = new C73362Y9s(AbstractC11060iN.A00(c18720vz));
            YA2 ya2 = YA2.A00;
            ?? obj3 = new Object();
            obj3.A00 = c73358Y9o3;
            obj3.A02 = ya02;
            obj3.A01 = c73362Y9s2;
            obj3.A03 = ya2;
            z = obj3;
        }
        A1H.add(z);
        return A1H;
    }
}
