package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.io.IOException;

/* renamed from: X.PwB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58485PwB extends IOException {
    public final int A00;

    public C58485PwB(int i) {
        super(StringFormatUtil.formatStrLocaleSafe("Empty response body with status code %d", Integer.valueOf(i)));
        this.A00 = i;
    }
}
