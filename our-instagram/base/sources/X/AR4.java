package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.TrackSnippet;

/* loaded from: classes4.dex */
public final class AR4 implements View.OnClickListener {
    public final /* synthetic */ C189988bH A00;

    public AR4(C189988bH c189988bH) {
        this.A00 = c189988bH;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(695325484);
        C189988bH c189988bH = this.A00;
        AnonymousClass879 anonymousClass879 = c189988bH.A0b;
        if ((anonymousClass879 != null && anonymousClass879.isPlaying()) || c189988bH.A0l) {
            c189988bH.A0l = false;
            AnonymousClass879 anonymousClass8792 = c189988bH.A0b;
            if (anonymousClass8792 != null) {
                anonymousClass8792.pause();
            }
        } else if (c189988bH.A10.A00 != null) {
            c189988bH.A0l = true;
        } else {
            UserSession userSession = c189988bH.A0v;
            C24U c24u = AnonymousClass229.A01(userSession).A03;
            C24Q c24q = c24u.A0E;
            long A03 = c24q.A03(17645025, c24u.A0D);
            c24u.A04 = A03;
            c24q.A09(A03, "use_case", "music_editor_play_icon");
            TrackSnippet trackSnippet = c189988bH.A0Q;
            if (trackSnippet != null) {
                C189988bH.A04(trackSnippet, c189988bH);
            } else {
                C24U c24u2 = AnonymousClass229.A01(userSession).A03;
                c24u2.A04 = c24u2.A0E.A07("No music to play", "", 17645025, c24u2.A04);
            }
        }
        C189988bH.A05(c189988bH);
        C0f9.A0C(-1336909982, A05);
    }
}
