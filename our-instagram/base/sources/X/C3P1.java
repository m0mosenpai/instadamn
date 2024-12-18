package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.3P1, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3P1 {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public abstract View A00();

    public abstract View A01();

    public abstract TextView A03();

    public abstract TextView A04();

    public abstract TextView A05();

    public abstract InterfaceC56392iX A07();

    public boolean A08() {
        return true;
    }

    public TextView A02() {
        return null;
    }

    public InterfaceC56392iX A06() {
        return null;
    }

    public C3P1(Context context, Resources resources) {
        String string = resources.getString(2131968128);
        C14360o3.A07(string);
        this.A03 = string;
        String string2 = resources.getString(2131968132);
        C14360o3.A07(string2);
        this.A06 = string2;
        String string3 = resources.getString(2131968130);
        C14360o3.A07(string3);
        this.A04 = string3;
        String string4 = resources.getString(2131968127);
        C14360o3.A07(string4);
        this.A02 = string4;
        String string5 = resources.getString(2131968131);
        C14360o3.A07(string5);
        this.A05 = string5;
        String string6 = resources.getString(2131972617);
        C14360o3.A07(string6);
        this.A07 = string6;
        String string7 = resources.getString(2131972618);
        C14360o3.A07(string7);
        this.A08 = string7;
        String string8 = resources.getString(2131971063);
        C14360o3.A07(string8);
        this.A09 = string8;
        this.A00 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_text));
        this.A01 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_text));
    }
}
