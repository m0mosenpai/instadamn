package X;

/* renamed from: X.Sxm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64015Sxm implements InterfaceC48192Ji {
    public final /* synthetic */ InterfaceC16660sJ A00;

    public C64015Sxm(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        Boolean bool;
        C2JS A0k;
        C2JS optionalTreeField;
        InterfaceC16660sJ interfaceC16660sJ = this.A00;
        if (anonymousClass436 != null && (A0k = AbstractC25225BEi.A0k(anonymousClass436)) != null && (optionalTreeField = A0k.getOptionalTreeField(0, "fetch__IGUser(igid:$igid)", C60282Qwu.class, 150158218)) != null) {
            bool = AbstractC31174DnI.A0o(optionalTreeField, "is_xposting_destination_fb_page_eligible_for_branded_content", 0);
        } else {
            bool = null;
        }
        interfaceC16660sJ.invoke(bool);
    }
}
