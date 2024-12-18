package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;

/* loaded from: classes8.dex */
public final class LPN implements View.OnClickListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ ContentNoteMetadata A04;

    public LPN(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, ContentNoteMetadata contentNoteMetadata, long j) {
        this.A04 = contentNoteMetadata;
        this.A03 = userSession;
        this.A01 = fragmentActivity;
        this.A02 = interfaceC11380iw;
        this.A00 = j;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-483712799);
        ContentNoteMetadata contentNoteMetadata = this.A04;
        UserSession userSession = this.A03;
        if (contentNoteMetadata != null) {
            FragmentActivity fragmentActivity = this.A01;
            InterfaceC11380iw interfaceC11380iw = this.A02;
            String str = contentNoteMetadata.A06;
            EnumC25577BSp enumC25577BSp = EnumC25577BSp.NOTE_THREE_DOT;
            String str2 = contentNoteMetadata.A05;
            Integer num = contentNoteMetadata.A02;
            long j = this.A00;
            JY1.A03(fragmentActivity, interfaceC11380iw, userSession, j, false);
            BSo.A00.A03(enumC25577BSp, userSession, num, interfaceC11380iw.getModuleName(), str, String.valueOf(j), str2);
        } else {
            JY1.A03(this.A01, this.A02, userSession, this.A00, false);
        }
        C0f9.A0C(-143670828, A05);
    }
}
