package X;

import android.content.ClipData;
import android.content.ClipboardManager;

/* renamed from: X.ExT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33865ExT {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        ClipData newPlainText = ClipData.newPlainText(null, AbstractC31177DnL.A0d(c6fw));
        Object A0X = AbstractC31171DnF.A0X(C6BQ.A09(c6fq).A00);
        C14360o3.A0C(A0X, AbstractC111324zv.A00(68));
        ((ClipboardManager) A0X).setPrimaryClip(newPlainText);
        return null;
    }
}
