package X;

import com.instagram.common.gallery.metadata.MediaUploadMetadata;

/* renamed from: X.7Q4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7Q4 {
    public MediaUploadMetadata A00;
    public EnumC40111tc A01;
    public C47Z A02;
    public Float A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;

    public C7Q4(MediaUploadMetadata mediaUploadMetadata, EnumC40111tc enumC40111tc, Float f, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        C14360o3.A0B(mediaUploadMetadata, 10);
        this.A01 = enumC40111tc;
        this.A04 = str;
        this.A05 = str2;
        this.A07 = str3;
        this.A09 = str4;
        this.A08 = str5;
        this.A03 = f;
        this.A02 = null;
        this.A06 = str6;
        this.A00 = mediaUploadMetadata;
        this.A0A = z;
        this.A0B = z2;
    }

    public static final void A00(C7Q4 c7q4) {
        if (c7q4.A06 != null) {
            if (c7q4.A05() && c7q4.A09 == null) {
                C0w9.A04("DirectPendingMedia_isVideoAndVideoPathIsNull", "videoPath is expected to be non-null when isVideo=true", 1);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final float A01() {
        Float f = this.A03;
        if (f != null) {
            return f.floatValue();
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final boolean A05() {
        if (this.A01 != EnumC40111tc.A0a) {
            return false;
        }
        return true;
    }

    public final String A02() {
        String str;
        if (A05()) {
            str = this.A09;
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            str = this.A07;
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return str;
    }

    public final String A03() {
        if (!A05()) {
            String str = this.A07;
            if (str != null) {
                return str;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Check failed.");
    }

    public final String A04() {
        if (A05()) {
            String str = this.A09;
            if (str != null) {
                return str;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Check failed.");
    }

    public C7Q4() {
        this(new MediaUploadMetadata(null, null, null, null, null, null, null, null, null, null, null, false), null, null, null, null, null, null, null, null, false, false);
    }
}
