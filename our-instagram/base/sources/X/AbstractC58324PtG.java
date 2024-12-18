package X;

import android.graphics.RectF;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.PtG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC58324PtG {
    public static int A00(byte[] bArr, int i, long j) {
        int i2 = i + 1;
        bArr[i] = (byte) (j & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (255 & (j >> 24));
        return i5;
    }

    public static long A01(long j) {
        return (((j >> 24) & 255) << 21) | (j & 255) | (((j >> 8) & 255) << 7) | (((j >> 16) & 255) << 14);
    }

    public static long A02(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public static long A03(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static C4OU A05() {
        C94754Oe c94754Oe = C94754Oe.A00;
        C4OW c4ow = new C4OW(c94754Oe, "full_name");
        C95124Py c95124Py = C95124Py.A00;
        return new C4OU(new C4OM[]{c4ow, new C4OW(c95124Py, "has_onboarded_to_text_post_app"), new C4OW(c95124Py, "is_private"), new C4OW(c95124Py, "is_verified"), new C4OW(c94754Oe, "pk"), new C4OW(c94754Oe, "pk_id"), new C4OW(c94754Oe, "profile_pic_id"), new C4OW(c94754Oe, "profile_pic_url"), new C4OW(c94754Oe, AbstractC31190DnZ.A00())});
    }

    public static C4OU A06() {
        C94754Oe c94754Oe = C94754Oe.A00;
        C4OW c4ow = new C4OW(c94754Oe, "full_name");
        C95124Py c95124Py = C95124Py.A00;
        return new C4OU(new C4OM[]{c4ow, new C4OW(c95124Py, "is_private"), new C4OW(c95124Py, "is_verified"), new C4OW(c94754Oe, "pk"), new C4OW(c94754Oe, "pk_id"), new C4OW(c94754Oe, "profile_pic_id"), new C4OW(c94754Oe, "profile_pic_url"), new C4OW(c94754Oe, AbstractC31190DnZ.A00())});
    }

    public static C4OU A07() {
        C94754Oe c94754Oe = C94754Oe.A00;
        C4OW c4ow = new C4OW(c94754Oe, "start_cursor");
        C4OW c4ow2 = new C4OW(c94754Oe, "end_cursor");
        C95124Py c95124Py = C95124Py.A00;
        return new C4OU(new C4OM[]{c4ow, c4ow2, new C4OW(c95124Py, "has_next_page"), new C4OW(c95124Py, "has_previous_page"), new C4OW(c94754Oe, "delta_cursor")});
    }

    public static C4OU A08() {
        C95124Py c95124Py = C95124Py.A00;
        return new C4OU(new C4OM[]{new C4OW(c95124Py, "following"), new C4OW(c95124Py, "is_bestie"), new C4OW(c95124Py, "is_feed_favorite"), new C4OW(c95124Py, "is_restricted"), new C4OW(c95124Py, "is_viewer_unconnected"), new C4OW(c95124Py, "outgoing_request")});
    }

    public static C4OU A09() {
        C94894Ou c94894Ou = C94894Ou.A00;
        C4OW c4ow = new C4OW(c94894Ou, IgReactMediaPickerNativeModule.HEIGHT);
        C4OW c4ow2 = new C4OW(c94894Ou, IgReactMediaPickerNativeModule.WIDTH);
        C94754Oe c94754Oe = C94754Oe.A00;
        return new C4OU(new C4OM[]{c4ow, c4ow2, new C4OW(c94754Oe, "url"), new C4OW(c94754Oe, "webp"), new C4OW(c94754Oe, "mp4"), new C4OW(c94894Ou, "size_bytes"), new C4OW(c94894Ou, "webp_size_bytes"), new C4OW(c94894Ou, "mp4_size_bytes")});
    }

    public static C4OU A0A() {
        C94754Oe c94754Oe = C94754Oe.A00;
        C4OW c4ow = new C4OW(c94754Oe, "full_name");
        C95124Py c95124Py = C95124Py.A00;
        return new C4OU(new C4OM[]{c4ow, new C4OW(c95124Py, "has_onboarded_to_text_post_app"), new C4OW(c94754Oe, PublicKeyCredentialControllerUtility.JSON_KEY_ID), new C4OW(c95124Py, "is_private"), new C4OW(c95124Py, "is_verified"), new C4OW(c94754Oe, "pk"), new C4OW(c94754Oe, "pk_id"), new C4OW(c94754Oe, "profile_pic_id"), new C4OW(c94754Oe, "profile_pic_url"), new C4OW(c94754Oe, AbstractC50635MWw.A00())});
    }

    public static C4OU A0B() {
        C95124Py c95124Py = C95124Py.A00;
        return new C4OU(new C4OM[]{new C4OW(c95124Py, "blocking"), new C4OW(c95124Py, "followed_by"), new C4OW(c95124Py, "following"), new C4OW(c95124Py, "incoming_request"), new C4OW(c95124Py, "is_bestie"), new C4OW(c95124Py, "is_feed_favorite"), new C4OW(c95124Py, "is_private"), new C4OW(c95124Py, "is_restricted"), new C4OW(c95124Py, "muting"), new C4OW(c95124Py, "outgoing_request")});
    }

    public static C4OU A0C() {
        C94894Ou c94894Ou = C94894Ou.A00;
        return new C4OU(new C4OM[]{new C4OW(new C94774Oi(c94894Ou), IgReactMediaPickerNativeModule.HEIGHT), new C4OW(new C94774Oi(C94754Oe.A00), "url"), new C4OW(new C94774Oi(c94894Ou), IgReactMediaPickerNativeModule.WIDTH)});
    }

    public static C4OU A0D() {
        C94754Oe c94754Oe = C94754Oe.A00;
        C4OW c4ow = new C4OW(c94754Oe, "full_name");
        C4OW c4ow2 = new C4OW(c94754Oe, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        C95124Py c95124Py = C95124Py.A00;
        return new C4OU(new C4OM[]{c4ow, c4ow2, new C4OW(c95124Py, "is_private"), new C4OW(c95124Py, "is_verified"), new C4OW(c94754Oe, "pk"), new C4OW(c94754Oe, "pk_id"), new C4OW(c94754Oe, "profile_pic_id"), new C4OW(c94754Oe, "profile_pic_url"), new C4OW(c94754Oe, AbstractC50635MWw.A00())});
    }

    public static C4OU A0E() {
        C94754Oe c94754Oe = C94754Oe.A00;
        C4OW c4ow = new C4OW(c94754Oe, "full_name");
        C95124Py c95124Py = C95124Py.A00;
        return new C4OU(new C4OM[]{c4ow, new C4OW(c95124Py, "is_private"), new C4OW(c95124Py, "is_verified"), new C4OW(c94754Oe, "pk"), new C4OW(c94754Oe, "pk_id"), new C4OW(c94754Oe, "profile_pic_id"), new C4OW(c94754Oe, "profile_pic_url"), new C4OW(c94754Oe, AbstractC31188DnX.A01())});
    }

    public static C4OU A0F() {
        C95124Py c95124Py = C95124Py.A00;
        C4OW c4ow = new C4OW(c95124Py, "disabled_sharing_products_to_guides");
        C94754Oe c94754Oe = C94754Oe.A00;
        return new C4OU(new C4OM[]{c4ow, new C4OW(c94754Oe, PublicKeyCredentialControllerUtility.JSON_KEY_ID), new C4OW(c95124Py, "is_verified"), new C4OW(c94754Oe, "pk"), new C4OW(c94754Oe, "profile_pic_url"), new C4OW(c94754Oe, "storefront_attribution_username"), new C4OW(c94754Oe, AbstractC50635MWw.A00())});
    }

    public static C4OU A0G() {
        C94754Oe c94754Oe = C94754Oe.A00;
        return new C4OU(new C4OM[]{new C4OW(c94754Oe, PublicKeyCredentialControllerUtility.JSON_KEY_ID), new C4OW(c94754Oe, AbstractC31188DnX.A01()), new C4OW(c94754Oe, "full_name"), new C4OW(c94754Oe, "profile_pic_url"), new C4OW(C95124Py.A00, "is_verified")});
    }

    public static C4OU A0H() {
        C95124Py c95124Py = C95124Py.A00;
        C4OW c4ow = new C4OW(c95124Py, "disabled_sharing_products_to_guides");
        C4OW c4ow2 = new C4OW(c95124Py, "is_verified");
        C94754Oe c94754Oe = C94754Oe.A00;
        return new C4OU(new C4OM[]{c4ow, c4ow2, new C4OW(c94754Oe, "pk"), new C4OW(c94754Oe, "profile_pic_url"), new C4OW(c94754Oe, "storefront_attribution_username"), new C4OW(c94754Oe, AbstractC31190DnZ.A00())});
    }

    public static C4OU A0I() {
        C94754Oe c94754Oe = C94754Oe.A00;
        return new C4OU(new C4OM[]{new C4OW(new C94774Oi(c94754Oe), "app_id"), new C4OW(c94754Oe, "button_label"), new C4OW(c94754Oe, "category_type"), new C4OW(c94754Oe, "display_category_name"), new C4OW(new C94774Oi(c94754Oe), "partner_name"), new C4OW(new C94774Oi(c94754Oe), "partner_type"), new C4OW(new C94774Oi(c94754Oe), "url")});
    }

    public static C4OU A0J(InterfaceC94764Of interfaceC94764Of, InterfaceC94764Of interfaceC94764Of2, C4OM c4om, C4OM c4om2, C4OM c4om3) {
        return new C4OU(new C4OM[]{c4om, c4om2, c4om3, new C4OW(new C94774Oi(C95124Py.A00), "reminder_enabled"), new C4OW(new C94774Oi(interfaceC94764Of), TraceFieldType.StartTime), new C4OW(interfaceC94764Of2, "strong_id__"), new C4OW(new C94774Oi(interfaceC94764Of2), DialogModule.KEY_TITLE), new C4OW(new C94774Oi(interfaceC94764Of2), "upcoming_event_id_type")});
    }

    public static C4OU A0K(C4Og c4Og) {
        return new C4OU(new C4OM[]{new C4OW(c4Og, "blocking"), new C4OW(c4Og, "followed_by"), new C4OW(c4Og, "following"), new C4OW(c4Og, "incoming_request"), new C4OW(c4Og, "is_bestie"), new C4OW(c4Og, "is_eligible_to_subscribe"), new C4OW(c4Og, "is_feed_favorite"), new C4OW(c4Og, "is_private"), new C4OW(c4Og, "is_restricted"), new C4OW(c4Og, "muting"), new C4OW(c4Og, "outgoing_request"), new C4OW(c4Og, "subscribed")});
    }

    public static C4OU A0L(C4Og c4Og, C4Og c4Og2, C4OM c4om, C4OM c4om2, C4OM c4om3) {
        return new C4OU(new C4OM[]{c4om, c4om2, c4om3, new C4OW(c4Og, "is_private"), new C4OW(c4Og, "is_verified"), new C4OW(c4Og2, "pk"), new C4OW(c4Og2, "pk_id"), new C4OW(c4Og2, "profile_pic_id"), new C4OW(c4Og2, "profile_pic_url"), new C4OW(c4Og2, AbstractC31198Dnh.A01())});
    }

    public static C4OU A0M(C4Og c4Og, C4Og c4Og2, C4OM c4om, C4OM c4om2, String str) {
        return new C4OU(new C4OM[]{c4om, c4om2, new C4OW(c4Og, str), new C4OW(c4Og, "is_verified"), new C4OW(c4Og2, "pk"), new C4OW(c4Og2, "pk_id"), new C4OW(c4Og2, "profile_pic_id"), new C4OW(c4Og2, "profile_pic_url"), new C4OW(c4Og2, AbstractC31198Dnh.A01())});
    }

    public static void A0O(C0Zx c0Zx, Object obj, String str) {
        C18920wW c18920wW = (C18920wW) obj;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, str);
        if (A00.isSampled()) {
            A00.AAQ(c0Zx, "event_payload");
            A00.AAP(AbstractC63083Sc6.A00(), C2O0.A00);
            A00.AAP("product_type", AbstractC49212Oa.A00);
            A00.AAP("platform", "android");
            A00.A9K("actual_event_time", Long.valueOf(System.currentTimeMillis()));
            A00.Cht();
        }
    }

    public static RectF A04(ReadableMap readableMap) {
        float f = (float) readableMap.getDouble("x");
        float f2 = (float) readableMap.getDouble("y");
        return new RectF(WF1.A01(f), WF1.A01(f2), WF1.A01((float) (f + readableMap.getDouble(IgReactMediaPickerNativeModule.WIDTH))), WF1.A01((float) (f2 + readableMap.getDouble(IgReactMediaPickerNativeModule.HEIGHT))));
    }

    public static String A0N(Object obj, Throwable th) {
        String A0g = AnonymousClass001.A0g(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
        Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(A0g), th);
        return AnonymousClass001.A11("<", A0g, " threw ", th.getClass().getName(), ">");
    }
}
