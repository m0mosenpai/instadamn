package X;

import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;
import java.util.Arrays;

/* renamed from: X.Lng, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49103Lng implements C7QC {
    public final C162907Rb A00;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        C49161Loe c49161Loe = (C49161Loe) c7qd;
        KTG ktg = (KTG) interfaceC129555tK;
        FrameLayout frameLayout = c49161Loe.A01;
        float[] fArr = AbstractC1580577p.A01(frameLayout.getContext(), ktg.A00).A01;
        GradientDrawable gradientDrawable = (GradientDrawable) frameLayout.getBackground();
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadii(fArr);
            frameLayout.setBackground(gradientDrawable);
        }
        TextView textView = c49161Loe.A04;
        Resources A0M = AbstractC25228BEl.A0M(textView);
        AbstractC31173DnH.A19(A0M, textView, 2131976950);
        String string = A0M.getString(2131976949);
        TextView textView2 = c49161Loe.A03;
        if (!string.contentEquals(textView2.getText())) {
            textView2.setText(string);
            AbstractC13880nE.A0r(textView2, new M1J(textView2));
        }
        this.A00.A02(c49161Loe, ktg);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        this.A00.A01(c7qd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C49103Lng(InterfaceC165077Zw interfaceC165077Zw, AnonymousClass988 anonymousClass988) {
        boolean z = anonymousClass988.A1U;
        C7AZ c7az = new C7AZ(z);
        this.A00 = new C162907Rb(Arrays.asList(new C1580177l(new C49021Lm9(interfaceC165077Zw, this), c7az.A00(interfaceC165077Zw), new C7Q9(interfaceC165077Zw, z), interfaceC165077Zw, anonymousClass988), c7az));
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.direct_voting_share_message);
        C7N9.A01(A0A);
        C49161Loe c49161Loe = new C49161Loe(A0A);
        float A0A2 = AbstractC13880nE.A0A(viewGroup.getContext()) / 2.5f;
        FrameLayout frameLayout = c49161Loe.A01;
        AbstractC13880nE.A0g(frameLayout, (int) A0A2);
        AbstractC13880nE.A0W(frameLayout, (int) (A0A2 / 0.75f));
        this.A00.A00(c49161Loe);
        return c49161Loe;
    }
}
