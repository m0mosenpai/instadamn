package X;

import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.Mla, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51313Mla extends C3OO {
    public final long A00;
    public final C52363NFb A01;
    public final InterfaceC09390do A02;
    public final boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C51313Mla(C52363NFb c52363NFb, boolean z) {
        super(c52363NFb);
        long integer = AbstractC25228BEl.A0M(c52363NFb).getInteger(R.integer.music_tray_placeholder_shimmer_item_delay_ms);
        this.A01 = c52363NFb;
        this.A00 = integer;
        this.A03 = z;
        C17050sx A01 = AbstractC09440dt.A01(new C57242PbQ(this, 30));
        this.A02 = A01;
        c52363NFb.A00((Drawable) A01.getValue(), false);
    }
}
