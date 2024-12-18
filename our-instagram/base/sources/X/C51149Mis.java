package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.Mis, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51149Mis extends C2UU {
    public final InterfaceC11380iw A00;
    public final C54525O7c A01;
    public final List A02 = AbstractC166987dD.A1E();
    public final InterfaceC16620sF A03;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C51314Mlb(OOz.A00(viewGroup));
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        View view;
        View.OnClickListener viewOnClickListenerC55464OkJ;
        C51314Mlb c51314Mlb = (C51314Mlb) c3oo;
        C14360o3.A0B(c51314Mlb, 0);
        if (getItemViewType(i) == 1) {
            TextView textView = c51314Mlb.A02;
            AbstractC166987dD.A1P(textView.getContext(), textView, 2131963616);
            c51314Mlb.A01.setVisibility(8);
            c51314Mlb.A03.setVisibility(8);
            view = c51314Mlb.A00;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Context context = view.getContext();
            layoutParams.height = AbstractC167017dG.A0B(context) + (AbstractC167017dG.A05(context) * 2);
            viewOnClickListenerC55464OkJ = new ViewOnClickListenerC55460OkF(this, 66);
        } else {
            if (getItemViewType(i) != 0) {
                return;
            }
            Reel reel = (Reel) this.A02.get(i);
            c51314Mlb.A02.setText(reel.A0r);
            c51314Mlb.A01.setVisibility(8);
            ImageUrl A07 = reel.A07();
            if (A07 != null) {
                IgImageView igImageView = c51314Mlb.A03;
                igImageView.setVisibility(0);
                igImageView.setUrl(A07, this.A00);
            }
            view = c51314Mlb.A00;
            viewOnClickListenerC55464OkJ = new ViewOnClickListenerC55464OkJ(66, this, reel);
        }
        C0fQ.A00(viewOnClickListenerC55464OkJ, view);
    }

    public C51149Mis(InterfaceC11380iw interfaceC11380iw, C54525O7c c54525O7c, InterfaceC16620sF interfaceC16620sF) {
        this.A03 = interfaceC16620sF;
        this.A01 = c54525O7c;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int size;
        int i;
        int A03 = C0f9.A03(1884699617);
        List list = this.A02;
        if (list.size() == 0) {
            size = 0;
            i = 1852090578;
        } else {
            size = list.size() + 1;
            i = 583303336;
        }
        C0f9.A0A(i, A03);
        return size;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r5 != r4.A02.size()) goto L6;
     */
    @Override // X.C2UU, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getItemViewType(int r5) {
        /*
            r4 = this;
            r0 = 1686857132(0x648b65ac, float:2.057139E22)
            int r3 = X.C0f9.A03(r0)
            if (r5 <= 0) goto L15
            java.util.List r0 = r4.A02
            int r2 = r0.size()
            r1 = 1
            r0 = 1300512259(0x4d843e03, float:2.7733206E8)
            if (r5 == r2) goto L19
        L15:
            r1 = 0
            r0 = 1748709164(0x683b2f2c, float:3.5358108E24)
        L19:
            X.C0f9.A0A(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51149Mis.getItemViewType(int):int");
    }
}
