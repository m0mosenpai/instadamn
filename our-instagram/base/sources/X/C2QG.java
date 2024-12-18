package X;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.2QG, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2QG implements C2QE {
    public final InterfaceC46402Bc A00;
    public final List A02;
    public volatile long A05 = 0;
    public final AbstractMap A01 = new HashMap();
    public final java.util.Set A04 = new HashSet();
    public final Map A03 = new HashMap();

    public abstract long A06(String str);

    public abstract String A07();

    public abstract void A08();

    public abstract void A09(InterfaceC46402Bc interfaceC46402Bc);

    public abstract void A0A(C49802Qq c49802Qq);

    public abstract void A0B(String str, long j);

    public abstract boolean A0C();

    public C2QG(InterfaceC46402Bc interfaceC46402Bc, ArrayList arrayList) {
        this.A00 = interfaceC46402Bc;
        this.A02 = arrayList;
    }
}
