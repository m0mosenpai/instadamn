package X;

import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.3P0, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3P0 extends C3P1 {
    public final View A00;
    public final TextView A01;
    public final InterfaceC56392iX A02;
    public final InterfaceC56392iX A03;
    public final View A04;
    public final InterfaceC56392iX A05;

    @Override // X.C3P1
    public final View A00() {
        return this.A00;
    }

    @Override // X.C3P1
    public final View A01() {
        return this.A04;
    }

    @Override // X.C3P1
    public final TextView A03() {
        return (TextView) this.A02.getView();
    }

    @Override // X.C3P1
    public final TextView A04() {
        return this.A01;
    }

    @Override // X.C3P1
    public final TextView A05() {
        TextView textView;
        InterfaceC56392iX interfaceC56392iX = this.A03;
        if (interfaceC56392iX != null) {
            textView = (TextView) interfaceC56392iX.getView();
        } else {
            textView = null;
        }
        C14360o3.A0A(textView);
        return textView;
    }

    @Override // X.C3P1
    public final InterfaceC56392iX A06() {
        return this.A03;
    }

    @Override // X.C3P1
    public final InterfaceC56392iX A07() {
        return this.A05;
    }

    @Override // X.C3P1
    public final boolean A08() {
        ViewParent viewParent;
        View findViewById = this.A00.findViewById(R.id.subtitle);
        if (findViewById != null) {
            viewParent = findViewById.getParent();
        } else {
            viewParent = null;
        }
        if (!this.A02.CWW() && viewParent == null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3P0(android.view.View r5) {
        /*
            r4 = this;
            android.content.Context r1 = r5.getContext()
            X.C14360o3.A07(r1)
            android.content.res.Resources r0 = r5.getResources()
            X.C14360o3.A07(r0)
            r4.<init>(r1, r0)
            r4.A00 = r5
            r0 = 2131442949(0x7f0b3d05, float:1.8507952E38)
            android.view.View r0 = r5.requireViewById(r0)
            X.C14360o3.A07(r0)
            r4.A04 = r0
            android.view.View r1 = r4.A00
            r0 = 2131443679(0x7f0b3fdf, float:1.8509433E38)
            android.view.View r0 = r1.requireViewById(r0)
            X.C14360o3.A07(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.A01 = r0
            android.view.View r1 = r4.A00
            r0 = 2131442120(0x7f0b39c8, float:1.850627E38)
            android.view.View r1 = r1.requireViewById(r0)
            r0 = 0
            r3 = 0
            X.2iX r1 = X.AbstractC56372iV.A01(r1, r3, r3)
            r4.A02 = r1
            android.view.View r2 = r4.A00
            r1 = 2131437833(0x7f0b2909, float:1.8497576E38)
            android.view.View r1 = r2.requireViewById(r1)
            X.2iX r1 = X.AbstractC56372iV.A01(r1, r3, r3)
            r4.A03 = r1
            android.view.View r2 = r4.A00
            r1 = 2131437174(0x7f0b2676, float:1.849624E38)
            android.view.View r1 = r2.findViewById(r1)
            if (r1 == 0) goto L5e
            X.2iX r0 = X.AbstractC56372iV.A01(r1, r3, r3)
        L5e:
            r4.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3P0.<init>(android.view.View):void");
    }
}
