package X;

import android.content.Context;
import android.os.Handler;
import android.util.SparseArray;
import com.facebook.R;
import com.instagram.common.lispy.lang.BloksScript;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6T7, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6T7 {
    public C126545np A00;
    public final Object A01;
    public final Executor A02;
    public final AtomicBoolean A03 = new AtomicBoolean(false);
    public final AtomicReference A04;
    public final C6TG A05;
    public final C6TH A06;
    public final C6FG A07;
    public final AnonymousClass630 A08;
    public final Object A09;
    public final List A0A;
    public final AtomicReference A0B;
    public final boolean A0C;

    public final void A03() {
        A05();
        AnonymousClass634.A08(A02());
        this.A03.set(true);
        C103364lB.A00().removeCallbacksAndMessages(this.A01);
        AbstractC102954kW.A03.incrementAndGet();
    }

    public C6T7(Context context, SparseArray sparseArray, C1338462s c1338462s, InterfaceC62872tQ interfaceC62872tQ, Map map, Map map2) {
        boolean z;
        C6TG c6tf;
        AtomicReference atomicReference = new AtomicReference();
        this.A04 = atomicReference;
        this.A09 = new Object();
        this.A01 = new Object();
        Executor executor = new Executor() { // from class: X.6T9
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                Handler A00 = C103364lB.A00();
                Object obj = C6T7.this.A01;
                A00.removeCallbacksAndMessages(obj);
                A00.postAtTime(runnable, obj, 0L);
            }
        };
        this.A02 = executor;
        List list = c1338462s.A01.A02;
        this.A0A = list;
        InterfaceC63192tw AgW = interfaceC62872tQ.AgS().AgW();
        AbstractC102954kW.A01.incrementAndGet();
        SparseArray clone = sparseArray.clone();
        clone.put(R.id.bk_context_key_render_callback_queue, new C6TA(AgW.Ch2()));
        if (AgW.Em2()) {
            z = true;
        } else {
            sparseArray.get(R.id.bk_context_key_app_id);
            z = false;
        }
        clone.put(R.id.bk_context_key_is_signals_enabled, Boolean.valueOf(z));
        this.A0C = z;
        C1339162z c1339162z = C1339162z.A00;
        C6FG A01 = AnonymousClass634.A01(context, clone, new AnonymousClass630(c1338462s, interfaceC62872tQ.AgS().AgX(), c1339162z), interfaceC62872tQ, c1338462s.A03);
        this.A07 = A01;
        InterfaceC62872tQ interfaceC62872tQ2 = A01.A02;
        InterfaceC63192tw AgW2 = interfaceC62872tQ2.AgS().AgW();
        AtomicBoolean atomicBoolean = C6TE.A01;
        if (!atomicBoolean.get() && AgW2.FDz()) {
            atomicBoolean.set(true);
            C102874kO c102874kO = new C102874kO(13320);
            C102874kO c102874kO2 = new C102874kO(13336);
            c102874kO2.A0Q(50, "Warming");
            c102874kO2.A0P();
            c102874kO.A0Q(135, AbstractC16960so.A1Q(40, new BloksScript(null, "(bk.action.bloks.GetVariable2, \"enabled\")", null, -1)));
            List singletonList = Collections.singletonList(c102874kO2);
            C14360o3.A07(singletonList);
            c102874kO.A0Q(32, singletonList);
            C102874kO c102874kO3 = new C102874kO(13688);
            c102874kO3.A0Q(141, Float.valueOf(0.5f));
            c102874kO3.A0P();
            List singletonList2 = Collections.singletonList(c102874kO3);
            C14360o3.A07(singletonList2);
            c102874kO.A0Q(133, singletonList2);
            c102874kO.A0P();
            AnonymousClass630 anonymousClass630 = new AnonymousClass630(C1338462s.A04(c102874kO), C63162tt.A00, c1339162z);
            SparseArray sparseArray2 = new SparseArray();
            sparseArray2.put(R.id.bk_context_key_is_signals_enabled, true);
            C6FG A012 = AnonymousClass634.A01(A01.A00, sparseArray2, anonymousClass630, interfaceC62872tQ2, "signals-warmup");
            C9GL c9gl = new C9GL(new C207289Fh(1, A012, c102874kO, anonymousClass630, new C136336Fm(new C6FI() { // from class: X.6VX
                @Override // X.C6FI
                public final /* bridge */ /* synthetic */ void ASi(InterfaceC30791DgS interfaceC30791DgS) {
                }
            }, A012), new AnonymousClass632(AbstractC1338762v.A00(AbstractC06930Yk.A0E()), AbstractC06930Yk.A0E(), AbstractC06930Yk.A0E(), AbstractC16850sd.A0M(new C09530e4("enabled", false)), AbstractC06930Yk.A0E(), AbstractC06930Yk.A0E(), AbstractC06930Yk.A0E(), AbstractC06930Yk.A0E(), AbstractC06930Yk.A0E())));
            c9gl.setPriority(5);
            c9gl.setName("BloksSignals_WarmerThread");
            c9gl.start();
        }
        AnonymousClass630 A02 = AnonymousClass634.A02(A01);
        this.A08 = A02;
        this.A0B = new AtomicReference(C1338462s.A05(list, map));
        if (z) {
            c6tf = new C28955Cq6(A02);
        } else {
            c6tf = new C6TF(A02);
        }
        this.A05 = c6tf;
        this.A06 = new C6TH(context, c6tf, A01, executor, AbstractC135256Aa.A00(A01));
        C1EM.A00(null, A02.A04(A01, new C6FJ() { // from class: X.6TJ
            @Override // X.C6FJ
            public final void DVl(C136326Fl c136326Fl) {
                C6T7 c6t7 = C6T7.this;
                c6t7.A04.set(c136326Fl);
                C6T7.A01(c6t7);
            }
        }, map2), atomicReference);
        A01(this);
    }

    public static C6T8 A00(Context context, C1338462s c1338462s, InterfaceC62872tQ interfaceC62872tQ) {
        return new C6T8(context, c1338462s, interfaceC62872tQ);
    }

    public static void A01(C6T7 c6t7) {
        C6AV c6av;
        C6TN c6tm;
        synchronized (c6t7.A09) {
            if (!c6t7.A03.get()) {
                C136326Fl c136326Fl = (C136326Fl) c6t7.A04.get();
                Map map = (Map) c6t7.A0B.get();
                if (c136326Fl == null || map == null) {
                    throw new IllegalStateException("TreeState was null but it should have been initialised by the constructor");
                }
                if (c6t7.A0C) {
                    c6tm = new C28956Cq7(c6t7.A07, c136326Fl, map);
                } else {
                    C6AZ c6az = ((C6TF) c6t7.A05).A00;
                    if (c6az != null) {
                        c6av = c6az.A01;
                    } else {
                        c6av = null;
                    }
                    c6tm = new C6TM(new C6TK(c6t7.A07, c136326Fl, c6av, map));
                }
                C6TH.A00(c6tm, c6t7.A06, true);
            }
        }
    }

    public final C6FG A02() {
        if (this.A03.get()) {
            AbstractC25241Le.A02("BloksHostingComponent", "Trying to access a BloksContext form a destroyed BloksHostingComponent");
        }
        return this.A07;
    }

    public final void A05() {
        if (this.A03.get()) {
            AbstractC25241Le.A02("BloksHostingComponent", "Trying to detach a view from a destroyed BloksHostingComponent");
            return;
        }
        C126545np c126545np = this.A00;
        if (c126545np == null) {
            return;
        }
        c126545np.setTag(R.id.bk_context_debug, null);
        this.A00.setRenderState(null);
        this.A00 = null;
    }

    public final void A06() {
        if (this.A03.get()) {
            AbstractC25241Le.A02("BloksHostingComponent", "Notifying bounds on a destroyed BloksHostingComponent");
            return;
        }
        C126545np c126545np = this.A00;
        if (c126545np == null) {
            return;
        }
        c126545np.Ctb();
    }

    public final void A07(C126545np c126545np) {
        if (this.A03.get()) {
            AbstractC25241Le.A02("BloksHostingComponent", "Trying to attach a view to a destroyed BloksHostingComponent");
            return;
        }
        C126545np c126545np2 = this.A00;
        if (c126545np2 != null && c126545np2 != c126545np) {
            A05();
        }
        this.A00 = c126545np;
        c126545np.setRenderState(this.A06);
        this.A00.requestLayout();
        C1LZ.A00();
    }

    public final void A08(Map map) {
        if (this.A03.get()) {
            AbstractC25241Le.A02("BloksHostingComponent", "Trying to update variables on a destroyed BloksHostingComponent");
            return;
        }
        boolean z = false;
        HashMap A05 = C1338462s.A05(this.A0A, map);
        AtomicReference atomicReference = this.A0B;
        Map map2 = (Map) atomicReference.get();
        if (map2 != null) {
            Map map3 = map2;
            for (Map.Entry entry : A05.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (map2.get(key) != value) {
                    if (map3 == map2) {
                        z = true;
                        map3 = new HashMap(map2);
                    }
                    map3.put(key, value);
                }
            }
            if (!z) {
                return;
            }
            atomicReference.set(map3);
            A01(this);
            return;
        }
        throw new IllegalStateException("External variables should never be set to null");
    }

    public final void A04() {
        A05();
    }
}
