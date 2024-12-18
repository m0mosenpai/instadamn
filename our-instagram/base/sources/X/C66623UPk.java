package X;

import com.facebook.odin.model.Feature$Companion;
import kotlinx.serialization.Serializable;

@Serializable(with = C71701WzA.class)
/* renamed from: X.UPk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66623UPk extends C0T6 {
    public static final Feature$Companion Companion = new Object();
    public final int A00;
    public final String A01;

    public C66623UPk(String str, int i) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66623UPk) {
                C66623UPk c66623UPk = (C66623UPk) obj;
                if (!C14360o3.A0K(this.A01, c66623UPk.A01) || this.A00 != c66623UPk.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00;
    }
}
