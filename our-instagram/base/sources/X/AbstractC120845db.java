package X;

import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;

/* renamed from: X.5db, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC120845db {
    public static ViewStructure A00(View view, ContentCaptureSession contentCaptureSession) {
        return contentCaptureSession.newViewStructure(view);
    }

    public static ViewStructure A01(AutofillId autofillId, ContentCaptureSession contentCaptureSession, long j) {
        return contentCaptureSession.newVirtualViewStructure(autofillId, j);
    }

    public static AutofillId A02(AutofillId autofillId, ContentCaptureSession contentCaptureSession, long j) {
        return contentCaptureSession.newAutofillId(autofillId, j);
    }

    public static void A03(ViewStructure viewStructure, ContentCaptureSession contentCaptureSession) {
        contentCaptureSession.notifyViewAppeared(viewStructure);
    }

    public static void A04(AutofillId autofillId, ContentCaptureSession contentCaptureSession, CharSequence charSequence) {
        contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
    }

    public static void A05(AutofillId autofillId, ContentCaptureSession contentCaptureSession, long[] jArr) {
        contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
    }
}
