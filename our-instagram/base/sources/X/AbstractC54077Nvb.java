package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Nvb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54077Nvb {
    public static C51760Mtj parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C51760Mtj c51760Mtj = new C51760Mtj();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if (AbstractC43591JPw.A00(494).equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            arrayList.add(new Float(c16l.A0U()));
                        }
                    }
                    c51760Mtj.A01 = arrayList;
                } else if ("waveform_sampling_frequency_hz".equals(A0s)) {
                    c51760Mtj.A02 = AbstractC166997dE.A0h(c16l);
                } else if ("transcription_data".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C51757Mtg parseFromJson = AbstractC54881OPc.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c51760Mtj.A00 = arrayList;
                }
                c16l.A0z();
            }
            return c51760Mtj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
