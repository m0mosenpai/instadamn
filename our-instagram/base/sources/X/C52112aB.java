package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import com.facebook.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: X.2aB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52112aB {
    public static C52112aB A05;
    public static final PorterDuff.Mode A06 = PorterDuff.Mode.SRC_IN;
    public static final C52132aD A07 = new C003701c(6);
    public TypedValue A00;
    public InterfaceC52172aH A01;
    public WeakHashMap A02;
    public boolean A03;
    public final WeakHashMap A04 = new WeakHashMap(0);

    /* JADX WARN: Removed duplicated region for block: B:18:0x0107 A[Catch: all -> 0x017d, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:7:0x000e, B:9:0x0016, B:11:0x001a, B:16:0x00ff, B:18:0x0107, B:20:0x010b, B:21:0x0112, B:23:0x011a, B:24:0x0124, B:26:0x0128, B:28:0x0130, B:29:0x0134, B:31:0x0138, B:33:0x013d, B:34:0x0140, B:36:0x0147, B:37:0x014c, B:39:0x0152, B:43:0x0159, B:46:0x016f, B:49:0x0030, B:51:0x0041, B:53:0x0047, B:54:0x0066, B:55:0x006f, B:59:0x00a7, B:60:0x00ab, B:71:0x00ba, B:73:0x00c0, B:77:0x00c4, B:75:0x00cc, B:79:0x00cf, B:81:0x00d5, B:83:0x00da, B:88:0x00e1, B:90:0x00e7, B:92:0x00ec), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized android.content.res.ColorStateList A04(android.content.Context r9, int r10) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52112aB.A04(android.content.Context, int):android.content.res.ColorStateList");
    }

    public final synchronized Drawable A05(Context context, int i) {
        return A06(context, i, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v12, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r5v7 */
    public final synchronized Drawable A06(Context context, int i, boolean z) {
        ?? r5;
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        WeakReference weakReference;
        if (!this.A03) {
            this.A03 = true;
            Drawable A052 = A05(context, R.drawable.abc_vector_test);
            if (A052 == null || (!(A052 instanceof C55862hS) && !"android.graphics.drawable.VectorDrawable".equals(A052.getClass().getName()))) {
                this.A03 = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
        TypedValue typedValue = this.A00;
        if (typedValue == null) {
            typedValue = new TypedValue();
            this.A00 = typedValue;
        }
        context.getResources().getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        try {
            WeakHashMap weakHashMap = this.A04;
            C003501a c003501a = (C003501a) weakHashMap.get(context);
            r5 = 0;
            r5 = 0;
            r5 = 0;
            if (c003501a != null && (weakReference = (WeakReference) c003501a.A05(j)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    r5 = constantState.newDrawable(context.getResources());
                } else {
                    c003501a.A08(j);
                }
            }
            if (r5 == 0) {
                if (this.A01 != null) {
                    if (i == R.drawable.abc_cab_background_top_material) {
                        r5 = new LayerDrawable(new Drawable[]{A05(context, R.drawable.abc_cab_background_internal_bg), A05(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
                    } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
                        Drawable A053 = A05(context, R.drawable.abc_star_black_48dp);
                        Drawable A054 = A05(context, R.drawable.abc_star_half_black_48dp);
                        if ((A053 instanceof BitmapDrawable) && A053.getIntrinsicWidth() == dimensionPixelSize && A053.getIntrinsicHeight() == dimensionPixelSize) {
                            bitmapDrawable = (BitmapDrawable) A053;
                            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
                        } else {
                            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            A053.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                            A053.draw(canvas);
                            bitmapDrawable = new BitmapDrawable(createBitmap);
                            bitmapDrawable2 = new BitmapDrawable(createBitmap);
                        }
                        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
                        if (!(A054 instanceof BitmapDrawable) || A054.getIntrinsicWidth() != dimensionPixelSize || A054.getIntrinsicHeight() != dimensionPixelSize) {
                            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                            Canvas canvas2 = new Canvas(createBitmap2);
                            A054.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                            A054.draw(canvas2);
                            A054 = new BitmapDrawable(createBitmap2);
                        }
                        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, A054, bitmapDrawable2});
                        layerDrawable.setId(0, android.R.id.background);
                        layerDrawable.setId(1, android.R.id.secondaryProgress);
                        layerDrawable.setId(2, android.R.id.progress);
                        r5 = layerDrawable;
                    } else {
                        r5 = 0;
                    }
                    if (r5 != 0) {
                        r5.setChangingConfigurations(typedValue.changingConfigurations);
                        Drawable.ConstantState constantState2 = r5.getConstantState();
                        if (constantState2 != null) {
                            C003501a c003501a2 = (C003501a) weakHashMap.get(context);
                            if (c003501a2 == null) {
                                c003501a2 = new C003501a();
                                weakHashMap.put(context, c003501a2);
                            }
                            c003501a2.A09(j, new WeakReference(constantState2));
                        }
                    }
                } else {
                    r5 = 0;
                }
            }
            if (r5 == 0) {
                r5 = context.getDrawable(i);
            }
            if (r5 != 0) {
                r5 = A01(context, r5, this, i, z);
            }
            if (r5 != 0) {
                AbstractC55852hR.A02(r5);
            }
        } catch (Throwable th) {
            throw th;
        }
        return r5;
    }

    public static synchronized PorterDuffColorFilter A00(PorterDuff.Mode mode, int i) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (C52112aB.class) {
            C52132aD c52132aD = A07;
            int i2 = (i + 31) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) c52132aD.A02(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                c52132aD.A05(Integer.valueOf(i2 + mode.hashCode()), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public static synchronized C52112aB A02() {
        C52112aB c52112aB;
        synchronized (C52112aB.class) {
            c52112aB = A05;
            if (c52112aB == null) {
                c52112aB = new C52112aB();
                A05 = c52112aB;
            }
        }
        return c52112aB;
    }

    public final boolean A07(Context context, Drawable drawable, int i) {
        int round;
        InterfaceC52172aH interfaceC52172aH = this.A01;
        if (interfaceC52172aH != null) {
            C52162aG c52162aG = (C52162aG) interfaceC52172aH;
            PorterDuff.Mode mode = C52102aA.A02;
            int[] iArr = c52162aG.A02;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (iArr[i2] == i) {
                    z = true;
                    break;
                }
                i2++;
                if (i2 >= 3) {
                    break;
                }
            }
            int i3 = android.R.attr.colorBackground;
            if (z) {
                i3 = R.attr.colorControlNormal;
            } else {
                int[] iArr2 = c52162aG.A01;
                int i4 = 0;
                while (true) {
                    if (iArr2[i4] == i) {
                        i3 = R.attr.colorControlActivated;
                        break;
                    }
                    i4++;
                    if (i4 >= 7) {
                        int[] iArr3 = c52162aG.A00;
                        int i5 = 0;
                        while (true) {
                            if (iArr3[i5] == i) {
                                mode = PorterDuff.Mode.MULTIPLY;
                                break;
                            }
                            i5++;
                            if (i5 >= 3) {
                                if (i == R.drawable.abc_list_divider_mtrl_alpha) {
                                    i3 = android.R.attr.colorForeground;
                                    round = Math.round(40.8f);
                                } else if (i != R.drawable.abc_dialog_material_background) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            round = -1;
            Drawable mutate = drawable.mutate();
            mutate.setColorFilter(C52102aA.A00(mode, C3WR.A01(context, i3)));
            if (round != -1) {
                mutate.setAlpha(round);
                return true;
            }
            return true;
        }
        return false;
    }

    public static Drawable A01(Context context, Drawable drawable, C52112aB c52112aB, int i, boolean z) {
        PorterDuff.Mode mode;
        int i2;
        Drawable findDrawableByLayerId;
        ColorStateList A04 = c52112aB.A04(context, i);
        if (A04 != null) {
            drawable = drawable.mutate();
            drawable.setTintList(A04);
            if (c52112aB.A01 != null && i == R.drawable.abc_switch_thumb_material) {
                drawable.setTintMode(PorterDuff.Mode.MULTIPLY);
            }
        } else {
            if (c52112aB.A01 != null) {
                if (i == R.drawable.abc_seekbar_track_material) {
                    LayerDrawable layerDrawable = (LayerDrawable) drawable;
                    Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(android.R.id.background);
                    int A01 = C3WR.A01(context, R.attr.colorControlNormal);
                    mode = C52102aA.A02;
                    findDrawableByLayerId2.mutate().setColorFilter(C52102aA.A00(mode, A01));
                    layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress).mutate().setColorFilter(C52102aA.A00(mode, C3WR.A01(context, R.attr.colorControlNormal)));
                    findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.progress);
                    i2 = R.attr.colorControlActivated;
                } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                    LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                    Drawable findDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                    int A00 = C3WR.A00(context, R.attr.colorControlNormal);
                    mode = C52102aA.A02;
                    findDrawableByLayerId3.mutate().setColorFilter(C52102aA.A00(mode, A00));
                    Drawable findDrawableByLayerId4 = layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress);
                    i2 = R.attr.colorControlActivated;
                    findDrawableByLayerId4.mutate().setColorFilter(C52102aA.A00(mode, C3WR.A01(context, R.attr.colorControlActivated)));
                    findDrawableByLayerId = layerDrawable2.findDrawableByLayerId(android.R.id.progress);
                }
                findDrawableByLayerId.mutate().setColorFilter(C52102aA.A00(mode, C3WR.A01(context, i2)));
                return drawable;
            }
            if (!c52112aB.A07(context, drawable, i) && z) {
                return null;
            }
        }
        return drawable;
    }

    public static void A03(Drawable drawable, C69182VjB c69182VjB, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuffColorFilter porterDuffColorFilter;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            if (!c69182VjB.A02) {
                if (c69182VjB.A03) {
                    colorStateList = null;
                } else {
                    drawable.clearColorFilter();
                    return;
                }
            } else {
                colorStateList = c69182VjB.A00;
            }
            if (c69182VjB.A03) {
                mode = c69182VjB.A01;
            } else {
                mode = A06;
            }
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = A00(mode, colorStateList.getColorForState(iArr, 0));
            } else {
                porterDuffColorFilter = null;
            }
            drawable.setColorFilter(porterDuffColorFilter);
        }
    }
}
