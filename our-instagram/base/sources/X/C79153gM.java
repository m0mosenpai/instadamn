package X;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.3gM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79153gM {
    public static final void A00(View view, C2XI c2xi, int i) {
        switch (i) {
            case 1:
                view.setAlpha(((Number) c2xi.A00).floatValue());
                return;
            case 2:
                view.setTranslationX(((Number) c2xi.A00).floatValue());
                return;
            case 3:
                view.setTranslationY(((Number) c2xi.A00).floatValue());
                return;
            case 4:
                view.setTranslationZ(((Number) c2xi.A00).floatValue());
                return;
            case 5:
                view.setScaleX(((Number) c2xi.A00).floatValue());
                return;
            case 6:
                view.setScaleY(((Number) c2xi.A00).floatValue());
                return;
            case 7:
                view.setElevation(((Number) c2xi.A00).floatValue());
                return;
            case 8:
                view.setBackgroundColor(((Number) c2xi.A00).intValue());
                return;
            case 9:
                view.setRotation(((Number) c2xi.A00).floatValue());
                return;
            case 10:
                view.setRotationX(((Number) c2xi.A00).floatValue());
                return;
            case 11:
                view.setRotationY(((Number) c2xi.A00).floatValue());
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                view.setBackground((Drawable) c2xi.A00);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                int intValue = ((Number) c2xi.A00).intValue();
                C14360o3.A0B(view, 0);
                view.setForeground(new ColorDrawable(intValue));
                return;
            default:
                return;
        }
    }
}
