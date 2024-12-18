package X;

import android.content.res.Resources;

/* renamed from: X.St0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63746St0 implements InterfaceC65470Tkn {
    public final Resources A00;
    public final InterfaceC65470Tkn A01;

    @Override // X.InterfaceC65470Tkn
    public final InterfaceC65558Tme ANo(C63729Ssj c63729Ssj, Object obj, int i, int i2) {
        InterfaceC65558Tme ANo = this.A01.ANo(c63729Ssj, obj, i, i2);
        Resources resources = this.A00;
        if (ANo == null) {
            return null;
        }
        return new C63792Stm(resources, ANo);
    }

    @Override // X.InterfaceC65470Tkn
    public final boolean CKc(C63729Ssj c63729Ssj, Object obj) {
        return this.A01.CKc(c63729Ssj, obj);
    }

    public C63746St0(Resources resources, InterfaceC65470Tkn interfaceC65470Tkn) {
        this.A00 = resources;
        this.A01 = interfaceC65470Tkn;
    }
}
