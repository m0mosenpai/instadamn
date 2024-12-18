package X;

import com.google.android.gms.common.Feature;

/* renamed from: X.TYe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64878TYe extends UnsupportedOperationException {
    public final Feature A00;

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(String.valueOf(this.A00)));
    }

    public C64878TYe(Feature feature) {
        this.A00 = feature;
    }
}
