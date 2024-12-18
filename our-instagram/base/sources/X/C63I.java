package X;

import android.content.res.AssetManager;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.63I, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C63I {
    public final C63E A00;
    public final C63K A01;
    public final C63K A02;

    public C63I(final AssetManager assetManager, final C63E c63e, final C63D c63d) {
        C63K c63k = new C63K(c63e, c63d) { // from class: X.63J
            public final C63E A00;
            public final C63D A01;

            {
                this.A00 = c63e;
                this.A01 = c63d;
            }

            @Override // X.C63K
            public final void AV7(EnumC58683Pzw enumC58683Pzw, C58681Pzu c58681Pzu, String str, Map map, Executor executor) {
                boolean isEmpty = map.isEmpty();
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected found non empty params map when attempting to fetch prepackaged cdn payload, ignoring.. [");
                sb.append(map);
                sb.append(']');
                String obj = sb.toString();
                if (!isEmpty) {
                    AbstractC25241Le.A02("BloksPrepackagedBundleFetcher", obj);
                }
                C63F A00 = this.A00.A00(str);
                if (A00 == null) {
                    c58681Pzu.A01(new Q07(), new Exception(AnonymousClass001.A0g("Attempting to fetch a bundle for appId: ", str, " but found no prepackaged config")));
                    return;
                }
                String str2 = A00.A02;
                SFP sfp = new SFP(this, c58681Pzu, A00);
                C14360o3.A0B(str2, 0);
                Q07 q07 = new Q07();
                C26371Ps c26371Ps = new C26371Ps((C1JP) null);
                c26371Ps.A02 = str2;
                c26371Ps.A01(C05F.A0N);
                C1QW A002 = c26371Ps.A00();
                TFF tff = new TFF(sfp, q07, str2, executor);
                C1QX c1qx = new C1QX();
                c1qx.A04 = EnumC23341Bw.API;
                c1qx.A0A = "bloks_prepackaged";
                c1qx.A03 = C1Ef.OnScreen;
                C1C6.A00().A02(tff, A002, c1qx.A00());
            }
        };
        C63K c63k2 = new C63K(assetManager, c63e) { // from class: X.63L
            public final AssetManager A00;
            public final C63E A01;

            @Override // X.C63K
            public final void AV7(EnumC58683Pzw enumC58683Pzw, C58681Pzu c58681Pzu, String str, Map map, Executor executor) {
                C63H c63h = (C63H) this.A01.A00.get(str);
                if (c63h == null) {
                    c58681Pzu.A01(new Q07(), new Exception(AnonymousClass001.A0g("Attempting to fetch a bundle for appId: ", str, " but found no prebundled config")));
                    return;
                }
                try {
                    InputStream open = this.A00.open(c63h.A00);
                    C14360o3.A07(open);
                    executor.execute(new TMy(c58681Pzu, open));
                } catch (FileNotFoundException unused) {
                    c58681Pzu.A01(new Q07(), new Exception(AnonymousClass001.A0R("Could not read prebundled json file associated with appId: ", str)));
                }
            }

            {
                this.A01 = c63e;
                this.A00 = assetManager;
            }
        };
        this.A02 = c63k;
        this.A01 = c63k2;
        this.A00 = c63e;
    }
}
