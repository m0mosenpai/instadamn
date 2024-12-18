package X;

import com.instagram.common.api.base.CacheBehaviorLogger;
import java.util.HashMap;
import kotlin.Deprecated;

/* renamed from: X.3b5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76003b5 extends AbstractC76013b6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final AbstractC50812Vc A04;
    public final C2XE A05;
    public final C2W1 A06;
    public final C75803al A07;
    public final String A08;
    public final boolean A09;
    public final int A0A;

    @Override // X.AbstractC76013b6
    public final String A04() {
        return "resolve";
    }

    public static final HashMap A00(C76003b5 c76003b5) {
        HashMap hashMap = new HashMap();
        hashMap.put("root", c76003b5.A04.A0H());
        hashMap.put("version", Integer.valueOf(c76003b5.A01));
        hashMap.put(CacheBehaviorLogger.SOURCE, AbstractC225109wZ.A00(c76003b5.A0A));
        hashMap.put("attribution", c76003b5.A08);
        return hashMap;
    }

    @Override // X.AbstractC76013b6
    public final /* bridge */ /* synthetic */ InterfaceC50892Vl A03() {
        Integer A01 = AbstractC50692Uq.A01("Litho.ComponentTree.Resolve");
        if (A01 != null) {
            AbstractC50692Uq.A05("Litho.ComponentTree.Resolve", String.valueOf(this.A00), A00(this), A01.intValue());
        }
        try {
            C2XE c2xe = this.A05;
            return AbstractC76093bE.A00(this.A04, c2xe, this.A06, this, this.A07, this.A08, this.A01, this.A00);
        } finally {
            if (A01 != null) {
                AbstractC50692Uq.A03(A01.intValue(), AbstractC06930Yk.A0E());
            }
        }
    }

    @Deprecated(message = "Refactor sync render logic to remove sizes from resolved tree future")
    public C76003b5(AbstractC50812Vc abstractC50812Vc, C2XE c2xe, C2W1 c2w1, C75803al c75803al, String str, int i, int i2, int i3, int i4, int i5, boolean z) {
        super(i4, z);
        this.A05 = c2xe;
        this.A04 = abstractC50812Vc;
        this.A07 = c75803al;
        this.A06 = c2w1;
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
        this.A08 = str;
        this.A0A = i5;
        this.A09 = c2xe.A02.A01.A0I;
    }
}
