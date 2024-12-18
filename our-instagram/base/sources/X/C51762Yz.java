package X;

/* renamed from: X.2Yz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51762Yz {
    public final int A00;
    public final AbstractC50812Vc A01;
    public final C2VK A02;
    public final Object A03;
    public final String A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C51762Yz)) {
            return false;
        }
        C51762Yz c51762Yz = (C51762Yz) obj;
        return C14360o3.A0K(this.A04, c51762Yz.A04) && this.A00 == c51762Yz.A00 && C14360o3.A0K(this.A03, c51762Yz.A03);
    }

    public final void A00() {
        A01(Boolean.TRUE);
    }

    public final void A01(Object obj) {
        String str;
        C2VK c2vk = this.A02;
        String str2 = this.A04;
        int i = this.A00;
        boolean z = this.A05;
        if (!c2vk.AG3(obj, str2, i, z)) {
            C25413BMe c25413BMe = new C25413BMe(this, obj);
            AbstractC50812Vc abstractC50812Vc = this.A01;
            if (abstractC50812Vc == null || (str = abstractC50812Vc.A0H()) == null) {
                str = "hook";
            }
            c2vk.FBB(c25413BMe, str2, str, z);
        }
    }

    public final void A02(Object obj) {
        String str;
        C2VK c2vk = this.A02;
        String str2 = this.A04;
        int i = this.A00;
        boolean z = this.A05;
        if (!c2vk.AG3(obj, str2, i, z)) {
            C25413BMe c25413BMe = new C25413BMe(this, obj);
            AbstractC50812Vc abstractC50812Vc = this.A01;
            if (abstractC50812Vc == null || (str = abstractC50812Vc.A0H()) == null) {
                str = "hook";
            }
            c2vk.FBC(c25413BMe, str2, str, z);
        }
    }

    public final void A03(InterfaceC16660sJ interfaceC16660sJ) {
        String str;
        C2VK c2vk = this.A02;
        String str2 = this.A04;
        int i = this.A00;
        boolean z = this.A05;
        if (!c2vk.AG4(str2, interfaceC16660sJ, i, z)) {
            C124535kB c124535kB = new C124535kB(this, interfaceC16660sJ);
            AbstractC50812Vc abstractC50812Vc = this.A01;
            if (abstractC50812Vc == null || (str = abstractC50812Vc.A0H()) == null) {
                str = "hook";
            }
            c2vk.FBB(c124535kB, str2, str, z);
        }
    }

    public final int hashCode() {
        int i;
        int hashCode = this.A04.hashCode() * 17;
        Object obj = this.A03;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return hashCode + (i * 11) + this.A00;
    }

    public C51762Yz(AbstractC50812Vc abstractC50812Vc, C2VK c2vk, Object obj, String str, int i, boolean z) {
        this.A02 = c2vk;
        this.A00 = i;
        this.A04 = str;
        this.A05 = z;
        this.A01 = abstractC50812Vc;
        this.A03 = obj;
    }
}
