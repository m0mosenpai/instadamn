package X;

/* renamed from: X.R1s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60511R1s extends C2JS implements XJv {
    @Override // X.XJv
    public final int getInlineStyle() {
        return getCoercedIntField(0, "inline_style");
    }

    @Override // X.XJv
    public final int getLength() {
        return getCoercedIntField(1, "length");
    }

    @Override // X.XJv
    public final int getOffset() {
        return A00("offset");
    }

    @Override // X.XJv
    public final boolean hasInlineStyle() {
        return hasFieldValue("inline_style");
    }

    @Override // X.XJv
    public final boolean hasLength() {
        return hasFieldValue("length");
    }

    @Override // X.XJv
    public final boolean hasOffset() {
        return hasFieldValue("offset");
    }

    public C60511R1s(int i) {
        super(i);
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return AbstractC58323PtF.A0U();
    }

    public C60511R1s() {
        super(2002465108);
    }
}
