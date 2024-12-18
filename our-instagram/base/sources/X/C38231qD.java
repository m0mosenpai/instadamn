package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.ImageInfo;

/* renamed from: X.1qD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38231qD extends C0T6 implements InterfaceC38251qF {
    public final long A00;
    public final ImageInfo A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public C38231qD(ImageInfo imageInfo, String str, String str2, String str3, long j) {
        C14360o3.A0B(str, 2);
        C14360o3.A0B(imageInfo, 3);
        C14360o3.A0B(str2, 4);
        this.A00 = j;
        this.A02 = str;
        this.A01 = imageInfo;
        this.A03 = str2;
        this.A04 = str3;
    }

    @Override // X.InterfaceC38251qF
    public final C38231qD EwQ() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38231qD) {
                C38231qD c38231qD = (C38231qD) obj;
                if (this.A00 != c38231qD.A00 || !C14360o3.A0K(this.A02, c38231qD.A02) || !C14360o3.A0K(this.A01, c38231qD.A01) || !C14360o3.A0K(this.A03, c38231qD.A03) || !C14360o3.A0K(this.A04, c38231qD.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC38251qF
    public final long B3D() {
        return this.A00;
    }

    @Override // X.InterfaceC38251qF
    public final ImageInfo BGx() {
        return this.A01;
    }

    @Override // X.InterfaceC38251qF
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMediaPreviewClientDict", AbstractC40066Hps.A00(this));
    }

    @Override // X.InterfaceC38251qF
    public final String getId() {
        return this.A02;
    }

    @Override // X.InterfaceC38251qF
    public final String getMediaType() {
        return this.A03;
    }

    @Override // X.InterfaceC38251qF
    public final String getPreview() {
        return this.A04;
    }

    public final int hashCode() {
        int hashCode;
        long j = this.A00;
        int hashCode2 = ((((((((int) (j ^ (j >>> 32))) * 31) + this.A02.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A03.hashCode()) * 31;
        String str = this.A04;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }
}
