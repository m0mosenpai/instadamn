package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.TextAppSearchDiscussionTopicImpl;
import java.io.IOException;

/* renamed from: X.4cs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC99264cs {
    public static TextAppSearchDiscussionTopicImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("fbid".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("image_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("metagen_description".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if (AbstractC43591JPw.A00(472).equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new TextAppSearchDiscussionTopicImpl(str, str2, str3, str4, str5);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, TextAppSearchDiscussionTopicImpl textAppSearchDiscussionTopicImpl) {
        anonymousClass182.A0d();
        String str = textAppSearchDiscussionTopicImpl.A00;
        if (str != null) {
            anonymousClass182.A0S("fbid", str);
        }
        String str2 = textAppSearchDiscussionTopicImpl.A01;
        if (str2 != null) {
            anonymousClass182.A0S("image_url", str2);
        }
        String str3 = textAppSearchDiscussionTopicImpl.A02;
        if (str3 != null) {
            anonymousClass182.A0S("metagen_description", str3);
        }
        String str4 = textAppSearchDiscussionTopicImpl.A03;
        if (str4 != null) {
            anonymousClass182.A0S(AbstractC43591JPw.A00(472), str4);
        }
        String str5 = textAppSearchDiscussionTopicImpl.A04;
        if (str5 != null) {
            anonymousClass182.A0S(DialogModule.KEY_TITLE, str5);
        }
        anonymousClass182.A0a();
    }
}
