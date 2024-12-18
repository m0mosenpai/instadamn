package X;

import com.instagram.user.model.Product;
import java.util.List;

/* loaded from: classes11.dex */
public final class V2N extends AbstractC70665Wel implements XLM, XAG, XAH {
    public final C68962Vf0 A00;
    public final Product A01;
    public final List A02;
    public final C68729Vb8 A03;

    @Override // X.XAG
    public final List AYm() {
        return this.A02;
    }

    @Override // X.XAH
    public final C68729Vb8 BOy() {
        return this.A03;
    }

    public V2N(V2H v2h) {
        super(v2h);
        this.A03 = v2h.A00;
        this.A00 = v2h.A03;
        this.A02 = v2h.A02;
        this.A01 = v2h.A01;
    }
}
