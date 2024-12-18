package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Matrix;
import android.media.MediaCodec;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.dextricks.DexOptimization;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.odin.model.FeatureData;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.freetransform.widget.ClipTransformItemView;
import com.instagram.igtv.widget.TitleDescriptionEditor;
import com.instagram.modal.TransparentBackgroundModalActivity;
import com.instagram.shopping.model.taggingfeed.ShoppingTaggingFeedClientState;
import com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState;
import com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo;
import com.instagram.tagging.widget.TagsInteractiveLayout;
import com.instagram.ui.igeditseekbar.IgEditSeekBar;
import com.instagram.user.model.ProductCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: X.MSc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50524MSc {
    public static C1ON A07(C2JM c2jm, AbstractC12990ll abstractC12990ll, Class cls, Integer num, String str) {
        C907442n c907442n = new C907442n(c2jm, cls, str, true);
        C907542o c907542o = new C907542o(abstractC12990ll);
        c907542o.A08(c907442n);
        return c907542o.A07(num);
    }

    public static void A0J(TitleDescriptionEditor titleDescriptionEditor) {
        titleDescriptionEditor.A0L = false;
        titleDescriptionEditor.A0N = true;
        titleDescriptionEditor.A0M = true;
        titleDescriptionEditor.A0I = null;
        titleDescriptionEditor.A09 = null;
        View.inflate(titleDescriptionEditor.getContext(), R.layout.title_description_layout, titleDescriptionEditor);
    }

    public static void A0K(ShoppingTaggingFeedClientState shoppingTaggingFeedClientState, Object obj) {
        List A0W = AbstractC001800i.A0W(AbstractC06950Ym.A1F(AbstractC16960so.A1Q(shoppingTaggingFeedClientState.A03, AbstractC16960so.A1O(obj))));
        C14360o3.A0B(A0W, 0);
        shoppingTaggingFeedClientState.A03 = A0W;
    }

    public static double A00(AbstractMap abstractMap) {
        FeatureData featureData = (FeatureData) abstractMap.get("333");
        if (featureData != null) {
            return featureData.A00;
        }
        return -1.0d;
    }

    public static FragmentActivity A04() {
        OVM ovm = OVM.A00;
        String str = (String) OVR.A03.A0R();
        if (str == null) {
            return null;
        }
        return (FragmentActivity) ovm.A00(str);
    }

    public static InterfaceC02590Ai A05(C18920wW c18920wW, String str, String str2, String str3, String str4) {
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, str);
        A00.AAP("product", str2);
        A00.AAP("product_type", str3);
        A00.AAP("container_module", str4);
        return A00;
    }

    public static C0CA A06(Object obj) {
        C04060Jx c04060Jx = GraphQlCallInput.A02;
        String obj2 = UUID.randomUUID().toString();
        C0CA A02 = c04060Jx.A02();
        C0CA.A00(A02, obj2, "client_mutation_id");
        C0CA.A00(A02, obj, "unpublished_content_id");
        return A02;
    }

    public static IgEditSeekBar A08(Context context, LinearLayout linearLayout) {
        linearLayout.setGravity(17);
        linearLayout.setBackgroundResource(AbstractC53242c7.A0D(context));
        IgEditSeekBar igEditSeekBar = new IgEditSeekBar(context);
        ((AbstractC66357UBy) igEditSeekBar).A01 = 0.0f;
        ((AbstractC66357UBy) igEditSeekBar).A02 = 100;
        return igEditSeekBar;
    }

    public static void A0C(Activity activity, Bundle bundle, AbstractC12990ll abstractC12990ll) {
        C6XJ c6xj = new C6XJ(activity, bundle, abstractC12990ll, TransparentBackgroundModalActivity.class, "bottom_sheet");
        c6xj.A09(0);
        c6xj.A0C(activity.getApplicationContext());
    }

    public static void A0D(Matrix matrix, ClipTransformItemView clipTransformItemView, float f, float f2) {
        float f3 = clipTransformItemView.A01;
        matrix.postScale(f3, f3, f, f2);
        matrix.postRotate(clipTransformItemView.A00, f, f2);
        matrix.postTranslate(clipTransformItemView.A02 * clipTransformItemView.A04.width(), clipTransformItemView.A03 * clipTransformItemView.A04.height());
    }

    public static void A0E(Fragment fragment, Object obj) {
        InputMethodManager inputMethodManager;
        if (obj != null) {
            Object systemService = fragment.requireActivity().getSystemService("input_method");
            if ((systemService instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) systemService) != null) {
                inputMethodManager.toggleSoftInput(1, 0);
            }
        }
    }

    public static void A0F(AbstractC02600Aj abstractC02600Aj, String str, String str2, String str3) {
        abstractC02600Aj.A0R("flow_name", str);
        abstractC02600Aj.A0R("flow_step", str2);
        abstractC02600Aj.A0R("event_name", str3);
        abstractC02600Aj.A0R("event_type", DexOptimization.OPT_KEY_CLIENT);
    }

    public static void A0G(C25531Mh c25531Mh, int i) {
        c25531Mh.A0c(AnonymousClass249.VIDEO);
        c25531Mh.A0m(C22F.A09.getModuleName());
        c25531Mh.A0Q("segment_index", Long.valueOf(i));
        c25531Mh.A0U();
    }

    public static void A0H(C55612Omv c55612Omv, Object obj, Object obj2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, obj);
        jSONObject.put("data", obj2);
        c55612Omv.A01.A00(jSONObject);
    }

    public static void A0L(MediaTaggingInfo mediaTaggingInfo, ArrayList arrayList) {
        mediaTaggingInfo.A0B = arrayList;
        mediaTaggingInfo.A0F = new ArrayList();
        mediaTaggingInfo.A0C = new ArrayList();
        mediaTaggingInfo.A0A = new ArrayList();
        mediaTaggingInfo.A0D = new ArrayList();
        mediaTaggingInfo.A0E = new ArrayList();
        mediaTaggingInfo.A09 = new ArrayList();
        mediaTaggingInfo.A00 = 1.0f;
        mediaTaggingInfo.A0G = new ArrayList();
    }

    public static void A0M(StringBuilder sb, int i, int i2, int i3, int i4) {
        sb.append(",b=");
        sb.append(i);
        sb.append(",f=");
        sb.append(i2);
        sb.append(",profile=");
        sb.append(i3);
        sb.append(",mode=");
        sb.append(i4);
        sb.append(",interval=");
    }

    public static boolean A0O(TagsInteractiveLayout tagsInteractiveLayout) {
        tagsInteractiveLayout.A0A = new ArrayList();
        tagsInteractiveLayout.A0B = new ArrayList();
        tagsInteractiveLayout.A09 = new ArrayList();
        tagsInteractiveLayout.A0C = new ArrayList();
        tagsInteractiveLayout.A0H = false;
        tagsInteractiveLayout.A0G = false;
        return false;
    }

    public static int A01(View view) {
        return (int) (((view.getLeft() + view.getRight()) / 2) + view.getTranslationX());
    }

    public static int A02(View view) {
        return (int) (((view.getTop() + view.getBottom()) / 2) + view.getTranslationY());
    }

    public static long A03() {
        long currentTimeMillis = System.currentTimeMillis();
        return (currentTimeMillis - ((TimeZone.getDefault().getOffset(currentTimeMillis) + currentTimeMillis) % 86400000)) / 1000;
    }

    public static IllegalStateException A09(MediaCodec.BufferInfo bufferInfo, String str, StringBuilder sb, int i, int i2) {
        sb.append(str);
        sb.append(i);
        sb.append(" offs=");
        sb.append(bufferInfo.offset);
        sb.append(" sz=");
        sb.append(bufferInfo.size);
        sb.append(" pts=");
        sb.append(bufferInfo.presentationTimeUs);
        sb.append(" cnt=");
        sb.append(i2);
        return new IllegalStateException(sb.toString());
    }

    public static String A0A(ShoppingTaggingFeedClientState shoppingTaggingFeedClientState, TaggingFeedMultiSelectState taggingFeedMultiSelectState) {
        AbstractC41710Idg.A02(shoppingTaggingFeedClientState, AbstractC41363ISq.A00(taggingFeedMultiSelectState));
        ProductCollection productCollection = (ProductCollection) AbstractC001800i.A0A(taggingFeedMultiSelectState.A02.values());
        if (productCollection != null) {
            return productCollection.Ap3();
        }
        return null;
    }

    public static String A0B(InterfaceC09390do interfaceC09390do) {
        String str = ((C22F) AnonymousClass229.A01((UserSession) interfaceC09390do.getValue())).A04.A0L;
        if (str == null) {
            return "unknown";
        }
        return str;
    }

    public static void A0N(AbstractList abstractList, int i) {
        if (i < abstractList.size()) {
            NI7 ni7 = (NI7) abstractList.get(i);
            ni7.A07.post(new RunnableC56875PLu(ni7));
            abstractList.remove(i);
        }
    }

    public static void A0I(C55982hj c55982hj, InterfaceC55932he interfaceC55932he) {
        c55982hj.A09(C55942hf.A04(33.0d, 8.0d));
        c55982hj.A00 = 0.001d;
        c55982hj.A02 = 0.001d;
        c55982hj.A08(0.0d, true);
        c55982hj.A0A(interfaceC55932he);
    }
}
