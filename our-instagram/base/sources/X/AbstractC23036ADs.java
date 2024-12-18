package X;

import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import java.util.List;

/* renamed from: X.ADs, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23036ADs {
    public static final C115525Km A00(C195868lW c195868lW, int i, int i2, int i3) {
        C14360o3.A0B(c195868lW, 0);
        return A01(c195868lW, c195868lW.A06(), i, i2, 0, i2, i3);
    }

    public static final C115525Km A01(C195868lW c195868lW, String str, int i, int i2, int i3, int i4, int i5) {
        int i6;
        if (AbstractC167007dF.A1O(i2)) {
            if (i3 >= 0 && i3 <= i2) {
                if (1 <= i4 && i4 <= i2 && i3 < i4) {
                    String str2 = c195868lW.A0k;
                    String str3 = c195868lW.A0h;
                    long j = c195868lW.A0M;
                    int i7 = c195868lW.A0K;
                    int i8 = c195868lW.A08;
                    Integer num = c195868lW.A0b;
                    if (num != null) {
                        i6 = num.intValue();
                    } else {
                        i6 = 3;
                    }
                    int i9 = c195868lW.A09;
                    String str4 = c195868lW.A0f;
                    int i10 = c195868lW.A01;
                    MediaUploadMetadata A02 = c195868lW.A02();
                    boolean z = c195868lW.A1L;
                    String str5 = c195868lW.A0r;
                    List list = c195868lW.A0w;
                    Boolean bool = c195868lW.A0Y;
                    if (bool == null) {
                        Medium medium = c195868lW.A0R;
                        if (medium != null) {
                            bool = medium.A0K;
                        } else {
                            bool = null;
                        }
                    }
                    return new C115525Km(A02, bool, str2, str2, str3, str4, str, str5, list, i7, i8, i6, i9, i10, i, i2, i3, i4, i5, j, z);
                }
                throw AbstractC166987dD.A12("Failed requirement.");
            }
            throw AbstractC166987dD.A12("Failed requirement.");
        }
        throw AbstractC166987dD.A12("Failed requirement.");
    }
}
