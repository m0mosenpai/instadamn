package X;

import com.instagram.igds.components.textcell.IgdsListCell;

/* loaded from: classes9.dex */
public final class PHV implements C51D, C51E {
    public final int A00;
    public final Object A01;

    public PHV(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
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

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0014 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // X.C51D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isScrolledToTop() {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L16;
                case 1: goto L22;
                case 2: goto L5;
                case 3: goto L29;
                case 4: goto L5;
                case 5: goto L29;
                case 6: goto L5;
                case 7: goto L14;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.A01
            X.N42 r0 = (X.N42) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.A00
        Lb:
            r2 = 0
            if (r0 == 0) goto L15
            boolean r0 = X.AbstractC43592JPx.A1X(r0)
            if (r0 != 0) goto L15
        L14:
            r2 = 1
        L15:
            return r2
        L16:
            java.lang.Object r0 = r3.A01
            X.N4t r0 = (X.C52120N4t) r0
            com.instagram.common.ui.base.IgTextView r1 = r0.A00
            r2 = 1
            if (r1 == 0) goto L15
            android.graphics.Rect r0 = r0.A01
            goto L34
        L22:
            java.lang.Object r0 = r3.A01
            X.N4g r0 = (X.C52108N4g) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.A04
            goto Lb
        L29:
            java.lang.Object r0 = r3.A01
            X.N4j r0 = (X.C52111N4j) r0
            android.view.View r1 = r0.A00
            r2 = 1
            if (r1 == 0) goto L15
            android.graphics.Rect r0 = r0.A04
        L34:
            r1.getLocalVisibleRect(r0)
            int r0 = r0.top
            if (r0 == 0) goto L15
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PHV.isScrolledToTop():boolean");
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
        if (7 - this.A00 == 0) {
            N5S n5s = (N5S) this.A01;
            IgdsListCell igdsListCell = n5s.A03;
            if (igdsListCell == null) {
                C14360o3.A0F("audioTranslationsLanguageSelector");
                throw C00O.createAndThrow();
            }
            igdsListCell.A0K(String.valueOf(((C50985Mfs) n5s.A0B.getValue()).A00().size()), false);
        }
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

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }
}
