package X;

import android.view.View;

/* renamed from: X.3Ms, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72453Ms extends C0T6 implements InterfaceC41141vN {
    public final int A00;
    public final View A01;
    public final C38321qM A02;
    public final C75113Zb A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C72453Ms) {
                C72453Ms c72453Ms = (C72453Ms) obj;
                if (!C14360o3.A0K(this.A02, c72453Ms.A02) || !C14360o3.A0K(this.A03, c72453Ms.A03) || !C14360o3.A0K(this.A01, c72453Ms.A01) || this.A00 != c72453Ms.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A02.hashCode() * 31) + this.A03.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A00;
    }

    public C72453Ms(View view, C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        this.A02 = c38321qM;
        this.A03 = c75113Zb;
        this.A01 = view;
        this.A00 = i;
    }
}
