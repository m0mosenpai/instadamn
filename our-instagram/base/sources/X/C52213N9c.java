package X;

/* renamed from: X.N9c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52213N9c extends C1P1 {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public C52213N9c(C55519OlD c55519OlD, int i, boolean z) {
        this.A00 = i;
        this.A01 = c55519OlD;
        this.A02 = z;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        if (this.A00 != 0) {
            A03 = C0f9.A03(-306357919);
            C56255Oy2 c56255Oy2 = (C56255Oy2) ((C55519OlD) this.A01).A01;
            AbstractC23021Ah.A00(c56255Oy2.A0C).A1F(this.A02);
            C9GR.A0A(c56255Oy2.A09, "setAutoSaveReelMediaToGallery_error");
            C56255Oy2.A04(c56255Oy2);
            i = 683324168;
        } else {
            A03 = C0f9.A03(269508984);
            C56255Oy2 c56255Oy22 = (C56255Oy2) ((C55519OlD) this.A01).A01;
            AbstractC23021Ah.A00(c56255Oy22.A0C).A1D(!this.A02);
            C9GR.A0A(c56255Oy22.A09, "setAllowStoryReshare_error");
            C56255Oy2.A04(c56255Oy22);
            i = -1218347777;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        if (this.A00 != 0) {
            A03 = C0f9.A03(791043134);
            int A032 = C0f9.A03(-44581615);
            super.onSuccess(obj);
            C0f9.A0A(1976380611, A032);
            i = -440716520;
        } else {
            A03 = C0f9.A03(2066966949);
            int A033 = C0f9.A03(-196267130);
            super.onSuccess(obj);
            C0f9.A0A(-541541299, A033);
            i = 1805041394;
        }
        C0f9.A0A(i, A03);
    }
}
