package X;

import kotlin.Deprecated;

@Deprecated(message = "Please use Default or Private instead. This should only be used for Live during the XMA migration")
/* renamed from: X.KUi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45931KUi extends AbstractC1583778x {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C45931KUi) && this.A00 == ((C45931KUi) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public C45931KUi(int i) {
        this.A00 = i;
    }
}
