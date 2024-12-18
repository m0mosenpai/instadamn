package X;

import androidx.recyclerview.widget.RecyclerView;

@Deprecated
/* renamed from: X.UJx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66493UJx extends C3FK {
    public final C02V A00;
    public final C02V A01;
    public final RecyclerView A02;

    @Override // X.C3FK
    public final C02V A0a() {
        return this.A01;
    }

    public C66493UJx(RecyclerView recyclerView) {
        super(recyclerView);
        this.A00 = ((C3FK) this).A01;
        this.A01 = new UEP(this, 0);
        this.A02 = recyclerView;
    }
}
