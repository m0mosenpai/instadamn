package androidx.compose.ui.input.nestedscroll;

import X.C14360o3;
import X.C58N;
import X.C5E5;

/* loaded from: classes3.dex */
public final class NestedScrollElement extends C58N {
    public final C5E5 A00;
    public final NestedScrollDispatcher A01;

    @Override // X.C58N
    public final boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        if (!C14360o3.A0K(nestedScrollElement.A00, this.A00) || !C14360o3.A0K(nestedScrollElement.A01, this.A01)) {
            return false;
        }
        return true;
    }

    @Override // X.C58N
    public final int hashCode() {
        int i;
        int hashCode = this.A00.hashCode() * 31;
        NestedScrollDispatcher nestedScrollDispatcher = this.A01;
        if (nestedScrollDispatcher != null) {
            i = nestedScrollDispatcher.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public NestedScrollElement(C5E5 c5e5, NestedScrollDispatcher nestedScrollDispatcher) {
        this.A00 = c5e5;
        this.A01 = nestedScrollDispatcher;
    }
}
