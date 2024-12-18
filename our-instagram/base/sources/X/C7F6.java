package X;

/* renamed from: X.7F6, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7F6 {
    public String A00;
    public String A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final C006802i A06 = C006802i.A0p;

    public final void A09(String str) {
        this.A06.markerPoint(673059101, str);
        if (str.equals("ai_preparation_screen_back_button_clicked")) {
            this.A03 = true;
        } else {
            if (!str.equals("complete_ai_create_graphql_mutation_success") || !this.A03) {
                return;
            }
            A04(C05F.A00);
            this.A03 = false;
        }
    }

    public static final int A00(C7F6 c7f6) {
        if (!c7f6.A05) {
            return 895690478;
        }
        return 895691428;
    }

    public final void A08(Integer num, String str) {
        if (C14360o3.A0K(str, this.A00)) {
            this.A06.markerEnd(895694965, AbstractC25594BTh.A00(num));
        }
    }

    public final void A01(int i, Integer num) {
        String valueOf = String.valueOf(i);
        C006802i c006802i = this.A06;
        c006802i.markerAnnotate(398470550, "num_of_banner", valueOf);
        c006802i.markerEnd(398470550, AbstractC25594BTh.A00(num));
    }

    public final void A02(Integer num) {
        this.A06.markerEnd(895683758, AbstractC25594BTh.A00(num));
    }

    public final void A03(Integer num) {
        this.A06.markerEnd(673058094, AbstractC25594BTh.A00(num));
    }

    public final void A04(Integer num) {
        this.A06.markerEnd(673059101, AbstractC25594BTh.A00(num));
    }

    public final void A05(Integer num) {
        this.A06.markerEnd(A00(this), AbstractC25594BTh.A00(num));
        this.A02 = null;
        this.A01 = null;
    }

    public final void A06(Integer num) {
        this.A06.markerEnd(673065652, AbstractC25594BTh.A00(num));
    }

    public final void A07(Integer num) {
        this.A06.markerEnd(673067423, AbstractC25594BTh.A00(num));
    }

    public final void A0A(String str) {
        this.A06.markerPoint(673067423, str);
    }

    public final void A0B(String str) {
        this.A06.markerPoint(673065299, str);
    }
}
