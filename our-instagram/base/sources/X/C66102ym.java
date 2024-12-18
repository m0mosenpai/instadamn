package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import java.util.Map;

/* renamed from: X.2ym, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66102ym implements InterfaceC66092yl {
    public boolean A00;
    public final InterfaceC11380iw A01;

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a0, code lost:
    
        if (r5.length() == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ac, code lost:
    
        if (r6.length() == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x013a, code lost:
    
        if (r10 != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x013d, code lost:
    
        r0 = r14.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x013f, code lost:
    
        if (r0 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0141, code lost:
    
        r0.setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0144, code lost:
    
        if (r12 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0124, code lost:
    
        if (r0 != false) goto L80;
     */
    @Override // X.InterfaceC66092yl
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ADw(X.InterfaceC55362gb r12, X.C4NJ r13, X.C81403kA r14) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66102ym.ADw(X.2gb, X.4NJ, X.3kA):void");
    }

    @Override // X.InterfaceC66092yl
    public final View Csl(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.condensed_generic_v3_megaphone, viewGroup, false);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C14360o3.A0A(inflate);
        inflate.setTag(new C81403kA(inflate));
        return inflate;
    }

    @Override // X.InterfaceC66092yl
    public final /* bridge */ /* synthetic */ void AE0(C3OO c3oo, InterfaceC55362gb interfaceC55362gb, C4NJ c4nj, Map map) {
        C81403kA c81403kA = (C81403kA) c3oo;
        C14360o3.A0B(c81403kA, 0);
        ADw(interfaceC55362gb, c4nj, c81403kA);
    }

    public C66102ym(InterfaceC11380iw interfaceC11380iw) {
        this.A01 = interfaceC11380iw;
    }
}
