package X;

import com.instagram.api.schemas.DirectAudioFallbackUrl;
import com.instagram.api.schemas.DirectAudioFallbackUrlImpl;
import com.instagram.feed.audio.Audio;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4G3, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4G3 {
    public static Audio parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Long l = null;
            Long l2 = null;
            DirectAudioFallbackUrlImpl directAudioFallbackUrlImpl = null;
            ArrayList arrayList = null;
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("audio_src".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("audio_src_expiration_timestamp_us".equals(A0q)) {
                    l = Long.valueOf(c16l.A0y());
                } else if ("duration".equals(A0q)) {
                    l2 = Long.valueOf(c16l.A0y());
                } else if ("fallback".equals(A0q)) {
                    directAudioFallbackUrlImpl = C4G4.parseFromJson(c16l);
                } else if ("waveform_data".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            arrayList.add(new Float(c16l.A0U()));
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("waveform_sampling_frequency_hz".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            return new Audio(directAudioFallbackUrlImpl, num, l, l2, str, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, Audio audio) {
        anonymousClass182.A0d();
        String str = audio.A04;
        if (str != null) {
            anonymousClass182.A0S("audio_src", str);
        }
        Long l = audio.A02;
        if (l != null) {
            anonymousClass182.A0R("audio_src_expiration_timestamp_us", l.longValue());
        }
        Long l2 = audio.A03;
        if (l2 != null) {
            anonymousClass182.A0R("duration", l2.longValue());
        }
        DirectAudioFallbackUrl directAudioFallbackUrl = audio.A00;
        if (directAudioFallbackUrl != null) {
            anonymousClass182.A0r("fallback");
            DirectAudioFallbackUrlImpl Et6 = directAudioFallbackUrl.Et6();
            anonymousClass182.A0d();
            String str2 = Et6.A00;
            if (str2 != null) {
                anonymousClass182.A0S("audio_src", str2);
            }
            anonymousClass182.A0a();
        }
        List<Number> list = audio.A05;
        if (list != null) {
            C16V.A03(anonymousClass182, "waveform_data");
            for (Number number : list) {
                if (number != null) {
                    anonymousClass182.A0g(number.floatValue());
                }
            }
            anonymousClass182.A0Z();
        }
        Integer num = audio.A01;
        if (num != null) {
            anonymousClass182.A0Q("waveform_sampling_frequency_hz", num.intValue());
        }
        anonymousClass182.A0a();
    }
}
