package X;

import android.util.Base64;
import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import androidx.media3.extractor.metadata.flac.VorbisComment;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class W6N {
    public static C68652VZl A01(WFa wFa, boolean z, boolean z2) {
        if (z) {
            A02(wFa, 3, false);
        }
        int A0A = (int) wFa.A0A();
        Charset charset = AbstractC50482Ts.A05;
        wFa.A0I(charset, A0A);
        long A0A2 = wFa.A0A();
        String[] strArr = new String[(int) A0A2];
        for (int i = 0; i < A0A2; i++) {
            strArr[i] = wFa.A0I(charset, (int) wFa.A0A());
        }
        if (z2 && (wFa.A05() & 1) == 0) {
            throw new VCM("framing bit expected to be set", null, 1, true);
        }
        return new C68652VZl(strArr);
    }

    public static Metadata A00(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String[] split = str.split(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR, 2);
            if (split.length != 2) {
                AbstractC63374Sil.A04("VorbisUtil", AnonymousClass001.A0R("Failed to parse Vorbis comment: ", str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(PictureFrame.A00(new WFa(Base64.decode(split[1], 0))));
                } catch (RuntimeException e) {
                    AbstractC63374Sil.A06("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new VorbisComment(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static boolean A02(WFa wFa, int i, boolean z) {
        String str;
        StringBuilder sb;
        int i2 = wFa.A00 - wFa.A01;
        if (i2 < 7) {
            if (!z) {
                sb = new StringBuilder();
                sb.append("too short header: ");
                sb.append(i2);
                str = sb.toString();
            }
            return false;
        }
        if (wFa.A05() != i) {
            if (!z) {
                sb = new StringBuilder();
                sb.append("expected header type ");
                AbstractC58318PtA.A1T(sb, i);
                str = sb.toString();
            }
        } else {
            if (wFa.A05() == 118 && wFa.A05() == 111 && wFa.A05() == 114 && wFa.A05() == 98 && wFa.A05() == 105 && wFa.A05() == 115) {
                return true;
            }
            if (!z) {
                str = "expected characters 'vorbis'";
            }
        }
        return false;
        throw new VCM(str, null, 1, true);
    }
}
