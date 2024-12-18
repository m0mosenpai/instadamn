package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

/* renamed from: X.Cvf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29284Cvf implements GZ7 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    @Override // X.GZ7
    public final void Dpv(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        if (c38321qM.A5P()) {
            UserSession userSession = this.A01;
            C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A2a, userSession);
            c116875Qr.A1D = c38321qM.getId();
            c116875Qr.A1I = this.A02;
            c116875Qr.A09 = EnumC120785dO.VISUAL_COMMENT_REPLY;
            AbstractC86593tX.A0X(this.A00, c116875Qr.A00(), userSession);
            return;
        }
        if (!c38321qM.A5c()) {
            return;
        }
        UserSession userSession2 = this.A01;
        IgFragmentFactoryImpl.A00();
        String str = this.A03;
        C35028Fc1 c35028Fc1 = new C35028Fc1();
        c35028Fc1.A0B = str;
        c35028Fc1.A0N = true;
        c35028Fc1.A09 = this.A02;
        Bundle A01 = c35028Fc1.A01();
        FragmentActivity fragmentActivity = this.A00;
        C6XJ c6xj = new C6XJ(fragmentActivity, A01, userSession2, ModalActivity.class, "single_media_feed");
        c6xj.A08();
        c6xj.A0C(fragmentActivity);
    }

    public C29284Cvf(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
        this.A01 = userSession;
        this.A02 = str;
        this.A00 = fragmentActivity;
        this.A03 = str2;
    }

    @Override // X.GZ7
    public final void onFail(String str) {
        C0w9.A03("VisualCommentReplyInteractiveUtil", AnonymousClass001.A0R("Failed to fetch visual reply original media: ", str));
    }
}
