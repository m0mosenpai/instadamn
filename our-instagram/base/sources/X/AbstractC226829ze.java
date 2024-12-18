package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.9ze, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226829ze {
    public static final String A00(C49602Pt c49602Pt, File file, String str) {
        try {
            String canonicalPath = file.getCanonicalPath();
            C14360o3.A07(canonicalPath);
            String canonicalPath2 = c49602Pt.A01().getCanonicalPath();
            C14360o3.A07(canonicalPath2);
            if (!canonicalPath.startsWith(canonicalPath2)) {
                File A03 = AMc.A03(c49602Pt, str, AMc.A04(file), "copy_for_drafts");
                if (file.length() < 157286400 && A03.getUsableSpace() - file.length() > 52428800) {
                    AbstractC07870b6.A01(file, A03);
                    return A03.getCanonicalPath();
                }
                AbstractC12120kG.A06("DraftUtils", AnonymousClass001.A0e("Unable to copy source video to drafts. File size (MB): ", "1048576", file.length()), null);
                return null;
            }
        } catch (IOException e) {
            AbstractC12120kG.A06("DraftUtils", "Unable to copy source video to drafts", e);
        }
        return null;
    }
}
