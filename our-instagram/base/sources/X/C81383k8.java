package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.3k8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81383k8 extends C3OO implements InterfaceC81393k9 {
    public C6T7 A00;
    public final FrameLayout A01;
    public final ProgressBar A02;
    public final TextView A03;
    public final C126545np A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81383k8(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        View requireViewById = view.requireViewById(R.id.bloks_loader);
        C14360o3.A07(requireViewById);
        this.A02 = (ProgressBar) requireViewById;
        View requireViewById2 = view.requireViewById(R.id.error_message);
        C14360o3.A07(requireViewById2);
        this.A03 = (TextView) requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.bloks_container);
        C14360o3.A07(requireViewById3);
        FrameLayout frameLayout = (FrameLayout) requireViewById3;
        this.A01 = frameLayout;
        Context context = view.getContext();
        C14360o3.A07(context);
        C126545np c126545np = new C126545np(context);
        this.A04 = c126545np;
        frameLayout.addView(c126545np);
    }

    @Override // X.InterfaceC81393k9
    public final void DKx(C6T7 c6t7, C69244VkC c69244VkC) {
        C6T7 c6t72 = this.A00;
        if (c6t72 != c6t7) {
            if (c6t72 != null) {
                c6t72.A04();
            }
            this.A00 = c6t7;
            c6t7.A07(this.A04);
        }
        this.A02.setVisibility(8);
        this.A01.setVisibility(0);
        this.A03.setVisibility(8);
        c69244VkC.A02.Dcq(c69244VkC.A01);
        C62862tP c62862tP = c69244VkC.A00;
        c62862tP.A05(new HHC(c62862tP, this));
    }

    @Override // X.InterfaceC81393k9
    public final void DPm(String str) {
        String A00 = AbstractC111324zv.A00(1513);
        this.A02.setVisibility(8);
        this.A01.setVisibility(8);
        TextView textView = this.A03;
        textView.setVisibility(0);
        textView.setText(A00);
    }
}
