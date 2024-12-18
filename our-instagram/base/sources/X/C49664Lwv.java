package X;

/* renamed from: X.Lwv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49664Lwv implements GYU {
    public final int A00;
    public final Object A01;

    public C49664Lwv(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.GYU
    public final void onSearchCleared(String str) {
        switch (this.A00) {
            case 0:
                AbstractC31171DnF.A14(((ViewOnFocusChangeListenerC44078Je3) this.A01).A04);
                return;
            case 1:
                ((C45998KXm) ((C45488KCd) this.A01).A07.getValue()).A0P("");
                return;
            default:
                C14360o3.A0B(str, 0);
                AbstractC65919TwQ abstractC65919TwQ = (AbstractC65919TwQ) this.A01;
                abstractC65919TwQ.A0F().Cin(abstractC65919TwQ.A0i.E6d(), str);
                return;
        }
    }
}
