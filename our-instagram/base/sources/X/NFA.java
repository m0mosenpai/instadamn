package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel;

/* loaded from: classes9.dex */
public final class NFA extends AbstractC66422zJ {
    public final InterfaceC11380iw A00;
    public final QuickSnapArchiveViewModel A01;

    public NFA(InterfaceC11380iw interfaceC11380iw, QuickSnapArchiveViewModel quickSnapArchiveViewModel) {
        C14360o3.A0B(quickSnapArchiveViewModel, 2);
        this.A00 = interfaceC11380iw;
        this.A01 = quickSnapArchiveViewModel;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C51354MmF(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_quick_snap_archive_item, false), this.A00, this.A01);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0110, code lost:
    
        if (r6 == X.C05F.A01) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0189, code lost:
    
        r1 = java.lang.Integer.valueOf(r1).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0191, code lost:
    
        if (r1 < 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019b, code lost:
    
        if (((X.C9BR) r5.getValue()).A02 == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x019d, code lost:
    
        r1 = java.lang.Integer.valueOf(r1 + 1).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01a7, code lost:
    
        if (r1 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a9, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01aa, code lost:
    
        r3.setText(r0);
        r0 = com.facebook.R.drawable.quick_snap_archive_multi_select_disabled;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01b0, code lost:
    
        if (r1 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b2, code lost:
    
        r0 = com.facebook.R.drawable.quick_snap_archive_multi_select_enabled;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01b5, code lost:
    
        r3.setBackgroundResource(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01ba, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b9, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (((X.C9BR) r14.A0A.A0G.getValue()).A02 != false) goto L11;
     */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r13, X.C3OO r14) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NFA.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56123Ovj.class;
    }
}
