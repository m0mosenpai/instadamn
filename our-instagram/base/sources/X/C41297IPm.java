package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.IPm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41297IPm {
    public static C38959HDl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38959HDl c38959HDl = new C38959HDl();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("formatted_media_count".equals(A0s)) {
                    c38959HDl.A08 = AbstractC167017dG.A0m(c16l);
                } else if ("is_music_page_restricted".equals(A0s)) {
                    c38959HDl.A0E = c16l.A0d();
                } else if ("music_page_restricted_context".equals(A0s)) {
                    c38959HDl.A03 = AbstractC40132Hqz.parseFromJson(c16l);
                } else if ("spotify_track_metadata".equals(A0s)) {
                    c38959HDl.A02 = AbstractC39760HkW.parseFromJson(c16l);
                } else if ("audio_page_reporting_id".equals(A0s)) {
                    c38959HDl.A07 = AbstractC167017dG.A0m(c16l);
                } else if ("music_canonical_id".equals(A0s)) {
                    c38959HDl.A09 = AbstractC167017dG.A0m(c16l);
                } else if ("audio_page_segments".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C32071E6x parseFromJson = AbstractC39819HlT.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c38959HDl.A0B = arrayList;
                } else if ("audio_ranking_info".equals(A0s)) {
                    c38959HDl.A04 = AbstractC84043oo.parseFromJson(c16l);
                } else if ("metadata".equals(A0s)) {
                    c38959HDl.A05 = AbstractC40547HyT.parseFromJson(c16l);
                } else if ("available_tabs".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c38959HDl.A0C = arrayList;
                } else if ("auto_created_reels_preview_metadata".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C38770H5k parseFromJson2 = AbstractC40296Hu0.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c38959HDl.A0A = arrayList;
                } else if ("media_count".equals(A0s)) {
                    c38959HDl.A00 = AbstractC40100HqS.parseFromJson(c16l);
                } else if ("music_page_response".equals(A0s)) {
                    c38959HDl.A06 = parseFromJson(c16l);
                } else if (AbstractC43591JPw.A00(1114).equals(A0s)) {
                    c38959HDl.A0D = c16l.A0d();
                } else if ("social_context".equals(A0s)) {
                    c38959HDl.A01 = AbstractC40101HqT.parseFromJson(c16l);
                } else {
                    C37410Gdq.A00(c16l, c38959HDl, A0s);
                }
                c16l.A0z();
            }
            c38959HDl.A02();
            return c38959HDl;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
