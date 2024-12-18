package X;

import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.Id3Frame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import com.google.common.collect.ImmutableList;

/* loaded from: classes11.dex */
public abstract class WDo {
    public static int A00(WFa wFa) {
        int A01 = wFa.A01();
        if (wFa.A01() == 1684108385) {
            wFa.A0P(8);
            int i = A01 - 16;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4 && (wFa.A02[wFa.A01] & 255 & 128) == 0) {
                            return wFa.A07();
                        }
                    } else {
                        return wFa.A06();
                    }
                } else {
                    return wFa.A08();
                }
            } else {
                return wFa.A05();
            }
        }
        AbstractC63374Sil.A04("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static Id3Frame A01(WFa wFa, String str, int i, boolean z, boolean z2) {
        int A00 = A00(wFa);
        if (z2) {
            A00 = Math.min(1, A00);
        }
        if (A00 >= 0) {
            String num = Integer.toString(A00);
            if (z) {
                return new TextInformationFrame(str, null, ImmutableList.of((Object) num));
            }
            return new CommentFrame("und", str, num);
        }
        AbstractC63374Sil.A04("MetadataUtil", AnonymousClass001.A0R(AbstractC111324zv.A00(1631), W46.A00(i)));
        return null;
    }

    public static TextInformationFrame A02(WFa wFa, String str, int i) {
        int A01 = wFa.A01();
        if (wFa.A01() == 1684108385 && A01 >= 22) {
            wFa.A0P(10);
            int A08 = wFa.A08();
            if (A08 > 0) {
                String A0O = AnonymousClass001.A0O("", A08);
                int A082 = wFa.A08();
                if (A082 > 0) {
                    A0O = AnonymousClass001.A0b(A0O, "/", A082);
                }
                return new TextInformationFrame(str, null, ImmutableList.of((Object) A0O));
            }
        }
        AbstractC63374Sil.A04("MetadataUtil", AnonymousClass001.A0R(AbstractC111324zv.A00(1627), W46.A00(i)));
        return null;
    }

    public static TextInformationFrame A03(WFa wFa, String str, int i) {
        int A01 = wFa.A01();
        if (wFa.A01() == 1684108385) {
            wFa.A0P(8);
            return new TextInformationFrame(str, null, ImmutableList.of((Object) wFa.A0G(A01 - 16)));
        }
        AbstractC63374Sil.A04("MetadataUtil", AnonymousClass001.A0R(AbstractC111324zv.A00(1628), W46.A00(i)));
        return null;
    }
}
