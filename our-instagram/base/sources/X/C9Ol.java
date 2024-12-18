package X;

import android.os.Bundle;

/* renamed from: X.9Ol, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9Ol implements C05O {
    public final /* synthetic */ C7GH A00;

    public C9Ol(C7GH c7gh) {
        this.A00 = c7gh;
    }

    @Override // X.C05O
    public final boolean D6Q(Bundle bundle, C05R c05r, int i) {
        C14360o3.A0B(c05r, 0);
        if ((i & 1) != 0) {
            try {
                ((C14550oT) c05r.A00).A00.requestPermission();
            } catch (RuntimeException e) {
                C0K8.A0F("InputConnectionHelper", "failed to acquire content connection permissions", e);
                return false;
            }
        }
        return this.A00.DdB(c05r);
    }
}
