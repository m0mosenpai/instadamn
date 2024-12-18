package X;

import android.content.Context;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgProgressBar;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.6fD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C144316fD implements InterfaceC144306fC {
    public ViewGroup A00;
    public IgProgressBar A01;
    public IgTextView A02;
    public C8F9 A03;
    public final C57012jc A04;

    @Override // X.InterfaceC144306fC
    public final void EYT(boolean z) {
        IgTextView igTextView = this.A02;
        if (z) {
            if (igTextView != null) {
                igTextView.setVisibility(4);
                IgProgressBar igProgressBar = this.A01;
                if (igProgressBar != null) {
                    igProgressBar.setVisibility(0);
                    return;
                }
                C14360o3.A0F("loadingSpinner");
            }
            C14360o3.A0F("buttonView");
        } else {
            if (igTextView != null) {
                igTextView.setVisibility(0);
                IgProgressBar igProgressBar2 = this.A01;
                if (igProgressBar2 != null) {
                    igProgressBar2.setVisibility(4);
                    return;
                }
                C14360o3.A0F("loadingSpinner");
            }
            C14360o3.A0F("buttonView");
        }
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC144306fC
    public final void FAS(UserSession userSession) {
        String str;
        IgTextView igTextView = this.A02;
        if (igTextView == null) {
            str = "buttonView";
        } else {
            Context context = igTextView.getContext();
            C14360o3.A0A(context);
            C8F9 c8f9 = this.A03;
            if (c8f9 == null) {
                str = "model";
            } else {
                C66645URj c66645URj = c8f9.A0E;
                if (c66645URj != null) {
                    AbstractC34281FAb.A00(context, userSession, c66645URj);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public C144316fD(C57012jc c57012jc) {
        this.A04 = c57012jc;
    }
}
