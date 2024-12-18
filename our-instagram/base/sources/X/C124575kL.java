package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.BitSet;
import java.util.HashMap;

/* renamed from: X.5kL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124575kL {
    public static final C124575kL A00 = new Object();

    public static final void A00(Context context, EnumC124565kK enumC124565kK, MediaGenAIDetectionMethod mediaGenAIDetectionMethod, UserSession userSession, String str, String str2, boolean z) {
        FragmentActivity fragmentActivity;
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 2);
        HashMap hashMap = new HashMap();
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36324411028222111L);
        Boolean valueOf = Boolean.valueOf(A06);
        hashMap.put("ig_post_id", str2);
        hashMap.put("enable_edit_treatment", String.valueOf(A06));
        if (z) {
            Long l = null;
            if (context instanceof FragmentActivity) {
                fragmentActivity = (FragmentActivity) context;
            } else {
                fragmentActivity = null;
            }
            if (str2 != null) {
                l = AbstractC003100w.A0k(10, str2);
            }
            if (fragmentActivity != null && l != null) {
                C62862tP A04 = C62862tP.A04(fragmentActivity, AbstractC60952qJ.A01(str, true, true), userSession);
                HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = new HashMap();
                new BitSet(0);
                hashMap2.put("ig_post_id", Long.valueOf(l.longValue()));
                hashMap2.put("enable_edit_treatment", valueOf);
                C70688WfA c70688WfA = new C70688WfA(enumC124565kK, mediaGenAIDetectionMethod, userSession, str, str2);
                C69618VsL A01 = FTe.A01("com.bloks.www.bloks.gen_ai_transparency.threads.open_dialog");
                A01.A04 = AbstractC191768eY.A01(hashMap2);
                A01.A03 = hashMap3;
                A01.A02 = c70688WfA;
                A01.A00(context, A04);
                return;
            }
            return;
        }
        C66277U6x A012 = C66277U6x.A01("com.bloks.www.bloks.gen_ai_transparency.learn_more_bottom_sheet", hashMap);
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(userSession);
        igBloksScreenConfig.A05 = new V1s(enumC124565kK, mediaGenAIDetectionMethod, userSession, str, str2);
        A012.A05(context, igBloksScreenConfig);
    }

    public static final boolean A01(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return C18U.A06(C06090Tz.A05, userSession, 36324411028156574L);
    }

    public static final boolean A02(UserSession userSession, C38321qM c38321qM) {
        if (c38321qM == null) {
            return false;
        }
        c38321qM.A1J();
        if (!C18U.A06(C06090Tz.A05, userSession, 36324411028222111L) || !c38321qM.A4q()) {
            return false;
        }
        return true;
    }

    public final void A03(EnumC124565kK enumC124565kK, MediaGenAIDetectionMethod mediaGenAIDetectionMethod, UserSession userSession, Boolean bool, String str, String str2, String str3) {
        String str4;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 1);
        C18920wW A01 = AbstractC12220kQ.A01(new C19270xB(str), userSession);
        InterfaceC02590Ai A002 = A01.A00(A01.A00, "ig_genai_transparency_event");
        if (A002.isSampled()) {
            A002.AAP("event", str2);
            A002.AAP("post_id", str3);
            A002.A8R(enumC124565kK, "compose_type");
            if (mediaGenAIDetectionMethod != null) {
                str4 = mediaGenAIDetectionMethod.A00;
            } else {
                str4 = null;
            }
            A002.AAP("genai_detection_method_str", str4);
            A002.A7v("was_self_disclosed_as_ai_generated", bool);
            A002.AAP("analytics_module", str);
            A002.Cht();
        }
    }
}
