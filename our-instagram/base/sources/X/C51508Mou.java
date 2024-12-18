package X;

import android.content.Context;

/* renamed from: X.Mou, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51508Mou extends C6VG {
    public Context A00;
    public C3LX A01;
    public C6VK A02;
    public final InterfaceC58742mX A03;
    public final C6VO A04;
    public final String A05;

    @Override // X.C6VG
    public final C3LV A01() {
        return ((C3LW) this.A01).A00;
    }

    @Override // X.C6VG
    public final InterfaceC58742mX A02() {
        return this.A03;
    }

    @Override // X.C6VG
    public final C6VO A03() {
        return this.A04;
    }

    @Override // X.C6VG
    public final C6VK A04() {
        C6VK c6vk = this.A02;
        if (c6vk == null) {
            C6VK c6vk2 = new C6VK(this.A00, A05());
            this.A02 = c6vk2;
            return c6vk2;
        }
        return c6vk;
    }

    @Override // X.C6VG
    public final String A05() {
        String str = this.A05;
        if (str == null) {
            return ((C3LW) this.A01).A01;
        }
        return str;
    }

    public C51508Mou(Context context, C3LX c3lx, InterfaceC58742mX interfaceC58742mX, C6VO c6vo, String str) {
        this.A00 = context;
        this.A04 = c6vo;
        this.A01 = c3lx;
        this.A03 = interfaceC58742mX;
        this.A05 = str;
    }
}
