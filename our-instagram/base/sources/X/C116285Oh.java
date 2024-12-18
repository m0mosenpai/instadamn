package X;

import android.os.Process;
import java.lang.reflect.Method;

/* renamed from: X.5Oh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C116285Oh extends AbstractC04410Lh {
    public final /* synthetic */ C114425Ej A00;

    public C116285Oh(C114425Ej c114425Ej) {
        this.A00 = c114425Ej;
    }

    @Override // X.AbstractC04410Lh, X.C0HV
    public final C0HW Ajg(C0HX c0hx, String str, Method method, Object[] objArr) {
        if (!str.equals("media_session") || !method.getName().equals("dispatchVolumeKeyEvent") || Process.myPid() != Process.myTid()) {
            return null;
        }
        this.A00.A02.post(new RunnableC64697TQc(c0hx, this, method, objArr));
        return new C0HW(null);
    }
}
