package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.5Kf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC115455Kf {
    public static C115595Kt parseFromJson(C16L c16l) {
        AbstractC115485Ki parseFromJson;
        C14360o3.A0B(c16l, 0);
        try {
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            C5JH c5jh = null;
            C47v c47v = null;
            C9BW c9bw = null;
            ArrayList arrayList2 = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J != c16r2) {
                    String A0q = c16l.A0q();
                    c16l.A1J();
                    if ("serializable_ig_clip_segments".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                if (c16l.A11() == c16r) {
                                    C9BH c9bh = null;
                                    while (c16l.A1J() != c16r2) {
                                        String A0q2 = c16l.A0q();
                                        C14360o3.A07(A0q2);
                                        c16l.A1J();
                                        if (A0q2.equals("VIDEO")) {
                                            parseFromJson = AbstractC115465Kg.parseFromJson(c16l);
                                        } else {
                                            parseFromJson = AbstractC54869OOe.parseFromJson(c16l);
                                        }
                                        C14360o3.A07(parseFromJson);
                                        c9bh = new C9BH(parseFromJson);
                                    }
                                    if (c9bh != null) {
                                        arrayList.add(c9bh);
                                    }
                                } else {
                                    throw new IOException("failed to parse SerializableIgClipSegmentList");
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                    } else if ("audio_track_overlay".equals(A0q)) {
                        c5jh = C5JG.parseFromJson(c16l);
                    } else if ("media_audio_overlay_info".equals(A0q)) {
                        c47v = AnonymousClass481.parseFromJson(c16l);
                    } else if ("bleep_map".equals(A0q)) {
                        c9bw = AbstractC115625Ky.parseFromJson(c16l);
                    } else if ("audio_effects".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList2 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C115585Ks parseFromJson2 = AbstractC115575Kr.parseFromJson(c16l);
                                if (parseFromJson2 != null) {
                                    arrayList2.add(parseFromJson2);
                                }
                            }
                        } else {
                            arrayList2 = null;
                        }
                    }
                    c16l.A0z();
                } else {
                    if (arrayList == null && (c16l instanceof C07950bF)) {
                        ((C07950bF) c16l).A03.A00("serializable_ig_clip_segments", "ClipsStitchingParams");
                        throw C00O.createAndThrow();
                    }
                    return new C115595Kt(c9bw, c5jh, c47v, arrayList, arrayList2);
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
