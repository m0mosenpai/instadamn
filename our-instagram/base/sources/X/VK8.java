package X;

import android.text.TextUtils;

/* loaded from: classes11.dex */
public final class VK8 {
    public int A00;
    public int A01;
    public String A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof VK8)) {
            return false;
        }
        VK8 vk8 = (VK8) obj;
        if (this.A00 != vk8.A00 || this.A01 != vk8.A01 || !TextUtils.equals(this.A02, vk8.A02)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((527 + this.A00) * 31) + this.A01) * 31) + this.A02.hashCode();
    }
}
