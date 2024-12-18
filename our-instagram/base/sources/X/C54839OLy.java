package X;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.OLy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54839OLy {
    public AudioOverlayTrack A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;
    public final MOW A03;
    public final O2K A04;
    public final InterfaceC58042PoS A05;

    public final void A00(Intent intent) {
        if (intent.getBooleanExtra(AbstractC43591JPw.A00(972), false)) {
            this.A05.Eo2(null, null, null, C05F.A0E, null, null);
        } else {
            A02((AudioOverlayTrack) intent.getParcelableExtra("extra_audio_track"));
            this.A05.dismiss();
        }
    }

    public final void A01(View view, boolean z) {
        String str;
        AudioOverlayTrack audioOverlayTrack = this.A00;
        InterfaceC58042PoS interfaceC58042PoS = this.A05;
        O2K o2k = this.A04;
        UserSession userSession = this.A02;
        boolean A1b = AbstractC43593JPy.A1b(o2k);
        View findViewById = view.findViewById(R.id.music_row_icon);
        View findViewById2 = view.findViewById(R.id.music_track_row_icon);
        View A0c = AbstractC166987dD.A0c(view, R.id.music_row_title);
        View findViewById3 = view.findViewById(R.id.music_row_subtitle);
        TextView A0Q = AbstractC25230BEn.A0Q(view, R.id.music_track_title);
        TextView A0Q2 = AbstractC25230BEn.A0Q(view, R.id.music_track_subtitle);
        View A0c2 = AbstractC166987dD.A0c(view, R.id.music_track_cross);
        View findViewById4 = view.findViewById(R.id.music_row_chevron_icon);
        View findViewById5 = view.findViewById(R.id.chevron_icon);
        CharSequence charSequence = null;
        if (audioOverlayTrack != null) {
            if (z) {
                if (findViewById2 != null) {
                    findViewById2.setVisibility(A1b ? 1 : 0);
                }
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
            }
            A0c.setVisibility(8);
            if (findViewById3 != null) {
                findViewById3.setVisibility(8);
            }
            A0Q.setVisibility(A1b ? 1 : 0);
            MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
            if (musicAssetModel != null) {
                charSequence = musicAssetModel.A0I;
            }
            A0Q.setText(charSequence);
            MusicAssetModel musicAssetModel2 = audioOverlayTrack.A08;
            if (musicAssetModel2 != null && (str = musicAssetModel2.A0D) != null) {
                A0Q2.setText(str);
                A0Q2.setVisibility(A1b ? 1 : 0);
            } else {
                A0Q2.setVisibility(8);
            }
            if (findViewById4 != null) {
                findViewById4.setVisibility(8);
            }
            if (findViewById5 != null) {
                findViewById5.setVisibility(8);
            }
            A0c2.setVisibility(A1b ? 1 : 0);
            ViewOnClickListenerC55462OkH.A01(A0c2, 20, o2k);
            AbstractC13880nE.A0o(A0c2, view, R.dimen.abc_dialog_padding_top_material);
        } else {
            if (z) {
                if (findViewById != null) {
                    findViewById.setVisibility(A1b ? 1 : 0);
                }
                if (findViewById2 != null) {
                    findViewById2.setVisibility(8);
                }
                if (findViewById4 != null) {
                    findViewById4.setVisibility(A1b ? 1 : 0);
                }
            }
            A0c.setVisibility(A1b ? 1 : 0);
            if (findViewById3 != null) {
                findViewById3.setVisibility(A1b ? 1 : 0);
            }
            A0Q.setVisibility(8);
            A0Q2.setVisibility(8);
            if (findViewById5 != null) {
                findViewById5.setVisibility(A1b ? 1 : 0);
            }
            A0c2.setVisibility(8);
            view.setTouchDelegate(null);
        }
        C0fQ.A00(new ViewOnClickListenerC55416OjR(1, interfaceC58042PoS, audioOverlayTrack, userSession, z), view);
        AbstractC56952jT.A01(view);
    }

    public final void A02(AudioOverlayTrack audioOverlayTrack) {
        this.A00 = audioOverlayTrack;
        this.A03.Dun(audioOverlayTrack);
    }

    public C54839OLy(AbstractC59962oe abstractC59962oe, UserSession userSession, MOW mow, InterfaceC58042PoS interfaceC58042PoS) {
        AbstractC167017dG.A1P(abstractC59962oe, interfaceC58042PoS);
        this.A01 = abstractC59962oe;
        this.A05 = interfaceC58042PoS;
        this.A03 = mow;
        this.A02 = userSession;
        this.A04 = new O2K(this);
    }
}
