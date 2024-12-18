package X;

import com.facebook.react.modules.dialog.DialogModule;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class UOI extends AbstractC907342m implements XKY {
    @Override // X.XKY
    public final EnumC46232Kd8 AfR() {
        return (EnumC46232Kd8) A04("banner_position", EnumC46232Kd8.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    @Override // X.XKY
    public final EnumC223139ss Aj4() {
        return (EnumC223139ss) A04("button_layout", EnumC223139ss.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    @Override // X.XKY
    public final String ArG() {
        return A05("context");
    }

    @Override // X.XKY
    public final XHi B3j() {
        return (XHi) A00(UO6.class, "extra_data");
    }

    @Override // X.XKY
    public final EnumC72386XcM B78() {
        return (EnumC72386XcM) A04("flow_type", EnumC72386XcM.A02);
    }

    @Override // X.XKY
    public final XHj BgG() {
        return (XHj) A00(UO7.class, "primary_button_accessibility_label");
    }

    @Override // X.XKY
    public final XHk BgH() {
        return (XHk) A00(UO8.class, "primary_button_label");
    }

    @Override // X.XKY
    public final VFK BgI() {
        return (VFK) A04("primary_button_style", VFK.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    @Override // X.XKY
    public final XHo Bq1() {
        return (XHo) A00(UOD.class, "safety_interventions");
    }

    @Override // X.XKY
    public final XHp BrO() {
        return (XHp) A00(UOE.class, "secondary_button_accessibility_label");
    }

    @Override // X.XKY
    public final XHq BrP() {
        return (XHq) A00(UOF.class, "secondary_button_label");
    }

    @Override // X.XKY
    public final VFK BrQ() {
        return (VFK) A04("secondary_button_style", VFK.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    @Override // X.XKY
    public final XHr C3c() {
        return (XHr) A00(UOG.class, "subtitle");
    }

    @Override // X.XKY
    public final XHs C8r() {
        return (XHs) A00(UOH.class, DialogModule.KEY_TITLE);
    }

    public UOI(JSONObject jSONObject) {
        super(jSONObject);
    }
}
