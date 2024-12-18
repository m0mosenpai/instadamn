package X;

import com.facebook.spm.SentencePieceModel;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class LA2 {
    public SentencePieceModel A00;
    public final String A01;

    public final boolean A00() {
        return AbstractC167007dF.A1W(this.A00);
    }

    public final boolean A01() {
        if (this.A00 == null) {
            try {
                ZdZ zdZ = SentencePieceModel.Companion;
                this.A00 = new SentencePieceModel(this.A01);
                return true;
            } catch (Exception e) {
                C0K8.A0F("Text2Filter Llama2 Tokenizer", "Failed to load spm model", e);
                return false;
            }
        }
        return true;
    }

    public final long[] A03(String str) {
        C14360o3.A0B(str, 0);
        int[] A02 = A02(str);
        long[] jArr = new long[512];
        Arrays.fill(jArr, 0, 512, 0L);
        if (A02 != null) {
            int i = 0;
            loop0: while (true) {
                long j = 2;
                while (true) {
                    jArr[i] = j;
                    i++;
                    if (i >= 512) {
                        break loop0;
                    }
                    if (i != 0) {
                        if (1 <= i && i <= Math.min(A02.length, 510)) {
                            j = A02[i - 1] + 1;
                        } else if (i == Math.min(A02.length + 1, 511)) {
                            j = 3;
                        } else {
                            j = 0;
                        }
                    }
                }
            }
        }
        return jArr;
    }

    public LA2(String str) {
        this.A01 = str;
    }

    public final int[] A02(String str) {
        if (!A00()) {
            A01();
        }
        SentencePieceModel sentencePieceModel = this.A00;
        if (sentencePieceModel != null) {
            return sentencePieceModel.encode(str);
        }
        return null;
    }
}
