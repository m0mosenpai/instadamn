package X;

import com.instagram.api.schemas.TrackData;
import com.instagram.music.common.model.MusicSearchPlaylist;
import java.io.IOException;
import java.util.List;

/* loaded from: classes7.dex */
public final class IQ6 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static C38878HAa parseFromJson(C16L c16l) {
        ?? r8;
        List A0n;
        ?? r4;
        C38070Goz c38070Goz;
        List<C38738H4c> list;
        C14360o3.A0B(c16l, 0);
        try {
            C38878HAa c38878HAa = new C38878HAa();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("category".equals(A0s)) {
                    c38878HAa.A00 = AbstractC40574Hyu.parseFromJson(c16l);
                } else if ("default_playlist".equals(A0s)) {
                    c38878HAa.A01 = AbstractC40144HrD.parseFromJson(c16l);
                } else {
                    C55702hA.A01(c16l, c38878HAa, A0s);
                }
                c16l.A0z();
            }
            C38686GzR c38686GzR = c38878HAa.A00;
            if (c38686GzR != null && (A0n = AbstractC31171DnF.A0n((InterfaceC09390do) c38686GzR.A00)) != null && !A0n.isEmpty()) {
                r8 = AbstractC167017dG.A0q(A0n);
                int i = 0;
                for (Object obj : A0n) {
                    int i2 = i + 1;
                    if (i < 0) {
                        AbstractC16960so.A1U();
                        throw C00O.createAndThrow();
                    }
                    MusicSearchPlaylist musicSearchPlaylist = (MusicSearchPlaylist) obj;
                    String id = musicSearchPlaylist.A00().getId();
                    String title = musicSearchPlaylist.A00().getTitle();
                    if (i == 0 && (c38070Goz = c38878HAa.A01) != null && (list = c38070Goz.A07) != null) {
                        r4 = AbstractC166987dD.A1E();
                        for (C38738H4c c38738H4c : list) {
                            TrackData trackData = c38738H4c.A01;
                            if (trackData != null) {
                                C37964Gn6 c37964Gn6 = new C37964Gn6(trackData);
                                c37964Gn6.A00 = c38738H4c.A02;
                                r4.add(c37964Gn6);
                            }
                        }
                    } else {
                        r4 = C16930sl.A00;
                    }
                    r8.add(new MUD(16, id, title, (List) r4));
                    i = i2;
                }
            } else {
                r8 = C16930sl.A00;
            }
            c38878HAa.A02 = r8;
            return c38878HAa;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
