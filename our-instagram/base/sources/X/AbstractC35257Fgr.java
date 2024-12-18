package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.aistudio.model.UtmMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentBackgroundModalActivity;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Fgr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35257Fgr {
    public static final void A00(Activity activity, UtmMetadata utmMetadata, UserSession userSession, String str, String str2) {
        Class<ModalActivity> cls;
        String str3;
        C14360o3.A0B(userSession, 0);
        Bundle A0E = AbstractC31174DnI.A0E(str, 2);
        A0E.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        A0E.putSerializable(AbstractC43591JPw.A00(157), str2);
        A0E.putParcelable(AbstractC111324zv.A00(5551), utmMetadata);
        AbstractC31265Don.A00();
        int intValue = AbstractC31266Doo.A00(userSession).A00().intValue();
        if (intValue != 3) {
            if (intValue != 1 && intValue != 2) {
                return;
            }
            A0E.putBoolean("ai_agent_picker_is_modal", true);
            C6XJ A03 = C6XJ.A03(activity, A0E, userSession, ModalActivity.class, "agent_picker");
            A03.A07();
            A03.A0A(activity, 105);
            return;
        }
        if (C18U.A06(C06090Tz.A05, userSession, 36325081042924215L)) {
            cls = ModalActivity.class;
            str3 = "AI_HOME";
        } else if (!AbstractC162267Oo.A03(userSession)) {
            A01(activity, userSession, EnumC33333EoS.A02, str, null, false);
            return;
        } else {
            cls = ModalActivity.class;
            str3 = "agent_picker";
        }
        C6XJ A032 = C6XJ.A03(activity, A0E, userSession, cls, str3);
        A032.A08();
        A032.A0C(activity);
    }

    public static final void A03(Context context, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC33346Eof enumC33346Eof, DirectShareTarget directShareTarget) {
        AbstractC167017dG.A1N(context, userSession);
        F1X.A00(context, interfaceC11380iw, userSession, new ME7(40, fragmentActivity, userSession, enumC33346Eof, directShareTarget));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.PqH] */
    public static final void A05(Context context, UserSession userSession, InterfaceC30943Dj0 interfaceC30943Dj0) {
        boolean A1a = AbstractC167017dG.A1a(context, userSession);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36324767510573504L) && !C18U.A06(c06090Tz, userSession, 36320403825893848L)) {
            C146106i8 A0K = AbstractC31171DnF.A0K();
            MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
            C14360o3.A07(linkMovementMethod);
            A0K.A05 = linkMovementMethod;
            A0K.A0A(new Object());
            A0K.A01 = AbstractC25225BEi.A07(c06090Tz, userSession, 36606242487211399L);
            A0K.A0J = A1a;
            A06(context, userSession, C05F.A00, null, null, new C30172DRc(43, interfaceC30943Dj0, A0K, userSession), R.attr.igds_color_icon_on_media, A1a);
        }
    }

    public static final void A06(Context context, UserSession userSession, Integer num, String str, String str2, InterfaceC16660sJ interfaceC16660sJ, int i, boolean z) {
        C14360o3.A0B(context, 0);
        if (z && AbstractC162267Oo.A03(userSession)) {
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            C14360o3.A0B("ai_agent_character_disclaimer_server_flag", 0);
            if (!A00.A01.getBoolean("ai_agent_character_disclaimer_server_flag", false)) {
                AbstractC34047F1a.A00(userSession);
            }
            interfaceC16660sJ.invoke(null);
            return;
        }
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "GenAINuxConsentStatusQuery", A0b.getParamsCopy(), A0b2.getParamsCopy(), C59374QdX.class, false, null, 0, null, AbstractC58317Pt9.A00(407), AbstractC166987dD.A1E());
        C15370ps A1F = AbstractC25225BEi.A1F();
        A01.ATV(new C35801Frd(context, userSession, num, str, str2, interfaceC16660sJ, A1F, i, z), new C35835FsB(context, userSession, num, str, str2, interfaceC16660sJ, A1F, i, z), pandoGraphQLRequest);
    }

    public static final void A08(UserSession userSession, Activity activity, String str) {
        boolean A1U = AbstractC167007dF.A1U(str);
        if (AbstractC162267Oo.A03(userSession)) {
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            C14360o3.A0B("ai_agent_character_disclaimer_server_flag", A1U ? 1 : 0);
            if (!A00.A01.getBoolean("ai_agent_character_disclaimer_server_flag", A1U)) {
                AbstractC34047F1a.A00(userSession);
                return;
            }
            return;
        }
        A01(activity, userSession, EnumC33333EoS.A03, str, null, A1U);
    }

    public static final void A01(Activity activity, UserSession userSession, EnumC33333EoS enumC33333EoS, String str, String str2, boolean z) {
        AbstractC167017dG.A1P(activity, str);
        if (AbstractC31268Doq.A08(userSession)) {
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putSerializable("nux_landing_surface", enumC33333EoS);
            A0b.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
            if (str2 != null) {
                A0b.putSerializable("ai_agent_id", str2);
            }
            C6XJ A03 = C6XJ.A03(activity, A0b, userSession, ModalActivity.class, AbstractC111324zv.A00(3861));
            A03.A08();
            if (z) {
                A03.A0A(activity, 106);
            } else {
                A03.A0C(activity);
            }
        }
    }

    public static void A02(Activity activity, UserSession userSession, Object obj) {
        A00(activity, null, userSession, obj.toString(), null);
    }

    public static final void A04(Context context, UserSession userSession) {
        boolean A1a = AbstractC167017dG.A1a(context, userSession);
        C25531Mh A0H = AbstractC31172DnG.A0H(new C7F3(userSession));
        if (AbstractC25226BEj.A1Z(A0H)) {
            A0H.A0Z(34);
            A0H.A0X(A1a ? 1 : 0);
            A0H.Cht();
        }
        String A0q = AbstractC166997dE.A0q(context.getResources(), 2131966456);
        SpannableStringBuilder A0H2 = AbstractC25225BEi.A0H(AbstractC166997dE.A0r(context.getResources(), A0q, 2131952613));
        AnonymousClass773.A04(A0H2, new C33253Eln(context, userSession, AbstractC31174DnI.A02(context), 4), A0q);
        C41451vu c41451vu = C41451vu.A01;
        C146106i8 A0X = AbstractC31173DnH.A0X(A0H2);
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        C14360o3.A07(linkMovementMethod);
        A0X.A05 = linkMovementMethod;
        A0X.A01 = AbstractC25225BEi.A07(C06090Tz.A05, userSession, 36606242487211399L);
        A0X.A0J = A1a;
        AbstractC31178DnM.A1N(c41451vu, A0X);
    }

    public static final void A07(UserSession userSession, Activity activity, String str) {
        AbstractC167017dG.A1N(userSession, activity);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("bottom_sheet_content_fragment", AbstractC111324zv.A00(1903));
        Bundle A0b2 = AbstractC166987dD.A0b();
        A0b2.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        A0b.putBundle(AbstractC111324zv.A00(213), A0b2);
        C6XJ A03 = C6XJ.A03(activity, A0b, userSession, TransparentBackgroundModalActivity.class, "bottom_sheet");
        A03.A07();
        A03.A0C(activity);
    }
}
