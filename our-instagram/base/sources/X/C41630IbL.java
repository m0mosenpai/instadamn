package X;

import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;

/* renamed from: X.IbL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41630IbL {
    public ExtendedImageUrl A00;
    public final Object A01;
    public final InterfaceC16660sJ A02;

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof C41630IbL) && super.equals(obj) && C14360o3.A0K(this.A01, ((C41630IbL) obj).A01));
    }

    public C41630IbL(C38321qM c38321qM) {
        C38247Grq c38247Grq = new C38247Grq(c38321qM, 9);
        this.A01 = c38321qM;
        this.A02 = c38247Grq;
    }

    public final int hashCode() {
        Object obj = this.A01;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public C41630IbL(ImageInfo imageInfo) {
        C38247Grq c38247Grq = new C38247Grq(imageInfo, 8);
        this.A01 = imageInfo;
        this.A02 = c38247Grq;
    }
}
