package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.Vy9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69938Vy9 {
    /* JADX WARN: Type inference failed for: r1v2, types: [X.UzG, X.1um, X.1ul] */
    public static C67843UzG parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("thread_igid".equals(A0s)) {
                    c40791um.A0B = AbstractC167017dG.A0m(c16l);
                } else if (DialogModule.KEY_TITLE.equals(A0s)) {
                    c40791um.A0C = AbstractC167017dG.A0m(c16l);
                } else if ("is_member".equals(A0s)) {
                    c40791um.A0D = c16l.A0d();
                } else if ("number_of_members".equals(A0s)) {
                    c40791um.A06 = AbstractC166997dE.A0h(c16l);
                } else if ("connected_text".equals(A0s)) {
                    c40791um.A08 = AbstractC167017dG.A0m(c16l);
                } else if ("join_explainer_text".equals(A0s)) {
                    c40791um.A0A = AbstractC167017dG.A0m(c16l);
                } else if ("button_text".equals(A0s)) {
                    c40791um.A07 = AbstractC167017dG.A0m(c16l);
                } else if ("is_join_button_disabled".equals(A0s)) {
                    c40791um.A05 = AbstractC166997dE.A0d(c16l);
                } else if ("is_thread_full".equals(A0s)) {
                    c40791um.A0F = c16l.A0d();
                } else if ("is_thread_ended".equals(A0s)) {
                    c40791um.A0E = c16l.A0d();
                } else if ("group_image_uri".equals(A0s)) {
                    c40791um.A09 = AbstractC167017dG.A0m(c16l);
                } else if ("error".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if (AbstractC111324zv.A00(4729).equals(A0s)) {
                    c40791um.A04 = AbstractC166997dE.A0d(c16l);
                } else if ("creator_subscriber_thread_group_link_preview_response".equals(A0s)) {
                    c40791um.A03 = AbstractC68476VSh.parseFromJson(c16l);
                } else if ("creator_broadcast_chat_thread_group_link_preview_response".equals(A0s)) {
                    c40791um.A02 = VOA.parseFromJson(c16l);
                } else if ("thread_subtype".equals(A0s)) {
                    c40791um.A00 = c16l.A1D();
                } else if ("shared_thread_content_response".equals(A0s)) {
                    c40791um.A01 = AbstractC33741EvT.parseFromJson(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
