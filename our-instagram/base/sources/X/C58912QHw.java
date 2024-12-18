package X;

import com.google.common.collect.ImmutableList;
import org.json.JSONObject;

/* renamed from: X.QHw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58912QHw extends AbstractC907342m implements InterfaceC37288Gbp {
    @Override // X.InterfaceC37288Gbp
    public final ImmutableList Bk4() {
        return A02("ranges", C58911QHv.class);
    }

    @Override // X.InterfaceC37288Gbp
    public final ImmutableList getInlineStyleRanges() {
        return A02("inline_style_ranges", C58910QHu.class);
    }

    public C58912QHw(JSONObject jSONObject) {
        super(jSONObject);
    }

    @Override // X.InterfaceC37288Gbp
    public final String getText() {
        return A05("text");
    }
}
