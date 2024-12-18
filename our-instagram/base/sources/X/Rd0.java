package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.instagram.react.delegate.IgReactDelegate;

/* loaded from: classes10.dex */
public final class Rd0 extends Rb1 implements InterfaceC189488aT {
    public static final String __redex_internal_original_name = "IgLiveSSISheetFragment";
    public int A00 = -1;

    @Override // X.InterfaceC189488aT
    public final int Ahd(Context context) {
        return 0;
    }

    @Override // X.InterfaceC189488aT
    public final View C5a() {
        return null;
    }

    @Override // X.InterfaceC189488aT
    /* renamed from: CO7 */
    public final float Cpk() {
        return 1.0f;
    }

    @Override // X.InterfaceC189488aT
    public final float Cnp() {
        return 1.0f;
    }

    @Override // X.InterfaceC189498aU
    public final void DOM() {
    }

    @Override // X.InterfaceC189498aU
    public final void DON(int i) {
    }

    @Override // X.InterfaceC189488aT
    public final boolean Ei2() {
        return true;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetClosed() {
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ABC() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ANe() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final int Aqi() {
        int i = this.A00;
        if (i <= 0) {
            return 0;
        }
        return i;
    }

    @Override // X.InterfaceC189488aT
    public final int C9V() {
        return 0;
    }

    @Override // X.InterfaceC189488aT
    public final boolean CQm() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ float Cpk() {
        return 1.0f;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final boolean isScrolledToTop() {
        return false;
    }

    @Override // X.Rb1, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-95075220);
        super.onCreate(bundle);
        ((IgReactDelegate) super.A00).A08 = new C62453SCg(this);
        C0f9.A09(1811669979, A02);
    }
}
