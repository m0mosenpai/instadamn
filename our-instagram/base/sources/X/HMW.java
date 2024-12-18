package X;

import android.content.res.Resources;
import android.os.Handler;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.R;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.music.common.model.MusicSearchPlaylist;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class HMW extends AbstractC38513GwY implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "MusicOverlayPlaylistSpotlightViewHolder";
    public int A00;
    public int A01;
    public MusicSearchPlaylist A02;
    public final Handler A03;
    public final ViewPager2 A04;
    public final C9PK A05;
    public final C38362Gty A06;
    public final JHE A07;
    public final J3F A08;
    public final CirclePageIndicator A09;
    public final Map A0A;
    public final boolean A0B;
    public final View A0C;
    public final UserSession A0D;
    public final IgTextView A0E;

    public final void A03(MusicSearchPlaylist musicSearchPlaylist, boolean z) {
        this.A02 = musicSearchPlaylist;
        IgTextView igTextView = this.A0E;
        if (z) {
            igTextView.setVisibility(8);
        } else {
            igTextView.setVisibility(0);
            igTextView.setText(musicSearchPlaylist.A00().getTitle());
            AbstractC56932jR.A03(igTextView);
        }
        C38362Gty c38362Gty = this.A06;
        InterfaceC09390do interfaceC09390do = musicSearchPlaylist.A01;
        List A0n = AbstractC31171DnF.A0n(interfaceC09390do);
        C14360o3.A0C(A0n, MSV.A00(1454));
        C14360o3.A0B(A0n, 0);
        c38362Gty.A00 = A0n;
        this.A09.A01(0, AbstractC31171DnF.A0n(interfaceC09390do).size());
        ViewPager2 viewPager2 = this.A04;
        viewPager2.A03(0, false);
        Map map = this.A0A;
        Object obj = map.get(musicSearchPlaylist);
        if (obj == null) {
            obj = 0;
            map.put(musicSearchPlaylist, obj);
        }
        viewPager2.A03(AbstractC166987dD.A0H(obj), false);
        c38362Gty.notifyDataSetChanged();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMW(View view, UserSession userSession, C9PK c9pk, JHE jhe) {
        super(view);
        AbstractC167017dG.A1R(jhe, c9pk);
        C14360o3.A0B(userSession, 4);
        this.A0C = view;
        this.A07 = jhe;
        this.A05 = c9pk;
        this.A0D = userSession;
        boolean A03 = C36A.A03(userSession);
        this.A0B = A03;
        this.A0E = AbstractC31175DnJ.A0L(view, R.id.playlist_title);
        ViewPager2 viewPager2 = (ViewPager2) AbstractC166987dD.A0c(view, R.id.playlist_artist_banner);
        this.A04 = viewPager2;
        this.A09 = (CirclePageIndicator) AbstractC166987dD.A0c(view, R.id.circle_page_indicator);
        C38362Gty c38362Gty = new C38362Gty(this);
        this.A06 = c38362Gty;
        this.A03 = AbstractC167007dF.A0J();
        this.A08 = new J3F(this);
        this.A0A = AbstractC166987dD.A1I();
        viewPager2.getLayoutParams().height = AbstractC37302Gc3.A05(this).getDimensionPixelSize(A03 ? R.dimen.action_button_settings_height : R.dimen.audio_dubbing_gen_ai_gif_size);
        viewPager2.setAdapter(c38362Gty);
        viewPager2.setPageTransformer(new C65846Tv7((int) (7.0f * Resources.getSystem().getDisplayMetrics().density)));
        viewPager2.A05(new C43748JWj(this, 8));
        this.A03.postDelayed(this.A08, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        this.A04.addOnAttachStateChangeListener(new WL8(this, 4));
    }
}
