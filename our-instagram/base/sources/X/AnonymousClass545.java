package X;

import com.instagram.direct.model.mentions.MentionedEntity;
import java.io.IOException;

/* renamed from: X.545, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class AnonymousClass545 {
    public static MentionedEntity parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            MentionedEntity mentionedEntity = new MentionedEntity();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("fbid".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                    mentionedEntity.A03 = A1P;
                } else if ("offset".equals(A0q)) {
                    mentionedEntity.A01 = c16l.A1D();
                } else if ("length".equals(A0q)) {
                    mentionedEntity.A00 = c16l.A1D();
                } else if ("interop_user_type".equals(A0q)) {
                    mentionedEntity.A02 = c16l.A1D();
                }
                c16l.A0z();
            }
            return mentionedEntity;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, MentionedEntity mentionedEntity) {
        anonymousClass182.A0d();
        String str = mentionedEntity.A03;
        if (str != null) {
            anonymousClass182.A0S("fbid", str);
        }
        anonymousClass182.A0Q("offset", mentionedEntity.A01);
        anonymousClass182.A0Q("length", mentionedEntity.A00);
        anonymousClass182.A0Q("interop_user_type", mentionedEntity.A02);
        anonymousClass182.A0a();
    }
}
