package X;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.MovementMethod;
import android.view.View;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.6i8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146106i8 {
    public int A00;
    public int A01;
    public int A02;
    public Drawable A03;
    public Drawable A04;
    public MovementMethod A05;
    public View A06;
    public ImageUrl A07;
    public ImageUrl A08;
    public ImageUrl A09;
    public InterfaceC58152PqH A0A;
    public CharSequence A0D;
    public Integer A0E;
    public String A0G;
    public String A0H;
    public String A0I;
    public boolean A0J;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public EnumC141996bI A0C = EnumC141996bI.A04;
    public Integer A0F = C05F.A00;
    public EnumC142006bJ A0B = EnumC142006bJ.A05;
    public boolean A0K = true;

    public final void A01() {
        this.A0L = true;
    }

    public final void A08(Drawable drawable, int i) {
        C14360o3.A0B(drawable, 0);
        this.A04 = drawable;
        drawable.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
    }

    public final void A09(View view) {
        C14360o3.A0B(view, 0);
        this.A0O = true;
        this.A06 = view;
    }

    public final void A0A(InterfaceC58152PqH interfaceC58152PqH) {
        C14360o3.A0B(interfaceC58152PqH, 0);
        this.A0A = interfaceC58152PqH;
    }

    public final void A0B(EnumC142006bJ enumC142006bJ) {
        C14360o3.A0B(enumC142006bJ, 0);
        this.A0B = enumC142006bJ;
    }

    public final void A0C(EnumC141996bI enumC141996bI) {
        C14360o3.A0B(enumC141996bI, 0);
        this.A0C = enumC141996bI;
    }

    public final void A0D(String str) {
        C14360o3.A0B(str, 0);
        this.A0G = str;
    }

    public final C31349DqE A00() {
        CharSequence charSequence = this.A0D;
        if (charSequence != null) {
            if (this.A0L && this.A0A == null) {
                throw new IllegalStateException("Required value was null.");
            }
            EnumC141996bI enumC141996bI = this.A0C;
            EnumC141996bI enumC141996bI2 = EnumC141996bI.A05;
            if ((enumC141996bI == enumC141996bI2 || enumC141996bI == EnumC141996bI.A06) && this.A0B != EnumC142006bJ.A05) {
                throw new IllegalStateException("Check failed.");
            }
            if (enumC141996bI == enumC141996bI2) {
                C0w9.A03("igds_snackbar_error_style_missing_category", String.valueOf(charSequence));
            }
            if (this.A0B != EnumC142006bJ.A05 && this.A09 == null && this.A04 == null && this.A0E == null) {
                throw new IllegalStateException("Check failed.");
            }
            return new C31349DqE(this);
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A02() {
        A0B(EnumC142006bJ.A04);
    }

    public final void A03() {
        A0B(EnumC142006bJ.A06);
    }

    public final void A04() {
        A0C(EnumC141996bI.A04);
    }

    public final void A05() {
        A0C(EnumC141996bI.A05);
    }

    public final void A06() {
        this.A01 = AbstractC31372Dqc.A00();
    }

    public final void A07(int i) {
        this.A0E = Integer.valueOf(i);
    }
}
