package X;

import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.io.IOException;

/* renamed from: X.Kpq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46971Kpq {
    public static C29721bn parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C29721bn c29721bn = new C29721bn();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("reel_owner_user_id".equals(A0s)) {
                    c29721bn.A0J = AbstractC167017dG.A0m(c16l);
                } else if ("reel_id".equals(A0s)) {
                    c29721bn.A0I = AbstractC167017dG.A0m(c16l);
                } else if ("reel_share".equals(A0s)) {
                    c29721bn.A00 = LCB.parseFromJson(c16l);
                } else if ("reaction_name".equals(A0s)) {
                    c29721bn.A0H = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(98).equals(A0s)) {
                    c29721bn.A08 = AbstractC167017dG.A0m(c16l);
                } else if ("avatar_sticker_template".equals(A0s)) {
                    c29721bn.A0A = AbstractC167017dG.A0m(c16l);
                } else if (MSV.A00(391).equals(A0s)) {
                    c29721bn.A09 = AbstractC167017dG.A0m(c16l);
                } else if ("nux_type".equals(A0s)) {
                    c29721bn.A07 = AbstractC166997dE.A0h(c16l);
                } else if ("gif_id".equals(A0s)) {
                    c29721bn.A0D = AbstractC167017dG.A0m(c16l);
                } else if ("gif_is_sticker".equals(A0s)) {
                    c29721bn.A0K = c16l.A0d();
                } else if ("interactive_sticker_id".equals(A0s)) {
                    c29721bn.A0F = AbstractC167017dG.A0m(c16l);
                } else if ("interactive_sticker_type".equals(A0s)) {
                    c29721bn.A0G = AbstractC167017dG.A0m(c16l);
                } else if ("interact_user_id".equals(A0s)) {
                    c29721bn.A0E = AbstractC167017dG.A0m(c16l);
                } else if ("emoji_reaction_unicode".equals(A0s)) {
                    c29721bn.A0B = AbstractC167017dG.A0m(c16l);
                } else if (ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY.equals(A0s)) {
                    c29721bn.A0C = AbstractC167017dG.A0m(c16l);
                } else if ("is_suggested_reply".equals(A0s)) {
                    c29721bn.A05 = AbstractC166997dE.A0d(c16l);
                } else if ("receiver_is_online".equals(A0s)) {
                    c29721bn.A06 = AbstractC166997dE.A0d(c16l);
                } else if ("reaction_image_url_info".equals(A0s)) {
                    c29721bn.A01 = C17Y.parseFromJson(c16l);
                } else if ("is_group".equals(A0s)) {
                    c29721bn.A02 = AbstractC166997dE.A0d(c16l);
                } else if ("is_group_profile_story_reply".equals(A0s)) {
                    c29721bn.A03 = AbstractC166997dE.A0d(c16l);
                } else if ("is_highlight_reel".equals(A0s)) {
                    c29721bn.A04 = AbstractC166997dE.A0d(c16l);
                } else {
                    AbstractC47856LCb.A01(c16l, c29721bn, A0s);
                }
                c16l.A0z();
            }
            return c29721bn;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
