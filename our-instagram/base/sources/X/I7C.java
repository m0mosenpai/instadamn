package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.base.IgReactQEModule;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I7C {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.IJD, java.lang.Object] */
    public static IJD parseFromJson(C16L c16l) {
        Integer num;
        String str;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("feed_type".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    Integer[] A00 = C05F.A00(29);
                    int length = A00.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            num = A00[i];
                            switch (num.intValue()) {
                                case 1:
                                    str = "account";
                                    break;
                                case 2:
                                    str = "product_details";
                                    break;
                                case 3:
                                    str = "bloks";
                                    break;
                                case 4:
                                    str = "checkout_button";
                                    break;
                                case 5:
                                    str = "details";
                                    break;
                                case 6:
                                    str = "external_link";
                                    break;
                                case 7:
                                    str = "button";
                                    break;
                                case 8:
                                    str = "hero_carousel";
                                    break;
                                case 9:
                                    str = "ig_funded_incentive";
                                    break;
                                case 10:
                                    str = "launch_countdown_button";
                                    break;
                                case 11:
                                    str = "link";
                                    break;
                                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                                    str = "loading";
                                    break;
                                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                                    str = "media";
                                    break;
                                case 14:
                                    str = "message_merchant";
                                    break;
                                case Process.SIGTERM /* 15 */:
                                    str = "products";
                                    break;
                                case 16:
                                    str = DevServerEntity.COLUMN_DESCRIPTION;
                                    break;
                                case 17:
                                    str = "product_feed";
                                    break;
                                case 18:
                                    str = "sandboxed_shop_banner";
                                    break;
                                case Process.SIGSTOP /* 19 */:
                                    str = "set_reminder_and_save_button";
                                    break;
                                case 20:
                                    str = "seller_badge";
                                    break;
                                case 21:
                                    str = "shipping_returns";
                                    break;
                                case 22:
                                    str = "shop";
                                    break;
                                case 23:
                                    str = "text";
                                    break;
                                case 24:
                                    str = "try_in_ar";
                                    break;
                                case 25:
                                    str = "variant_selector";
                                    break;
                                case 26:
                                    str = "view_insights";
                                    break;
                                case 27:
                                    str = "restock_reminder";
                                    break;
                                case 28:
                                    str = "featured_product_permission";
                                    break;
                                default:
                                    str = "about_this_shop";
                                    break;
                            }
                            if (!str.equals(A0m)) {
                                i++;
                            }
                        } else {
                            num = null;
                        }
                    }
                    obj.A02 = num;
                } else if ("section_type".equals(A0s)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("layout_content".equals(A0s)) {
                    obj.A00 = AbstractC40812I6o.parseFromJson(c16l);
                } else if ("spacing".equals(A0s)) {
                    obj.A01 = I7E.parseFromJson(c16l);
                } else if ("requires_all_variants_selected".equals(A0s)) {
                    obj.A04 = c16l.A0d();
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
