package X;

import com.instagram.music.common.model.MusicSearchArtist;
import com.instagram.music.common.model.MusicSearchPlaylist;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Gp5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38076Gp5 {
    public static final void A00(List list, String str) {
        int intValue;
        C14360o3.A0B(list, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C38061Goo c38061Goo = (C38061Goo) it.next();
            Integer num = c38061Goo.A0G;
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            if (intValue != 1) {
                if (intValue != 5) {
                    if (intValue == 8) {
                        MusicSearchArtist musicSearchArtist = c38061Goo.A0B;
                        if (musicSearchArtist != null) {
                            musicSearchArtist.A00 = str;
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else {
                        return;
                    }
                } else {
                    MusicSearchPlaylist musicSearchPlaylist = c38061Goo.A0E;
                    if (musicSearchPlaylist != null) {
                        for (C38061Goo c38061Goo2 : AbstractC31171DnF.A0n(musicSearchPlaylist.A01)) {
                            if (c38061Goo2.A0G == C05F.A01) {
                                JIN A00 = c38061Goo2.A00();
                                if (A00 != null) {
                                    A00.EPU(str);
                                } else {
                                    throw AbstractC166987dD.A14("Required value was null.");
                                }
                            }
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
            } else {
                JIN A002 = c38061Goo.A00();
                if (A002 != null) {
                    A002.EPU(str);
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
        }
    }
}
