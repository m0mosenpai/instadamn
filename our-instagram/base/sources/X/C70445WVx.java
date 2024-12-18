package X;

/* renamed from: X.WVx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70445WVx implements InterfaceC48192Ji {
    public final /* synthetic */ InterfaceC16660sJ A00;

    public C70445WVx(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        C2JS c2js;
        C2JS optionalTreeField;
        boolean z;
        boolean z2;
        if (anonymousClass436 != null && (c2js = (C2JS) anonymousClass436.Bos()) != null && (optionalTreeField = c2js.getOptionalTreeField(0, AbstractC111324zv.A00(3322), C67050Ufb.class, -1511216845)) != null) {
            boolean coercedBooleanField = optionalTreeField.getCoercedBooleanField(1, "has_seen_disclaimer");
            C2JS optionalTreeField2 = optionalTreeField.getOptionalTreeField(0, "should_show_disclaimer", C67049Ufa.class, -226152414);
            boolean z3 = false;
            if (optionalTreeField2 != null) {
                z = optionalTreeField2.getCoercedBooleanField(2, "on_tray_open");
            } else {
                z = false;
            }
            C2JS optionalTreeField3 = optionalTreeField.getOptionalTreeField(0, "should_show_disclaimer", C67049Ufa.class, -226152414);
            if (optionalTreeField3 != null) {
                z2 = optionalTreeField3.getCoercedBooleanField(0, "on_sticker_receive");
            } else {
                z2 = false;
            }
            C2JS optionalTreeField4 = optionalTreeField.getOptionalTreeField(0, "should_show_disclaimer", C67049Ufa.class, -226152414);
            if (optionalTreeField4 != null) {
                z3 = optionalTreeField4.getCoercedBooleanField(1, "on_sticker_send");
            }
            this.A00.invoke(new C9BD(coercedBooleanField, 0, z, z3, z2));
        }
    }
}
