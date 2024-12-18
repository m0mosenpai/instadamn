package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.8Sj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C187418Sj extends C193578hc {
    public final C2GS A00;
    public final InterfaceC06180Ui A01;
    public final InterfaceC15070pN A02;
    public final UserSession A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C187418Sj(Application application, UserSession userSession) {
        super(application);
        C14360o3.A0B(userSession, 2);
        this.A03 = userSession;
        this.A00 = new C2GS();
        AnonymousClass057 A00 = C10M.A00(C05F.A00, 1, 0);
        this.A01 = A00;
        this.A02 = A00;
    }

    public final void A0E(EnumC187428Sk enumC187428Sk, int i) {
        C141796aw A00 = AbstractC141776au.A00(this);
        C9D9 c9d9 = new C9D9(this, enumC187428Sk, null, i, 0);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d9, A00);
    }

    public final void A0F(InterfaceC57817Pkj interfaceC57817Pkj) {
        C22C A01;
        String A00;
        C14360o3.A0B(interfaceC57817Pkj, 0);
        if (interfaceC57817Pkj instanceof C56289Oz9) {
            AbstractC50677MYv.A00 = true;
            A01 = AnonymousClass229.A01(this.A03);
            if (A01.A0J() != null) {
                A00 = "TIMELINE_TO_SHARE_SHEET_TAP";
                C22C.A0C(A01, A00);
            }
        } else if (C9BF.A00(interfaceC57817Pkj, 1)) {
            C448724r c448724r = AnonymousClass229.A01(this.A03).A0F;
            C18920wW c18920wW = c448724r.A02;
            InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_click");
            if (A002.isSampled()) {
                A002.A8R(C81X.A0b, "tool_type");
                A002.AAP("legacy_falco_event_name", "IG_CAMERA_ADD_CLIPS");
                C22M c22m = c448724r.A04;
                String str = c22m.A0L;
                if (str == null) {
                    str = "";
                }
                A002.AAP("camera_session_id", str);
                A002.A8R(EnumC114925Hg.CLIPS, "camera_destination");
                A002.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                A002.A8p("event_type", 2);
                A002.A8R(EnumC50631MWs.A0I, "surface");
                A002.A8R(c448724r.A0I(), "capture_type");
                A002.AAP("module", C22F.A09.getModuleName());
                A002.A8R(AnonymousClass249.VIDEO, "media_type");
                A002.AAP("nav_chain", C1QM.A00.A02.A00);
                A002.AAQ(AbstractC449424y.A07(c448724r.A00, c448724r.A03), "system_info");
                A002.Cht();
            }
        } else if (interfaceC57817Pkj instanceof C56291OzB) {
            A01 = AnonymousClass229.A01(this.A03);
            if (A01.A0J() != null && ((C22F) A01).A04.A0C != null) {
                A00 = MSV.A00(700);
                C22C.A0C(A01, A00);
            }
        } else if (interfaceC57817Pkj instanceof OzC) {
            AnonymousClass229.A01(this.A03).A0T();
        } else if (interfaceC57817Pkj instanceof C211949aL) {
            C22C A012 = AnonymousClass229.A01(this.A03);
            C211949aL c211949aL = (C211949aL) interfaceC57817Pkj;
            int i = c211949aL.A00;
            boolean z = c211949aL.A02;
            if (A012.A0J() != null) {
                C22C.A06(EnumC50631MWs.A0I, A012, "TIMELINE_AUDIO_CHANGE_TAP", i, z);
            }
        } else if (interfaceC57817Pkj instanceof C23876AhV) {
            AbstractC50677MYv.A00 = true;
        } else if (interfaceC57817Pkj instanceof C23880AhZ) {
            C448124l c448124l = AnonymousClass229.A01(this.A03).A09;
            C25531Mh A08 = C25531Mh.A08(c448124l.A01);
            EnumC114925Hg A0J = c448124l.A0J();
            if (((AbstractC02600Aj) A08).A00.isSampled() && A0J != null) {
                A08.A0s("IG_CAMERA_ENTITY_TAP");
                A08.A0q("TIMELINE_SAVE_BUTTON_TAP");
                C448124l.A00(A08, c448124l);
                A08.A0a(A0J);
                C22M c22m2 = c448124l.A04;
                A08.A0b(c22m2.A09);
                A08.A0T();
                A08.A0U();
                A08.A0m(C22F.A08.getModuleName());
                A08.A0c(c22m2.A0A);
                A08.A0t(C1QM.A00.A02.A00);
                A08.Cht();
            }
        }
        this.A00.A0B(new C8A8(interfaceC57817Pkj));
    }
}
