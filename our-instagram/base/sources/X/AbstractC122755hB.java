package X;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: X.5hB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC122755hB {
    public static final BoringLayout A01(BoringLayout.Metrics metrics, Layout.Alignment alignment, TextPaint textPaint, TextUtils.TruncateAt truncateAt, CharSequence charSequence, int i, int i2) {
        if (i >= 0) {
            if (i2 >= 0) {
                if (Build.VERSION.SDK_INT >= 33) {
                    return AbstractC122765hC.A01(metrics, alignment, textPaint, truncateAt, charSequence, i, i2);
                }
                return new BoringLayout(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics, false, truncateAt, i2);
            }
            throw new IllegalArgumentException("negative ellipsized width");
        }
        throw new IllegalArgumentException("negative width");
    }

    public static final BoringLayout.Metrics A00(TextDirectionHeuristic textDirectionHeuristic, TextPaint textPaint, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 33) {
            return AbstractC122765hC.A00(textDirectionHeuristic, textPaint, charSequence);
        }
        if (textDirectionHeuristic.isRtl(charSequence, 0, charSequence.length())) {
            return null;
        }
        return BoringLayout.isBoring(charSequence, textPaint, null);
    }

    public static final boolean A02(BoringLayout boringLayout) {
        if (Build.VERSION.SDK_INT >= 33) {
            return AbstractC122765hC.A02(boringLayout);
        }
        return false;
    }
}
