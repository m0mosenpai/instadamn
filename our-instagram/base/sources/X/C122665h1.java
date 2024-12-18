package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;

/* renamed from: X.5h1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122665h1 {
    public final int A00;
    public final int A01;
    public final AbstractC119845bi A02;
    public final C5W5 A03;
    public final Object A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C122665h1) {
                C122665h1 c122665h1 = (C122665h1) obj;
                if (!C14360o3.A0K(this.A02, c122665h1.A02) || !C14360o3.A0K(this.A03, c122665h1.A03) || this.A00 != c122665h1.A00 || this.A01 != c122665h1.A01 || !C14360o3.A0K(this.A04, c122665h1.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        AbstractC119845bi abstractC119845bi = this.A02;
        int hashCode = (((((((abstractC119845bi == null ? 0 : abstractC119845bi.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A00) * 31) + this.A01) * 31;
        Object obj = this.A04;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("TypefaceRequest(fontFamily=");
        sb.append(this.A02);
        sb.append(", fontWeight=");
        sb.append(this.A03);
        sb.append(", fontStyle=");
        int i = this.A00;
        if (i == 0) {
            str = ReactProgressBarViewManager.DEFAULT_STYLE;
        } else if (i == 1) {
            str = "Italic";
        } else {
            str = "Invalid";
        }
        sb.append((Object) str);
        sb.append(", fontSynthesis=");
        int i2 = this.A01;
        if (i2 == 0) {
            str2 = "None";
        } else if (i2 == 1) {
            str2 = CameraRollManager.ASSET_TYPE_ALL;
        } else if (i2 == 2) {
            str2 = "Weight";
        } else if (i2 == 3) {
            str2 = "Style";
        } else {
            str2 = "Invalid";
        }
        sb.append((Object) str2);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.A04);
        sb.append(')');
        return sb.toString();
    }

    public C122665h1(AbstractC119845bi abstractC119845bi, C5W5 c5w5, Object obj, int i, int i2) {
        this.A02 = abstractC119845bi;
        this.A03 = c5w5;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = obj;
    }
}
