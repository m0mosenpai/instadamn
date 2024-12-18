package X;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* renamed from: X.05L, reason: invalid class name */
/* loaded from: classes.dex */
public final class C05L extends InputConnectionWrapper {
    public final /* synthetic */ C05O A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05L(InputConnection inputConnection, C05O c05o) {
        super(inputConnection, false);
        this.A00 = c05o;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        C05O c05o = this.A00;
        C05R c05r = null;
        if (inputContentInfo != null) {
            c05r = new C05R(new C14550oT(inputContentInfo));
        }
        if (c05o.D6Q(bundle, c05r, i)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
