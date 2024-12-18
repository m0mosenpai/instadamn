package X;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.runtime.Recomposer;
import com.facebook.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.571, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class AnonymousClass571 {
    public static final Map A00 = new LinkedHashMap();

    /* JADX WARN: Type inference failed for: r5v0, types: [X.0ps, java.lang.Object] */
    public static final Recomposer A03(final View view, C07T c07t, C12W c12w) {
        C12W c12w2;
        C12W c12w3;
        C07X A002;
        if (c12w.get(C12X.A00) == null || c12w.get(AnonymousClass577.A00) == null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                c12w2 = (C12W) AnonymousClass572.A0B.getValue();
            } else {
                c12w2 = (C12W) AnonymousClass572.A0A.get();
                if (c12w2 == null) {
                    throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                }
            }
            c12w = c12w2.plus(c12w);
        }
        AnonymousClass577 anonymousClass577 = (AnonymousClass577) c12w.get(AnonymousClass577.A00);
        final PausableMonotonicFrameClock pausableMonotonicFrameClock = null;
        if (anonymousClass577 != null) {
            pausableMonotonicFrameClock = new PausableMonotonicFrameClock(anonymousClass577);
            C57A c57a = pausableMonotonicFrameClock.A00;
            synchronized (c57a.A03) {
                c57a.A02 = false;
            }
        }
        final ?? obj = new Object();
        C12V c12v = c12w.get(C57B.A00);
        if (c12v == null) {
            c12v = new C57D();
            obj.A00 = c12v;
        }
        if (pausableMonotonicFrameClock != null) {
            c12w3 = pausableMonotonicFrameClock;
        } else {
            c12w3 = AnonymousClass191.A00;
        }
        C12W plus = c12w.plus(c12w3).plus(c12v);
        final Recomposer recomposer = new Recomposer(plus);
        synchronized (recomposer.A0D) {
            recomposer.A07 = true;
        }
        final C19K A02 = AnonymousClass194.A02(plus);
        if (c07t != null || ((A002 = AbstractC55832hO.A00(view)) != null && (c07t = A002.getLifecycle()) != null)) {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.57V
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view2) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view2) {
                    view.removeOnAttachStateChangeListener(this);
                    recomposer.A0E();
                }
            });
            c07t.A09(new InterfaceC09670ek() { // from class: X.57W
                @Override // X.InterfaceC09670ek
                public final void DoQ(C07R c07r, C07X c07x) {
                    InterfaceC24901Jp interfaceC24901Jp;
                    boolean z;
                    int ordinal = c07r.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 4) {
                                if (ordinal == 5) {
                                    recomposer.A0E();
                                    return;
                                }
                                return;
                            } else {
                                Recomposer recomposer2 = recomposer;
                                synchronized (recomposer2.A0D) {
                                    recomposer2.A07 = true;
                                }
                                return;
                            }
                        }
                        PausableMonotonicFrameClock pausableMonotonicFrameClock2 = pausableMonotonicFrameClock;
                        if (pausableMonotonicFrameClock2 != null) {
                            C57A c57a2 = pausableMonotonicFrameClock2.A00;
                            Object obj2 = c57a2.A03;
                            synchronized (obj2) {
                                synchronized (obj2) {
                                    z = c57a2.A02;
                                }
                            }
                            if (!z) {
                                List list = c57a2.A00;
                                c57a2.A00 = c57a2.A01;
                                c57a2.A01 = list;
                                c57a2.A02 = true;
                                int size = list.size();
                                for (int i = 0; i < size; i++) {
                                    ((InterfaceC23621Ds) list.get(i)).resumeWith(C0eB.A00);
                                }
                                list.clear();
                            }
                        }
                        Recomposer recomposer3 = recomposer;
                        synchronized (recomposer3.A0D) {
                            if (recomposer3.A07) {
                                recomposer3.A07 = false;
                                interfaceC24901Jp = Recomposer.A01(recomposer3);
                            } else {
                                interfaceC24901Jp = null;
                            }
                        }
                        if (interfaceC24901Jp == null) {
                            return;
                        }
                        interfaceC24901Jp.resumeWith(C0eB.A00);
                        return;
                    }
                    C19L c19l = A02;
                    Integer num = C05F.A0N;
                    C15370ps c15370ps = obj;
                    AbstractC23641Du.A03(num, AnonymousClass191.A00, new C9DU(view, recomposer, this, c07x, null, c15370ps), c19l);
                }
            });
            return recomposer;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ViewTreeLifecycleOwner not found from ");
        sb.append(view);
        AbstractC28290Cdc.A02(sb.toString());
        throw C00O.createAndThrow();
    }

    public static final C57I A00(View view) {
        C57I A01 = A01(view);
        if (A01 == null) {
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                A01 = A01((View) parent);
                parent = parent.getParent();
                if (A01 != null) {
                    break;
                }
            }
        }
        return A01;
    }

    public static final C57I A01(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof C57I) {
            return (C57I) tag;
        }
        return null;
    }

    public static final Recomposer A02(View view) {
        if (!view.isAttachedToWindow()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot locate windowRecomposer; View ");
            sb.append(view);
            sb.append(" is not attached to a window");
            AbstractC28290Cdc.A01(sb.toString());
            throw C00O.createAndThrow();
        }
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                break;
            }
            parent = view2.getParent();
            view = view2;
        }
        C57I A01 = A01(view);
        if (A01 == null) {
            Recomposer A03 = A03(view, null, AnonymousClass191.A00);
            view.setTag(R.id.androidx_compose_ui_view_composition_context, A03);
            C2SW c2sw = C2SW.A00;
            Handler handler = view.getHandler();
            Choreographer choreographer = AnonymousClass134.choreographer;
            final C23671Dx A032 = AbstractC23641Du.A03(C05F.A00, new AnonymousClass135(handler, "windowRecomposer cleanup", false).A01, new D52(view, A03, (InterfaceC23621Ds) null, 21), c2sw);
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.5TS
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view3) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view3) {
                    view3.removeOnAttachStateChangeListener(this);
                    AnonymousClass195.this.AGH(null);
                }
            });
            return A03;
        }
        if (A01 instanceof Recomposer) {
            return (Recomposer) A01;
        }
        throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
    }
}
