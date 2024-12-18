package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.ClearAndSetSemanticsElement;
import androidx.compose.ui.unit.Constraints;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.modal.ModalActivity;
import com.instagram.opal.impl.data.OpalProfileData;
import com.instagram.schools.management.data.SchoolSettingsRepository;
import com.instagram.user.model.User;
import com.meta.foa.cds.CdsBottomSheetDimmingBehaviour;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.BEt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25236BEt {
    public static View A0D(ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 1);
        View childAt = viewGroup.getChildAt(0);
        C14360o3.A0C(childAt, "null cannot be cast to non-null type com.instagram.common.ui.widget.imageview.IgImageView");
        return childAt;
    }

    public static Modifier A0J(C117505Tk c117505Tk, Modifier modifier, Object obj) {
        C117505Tk.A0L(c117505Tk, false);
        return modifier.Eq3(new ClearAndSetSemanticsElement((InterfaceC16660sJ) obj));
    }

    public static Modifier A0K(Modifier modifier) {
        return AbstractC118175Wb.A0E(AbstractC118185Wd.A02(C118195Wf.A0A, AbstractC118185Wd.A0D(modifier, 60.0f)), 3.0f, 0.0f, 9.0f, 0.0f);
    }

    public static C25766Ba5 A0L(List list) {
        return C6L6.A00(list, AbstractC119395aw.A00(0.0f, 0.0f), AbstractC119395aw.A00(0.0f, Float.POSITIVE_INFINITY));
    }

    public static MUW A0Q(Iterator it) {
        C2JS c2js = (C2JS) it.next();
        return new MUW(c2js.getOptionalEnumField(3, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, EnumC46230Kd6.UNSET_OR_UNRECOGNIZED_ENUM_VALUE), Boolean.valueOf(c2js.getCoercedBooleanField(1, "is_enabled")), c2js.getOptionalStringField(2, PublicKeyCredentialControllerUtility.JSON_KEY_NAME), c2js.getOptionalStringField(0, DevServerEntity.COLUMN_DESCRIPTION), 1);
    }

    public static C19K A0e(C12V c12v) {
        return AnonymousClass194.A02(AnonymousClass190.A02(c12v, new AnonymousClass197(null)));
    }

    public static void A0f(Rect rect, View view, int i, int i2) {
        AbstractC010103p.A0H(view, AbstractC16960so.A1Q(rect, new Rect(view.getWidth() - i, 0, view.getWidth(), i2)));
    }

    public static void A0k(C5Tl c5Tl, Modifier modifier, int i) {
        C6LQ.A05(c5Tl, AbstractC118185Wd.A0C(modifier, 120.0f), C5Y7.A00(c5Tl, i, 0));
    }

    public static void A0q(InterfaceC02590Ai interfaceC02590Ai, Integer num, String str, int i, int i2) {
        interfaceC02590Ai.A9K("position", Long.valueOf(i));
        interfaceC02590Ai.A8R(JTE.A01(str), "section");
        interfaceC02590Ai.AAP("time_bucket", JTE.A08(num));
        interfaceC02590Ai.A9K("num_hidden_stories_with_show_more", Long.valueOf(i2));
    }

    public static void A0s(C2JS c2js, SchoolSettingsRepository schoolSettingsRepository, Class cls, int i) {
        C2JS A03 = c2js.A03(cls, "show_schools_badge", i);
        if (A03 != null) {
            int requiredIntField = A03.getRequiredIntField(2, "graduation_year");
            String requiredStringField = A03.getRequiredStringField(0, "school_name");
            C14360o3.A0C(requiredStringField, "null cannot be cast to non-null type kotlin.String");
            String optionalStringField = A03.getOptionalStringField(1, "school_name_abbreviation");
            C14360o3.A0B(requiredStringField, 1);
            C128555rO c128555rO = new C128555rO(requiredIntField, requiredStringField, optionalStringField);
            C08730cb c08730cb = C17060sy.A01;
            UserSession userSession = schoolSettingsRepository.A00;
            c08730cb.A01(userSession).A03.EeH(c128555rO);
            AbstractC25651Mw.A00(userSession).E4s(new C36090FwQ(userSession.userId));
        }
    }

    public static void A0u(AbstractCollection abstractCollection, Iterator it) {
        C2JS c2js = (C2JS) it.next();
        C14360o3.A0A(c2js);
        C14360o3.A0B(c2js, 0);
        abstractCollection.add(new C51758Mth(21, c2js.getOptionalEnumField(0, "goal_metric", EnumC27416C7t.UNSET_OR_UNRECOGNIZED_ENUM_VALUE), c2js.getCoercedBooleanField(1, "is_complete")));
    }

    public static boolean A10(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.EkS(true);
        return false;
    }

    public static boolean A11(Object obj, C05A c05a, int i, boolean z) {
        return c05a.AIi(obj, new C51729Mt8(i, z, 7));
    }

    public static int A01(long j, int i) {
        return (i + ((int) (j ^ (j >>> 32)))) * 31;
    }

    public static long A07(int i, long j) {
        if (i != 0) {
            return j & 4294967295L;
        }
        return j >> 32;
    }

    public static Context A0A(C5Tl c5Tl) {
        Context applicationContext = ((Context) c5Tl.AJX(AndroidCompositionLocals_androidKt.A01)).getApplicationContext();
        C14360o3.A0C(applicationContext, "null cannot be cast to non-null type android.app.Application");
        return applicationContext;
    }

    public static ExtractedText A0E(C5C3 c5c3) {
        ExtractedText extractedText = new ExtractedText();
        String str = c5c3.A01.A00;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = c5c3.A00;
        extractedText.selectionStart = C5C2.A01(j);
        extractedText.selectionEnd = C5C2.A00(j);
        extractedText.flags = !AbstractC001900j.A0U(str, '\n') ? 1 : 0;
        return extractedText;
    }

    public static C5Y4 A0F() {
        return new C5Y4(new C119235af(1 | (1 << 32)), 1.0f, 400.0f);
    }

    public static InterfaceC1127857k A0M(C5Tl c5Tl, InterfaceC118245Wl interfaceC118245Wl, int i) {
        int i2 = ((i & 14) | 384) >> 3;
        return AbstractC119595bH.A02(AbstractC118255Wn.A07, c5Tl, interfaceC118245Wl, (i2 & 112) | (i2 & 14));
    }

    public static AbstractC52972be A0O(Object obj) {
        if (obj instanceof C07N) {
            return ((C07N) obj).getDefaultViewModelCreationExtras();
        }
        return C52962bd.A00;
    }

    public static InterfaceC02590Ai A0P(OTM otm) {
        C18920wW c18920wW = (C18920wW) otm.A01.getValue();
        return c18920wW.A00(c18920wW.A00, "ig_lock_screen_shortcuts");
    }

    public static MusicInfo A0R(C76623c7 c76623c7) {
        C3XR musicMetadata;
        InterfaceC76613c6 interfaceC76613c6 = c76623c7.A00;
        if (interfaceC76613c6.getClipsMetadata() != null) {
            C3x9 clipsMetadata = interfaceC76613c6.getClipsMetadata();
            if (clipsMetadata == null) {
                return null;
            }
            return clipsMetadata.BVc();
        }
        if (interfaceC76613c6.getMusicMetadata() == null || (musicMetadata = interfaceC76613c6.getMusicMetadata()) == null) {
            return null;
        }
        return musicMetadata.BVc();
    }

    public static W1X A0T() {
        U6H u6h = U6H.A06;
        Integer num = C05F.A0C;
        U6G u6g = C65981Txa.A0R;
        EnumC68205VFx enumC68205VFx = C65981Txa.A0N;
        EnumC68201VFt enumC68201VFt = C65981Txa.A0Q;
        return new W1X(CdsBottomSheetDimmingBehaviour.Default.A00, null, enumC68205VFx, null, EnumC68200VFs.A04, enumC68201VFt, u6g, u6h, null, num, null, false);
    }

    public static C26367BlC A0U(Object obj) {
        C51722Yv c51722Yv = (C51722Yv) obj;
        C14360o3.A0B(c51722Yv, 0);
        return new C26367BlC(c51722Yv, C29517CzV.A00, false);
    }

    public static Object A0W(C5Tl c5Tl, Object obj, Object obj2) {
        if (obj == obj2) {
            C5Y1 A00 = AbstractC118385Xa.A00(0.0f);
            c5Tl.FBy(A00);
            return A00;
        }
        return obj;
    }

    public static String A0X(C38321qM c38321qM) {
        User CDj = c38321qM.A0C.CDj();
        if (CDj != null) {
            return CDj.getUsername();
        }
        return "";
    }

    public static Iterator A0b(CharSequence charSequence) {
        return AbstractC001800i.A0Y(AbstractC224517h.A02(AbstractC224517h.A09(C30154DQk.A00, AbstractC224517h.A04(C30153DQj.A00, new C11L("@\\[\\d+:(.+?)]").A04(charSequence))))).iterator();
    }

    public static LinkedHashMap A0c(Object obj, C09530e4 c09530e4, C09530e4 c09530e42, C09530e4 c09530e43, C09530e4 c09530e44) {
        return AbstractC06930Yk.A06(c09530e4, c09530e42, c09530e43, c09530e44, new C09530e4("utm_content", obj));
    }

    public static void A0g(RectF rectF, View view, float f, float f2) {
        float f3 = f2 / 2.0f;
        rectF.set((view.getWidth() / 2.0f) - f, view.getHeight() - f3, (view.getWidth() / 2.0f) + f, view.getHeight() + f3);
    }

    public static void A0h(Bundle bundle, Fragment fragment, AbstractC12990ll abstractC12990ll) {
        C6XJ c6xj = new C6XJ(fragment.requireActivity(), bundle, abstractC12990ll, ModalActivity.class, "profile");
        c6xj.A0J = ModalActivity.A08;
        c6xj.A0C(fragment.requireContext());
    }

    public static void A0i(Interpolator interpolator, C89813zN c89813zN, InterfaceC79483gv interfaceC79483gv, float f, int i) {
        c89813zN.A02 = new C89803zM(interpolator, i);
        c89813zN.A03(interfaceC79483gv);
        c89813zN.A02(f);
        c89813zN.A02 = new C89803zM(new DecelerateInterpolator(), i);
    }

    public static void A0p(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("image_height", (Long) c11520jB.A01(C5I8.A7F));
        interfaceC02590Ai.A7v("hide_caption", (Boolean) c11520jB.A01(C5I8.A7D));
        interfaceC02590Ai.A7v("hide_social_context", (Boolean) c11520jB.A01(C5I8.A7E));
        interfaceC02590Ai.A7v("dismissible", (Boolean) c11520jB.A01(C5I8.A79));
    }

    public static void A0t(C25621Ms c25621Ms, String str, String str2) {
        c25621Ms.A05();
        c25621Ms.A03();
        String A0u = AnonymousClass001.A0u("api/", "v1/", str, str2);
        C14360o3.A07(A0u);
        c25621Ms.A0E = A0u;
        c25621Ms.A0R(C32125E9y.class, FS6.class);
    }

    public static boolean A0z(C51760Mtj c51760Mtj, OpalProfileData opalProfileData, Object obj, C05A c05a) {
        return c05a.AIi(obj, C51760Mtj.A02((OpalProfileData) c51760Mtj.A02, opalProfileData, (C74) c51760Mtj.A00));
    }

    public static float A00(C57F c57f) {
        if (Float.isNaN(c57f.B72())) {
            return 0.0f;
        }
        return c57f.B72();
    }

    public static int A02(C6O0 c6o0, C6Ih c6Ih, Object obj) {
        return C2BS.A00(Integer.valueOf(c6o0.BHP(c6Ih.getKey())), Integer.valueOf(c6o0.BHP(((C6Ih) obj).getKey())));
    }

    public static int A03(C5Tl c5Tl, int i) {
        if (!c5Tl.AH2(i)) {
            return 128;
        }
        return 256;
    }

    public static int A04(C2Z1 c2z1) {
        return AbstractC77363dM.A00(c2z1).getColor(AbstractC53242c7.A0E(AbstractC77363dM.A00(c2z1)));
    }

    public static int A05(Object obj, int i) {
        return ((i + obj.hashCode()) * 31) + AbstractC53644Nnp.A00();
    }

    public static int A06(Object obj, Object obj2, InterfaceC16610sE interfaceC16610sE, int i) {
        return ((Number) interfaceC16610sE.invoke(obj, obj2, Integer.valueOf(i))).intValue();
    }

    public static long A08(Bitmap bitmap) {
        return AbstractC119215ad.A00(bitmap.getWidth(), bitmap.getHeight());
    }

    public static long A09(AbstractC004601l abstractC004601l, Object obj) {
        InterfaceC74963Ym interfaceC74963Ym = (InterfaceC74963Ym) abstractC004601l.A03(obj);
        if (interfaceC74963Ym != null) {
            return ((C119055aN) interfaceC74963Ym.getValue()).A00;
        }
        return 0L;
    }

    public static Bitmap A0B(Bitmap bitmap, float f) {
        return C0fK.A00(bitmap, (int) Math.rint(bitmap.getWidth() / f), (int) Math.rint(bitmap.getHeight() / f), true);
    }

    public static Rect A0C(View view) {
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public static Modifier A0G(C5Tl c5Tl, Modifier modifier) {
        long j = C5XL.A00(c5Tl).A11;
        C5XL.A02(c5Tl);
        return C6L3.A01(modifier, C5WE.A02, j);
    }

    public static Modifier A0H(C5Tl c5Tl, Modifier modifier, float f) {
        return C6L3.A01(C6L2.A01(AbstractC118185Wd.A0C(modifier, f), C5WF.A00), C5AF.A00, C5XL.A00(c5Tl).A0f);
    }

    public static Modifier A0I(C5Tl c5Tl, Modifier modifier, float f, float f2) {
        return AbstractC118175Wb.A0E(modifier, C5XT.A00(c5Tl), f, C5XT.A00(c5Tl), f2);
    }

    public static C59W A0N(InterfaceC1131559d interfaceC1131559d, int i, long j) {
        return interfaceC1131559d.CpF(Constraints.A04(Constraints.A03(j), i, Constraints.A02(j), Constraints.A00(j)));
    }

    public static C140966Yy A0S(AbstractC26821Bsj abstractC26821Bsj) {
        return new C140966Yy(abstractC26821Bsj.requireActivity(), abstractC26821Bsj.A03());
    }

    public static Object A0V(C5Tl c5Tl, Object obj, int i) {
        c5Tl.Eno(i);
        Object EEc = c5Tl.EEc();
        if (EEc == obj) {
            C25338BJh c25338BJh = new C25338BJh();
            c5Tl.FBy(c25338BJh);
            return c25338BJh;
        }
        return EEc;
    }

    public static String A0Y(String str, StringBuilder sb) {
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }

    public static String A0Z(StringBuilder sb, int i) {
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    public static String A0a(StringBuilder sb, boolean z) {
        sb.append(z);
        sb.append(')');
        return sb.toString();
    }

    public static C09530e4 A0d(float f, long j) {
        return new C09530e4(Float.valueOf(f), new C1132359l(j));
    }

    public static void A0j(C5Tl c5Tl, int i) {
        C5WR.A0j(c5Tl, C5XL.A01(c5Tl).A05, AbstractC136736Hc.A00(c5Tl, i));
    }

    public static void A0l(C5Tl c5Tl, String str) {
        C5WR.A0u(c5Tl, C5XL.A01(c5Tl).A00, str, C5XL.A00(c5Tl).A0t);
    }

    public static void A0m(InterfaceC02590Ai interfaceC02590Ai, int i, long j) {
        interfaceC02590Ai.A9K("media_id", Long.valueOf(j));
        interfaceC02590Ai.A8p("media_index", Integer.valueOf(i));
        interfaceC02590Ai.AAP("viewer_session_id", "");
    }

    public static void A0n(InterfaceC02590Ai interfaceC02590Ai, C120985dq c120985dq, C11520jB c11520jB, UserSession userSession) {
        interfaceC02590Ai.AAP("tracking_token", c120985dq.BzL(userSession));
        interfaceC02590Ai.A7v("has_image", (Boolean) c11520jB.A01(C5I8.A7C));
        interfaceC02590Ai.AAP("style", (String) c11520jB.A01(C5I8.A7I));
        interfaceC02590Ai.AAP("title_option", (String) c11520jB.A01(C5I8.A7K));
        interfaceC02590Ai.AAP(DialogModule.KEY_TITLE, (String) c11520jB.A01(C5I8.A7L));
        interfaceC02590Ai.AAP("subtitle", (String) c11520jB.A01(C5I8.A7J));
        interfaceC02590Ai.AAP("body", (String) c11520jB.A01(C5I8.A78));
        interfaceC02590Ai.AAP("format", (String) c11520jB.A01(C5I8.A7B));
        interfaceC02590Ai.A9K("image_width", (Long) c11520jB.A01(C5I8.A7G));
    }

    public static void A0o(InterfaceC02590Ai interfaceC02590Ai, InterfaceC11380iw interfaceC11380iw, User user) {
        interfaceC02590Ai.AAP("target_id", user.getId());
        interfaceC02590Ai.AAP("module", interfaceC11380iw.getModuleName());
    }

    public static void A0r(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.A9K("media_id", Long.valueOf(Long.parseLong(str)));
    }

    public static void A0v(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((InterfaceC88183wS) it.next()).Etf());
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.facebook.graphql.calls.GraphQlCallInput, java.lang.Object, X.2JO] */
    public static void A0w(AbstractCollection abstractCollection, Iterator it) {
        C50679MYx c50679MYx = (C50679MYx) it.next();
        ?? graphQlCallInput = new GraphQlCallInput();
        graphQlCallInput.A09(c50679MYx.A00, "prompt");
        graphQlCallInput.A09(c50679MYx.A01, PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
        abstractCollection.add(graphQlCallInput);
    }

    public static void A0x(Iterator it) {
        ((AnonymousClass195) it.next()).AGH(null);
    }

    public static boolean A0y(C5Tl c5Tl, String str, long j) {
        C5WR.A0u(c5Tl, C5XL.A01(c5Tl).A01, str, j);
        c5Tl.ASW();
        return C0fH.A02();
    }
}
