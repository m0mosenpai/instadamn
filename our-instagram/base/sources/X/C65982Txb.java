package X;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;

/* renamed from: X.Txb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65982Txb extends C06K {
    public final /* synthetic */ FrameLayout A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ AbstractC65952Twx A02;

    public C65982Txb(FrameLayout frameLayout, Fragment fragment, AbstractC65952Twx abstractC65952Twx) {
        this.A02 = abstractC65952Twx;
        this.A01 = fragment;
        this.A00 = frameLayout;
    }

    @Override // X.C06K
    public final void A01(Bundle bundle, View view, Fragment fragment, AbstractC10360h2 abstractC10360h2) {
        if (fragment == this.A01) {
            abstractC10360h2.A0p(this);
            AbstractC65952Twx.A02(view, this.A00);
        }
    }
}
