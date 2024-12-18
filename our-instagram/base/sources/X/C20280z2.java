package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.0z2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20280z2 extends AbstractC001600g {
    @Override // X.AbstractC001600g
    public final /* bridge */ /* synthetic */ Object A02(Intent intent, int i) {
        boolean z = false;
        if (i == -1) {
            z = true;
        }
        if (!z || intent == null) {
            return null;
        }
        return intent.getData();
    }

    @Override // X.AbstractC001600g
    public final /* bridge */ /* synthetic */ Intent A00(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        C14360o3.A0B(strArr, 1);
        Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
        C14360o3.A07(type);
        return type;
    }
}
