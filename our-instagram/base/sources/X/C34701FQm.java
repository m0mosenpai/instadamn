package X;

import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.FQm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34701FQm {
    public final DirectShareTarget A00;

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C14360o3.A0K(cls2, cls)) {
            return false;
        }
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.audiencepicker.DirectShareTargetSourcePair");
        return C14360o3.A0K(this.A00, ((C34701FQm) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C34701FQm(DirectShareTarget directShareTarget) {
        this.A00 = directShareTarget;
    }
}
