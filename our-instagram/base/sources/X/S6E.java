package X;

import android.webkit.ConsoleMessage;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class S6E {
    public static final /* synthetic */ int[] A00;

    static {
        int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
        A00 = iArr;
        try {
            MSY.A1I(ConsoleMessage.MessageLevel.LOG, iArr);
        } catch (NoSuchFieldError unused) {
        }
    }
}
