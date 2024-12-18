package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicBrowseCategory;

/* renamed from: X.Luc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49523Luc implements C8BR {
    public final int A00;
    public final Object A01;

    public C49523Luc(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C8BR
    public final void DUE() {
        switch (this.A00) {
            case 0:
                ((C48641LfJ) this.A01).dismiss();
                return;
            case 1:
                C48640LfI c48640LfI = (C48640LfI) this.A01;
                c48640LfI.A07.invoke();
                c48640LfI.dismiss();
                return;
            case 2:
                ((C48639LfH) this.A01).dismiss();
                return;
            case 3:
                return;
            default:
                ((C48638LfG) this.A01).dismiss();
                return;
        }
    }

    @Override // X.C8BR
    public final void DUG(JIN jin, MusicBrowseCategory musicBrowseCategory, String str, String str2) {
        switch (this.A00) {
            case 0:
                ((C48641LfJ) this.A01).A01(jin);
                return;
            case 1:
                C48640LfI c48640LfI = (C48640LfI) this.A01;
                if (!C48640LfI.A00(c48640LfI)) {
                    c48640LfI.dismiss();
                    c48640LfI.A06.DVk(jin);
                }
                c48640LfI.A01 = str2;
                return;
            case 2:
                C48639LfH c48639LfH = (C48639LfH) this.A01;
                Fragment fragment = c48639LfH.A03;
                FragmentActivity activity = fragment.getActivity();
                if (activity == null) {
                    return;
                }
                AudioOverlayTrack A00 = AbstractC54060NvK.A00(jin, 30000);
                String str3 = c48639LfH.A06;
                String str4 = c48639LfH.A07;
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putParcelable("args_audio_track", A00);
                A0b.putBoolean("args_has_existing_snippet_selection", false);
                A0b.putString("args_media_id", str3);
                A0b.putString("args_music_browse_session_full_id", str4);
                AbstractC31173DnH.A0Z(activity, A0b, c48639LfH.A05, ModalActivity.class, AbstractC111324zv.A00(2368)).A0D(fragment, 1004);
                return;
            case 3:
                MRR mrr = ((KCW) this.A01).A02;
                if (mrr == null) {
                    return;
                }
                mrr.DUW(jin);
                return;
            default:
                C48638LfG c48638LfG = (C48638LfG) this.A01;
                AudioOverlayTrack A002 = AbstractC54060NvK.A00(jin, 30000);
                String str5 = c48638LfG.A06;
                Bundle A0b2 = AbstractC166987dD.A0b();
                A0b2.putParcelable("args_audio_track", A002);
                A0b2.putString("args_media_id", str5);
                A0b2.putBoolean("args_has_existing_snippet_selection", false);
                UserSession userSession = c48638LfG.A04;
                Activity activity2 = c48638LfG.A01;
                AbstractC31174DnI.A0a(activity2, A0b2, userSession, ModalActivity.class, AbstractC111324zv.A00(803)).A0A(activity2, 1004);
                return;
        }
    }

    @Override // X.C8BR
    public final /* synthetic */ void CJG(int i, int i2, Intent intent) {
    }
}
