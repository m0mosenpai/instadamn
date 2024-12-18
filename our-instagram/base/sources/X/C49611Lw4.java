package X;

import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* renamed from: X.Lw4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49611Lw4 implements InterfaceC150976qx {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ IgdsInlineSearchBox A02;

    public C49611Lw4(IgdsInlineSearchBox igdsInlineSearchBox, int i, int i2) {
        this.A02 = igdsInlineSearchBox;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // X.InterfaceC150976qx
    public final void Dbl(AbstractC125325le abstractC125325le, float f) {
        this.A02.setSearchRowHeight(this.A01 + ((int) ((1.0f - f) * this.A00)));
    }
}
