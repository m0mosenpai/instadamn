package com.instagram.creation.capture.assetpicker.cutout.viewmodel;

import X.AbstractC166997dE;
import X.AbstractC58002lE;
import X.C12U;
import X.C12W;
import X.C3E9;
import X.C8OP;
import X.LKV;
import android.content.Context;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import java.lang.ref.WeakReference;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes4.dex */
public final class CutoutStickerViewModel$uploadPhotoCutoutSticker$$inlined$CoroutineExceptionHandler$1 extends C12U implements CoroutineExceptionHandler {
    public final /* synthetic */ WeakReference $contextWeakReference$inlined;
    public final /* synthetic */ C8OP this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutoutStickerViewModel$uploadPhotoCutoutSticker$$inlined$CoroutineExceptionHandler$1(C3E9 c3e9, WeakReference weakReference, C8OP c8op) {
        super(c3e9);
        this.$contextWeakReference$inlined = weakReference;
        this.this$0 = c8op;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(C12W c12w, Throwable th) {
        Context context = (Context) this.$contextWeakReference$inlined.get();
        if (context != null) {
            LKV.A02(context, AbstractC166997dE.A0M(context), null, ((NineSixteenLayoutConfigImpl) AbstractC58002lE.A00(context, this.this$0.A0E)).A0G);
        }
    }
}
