package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;

/* loaded from: classes8.dex */
public final class LPT implements View.OnClickListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ ContentNoteMetadata A04;
    public final /* synthetic */ C4F7 A05;
    public final /* synthetic */ String A06;

    public LPT(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, ContentNoteMetadata contentNoteMetadata, C4F7 c4f7, String str, long j) {
        this.A03 = userSession;
        this.A01 = fragmentActivity;
        this.A02 = interfaceC11380iw;
        this.A04 = contentNoteMetadata;
        this.A00 = j;
        this.A05 = c4f7;
        this.A06 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(520495526);
        UserSession userSession = this.A03;
        JY1.A04(this.A01, this.A02, userSession, this.A05, this.A04.A0A, String.valueOf(this.A00), this.A06);
        C0f9.A0C(1901287638, A05);
    }
}
