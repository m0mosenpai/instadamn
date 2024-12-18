package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5Qk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C116815Qk implements InterfaceC116825Ql {
    public static volatile C116815Qk A06;
    public final C0Gd A00;
    public final C0JO A01;
    public final ArrayList A03 = new ArrayList();
    public final ArrayList A04 = new ArrayList();
    public final ArrayList A05 = new ArrayList();
    public final C116835Qm A02 = new C116835Qm();

    public static final void A00(C116815Qk c116815Qk, String str, String str2) {
        ArrayList arrayList = c116815Qk.A05;
        C27954CTs c27954CTs = new C27954CTs(str, str2, c116815Qk.A01.now());
        synchronized (arrayList) {
            if (arrayList.size() >= 50) {
                arrayList.remove(0);
            }
            arrayList.add(c27954CTs);
        }
    }

    @Override // X.InterfaceC116825Ql
    public final long Auz() {
        return this.A01.now();
    }

    @Override // X.InterfaceC116825Ql
    public final List Bdv() {
        return AbstractC001800i.A0a(this.A03);
    }

    @Override // X.InterfaceC116825Ql
    public final List Bdz() {
        return AbstractC001800i.A0a(this.A04);
    }

    @Override // X.InterfaceC116825Ql
    public final List ByX() {
        return AbstractC001800i.A0a(this.A05);
    }

    @Override // X.InterfaceC116825Ql
    public final boolean CL6() {
        if ((!this.A03.isEmpty()) || (!this.A04.isEmpty()) || (!this.A05.isEmpty())) {
            return true;
        }
        return false;
    }

    public C116815Qk(C0Gd c0Gd, C0JO c0jo) {
        this.A00 = c0Gd;
        this.A01 = c0jo;
    }
}
