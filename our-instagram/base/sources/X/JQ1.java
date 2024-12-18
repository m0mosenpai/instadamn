package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.graphql.enums.EnumHelper;
import com.facebook.msys.mci.CQLResultSet;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.base.MediaSession;
import com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.Media;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import com.instagram.direct.model.DirectThreadThemeInfo;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.ui.widget.stackedavatar.StackedAvatarView;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class JQ1 {
    public static int A00(AbstractC70663Fe abstractC70663Fe, AbstractC61802rh abstractC61802rh, int i) {
        C14360o3.A0B(abstractC70663Fe, 0);
        View A03 = abstractC61802rh.A03(abstractC70663Fe);
        if (A03 == null) {
            return -1;
        }
        int A0C = AbstractC70663Fe.A0C(A03);
        if (i < 0) {
            return Math.max(0, A0C - 1);
        }
        return Math.min(A0C + 1, abstractC70663Fe.A0U() - 1);
    }

    public static long A01(C229419w c229419w, long j) {
        C06090Tz A00 = C06090Tz.A00(new C06090Tz());
        A00.A01 = true;
        C06090Tz A002 = C06090Tz.A00(A00);
        A002.A03 = true;
        return c229419w.BPF(A002, j);
    }

    public static Bitmap A03(Bitmap bitmap, float f, float f2) {
        float height = f / bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(f2, height);
        int width = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        C0fK.A03(bitmap);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height2, matrix, false);
        C14360o3.A07(createBitmap);
        bitmap.recycle();
        return createBitmap;
    }

    public static Bitmap A04(List list) {
        Object obj = list.get(0);
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.aiplatform.inputs.AiInputBitmap");
        Bitmap A00 = C0fK.A00(((C9VC) obj).A00, (int) (r6.getWidth() * 0.5d), (int) (r6.getHeight() * 0.5d), true);
        C14360o3.A07(A00);
        return A00;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.UPq] */
    public static C66628UPq A0A(List list, boolean z) {
        ArrayList arrayList = new ArrayList();
        ?? obj = new Object();
        obj.A00 = z ? 1 : 0;
        obj.A03 = null;
        obj.A02 = null;
        obj.A05 = list;
        obj.A04 = arrayList;
        obj.A01 = 5;
        obj.A06 = z;
        return obj;
    }

    public static void A0S(Context context, StackedAvatarView stackedAvatarView, boolean z) {
        if (z) {
            int dimension = (int) context.getResources().getDimension(R.dimen.account_recs_header_image_margin);
            int dimension2 = (int) context.getResources().getDimension(R.dimen.abc_control_corner_material);
            stackedAvatarView.A03(context, R.dimen.abc_dialog_padding_top_material);
            stackedAvatarView.setPadding(dimension, dimension2, 0, 0);
            return;
        }
        stackedAvatarView.A03(context, R.dimen.abc_dialog_padding_material);
    }

    public static void A0W(TextView textView, C7IK c7ik) {
        Resources resources = textView.getResources();
        textView.setAutoSizeTextTypeUniformWithConfiguration(resources.getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size), resources.getDimensionPixelSize(R.dimen.clips_template_landing_page_template_preview_clip_index_text_size), resources.getDimensionPixelSize(R.dimen.call_peek_promo_bottom_sheet_label_bottom_padding), 0);
        textView.setTextColor(c7ik.A0C);
    }

    public static void A0b(C3OO c3oo) {
        ImageView imageView;
        C14360o3.A0B(c3oo, 0);
        View view = c3oo.itemView;
        if ((view instanceof IgImageView) && (imageView = (ImageView) view) != null) {
            imageView.setImageDrawable(null);
        }
    }

    public static void A0g(C55736Op5 c55736Op5, Object obj, Object obj2, List list) {
        C15500q5.A06(obj, 1);
        list.add(obj);
        C20030yX c20030yX = c55736Op5.A03;
        C15500q5.A06(obj, 1);
        c20030yX.put(obj, obj2);
    }

    public static void A0j(AbstractC12990ll abstractC12990ll, C47Z c47z) {
        if (C18U.A06(C06090Tz.A05, abstractC12990ll, 36325660863640814L)) {
            c47z.A53 = true;
        } else {
            c47z.A4x = true;
        }
    }

    public static C0CA A06(Object obj, Object obj2) {
        C0CA A02 = GraphQlCallInput.A02.A02();
        C0CA.A00(A02, obj, "product_use_case");
        C0CA.A00(A02, obj2, "fbid");
        return A02;
    }

    public static C2JM A07(C2JM c2jm, String str, String str2, List list) {
        C2JM c2jm2 = new C2JM();
        C2JO c2jo = new C2JO();
        c2jo.A05("fetch_params", list);
        c2jo.A09(str, "experiment_params");
        c2jo.A09(str2, "user_agent");
        c2jm.A00(c2jo, "input");
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        return c2jm2;
    }

    public static C1Dk A08(PandoGraphQLRequest pandoGraphQLRequest) {
        return pandoGraphQLRequest.setFreshCacheAgeMs(0L).setMaxToleratedCacheAgeMs(0L);
    }

    public static C9C9 A09(MessagingUser messagingUser, String str) {
        String str2 = messagingUser.A03;
        C14360o3.A07(str2);
        return new C9C9(str, str2, 5);
    }

    public static C6XJ A0F(Fragment fragment, AbstractC12990ll abstractC12990ll) {
        C14360o3.A0C(abstractC12990ll, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
        INH A0C = AbstractC86593tX.A0C(C22P.A45);
        A0C.A0m = true;
        Bundle A00 = A0C.A00();
        A00.putBoolean("modal_dismiss_on_cancel", true);
        C6XJ A02 = C6XJ.A02(fragment.requireActivity(), A00, abstractC12990ll, TransparentModalActivity.class, "clips_camera");
        A02.A07();
        return A02;
    }

    public static DirectShareTarget A0G(AbstractC12990ll abstractC12990ll, DirectShareTarget directShareTarget, InterfaceC83713oG interfaceC83713oG) {
        if (C18U.A06(C06090Tz.A05, abstractC12990ll, 36313750920759533L)) {
            return new DirectShareTarget(interfaceC83713oG, (PendingRecipient) Collections.unmodifiableList(directShareTarget.A0Q).get(0));
        }
        return directShareTarget;
    }

    public static String A0L(K3a k3a, Object obj, byte[] bArr) {
        C18C.A07(obj, "Failed to resolve preview ID");
        if (bArr == null) {
            return null;
        }
        String A03 = C6JY.A03(k3a, bArr);
        C18C.A07(A03, "Failed to resolve header attribution ID");
        return A03;
    }

    public static String A0N(Object obj) {
        C09530e4 c09530e4 = (C09530e4) obj;
        C14360o3.A0B(c09530e4, 0);
        return ((C83403nh) c09530e4.A00).A0h();
    }

    public static List A0O(long j, long j2) {
        return CIX.A00(new C1132359l[]{new C1132359l(j), new C1132359l(j2)});
    }

    public static List A0P(C1132359l c1132359l, long j) {
        return CIX.A00(new C1132359l[]{c1132359l, new C1132359l(j)});
    }

    public static List A0Q(C1132359l c1132359l, C1132359l c1132359l2, long j) {
        return CIX.A00(new C1132359l[]{c1132359l, c1132359l2, new C1132359l(j)});
    }

    public static void A0T(BaseBundle baseBundle, Enum r3, String str, long j) {
        baseBundle.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MESSAGE_CLIENT_CONTEXT", str);
        baseBundle.putLong("DirectEmojiReactionsListFragment.MESSAGE_TIMESTAMP_MS", j);
        baseBundle.putInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MESSAGE_CONTENT_TYPE_ORDINAL", r3.ordinal());
    }

    public static void A0U(SpannableStringBuilder spannableStringBuilder, String str, int i) {
        AnonymousClass773.A02(spannableStringBuilder, new AnonymousClass772(new Integer(i)), str);
    }

    public static void A0V(ViewGroup viewGroup, Object obj, Object obj2, int i) {
        if (obj == obj2 && viewGroup.getChildCount() == 1) {
            viewGroup.getChildAt(0).measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredWidth(), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), i);
        }
    }

    public static void A0a(Fragment fragment, boolean z) {
        C189478aR A00 = F86.A00(C3DN.A00.A00(fragment.getActivity()));
        if (A00 != null) {
            A00.A0P(z);
        }
    }

    public static void A0c(InterfaceC02530Ab interfaceC02530Ab, InterfaceC02590Ai interfaceC02590Ai, String str, String str2) {
        interfaceC02590Ai.AAP(TraceFieldType.RequestID, str);
        interfaceC02590Ai.A8R(interfaceC02530Ab, "tray_type");
        interfaceC02590Ai.AAP("bottom_sheet_session_id", str2);
    }

    public static void A0e(C0Zx c0Zx, C0Zx c0Zx2, Object obj) {
        c0Zx.A01(C70199WGm.A01((EnumC72407Xcu) obj), "credential_type");
        List singletonList = Collections.singletonList(c0Zx);
        C14360o3.A07(singletonList);
        c0Zx2.A07("credential_container", singletonList);
    }

    public static void A0f(C2JM c2jm) {
        c2jm.A04("media_type", "image/png");
        c2jm.A03("scaling_factor", Double.valueOf(1.0d));
    }

    public static void A0m(EnumC40111tc enumC40111tc, C47Z c47z, String str, int i, int i2) {
        c47z.A1G = enumC40111tc;
        c47z.A0c(ShareType.A0E);
        c47z.A33 = str;
        c47z.A0H = i;
        c47z.A0G = i2;
        c47z.A0S = i;
        c47z.A0R = i2;
    }

    public static ColorStateList A02(View view) {
        Context context = view.getContext();
        return ColorStateList.valueOf(context.getColor(AbstractC53242c7.A0B(context)));
    }

    public static View A05(Fragment fragment, int i) {
        View findViewById = fragment.requireView().findViewById(i);
        C14360o3.A0A(findViewById);
        C14360o3.A07(findViewById);
        return findViewById;
    }

    public static AddMessageContent A0B(AbstractC60877RXa abstractC60877RXa, AbstractC60877RXa abstractC60877RXa2) {
        abstractC60877RXa.A04();
        AddMessageContent addMessageContent = (AddMessageContent) abstractC60877RXa.A00;
        RYn A02 = abstractC60877RXa2.A02();
        A02.getClass();
        addMessageContent.addMessageContent_ = A02;
        return addMessageContent;
    }

    public static Media A0C(AbstractC60877RXa abstractC60877RXa, AbstractC60877RXa abstractC60877RXa2) {
        abstractC60877RXa.A04();
        Media media = (Media) abstractC60877RXa.A00;
        RYn A02 = abstractC60877RXa2.A02();
        A02.getClass();
        media.media_ = A02;
        return media;
    }

    public static TransportPayload A0D(AbstractC60877RXa abstractC60877RXa, AbstractC60877RXa abstractC60877RXa2) {
        abstractC60877RXa.A04();
        TransportPayload transportPayload = (TransportPayload) abstractC60877RXa.A00;
        RYn A02 = abstractC60877RXa2.A02();
        A02.getClass();
        transportPayload.transportPayload_ = A02;
        return transportPayload;
    }

    public static C7IM A0E(C42201xA c42201xA, C49206LpN c49206LpN) {
        C7IM c7im = (C7IM) c42201xA.A0W();
        if (c7im == null) {
            DirectThreadThemeInfo A00 = AbstractC125795mU.A00();
            return C7ID.A00.A01(c49206LpN.A03, c49206LpN.A01, A00, C05F.A00);
        }
        return c7im;
    }

    public static Object A0H(AbstractC29011ae abstractC29011ae) {
        List C7R = abstractC29011ae.C7R();
        C14360o3.A07(C7R);
        Object A0I = AbstractC001800i.A0I(C7R);
        C14360o3.A07(A0I);
        return A0I;
    }

    public static String A0I(Fragment fragment, C35228FgL c35228FgL) {
        c35228FgL.A04(fragment.requireContext().getString(2131957741), fragment.requireContext().getString(2131957740), R.drawable.instagram_eye_off_pano_outline_24);
        c35228FgL.A04(fragment.requireContext().getString(2131957745), fragment.requireContext().getString(2131957744), R.drawable.instagram_photo_pano_outline_24);
        return fragment.requireContext().getString(2131957743);
    }

    public static String A0J(CQLResultSet cQLResultSet, int i, int i2) {
        Integer nullableInteger = cQLResultSet.getNullableInteger(i, i2);
        if (nullableInteger != null) {
            return Integer.toHexString(nullableInteger.intValue());
        }
        return null;
    }

    public static String A0K(CQLResultSet cQLResultSet, int i, int i2) {
        Integer nullableInteger = cQLResultSet.getNullableInteger(i, i2);
        if (nullableInteger != null) {
            return Integer.toHexString(nullableInteger.intValue());
        }
        return null;
    }

    public static String A0M(AnonymousClass841 anonymousClass841, int i) {
        return ((MediaSession) anonymousClass841.CpK().get(i)).BcD();
    }

    public static void A0R(Context context, C6RB c6rb) {
        AMr.A08(context, c6rb, context.getResources().getDimensionPixelSize(R.dimen.avatar_search_sticker_tray_text_size), 0.0f, 0.0f);
    }

    public static void A0X(TextView textView, C7IK c7ik) {
        Resources resources = textView.getResources();
        textView.setAutoSizeTextTypeUniformWithConfiguration(resources.getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size), resources.getDimensionPixelSize(R.dimen.clips_template_landing_page_template_preview_clip_index_text_size), resources.getDimensionPixelSize(R.dimen.call_peek_promo_bottom_sheet_label_bottom_padding), 0);
        textView.setTextColor(c7ik.A0C);
    }

    public static void A0Y(Fragment fragment) {
        AbstractC56402iY.A02(fragment.getActivity(), fragment.requireActivity().getColor(AbstractC53242c7.A0D(fragment.getContext())));
        C30D.A04(fragment.requireActivity(), fragment.requireActivity().getColor(AbstractC53242c7.A0D(fragment.getContext())));
    }

    public static void A0Z(Fragment fragment, int i) {
        InterfaceC53712dA interfaceC53712dA;
        ComponentCallbacks2 A00 = AbstractC13110lx.A00(fragment.requireActivity());
        if ((A00 instanceof InterfaceC53712dA) && (interfaceC53712dA = (InterfaceC53712dA) A00) != null) {
            interfaceC53712dA.EfL(i);
        }
    }

    public static void A0d(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP(AbstractC50529MSi.A01(), str);
        interfaceC02590Ai.A8R(C2O5.A09, "product_type");
        interfaceC02590Ai.A8R(EnumC31203Dnm.ANDROID, "platform");
        interfaceC02590Ai.A9K("actual_event_time", Long.valueOf(System.currentTimeMillis()));
    }

    public static void A0h(C16L c16l, AbstractCollection abstractCollection) {
        EnumC53282NhK enumC53282NhK = (EnumC53282NhK) EnumHelper.A00(c16l.A1Q(), EnumC53282NhK.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        if (enumC53282NhK != null) {
            abstractCollection.add(enumC53282NhK);
        }
    }

    public static void A0i(AbstractC52114N4m abstractC52114N4m) {
        abstractC52114N4m.A07().A04();
        abstractC52114N4m.A06().A01();
    }

    public static void A0k(UserSession userSession, Integer num) {
        AnonymousClass229.A01(userSession).A03.A07(AbstractC226359ys.A00(num));
    }

    public static void A0l(AbstractC2056898s abstractC2056898s, Number number, String str, String str2) {
        abstractC2056898s.A07(str, str2);
        if (number != null) {
            abstractC2056898s.A06("INTERVAL", number.intValue());
        }
    }

    public static void A0n(Object obj, Object obj2, AbstractMap abstractMap) {
        if (C14360o3.A0K(abstractMap.get(obj), obj2)) {
            abstractMap.remove(obj);
        }
    }

    public static void A0o(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(Integer.toHexString(Integer.parseInt((String) it.next())));
    }
}
