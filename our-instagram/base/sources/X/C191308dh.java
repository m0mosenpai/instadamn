package X;

import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8dh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C191308dh implements C83U, C83R {
    public String A00;
    public String A01;
    public final C1815283f A02;
    public final UserSession A03;
    public final C1810981l A04;
    public final C8HI A05;
    public final C8FR A06;
    public final String A07;

    public C191308dh(C1815283f c1815283f, UserSession userSession, C1810981l c1810981l, C8HI c8hi, C8FR c8fr, String str) {
        C14360o3.A0B(c1815283f, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c8hi, 3);
        C14360o3.A0B(c8fr, 4);
        C14360o3.A0B(str, 5);
        C14360o3.A0B(c1810981l, 6);
        this.A02 = c1815283f;
        this.A03 = userSession;
        this.A05 = c8hi;
        this.A06 = c8fr;
        this.A07 = str;
        this.A04 = c1810981l;
    }

    @Override // X.C83R
    public final void DFb(int i) {
        String str;
        String str2;
        CameraAREffect cameraAREffect = this.A02.A00().A05.A09;
        if (i > 0 && cameraAREffect != null && (str = cameraAREffect.A0K) != null && (str2 = this.A00) != null && !str2.equals(this.A01)) {
            this.A01 = str2;
            UserSession userSession = this.A03;
            C14360o3.A07(str);
            String str3 = cameraAREffect.A0M;
            C14360o3.A07(str3);
            Integer A0N = this.A05.A0N();
            C8FR c8fr = this.A06;
            EnumC50631MWs enumC50631MWs = EnumC50631MWs.A0J;
            String str4 = this.A07;
            C14360o3.A0B(this.A04.A0A(), 8);
            if (c8fr.B0Z(str) == null) {
                AbstractC12120kG.A07("CameraLoggerHelper", AnonymousClass001.A0R("Could not find effect position for effectId: ", str), null);
                C0K8.A0O("CameraLoggerHelper", "logFaceDetected() effectPosition not found, effectId=", str);
                return;
            }
            int A03 = AbstractC50677MYv.A03(A0N);
            C448724r c448724r = AnonymousClass229.A01(userSession).A0F;
            C18920wW c18920wW = c448724r.A01;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_click");
            if (!A00.isSampled()) {
                return;
            }
            List singletonList = Collections.singletonList(AbstractC003100w.A0k(10, str));
            C14360o3.A07(singletonList);
            List singletonList2 = Collections.singletonList(AbstractC003100w.A0k(10, str3));
            C14360o3.A07(singletonList2);
            int i2 = 2;
            if (A03 != 2) {
                i2 = 1;
            }
            A00.A8R(C81X.A0y, "tool_type");
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_FACE_DETECTED");
            C22M c22m = c448724r.A04;
            String str5 = c22m.A0L;
            if (str5 == null) {
                str5 = "";
            }
            A00.AAP("camera_session_id", str5);
            A00.AAk("applied_effect_ids", singletonList);
            A00.AAk("applied_effect_instance_ids", singletonList2);
            A00.A8R(c448724r.A0J(), "camera_destination");
            A00.A8p("camera_position", Integer.valueOf(i2));
            A00.A8R(c448724r.A0I(), "capture_type");
            A00.A9K("capture_format_index", 0L);
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8p("event_type", 2);
            A00.A8R(AnonymousClass249.OTHER, "media_type");
            A00.AAP("module", str4);
            A00.A8R(enumC50631MWs, "surface");
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.Cht();
        }
    }

    @Override // X.C83U
    public final void CuF(String str) {
        this.A00 = str;
    }
}
