package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.481, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class AnonymousClass481 {
    public static C47v parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C47v c47v = new C47v();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("video_volume".equals(A0q)) {
                    c47v.A00 = (float) c16l.A0U();
                } else {
                    String str = null;
                    ArrayList arrayList = null;
                    if ("media_audio_overlays".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C5JH parseFromJson = C5JG.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        C14360o3.A0B(arrayList, 0);
                        c47v.A03 = arrayList;
                    } else if ("audio_mix_burned_in".equals(A0q)) {
                        c47v.A04 = c16l.A0d();
                    } else if ("original_audio_title".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c47v.A02 = str;
                    } else if ("metadata".equals(A0q)) {
                        C9BW parseFromJson2 = AnonymousClass482.parseFromJson(c16l);
                        C14360o3.A0B(parseFromJson2, 0);
                        c47v.A01 = parseFromJson2;
                    }
                }
                c16l.A0z();
            }
            return c47v;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C47v c47v) {
        anonymousClass182.A0d();
        anonymousClass182.A0P("video_volume", c47v.A00);
        C16V.A03(anonymousClass182, "media_audio_overlays");
        for (C5JH c5jh : c47v.A03) {
            if (c5jh != null) {
                C5JG.A00(anonymousClass182, c5jh);
            }
        }
        anonymousClass182.A0Z();
        anonymousClass182.A0T("audio_mix_burned_in", c47v.A04);
        String str = c47v.A02;
        if (str != null) {
            anonymousClass182.A0S("original_audio_title", str);
        }
        anonymousClass182.A0r("metadata");
        C9BW c9bw = c47v.A01;
        anonymousClass182.A0d();
        EnumC192868gS enumC192868gS = (EnumC192868gS) c9bw.A01;
        if (enumC192868gS != null) {
            anonymousClass182.A0S("voice_effect", enumC192868gS.name());
        }
        if (c9bw.A00 != null) {
            C16V.A03(anonymousClass182, "sound_effects");
            for (C9ZV c9zv : (List) c9bw.A00) {
                if (c9zv != null) {
                    anonymousClass182.A0d();
                    String str2 = c9zv.A04;
                    if (str2 != null) {
                        anonymousClass182.A0S(AbstractC111324zv.A00(2303), str2);
                    }
                    anonymousClass182.A0Q("duration_ms", c9zv.A00);
                    String str3 = c9zv.A02;
                    if (str3 != null) {
                        anonymousClass182.A0S("audio_asset_id", str3);
                    }
                    String str4 = c9zv.A03;
                    if (str4 != null) {
                        anonymousClass182.A0S("audio_cluster_id", str4);
                    }
                    anonymousClass182.A0R("start_time_ms", c9zv.A01);
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0a();
        anonymousClass182.A0a();
    }
}
