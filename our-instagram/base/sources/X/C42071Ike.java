package X;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: X.Ike, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42071Ike implements TextView.OnEditorActionListener {
    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            AbstractC13880nE.A0O(textView);
            return true;
        }
        return false;
    }
}
