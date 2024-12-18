package X;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.5R8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5R8 extends C0T6 {
    public int A00;
    public int A01;
    public final java.util.Set A02;

    public /* synthetic */ C5R8(java.util.Set set, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, int i3) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.A01 = 0;
        this.A00 = 0;
        this.A02 = linkedHashSet;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5R8) {
                C5R8 c5r8 = (C5R8) obj;
                if (this.A01 != c5r8.A01 || this.A00 != c5r8.A00 || !C14360o3.A0K(this.A02, c5r8.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A01 * 31) + this.A00) * 31) + this.A02.hashCode();
    }

    public C5R8() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.A01 = 0;
        this.A00 = 0;
        this.A02 = linkedHashSet;
    }
}
