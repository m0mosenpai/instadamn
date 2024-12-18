package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.Map;

/* renamed from: X.SWq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62909SWq {
    public static final Object A04 = AbstractC58318PtA.A0b();
    public InterfaceC65194Tfc A00;
    public final Context A01;
    public final String A02;
    public final Map A03;

    public C62909SWq(Drawable.Callback callback, String str, Map map) {
        Context applicationContext;
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            str = AnonymousClass001.A0C(str, '/');
        }
        this.A02 = str;
        this.A03 = map;
        this.A00 = null;
        if (!(callback instanceof View)) {
            applicationContext = null;
        } else {
            applicationContext = ((View) callback).getContext().getApplicationContext();
        }
        this.A01 = applicationContext;
    }
}
