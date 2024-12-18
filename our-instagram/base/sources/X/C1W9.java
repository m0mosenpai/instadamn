package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.1W9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1W9 implements C1WA {
    public final AbstractC27691Vx A00;
    public final C1WK A01;
    public final C1WD A02;

    /* JADX WARN: Multi-variable type inference failed */
    public C1W9() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1WK, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.1Vx, java.lang.Object] */
    public /* synthetic */ C1W9(AbstractC27691Vx abstractC27691Vx, C1WK c1wk, C1WD c1wd, DefaultConstructorMarker defaultConstructorMarker, int i) {
        ?? obj = new Object();
        C1WC c1wc = new C1WC(1);
        ?? obj2 = new Object();
        this.A00 = obj;
        this.A02 = c1wc;
        this.A01 = obj2;
    }

    @Override // X.C1WA
    public final Drawable AM6(Resources resources, C27771Wf c27771Wf, C3QA c3qa) {
        InterfaceC71992XEf interfaceC71992XEf;
        C68675VaB c68675VaB;
        Bitmap.Config config;
        Drawable c66308U8h;
        C14360o3.A0B(c3qa, 1);
        if (c3qa instanceof UON) {
            AnimatedFactoryV2Impl animatedFactoryV2Impl = new AnimatedFactoryV2Impl(this.A00, this.A02, this.A01, true, true, 30, 1000, null);
            C70430WVi c70430WVi = animatedFactoryV2Impl.A04;
            if (c70430WVi == null) {
                C1V7 c1v7 = new C1V7() { // from class: X.WUi
                    @Override // X.C1V7
                    public final Object get() {
                        return 2;
                    }
                };
                ExecutorService executorService = animatedFactoryV2Impl.A02;
                if (executorService == null) {
                    executorService = new C64919TZu(((C1WC) animatedFactoryV2Impl.A08).A00);
                }
                C1V7 c1v72 = new C1V7() { // from class: X.WUj
                    @Override // X.C1V7
                    public final Object get() {
                        return 3;
                    }
                };
                C1V7 c1v73 = C1VY.A00;
                C68674VaA c68674VaA = animatedFactoryV2Impl.A03;
                if (c68674VaA == null) {
                    c68674VaA = new C68674VaA(animatedFactoryV2Impl);
                    animatedFactoryV2Impl.A03 = c68674VaA;
                }
                C68674VaA c68674VaA2 = c68674VaA;
                c70430WVi = new C70430WVi(c1v7, c1v72, c1v73, new C70408WUl(true), new C70408WUl(true), new C70408WUl(Integer.valueOf(animatedFactoryV2Impl.A00)), new C70408WUl(Integer.valueOf(animatedFactoryV2Impl.A01)), RealtimeSinceBootClock.A00, c68674VaA2, animatedFactoryV2Impl.A06, animatedFactoryV2Impl.A07, executorService, C1W2.A00());
                animatedFactoryV2Impl.A04 = c70430WVi;
            }
            UOO uoo = (UOO) c3qa;
            synchronized (c3qa) {
                C68675VaB c68675VaB2 = uoo.A00;
                if (c68675VaB2 != null) {
                    interfaceC71992XEf = c68675VaB2.A00;
                } else {
                    interfaceC71992XEf = null;
                }
            }
            synchronized (c3qa) {
                c68675VaB = uoo.A00;
            }
            c68675VaB.getClass();
            if (interfaceC71992XEf != null) {
                config = interfaceC71992XEf.getAnimatedBitmapConfig();
            } else {
                config = null;
            }
            WVV A00 = C70430WVi.A00(config, c70430WVi, null, c68675VaB);
            if (((Boolean) c70430WVi.A02.get()).booleanValue()) {
                c66308U8h = new C66306U8e(A00);
            } else {
                c66308U8h = new C66308U8h(A00);
            }
            ((Animatable) c66308U8h).start();
            return c66308U8h;
        }
        if (!(c3qa instanceof UOQ)) {
            return null;
        }
        Matrix matrix = C162867Qx.A03;
        return new UMO(new AnonymousClass693(((UOQ) c3qa).A00));
    }
}
