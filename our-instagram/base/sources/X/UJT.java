package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class UJT extends C3OO {
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final ImageView A04;
    public final /* synthetic */ UuK A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UJT(View view, UuK uuK) {
        super(view);
        this.A05 = uuK;
        ImageView imageView = (ImageView) view.findViewById(R.id.checkmark_icon);
        this.A04 = imageView;
        TextView textView = (TextView) view.findViewById(R.id.title);
        this.A03 = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.subtitle);
        this.A02 = textView2;
        TextView textView3 = (TextView) view.findViewById(R.id.see_receipt);
        this.A01 = textView3;
        TextView textView4 = (TextView) view.findViewById(R.id.pin_upsell);
        this.A00 = textView4;
        C14360o3.A05(imageView);
        AbstractC68348VNi.A00(null, imageView, VET.A08);
        C14360o3.A05(textView);
        WF7.A02(textView, VEP.A0x);
        C14360o3.A05(textView2);
        WF7.A02(textView2, VEP.A0F);
        C14360o3.A05(textView3);
        VEP vep = VEP.A0t;
        WF7.A02(textView3, vep);
        C14360o3.A05(textView4);
        WF7.A02(textView4, vep);
        WNN.A00(textView4, 9, uuK);
    }
}
