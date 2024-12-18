package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import java.util.List;

/* renamed from: X.Mil, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51142Mil extends C2UU {
    public List A00 = C16930sl.A00;

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        if (r6.A01 == true) goto L33;
     */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C3OO r8, int r9) {
        /*
            r7 = this;
            r0 = 0
            X.C14360o3.A0B(r8, r0)
            boolean r0 = r8 instanceof X.C51273Mkw
            r6 = 0
            r3 = 1
            if (r0 == 0) goto L58
            java.util.List r0 = r7.A00
            java.lang.Object r1 = X.AbstractC001800i.A0O(r0, r9)
            boolean r0 = r1 instanceof X.C52417NHn
            if (r0 == 0) goto L17
            r6 = r1
            X.NHn r6 = (X.C52417NHn) r6
        L17:
            r5 = r8
            X.Mkw r5 = (X.C51273Mkw) r5
            android.content.Context r1 = X.AbstractC37301Gc2.A03(r8)
            if (r6 == 0) goto L56
            int r0 = r6.A00
        L22:
            int r4 = X.AbstractC53880NsC.A00(r1, r0)
            if (r6 == 0) goto L54
            boolean r0 = r6.A01
            if (r0 != r3) goto L54
        L2c:
            android.view.View r1 = r5.A01
            r0 = 2131429972(0x7f0b0a54, float:1.8481632E38)
            android.view.View r2 = r1.findViewById(r0)
            X.C14360o3.A0A(r2)
            X.AbstractC13880nE.A0g(r2, r4)
            boolean r0 = r5.A00
            if (r0 == r3) goto L51
            android.content.res.Resources r1 = X.AbstractC25228BEl.A0M(r1)
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
            if (r3 == 0) goto L4a
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
        L4a:
            float r0 = r1.getDimension(r0)
            X.AbstractC226879zj.A00(r2, r0)
        L51:
            r5.A00 = r3
        L53:
            return
        L54:
            r3 = 0
            goto L2c
        L56:
            r0 = 0
            goto L22
        L58:
            boolean r0 = r8 instanceof X.C51239MkO
            if (r0 == 0) goto L53
            java.util.List r0 = r7.A00
            java.lang.Object r1 = X.AbstractC001800i.A0O(r0, r9)
            boolean r0 = r1 instanceof X.C52418NHo
            if (r0 == 0) goto L69
            r6 = r1
            X.NHo r6 = (X.C52418NHo) r6
        L69:
            X.MkO r8 = (X.C51239MkO) r8
            if (r6 == 0) goto L93
            int r2 = r6.A00
            boolean r0 = r6.A01
            if (r0 != r3) goto L94
        L73:
            android.view.View r1 = r8.A00
            X.AbstractC13880nE.A0g(r1, r2)
            r0 = 2131432393(0x7f0b13c9, float:1.8486542E38)
            android.view.View r2 = X.AbstractC166987dD.A0c(r1, r0)
            android.content.res.Resources r1 = X.AbstractC25228BEl.A0M(r1)
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
            if (r3 == 0) goto L8a
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
        L8a:
            float r0 = r1.getDimension(r0)
            int r0 = (int) r0
            X.AbstractC13880nE.A0W(r2, r0)
            return
        L93:
            r2 = 0
        L94:
            r3 = 0
            goto L73
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51142Mil.onBindViewHolder(X.3OO, int):void");
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        LayoutInflater A0P = AbstractC25228BEl.A0P(viewGroup);
        if (i == 1) {
            return new C51273Mkw(AbstractC25226BEj.A0R(A0P, viewGroup, R.layout.layout_mini_timeline_clip_bar, false));
        }
        return new C51239MkO(AbstractC25226BEj.A0R(A0P, viewGroup, R.layout.layout_mini_timeline_empty_space, false));
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1206189491);
        int size = this.A00.size();
        C0f9.A0A(1924599859, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        Integer num;
        int i2;
        int A03 = C0f9.A03(-1500914072);
        O28 o28 = (O28) AbstractC001800i.A0O(this.A00, i);
        if (o28 != null) {
            num = o28.A00;
        } else {
            num = C05F.A01;
        }
        if (num.intValue() != 0) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        C0f9.A0A(-590494310, A03);
        return i2;
    }
}
