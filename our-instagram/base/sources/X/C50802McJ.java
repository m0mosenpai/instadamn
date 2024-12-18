package X;

import android.widget.BaseAdapter;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.McJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50802McJ extends BaseAdapter {
    public final UserSession A00;
    public final LinkedHashMap A01;
    public final List A02 = AbstractC166987dD.A1E();
    public final InterfaceC11380iw A03;
    public final LinkedHashMap A04;
    public final boolean A05;
    public final boolean A06;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.A02.size();
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A02.get(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r12 = r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [X.NnS, java.lang.Object] */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r11, android.view.View r12, android.view.ViewGroup r13) {
        /*
            r10 = this;
            if (r12 != 0) goto L4b
            boolean r3 = r10.A05
            boolean r0 = r10.A06
            android.view.LayoutInflater r2 = X.AbstractC25228BEl.A0P(r13)
            r1 = 0
            if (r0 != 0) goto Lba
            if (r3 != 0) goto Lba
            r0 = 2131629256(0x7f0e14c8, float:1.8885828E38)
            android.view.View r12 = r2.inflate(r0, r13, r1)
            r0 = 2131428012(0x7f0b02ac, float:1.8477656E38)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = X.AbstractC31172DnG.A0Z(r12, r0)
            r0 = 2131443541(0x7f0b3f55, float:1.8509153E38)
        L20:
            android.view.View r0 = r12.requireViewById(r0)
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r0 = (com.instagram.ui.widget.textview.IgAutoCompleteTextView) r0
            X.NnS r2 = new X.NnS
            r2.<init>()
            r2.A03 = r12
            r2.A04 = r1
            r2.A05 = r0
            android.content.Context r1 = r12.getContext()
            int r0 = X.AbstractC13880nE.A0A(r1)
            r2.A01 = r0
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131165286(0x7f070066, float:1.7944785E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.A00 = r0
            r12.setTag(r2)
        L4b:
            java.lang.Object r6 = X.AbstractC31172DnG.A0x(r12)
            X.NnS r6 = (X.C53621NnS) r6
            java.util.List r2 = r10.A02
            java.lang.String r4 = X.AbstractC25226BEj.A1I(r2, r11)
            r8 = 0
            X.WKX r5 = new X.WKX
            r5.<init>(r10, r4)
            boolean r0 = r10.A05
            if (r0 != 0) goto Lcd
            boolean r0 = r10.A06
            if (r0 != 0) goto Lcd
            android.content.Context r1 = r12.getContext()
            X.8ae r1 = (X.InterfaceC189598ae) r1
            java.lang.String r0 = X.AbstractC25226BEj.A1I(r2, r11)
            X.47Z r3 = r1.BcC(r0)
            r3.getClass()
            java.util.LinkedHashMap r0 = r10.A01
            java.lang.String r7 = X.AbstractC31171DnF.A0h(r4, r0)
            java.lang.String r9 = r3.A33
            int r2 = r6.A01
            float r1 = (float) r2
            float r0 = r3.A01()
            float r1 = r1 / r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            android.graphics.Bitmap r1 = X.C1NC.A0E(r9, r2, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r6.A04
            r0.setImageBitmap(r1)
            r0.setVisibility(r8)
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r2 = r6.A05
            int r1 = r6.A00
            r0 = 1075838976(0x40200000, float:2.5)
            r2.A00 = r0
            r2.A01 = r1
            int r0 = r2.getTop()
            r2.setDropDownVerticalOffset(r0)
            r2.setText(r7)
            r6.A02 = r5
            r2.addTextChangedListener(r5)
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r1 = r6.A05
            X.OkR r0 = new X.OkR
            r0.<init>()
            r1.setOnFocusChangeListener(r0)
            return r12
        Lba:
            r0 = 2131629028(0x7f0e13e4, float:1.8885365E38)
            android.view.View r12 = r2.inflate(r0, r13, r1)
            r0 = 2131442831(0x7f0b3c8f, float:1.8507713E38)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = X.AbstractC31172DnG.A0Z(r12, r0)
            r0 = 2131428022(0x7f0b02b6, float:1.8477677E38)
            goto L20
        Lcd:
            java.util.LinkedHashMap r1 = r10.A04
            r1.getClass()
            java.lang.Object r0 = r2.get(r11)
            java.lang.Object r2 = r1.get(r0)
            r2.getClass()
            com.instagram.common.typedurl.ImageUrl r2 = (com.instagram.common.typedurl.ImageUrl) r2
            X.0iw r1 = r10.A03
            java.util.LinkedHashMap r0 = r10.A01
            java.lang.String r3 = X.AbstractC31171DnF.A0h(r4, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r6.A04
            r0.setUrl(r2, r1)
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r2 = r6.A05
            int r1 = r6.A00
            r0 = 1075838976(0x40200000, float:2.5)
            r2.A00 = r0
            r2.A01 = r1
            int r0 = r2.getTop()
            r2.setDropDownVerticalOffset(r0)
            r2.setText(r3)
            r6.A02 = r5
            r2.addTextChangedListener(r5)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50802McJ.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public C50802McJ(InterfaceC11380iw interfaceC11380iw, UserSession userSession, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, boolean z, boolean z2) {
        this.A03 = interfaceC11380iw;
        this.A00 = userSession;
        Iterator A14 = AbstractC166997dE.A14(linkedHashMap);
        while (A14.hasNext()) {
            this.A02.add(AbstractC166987dD.A1K(A14).getKey());
        }
        this.A01 = linkedHashMap;
        this.A05 = z;
        this.A06 = z2;
        this.A04 = linkedHashMap2;
    }
}
