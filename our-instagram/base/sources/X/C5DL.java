package X;

import androidx.compose.ui.text.font.AsyncTypefaceCache;
import androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$special$$inlined$CoroutineExceptionHandler$1;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.5DL, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5DL {
    public static final CoroutineExceptionHandler A02 = new FontListFontFamilyTypefaceAdapter$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key);
    public C19L A00;
    public final AsyncTypefaceCache A01;

    public C5DL(AsyncTypefaceCache asyncTypefaceCache, C12W c12w) {
        this.A01 = asyncTypefaceCache;
        this.A00 = AnonymousClass194.A02(A02.plus(C5DN.A00).plus(c12w).plus(new AnonymousClass197((AnonymousClass195) c12w.get(AnonymousClass195.A00))));
    }

    public C5DL() {
        this(new AsyncTypefaceCache(), AnonymousClass191.A00);
    }
}
