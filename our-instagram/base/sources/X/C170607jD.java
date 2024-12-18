package X;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7jD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C170607jD {
    public int A00;
    public final int A01;
    public final SparseArray A02 = new SparseArray();
    public final Map A03 = new HashMap();
    public final boolean A04;

    public C170607jD(int i) {
        this.A04 = i != 0;
        this.A01 = i;
        this.A00 = i + 1;
    }

    public final void A00(InterfaceC170717jO interfaceC170717jO) {
        int i;
        if (interfaceC170717jO.EGz()) {
            boolean z = this.A04;
            if (z && !interfaceC170717jO.CKq()) {
                throw new IllegalStateException("If you enable custom viewTypes, you must provide a customViewType in ViewRenderInfo.");
            }
            if (!z) {
                if (interfaceC170717jO.CKq()) {
                    throw new IllegalStateException("You must enable custom viewTypes to provide customViewType in ViewRenderInfo.");
                }
            } else if (this.A01 == interfaceC170717jO.CFw()) {
                throw new IllegalStateException("CustomViewType cannot be the same as ComponentViewType.");
            }
            C170907jh CFn = interfaceC170717jO.CFn();
            Map map = this.A03;
            if (map.containsKey(CFn)) {
                i = ((Number) map.get(CFn)).intValue();
            } else {
                if (interfaceC170717jO.CKq()) {
                    i = interfaceC170717jO.CFw();
                } else {
                    i = this.A00;
                    this.A00 = i + 1;
                }
                this.A02.put(i, CFn);
                map.put(CFn, Integer.valueOf(i));
            }
            if (!interfaceC170717jO.CKq()) {
                interfaceC170717jO.Eh5(i);
            }
        }
    }
}
