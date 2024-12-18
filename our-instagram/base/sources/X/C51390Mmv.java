package X;

import android.view.View;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Mmv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51390Mmv extends AbstractC021208i {
    public final ImmutableList A00;
    public final InterfaceC11380iw A01;
    public final C55U A02;
    public final OUH A03;

    public C51390Mmv(ImmutableList immutableList, InterfaceC11380iw interfaceC11380iw, C55U c55u, OUH ouh) {
        C14360o3.A0B(immutableList, 3);
        this.A01 = interfaceC11380iw;
        this.A03 = ouh;
        this.A00 = immutableList;
        this.A02 = c55u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0112, code lost:
    
        if (r5 != r9) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0116, code lost:
    
        if (r5 != com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode.A03) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x011c, code lost:
    
        r0 = r2.A05;
        X.AbstractC31174DnI.A16(r15, r0, 1, false);
        r0.setAdapter(r14);
        r24.addView(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x012b, code lost:
    
        if (r24.getChildCount() != 1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x012d, code lost:
    
        r24.getViewTreeObserver().addOnPreDrawListener(new X.ViewTreeObserverOnPreDrawListenerC55503Okw(r24, 2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x013a, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0118, code lost:
    
        r14.A02 = r4.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0149, code lost:
    
        if (r11 != false) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b5  */
    @Override // X.AbstractC021208i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object instantiateItem(android.view.ViewGroup r24, int r25) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51390Mmv.instantiateItem(android.view.ViewGroup, int):java.lang.Object");
    }

    @Override // X.AbstractC021208i
    public final int getCount() {
        return this.A00.size();
    }

    @Override // X.AbstractC021208i
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        AbstractC167017dG.A1O(viewGroup, obj);
        viewGroup.removeView((View) obj);
    }

    @Override // X.AbstractC021208i
    public final boolean isViewFromObject(View view, Object obj) {
        AbstractC167017dG.A1N(view, obj);
        return AbstractC167007dF.A1X(view, obj);
    }
}
