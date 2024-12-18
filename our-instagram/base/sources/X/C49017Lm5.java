package X;

import android.view.MotionEvent;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* renamed from: X.Lm5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49017Lm5 implements C7Q6 {
    public final C47359Kw8 A00;
    public final C7Ze A01;

    public C49017Lm5(C47359Kw8 c47359Kw8, C7Ze c7Ze) {
        C14360o3.A0B(c7Ze, 1);
        this.A01 = c7Ze;
        this.A00 = c47359Kw8;
    }

    @Override // X.C7Q6
    public final /* bridge */ /* synthetic */ boolean DT4(MotionEvent motionEvent, Object obj, Object obj2) {
        C9C9 c9c9;
        String str;
        String str2;
        C7QY c7qy = (C7QY) obj;
        AbstractC167017dG.A1N(c7qy, obj2);
        boolean BCt = c7qy.BCt();
        DirectMessageIdentifier directMessageIdentifier = c7qy.A0L;
        C7Ze c7Ze = this.A01;
        if (!AbstractC46806Kn1.A00((InterfaceC164967Zl) c7Ze, directMessageIdentifier, BCt) && (str = (c9c9 = c7qy.A08).A01) != null && str.length() != 0) {
            C47359Kw8 c47359Kw8 = this.A00;
            C1583978z c1583978z = c7qy.A0H;
            if (c1583978z == null || (str2 = Long.valueOf(c1583978z.A00).toString()) == null) {
                str2 = "";
            }
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c47359Kw8.A00, "open_existing_poll");
            EnumC46277Ke9 enumC46277Ke9 = EnumC46277Ke9.POLL_XMA_CARD_BACKGROUND;
            C0Zx c0Zx = new C0Zx();
            c0Zx.A06("question_id", str2);
            c0Zx.A01(enumC46277Ke9, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            AbstractC43592JPx.A1L(A0f, c0Zx);
            c7Ze.CKa(null, C2EY.A0k, directMessageIdentifier, null, null, "", "web_url", str, null, null, c9c9.A00, ((InterfaceC164917Zg) c7Ze).C7d(), null, null, null);
            return true;
        }
        return false;
    }
}
