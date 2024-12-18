package X;

import android.content.Context;
import android.view.View;
import java.util.AbstractCollection;

/* loaded from: classes6.dex */
public class GHY implements InterfaceC37112GWx, InterfaceC37113GWy {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public View.OnClickListener A05;
    public View.OnLongClickListener A06;
    public CharSequence A07;
    public CharSequence A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public Context A0C;
    public final int A0D;

    public static GHY A00(Context context, View.OnClickListener onClickListener, int i) {
        return new GHY(context, onClickListener, i);
    }

    public static void A01(Context context, View.OnClickListener onClickListener, CharSequence charSequence, AbstractCollection abstractCollection) {
        abstractCollection.add(new GHY(context, onClickListener, charSequence));
    }

    public GHY(Context context, View.OnClickListener onClickListener, CharSequence charSequence) {
        this.A0A = true;
        this.A0C = context;
        this.A08 = charSequence;
        this.A05 = onClickListener;
        this.A0D = AbstractC53242c7.A07(context);
        this.A00 = AbstractC53242c7.A09(context);
    }

    public GHY(Context context, View.OnClickListener onClickListener, int i, int i2) {
        this.A0A = true;
        this.A0C = context;
        this.A04 = i;
        this.A05 = onClickListener;
        this.A0D = i2;
        this.A00 = AbstractC53242c7.A09(context);
    }

    public GHY(Context context, View.OnClickListener onClickListener, int i) {
        this(context, onClickListener, i, AbstractC53242c7.A07(context));
    }

    public GHY(Context context, CharSequence charSequence, int i) {
        this.A0A = true;
        this.A0C = context;
        this.A08 = charSequence;
        this.A0D = i;
    }
}
