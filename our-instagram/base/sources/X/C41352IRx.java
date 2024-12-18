package X;

import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.TrackDataImpl;
import com.instagram.api.schemas.TrackMetadata;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.IRx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41352IRx {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.HYY] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.TwV, X.HYY] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.HYS, X.N3P] */
    public static HYS parseFromJson(C16L c16l) {
        ?? r5;
        ?? hyy;
        C14360o3.A0B(c16l, 0);
        try {
            ?? n3p = new N3P();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37301Gc2.A1W(c16l, A0q)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C38061Goo parseFromJson = AbstractC38073Gp2.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    n3p.A00 = arrayList;
                } else {
                    AbstractC54184NxL.A00(c16l, n3p, A0q);
                }
                c16l.A0z();
            }
            List<C38061Goo> list = n3p.A00;
            if (list != null) {
                r5 = AbstractC166987dD.A1E();
                for (C38061Goo c38061Goo : list) {
                    if (AbstractC167007dF.A1W(c38061Goo.A0F)) {
                        OriginalSoundData originalSoundData = c38061Goo.A05;
                        if (originalSoundData != null) {
                            hyy = new AbstractC65924TwV(7);
                            hyy.A00 = originalSoundData;
                            hyy.A03 = new C42733IvT(originalSoundData);
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else {
                        TrackDataImpl trackDataImpl = c38061Goo.A08;
                        if (trackDataImpl != null) {
                            TrackMetadata trackMetadata = c38061Goo.A0A;
                            if (trackMetadata != null) {
                                hyy = new HYY(trackDataImpl, trackMetadata);
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    }
                    r5.add(hyy);
                }
            } else {
                r5 = C16930sl.A00;
            }
            C14360o3.A0B(r5, 0);
            n3p.A09 = r5;
            return n3p;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
