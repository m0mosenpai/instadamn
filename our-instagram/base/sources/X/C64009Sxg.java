package X;

/* renamed from: X.Sxg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64009Sxg implements InterfaceC48192Ji {
    public final /* synthetic */ InterfaceC16660sJ A00;

    public C64009Sxg(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        Object c09540e5;
        C2JS A0k;
        C2JS optionalTreeField;
        if (anonymousClass436 == null || (A0k = AbstractC25225BEi.A0k(anonymousClass436)) == null || (optionalTreeField = A0k.getOptionalTreeField(0, "xfb_social_avatar_stickers_eligibility(user_ids:$user_ids)", QmZ.class, 960305256)) == null || (c09540e5 = AbstractC31174DnI.A0o(optionalTreeField, "is_eligible", 0)) == null) {
            Throwable th = new Throwable();
            C14360o3.A0B(th, 0);
            c09540e5 = new C09540e5(th);
        }
        this.A00.invoke(new C09550e6(c09540e5));
    }
}
