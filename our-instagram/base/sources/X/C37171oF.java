package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.1oF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37171oF {
    public static C37171oF A00;

    public static final U79 A00(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC72410Xcy enumC72410Xcy, C37171oF c37171oF, String str, String str2) {
        String str3 = str;
        String str4 = userSession.userId;
        String moduleName = interfaceC11380iw.getModuleName();
        C14360o3.A0B(str4, 0);
        C14360o3.A0B(moduleName, 1);
        C09530e4 c09530e4 = new C09530e4("ig_container_module", moduleName);
        Locale locale = Locale.US;
        C14360o3.A08(locale);
        String lowerCase = "IG_OPEN_ACCOUNT_STATUS".toLowerCase(locale);
        C14360o3.A07(lowerCase);
        C09530e4 c09530e42 = new C09530e4("trigger_event_type", lowerCase);
        if (str == null) {
            str3 = C0HM.A00().toString();
            C14360o3.A07(str3);
        }
        LinkedHashMap A07 = AbstractC06930Yk.A07(c09530e4, c09530e42, new C09530e4("trigger_session_id", str3), new C09530e4("ixt_initial_screen_id", C0HM.A00().toString()));
        String obj = enumC72410Xcy.toString();
        C14360o3.A07(obj);
        String lowerCase2 = obj.toLowerCase(locale);
        C14360o3.A07(lowerCase2);
        A07.put("location", lowerCase2);
        A07.put("viewer_id", str4);
        if (str2 != null) {
            A07.put("enforcement_id", str2);
        }
        Map A0B = AbstractC06930Yk.A0B(A07);
        String str5 = userSession.userId;
        Object obj2 = A0B.get("location");
        String str6 = (String) A0B.get("trigger_session_id");
        C006802i.A0p.markerStart(387849633);
        C006802i c006802i = C006802i.A0p;
        c006802i.markerAnnotate(387849633, AbstractC50532MSl.A00(), str6);
        c006802i.markerAnnotate(387849633, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, String.valueOf(obj2));
        c006802i.markerAnnotate(387849633, "viewer_id", str5);
        return new U79(fragmentActivity, C32374EOa.A00, interfaceC11380iw, userSession, null, new C39449Hbb(fragmentActivity, userSession, c37171oF), null, C05F.A01, "com.bloks.www.ig.ixt.triggers.screen.ig_account_status", null, A0B);
    }
}
