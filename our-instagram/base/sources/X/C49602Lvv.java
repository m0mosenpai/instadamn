package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.avatars.pokes.PokeReceiverView;

/* renamed from: X.Lvv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49602Lvv implements InterfaceC125355lh {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C49602Lvv(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.InterfaceC125355lh
    public final void onFinish() {
        View view;
        View findViewById;
        switch (this.A00) {
            case 0:
                PokeReceiverView pokeReceiverView = (PokeReceiverView) this.A02;
                pokeReceiverView.removeView((View) this.A01);
                PokeReceiverView.A00(pokeReceiverView);
                return;
            case 1:
            default:
                ((ViewGroup) this.A02).removeView((View) this.A01);
                return;
            case 2:
                Fragment fragment = ((C49636LwT) this.A01).A00.A09;
                if (fragment != null && (view = fragment.mView) != null && (findViewById = view.findViewById(R.id.gallery)) != null) {
                    findViewById.setImportantForAccessibility(1);
                }
                ViewGroup viewGroup = ((KCY) this.A02).A07;
                if (viewGroup == null) {
                    return;
                }
                viewGroup.removeAllViews();
                return;
            case 3:
                WEW wew = (WEW) this.A02;
                wew.A04 = false;
                wew.A07.setLayerType(0, null);
                wew.A09.setLayerType(0, null);
                ((InterfaceC125355lh) this.A01).onFinish();
                return;
            case 4:
                C51622Yk c51622Yk = (C51622Yk) this.A01;
                InterfaceC147206jw interfaceC147206jw = (InterfaceC147206jw) this.A02;
                c51622Yk.A0G.A00();
                if (interfaceC147206jw == null) {
                    return;
                }
                interfaceC147206jw.DZf();
                return;
        }
    }
}
