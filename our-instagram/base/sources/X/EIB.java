package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EIB extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "LinksListFragment";
    public C38321qM A00;
    public AnonymousClass708 A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "links_sheet";
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d0, code lost:
    
        if (r12.length() == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d9, code lost:
    
        if (r12.length() == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00db, code lost:
    
        r12 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00dc, code lost:
    
        r0 = new X.C32070E6w(r0.BNW(), r14, r12, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d3, code lost:
    
        if (r12 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x014f, code lost:
    
        if (r12.length() == 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0158, code lost:
    
        if (r12.length() != 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x015a, code lost:
    
        r11 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015b, code lost:
    
        r12 = r0.BNW();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015f, code lost:
    
        if (r14 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0161, code lost:
    
        r14 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0163, code lost:
    
        r0 = new X.C32070E6w(r12, r10, r11, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0152, code lost:
    
        if (r12 != null) goto L65;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r31, android.os.Bundle r32) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EIB.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1022669996);
        super.onCreate(bundle);
        C0f9.A09(-305611820, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1783480182);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_links_fragment, viewGroup, false);
        C0f9.A09(-900885264, A02);
        return inflate;
    }
}
