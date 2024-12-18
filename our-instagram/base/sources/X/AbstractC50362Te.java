package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.LongSparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.TypedValue;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2Te, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC50362Te extends LongSparseArray {
    public static int[] A02;
    public static final CountDownLatch A03 = new CountDownLatch(1);
    public static final AtomicBoolean A04 = new AtomicBoolean(false);
    public static volatile C50422Tl A05;
    public static volatile boolean A06;
    public LongSparseArray A00;
    public final Resources A01;

    @Override // android.util.LongSparseArray
    public final /* bridge */ /* synthetic */ Object get(long j) {
        Drawable.ConstantState constantState;
        Drawable drawable;
        Context context;
        Object obj = super.get(j);
        if (obj == null) {
            if (!A06) {
                try {
                    A03.await();
                } catch (InterruptedException unused) {
                }
            }
            C50422Tl c50422Tl = A05;
            Resources resources = this.A01;
            if (C20150ym.A07(AbstractC20070ye.A00(18313280988723998L)) && (context = (Context) AbstractC54852fj.A00()) != null) {
                resources = context.getResources();
            }
            long[] jArr = C50422Tl.A07;
            synchronized (jArr) {
                int i = C50422Tl.A06;
                jArr[i] = j;
                C50422Tl.A06 = (i + 1) % 25;
            }
            boolean z = false;
            if (((int) (j >> 32)) == c50422Tl.A00) {
                z = true;
            }
            obj = null;
            if (z) {
                int i2 = (int) j;
                C2U0 c2u0 = c50422Tl.A05;
                if (c2u0 != null) {
                    int i3 = c2u0.A00.get(i2, 0);
                    if (i3 != 0 && (drawable = resources.getDrawable(i3, null)) != null) {
                        constantState = drawable.getConstantState();
                    } else {
                        constantState = null;
                    }
                    if (constantState != null) {
                        return constantState;
                    }
                }
                C5G8 c5g8 = c50422Tl.A04;
                if (c5g8 != null) {
                    int A00 = C50422Tl.A00(resources, Boolean.valueOf(c50422Tl.A03));
                    synchronized (c5g8) {
                        SparseBooleanArray sparseBooleanArray = c5g8.A00;
                        if (!sparseBooleanArray.get(A00)) {
                            TypedValue typedValue = new TypedValue();
                            SparseIntArray sparseIntArray = new SparseIntArray();
                            boolean z2 = true;
                            while (true) {
                                SparseIntArray sparseIntArray2 = c50422Tl.A02;
                                int size = sparseIntArray2.size();
                                for (int i4 = 0; i4 < size; i4++) {
                                    sparseIntArray.append(sparseIntArray2.keyAt(i4), sparseIntArray2.valueAt(i4));
                                }
                                if (z2) {
                                    for (int i5 : c5g8.A01) {
                                        if (C50422Tl.A02(resources, typedValue, i5)) {
                                            sparseIntArray.put(typedValue.data, i5);
                                        }
                                    }
                                }
                                synchronized (c5g8) {
                                    if (sparseIntArray2 == c50422Tl.A02) {
                                        c50422Tl.A02 = sparseIntArray;
                                        sparseBooleanArray.put(A00, true);
                                        break;
                                    }
                                    if (sparseBooleanArray.get(A00)) {
                                        break;
                                    }
                                }
                                z2 = false;
                            }
                        }
                    }
                }
                int i6 = c50422Tl.A02.get(i2);
                if (i6 != 0) {
                    return AbstractC56412ia.A01(resources, i6).second;
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0nk, X.2Tj] */
    public AbstractC50362Te(Resources resources, LongSparseArray longSparseArray) {
        int[] iArr;
        this.A00 = longSparseArray;
        this.A01 = resources;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            append(longSparseArray.keyAt(i), longSparseArray.valueAt(i));
        }
        try {
            try {
                Field declaredField = Class.forName("com.facebook.R").getDeclaredField("custom_drawables");
                declaredField.setAccessible(true);
                iArr = (int[]) declaredField.get(null);
                Arrays.sort(iArr);
            } catch (Exception unused) {
                iArr = null;
            }
            A02 = iArr;
        } catch (Exception unused2) {
            A02 = null;
        }
        if (A04.compareAndSet(false, true)) {
            InterfaceC14020nS A00 = C14120nc.A00();
            Resources resources2 = this.A01;
            int[] iArr2 = A02;
            int A01 = (int) C20150ym.A01(AbstractC20070ye.A00(18594755965556592L));
            int i2 = 1;
            if (A01 != 1) {
                i2 = 3;
                if (A01 != 3) {
                    i2 = 4;
                    if (A01 != 4) {
                        i2 = 5;
                        if (A01 != 5) {
                            i2 = 2;
                        }
                    }
                }
            }
            ?? abstractRunnableC14200nk = new AbstractRunnableC14200nk(186, i2, false, true);
            abstractRunnableC14200nk.A00 = resources2;
            abstractRunnableC14200nk.A01 = iArr2;
            A00.ATO(abstractRunnableC14200nk);
        }
    }
}
