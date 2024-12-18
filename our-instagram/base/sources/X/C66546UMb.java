package X;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.UMb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66546UMb extends AbstractC53638Nnj {
    public final AtomicReference A00;
    public final C54993OUc A01;

    @Override // X.AbstractC53638Nnj
    public final void A01(Exception exc, Map map, int i, boolean z) {
        AbstractC167007dF.A1E(exc, 0, map);
        AtomicReference atomicReference = this.A00;
        WG6 wg6 = (WG6) atomicReference.get();
        if (wg6 != null) {
            this.A01.A05.A00(exc);
            WG6.A03(wg6, exc, C05F.A00, "Failed GET request for fetching offset", map, i, WG6.A00(exc), z);
        }
        atomicReference.set(null);
    }

    @Override // X.AbstractC53638Nnj
    public final void A02(String str, int i, Map map) {
        AbstractC167017dG.A1O(str, map);
        AtomicReference atomicReference = this.A00;
        WG6 wg6 = (WG6) atomicReference.get();
        if (wg6 != null) {
            try {
                wg6.A02.DHA(str, map);
                try {
                    Ve0 parseFromJson = VMJ.parseFromJson(C16V.A00(str));
                    if (parseFromJson != null) {
                        long j = parseFromJson.A00;
                        if (j >= 0) {
                            boolean z = parseFromJson.A01;
                            if (z) {
                                j = wg6.A05.A00;
                                parseFromJson.A00 = j;
                            }
                            WG6.A02(wg6, j, z);
                        }
                    }
                    throw new Exception(str);
                } catch (IOException unused) {
                    throw new Exception(str);
                }
            } catch (VI4 e) {
                WG6.A03(wg6, e, C05F.A00, AnonymousClass001.A0R("Failed to parse offset from GET response:", str), map, 0, -1L, true);
            }
        }
        atomicReference.set(null);
    }

    public C66546UMb(C54993OUc c54993OUc, WG6 wg6) {
        this.A01 = c54993OUc;
        this.A00 = new AtomicReference(wg6);
    }
}
