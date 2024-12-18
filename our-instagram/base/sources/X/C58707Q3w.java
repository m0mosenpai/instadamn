package X;

import android.text.Editable;

/* renamed from: X.Q3w, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58707Q3w extends Editable.Factory {
    public static Class A00;
    public static final Object A01 = AbstractC58318PtA.A0b();
    public static volatile Editable.Factory A02;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = A00;
        if (cls != null) {
            return new C58709Q3y(charSequence, cls);
        }
        return super.newEditable(charSequence);
    }

    public C58707Q3w() {
        try {
            A00 = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, AbstractC58319PtB.A0g(this));
        } catch (Throwable unused) {
        }
    }
}
