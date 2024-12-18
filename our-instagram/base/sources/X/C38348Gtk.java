package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.api.schemas.AudioBrowserCategoryType;
import com.instagram.api.schemas.AudioBrowserPlaylistType;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.api.schemas.TrackMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicSearchPlaylist;
import com.instagram.music.common.model.MusicSearchPlaylistType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Gtk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38348Gtk extends AbstractC155316yK {
    public final C07X A00;
    public final MusicProduct A01;
    public final UserSession A02;
    public final C9PK A03;
    public final JPh A04;
    public final C50664MYh A05;
    public final C50669MYn A06;
    public final boolean A07;
    public final C23031Ai A08;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        Integer num;
        AbstractC38513GwY abstractC38513GwY = (AbstractC38513GwY) c3oo;
        C14360o3.A0B(abstractC38513GwY, 0);
        C38635Gyc c38635Gyc = (C38635Gyc) getItem(i);
        C38061Goo c38061Goo = c38635Gyc.A04;
        Integer num2 = c38061Goo.A0G;
        if (num2 != null) {
            int intValue = num2.intValue();
            if (intValue != 1) {
                if (intValue == 6) {
                    MusicSearchPlaylist musicSearchPlaylist = c38061Goo.A0E;
                    if (musicSearchPlaylist != null) {
                        if (abstractC38513GwY instanceof HMT) {
                            ((HMT) abstractC38513GwY).A03(musicSearchPlaylist);
                            return;
                        } else {
                            abstractC38513GwY.A02(musicSearchPlaylist);
                            return;
                        }
                    }
                    return;
                }
            } else {
                if (abstractC38513GwY instanceof HMY) {
                    ((HMY) abstractC38513GwY).A03(c38635Gyc);
                    return;
                }
                JIN jin = c38635Gyc.A03;
                if (jin == null || (num = c38635Gyc.A05) == null) {
                    return;
                }
                TrackMetadata trackMetadata = c38061Goo.A0A;
                if (trackMetadata == null) {
                    trackMetadata = c38061Goo.A09;
                }
                if (jin instanceof C37964Gn6) {
                    ((C37964Gn6) jin).A00 = trackMetadata;
                }
                boolean A1X = AbstractC167007dF.A1X(c38635Gyc.A02, AudioBrowserPlaylistType.A08);
                Integer valueOf = Integer.valueOf(i + 1);
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                ((HMZ) abstractC38513GwY).A03(trackMetadata, jin, num, valueOf, A1X, false);
                return;
            }
        }
        throw AbstractC166987dD.A12("Unsupported search item type");
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C3OO hmz;
        C14360o3.A0B(viewGroup, 0);
        C38635Gyc c38635Gyc = (C38635Gyc) getItem(0);
        if (i != 0) {
            if (i == 8) {
                AudioBrowserCategoryType audioBrowserCategoryType = c38635Gyc.A01;
                if (audioBrowserCategoryType != AudioBrowserCategoryType.A08 && audioBrowserCategoryType != AudioBrowserCategoryType.A07) {
                    int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                    return new HMS(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.music_search_row_grouping, false), this.A02, this.A04);
                }
                int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new HMT(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.music_search_row_playlist_card, false), this.A04);
            }
            throw AbstractC166987dD.A12("Unsupported search item type");
        }
        String str = c38635Gyc.A06;
        boolean A0K = C14360o3.A0K(str, "PLAYLIST_ID.IN_THIS_REEL");
        int i4 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        LayoutInflater A0P = AbstractC25228BEl.A0P(viewGroup);
        if (A0K) {
            hmz = new HMY(AbstractC25226BEj.A0R(A0P, viewGroup, R.layout.music_search_row_track_hscroll, false), this.A04);
        } else {
            View A0R = AbstractC25226BEj.A0R(A0P, viewGroup, R.layout.music_search_row_track, false);
            UserSession userSession = this.A02;
            JPh jPh = this.A04;
            boolean z = this.A07;
            MusicProduct musicProduct = this.A01;
            String str2 = c38635Gyc.A07;
            C50669MYn c50669MYn = this.A06;
            hmz = new HMZ(A0R, this.A00, musicProduct, userSession, this.A03, jPh, c50669MYn, str, str2, z);
        }
        return hmz;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onViewAttachedToWindow(C3OO c3oo) {
        C14360o3.A0B(c3oo, 0);
        int bindingAdapterPosition = c3oo.getBindingAdapterPosition();
        if (bindingAdapterPosition >= 0 && bindingAdapterPosition < getItemCount()) {
            C38635Gyc c38635Gyc = (C38635Gyc) getItem(bindingAdapterPosition);
            C38061Goo c38061Goo = c38635Gyc.A04;
            if (c38061Goo.A0G == C05F.A01) {
                String str = c38635Gyc.A06;
                String str2 = c38635Gyc.A07;
                if (str2.length() == 0) {
                    str2 = "unknown";
                }
                C54690ODq c54690ODq = new C54690ODq(null, str, str2, "preview", c38635Gyc.A00, bindingAdapterPosition);
                JPh jPh = this.A04;
                JIN A00 = c38061Goo.A00();
                if (A00 != null) {
                    jPh.Dud(A00, c54690ODq);
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2xd, java.lang.Object] */
    public C38348Gtk(C07X c07x, MusicProduct musicProduct, UserSession userSession, C9PK c9pk, JPh jPh, C50664MYh c50664MYh, C50669MYn c50669MYn, C23031Ai c23031Ai, boolean z) {
        super((AbstractC65412xd) new Object());
        this.A02 = userSession;
        this.A07 = z;
        this.A01 = musicProduct;
        this.A08 = c23031Ai;
        this.A04 = jPh;
        this.A06 = c50669MYn;
        this.A05 = c50664MYh;
        this.A03 = c9pk;
        this.A00 = c07x;
    }

    public final void A01(AudioBrowserCategoryType audioBrowserCategoryType, AudioBrowserPlaylistType audioBrowserPlaylistType, String str, String str2, List list, int i) {
        C38635Gyc c38635Gyc;
        JIN jin;
        MusicSearchPlaylistType musicSearchPlaylistType;
        MusicSearchPlaylist musicSearchPlaylist;
        AbstractC167027dH.A12(list, str, str2);
        ArrayList<C38061Goo> A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            Integer num = ((C38061Goo) obj).A0G;
            if (num == C05F.A01 || num == C05F.A0u) {
                A1E.add(obj);
            }
        }
        ArrayList A1E2 = AbstractC166987dD.A1E();
        for (C38061Goo c38061Goo : A1E) {
            UserSession userSession = this.A02;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (!C18U.A06(c06090Tz, userSession, 36329221391401147L)) {
                if (c38061Goo != null && (musicSearchPlaylist = c38061Goo.A0E) != null) {
                    musicSearchPlaylistType = musicSearchPlaylist.A01();
                } else {
                    musicSearchPlaylistType = null;
                }
                if (musicSearchPlaylistType != MusicSearchPlaylistType.A06 || !C18U.A06(c06090Tz, userSession, 36326227800045317L)) {
                    jin = c38061Goo.A00();
                    if (jin != null) {
                        c38635Gyc = new C38635Gyc(audioBrowserCategoryType, audioBrowserPlaylistType, jin, c38061Goo, this.A05.A01(jin), str, str2, i);
                        A1E2.add(c38635Gyc);
                    }
                }
            }
            if (c38061Goo.A0G == C05F.A01) {
                jin = c38061Goo.A00();
                if (jin != null) {
                    c38635Gyc = new C38635Gyc(audioBrowserCategoryType, audioBrowserPlaylistType, jin, c38061Goo, this.A05.A01(jin), str, str2, i);
                    A1E2.add(c38635Gyc);
                }
            } else {
                c38635Gyc = new C38635Gyc(audioBrowserCategoryType, audioBrowserPlaylistType, null, c38061Goo, null, str, str2, i);
                A1E2.add(c38635Gyc);
            }
        }
        submitList(A1E2);
    }

    public final int A00(JIN jin) {
        int itemCount = getItemCount();
        for (int i = 0; i < itemCount; i++) {
            C38061Goo c38061Goo = ((C38635Gyc) getItem(i)).A04;
            if (c38061Goo.A0G == C05F.A01 && C14360o3.A0K(c38061Goo.A00(), jin)) {
                return i;
            }
        }
        return -1;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int i2;
        int A03 = C0f9.A03(1880939108);
        Integer num = ((C38635Gyc) getItem(i)).A04.A0G;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue != 1) {
                if (intValue == 6) {
                    i2 = 8;
                }
            } else {
                i2 = 0;
            }
            C0f9.A0A(-740243319, A03);
            return i2;
        }
        IllegalArgumentException A12 = AbstractC166987dD.A12("Unsupported search item type");
        C0f9.A0A(-475946843, A03);
        throw A12;
    }
}
