package X;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* renamed from: X.Cyh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29467Cyh implements InterfaceC30959DjG {
    public final EnumC72438Xdi A00;
    public final EnumC72438Xdi A01;
    public final EnumC27423C8q A02;
    public final EnumC27424C8r A03;
    public final EnumC72394Xcg A04;

    public C29467Cyh(EnumC72438Xdi enumC72438Xdi, EnumC72438Xdi enumC72438Xdi2, EnumC27423C8q enumC27423C8q, EnumC27424C8r enumC27424C8r, EnumC72394Xcg enumC72394Xcg) {
        AbstractC167027dH.A0a(1, enumC72438Xdi, enumC27424C8r, enumC27423C8q, enumC72394Xcg);
        this.A00 = enumC72438Xdi;
        this.A03 = enumC27424C8r;
        this.A02 = enumC27423C8q;
        this.A04 = enumC72394Xcg;
        this.A01 = enumC72438Xdi2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C29467Cyh) {
                C29467Cyh c29467Cyh = (C29467Cyh) obj;
                if (this.A00 != c29467Cyh.A00 || this.A03 != c29467Cyh.A03 || this.A02 != c29467Cyh.A02 || this.A04 != c29467Cyh.A04 || this.A01 != c29467Cyh.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0G(this.A00)))) + AbstractC167017dG.A0M(this.A01);
    }

    @Override // X.InterfaceC30959DjG
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final CVM EKN(Context context, InterfaceC30923Dia interfaceC30923Dia) {
        boolean A1a = AbstractC167017dG.A1a(context, interfaceC30923Dia);
        int A01 = AbstractC28379Cfi.A01(this.A04, interfaceC30923Dia);
        boolean z = true;
        if (context.getResources().getConfiguration().getLayoutDirection() != A1a) {
            z = false;
        }
        EnumC72438Xdi enumC72438Xdi = this.A01;
        if (enumC72438Xdi == null || !z) {
            enumC72438Xdi = this.A00;
        }
        C14360o3.A0C(enumC72438Xdi, "null cannot be cast to non-null type com.facebook.fbui.fbicon.model.IconSet.Name<com.facebook.fbui.fbicon.model.IconSet.Type>");
        EnumC27424C8r enumC27424C8r = this.A03;
        C14360o3.A0C(enumC27424C8r, "null cannot be cast to non-null type com.facebook.fbui.fbicon.model.IconSet.Variant<com.facebook.fbui.fbicon.model.IconSet.Type>");
        EnumC27423C8q enumC27423C8q = this.A02;
        C14360o3.A0C(enumC27423C8q, "null cannot be cast to non-null type com.facebook.fbui.fbicon.model.IconSet.Size<com.facebook.fbui.fbicon.model.IconSet.Type>");
        Drawable A00 = AbstractC65877Tvg.A00(context, enumC72438Xdi, enumC27423C8q, enumC27424C8r);
        C14360o3.A07(A00);
        Drawable mutate = A00.mutate();
        AbstractC166997dE.A1F(mutate, A01);
        return new CVM(mutate, enumC27423C8q.A00);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("CdsIconVariant(iconName=");
        A1C.append(this.A00);
        A1C.append(AbstractC111324zv.A00(1421));
        A1C.append(this.A03);
        A1C.append(AbstractC111324zv.A00(1420));
        A1C.append(this.A02);
        A1C.append(", iconColor=");
        A1C.append(this.A04);
        A1C.append(", rtlIconName=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
