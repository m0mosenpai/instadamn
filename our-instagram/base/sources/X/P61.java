package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicBrowseCategory;

/* loaded from: classes9.dex */
public final class P61 implements C8BR {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C52166N6v A02;
    public final /* synthetic */ boolean A03;

    @Override // X.C8BR
    public final void DUG(JIN jin, MusicBrowseCategory musicBrowseCategory, String str, String str2) {
        Bundle bundle;
        int i;
        int i2;
        String id;
        AudioOverlayTrack A00 = AbstractC54060NvK.A00(jin, 30000);
        C38321qM c38321qM = AbstractC54961OSm.A01;
        if (c38321qM != null && (id = c38321qM.getId()) != null) {
            bundle = AbstractC166987dD.A0b();
            bundle.putParcelable(AbstractC43591JPw.A00(767), A00);
            bundle.putString("args_media_id", id);
            bundle.putBoolean(AbstractC43591JPw.A00(768), false);
        } else {
            bundle = null;
        }
        boolean z = this.A03;
        UserSession userSession = this.A01;
        C70399WUb A002 = C70399WUb.A00(userSession);
        if (z) {
            A002.A0S(VG4.A0F.toString(), "track_selected");
        } else {
            A002.A0S(VG4.A0J.toString(), "track_selected");
            C70399WUb.A00(userSession).A0R(VG4.A0K.toString());
        }
        Activity activity = this.A00;
        C52166N6v c52166N6v = this.A02;
        if (bundle == null) {
            bundle = AbstractC166987dD.A0b();
        }
        if (z) {
            i = 1018;
            i2 = 2368;
        } else {
            i = 1017;
            i2 = 803;
        }
        AbstractC31174DnI.A0a(activity, bundle, userSession, ModalActivity.class, AbstractC111324zv.A00(i2)).A0D(c52166N6v, i);
    }

    public P61(Activity activity, UserSession userSession, C52166N6v c52166N6v, boolean z) {
        this.A03 = z;
        this.A01 = userSession;
        this.A00 = activity;
        this.A02 = c52166N6v;
    }

    @Override // X.C8BR
    public final void CJG(int i, int i2, Intent intent) {
        AudioOverlayTrack audioOverlayTrack;
        O79 o79;
        VG4 vg4;
        if (i != 1017 && i != 1018) {
            return;
        }
        UserSession userSession = this.A01;
        Activity activity = this.A00;
        if (intent != null) {
            audioOverlayTrack = (AudioOverlayTrack) intent.getParcelableExtra("extra_audio_track");
        } else {
            audioOverlayTrack = null;
        }
        boolean A1P = AbstractC167007dF.A1P(i, 1018);
        String str = AbstractC54961OSm.A04;
        if (audioOverlayTrack != null && str != null) {
            String A00 = AbstractC54961OSm.A00(audioOverlayTrack, str);
            if (A00 != null) {
                C70399WUb A002 = C70399WUb.A00(userSession);
                if (A1P) {
                    vg4 = VG4.A0G;
                } else {
                    vg4 = VG4.A0K;
                }
                A002.A0S(vg4.toString(), "proceed_to_boost");
                AbstractC54961OSm.A03 = A00;
                O79 o792 = AbstractC54961OSm.A00;
                if (o792 != null) {
                    C1Y6 c1y6 = o792.A00;
                    C69667Vt8 c69667Vt8 = o792.A01;
                    c69667Vt8.A0A = A00;
                    c69667Vt8.A04 = audioOverlayTrack;
                    C1Y6.A03(c1y6, new C69490VoD(c69667Vt8));
                }
            }
            AbstractC167007dF.A16(AbstractC54961OSm.A02);
            AbstractC54961OSm.A02 = null;
            if (AbstractC54961OSm.A03 != null || (o79 = AbstractC54961OSm.A00) == null) {
                return;
            }
            C1Y6.A01(o79.A00);
            return;
        }
        C38321qM c38321qM = AbstractC54961OSm.A01;
        if (c38321qM == null) {
            return;
        }
        AbstractC54961OSm.A01(activity, AbstractC54961OSm.A00, userSession, c38321qM, str, A1P);
    }

    @Override // X.C8BR
    public final void DUE() {
        O79 o79;
        AbstractC167007dF.A16(AbstractC54961OSm.A02);
        AbstractC54961OSm.A02 = null;
        if (AbstractC54961OSm.A03 == null && (o79 = AbstractC54961OSm.A00) != null) {
            C1Y6.A01(o79.A00);
        }
    }
}
