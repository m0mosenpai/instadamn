package X;

import android.content.Context;
import com.instagram.common.gallery.Medium;
import java.util.Map;

/* renamed from: X.8Yp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C188998Yp {
    public final Context A00;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, X.8jo] */
    public static final void A00(Medium medium, Map map) {
        C14360o3.A0B(medium, 0);
        C14360o3.A0B(map, 1);
        if (!map.containsKey(String.valueOf(medium.A05))) {
            return;
        }
        Object obj = map.get(String.valueOf(medium.A05));
        if (obj != null) {
            C189328a9 c189328a9 = (C189328a9) obj;
            medium.A0T = c189328a9.A0K;
            medium.A0V = c189328a9.A0M;
            medium.A0L = c189328a9.A0I;
            medium.A0Z = c189328a9.A0N;
            medium.A0R = c189328a9.A0J;
            int i = medium.A03;
            medium.A0A = 0;
            medium.A09 = i;
            ?? obj2 = new Object();
            Float f = c189328a9.A08;
            if (f != null) {
                obj2.A06 = f.floatValue();
                Float f2 = c189328a9.A0F;
                if (f2 != null) {
                    obj2.A0A = f2.floatValue();
                    Float f3 = c189328a9.A0A;
                    if (f3 != null) {
                        obj2.A08 = f3.floatValue();
                        Float f4 = c189328a9.A0B;
                        if (f4 != null) {
                            obj2.A09 = f4.floatValue();
                            Float f5 = c189328a9.A05;
                            if (f5 != null) {
                                obj2.A04 = f5.floatValue();
                                Float f6 = c189328a9.A07;
                                if (f6 != null) {
                                    obj2.A05 = f6.floatValue();
                                    if (c189328a9.A06 != null) {
                                        Float f7 = c189328a9.A01;
                                        if (f7 != null) {
                                            obj2.A00 = f7.floatValue();
                                            Float f8 = c189328a9.A02;
                                            if (f8 != null) {
                                                obj2.A01 = f8.floatValue();
                                                if (c189328a9.A0C != null) {
                                                    if (c189328a9.A0D != null) {
                                                        if (c189328a9.A0E != null) {
                                                            Float f9 = c189328a9.A09;
                                                            if (f9 != null) {
                                                                obj2.A07 = f9.floatValue();
                                                                if (c189328a9.A0G != null) {
                                                                    Float f10 = c189328a9.A04;
                                                                    if (f10 != null) {
                                                                        obj2.A03 = f10.floatValue();
                                                                        Float f11 = c189328a9.A03;
                                                                        if (f11 != null) {
                                                                            obj2.A02 = f11.floatValue();
                                                                            medium.A0F = obj2;
                                                                            return;
                                                                        }
                                                                        throw new IllegalStateException("Required value was null.");
                                                                    }
                                                                    throw new IllegalStateException("Required value was null.");
                                                                }
                                                                throw new IllegalStateException("Required value was null.");
                                                            }
                                                            throw new IllegalStateException("Required value was null.");
                                                        }
                                                        throw new IllegalStateException("Required value was null.");
                                                    }
                                                    throw new IllegalStateException("Required value was null.");
                                                }
                                                throw new IllegalStateException("Required value was null.");
                                            }
                                            throw new IllegalStateException("Required value was null.");
                                        }
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                    throw new IllegalStateException("Required value was null.");
                                }
                                throw new IllegalStateException("Required value was null.");
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C188998Yp(Context context) {
        this.A00 = context;
    }
}
