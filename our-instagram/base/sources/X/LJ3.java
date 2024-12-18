package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.Map;

/* loaded from: classes8.dex */
public final class LJ3 {
    public final C2O5 A00 = C2O5.A09;
    public final EnumC31203Dnm A01 = EnumC31203Dnm.ANDROID;
    public final C18920wW A02;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0Zx, X.Jtw] */
    public static final C44882Jtw A00(String str, String str2, String str3, String str4, String str5, String str6) {
        C14360o3.A0B(str, 0);
        AbstractC167027dH.A0a(1, str2, str3, str4, str5);
        ?? c0Zx = new C0Zx();
        c0Zx.A06("sender_id", str);
        c0Zx.A06("receiver_id", str2);
        c0Zx.A06("media_id", str3);
        AbstractC43592JPx.A1N(c0Zx, str5);
        c0Zx.A06(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str4);
        if (str6 != null && !AbstractC001900j.A0T(str6)) {
            c0Zx.A06("target_name", str6);
        }
        return c0Zx;
    }

    public final void A02(C44882Jtw c44882Jtw, String str, String str2, String str3, String str4, Map map) {
        AbstractC25233BEq.A0x(0, str, c44882Jtw, map);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A02, "client_load_appreciationgiver_fail");
        if (A0f.isSampled()) {
            A01(A0f, this, str);
            JQ0.A13(this.A01, A0f, c44882Jtw);
            if (!map.isEmpty()) {
                A0f.A9M("extra_data", map);
            }
            A0f.AAP("error_message", str2);
            if (str3 != null) {
                A0f.AAP(TraceFieldType.ErrorCode, str3);
            }
            if (str4 != null) {
                A0f.AAP("error_stacktrace", str4);
            }
            A0f.Cht();
        }
    }

    public final void A04(C44882Jtw c44882Jtw, String str, Map map) {
        C14360o3.A0B(str, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A02, "client_load_appreciationgiver_success");
        if (A0f.isSampled()) {
            A01(A0f, this, str);
            JQ0.A13(this.A01, A0f, c44882Jtw);
            AbstractC43593JPy.A1K(A0f, map);
        }
    }

    public LJ3(C18920wW c18920wW) {
        this.A02 = c18920wW;
    }

    public static void A01(InterfaceC02590Ai interfaceC02590Ai, LJ3 lj3, String str) {
        interfaceC02590Ai.AAP(AbstractC50529MSi.A01(), str);
        interfaceC02590Ai.A8R(lj3.A00, "product_type");
    }

    public final void A03(C44882Jtw c44882Jtw, String str, Map map) {
        AbstractC167027dH.A12(str, c44882Jtw, map);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A02, "client_load_appreciationgiver_init");
        if (A0f.isSampled()) {
            A01(A0f, this, str);
            JQ0.A13(this.A01, A0f, c44882Jtw);
            AbstractC43593JPy.A1K(A0f, map);
        }
    }

    public final void A05(C44882Jtw c44882Jtw, String str, Map map) {
        AbstractC167017dG.A1O(str, map);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A02, "user_click_appreciationgiver_atomic");
        if (A0f.isSampled()) {
            A01(A0f, this, str);
            JQ0.A13(this.A01, A0f, c44882Jtw);
            AbstractC43593JPy.A1K(A0f, map);
        }
    }
}
