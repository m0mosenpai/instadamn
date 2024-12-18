package X;

import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.Elv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33261Elv extends AnonymousClass522 {
    public final /* synthetic */ ClickableSpan A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ InterfaceC148366m6 A03;

    @Override // X.AnonymousClass522, android.text.style.ClickableSpan
    public final void onClick(View view) {
        C14360o3.A0B(view, 0);
        View view2 = this.A01;
        InterfaceC148366m6 interfaceC148366m6 = this.A03;
        view2.setVisibility(8);
        interfaceC148366m6.DWL();
        C25531Mh A0H = AbstractC31172DnG.A0H(new C7F3(this.A02));
        if (AbstractC25226BEj.A1Z(A0H)) {
            A0H.A0Z(23);
            A0H.A0X(0);
            A0H.A0M(EnumC33519Ers.A05, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0H.Cht();
        }
        this.A00.onClick(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33261Elv(ClickableSpan clickableSpan, View view, UserSession userSession, InterfaceC148366m6 interfaceC148366m6, int i) {
        super(Integer.valueOf(i));
        this.A01 = view;
        this.A03 = interfaceC148366m6;
        this.A02 = userSession;
        this.A00 = clickableSpan;
    }
}
