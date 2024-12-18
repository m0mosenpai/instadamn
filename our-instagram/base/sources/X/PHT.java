package X;

/* loaded from: classes9.dex */
public final class PHT implements C51D {
    public boolean A00;
    public final InterfaceC16820sZ A01;
    public final InterfaceC16820sZ A02;
    public final InterfaceC16620sF A03;
    public final /* synthetic */ OJ2 A04;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public PHT(OJ2 oj2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16620sF interfaceC16620sF) {
        this.A04 = oj2;
        this.A02 = interfaceC16820sZ;
        this.A03 = interfaceC16620sF;
        this.A01 = interfaceC16820sZ2;
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        return AbstractC25231BEo.A1b(this.A02);
    }

    @Override // X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
        int i3;
        boolean z;
        C3DO c3do = C3DN.A00;
        OJ2 oj2 = this.A04;
        C3DN A00 = c3do.A00(oj2.A00);
        if (A00 != null) {
            i3 = A00.A08();
        } else {
            i3 = 0;
        }
        int abs = Math.abs(i3 - i);
        C55177Odh c55177Odh = oj2.A01;
        c55177Odh.A05(new PDD(MSZ.A08(this.A01) + abs));
        float f = abs / i3;
        if (f >= 0.25f && !this.A00) {
            z = true;
        } else {
            if (f < 0.25f && this.A00) {
                z = false;
            }
            this.A03.invoke(Integer.valueOf(i), Integer.valueOf(i2));
        }
        c55177Odh.A05(new PD4(z));
        this.A00 = z;
        this.A03.invoke(Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }
}
