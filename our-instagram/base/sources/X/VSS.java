package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VSS {
    public static C68024V6s parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68024V6s c68024V6s = new C68024V6s();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("media_id".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c68024V6s.A0E = A0m;
                } else if ("carousel_child_media_id".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c68024V6s.A07 = A0m2;
                } else if ("media_owner_id".equals(A0s)) {
                    String A0m3 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m3, 0);
                    c68024V6s.A0F = A0m3;
                } else if (AbstractC69998VzI.A00(10, 8, 11).equals(A0s)) {
                    String A0m4 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m4, 0);
                    c68024V6s.A0I = A0m4;
                } else if ("user_attribution".equals(A0s)) {
                    c68024V6s.A0H = AbstractC167017dG.A0m(c16l);
                } else if ("profile_pic_url".equals(A0s)) {
                    SimpleImageUrl A00 = AbstractC222616c.A00(c16l);
                    C14360o3.A0B(A00, 0);
                    c68024V6s.A05 = A00;
                } else if ("has_product_tags".equals(A0s)) {
                    c68024V6s.A0L = c16l.A0d();
                } else if ("carousel_child_has_product_tags".equals(A0s)) {
                    c68024V6s.A0J = c16l.A0d();
                } else if ("has_collaborators".equals(A0s)) {
                    c68024V6s.A0K = c16l.A0d();
                } else if ("is_media_author_seller".equals(A0s)) {
                    c68024V6s.A0O = c16l.A0d();
                } else if (DialogModule.KEY_TITLE.equals(A0s)) {
                    c68024V6s.A0G = AbstractC167017dG.A0m(c16l);
                } else if ("duration".equals(A0s)) {
                    c68024V6s.A08 = AbstractC167017dG.A0m(c16l);
                } else if ("duration_ms".equals(A0s)) {
                    c68024V6s.A06 = AbstractC31173DnH.A0h(c16l);
                } else if ("event_id".equals(A0s)) {
                    c68024V6s.A0A = AbstractC167017dG.A0m(c16l);
                } else if ("event_title".equals(A0s)) {
                    c68024V6s.A0C = AbstractC167017dG.A0m(c16l);
                } else if ("event_time".equals(A0s)) {
                    c68024V6s.A0B = AbstractC167017dG.A0m(c16l);
                } else if ("event_action_button_text".equals(A0s)) {
                    c68024V6s.A09 = AbstractC167017dG.A0m(c16l);
                } else if ("is_autoplay".equals(A0s)) {
                    c68024V6s.A0M = c16l.A0d();
                } else if ("is_carousel".equals(A0s)) {
                    c68024V6s.A0N = c16l.A0d();
                } else if ("fundraiser_id".equals(A0s)) {
                    c68024V6s.A0D = AbstractC167017dG.A0m(c16l);
                } else if (IgReactMediaPickerNativeModule.WIDTH.equals(A0s)) {
                    c68024V6s.A04 = c16l.A1D();
                } else if (IgReactMediaPickerNativeModule.HEIGHT.equals(A0s)) {
                    c68024V6s.A00 = c16l.A1D();
                } else if ("padding_x".equals(A0s)) {
                    c68024V6s.A01 = c16l.A1D();
                } else if ("padding_y".equals(A0s)) {
                    c68024V6s.A02 = c16l.A1D();
                } else if ("repost_pill_width".equals(A0s)) {
                    c68024V6s.A03 = c16l.A1D();
                } else {
                    ADU.A01(c16l, c68024V6s, A0s);
                }
                c16l.A0z();
            }
            return c68024V6s;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
