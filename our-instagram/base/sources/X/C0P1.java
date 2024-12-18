package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.0P1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0P1 extends AbstractC001600g {
    public final AbstractC001600g A00;
    public final C07980bI A01;

    @Override // X.AbstractC001600g
    public final Intent A00(Context context, Object obj) {
        Intent A00 = this.A00.A00(context, obj);
        C07980bI c07980bI = this.A01;
        C08020bN A07 = c07980bI.A07(context, A00);
        Intent A002 = C07980bI.A00(context, A00, c07980bI);
        if (A002 == null) {
            throw new SecurityException("Unable to launch intent in the selected scope");
        }
        if (C0P5.A01(context, A00)) {
            c07980bI.A01.A01.EH9("Warning: launching intent with a non-Activity Context requires FLAG_ACTIVITY_NEW_TASK, or the Android Runtime will throw a AndroidRuntimeException. Adding the flag to prevent a crash. This might lead to unexpected behavior with the back button. Please pass in an Activity Context.");
        }
        c07980bI.A0E(context, A00, A002, A07);
        return A002;
    }

    @Override // X.AbstractC001600g
    public final Object A02(Intent intent, int i) {
        return this.A00.A02(intent, i);
    }

    public C0P1(AbstractC001600g abstractC001600g, C07980bI c07980bI) {
        this.A01 = c07980bI;
        this.A00 = abstractC001600g;
    }
}
