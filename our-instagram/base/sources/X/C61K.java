package X;

import com.facebook.simplejni.fataljavaexceptiondescriptionhandler.breakpad.BreakpadFatalJavaExceptionDescriptionHandler;

/* renamed from: X.61K, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C61K implements Runnable {
    public static final C61K A00 = new C61K();

    @Override // java.lang.Runnable
    public final void run() {
        BreakpadFatalJavaExceptionDescriptionHandler.registerBreakpadFatalJavaExceptionDescriptionHandler();
    }
}
