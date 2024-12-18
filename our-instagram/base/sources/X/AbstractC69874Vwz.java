package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.location.platform.api.Location;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Vwz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69874Vwz {
    public static UR6 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            URU uru = null;
            UR7 ur7 = null;
            URA ura = null;
            URV urv = null;
            Long l = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("metadata_multi_comment_card_payload_v1".equals(A0s)) {
                    uru = VPO.parseFromJson(c16l);
                } else if ("metadata_payload_v1".equals(A0s)) {
                    ur7 = AbstractC68375VOj.parseFromJson(c16l);
                } else if ("metadata_photo_card_payload_v1".equals(A0s)) {
                    ura = AbstractC68380VOo.parseFromJson(c16l);
                } else if ("metadata_single_comment_card_payload_v1".equals(A0s)) {
                    urv = VPQ.parseFromJson(c16l);
                } else if ("option_value".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                }
                c16l.A0z();
            }
            return new UR6(ur7, ura, uru, urv, l);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, UR6 ur6) {
        anonymousClass182.A0d();
        InterfaceC72033XFv interfaceC72033XFv = ur6.A02;
        if (interfaceC72033XFv != null) {
            anonymousClass182.A0r("metadata_multi_comment_card_payload_v1");
            URU F44 = interfaceC72033XFv.F44();
            anonymousClass182.A0d();
            XG4 xg4 = F44.A00;
            if (xg4 != null) {
                anonymousClass182.A0r(AppStateModule.APP_STATE_BACKGROUND);
                AbstractC69870Vwv.A00(anonymousClass182, xg4.Ex6());
            }
            List list = F44.A01;
            if (list != null) {
                Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "comments", list);
                while (A0q.hasNext()) {
                    XG9 xg9 = (XG9) A0q.next();
                    if (xg9 != null) {
                        AbstractC69871Vww.A00(anonymousClass182, xg9.Ex7());
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0a();
        }
        UR7 ur7 = ur6.A00;
        if (ur7 != null) {
            anonymousClass182.A0r("metadata_payload_v1");
            anonymousClass182.A0d();
            XG4 xg42 = ur7.A00;
            if (xg42 != null) {
                anonymousClass182.A0r(AppStateModule.APP_STATE_BACKGROUND);
                AbstractC69870Vwv.A00(anonymousClass182, xg42.Ex6());
            }
            String str = ur7.A03;
            if (str != null) {
                anonymousClass182.A0S(DevServerEntity.COLUMN_DESCRIPTION, str);
            }
            List list2 = ur7.A06;
            if (list2 != null) {
                Iterator A0q2 = AbstractC37301Gc2.A0q(anonymousClass182, "metadata_items", list2);
                while (A0q2.hasNext()) {
                    XGA xga = (XGA) A0q2.next();
                    if (xga != null) {
                        AbstractC69872Vwx.A00(anonymousClass182, xga.ExD());
                    }
                }
                anonymousClass182.A0Z();
            }
            String str2 = ur7.A04;
            if (str2 != null) {
                anonymousClass182.A0S("separator_color", str2);
            }
            String str3 = ur7.A05;
            if (str3 != null) {
                anonymousClass182.A0S("text_color", str3);
            }
            InterfaceC72036XFy interfaceC72036XFy = ur7.A02;
            if (interfaceC72036XFy != null) {
                anonymousClass182.A0r("thumbnail");
                AbstractC69873Vwy.A00(anonymousClass182, interfaceC72036XFy.ExE());
            }
            XGA xga2 = ur7.A01;
            if (xga2 != null) {
                anonymousClass182.A0r(DialogModule.KEY_TITLE);
                AbstractC69872Vwx.A00(anonymousClass182, xga2.ExD());
            }
            anonymousClass182.A0a();
        }
        URA ura = ur6.A01;
        if (ura != null) {
            anonymousClass182.A0r("metadata_photo_card_payload_v1");
            anonymousClass182.A0d();
            InterfaceC72032XFu interfaceC72032XFu = ura.A02;
            if (interfaceC72032XFu != null) {
                anonymousClass182.A0r("animation");
                UR9 Ex9 = interfaceC72032XFu.Ex9();
                anonymousClass182.A0d();
                Integer num = Ex9.A00;
                if (num != null) {
                    anonymousClass182.A0Q(Location.SPEED, num.intValue());
                }
                Integer num2 = Ex9.A01;
                if (num2 != null) {
                    anonymousClass182.A0Q("startLagMs", num2.intValue());
                }
                anonymousClass182.A0a();
            }
            XG4 xg43 = ura.A01;
            if (xg43 != null) {
                anonymousClass182.A0r(AppStateModule.APP_STATE_BACKGROUND);
                AbstractC69870Vwv.A00(anonymousClass182, xg43.Ex6());
            }
            InterfaceC72031XFt interfaceC72031XFt = ura.A00;
            if (interfaceC72031XFt != null) {
                anonymousClass182.A0r("badge");
                UR3 Ex4 = interfaceC72031XFt.Ex4();
                anonymousClass182.A0d();
                Integer num3 = Ex4.A00;
                if (num3 != null) {
                    anonymousClass182.A0Q("location", num3.intValue());
                }
                Integer num4 = Ex4.A01;
                if (num4 != null) {
                    anonymousClass182.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, num4.intValue());
                }
                anonymousClass182.A0a();
            }
            List list3 = ura.A03;
            if (list3 != null) {
                Iterator A0q3 = AbstractC37301Gc2.A0q(anonymousClass182, "photos", list3);
                while (A0q3.hasNext()) {
                    XGC xgc = (XGC) A0q3.next();
                    if (xgc != null) {
                        UR8 ExB = xgc.ExB();
                        anonymousClass182.A0d();
                        String str4 = ExB.A04;
                        if (str4 != null) {
                            anonymousClass182.A0S("border_color", str4);
                        }
                        Float f = ExB.A00;
                        if (f != null) {
                            anonymousClass182.A0P("border_width_float", f.floatValue());
                        }
                        Float f2 = ExB.A01;
                        if (f2 != null) {
                            anonymousClass182.A0P("corner_radius", f2.floatValue());
                        }
                        Integer num5 = ExB.A02;
                        if (num5 != null) {
                            anonymousClass182.A0Q(IgReactMediaPickerNativeModule.HEIGHT, num5.intValue());
                        }
                        String str5 = ExB.A05;
                        if (str5 != null) {
                            anonymousClass182.A0S("url", str5);
                        }
                        Integer num6 = ExB.A03;
                        if (num6 != null) {
                            anonymousClass182.A0Q(IgReactMediaPickerNativeModule.WIDTH, num6.intValue());
                        }
                        anonymousClass182.A0a();
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0a();
        }
        XG7 xg7 = ur6.A03;
        if (xg7 != null) {
            anonymousClass182.A0r("metadata_single_comment_card_payload_v1");
            URV F45 = xg7.F45();
            anonymousClass182.A0d();
            XG4 xg44 = F45.A00;
            if (xg44 != null) {
                anonymousClass182.A0r(AppStateModule.APP_STATE_BACKGROUND);
                AbstractC69870Vwv.A00(anonymousClass182, xg44.Ex6());
            }
            XG9 xg92 = F45.A01;
            if (xg92 != null) {
                anonymousClass182.A0r(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT);
                AbstractC69871Vww.A00(anonymousClass182, xg92.Ex7());
            }
            XGA xga3 = F45.A02;
            if (xga3 != null) {
                anonymousClass182.A0r("page_name");
                AbstractC69872Vwx.A00(anonymousClass182, xga3.ExD());
            }
            InterfaceC72036XFy interfaceC72036XFy2 = F45.A03;
            if (interfaceC72036XFy2 != null) {
                anonymousClass182.A0r("thumbnail");
                AbstractC69873Vwy.A00(anonymousClass182, interfaceC72036XFy2.ExE());
            }
            anonymousClass182.A0a();
        }
        Long l = ur6.A04;
        if (l != null) {
            anonymousClass182.A0R("option_value", l.longValue());
        }
        anonymousClass182.A0a();
    }
}
