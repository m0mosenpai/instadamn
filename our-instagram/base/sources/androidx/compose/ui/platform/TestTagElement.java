package androidx.compose.ui.platform;

import X.C14360o3;
import X.C58N;

/* loaded from: classes3.dex */
public final class TestTagElement extends C58N {
    public final String A00;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TestTagElement)) {
            return false;
        }
        return C14360o3.A0K(this.A00, ((TestTagElement) obj).A00);
    }

    @Override // X.C58N
    public final int hashCode() {
        return this.A00.hashCode();
    }

    public TestTagElement(String str) {
        this.A00 = str;
    }
}
