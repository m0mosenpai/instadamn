package X;

/* renamed from: X.T2b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64172T2b implements InterfaceC911544r {
    public Object A00;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C64172T2b)) {
            return false;
        }
        Object obj2 = this.A00;
        Object obj3 = ((C64172T2b) obj).A00;
        if (obj2 != obj3) {
            return obj2 != null && obj2.equals(obj3);
        }
        return true;
    }

    @Override // X.InterfaceC911544r
    public final void EOr(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m) {
        Object obj = this.A00;
        if (obj instanceof InterfaceC911544r) {
            ((InterfaceC911544r) obj).EOr(anonymousClass182, abstractC913345m);
        } else if (obj instanceof AnonymousClass165) {
            anonymousClass182.A0k((AnonymousClass165) obj);
        } else {
            anonymousClass182.A0N(String.valueOf(obj));
        }
    }

    @Override // X.InterfaceC911544r
    public final void EOv(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, AbstractC63023Sar abstractC63023Sar) {
        Object obj = this.A00;
        if (obj instanceof InterfaceC911544r) {
            ((InterfaceC911544r) obj).EOv(anonymousClass182, abstractC913345m, abstractC63023Sar);
        } else {
            if (!(obj instanceof AnonymousClass165)) {
                return;
            }
            EOr(anonymousClass182, abstractC913345m);
        }
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public final String toString() {
        return String.format("[RawValue of type %s]", C914045z.A07(this.A00));
    }
}
