package X;

import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.0uK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17820uK extends C04T {
    public final WindowInsetsAnimation A00;

    public C17820uK(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.A00 = windowInsetsAnimation;
    }

    public static WindowInsetsAnimation.Bounds A00(C04M c04m) {
        return new WindowInsetsAnimation.Bounds(c04m.A00.A03(), c04m.A01.A03());
    }

    public static void A03(View view, final C04N c04n) {
        WindowInsetsAnimation.Callback callback;
        if (c04n != null) {
            callback = new WindowInsetsAnimation.Callback(c04n) { // from class: X.04S
                public ArrayList A00;
                public List A01;
                public final HashMap A02;
                public final C04N A03;

                {
                    super(c04n.A01);
                    this.A02 = new HashMap();
                    this.A03 = c04n;
                }

                @Override // android.view.WindowInsetsAnimation.Callback
                public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                    C04N c04n2 = this.A03;
                    HashMap hashMap = this.A02;
                    C04U c04u = (C04U) hashMap.get(windowInsetsAnimation);
                    if (c04u == null) {
                        c04u = C04U.A00(windowInsetsAnimation);
                        hashMap.put(windowInsetsAnimation, c04u);
                    }
                    c04n2.A04(c04u);
                    hashMap.remove(windowInsetsAnimation);
                }

                @Override // android.view.WindowInsetsAnimation.Callback
                public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                    C04N c04n2 = this.A03;
                    HashMap hashMap = this.A02;
                    C04U c04u = (C04U) hashMap.get(windowInsetsAnimation);
                    if (c04u == null) {
                        c04u = C04U.A00(windowInsetsAnimation);
                        hashMap.put(windowInsetsAnimation, c04u);
                    }
                    c04n2.A03(c04u);
                }

                @Override // android.view.WindowInsetsAnimation.Callback
                public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
                    ArrayList arrayList = this.A00;
                    if (arrayList == null) {
                        ArrayList arrayList2 = new ArrayList(list.size());
                        this.A00 = arrayList2;
                        this.A01 = Collections.unmodifiableList(arrayList2);
                    } else {
                        arrayList.clear();
                    }
                    int size = list.size();
                    while (true) {
                        size--;
                        if (size >= 0) {
                            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
                            HashMap hashMap = this.A02;
                            C04U c04u = (C04U) hashMap.get(windowInsetsAnimation);
                            if (c04u == null) {
                                c04u = C04U.A00(windowInsetsAnimation);
                                hashMap.put(windowInsetsAnimation, c04u);
                            }
                            c04u.A00.A08(windowInsetsAnimation.getFraction());
                            this.A00.add(c04u);
                        } else {
                            C04N c04n2 = this.A03;
                            C011504d c011504d = C011504d.A01;
                            windowInsets.getClass();
                            return c04n2.A02(new C011504d(windowInsets), this.A01).A04();
                        }
                    }
                }

                @Override // android.view.WindowInsetsAnimation.Callback
                public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                    C04N c04n2 = this.A03;
                    HashMap hashMap = this.A02;
                    C04U c04u = (C04U) hashMap.get(windowInsetsAnimation);
                    if (c04u == null) {
                        c04u = C04U.A00(windowInsetsAnimation);
                        hashMap.put(windowInsetsAnimation, c04u);
                    }
                    C04M A00 = C04M.A00(bounds);
                    c04n2.A01(A00, c04u);
                    return A00.A01();
                }
            };
        } else {
            callback = null;
        }
        view.setWindowInsetsAnimationCallback(callback);
    }

    @Override // X.C04T
    public final float A05() {
        return this.A00.getInterpolatedFraction();
    }

    @Override // X.C04T
    public final int A06() {
        return this.A00.getTypeMask();
    }

    @Override // X.C04T
    public final long A07() {
        return this.A00.getDurationMillis();
    }

    @Override // X.C04T
    public final void A08(float f) {
        this.A00.setFraction(f);
    }

    public static C02I A01(WindowInsetsAnimation.Bounds bounds) {
        return C02I.A01(bounds.getUpperBound());
    }

    public static C02I A02(WindowInsetsAnimation.Bounds bounds) {
        return C02I.A01(bounds.getLowerBound());
    }

    public C17820uK(int i, Interpolator interpolator, long j) {
        this(new WindowInsetsAnimation(i, interpolator, j));
    }
}
