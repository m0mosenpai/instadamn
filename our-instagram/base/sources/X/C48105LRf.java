package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import java.util.List;

/* renamed from: X.LRf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48105LRf implements C07X, C7QC {
    public int A00;
    public int A01;
    public int A02;
    public final C0eR A03 = new C0eR(this);
    public final InterfaceC11380iw A04;
    public final C162907Rb A05;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C14360o3.A0B(layoutInflater, 1);
        this.A01 = layoutInflater.getContext().getResources().getDimensionPixelOffset(R.dimen.account_discovery_bottom_gap);
        this.A02 = layoutInflater.getContext().getResources().getDimensionPixelOffset(R.dimen.asset_picker_video_sticker_width);
        this.A00 = layoutInflater.getContext().getColor(R.color.context_line_color);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C44789JsA c44789JsA = new C44789JsA(AbstractC31176DnK.A0A(layoutInflater, viewGroup, R.layout.direct_notes_xma_content));
        c44789JsA.A01.post(new M4E(this, c44789JsA));
        return c44789JsA;
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C14360o3.A0B(c7qd, 0);
        this.A05.A01(c7qd);
        this.A03.A0B(C07R.ON_PAUSE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        if (r2 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        r0 = r7.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        r0 = r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        r0 = r12.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r0 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        r0 = (X.C47790L8w) r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (r0 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        r1 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        r3.A0G(r9, r8, r2, X.AbstractC167007dF.A1X(r1, X.EnumC46175KcD.A07));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        if (r7 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ef, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0048, code lost:
    
        if (r7 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x003b, code lost:
    
        if (r7 != null) goto L15;
     */
    @Override // X.C7QC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void ADy(X.C7QD r11, X.InterfaceC129555tK r12) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48105LRf.ADy(X.7QD, X.5tK):void");
    }

    @Override // X.C07X
    public final /* bridge */ /* synthetic */ C07T getLifecycle() {
        return this.A03;
    }

    public C48105LRf(List list, InterfaceC11380iw interfaceC11380iw) {
        this.A04 = interfaceC11380iw;
        this.A05 = new C162907Rb(list);
    }
}
