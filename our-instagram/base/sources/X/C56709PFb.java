package X;

import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* renamed from: X.PFb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56709PFb implements XB8 {
    public final int A00;
    public final Object A01;

    public C56709PFb(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.XB8
    public final String E6U() {
        IgdsInlineSearchBox igdsInlineSearchBox;
        switch (this.A00) {
            case 0:
                igdsInlineSearchBox = ((AbstractC52114N4m) this.A01).A02;
                break;
            case 1:
                igdsInlineSearchBox = ((C52147N5w) this.A01).A01;
                break;
            default:
                return ((OL1) this.A01).A00;
        }
        if (igdsInlineSearchBox != null) {
            return igdsInlineSearchBox.getSearchString();
        }
        return "";
    }
}
