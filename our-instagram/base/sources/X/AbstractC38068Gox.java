package X;

import com.instagram.api.schemas.AudioMetadataLabels;
import com.instagram.api.schemas.TrackMetadataImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Gox, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38068Gox {
    public static TrackMetadataImpl parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            ArrayList arrayList = null;
            Long l = null;
            String str = null;
            Boolean bool3 = null;
            Integer num = null;
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("allow_media_creation_with_music".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("display_labels".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() == C16R.A0G) {
                                A1P = null;
                            } else {
                                A1P = c16l.A1P();
                            }
                            arrayList.add(AbstractC106034qH.A00(A1P));
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("display_media_id".equals(A0q)) {
                    l = Long.valueOf(c16l.A0y());
                } else if ("formatted_clips_media_count".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("is_bookmarked".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("is_trending_in_clips".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("previous_trend_rank".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("trend_rank".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("allow_media_creation_with_music", "TrackMetadataImpl");
            } else if (bool2 == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("is_bookmarked", "TrackMetadataImpl");
            } else {
                return new TrackMetadataImpl(bool3, num, num2, l, str, arrayList, bool.booleanValue(), bool2.booleanValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, TrackMetadataImpl trackMetadataImpl) {
        anonymousClass182.A0d();
        anonymousClass182.A0T("allow_media_creation_with_music", trackMetadataImpl.A06);
        List list = trackMetadataImpl.A05;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "display_labels", list);
            while (A0q.hasNext()) {
                AudioMetadataLabels audioMetadataLabels = (AudioMetadataLabels) A0q.next();
                if (audioMetadataLabels != null) {
                    anonymousClass182.A0u(audioMetadataLabels.A00);
                }
            }
            anonymousClass182.A0Z();
        }
        Long l = trackMetadataImpl.A03;
        if (l != null) {
            anonymousClass182.A0R("display_media_id", l.longValue());
        }
        String str = trackMetadataImpl.A04;
        if (str != null) {
            anonymousClass182.A0S("formatted_clips_media_count", str);
        }
        anonymousClass182.A0T("is_bookmarked", trackMetadataImpl.A07);
        Boolean bool = trackMetadataImpl.A00;
        if (bool != null) {
            anonymousClass182.A0T("is_trending_in_clips", bool.booleanValue());
        }
        Integer num = trackMetadataImpl.A01;
        if (num != null) {
            anonymousClass182.A0Q("previous_trend_rank", num.intValue());
        }
        Integer num2 = trackMetadataImpl.A02;
        if (num2 != null) {
            anonymousClass182.A0Q("trend_rank", num2.intValue());
        }
        anonymousClass182.A0a();
    }
}
