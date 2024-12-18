package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.Lw8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49615Lw8 implements C51D, C51E {
    public final int A00;
    public final Object A01;

    public C49615Lw8(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
        C45842KQx c45842KQx;
        C45068Jwx c45068Jwx;
        Boolean bool;
        if (4 - this.A00 == 0) {
            C14360o3.A0B(interfaceC56392iX, 0);
            C45487KCc c45487KCc = (C45487KCc) this.A01;
            ViewGroup viewGroup = (ViewGroup) interfaceC56392iX.getView();
            C14360o3.A0B(viewGroup, 0);
            if (c45487KCc.A00 == null) {
                String str = null;
                View inflate = LayoutInflater.from(c45487KCc.getContext()).inflate(R.layout.music_note_add_to_spotify_layout, (ViewGroup) null);
                c45487KCc.A00 = inflate.findViewById(R.id.music_note_add_to_spotify_container);
                Object A01 = Jn3.A01(c45487KCc);
                if (A01 instanceof C45842KQx) {
                    c45842KQx = (C45842KQx) A01;
                    if (c45842KQx != null) {
                        str = c45842KQx.A0E;
                    }
                } else {
                    c45842KQx = null;
                }
                boolean z = false;
                if (str != null && (c45842KQx == null || (c45068Jwx = c45842KQx.A07) == null || (bool = c45068Jwx.A06) == null || !bool.booleanValue())) {
                    z = true;
                }
                C45487KCc.A06(c45487KCc, z);
                viewGroup.addView(inflate);
            }
        }
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
        if (4 - this.A00 != 0) {
            return false;
        }
        return true;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:3:0x0005 A[ORIG_RETURN, RETURN] */
    @Override // X.C51D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isScrolledToTop() {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L3b;
                case 1: goto L7;
                case 2: goto L7;
                case 3: goto L17;
                case 4: goto L5;
                case 5: goto L17;
                case 6: goto L17;
                case 7: goto L30;
                case 8: goto L5;
                case 9: goto L5;
                case 10: goto L3b;
                default: goto L5;
            }
        L5:
            r0 = 1
        L6:
            return r0
        L7:
            java.lang.Object r0 = r2.A01
            X.Rb0 r0 = (X.Rb0) r0
            android.webkit.WebView r1 = r0.A02
            r0 = 0
            if (r1 == 0) goto L5
            int r1 = r1.getScrollY()
            if (r1 > 0) goto L6
            goto L5
        L17:
            java.lang.Object r0 = r2.A01
            X.KDS r0 = (X.KDS) r0
            X.LIk r0 = r0.A00
            if (r0 != 0) goto L29
            java.lang.String r0 = "reactionsPickerController"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L29:
            androidx.recyclerview.widget.LinearLayoutManager r0 = r0.A09
            boolean r0 = X.AbstractC110854yx.A03(r0)
            return r0
        L30:
            java.lang.Object r0 = r2.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.3Nv r0 = (X.C72743Nv) r0
            boolean r0 = r0.isScrolledToTop()
            return r0
        L3b:
            java.lang.Object r0 = r2.A01
            X.KBa r0 = (X.AbstractC45465KBa) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.A07()
            boolean r0 = X.AbstractC110854yx.A05(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49615Lw8.isScrolledToTop():boolean");
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
        switch (this.A00) {
            case 8:
                ((C148786mn) this.A01).A07.EJJ();
                return;
            case 9:
                C45510KCz.A03((C45510KCz) this.A01).A05(true);
                return;
            default:
                return;
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
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }
}
