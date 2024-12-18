package X;

import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.UsG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67597UsG extends C2JS implements XKY {
    @Override // X.XKY
    public final String ArG() {
        return getOptionalStringField(6, "context");
    }

    @Override // X.XKY
    public final EnumC46232Kd8 AfR() {
        return (EnumC46232Kd8) getOptionalEnumField(11, "banner_position", EnumC46232Kd8.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    @Override // X.XKY
    public final EnumC223139ss Aj4() {
        return (EnumC223139ss) getOptionalEnumField(7, "button_layout", EnumC223139ss.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    @Override // X.XKY
    public final XHi B3j() {
        return (XHi) getOptionalTreeField(13, "extra_data", C67586Us4.class, -1573519689);
    }

    @Override // X.XKY
    public final EnumC72386XcM B78() {
        return (EnumC72386XcM) getOptionalEnumField(10, "flow_type", EnumC72386XcM.A02);
    }

    @Override // X.XKY
    public final XHj BgG() {
        return (XHj) getOptionalTreeField(3, "primary_button_accessibility_label", C67587Us5.class, -1659308017);
    }

    @Override // X.XKY
    public final XHk BgH() {
        return (XHk) A04(C67588Us6.class, "primary_button_label", 1396320741);
    }

    @Override // X.XKY
    public final VFK BgI() {
        return (VFK) getOptionalEnumField(8, "primary_button_style", VFK.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    @Override // X.XKY
    public final XHo Bq1() {
        return (XHo) getOptionalTreeField(12, "safety_interventions", C67593UsB.class, -1476159338);
    }

    @Override // X.XKY
    public final XHp BrO() {
        return (XHp) getOptionalTreeField(5, "secondary_button_accessibility_label", UsC.class, -1952628883);
    }

    @Override // X.XKY
    public final XHq BrP() {
        return (XHq) getOptionalTreeField(4, "secondary_button_label", C67594UsD.class, -1937609848);
    }

    @Override // X.XKY
    public final VFK BrQ() {
        return (VFK) getOptionalEnumField(9, "secondary_button_style", VFK.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    @Override // X.XKY
    public final XHr C3c() {
        return (XHr) A02(C67595UsE.class, "subtitle", 1485231419);
    }

    @Override // X.XKY
    public final XHs C8r() {
        return (XHs) A03(C67596UsF.class, DialogModule.KEY_TITLE, -580016703);
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C4OK c4ok = new C4OK(C67596UsF.class, DialogModule.KEY_TITLE, -580016703);
        C4OK c4ok2 = new C4OK(C67595UsE.class, "subtitle", 1485231419);
        C4OK c4ok3 = new C4OK(C67588Us6.class, "primary_button_label", 1396320741);
        C4OK c4ok4 = new C4OK(C67587Us5.class, "primary_button_accessibility_label", -1659308017);
        C4OK c4ok5 = new C4OK(C67594UsD.class, "secondary_button_label", -1937609848);
        C4OK c4ok6 = new C4OK(UsC.class, "secondary_button_accessibility_label", -1952628883);
        C94754Oe c94754Oe = C94754Oe.A00;
        return new C4OU(new C4OM[]{c4ok, c4ok2, c4ok3, c4ok4, c4ok5, c4ok6, new C4OW(c94754Oe, "context"), new C4OW(c94754Oe, "button_layout"), new C4OW(c94754Oe, "primary_button_style"), new C4OW(c94754Oe, "secondary_button_style"), new C4OW(c94754Oe, "flow_type"), new C4OW(c94754Oe, "banner_position"), new C4OK(C67593UsB.class, "safety_interventions", -1476159338), new C126895oT(new C4OK(C67586Us4.class, "extra_data", -1573519689), AbstractC43591JPw.A00(468))});
    }

    public C67597UsG(int i) {
        super(i);
    }

    public C67597UsG() {
        super(1852921967);
    }
}
