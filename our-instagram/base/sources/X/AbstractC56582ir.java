package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2ir, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC56582ir {
    public int A00;
    public C141566aZ A01;
    public Map A02;
    public byte[] A03;
    public AbstractC56652iy[] A04;
    public WWR[] A05;

    public final void A00() {
        this.A02 = new HashMap();
        for (AbstractC56652iy abstractC56652iy : this.A04) {
            abstractC56652iy.A02.A00(this.A02, this.A05);
        }
    }
}
