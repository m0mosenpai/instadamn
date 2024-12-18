package X;

import android.graphics.BitmapFactory;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.gallery.Medium;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* renamed from: X.9zN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226659zN {
    public static final void A00(BitmapFactory.Options options, Medium medium, Integer num, String str) {
        C0f5 AEp = C18950wb.A01.AEp("PhotoImportCallable_call", 817903989);
        String A03 = medium.A03();
        if (A03 == null) {
            A03 = "null";
        }
        AEp.ABW("mime_type", A03);
        AEp.ABU(IgReactMediaPickerNativeModule.WIDTH, options.outWidth);
        AEp.ABU(IgReactMediaPickerNativeModule.HEIGHT, options.outHeight);
        AEp.ABW(CacheBehaviorLogger.SOURCE, C9MY.A00(num));
        AEp.ABW("path", medium.A0X);
        AEp.ABX("file_exists", AbstractC166987dD.A11(medium.A0X).exists());
        AEp.ABW("error_name", str);
        AEp.report();
    }
}
