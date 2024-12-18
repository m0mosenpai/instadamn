package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.Ffq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35198Ffq {
    public final long A00;
    public final C18920wW A01;
    public final String A02;
    public final String A03;

    public static InterfaceC02590Ai A00(C35198Ffq c35198Ffq) {
        C18920wW c18920wW = c35198Ffq.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, AbstractC111324zv.A00(4701));
        A00.A9K("igid", Long.valueOf(c35198Ffq.A00));
        return A00;
    }

    public static void A01(InterfaceC02590Ai interfaceC02590Ai, C35198Ffq c35198Ffq, String str, String str2, boolean z) {
        interfaceC02590Ai.AAP(AbstractC31581Du9.A00(), c35198Ffq.A03);
        interfaceC02590Ai.A7v("is_support_partner_enabled", Boolean.valueOf(z));
        interfaceC02590Ai.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c35198Ffq.A02);
        interfaceC02590Ai.AAP("service_type", str);
        interfaceC02590Ai.A9K("partner_id", AbstractC003100w.A0k(10, str2));
    }

    public static void A02(InterfaceC02590Ai interfaceC02590Ai, C35198Ffq c35198Ffq, String str, boolean z) {
        interfaceC02590Ai.AAP("action", str);
        interfaceC02590Ai.AAP(AbstractC31581Du9.A00(), c35198Ffq.A03);
        interfaceC02590Ai.A7v("is_support_partner_enabled", Boolean.valueOf(z));
        interfaceC02590Ai.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c35198Ffq.A02);
    }

    public C35198Ffq(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2) {
        AbstractC167017dG.A1Q(userSession, str);
        this.A03 = str;
        this.A02 = str2;
        this.A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        this.A00 = Long.parseLong(userSession.userId);
    }
}
