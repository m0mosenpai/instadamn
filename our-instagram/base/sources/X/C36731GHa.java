package X;

import android.view.View;
import android.widget.CompoundButton;

/* renamed from: X.GHa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36731GHa implements InterfaceC37113GWy {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public View.OnClickListener A06;
    public View.OnLongClickListener A07;
    public CompoundButton.OnCheckedChangeListener A08;
    public InterfaceC190658cN A09;
    public CharSequence A0A;
    public CharSequence A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;

    public static C36731GHa A02(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, int i, boolean z) {
        return new C36731GHa(onCheckedChangeListener, i, z);
    }

    public static C36731GHa A03(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, Object obj, int i, int i2, boolean z) {
        return new C36731GHa(onCheckedChangeListener, new G9H(obj, i), i2, z);
    }

    public C36731GHa(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, int i, boolean z) {
        this.A04 = i;
        this.A0D = z;
        this.A08 = onCheckedChangeListener;
    }

    public C36731GHa(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, InterfaceC190658cN interfaceC190658cN, int i, boolean z) {
        this.A04 = i;
        this.A0D = z;
        this.A08 = onCheckedChangeListener;
        this.A09 = interfaceC190658cN;
    }

    public C36731GHa(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        this.A0B = charSequence;
        this.A0A = charSequence2;
        this.A0D = z;
        this.A08 = onCheckedChangeListener;
    }

    public C36731GHa(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, CharSequence charSequence, boolean z) {
        this.A0B = charSequence;
        this.A0D = z;
        this.A08 = onCheckedChangeListener;
    }
}
