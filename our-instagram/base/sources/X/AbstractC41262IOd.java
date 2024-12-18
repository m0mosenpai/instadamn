package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.NoteEmojiReactionInfo;
import com.instagram.api.schemas.NoteReactionType;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.IOd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41262IOd {
    public static NoteEmojiReactionInfo parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            NoteReactionType noteReactionType = null;
            User user = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("emoji".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("is_unseen".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("reaction_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    noteReactionType = (NoteReactionType) NoteReactionType.A01.get(A1P);
                    if (noteReactionType == null) {
                        noteReactionType = NoteReactionType.A07;
                    }
                } else {
                    user = AbstractC31180DnO.A0W(c16l, user, A0s, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                }
                c16l.A0z();
            }
            return new NoteEmojiReactionInfo(noteReactionType, user, bool, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, NoteEmojiReactionInfo noteEmojiReactionInfo) {
        anonymousClass182.A0d();
        String str = noteEmojiReactionInfo.A03;
        if (str != null) {
            anonymousClass182.A0S("emoji", str);
        }
        Boolean bool = noteEmojiReactionInfo.A02;
        if (bool != null) {
            anonymousClass182.A0T("is_unseen", bool.booleanValue());
        }
        NoteReactionType noteReactionType = noteEmojiReactionInfo.A00;
        if (noteReactionType != null) {
            anonymousClass182.A0S("reaction_type", noteReactionType.A00);
        }
        User user = noteEmojiReactionInfo.A01;
        if (user != null) {
            AbstractC37300Gc1.A0x(anonymousClass182, user, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
        }
        anonymousClass182.A0a();
    }
}
