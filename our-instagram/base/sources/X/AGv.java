package X;

import android.content.Context;
import android.text.Editable;
import android.text.Layout;
import com.facebook.R;
import com.instagram.ui.text.TextColorScheme;
import com.instagram.ui.text.TextColors;
import com.instagram.ui.text.TextShadow;
import java.util.List;

/* loaded from: classes4.dex */
public final class AGv {
    public float A00;
    public int A01;
    public int A02;
    public Editable A04;
    public Layout.Alignment A05;
    public C88Z A06;
    public C190888ck A07;
    public C202278x7 A08;
    public String A09;
    public List A0A;
    public boolean A0D;
    public boolean A0E = true;
    public int A03 = -1;
    public boolean A0F = true;
    public boolean A0C = true;
    public boolean A0B = false;

    public static C8LG A00(Context context) {
        C8LG c8lg = new C8LG();
        c8lg.A02 = context.getColor(R.color.design_dark_default_color_on_background);
        return c8lg;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.81M, java.lang.Object] */
    public final C81M A01() {
        Editable editable = this.A04;
        Layout.Alignment alignment = this.A05;
        float f = this.A00;
        C202278x7 c202278x7 = this.A08;
        C190888ck c190888ck = this.A07;
        List list = this.A0A;
        boolean z = this.A0E;
        int i = this.A01;
        int i2 = this.A03;
        int i3 = this.A02;
        C88Z c88z = this.A06;
        String str = this.A09;
        boolean z2 = this.A0D;
        boolean z3 = this.A0F;
        boolean z4 = this.A0C;
        boolean z5 = this.A0B;
        ?? obj = new Object();
        obj.A04 = editable;
        obj.A05 = alignment;
        obj.A00 = f;
        obj.A08 = c202278x7;
        obj.A07 = c190888ck;
        obj.A0A = list;
        obj.A0E = z;
        obj.A01 = i;
        obj.A03 = i2;
        obj.A02 = i3;
        obj.A06 = c88z;
        obj.A09 = str;
        obj.A0D = z2;
        obj.A0F = z3;
        obj.A0C = z4;
        obj.A0B = z5;
        return obj;
    }

    public AGv(Context context) {
        C8LG A00 = A00(context);
        C8LG.A01(context, A00, R.color.activator_card_progress_bad, context.getColor(R.color.purple_4));
        TextColorScheme A002 = C8LG.A00(context, A00, R.color.clips_gradient_redesign_color_4);
        C8LG A003 = A00(context);
        C8LG.A01(context, A003, R.color.blue_4, context.getColor(R.color.purple_4));
        TextColorScheme A004 = C8LG.A00(context, A003, R.color.netego_su_background_gradient_end_4);
        C8LG A005 = A00(context);
        C8LG.A01(context, A005, R.color.igds_gradient_cyan, context.getColor(R.color.igds_active_badge));
        TextColorScheme A006 = C8LG.A00(context, A005, R.color.clips_gradient_redesign_color_2);
        C8LG A007 = A00(context);
        C8LG.A01(context, A007, AbstractC53242c7.A0H(context, R.attr.igds_color_gradient_yellow), AbstractC167007dF.A09(context, R.attr.igds_color_gradient_red));
        TextColorScheme A008 = C8LG.A00(context, A007, R.color.badge_color);
        C8LG A009 = A00(context);
        C8LG.A01(context, A009, R.color.red_4, context.getColor(R.color.purple_4));
        TextColorScheme A0010 = C8LG.A00(context, A009, R.color.netego_su_background_gradient_end_4);
        C8LG A0011 = A00(context);
        A0011.A02(C50R.A00);
        TextColorScheme A0012 = C8LG.A00(context, A0011, R.color.clips_gradient_redesign_color_2);
        C8LG A0013 = A00(context);
        C8LG.A01(context, A0013, R.color.grey_9, context.getColor(R.color.grey_9));
        TextColorScheme A0014 = C8LG.A00(context, A0013, R.color.red_5);
        C8LG c8lg = new C8LG();
        c8lg.A02 = context.getColor(R.color.grey_9);
        c8lg.A04 = new TextColors(TextShadow.A03, context.getColor(R.color.grey_9_50_transparent));
        C8LG.A01(context, c8lg, R.color.baseline_neutral_80, context.getColor(R.color.baseline_neutral_80));
        this.A0A = AbstractC92144Au.A01(A002, A004, A006, A008, A0010, A0012, A0014, C8LG.A00(context, c8lg, R.color.red_5));
    }
}
