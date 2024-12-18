package X;

import org.json.JSONObject;

/* renamed from: X.QHu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58910QHu extends AbstractC907342m implements XJv {
    @Override // X.XJv
    public final int getInlineStyle() {
        return this.A00.optInt("inline_style");
    }

    @Override // X.XJv
    public final int getLength() {
        return this.A00.optInt("length");
    }

    @Override // X.XJv
    public final int getOffset() {
        return this.A00.optInt("offset");
    }

    @Override // X.XJv
    public final boolean hasInlineStyle() {
        return !this.A00.isNull("inline_style");
    }

    @Override // X.XJv
    public final boolean hasLength() {
        return !this.A00.isNull("length");
    }

    @Override // X.XJv
    public final boolean hasOffset() {
        return !this.A00.isNull("offset");
    }

    public C58910QHu(JSONObject jSONObject) {
        super(jSONObject);
    }
}
