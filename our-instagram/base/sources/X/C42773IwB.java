package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.model.metadata.AudioPageMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.IwB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42773IwB implements GYB {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        AudioPageMetadata audioPageMetadata;
        C14360o3.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("audio_id");
        if (queryParameter != null) {
            audioPageMetadata = AbstractC41763Iee.A06(queryParameter);
        } else {
            audioPageMetadata = null;
        }
        UserSession userSession = this.A01;
        String A0j = AbstractC167017dG.A0j();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelable("args_audio_model", audioPageMetadata);
        A0b.putString(AbstractC111324zv.A00(347), A0j);
        if (queryParameter != null) {
            A0b.putString("audio_id", queryParameter);
        }
        AbstractC25228BEl.A1G(this.A00, A0b, userSession, ModalActivity.class, "audio_page");
    }

    public C42773IwB(UserSession userSession, FragmentActivity fragmentActivity) {
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }
}
