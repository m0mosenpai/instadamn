package X;

import com.facebook.ui.emoji.model.BasicEmoji;
import com.facebook.ui.emoji.model.Emoji;
import com.instagram.ui.emoji.EmojiSkinTone$createVariations$baseEmoji$1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7ii, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC170297ii {
    public static final boolean A01(C148336m3 c148336m3, C148336m3 c148336m32) {
        C14360o3.A0B(c148336m3, 0);
        C14360o3.A0B(c148336m32, 1);
        String str = c148336m3.A02;
        String str2 = c148336m32.A02;
        int[] A02 = Emoji.A02();
        int A01 = Emoji.A01(A02, Emoji.A00(str, A02), true);
        int[] A022 = Emoji.A02();
        if (A01 == Emoji.A01(A022, Emoji.A00(str2, A022), true)) {
            for (int i = 0; i < A01; i++) {
                try {
                    if (A02[i] == A022[i]) {
                    }
                } catch (Throwable th) {
                    C12550kz c12550kz = Emoji.A01;
                    c12550kz.EE6(A02);
                    c12550kz.EE6(A022);
                    throw th;
                }
            }
            C12550kz c12550kz2 = Emoji.A01;
            c12550kz2.EE6(A02);
            c12550kz2.EE6(A022);
            return true;
        }
        C12550kz c12550kz3 = Emoji.A01;
        c12550kz3.EE6(A02);
        c12550kz3.EE6(A022);
        return false;
    }

    public static final C148336m3[] A02(String str, boolean z) {
        List list;
        int i;
        String str2;
        C14360o3.A0B(str, 0);
        EmojiSkinTone$createVariations$baseEmoji$1 emojiSkinTone$createVariations$baseEmoji$1 = null;
        if (z) {
            emojiSkinTone$createVariations$baseEmoji$1 = new EmojiSkinTone$createVariations$baseEmoji$1(str);
        }
        int[] A02 = Emoji.A02();
        int A00 = Emoji.A00(str, A02);
        if (A00 > 1 && (i = A02[1]) >= 127995 && i <= 127999) {
            ArrayList arrayList = new ArrayList();
            if (emojiSkinTone$createVariations$baseEmoji$1 != null) {
                if (A00 <= 2) {
                    str2 = new String(A02, 0, 1);
                } else {
                    int i2 = A00 - 2;
                    System.arraycopy(A02, 2, A02, 1, i2);
                    str2 = new String(A02, 0, A00 - 1);
                    System.arraycopy(A02, 1, A02, 2, i2);
                }
                arrayList.add(new BasicEmoji(str2));
            }
            int i3 = 127995;
            do {
                A02[1] = i3;
                arrayList.add(new BasicEmoji(new String(A02, 0, A00)));
                i3++;
            } while (i3 != 128000);
            Emoji.A01.EE6(A02);
            list = arrayList;
        } else {
            int A002 = AbstractC168797gD.A00(A02, A00);
            if (A002 < 0) {
                Emoji.A01.EE6(A02);
                if (emojiSkinTone$createVariations$baseEmoji$1 == null) {
                    list = Collections.emptyList();
                } else {
                    list = Collections.singletonList(emojiSkinTone$createVariations$baseEmoji$1);
                }
            } else {
                ArrayList arrayList2 = new ArrayList();
                if (emojiSkinTone$createVariations$baseEmoji$1 != null) {
                    arrayList2.add(emojiSkinTone$createVariations$baseEmoji$1);
                }
                int i4 = 127995;
                do {
                    A02[1] = i4;
                    arrayList2.add(new BasicEmoji(new String(A02, 0, A002)));
                    i4++;
                } while (i4 != 128000);
                Emoji.A01.EE6(A02);
                list = Collections.unmodifiableList(arrayList2);
            }
        }
        C14360o3.A07(list);
        ArrayList arrayList3 = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A03 = ((Emoji) it.next()).A03();
            C14360o3.A07(A03);
            arrayList3.add(new C148336m3(A03, -1));
        }
        return (C148336m3[]) arrayList3.toArray(new C148336m3[0]);
    }

    public static final boolean A00(C148336m3 c148336m3) {
        if (!AbstractC168797gD.A01(c148336m3.A02)) {
            return false;
        }
        return true;
    }
}
