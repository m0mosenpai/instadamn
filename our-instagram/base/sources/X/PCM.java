package X;

import android.view.View;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes9.dex */
public final class PCM implements InterfaceC57985PnV {
    public IgTextView A00;
    public IgTextView A01;
    public C51889MwX A02;
    public boolean A03;
    public final View A04;
    public final O5B A05;
    public final InterfaceC09390do A06 = C57543PgH.A01(this, 6);
    public final InterfaceC09390do A07 = C57543PgH.A01(this, 7);

    public static final void A00(PCM pcm) {
        String str;
        String str2;
        String str3;
        IgTextView igTextView = pcm.A00;
        if (igTextView == null) {
            str3 = "primaryButtonView";
        } else {
            C51889MwX c51889MwX = pcm.A02;
            if (c51889MwX == null || (str = c51889MwX.A01) == null) {
                str = "";
            }
            igTextView.setText(str);
            IgTextView igTextView2 = pcm.A01;
            if (igTextView2 == null) {
                str3 = "secondaryButtonView";
            } else {
                C51889MwX c51889MwX2 = pcm.A02;
                if (c51889MwX2 == null || (str2 = c51889MwX2.A02) == null) {
                    str2 = "";
                }
                igTextView2.setText(str2);
                return;
            }
        }
        C14360o3.A0F(str3);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC57985PnV
    public final /* bridge */ /* synthetic */ void ADV(InterfaceC57856PlM interfaceC57856PlM) {
        C51889MwX c51889MwX = (C51889MwX) interfaceC57856PlM;
        C14360o3.A0B(c51889MwX, 0);
        this.A02 = c51889MwX;
        if (this.A03) {
            A00(this);
            AbstractC13880nE.A0Y(MSY.A0E(this.A06), c51889MwX.A00);
        }
    }

    public PCM(View view, O5B o5b) {
        this.A04 = view;
        this.A05 = o5b;
    }
}
