package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.api.schemas.TrackData;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.sfx.widget.CircularProgressImageView;
import com.instagram.modal.ModalActivity;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicDataSource;

/* renamed from: X.LGs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47956LGs {
    public InterfaceC678133v A00;
    public final Context A01;
    public final Drawable A02;
    public final Drawable A03;
    public final View A04;
    public final Fragment A05;
    public final CircularProgressImageView A06;
    public final String A07;
    public final Activity A08;
    public final UserSession A09;

    public C47956LGs(Activity activity, Context context, View view, Fragment fragment, UserSession userSession, String str) {
        AbstractC25229BEm.A1I(userSession, 1, str);
        this.A09 = userSession;
        this.A05 = fragment;
        this.A08 = activity;
        this.A01 = context;
        this.A04 = view;
        this.A07 = str;
        this.A03 = C3LQ.A05(context, R.drawable.instagram_play_pano_filled_24, context.getColor(AbstractC53242c7.A08(context)));
        this.A02 = C3LQ.A05(context, R.drawable.instagram_pause_pano_filled_24, context.getColor(AbstractC53242c7.A08(context)));
        this.A00 = AbstractC677833s.A00(AbstractC166987dD.A0O(context), userSession, new C49385LsJ(this), new C677733r(AbstractC166987dD.A0O(context), userSession), str, true);
        this.A06 = (CircularProgressImageView) AbstractC166987dD.A0c(view, R.id.music_note_progress_indicator);
    }

    public static final void A00(C47956LGs c47956LGs, C45068Jwx c45068Jwx) {
        boolean z = c45068Jwx.A08;
        if (!z) {
            InterfaceC678133v interfaceC678133v = c47956LGs.A00;
            if (interfaceC678133v != null) {
                interfaceC678133v.E4S();
            }
            AbstractC135966Db.A01(c47956LGs.A09).A0D(EnumC46303KeZ.A0a);
            return;
        }
        if (!z) {
            return;
        }
        if (!C18U.A06(C06090Tz.A05, c47956LGs.A09, 36317629274920368L)) {
            return;
        }
        c47956LGs.A04.postDelayed(new M16(c47956LGs), 1000L);
    }

    public final void A01(TrackData trackData) {
        Bundle A02 = AbstractC86593tX.A02(null, null, AbstractC41763Iee.A03(trackData, false), AbstractC166997dE.A0n());
        C14360o3.A07(A02);
        AbstractC31173DnH.A0Z(this.A08, A02, this.A09, ModalActivity.class, "audio_page").A0C(this.A01);
    }

    public final void A02(TrackData trackData, String str, String str2, boolean z) {
        CharSequence charSequence;
        boolean A1a = AbstractC31175DnJ.A1a(trackData);
        CircularProgressImageView circularProgressImageView = this.A06;
        circularProgressImageView.setImageDrawable(this.A03);
        View view = this.A04;
        int A07 = AbstractC166997dE.A07(view.getResources());
        View A0E = AbstractC43594JPz.A0E(circularProgressImageView);
        A0E.post(new RunnableC49988M5d(circularProgressImageView, A07, A0E));
        circularProgressImageView.A02 = A1a;
        view.setVisibility(0);
        TextView A0e = AbstractC166987dD.A0e(view, R.id.music_note_text);
        if (A0e != null) {
            int length = str.length();
            if (length == 0 && str2.length() == 0) {
                charSequence = "";
            } else {
                Context context = this.A01;
                SpannableStringBuilder A0H = AbstractC25225BEi.A0H(context.getResources().getString(2131967955, str, str2));
                int length2 = str2.length();
                A0H.setSpan(new StyleSpan(A1a ? 1 : 0), 0, length, 17);
                A0H.setSpan(new ForegroundColorSpan(AbstractC31174DnI.A03(context)), A0H.length() - length2, A0H.length(), 17);
                charSequence = A0H;
                if (z) {
                    Drawable drawable = context.getDrawable(R.drawable.music_explicit);
                    int color = context.getColor(AbstractC53242c7.A0B(context));
                    int A0E2 = AbstractC167017dG.A0E(context);
                    charSequence = A0H;
                    if (drawable != null) {
                        drawable.setBounds(0, 0, A0E2, A0E2);
                        Drawable mutate = drawable.mutate();
                        if (mutate != null) {
                            mutate.setColorFilter(color, PorterDuff.Mode.SRC_IN);
                        }
                        C4GL.A02(drawable, A0H, length, 12, 12);
                        charSequence = A0H;
                    }
                }
            }
            A0e.setText(charSequence);
            A0e.setSelected(A1a);
            LQ1.A00(A0e, 5, this, trackData);
        }
    }

    public final void A03(C45068Jwx c45068Jwx) {
        InterfaceC678133v interfaceC678133v = this.A00;
        if (interfaceC678133v != null) {
            if (interfaceC678133v.isPlaying()) {
                interfaceC678133v.pause();
            } else {
                A00(this, c45068Jwx);
            }
        }
    }

    public final void A04(C45068Jwx c45068Jwx, AbstractC210529Sr abstractC210529Sr) {
        InterfaceC678133v interfaceC678133v = this.A00;
        if (interfaceC678133v != null) {
            TrackData trackData = c45068Jwx.A03;
            interfaceC678133v.ESz(new MusicDataSource(null, AudioType.A03, trackData.getProgressiveDownloadUrl(), trackData.getDashManifest(), trackData.getAudioAssetId(), trackData.getArtistId()), new JZP(0, this, c45068Jwx, abstractC210529Sr), c45068Jwx.A07, 0, -1, -1, false, false);
        }
        InterfaceC678133v interfaceC678133v2 = this.A00;
        if (interfaceC678133v2 != null) {
            interfaceC678133v2.seekTo(c45068Jwx.A01);
        }
    }
}
