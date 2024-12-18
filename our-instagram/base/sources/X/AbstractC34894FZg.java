package X;

import com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate;
import com.instagram.direct.model.DirectThreadThemeInfo;

/* renamed from: X.FZg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34894FZg {
    public static final ThemeViewModelDelegate A00 = new ThemeViewModelDelegate("", null, null, null, null, null, new int[0], new int[0], -1, -1, -1, -1, -1);

    public static final ThemeViewModelDelegate A00(DirectThreadThemeInfo directThreadThemeInfo) {
        if (directThreadThemeInfo != null) {
            DirectThreadThemeInfo A002 = AbstractC47901LDv.A00(directThreadThemeInfo.A0o);
            if (A002 != null) {
                directThreadThemeInfo = A002;
            }
            String str = directThreadThemeInfo.A0o;
            int i = directThreadThemeInfo.A04;
            String str2 = directThreadThemeInfo.A0k;
            if (str2 == null) {
                str2 = directThreadThemeInfo.A0f;
            }
            int i2 = directThreadThemeInfo.A07;
            int i3 = directThreadThemeInfo.A03;
            return new ThemeViewModelDelegate(str, str2, directThreadThemeInfo.A0n, directThreadThemeInfo.A0j, directThreadThemeInfo.A0l, directThreadThemeInfo.A0i, DirectThreadThemeInfo.A00(directThreadThemeInfo.A0s), DirectThreadThemeInfo.A00(directThreadThemeInfo.A0q), i, i2, i3, directThreadThemeInfo.A02(), directThreadThemeInfo.A01());
        }
        return A00;
    }
}
