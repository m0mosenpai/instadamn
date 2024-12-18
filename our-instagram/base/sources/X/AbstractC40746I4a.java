package X;

import com.instagram.music.common.model.LyricsPhrase;
import com.instagram.music.common.model.WordOffset;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.I4a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40746I4a {
    public static LyricsPhrase parseFromJson(C16L c16l) {
        int i = 0;
        C14360o3.A0B(c16l, 0);
        try {
            LyricsPhrase lyricsPhrase = new LyricsPhrase();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("start_time_in_ms".equals(A0s)) {
                    lyricsPhrase.A00 = c16l.A1D();
                } else {
                    ArrayList arrayList = null;
                    if ("phrase".equals(A0s)) {
                        String A0m = AbstractC167017dG.A0m(c16l);
                        C14360o3.A0B(A0m, 0);
                        lyricsPhrase.A01 = A0m;
                    } else if ("word_offsets".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                WordOffset parseFromJson = AbstractC40749I4d.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        lyricsPhrase.A02 = arrayList;
                    }
                }
                c16l.A0z();
            }
            String str = lyricsPhrase.A01;
            int length = str.length() - 1;
            boolean z = false;
            while (i <= length) {
                int i2 = length;
                if (!z) {
                    i2 = i;
                }
                int A00 = C14360o3.A00(str.charAt(i2), 32);
                boolean z2 = false;
                if (A00 <= 0) {
                    z2 = true;
                }
                if (!z) {
                    if (!z2) {
                        z = true;
                    } else {
                        i++;
                    }
                } else {
                    if (!z2) {
                        break;
                    }
                    length--;
                }
            }
            lyricsPhrase.A01 = str.subSequence(i, length + 1).toString();
            return lyricsPhrase;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
