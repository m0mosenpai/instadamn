package X;

import com.instagram.api.schemas.TrackMetadata;
import com.instagram.api.schemas.TrackMetadataImpl;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioType;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Gr5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38200Gr5 implements XED {
    public static final C38200Gr5 A00 = new Object();

    @Override // X.XED
    public final String EOs(UserSession userSession, List list) {
        C14360o3.A0B(list, 1);
        StringWriter A0O = AbstractC37300Gc1.A0O();
        C17z A0S = AbstractC167007dF.A0S(A0O);
        Iterator A0q = AbstractC37301Gc2.A0q(A0S, "tracks", list);
        while (A0q.hasNext()) {
            HYY hyy = (HYY) A0q.next();
            if (hyy != null) {
                A0S.A0d();
                if (hyy.A01 != null) {
                    A0S.A0r("track");
                    AbstractC84383pX.A00(A0S, hyy.A01);
                }
                if (hyy.A02 != null) {
                    A0S.A0r("metadata");
                    AbstractC38068Gox.A00(A0S, hyy.A02);
                }
                if (hyy.A00 != null) {
                    A0S.A0r("original_sound");
                    C3XP.A00(A0S, hyy.A00);
                }
                AbstractC37930GmS.A00(A0S, hyy);
                A0S.A0a();
            }
        }
        A0S.A0Z();
        String A0l = AbstractC167017dG.A0l(A0S, A0O);
        C14360o3.A07(A0l);
        return A0l;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.TwV, X.HYY] */
    @Override // X.XED
    public final /* bridge */ /* synthetic */ AbstractC65924TwV AM9(UserSession userSession, Object obj, long j) {
        TrackMetadataImpl trackMetadataImpl;
        JIN jin = (JIN) obj;
        AbstractC167017dG.A1O(userSession, jin);
        C1DU A002 = C1DS.A00(userSession);
        C14360o3.A0B(A002, 3);
        ?? abstractC65924TwV = new AbstractC65924TwV(7);
        abstractC65924TwV.A02 = j;
        abstractC65924TwV.A03 = jin;
        AudioType CBi = jin.CBi();
        if (CBi == AudioType.A03) {
            C37964Gn6 c37964Gn6 = (C37964Gn6) jin;
            C14360o3.A0B(c37964Gn6, 0);
            abstractC65924TwV.A01 = c37964Gn6.A06.F3P();
            TrackMetadata trackMetadata = c37964Gn6.A00;
            if (trackMetadata != null) {
                trackMetadataImpl = trackMetadata.F3Q();
            } else {
                trackMetadataImpl = null;
            }
            abstractC65924TwV.A02 = trackMetadataImpl;
        } else if (CBi == AudioType.A04) {
            C42733IvT c42733IvT = (C42733IvT) jin;
            C14360o3.A0B(c42733IvT, 0);
            abstractC65924TwV.A00 = c42733IvT.A02.Exj(A002);
            return abstractC65924TwV;
        }
        return abstractC65924TwV;
    }

    @Override // X.XED
    public final /* bridge */ /* synthetic */ Object Avj(AbstractC65924TwV abstractC65924TwV) {
        HYY hyy = (HYY) abstractC65924TwV;
        C14360o3.A0B(hyy, 0);
        JIN A06 = hyy.A06();
        if (A06 != null) {
            return A06;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.XED
    public final /* bridge */ /* synthetic */ String BF9(Object obj) {
        JIN jin = (JIN) obj;
        C14360o3.A0B(jin, 0);
        return jin.getId();
    }

    @Override // X.XED
    public final ArrayList AOw(UserSession userSession, String str) {
        return AbstractC001800i.A0U(AbstractC40795I5x.parseFromJson(C16V.A00(str)).A00);
    }
}
