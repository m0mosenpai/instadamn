package X;

import android.graphics.Bitmap;
import com.instagram.api.schemas.CameraTool;

/* renamed from: X.CcU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28224CcU {
    public static final C28192Cbg A07 = new Object();
    public final Bitmap A00;
    public final C38687GzS A01;
    public final CameraTool A02;
    public final CRU A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C14360o3.A0K(cls2, cls)) {
            return false;
        }
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.creation.genai.magicmod.model.MagicModImageModel");
        return C14360o3.A0K(this.A04, ((C28224CcU) obj).A04);
    }

    public final int hashCode() {
        return this.A04.hashCode();
    }

    public C28224CcU(Bitmap bitmap, CameraTool cameraTool, CRU cru, String str, String str2, boolean z) {
        C38687GzS c38687GzS;
        this.A04 = str;
        this.A06 = z;
        this.A00 = bitmap;
        this.A05 = str2;
        this.A02 = cameraTool;
        this.A03 = cru;
        if (bitmap != null) {
            c38687GzS = new C38687GzS(bitmap, str);
        } else {
            c38687GzS = null;
        }
        this.A01 = c38687GzS;
    }
}
