package X;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.7wK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178467wK implements InterfaceC178477wL {
    public int A00;
    public int A01;
    public List A05 = new LinkedList();
    public List A08 = new LinkedList();
    public List A06 = new LinkedList();
    public List A07 = new LinkedList();
    public String A02 = null;
    public String A03 = null;
    public Map A09 = new HashMap();
    public String A04 = null;

    @Override // X.InterfaceC178477wL
    public final List Abh(List list, List list2, List list3) {
        if (list != null) {
            this.A06 = list2;
            this.A07 = list3;
            List list4 = this.A05;
            this.A05 = list;
            return list4;
        }
        throw new NullPointerException("enabledEffectIds cannot be null");
    }

    @Override // X.InterfaceC178477wL
    public final List Abi(List list) {
        List list2 = this.A08;
        this.A08 = list;
        return list2;
    }

    @Override // X.InterfaceC178477wL
    public final List B1n() {
        return this.A07;
    }

    public C178467wK() {
        this.A00 = -1;
        this.A01 = -1;
        this.A00 = -1;
        this.A01 = -1;
    }

    @Override // X.InterfaceC178477wL
    public final void EQq(int i) {
        this.A00 = i;
    }

    @Override // X.InterfaceC178477wL
    public final void ESc(String str) {
        this.A02 = str;
    }

    @Override // X.InterfaceC178477wL
    public final void ESd(String str) {
        this.A03 = str;
    }

    @Override // X.InterfaceC178477wL
    public final void ESf(Map map) {
        this.A09 = map;
    }

    @Override // X.InterfaceC178477wL
    public final void Ea9(int i) {
        this.A01 = i;
    }

    @Override // X.InterfaceC178477wL
    public final void Egz(String str) {
        this.A04 = str;
    }
}
