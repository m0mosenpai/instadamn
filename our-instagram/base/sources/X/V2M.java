package X;

import com.instagram.model.mediasize.ImageInfo;
import java.util.List;

/* loaded from: classes11.dex */
public final class V2M extends AbstractC70665Wel implements XLM, XAG, XAH {
    public final C68729Vb8 A00;
    public final ImageInfo A01;
    public final List A02;
    public final InterfaceC09390do A03;

    @Override // X.XAG
    public final List AYm() {
        return this.A02;
    }

    @Override // X.XAH
    public final C68729Vb8 BOy() {
        return this.A00;
    }

    public V2M(V2L v2l) {
        super(v2l);
        this.A01 = v2l.A01;
        this.A02 = v2l.A02;
        this.A00 = v2l.A00;
        this.A03 = AbstractC09440dt.A01(C65007TbW.A00);
    }
}
