package X;

import java.io.IOException;

/* renamed from: X.Wgo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70775Wgo implements C1EH {
    public static final C70775Wgo A00 = new C70775Wgo();

    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        C66248U5s c66248U5s = new C66248U5s();
        if (c16l.A11() != C16R.A0D) {
            throw new IOException("JSON string for TextShadowLayer should start with a left brace");
        }
        while (c16l.A1J() != C16R.A09) {
            String A0s = AbstractC166997dE.A0s(c16l);
            if (A0s != null) {
                switch (A0s.hashCode()) {
                    case -1374360577:
                        if (A0s.equals("shadow_layer_radius")) {
                            c66248U5s.A02 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case -196309418:
                        if (A0s.equals("shadow_layer_color")) {
                            c66248U5s.A03 = c16l.A1D();
                            break;
                        }
                        break;
                    case 1440828033:
                        if (A0s.equals("shadow_layer_dx")) {
                            c66248U5s.A00 = (float) c16l.A0U();
                            break;
                        }
                        break;
                    case 1440828034:
                        if (A0s.equals("shadow_layer_dy")) {
                            c66248U5s.A01 = (float) c16l.A0U();
                            break;
                        }
                        break;
                }
                C0K8.A0C("TextShadowLayerJsonHelper", AnonymousClass001.A0R("Unexpected key found: ", A0s));
                c16l.A0z();
            } else {
                throw new IOException("Field name should not be null");
            }
        }
        return c66248U5s;
    }
}
