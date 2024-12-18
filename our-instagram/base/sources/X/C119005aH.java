package X;

import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;

/* renamed from: X.5aH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C119005aH {
    public final View A00;
    public final Object A01;

    public static C119005aH A00(View view, ContentCaptureSession contentCaptureSession) {
        return new C119005aH(view, contentCaptureSession);
    }

    public final AutofillId A01(long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC120845db.A02(this.A00.getAutofillId(), (ContentCaptureSession) this.A01, j);
        }
        return null;
    }

    public final C120855dc A02(AutofillId autofillId, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return new C120855dc(AbstractC120845db.A01(autofillId, (ContentCaptureSession) this.A01, j));
        }
        return null;
    }

    public final void A03(AutofillId autofillId, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC120845db.A04(autofillId, (ContentCaptureSession) this.A01, charSequence);
        }
    }

    public final void A04(List list) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            AbstractC121625fD.A00((ContentCaptureSession) this.A01, list);
            return;
        }
        if (i < 29) {
            return;
        }
        ContentCaptureSession contentCaptureSession = (ContentCaptureSession) this.A01;
        View view = this.A00;
        ViewStructure A00 = AbstractC120845db.A00(view, contentCaptureSession);
        A00.getExtras().putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
        AbstractC120845db.A03(A00, contentCaptureSession);
        for (int i2 = 0; i2 < list.size(); i2++) {
            AbstractC120845db.A03((ViewStructure) list.get(i2), contentCaptureSession);
        }
        ViewStructure A002 = AbstractC120845db.A00(view, contentCaptureSession);
        A002.getExtras().putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
        AbstractC120845db.A03(A002, contentCaptureSession);
    }

    public final void A05(long[] jArr) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            AbstractC120845db.A05(this.A00.getAutofillId(), (ContentCaptureSession) this.A01, jArr);
            return;
        }
        if (i < 29) {
            return;
        }
        ContentCaptureSession contentCaptureSession = (ContentCaptureSession) this.A01;
        View view = this.A00;
        ViewStructure A00 = AbstractC120845db.A00(view, contentCaptureSession);
        A00.getExtras().putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
        AbstractC120845db.A03(A00, contentCaptureSession);
        AbstractC120845db.A05(view.getAutofillId(), contentCaptureSession, jArr);
        ViewStructure A002 = AbstractC120845db.A00(view, contentCaptureSession);
        A002.getExtras().putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
        AbstractC120845db.A03(A002, contentCaptureSession);
    }

    public C119005aH(View view, ContentCaptureSession contentCaptureSession) {
        this.A01 = contentCaptureSession;
        this.A00 = view;
    }
}
