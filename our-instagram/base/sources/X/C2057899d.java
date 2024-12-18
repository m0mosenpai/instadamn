package X;

import android.os.Parcelable;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.99d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2057899d {
    public static C99Z parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C99Z c99z = new C99Z();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("inbox".equals(A0q)) {
                    c99z.A05 = JWU.parseFromJson(c16l);
                } else if ("spam_requests_total".equals(A0q)) {
                    c99z.A00 = c16l.A1D();
                } else if ("megaphone".equals(A0q)) {
                    c99z.A08 = AbstractC34247F8t.parseFromJson(c16l);
                } else if ("seq_id".equals(A0q)) {
                    c99z.A01 = c16l.A0y();
                } else if ("snapshot_at_ms".equals(A0q)) {
                    c99z.A02 = c16l.A0y();
                } else if ("viewer".equals(A0q)) {
                    Parcelable.Creator creator = User.CREATOR;
                    c99z.A09 = AbstractC38851rI.A00(c16l, true);
                } else if ("notes".equals(A0q)) {
                    c99z.A03 = AbstractC125555m1.parseFromJson(c16l);
                } else if ("inbox_nudge_thread".equals(A0q)) {
                    c99z.A04 = AbstractC22713A0j.parseFromJson(c16l);
                } else if ("creator_bundle_hmr_change_notice".equals(A0q)) {
                    c99z.A07 = AbstractC22723A0t.parseFromJson(c16l);
                } else if ("latest_story_request_info".equals(A0q)) {
                    c99z.A06 = AbstractC47018Kqb.parseFromJson(c16l);
                } else {
                    C55702hA.A01(c16l, c99z, A0q);
                }
                c16l.A0z();
            }
            return c99z;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
