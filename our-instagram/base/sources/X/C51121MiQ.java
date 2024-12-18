package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.pendingmedia.model.BrandedContentTag;
import java.util.List;

/* renamed from: X.MiQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51121MiQ extends C2UU {
    public final List A00 = AbstractC166987dD.A1E();
    public final InterfaceC16660sJ A01;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        String str;
        C51314Mlb c51314Mlb = (C51314Mlb) c3oo;
        C14360o3.A0B(c51314Mlb, 0);
        OTH oth = (OTH) this.A00.get(i);
        TextView textView = c51314Mlb.A02;
        C51675Ms6 c51675Ms6 = oth.A00;
        if (c51675Ms6 == null || (str = AnonymousClass001.A0g(c51675Ms6.A06, " • ", c51675Ms6.A02)) == null) {
            BrandedContentTag brandedContentTag = oth.A01;
            if (brandedContentTag != null) {
                str = brandedContentTag.A02;
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        textView.setText(str);
        ViewOnClickListenerC55464OkJ.A01(c51314Mlb.A00, 14, this, oth);
    }

    public C51121MiQ(InterfaceC16660sJ interfaceC16660sJ) {
        this.A01 = interfaceC16660sJ;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1626188152);
        int size = this.A00.size();
        C0f9.A0A(-1686251368, A03);
        return size;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return OOz.A01(viewGroup);
    }
}
