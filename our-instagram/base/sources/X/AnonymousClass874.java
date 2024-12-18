package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.874, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass874 {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final java.util.Set A0C;
    public final UserSession A0D;

    public AnonymousClass874(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A0D = userSession;
        this.A0C = new LinkedHashSet();
    }

    public final void A03(boolean z) {
        this.A09 = false;
        this.A0A = false;
        if (!z || this.A0B) {
            this.A00 = false;
        }
        this.A0B = false;
        A00(this, false);
        this.A07 = false;
        if (this.A03) {
            this.A03 = false;
            A00(this, false);
        }
        if (this.A02) {
            this.A02 = false;
            A00(this, false);
        }
        this.A08 = false;
        this.A01 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
    
        if (r2.A00 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001a, code lost:
    
        return X.C05F.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        return X.C05F.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0035, code lost:
    
        if (r1 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0044, code lost:
    
        if (r2.A00 != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer A01() {
        /*
            r2 = this;
            boolean r0 = r2.A02
            if (r0 != 0) goto L4c
            boolean r0 = r2.A09
            if (r0 != 0) goto L1b
            boolean r0 = r2.A03
            if (r0 != 0) goto L49
            boolean r0 = r2.A07
            if (r0 != 0) goto L49
            boolean r0 = r2.A04
            if (r0 == 0) goto L4c
            boolean r0 = r2.A00
            if (r0 != 0) goto L46
        L18:
            java.lang.Integer r0 = X.C05F.A01
            return r0
        L1b:
            boolean r1 = r2.A07
            if (r1 == 0) goto L26
            boolean r0 = r2.A01
            if (r0 == 0) goto L26
        L23:
            java.lang.Integer r0 = X.C05F.A0Y
            return r0
        L26:
            boolean r0 = r2.A03
            if (r0 == 0) goto L38
            boolean r0 = r2.A08
            if (r0 == 0) goto L31
            if (r1 != 0) goto L31
            goto L23
        L31:
            boolean r0 = r2.A06
            if (r0 == 0) goto L49
            if (r1 != 0) goto L49
            goto L18
        L38:
            if (r1 != 0) goto L49
            boolean r0 = r2.A0A
            if (r0 != 0) goto L4c
            boolean r0 = r2.A0B
            if (r0 != 0) goto L4c
            boolean r0 = r2.A00
            if (r0 == 0) goto L18
        L46:
            java.lang.Integer r0 = X.C05F.A0C
            return r0
        L49:
            java.lang.Integer r0 = X.C05F.A0N
            return r0
        L4c:
            java.lang.Integer r0 = X.C05F.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass874.A01():java.lang.Integer");
    }

    public final void A02() {
        this.A00 = !this.A00;
        C22C A01 = AnonymousClass229.A01(this.A0D);
        boolean z = this.A00;
        C448724r c448724r = A01.A0F;
        C18920wW c18920wW = c448724r.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_click");
        if (A00.isSampled()) {
            A00.A8R(C81X.A1j, "tool_type");
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_TAP_MUTE_BUTTON");
            C22M c22m = c448724r.A04;
            String str = c22m.A0L;
            if (str == null) {
                str = "";
            }
            A00.AAP("camera_session_id", str);
            A00.A8p("camera_position", 2);
            A00.A9K("capture_format_index", 0L);
            A00.A8R(c448724r.A0I(), "capture_type");
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8p("event_type", 2);
            A00.A8R(c22m.A0A, "media_type");
            A00.AAP("module", C22F.A08.getModuleName());
            A00.A7v("mute_state", Boolean.valueOf(z));
            A00.A8R(c22m.A0C, "surface");
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.Cht();
        }
        A00(this, true);
    }

    public static final void A00(AnonymousClass874 anonymousClass874, boolean z) {
        Integer A01 = anonymousClass874.A01();
        Iterator it = anonymousClass874.A0C.iterator();
        while (it.hasNext()) {
            ((C89H) it.next()).Cy8(A01, z);
        }
    }
}
