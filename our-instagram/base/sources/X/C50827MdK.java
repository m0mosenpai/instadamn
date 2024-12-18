package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.instagram.video.live.mvvm.viewmodel.likes.IgLiveViewerLikesViewModel;

/* renamed from: X.MdK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50827MdK extends C02V {
    public final int A00;
    public final Object A01;

    public C50827MdK(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C02V
    public final boolean A0X(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        IgLiveViewerLikesViewModel igLiveViewerLikesViewModel;
        if (4 - this.A00 == 0) {
            AbstractC167027dH.A12(viewGroup, view, accessibilityEvent);
            C51018MgQ A02 = ((OMQ) this.A01).A02();
            if ((A02 instanceof IgLiveViewerLikesViewModel) && (igLiveViewerLikesViewModel = (IgLiveViewerLikesViewModel) A02) != null) {
                IgLiveViewerLikesViewModel.A05(igLiveViewerLikesViewModel);
            }
        }
        return super.A0X(viewGroup, view, accessibilityEvent);
    }

    @Override // X.C02V
    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        CharSequence string;
        switch (this.A00) {
            case 0:
                AbstractC167017dG.A1N(view, accessibilityNodeInfoCompat);
                super.A0Y(view, accessibilityNodeInfoCompat);
                C012804r c012804r = C012804r.A0I;
                string = ((OM7) this.A01).A05.getResources().getString(2131969675);
                break;
            case 1:
                super.A0Y(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setClassName(AbstractC111324zv.A00(1916));
                accessibilityNodeInfoCompat.setClickable(true);
                return;
            case 2:
                super.A0Y(view, accessibilityNodeInfoCompat);
                AbstractC56952jT.A05(accessibilityNodeInfoCompat, C05F.A01);
                string = view.getResources().getText(2131975166);
                break;
            case 3:
                AbstractC167017dG.A1N(view, accessibilityNodeInfoCompat);
                super.A0Y(view, accessibilityNodeInfoCompat);
                C012804r c012804r2 = C012804r.A0I;
                string = ((C51355MmG) this.A01).A00.getString(2131953622);
                break;
            default:
                super.A0Y(view, accessibilityNodeInfoCompat);
                return;
        }
        accessibilityNodeInfoCompat.addAction(new C012804r(16, string));
    }
}
