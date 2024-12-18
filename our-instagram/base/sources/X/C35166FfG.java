package X;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

@Deprecated
/* renamed from: X.FfG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35166FfG {
    public static final InterfaceC11380iw A0H = AbstractC31171DnF.A0D("ig_dialog_builder_module");
    public DialogInterface.OnClickListener A00;
    public AbstractC12990ll A01;
    public final Context A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final ViewGroup A07;
    public final CheckBox A08;
    public final TextView A09;
    public final TextView A0A;
    public final TextView A0B;
    public final TextView A0C;
    public final DialogC31731Dwc A0D;
    public final View A0E;
    public final ListView A0F;
    public final TextView A0G;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        if (r3.getVisibility() == 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.DialogC31731Dwc A00() {
        /*
            r8 = this;
            android.content.Context r1 = r8.A02
            boolean r0 = r1 instanceof android.app.Activity
            java.lang.String r6 = "IgDialogBuilder"
            if (r0 == 0) goto L15
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r0 = r1.isFinishing()
            if (r0 == 0) goto L15
            java.lang.String r0 = "Activity is finishing"
            X.C0w9.A03(r6, r0)
        L15:
            android.widget.TextView r3 = r8.A0B
            android.widget.TextView r0 = r8.A0G
            android.view.View r2 = r8.A0E
            r1 = 8
            r7 = 0
            if (r2 == 0) goto L33
            if (r0 == 0) goto L33
            if (r3 == 0) goto L33
            int r0 = r0.getVisibility()
            if (r0 != 0) goto Lbd
            int r0 = r3.getVisibility()
            if (r0 != 0) goto Lbd
            r2.setVisibility(r7)
        L33:
            android.widget.TextView r3 = r8.A0A
            android.widget.TextView r0 = r8.A0C
            if (r0 == 0) goto L6b
            if (r3 == 0) goto L6b
            android.view.View r0 = r8.A06
            r0.getClass()
            int r0 = r0.getVisibility()
            if (r0 != r1) goto L6b
            android.content.res.Resources r0 = r3.getResources()
            android.util.DisplayMetrics r2 = r0.getDisplayMetrics()
            android.graphics.RectF r0 = X.AbstractC13880nE.A01
            r1 = 1117257728(0x42980000, float:76.0)
            r0 = 1
            float r0 = android.util.TypedValue.applyDimension(r0, r1, r2)
            int r2 = (int) r0
            r3.setMinimumHeight(r2)
            r1 = 17
            r3.setGravity(r1)
            android.widget.CheckBox r0 = r8.A08
            r0.getClass()
            r0.setMinimumHeight(r2)
            r0.setGravity(r1)
        L6b:
            android.widget.ListView r2 = r8.A0F
            android.widget.TextView r5 = r8.A09
            android.view.View r4 = r8.A03
            android.view.View r3 = r8.A05
            android.view.View r1 = r8.A06
            if (r1 == 0) goto Lb0
            if (r3 == 0) goto Lb0
            if (r4 == 0) goto Lb0
            if (r5 == 0) goto Lb0
            if (r2 == 0) goto Lb0
            int r0 = r2.getVisibility()
            if (r0 != 0) goto Lb0
            android.widget.ListAdapter r2 = r2.getAdapter()
            r2.getClass()
            X.EPV r2 = (X.EPV) r2
            int r0 = r1.getVisibility()
            if (r0 == 0) goto L9b
            int r1 = r3.getVisibility()
            r0 = 1
            if (r1 != 0) goto L9c
        L9b:
            r0 = 0
        L9c:
            r2.roundDialogTopCorners = r0
            int r0 = r4.getVisibility()
            if (r0 == 0) goto Lab
            int r0 = r5.getVisibility()
            if (r0 == 0) goto Lab
            r7 = 1
        Lab:
            r2.roundDialogBottomCorners = r7
            r0 = 0
            r2.shouldCenterText = r0
        Lb0:
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>()
            java.lang.String r0 = "Creating Dialog"
            X.C0K8.A0H(r6, r0, r1)
            X.Dwc r0 = r8.A0D
            return r0
        Lbd:
            r2.setVisibility(r1)
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35166FfG.A00():X.Dwc");
    }

    public final void A01(int i) {
        TextView textView = this.A0C;
        textView.getClass();
        textView.setText(i);
        View view = this.A06;
        view.getClass();
        view.setVisibility(0);
    }

    public final void A02(DialogInterface.OnClickListener onClickListener, int i) {
        String string = this.A02.getString(i);
        TextView textView = this.A0B;
        textView.getClass();
        textView.setText(string);
        C0fQ.A00(new ViewOnClickListenerC35582FnZ(onClickListener, this, -2), textView);
        textView.setVisibility(0);
        View view = this.A03;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public final void A03(DialogInterface.OnClickListener onClickListener, String str) {
        TextView textView = this.A0G;
        textView.getClass();
        textView.setText(str);
        C0fQ.A00(new ViewOnClickListenerC35582FnZ(onClickListener, this, -1), textView);
        textView.setVisibility(0);
        View view = this.A03;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public final void A04(DialogInterface.OnClickListener onClickListener, CharSequence[] charSequenceArr) {
        Context context = this.A02;
        EPV epv = new EPV(context, this.A01, A0H);
        this.A00 = onClickListener;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (int i = 0; i < charSequenceArr.length; i++) {
            GHY.A01(context, new ViewOnClickListenerC35668Fp3(i, 7, this), charSequenceArr[i], A1E);
        }
        epv.addDialogMenuItems(A1E);
        ListView listView = this.A0F;
        listView.getClass();
        listView.setAdapter((ListAdapter) epv);
        listView.setVisibility(0);
    }

    public C35166FfG(Context context, int i, int i2) {
        this.A02 = context;
        DialogC31731Dwc dialogC31731Dwc = new DialogC31731Dwc(context, i2);
        this.A0D = dialogC31731Dwc;
        View A0C = AbstractC25227BEk.A0C(LayoutInflater.from(context), i);
        this.A04 = A0C;
        dialogC31731Dwc.setContentView(A0C);
        this.A0F = (ListView) dialogC31731Dwc.findViewById(R.id.list);
        this.A05 = dialogC31731Dwc.findViewById(com.facebook.R.id.scrollView);
        this.A06 = dialogC31731Dwc.findViewById(com.facebook.R.id.alertTitleContainer);
        this.A0C = (TextView) dialogC31731Dwc.findViewById(com.facebook.R.id.alertTitle);
        this.A0A = (TextView) dialogC31731Dwc.findViewById(com.facebook.R.id.message);
        this.A08 = (CheckBox) dialogC31731Dwc.findViewById(com.facebook.R.id.messageCheckBox);
        this.A03 = dialogC31731Dwc.findViewById(com.facebook.R.id.button_group);
        this.A0G = (TextView) dialogC31731Dwc.findViewById(com.facebook.R.id.button_positive);
        this.A0B = (TextView) dialogC31731Dwc.findViewById(com.facebook.R.id.button_negative);
        this.A0E = dialogC31731Dwc.findViewById(com.facebook.R.id.button_divider);
        this.A09 = (TextView) dialogC31731Dwc.findViewById(com.facebook.R.id.button_blue);
        this.A07 = (ViewGroup) dialogC31731Dwc.findViewById(com.facebook.R.id.customViewHolder);
    }

    public C35166FfG(Context context) {
        this(context, com.facebook.R.layout.alert_dialog, C2U8.A03 ? com.facebook.R.style.IgDialog : com.facebook.R.style.IgDialogDeprecated);
        ListView listView = this.A0F;
        listView.getClass();
        listView.setVisibility(8);
        this.A0F.setBackground(null);
        this.A0F.setLayoutDirection(3);
    }
}
