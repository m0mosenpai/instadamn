package X;

import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

/* renamed from: X.Q4b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58711Q4b extends InputConnectionWrapper {
    public final TextView A00;

    public C58711Q4b(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        super(inputConnection, false);
        Bundle bundle;
        this.A00 = textView;
        C63218SfO A00 = C63218SfO.A00();
        if (A00.A01() == 1 && editorInfo != null && (bundle = editorInfo.extras) != null) {
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", AbstractC58323PtF.A07(A00.A02.A02.A02));
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        if (!C63272SgW.A01(this.A00.getEditableText(), this, i, i2, false) && !super.deleteSurroundingText(i, i2)) {
            return false;
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        if (C63272SgW.A01(this.A00.getEditableText(), this, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2)) {
            return true;
        }
        return false;
    }
}
