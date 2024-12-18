package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import kotlin.Deprecated;

@Deprecated(message = "No longer supported by IGDS, please write in IGDS group for feedback: https://fb.workplace.com/groups/IGDSFeedback")
/* renamed from: X.Ajy, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23964Ajy implements C5ST {
    public final CharSequence A00;
    public final CharSequence A01;

    @Override // X.C5ST
    public final /* bridge */ /* synthetic */ AbstractC117215Sg ANT(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AbstractC167007dF.A1K(layoutInflater, viewGroup);
        View inflate = layoutInflater.inflate(R.layout.tooltip_title_with_text, viewGroup, false);
        C14360o3.A07(inflate);
        return new C220499oZ(inflate);
    }

    @Override // X.C5ST
    public final /* bridge */ /* synthetic */ void ADz(C5SV c5sv, AbstractC117215Sg abstractC117215Sg) {
        C220499oZ c220499oZ = (C220499oZ) abstractC117215Sg;
        AbstractC167017dG.A1N(c220499oZ, c5sv);
        TextView textView = c220499oZ.A01;
        int color = textView.getContext().getColor(c5sv.A02);
        textView.setText(this.A01);
        textView.setTextColor(color);
        TextView textView2 = c220499oZ.A00;
        textView2.setText(this.A00);
        textView2.setTextColor(color);
    }

    public C23964Ajy(CharSequence charSequence, CharSequence charSequence2) {
        AbstractC167017dG.A1P(charSequence, charSequence2);
        this.A01 = charSequence;
        this.A00 = charSequence2;
    }

    public C23964Ajy() {
    }
}
