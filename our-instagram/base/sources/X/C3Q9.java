package X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.3Q9, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3Q9 implements C3QA {
    public static final java.util.Set A02 = new HashSet(Arrays.asList("encoded_size", "encoded_width", "encoded_height", "uri_source", "image_format", "bitmap_config", "is_rounded", "non_fatal_decode_error", "original_url", "modified_url", "image_color_space"));
    public Map A00 = new HashMap();
    public C3QB A01;

    public final void A00(String str, Object obj) {
        if (A02.contains(str)) {
            this.A00.put(str, obj);
        }
    }

    @Override // X.C3QC
    public final Map B3v() {
        return this.A00;
    }

    @Override // X.C3QA
    public final C3QB BGj() {
        C3QB c3qb = this.A01;
        if (c3qb == null) {
            C3QR c3qr = new C3QR(BjM(), this.A00, getWidth(), getHeight(), getSizeInBytes());
            this.A01 = c3qr;
            return c3qr;
        }
        return c3qb;
    }

    @Override // X.C3QA, X.C3QB
    public C3QQ BjM() {
        return C3QQ.A03;
    }
}
