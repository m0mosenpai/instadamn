package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.ETc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32502ETc extends C1P1 {
    public final Context A00;
    public final Fragment A01;
    public final UserSession A02;
    public final C8J0 A03;
    public final C6WQ A04;
    public final String A05;
    public final InterfaceC16660sJ A06;
    public final boolean A07;

    public C32502ETc(Context context, Fragment fragment, UserSession userSession, C8J0 c8j0, C6WQ c6wq, String str, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        AbstractC167017dG.A1U(c6wq, c8j0);
        this.A00 = context;
        this.A02 = userSession;
        this.A05 = str;
        this.A01 = fragment;
        this.A04 = c6wq;
        this.A03 = c8j0;
        this.A07 = z;
        this.A06 = interfaceC16660sJ;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(2055370590);
        this.A03.A01(AbstractC111324zv.A00(4881));
        C0K8.A0C(this.A05, "Could not get the media file with the reel Id");
        C0f9.A0A(-1139318256, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        List list;
        int A03 = C0f9.A03(-370039757);
        C1567071s c1567071s = (C1567071s) obj;
        int A032 = C0f9.A03(-191423568);
        C14360o3.A0B(c1567071s, 0);
        C37771pE A00 = c1567071s.A00();
        if (A00 != null && (list = A00.A1k) != null && !list.isEmpty()) {
            Context context = this.A00;
            UserSession userSession = this.A02;
            C38321qM c38321qM = (C38321qM) list.get(0);
            String str = this.A05;
            boolean z = this.A07;
            Fragment fragment = this.A01;
            C6WQ c6wq = this.A04;
            C8J0 c8j0 = this.A03;
            InterfaceC16660sJ interfaceC16660sJ = this.A06;
            if (c38321qM == null) {
                c8j0.A01("missing_story_media_for_media_save");
            } else {
                C121275eQ A033 = AbstractC50633MWu.A03(context, userSession, AbstractC50633MWu.A05(context, c38321qM, str, z, false));
                A033.A00 = new EZ8(context, fragment, c8j0, c6wq, interfaceC16660sJ);
                C1GJ.A03(A033);
            }
        } else {
            this.A03.A01("media_fetch_returned_no_story_media");
            C9GR.A01(this.A00, "story_mentions_not_available_error_message", 2131974655, 0);
        }
        C0f9.A0A(-947081083, A032);
        C0f9.A0A(-1551632957, A03);
    }
}
