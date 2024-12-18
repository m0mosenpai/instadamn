package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.TrackDataImpl;
import com.instagram.api.schemas.TrackMetadata;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicModelEffectPair;
import com.instagram.music.common.model.MusicSearchPlaylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.IdN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41694IdN {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.instagram.api.schemas.TrackMetadata] */
    /* JADX WARN: Type inference failed for: r1v7 */
    public static final JL3 A00(JIN jin) {
        OriginalSoundData originalSoundData;
        int A00;
        C41090IHh c41090IHh;
        ?? r1;
        if (jin instanceof C37964Gn6) {
            originalSoundData = null;
            A00 = AbstractC37301Gc2.A00(new C37761pD(null));
            c41090IHh = new C41090IHh(new C38738H4c(null, null, null));
            c41090IHh.A01 = ((C37964Gn6) jin).A05;
        } else if (jin instanceof C42733IvT) {
            originalSoundData = null;
            A00 = AbstractC37301Gc2.A00(new C37761pD(null));
            c41090IHh = new C41090IHh(new C38738H4c(null, null, null));
            c41090IHh.A00 = ((C42733IvT) jin).A02;
        } else {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Unsupported audioSearchTrack type: ");
            throw AbstractC166987dD.A12(AbstractC166997dE.A0v(jin.CBi(), A1C));
        }
        AbstractC31180DnO.A0w(A00);
        TrackDataImpl trackDataImpl = null;
        C1DY A0C = AbstractC37302Gc3.A0C(A00);
        TrackMetadata trackMetadata = c41090IHh.A02;
        if (trackMetadata != null) {
            r1 = trackMetadata.F3Q();
        } else {
            r1 = originalSoundData;
        }
        OriginalSoundDataIntf originalSoundDataIntf = c41090IHh.A00;
        if (originalSoundDataIntf != null) {
            originalSoundData = originalSoundDataIntf.Exi(A0C);
        }
        TrackData trackData = c41090IHh.A01;
        if (trackData != null) {
            trackDataImpl = trackData.F3P();
        }
        return new C38738H4c(originalSoundData, trackDataImpl, r1);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, X.Goo] */
    public static final C38061Goo A01(Context context, String str, String str2, List list, int i) {
        String A0p = AbstractC166997dE.A0p(context, i);
        int A00 = AbstractC37301Gc2.A00(new C37761pD(null));
        AbstractC31180DnO.A0w(A00);
        C1DY A0C = AbstractC37302Gc3.A0C(A00);
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(((JL3) it.next()).EyB(A0C));
        }
        C38070Goz c38070Goz = new C38070Goz(null, null, null, str2, str, null, A0p, A0q);
        ?? obj = new Object();
        obj.A0E = new MusicSearchPlaylist(c38070Goz);
        obj.A02();
        return obj;
    }

    public final C38061Goo A02(Context context, ImmutableList immutableList) {
        List A0n;
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator<E> it = immutableList.iterator();
        while (it.hasNext()) {
            MusicAssetModel musicAssetModel = ((MusicModelEffectPair) it.next()).A01;
            if (musicAssetModel != null) {
                A1E.add(AbstractC37963Gn5.A00(musicAssetModel));
            }
        }
        ArrayList A1E2 = AbstractC166987dD.A1E();
        Iterator it2 = A1E.iterator();
        while (it2.hasNext()) {
            A1E2.add(A00((JIN) it2.next()));
        }
        C38061Goo A01 = A01(context, "PLAYLIST_ID.IN_THIS_REEL", null, A1E2, 2131967980);
        A01.A0G = C05F.A0j;
        MusicSearchPlaylist musicSearchPlaylist = A01.A0E;
        if (musicSearchPlaylist != null && (A0n = AbstractC31171DnF.A0n(musicSearchPlaylist.A01)) != null) {
            Iterator it3 = AbstractC001800i.A0R(A0n, immutableList).iterator();
            while (it3.hasNext()) {
                C09530e4 c09530e4 = (C09530e4) it3.next();
                JIN A00 = ((C38061Goo) c09530e4.A00).A00();
                if (A00 != null) {
                    A00.EPw(((MusicModelEffectPair) c09530e4.A01).A00);
                }
            }
        }
        return A01;
    }
}
