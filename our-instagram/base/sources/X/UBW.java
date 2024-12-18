package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class UBW extends FrameLayout {
    public static final /* synthetic */ C0YR[] A03 = {new AnonymousClass013(UBW.class, "text", "getText()Ljava/lang/String;", 0), new AnonymousClass013(UBW.class, "textStyle", "getTextStyle()Lcom/facebookpay/widget/style/TextStyle;", 0)};
    public TextView A00;
    public final InterfaceC16530ry A01;
    public final InterfaceC16530ry A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UBW(Context context) {
        super(context, null, 0);
        C14360o3.A0B(context, 1);
        this.A01 = new X6J(this, 51);
        this.A02 = new X6J(this, 52);
        addView(LayoutInflater.from(context).inflate(R.layout.fbpay_ui_list_cell_left_add_on_label, (ViewGroup) this, false));
        this.A00 = (TextView) findViewById(R.id.list_cell_left_add_on_label);
        Context context2 = getContext();
        C2FP.A0A();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(R.style.FBPayUIListCell, AbstractC55922hc.A0e);
        TextView textView = this.A00;
        if (textView != null) {
            AbstractC70177WFc.A00(obtainStyledAttributes, textView, 19, R.style.FBPayUIListCellLeftAddOnLabel);
            obtainStyledAttributes.recycle();
            TextView textView2 = this.A00;
            if (textView2 != null) {
                WF7.A02(textView2, VEP.A19);
                return;
            }
        }
        C14360o3.A0F("textView");
        throw C00O.createAndThrow();
    }

    public final String getText() {
        return MSX.A0j(this, this.A01, A03, 0);
    }

    public final VEP getTextStyle() {
        return (VEP) this.A02.CES(this, A03[1]);
    }

    public final void setText(String str) {
        AbstractC31171DnF.A1S(this, str, this.A01, A03, 0);
    }

    public final void setTextStyle(VEP vep) {
        AbstractC31171DnF.A1S(this, vep, this.A02, A03, 1);
    }
}
