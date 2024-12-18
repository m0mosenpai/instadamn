package X;

import android.os.Build;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import java.util.List;
import java.util.function.Consumer;

/* renamed from: X.Ch6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28456Ch6 {
    public static final C28456Ch6 A00 = new Object();

    public static final void A00(LongSparseArray longSparseArray, AndroidContentCaptureManager androidContentCaptureManager) {
        TranslationResponseValue value;
        CharSequence text;
        C121655fH c121655fH;
        C120895dg c120895dg;
        InterfaceC16660sJ interfaceC16660sJ;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i < longSparseArray.size()) {
                i++;
                long keyAt = longSparseArray.keyAt(i2);
                ViewTranslationResponse viewTranslationResponse = (ViewTranslationResponse) longSparseArray.get(keyAt);
                if (viewTranslationResponse != null && (value = viewTranslationResponse.getValue("android:text")) != null && (text = value.getText()) != null && (c121655fH = (C121655fH) androidContentCaptureManager.A06().A03((int) keyAt)) != null && (c120895dg = (C120895dg) C5B6.A00(c121655fH.A01.A05, AbstractC120875de.A0P)) != null && (interfaceC16660sJ = (InterfaceC16660sJ) c120895dg.A01) != null) {
                    String obj = text.toString();
                    C16930sl c16930sl = C16930sl.A00;
                    interfaceC16660sJ.invoke(new C5C8(c16930sl, c16930sl, obj));
                }
            } else {
                return;
            }
        }
    }

    public static final void A02(AndroidContentCaptureManager androidContentCaptureManager, Consumer consumer, long[] jArr) {
        String A002;
        for (long j : jArr) {
            C121655fH c121655fH = (C121655fH) androidContentCaptureManager.A06().A03((int) j);
            if (c121655fH != null) {
                C113525Ap c113525Ap = c121655fH.A01;
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(androidContentCaptureManager.A0D.getAutofillId(), c113525Ap.A02);
                List list = (List) C5B6.A00(c113525Ap.A05, AbstractC113545Ar.A0R);
                if (list != null && (A002 = AbstractC121615fC.A00("\n", list)) != null) {
                    C16930sl c16930sl = C16930sl.A00;
                    builder.setValue("android:text", TranslationRequestValue.forText(new C5C8(c16930sl, c16930sl, A002)));
                    consumer.accept(builder.build());
                }
            }
        }
    }

    public final void A03(final LongSparseArray longSparseArray, final AndroidContentCaptureManager androidContentCaptureManager) {
        if (Build.VERSION.SDK_INT >= 31) {
            if (C14360o3.A0K(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                A00(longSparseArray, androidContentCaptureManager);
            } else {
                androidContentCaptureManager.A0D.post(new Runnable() { // from class: X.D1S
                    @Override // java.lang.Runnable
                    public final void run() {
                        C28456Ch6.A00(longSparseArray, androidContentCaptureManager);
                    }
                });
            }
        }
    }
}
