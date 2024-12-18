package X;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: X.Pva, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58452Pva implements InterfaceC30997Djw {
    public boolean A00;
    public final C58453Pvb A01;
    public final HashSet A02;

    @Override // X.InterfaceC30997Djw
    public final synchronized boolean A8k(String str) {
        if (!this.A00) {
            this.A02.addAll(this.A01.A02());
            this.A00 = true;
        }
        return this.A02.add(str);
    }

    @Override // X.InterfaceC30997Djw
    public final synchronized boolean A8l(String str) {
        boolean add;
        if (!this.A00) {
            this.A02.addAll(this.A01.A02());
            this.A00 = true;
        }
        HashSet hashSet = this.A02;
        add = hashSet.add(str);
        ArrayList A01 = this.A01.A01(str);
        if (!A01.isEmpty()) {
            hashSet.removeAll(A01);
        }
        return add;
    }

    public C58452Pva(Context context) {
        File A0w = MSW.A0w(context.getCacheDir(), "duplicate_notif_id.cache");
        this.A02 = AbstractC166987dD.A1H();
        this.A01 = new C58453Pvb(A0w, 4096);
    }
}
