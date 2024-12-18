package X;

import android.content.Context;
import java.util.Arrays;

/* renamed from: X.0cG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08520cG {
    public final InterfaceC08100bW A00;
    public final InterfaceC08580cM A01;

    public final void A00(Context context, C0LG c0lg, String str) {
        int i = c0lg.A00;
        String[] A05 = AbstractC08450c9.A05(context, i);
        if (A05.length == 1) {
            this.A01.ACr(context, A05[0], str);
            return;
        }
        for (String str2 : A05) {
            try {
                this.A01.ACr(context, str2, str);
                return;
            } catch (C08670cV unused) {
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("FBPermission '");
        sb.append(str);
        sb.append("' was not granted to UID '");
        sb.append(i);
        sb.append("' (packages: '");
        sb.append(Arrays.toString(A05));
        sb.append("')");
        throw new SecurityException(sb.toString());
    }

    public C08520cG(InterfaceC08100bW interfaceC08100bW, InterfaceC08580cM interfaceC08580cM) {
        this.A01 = interfaceC08580cM;
        this.A00 = interfaceC08100bW;
    }
}
