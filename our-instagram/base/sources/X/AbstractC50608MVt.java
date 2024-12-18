package X;

import com.instagram.music.common.model.AudioOverlayTrack;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.MVt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC50608MVt {
    public static JUM parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            EnumC50657MXx enumC50657MXx = null;
            C52435NIf c52435NIf = null;
            ArrayList arrayList = null;
            C8r2 c8r2 = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("uuid".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("media_type".equals(A0q)) {
                    enumC50657MXx = (EnumC50657MXx) EnumC50657MXx.A01.get(Integer.valueOf(c16l.A1D()));
                } else if ("photo_segments".equals(A0q)) {
                    c52435NIf = AbstractC54869OOe.parseFromJson(c16l);
                } else if ("video_segments".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C115475Kh parseFromJson = AbstractC115465Kg.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("video_edits".equals(A0q)) {
                    c8r2 = C9IW.parseFromJson(c16l);
                } else if ("multiple_audio_tracks".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            AudioOverlayTrack parseFromJson2 = AbstractC37894Glp.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("stickers".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            XBS parseFromJson3 = AbstractC70181WFj.parseFromJson(c16l);
                            if (parseFromJson3 != null) {
                                arrayList3.add(parseFromJson3);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("uuid", c16l, "UnschematizedUnifiedComposition");
            } else if (enumC50657MXx != null || !(c16l instanceof C07950bF)) {
                if (arrayList == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("video_segments", c16l, "UnschematizedUnifiedComposition");
                } else if (arrayList2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("multiple_audio_tracks", c16l, "UnschematizedUnifiedComposition");
                } else if (arrayList3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("stickers", c16l, "UnschematizedUnifiedComposition");
                } else {
                    return new JUM(c8r2, c52435NIf, enumC50657MXx, str, arrayList, arrayList2, arrayList3);
                }
            } else {
                AbstractC166997dE.A1V("media_type", c16l, "UnschematizedUnifiedComposition");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(JUM jum, AnonymousClass182 anonymousClass182) {
        anonymousClass182.A0d();
        String str = jum.A07;
        if (str != null) {
            anonymousClass182.A0S("uuid", str);
        }
        EnumC50657MXx enumC50657MXx = (EnumC50657MXx) jum.A01;
        if (enumC50657MXx != null) {
            anonymousClass182.A0Q("media_type", enumC50657MXx.A00);
        }
        C52435NIf c52435NIf = (C52435NIf) jum.A03;
        if (c52435NIf != null) {
            anonymousClass182.A0r("photo_segments");
            AbstractC54869OOe.A00(anonymousClass182, c52435NIf);
        }
        List list = (List) jum.A06;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "video_segments", list);
            while (A0q.hasNext()) {
                C115475Kh c115475Kh = (C115475Kh) A0q.next();
                if (c115475Kh != null) {
                    AbstractC115465Kg.A00(anonymousClass182, c115475Kh);
                }
            }
            anonymousClass182.A0Z();
        }
        C8r2 c8r2 = (C8r2) jum.A05;
        if (c8r2 != null) {
            anonymousClass182.A0r("video_edits");
            C9IW.A00(anonymousClass182, c8r2);
        }
        List list2 = (List) jum.A02;
        if (list2 != null) {
            Iterator A0q2 = AbstractC37301Gc2.A0q(anonymousClass182, "multiple_audio_tracks", list2);
            while (A0q2.hasNext()) {
                AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) A0q2.next();
                if (audioOverlayTrack != null) {
                    AbstractC37894Glp.A00(anonymousClass182, audioOverlayTrack);
                }
            }
            anonymousClass182.A0Z();
        }
        List list3 = (List) jum.A04;
        if (list3 != null) {
            Iterator A0q3 = AbstractC37301Gc2.A0q(anonymousClass182, "stickers", list3);
            while (A0q3.hasNext()) {
                XBS xbs = (XBS) A0q3.next();
                if (xbs != null) {
                    AbstractC70181WFj.A04(anonymousClass182, xbs);
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0a();
    }
}
