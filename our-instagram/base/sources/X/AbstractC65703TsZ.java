package X;

import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.Parcel;
import android.text.Spannable;
import android.text.Spanned;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.intent.IntentModule;
import com.facebookpay.form.fragment.model.FormMutationEvent;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.debug.devoptions.section.localinjection.datastore.LocalInjectionUnit;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.ui.widget.rangeseekbar.RangeSeekBar;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.TsZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC65703TsZ {
    public static char A00(C200688uB c200688uB) {
        GLES20.glBindFramebuffer(36160, c200688uB.A00);
        GLES20.glViewport(0, 0, c200688uB.A02, c200688uB.A01);
        return (char) 36160;
    }

    public static int A05(View view, Object obj) {
        if (obj == null) {
            return 0;
        }
        return C63233Sfl.A01(view.getContext(), obj, 0).intValue();
    }

    public static Integer A13(View view, Object obj) {
        if (obj != null) {
            return C63233Sfl.A01(view.getContext(), obj, 0);
        }
        return null;
    }

    public static String A16(LocalInjectionUnit.Item item) {
        String str = item.id;
        if (str == null) {
            return (String) AbstractC001900j.A0R(item.filename, new String[]{"."}, 0).get(0);
        }
        return str;
    }

    public static C73833Sq A1D(String str, InterfaceC73823Sp interfaceC73823Sp) {
        C73833Sq c73833Sq = new C73833Sq(str, interfaceC73823Sp, 1);
        c73833Sq.A00(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
        return c73833Sq;
    }

    public static void A1H(Parcel parcel, Enum r3) {
        if (r3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(r3.name());
        }
    }

    public static float A01(RangeSeekBar rangeSeekBar, float f) {
        return AbstractC13600mm.A01(f, rangeSeekBar.A01, rangeSeekBar.A00, rangeSeekBar.A05, rangeSeekBar.getWidth() - rangeSeekBar.A05);
    }

    public static float A02(Object obj) {
        if (!(obj instanceof Double)) {
            return 0.0f;
        }
        return ((Number) obj).floatValue();
    }

    public static float A03(Object obj) {
        if (!(obj instanceof Double)) {
            return Float.NaN;
        }
        return ((Number) obj).floatValue();
    }

    public static int A04(View view, Object obj) {
        if (obj == null) {
            return -16777216;
        }
        return C63233Sfl.A01(view.getContext(), obj, -16777216).intValue();
    }

    public static int A06(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        return ((Number) obj).intValue();
    }

    public static int A07(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static long A08(long j) {
        return Math.max(0L, j) * 8 * 1000000;
    }

    public static long A09(long j, long j2) {
        return Math.max(0L, Math.min(j, j2));
    }

    public static InputMethodManager A0A(Context context) {
        Object systemService = context.getSystemService("input_method");
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (InputMethodManager) systemService;
    }

    public static C180337zN A0B(AbstractMap abstractMap, ArrayList arrayList, float[] fArr) {
        abstractMap.put("aTextureCoord", new C180327zM(fArr));
        arrayList.add("aTextureCoord");
        return new C180337zN(arrayList, abstractMap);
    }

    public static C4OW A0C() {
        return new C4OW(new C94774Oi(C95124Py.A00), "can_viewer_link_back_to_original_media_from_vcr");
    }

    public static C4OW A0D() {
        return new C4OW(new C94774Oi(C95124Py.A00), "is_wearable_media_producer");
    }

    public static C4OW A0E(InterfaceC94764Of interfaceC94764Of) {
        return new C4OW(new C94774Oi(interfaceC94764Of), "end_time_ms");
    }

    public static C4OW A0F(InterfaceC94764Of interfaceC94764Of) {
        return new C4OW(new C94774Oi(interfaceC94764Of), "original_media_id");
    }

    public static C4OW A0G(InterfaceC94764Of interfaceC94764Of) {
        return new C4OW(new C94774Oi(interfaceC94764Of), "is_explicit");
    }

    public static C4OW A0H(InterfaceC94764Of interfaceC94764Of) {
        return new C4OW(new C94774Oi(interfaceC94764Of), "is_audio_automatically_attributed");
    }

    public static C4OW A0I(InterfaceC94764Of interfaceC94764Of) {
        return new C4OW(new C94774Oi(interfaceC94764Of), "attribution_top_icon_url");
    }

    public static C4OW A0J(InterfaceC94764Of interfaceC94764Of) {
        return new C4OW(new C94774Oi(interfaceC94764Of), "placeholder_profile_pic_url");
    }

    public static C4OW A0K(InterfaceC94764Of interfaceC94764Of) {
        return new C4OW(new C94774Oi(interfaceC94764Of), PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
    }

    public static C4OW A0L(InterfaceC94764Of interfaceC94764Of) {
        return new C4OW(new C94774Oi(interfaceC94764Of), IgReactMediaPickerNativeModule.HEIGHT);
    }

    public static C4OW A0M(InterfaceC94764Of interfaceC94764Of) {
        return new C4OW(new C94774Oi(interfaceC94764Of), "progressive_download_url");
    }

    public static C4OW A0N(InterfaceC94764Of interfaceC94764Of) {
        return new C4OW(new C94774Oi(interfaceC94764Of), "offset_x");
    }

    public static C4OW A0O(InterfaceC94764Of interfaceC94764Of) {
        return new C4OW(new C94774Oi(interfaceC94764Of), "attribution_cta_action_url");
    }

    public static C4OW A0P(InterfaceC94764Of interfaceC94764Of) {
        return new C4OW(new C94774Oi(interfaceC94764Of), "original_audio_title");
    }

    public static C4OW A0Q(InterfaceC94764Of interfaceC94764Of) {
        return new C4OW(new C94774Oi(interfaceC94764Of), "attribution_cta_text");
    }

    public static C4OW A0R(InterfaceC94764Of interfaceC94764Of) {
        return new C4OW(new C94774Oi(interfaceC94764Of), "attribution_icon_url");
    }

    public static C4OW A0S(InterfaceC94764Of interfaceC94764Of) {
        return new C4OW(new C94774Oi(interfaceC94764Of), "attribution_subtitle");
    }

    public static C4OW A0T(InterfaceC94764Of interfaceC94764Of) {
        return new C4OW(new C94774Oi(interfaceC94764Of), "attribution_title");
    }

    public static C4OW A0U(InterfaceC94764Of interfaceC94764Of) {
        return new C4OW(new C94774Oi(interfaceC94764Of), "is_pivot_page_available");
    }

    public static C4OW A0V(InterfaceC94764Of interfaceC94764Of) {
        return new C4OW(new C94774Oi(interfaceC94764Of), "allows_saving");
    }

    public static C4OW A0W(InterfaceC94764Of interfaceC94764Of) {
        return new C4OW(new C94774Oi(interfaceC94764Of), "cover_artwork_uri");
    }

    public static C4OW A0X(InterfaceC94764Of interfaceC94764Of) {
        return new C4OW(new C94774Oi(interfaceC94764Of), "audio_asset_id");
    }

    public static C4OW A0Y(InterfaceC94764Of interfaceC94764Of) {
        return new C4OW(new C94774Oi(interfaceC94764Of), "audio_start_time_in_ms");
    }

    public static C4OW A0Z(InterfaceC94764Of interfaceC94764Of) {
        return new C4OW(new C94774Oi(interfaceC94764Of), "display_artist");
    }

    public static C4OW A0a(InterfaceC94764Of interfaceC94764Of) {
        return new C4OW(new C94774Oi(interfaceC94764Of), "music_canonical_id");
    }

    public static C4OW A0b(InterfaceC94764Of interfaceC94764Of) {
        return new C4OW(new C94774Oi(interfaceC94764Of), "should_mute_audio_reason");
    }

    public static C4OW A0c(InterfaceC94764Of interfaceC94764Of) {
        return new C4OW(new C94774Oi(interfaceC94764Of), "should_mute_audio");
    }

    public static C4OW A0d(InterfaceC94764Of interfaceC94764Of) {
        return new C4OW(new C94774Oi(interfaceC94764Of), "duration_in_ms");
    }

    public static C4OW A0e(InterfaceC94764Of interfaceC94764Of) {
        return new C4OW(new C94774Oi(interfaceC94764Of), "audio_type");
    }

    public static C4OW A0f(InterfaceC94764Of interfaceC94764Of) {
        return new C4OW(new C94774Oi(interfaceC94764Of), "original_audio_subtype");
    }

    public static C4OW A0g(InterfaceC94764Of interfaceC94764Of) {
        return new C4OW(new C94774Oi(interfaceC94764Of), "dash_manifest");
    }

    public static C4OW A0h(InterfaceC94764Of interfaceC94764Of) {
        return new C4OW(new C94774Oi(interfaceC94764Of), "hide_remixing");
    }

    public static C4OW A0i(InterfaceC94764Of interfaceC94764Of) {
        return new C4OW(new C94774Oi(interfaceC94764Of), "is_bookmarked");
    }

    public static C4OW A0j(InterfaceC94764Of interfaceC94764Of) {
        return new C4OW(new C94774Oi(interfaceC94764Of), "allow_creator_to_rename");
    }

    public static C4OU A0k() {
        C94754Oe c94754Oe = C94754Oe.A00;
        return new C4OU(new C4OM[]{new C4OW(c94754Oe, "contextual_highlight_destination_type"), new C4OW(new C94774Oi(c94754Oe), "contextual_highlight_id"), new C4OW(new C94774Oi(c94754Oe), "contextual_highlight_title"), new C4OW(new C94774Oi(c94754Oe), "contextual_highlight_type"), new C4OW(c94754Oe, "chaining_media_id")});
    }

    public static C4OU A0l() {
        C94754Oe c94754Oe = C94754Oe.A00;
        return new C4OU(new C4OM[]{new C4OW(new C94774Oi(c94754Oe), "asset_id"), new C4OW(new C94774Oi(c94754Oe), "asset_name"), new C4OW(new C94774Oi(c94754Oe), "asset_type"), new C4OW(c94754Oe, "cover_artwork_thumbnail_uri"), new C4OW(c94754Oe, "extra")});
    }

    public static C4OU A0m() {
        C4OW c4ow = new C4OW(C173847oc.A00, "animation_time_sec");
        C94754Oe c94754Oe = C94754Oe.A00;
        return new C4OU(new C4OM[]{c4ow, new C4OW(c94754Oe, "cta_bar_type"), new C4OW(c94754Oe, "destination"), new C4OW(c94754Oe, "dominant_color"), new C4OW(C94894Ou.A00, "dwell_time_sec"), new C4OW(c94754Oe, DialogModule.KEY_TITLE), new C4OW(c94754Oe, "toggled_destination"), new C4OW(c94754Oe, "toggled_title")});
    }

    public static C4OU A0n() {
        C94754Oe c94754Oe = C94754Oe.A00;
        C4OW c4ow = new C4OW(c94754Oe, "full_name");
        C4OW c4ow2 = new C4OW(c94754Oe, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        C95124Py c95124Py = C95124Py.A00;
        return new C4OU(new C4OM[]{c4ow, c4ow2, new C4OW(c95124Py, "is_private"), new C4OW(c95124Py, "is_verified"), new C4OW(c94754Oe, "pk"), new C4OW(c94754Oe, "pk_id"), new C4OW(c94754Oe, "profile_pic_id"), new C4OW(c94754Oe, "profile_pic_url"), new C4OW(c94754Oe, AbstractC70143W6w.A00())});
    }

    public static C4OU A0o() {
        C94754Oe c94754Oe = C94754Oe.A00;
        return new C4OU(new C4OM[]{new C4OW(c94754Oe, "amount"), new C4OW(c94754Oe, "amount_with_offset"), new C4OW(c94754Oe, "currency"), new C4OW(C94894Ou.A00, "offset")});
    }

    public static C4OU A0p() {
        C95124Py c95124Py = C95124Py.A00;
        C4OW c4ow = new C4OW(c95124Py, "disabled_sharing_products_to_guides");
        C94754Oe c94754Oe = C94754Oe.A00;
        return new C4OU(new C4OM[]{c4ow, new C4OW(c94754Oe, PublicKeyCredentialControllerUtility.JSON_KEY_ID), new C4OW(c95124Py, "is_verified"), new C4OW(c94754Oe, "pk"), new C4OW(c94754Oe, "profile_pic_url"), new C4OW(c94754Oe, "storefront_attribution_username"), new C4OW(c94754Oe, AbstractC70143W6w.A00())});
    }

    public static C4OU A0q() {
        C95124Py c95124Py = C95124Py.A00;
        C4OW c4ow = new C4OW(c95124Py, "disabled_sharing_products_to_guides");
        C4OW c4ow2 = new C4OW(c95124Py, "is_verified");
        C94754Oe c94754Oe = C94754Oe.A00;
        return new C4OU(new C4OM[]{c4ow, c4ow2, new C4OW(c94754Oe, "pk"), new C4OW(c94754Oe, "profile_pic_url"), new C4OW(c94754Oe, "storefront_attribution_username"), new C4OW(c94754Oe, AbstractC65709Tsi.A01())});
    }

    public static C4OU A0r() {
        return new C4OU(new C4OM[]{new C4OW(C173847oc.A00, "average_rating"), new C4OW(C94894Ou.A00, "review_count")});
    }

    public static C4OU A0s() {
        return new C4OU(new C4OM[]{new C4OW(C94894Ou.A00, "rating_count"), new C4OW(C173847oc.A00, IntentModule.EXTRA_MAP_KEY_FOR_VALUE)});
    }

    public static C4OU A0t() {
        C94754Oe c94754Oe = C94754Oe.A00;
        return new C4OU(new C4OM[]{new C4OW(c94754Oe, "cover_photo"), new C4OW(C94894Ou.A00, "post_count"), new C4OW(c94754Oe, "world_id")});
    }

    public static C4OU A0u() {
        C94754Oe c94754Oe = C94754Oe.A00;
        return new C4OU(new C4OM[]{new C4OW(c94754Oe, "label_display_value"), new C4OW(c94754Oe, "label_type")});
    }

    public static C4OU A0v() {
        C95124Py c95124Py = C95124Py.A00;
        return new C4OU(new C4OM[]{new C4OW(new C94774Oi(c95124Py), "is_bookmarked"), new C4OW(new C94774Oi(c95124Py), "is_trending_in_clips"), new C4OW(new C94774Oi(C94754Oe.A00), "should_mute_audio_reason")});
    }

    public static C4OU A0w() {
        C94754Oe c94754Oe = C94754Oe.A00;
        return new C4OU(new C4OM[]{new C4OW(c94754Oe, "uri"), new C4OW(c94754Oe, "response_id"), new C4OW(c94754Oe, "image_id"), new C4OW(c94754Oe, TraceFieldType.RequestID), new C4OW(c94754Oe, "media_type")});
    }

    public static C4OU A0x() {
        C94894Ou c94894Ou = C94894Ou.A00;
        return new C4OU(new C4OM[]{new C4OW(c94894Ou, "icon_glyph"), new C4OW(c94894Ou, "icon_type"), new C4OW(C94754Oe.A00, PublicKeyCredentialControllerUtility.JSON_KEY_NAME)});
    }

    public static C4OU A0y() {
        C94754Oe c94754Oe = C94754Oe.A00;
        return new C4OU(new C4OM[]{new C4OW(c94754Oe, "cta_text"), new C4OW(c94754Oe, DevServerEntity.COLUMN_DESCRIPTION), new C4OW(new C94774Oi(c94754Oe), PublicKeyCredentialControllerUtility.JSON_KEY_ID), new C4OW(c94754Oe, PublicKeyCredentialControllerUtility.JSON_KEY_NAME), new C4OW(c94754Oe, "see_details_text")});
    }

    public static C4OU A0z() {
        C94894Ou c94894Ou = C94894Ou.A00;
        C4OW c4ow = new C4OW(new C94774Oi(c94894Ou), "appearance_effect");
        C4OW c4ow2 = new C4OW(new C94774Oi(c94894Ou), "camera_tool");
        C4OW c4ow3 = new C4OW(new C94774Oi(C94754Oe.A00), "color_filters");
        C173847oc c173847oc = C173847oc.A00;
        return new C4OU(new C4OM[]{c4ow, c4ow2, c4ow3, new C4OW(c173847oc, "duration_selector_seconds"), new C4OW(c173847oc, "speed_selector"), new C4OW(c173847oc, "timer_selector_seconds")});
    }

    public static C4OU A10() {
        C173847oc c173847oc = C173847oc.A00;
        return new C4OU(new C4OM[]{new C4OW(new C94774Oi(c173847oc), "crop_bottom"), new C4OW(new C94774Oi(c173847oc), "crop_left"), new C4OW(new C94774Oi(c173847oc), "crop_right"), new C4OW(new C94774Oi(c173847oc), "crop_top")});
    }

    public static C4OU A11(InterfaceC94764Of interfaceC94764Of, C4Og c4Og) {
        return new C4OU(new C4OM[]{new C4OW(c4Og, PublicKeyCredentialControllerUtility.JSON_KEY_ID), new C4OW(new C94774Oi(C95124Py.A00), "is_preselected"), new C4OW(new C94774Oi(interfaceC94764Of), PublicKeyCredentialControllerUtility.JSON_KEY_NAME), new C4OW(interfaceC94764Of, "normalized_value"), new C4OW(new C94774Oi(interfaceC94764Of), IntentModule.EXTRA_MAP_KEY_FOR_VALUE), new C4OW(new C94774Oi(interfaceC94764Of), "visual_style")});
    }

    public static V0Q A12(String str, String str2, String str3, String str4) {
        Bundle bundle = new Bundle();
        bundle.putString("media_id", str);
        bundle.putString("boosted_id", str2);
        bundle.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str3);
        bundle.putString("page_id", str4);
        V0Q v0q = new V0Q();
        v0q.setArguments(bundle);
        return v0q;
    }

    public static String A14(C69490VoD c69490VoD, C38321qM c38321qM) {
        String boostUnavailableReason = c38321qM.A0C.getBoostUnavailableReason();
        if (boostUnavailableReason == null) {
            String string = c69490VoD.A02.getString(2131957633);
            C14360o3.A07(string);
            return string;
        }
        return boostUnavailableReason;
    }

    public static String A17(Object obj, Map map) {
        map.put("elevation", "number");
        map.put("filter", "Filter");
        map.put("importantForAccessibility", obj);
        map.put("mixBlendMode", obj);
        map.put("nativeID", obj);
        map.put("onClick", "boolean");
        map.put("onClickCapture", "boolean");
        map.put("onMoveShouldSetResponder", "boolean");
        map.put("onMoveShouldSetResponderCapture", "boolean");
        return "boolean";
    }

    public static String A18(Map map) {
        map.put("backgroundColor", "Color");
        map.put("borderBottomColor", "Color");
        map.put("borderBottomLeftRadius", "number");
        map.put("borderBottomRightRadius", "number");
        map.put("borderBottomWidth", "number");
        map.put("borderColor", "Color");
        return "number";
    }

    public static String A19(Map map) {
        map.put("accessibilityActions", "Array");
        map.put("accessibilityCollection", "Map");
        map.put("accessibilityCollectionItem", "Map");
        map.put("accessibilityHint", "String");
        map.put("accessibilityLabel", "String");
        map.put("accessibilityLabelledBy", "Dynamic");
        map.put("accessibilityLiveRegion", "String");
        map.put("accessibilityRole", "String");
        map.put("accessibilityState", "Map");
        map.put("accessibilityValue", "Map");
        return "String";
    }

    public static String A1A(Map map) {
        map.put("accessibilityCollection", "Map");
        map.put("accessibilityCollectionItem", "Map");
        map.put("accessibilityHint", "String");
        map.put("accessibilityLabel", "String");
        return "String";
    }

    public static HashMap A1B(Object obj, Object obj2) {
        HashMap hashMap = new HashMap();
        hashMap.put("bubbled", obj);
        hashMap.put("captured", obj2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("phasedRegistrationNames", hashMap);
        return hashMap2;
    }

    public static List A1C(String str, String str2) {
        List singletonList = Collections.singletonList(new FormMutationEvent(str, str2));
        C14360o3.A07(singletonList);
        return singletonList;
    }

    public static C73833Sq A1E(String str, InterfaceC73823Sp interfaceC73823Sp, int i) {
        C73833Sq c73833Sq = new C73833Sq(str, interfaceC73823Sp, i);
        c73833Sq.A00("flowType");
        c73833Sq.A00(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
        c73833Sq.A01("reason", true);
        c73833Sq.A00("group");
        return c73833Sq;
    }

    public static void A1F(Path path, RectF rectF) {
        path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
    }

    public static void A1G(Bundle bundle, Iterable iterable, Object obj, String str, boolean z) {
        ArrayList<String> arrayList = new ArrayList<>();
        AbstractC001800i.A0r(iterable, arrayList);
        bundle.putStringArrayList("instagram_positions", arrayList);
        bundle.putString("media_id", str);
        bundle.putString("call_to_action", obj.toString());
        bundle.putBoolean("is_fb_placement_eligible", z);
    }

    public static void A1M(C18920wW c18920wW, String str, String str2) {
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, str);
        if (A00.isSampled()) {
            A00.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
            A00.A7v("is_e2ee", true);
            A00.Cht();
        }
    }

    public static void A1Q(Object obj, Object obj2, Object obj3, Map map) {
        map.put(obj, obj2);
        map.put("borderStyle", obj3);
        map.put("borderTopColor", "Color");
        map.put("borderTopLeftRadius", obj2);
        map.put("borderTopRightRadius", obj2);
        map.put("borderTopWidth", obj2);
        map.put("borderWidth", obj2);
        map.put("boxShadow", "BoxShadow");
    }

    public static void A1R(Object obj, Object obj2, Object obj3, Map map) {
        map.put(obj, obj2);
        map.put("transform", "Array");
        map.put("transformOrigin", "Array");
        map.put("translateX", obj3);
        map.put("translateY", obj3);
    }

    public static void A1S(Object obj, Object obj2, Map map) {
        map.put("renderToHardwareTextureAndroid", "boolean");
        map.put("role", obj);
        map.put("rotation", obj2);
        map.put("scaleX", obj2);
        map.put("scaleY", obj2);
    }

    public static void A1T(Object obj, Object obj2, Map map) {
        map.put("outlineColor", "Color");
        map.put("outlineOffset", obj);
        map.put("outlineStyle", obj2);
        map.put("outlineWidth", obj);
    }

    public static void A1U(Object obj, Map map) {
        map.put("borderLeftColor", "Color");
        map.put("borderLeftWidth", obj);
        map.put("borderRadius", obj);
        map.put("borderRightColor", "Color");
    }

    public static void A1V(Object obj, Map map) {
        map.put("accessibilityLabelledBy", "Dynamic");
        map.put("accessibilityLiveRegion", obj);
        map.put("accessibilityRole", obj);
        map.put("accessibilityState", "Map");
        map.put("accessibilityValue", "Map");
    }

    public static void A1W(Object obj, Map map) {
        map.put("role", obj);
        map.put("rotation", "number");
        map.put("scaleX", "number");
        map.put("scaleY", "number");
        map.put("shadowColor", "Color");
        map.put("testID", obj);
        map.put("transform", "Array");
        map.put("transformOrigin", "Array");
        map.put("translateX", "number");
        map.put("translateY", "number");
        map.put("zIndex", "number");
    }

    public static void A1Z(Map map) {
        map.put("onClick", "boolean");
        map.put("onClickCapture", "boolean");
        map.put("onMoveShouldSetResponder", "boolean");
        map.put("onMoveShouldSetResponderCapture", "boolean");
    }

    public static boolean A1b(Object obj, boolean z) {
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return z;
    }

    public static String A15(C67871V0c c67871V0c, int i) {
        int i2 = C67871V0c.A00(c67871V0c).A06;
        Currency currency = C67871V0c.A00(c67871V0c).A1j;
        C14360o3.A06(currency);
        return WG3.A02(currency, i, i2);
    }

    public static void A1I(Spanned spanned, C6RB c6rb, Class cls, Collection collection, Collection collection2) {
        AnonymousClass016.A18(collection, C4GL.A06(spanned, cls));
        Spannable spannable = c6rb.A0F;
        C14360o3.A07(spannable);
        AnonymousClass016.A18(collection2, C4GL.A06(spannable, C202888y6.class));
    }

    public static void A1J(View view, boolean z) {
        if (view.getParent() != null) {
            view.getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    public static void A1K(Fragment fragment) {
        FragmentActivity requireActivity = fragment.requireActivity();
        C14360o3.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
        ((BaseFragmentActivity) requireActivity).A0a();
    }

    public static void A1L(AbstractC02600Aj abstractC02600Aj, AbstractC67878V0j abstractC67878V0j) {
        String str = abstractC67878V0j.A06().A0J;
        if (str != null) {
            abstractC02600Aj.A0R("query_text", str);
            abstractC02600Aj.A0R("search_session_id", abstractC67878V0j.A06().A04());
            abstractC02600Aj.A0R("rank_token", abstractC67878V0j.A07().A03());
            abstractC02600Aj.Cht();
            return;
        }
        C14360o3.A0F("query");
        throw C00O.createAndThrow();
    }

    public static void A1N(Number number, Object obj, Object obj2, Map map) {
        map.put(obj, obj2);
        if (number != null) {
            map.put("component_data_id", Long.valueOf(number.longValue()));
        }
    }

    public static void A1O(Object obj, Object obj2, Object obj3, AbstractMap abstractMap) {
        abstractMap.put(obj, obj2);
        if (obj3 != null) {
            abstractMap.put("target_name", obj3);
        }
    }

    public static void A1P(Object obj, Object obj2, Object obj3, Map map) {
        map.put(obj, obj2);
        map.put("mixBlendMode", obj3);
        map.put("nativeID", obj3);
    }

    public static void A1X(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(C449124v.A02((String) it.next()));
    }

    public static void A1Y(Iterator it, Map map) {
        Object next = it.next();
        map.put(((LocalInjectionUnit) next).unitId, next);
    }

    public static boolean A1a(View view) {
        if (view.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }
}
